package com.ruoyi.workers.mapper;

import java.util.List;

import com.ruoyi.workers.vo.WorkersMonthVO;
import com.ruoyi.workers.domain.WorkersMonth;

/**
 * 工人工时按月划分Mapper接口
 * 
 * @author chengxl
 * @date 2023-09-07
 */
public interface WorkersMonthMapper 
{
    /**
     * 查询工人工时按月划分
     * 
     * @param id 工人工时按月划分主键
     * @return 工人工时按月划分
     */
    public WorkersMonth selectWorkersMonthById(Long id);

    /**
     * 查询工人工时按月划分列表
     * 
     * @param workersMonth 工人工时按月划分
     * @return 工人工时按月划分集合
     */
    public List<WorkersMonth> selectWorkersMonthList(WorkersMonth workersMonth);

    /**
     * 新增工人工时按月划分
     * 
     * @param workersMonth 工人工时按月划分
     * @return 结果
     */
    public int insertWorkersMonth(WorkersMonth workersMonth);

    /**
     * 修改工人工时按月划分
     * 
     * @param workersMonth 工人工时按月划分
     * @return 结果
     */
    public int updateWorkersMonth(WorkersMonth workersMonth);

    /**
     * 删除工人工时按月划分
     * 
     * @param id 工人工时按月划分主键
     * @return 结果
     */
    public int deleteWorkersMonthById(Long id);

    /**
     * 批量删除工人工时按月划分
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteWorkersMonthByIds(Long[] ids);


    public List<WorkersMonthVO> getTotalByYearAndMonth(WorkersMonth workersMonth);
}
