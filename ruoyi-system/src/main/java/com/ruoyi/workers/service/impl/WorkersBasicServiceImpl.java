package com.ruoyi.workers.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import com.ruoyi.common.utils.StringUtils;
import org.springframework.transaction.annotation.Transactional;
import com.ruoyi.workers.domain.WorkersMonth;
import com.ruoyi.workers.mapper.WorkersBasicMapper;
import com.ruoyi.workers.domain.WorkersBasic;
import com.ruoyi.workers.service.IWorkersBasicService;

/**
 * 工人基本信息Service业务层处理
 * 
 * @author chengxl
 * @date 2023-09-07
 */
@Service
public class WorkersBasicServiceImpl implements IWorkersBasicService 
{
    @Autowired
    private WorkersBasicMapper workersBasicMapper;

    /**
     * 查询工人基本信息
     * 
     * @param id 工人基本信息主键
     * @return 工人基本信息
     */
    @Override
    public WorkersBasic selectWorkersBasicById(Long id)
    {
        return workersBasicMapper.selectWorkersBasicById(id);
    }

    /**
     * 查询工人基本信息列表
     * 
     * @param workersBasic 工人基本信息
     * @return 工人基本信息
     */
    @Override
    public List<WorkersBasic> selectWorkersBasicList(WorkersBasic workersBasic)
    {
        return workersBasicMapper.selectWorkersBasicList(workersBasic);
    }

    /**
     * 新增工人基本信息
     * 
     * @param workersBasic 工人基本信息
     * @return 结果
     */
    @Transactional
    @Override
    public int insertWorkersBasic(WorkersBasic workersBasic)
    {
        workersBasic.setCreateTime(DateUtils.getNowDate());
        int rows = workersBasicMapper.insertWorkersBasic(workersBasic);
        insertWorkersMonth(workersBasic);
        return rows;
    }

    /**
     * 修改工人基本信息
     * 
     * @param workersBasic 工人基本信息
     * @return 结果
     */
    @Transactional
    @Override
    public int updateWorkersBasic(WorkersBasic workersBasic)
    {
        workersBasic.setUpdateTime(DateUtils.getNowDate());
        workersBasicMapper.deleteWorkersMonthByWorkerId(workersBasic.getId());
        insertWorkersMonth(workersBasic);
        return workersBasicMapper.updateWorkersBasic(workersBasic);
    }

    /**
     * 批量删除工人基本信息
     * 
     * @param ids 需要删除的工人基本信息主键
     * @return 结果
     */
    @Transactional
    @Override
    public int deleteWorkersBasicByIds(Long[] ids)
    {
        workersBasicMapper.deleteWorkersMonthByWorkerIds(ids);
        return workersBasicMapper.deleteWorkersBasicByIds(ids);
    }

    /**
     * 删除工人基本信息信息
     * 
     * @param id 工人基本信息主键
     * @return 结果
     */
    @Transactional
    @Override
    public int deleteWorkersBasicById(Long id)
    {
        workersBasicMapper.deleteWorkersMonthByWorkerId(id);
        return workersBasicMapper.deleteWorkersBasicById(id);
    }

    /**
     * 新增工人工时按月划分信息
     * 
     * @param workersBasic 工人基本信息对象
     */
    public void insertWorkersMonth(WorkersBasic workersBasic)
    {
        List<WorkersMonth> workersMonthList = workersBasic.getWorkersMonthList();
        Long id = workersBasic.getId();
        if (StringUtils.isNotNull(workersMonthList))
        {
            List<WorkersMonth> list = new ArrayList<WorkersMonth>();
            for (WorkersMonth workersMonth : workersMonthList)
            {
                workersMonth.setWorkerId(id);
                list.add(workersMonth);
            }
            if (list.size() > 0)
            {
                workersBasicMapper.batchWorkersMonth(list);
            }
        }
    }
}
