package com.ruoyi.workers.mapper;

import java.util.List;
import com.ruoyi.workers.domain.WorkersBasic;
import com.ruoyi.workers.domain.WorkersMonth;

/**
 * 工人基本信息Mapper接口
 * 
 * @author chengxl
 * @date 2023-09-07
 */
public interface WorkersBasicMapper 
{
    /**
     * 查询工人基本信息
     * 
     * @param id 工人基本信息主键
     * @return 工人基本信息
     */
    public WorkersBasic selectWorkersBasicById(Long id);

    /**
     * 查询工人基本信息列表
     * 
     * @param workersBasic 工人基本信息
     * @return 工人基本信息集合
     */
    public List<WorkersBasic> selectWorkersBasicList(WorkersBasic workersBasic);

    /**
     * 新增工人基本信息
     * 
     * @param workersBasic 工人基本信息
     * @return 结果
     */
    public int insertWorkersBasic(WorkersBasic workersBasic);

    /**
     * 修改工人基本信息
     * 
     * @param workersBasic 工人基本信息
     * @return 结果
     */
    public int updateWorkersBasic(WorkersBasic workersBasic);

    /**
     * 删除工人基本信息
     * 
     * @param id 工人基本信息主键
     * @return 结果
     */
    public int deleteWorkersBasicById(Long id);

    /**
     * 批量删除工人基本信息
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteWorkersBasicByIds(Long[] ids);

    /**
     * 批量删除工人工时按月划分
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteWorkersMonthByWorkerIds(Long[] ids);
    
    /**
     * 批量新增工人工时按月划分
     * 
     * @param workersMonthList 工人工时按月划分列表
     * @return 结果
     */
    public int batchWorkersMonth(List<WorkersMonth> workersMonthList);
    

    /**
     * 通过工人基本信息主键删除工人工时按月划分信息
     * 
     * @param id 工人基本信息ID
     * @return 结果
     */
    public int deleteWorkersMonthByWorkerId(Long id);
}
