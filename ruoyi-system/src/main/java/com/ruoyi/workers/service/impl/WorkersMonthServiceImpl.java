package com.ruoyi.workers.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.workers.vo.WorkersMonthVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.workers.mapper.WorkersMonthMapper;
import com.ruoyi.workers.domain.WorkersMonth;
import com.ruoyi.workers.service.IWorkersMonthService;

/**
 * 工人工时按月划分Service业务层处理
 * 
 * @author chengxl
 * @date 2023-09-07
 */
@Service
public class WorkersMonthServiceImpl implements IWorkersMonthService 
{
    @Autowired
    private WorkersMonthMapper workersMonthMapper;

    /**
     * 查询工人工时按月划分
     * 
     * @param id 工人工时按月划分主键
     * @return 工人工时按月划分
     */
    @Override
    public WorkersMonth selectWorkersMonthById(Long id)
    {
        return workersMonthMapper.selectWorkersMonthById(id);
    }

    /**
     * 查询工人工时按月划分列表
     * 
     * @param workersMonth 工人工时按月划分
     * @return 工人工时按月划分
     */
    @Override
    public List<WorkersMonthVO> selectWorkersMonthList(WorkersMonth workersMonth)
    {
        return  workersMonthMapper.getTotalByYearAndMonth(workersMonth);
    }

    /**
     * 新增工人工时按月划分
     * 
     * @param workersMonth 工人工时按月划分
     * @return 结果
     */
    @Override
    public int insertWorkersMonth(WorkersMonth workersMonth)
    {
        workersMonth.setCreateTime(DateUtils.getNowDate());
        return workersMonthMapper.insertWorkersMonth(workersMonth);
    }

    /**
     * 修改工人工时按月划分
     * 
     * @param workersMonth 工人工时按月划分
     * @return 结果
     */
    @Override
    public int updateWorkersMonth(WorkersMonth workersMonth)
    {
        workersMonth.setUpdateTime(DateUtils.getNowDate());
        return workersMonthMapper.updateWorkersMonth(workersMonth);
    }

    /**
     * 批量删除工人工时按月划分
     * 
     * @param ids 需要删除的工人工时按月划分主键
     * @return 结果
     */
    @Override
    public int deleteWorkersMonthByIds(Long[] ids)
    {
        return workersMonthMapper.deleteWorkersMonthByIds(ids);
    }

    /**
     * 删除工人工时按月划分信息
     * 
     * @param id 工人工时按月划分主键
     * @return 结果
     */
    @Override
    public int deleteWorkersMonthById(Long id)
    {
        return workersMonthMapper.deleteWorkersMonthById(id);
    }
}
