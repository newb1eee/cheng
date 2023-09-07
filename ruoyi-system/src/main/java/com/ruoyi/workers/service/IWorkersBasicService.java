package com.ruoyi.workers.service;

import java.util.List;
import com.ruoyi.workers.domain.WorkersBasic;

/**
 * 工人基本信息Service接口
 * 
 * @author chengxl
 * @date 2023-09-07
 */
public interface IWorkersBasicService 
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
     * 批量删除工人基本信息
     * 
     * @param ids 需要删除的工人基本信息主键集合
     * @return 结果
     */
    public int deleteWorkersBasicByIds(Long[] ids);

    /**
     * 删除工人基本信息信息
     * 
     * @param id 工人基本信息主键
     * @return 结果
     */
    public int deleteWorkersBasicById(Long id);
}
