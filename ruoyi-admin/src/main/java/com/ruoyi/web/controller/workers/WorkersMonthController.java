package com.ruoyi.web.controller.workers;

import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.workers.vo.WorkersMonthVO;
import com.ruoyi.workers.domain.WorkersMonth;
import com.ruoyi.workers.service.IWorkersMonthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * 工人工时按月划分Controller
 *
 * @author chengxl
 * @date 2023-09-07
 */
@RestController
@RequestMapping("/workers/month")
public class WorkersMonthController extends BaseController {
    @Autowired
    private IWorkersMonthService workersMonthService;

    /**
     * 查询工人工时按月划分列表
     */
    @PreAuthorize("@ss.hasPermi('workers:month:list')")
    @GetMapping("/list")
    public TableDataInfo list(WorkersMonth workersMonth) {
        startPage();
        List<WorkersMonthVO> list = workersMonthService.selectWorkersMonthList(workersMonth);
        return getDataTable(list);
    }

    /**
     * 导出工人工时按月划分列表
     */
    @PreAuthorize("@ss.hasPermi('workers:month:export')")
    @Log(title = "工人工时按月划分", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, WorkersMonth workersMonth) {
        List<WorkersMonthVO> list = workersMonthService.selectWorkersMonthList(workersMonth);
        ExcelUtil<WorkersMonthVO> util = new ExcelUtil<WorkersMonthVO>(WorkersMonthVO.class);
        util.exportExcel(response, list, "工人工时按月划分数据");
    }

    /**
     * 获取工人工时按月划分详细信息
     */
    @PreAuthorize("@ss.hasPermi('workers:month:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id) {
        return success(workersMonthService.selectWorkersMonthById(id));
    }

    /**
     * 新增工人工时按月划分
     */
    @PreAuthorize("@ss.hasPermi('workers:month:add')")
    @Log(title = "工人工时按月划分", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody WorkersMonth workersMonth) {
        return toAjax(workersMonthService.insertWorkersMonth(workersMonth));
    }

    /**
     * 修改工人工时按月划分
     */
    @PreAuthorize("@ss.hasPermi('workers:month:edit')")
    @Log(title = "工人工时按月划分", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody WorkersMonth workersMonth) {
        return toAjax(workersMonthService.updateWorkersMonth(workersMonth));
    }

    /**
     * 删除工人工时按月划分
     */
    @PreAuthorize("@ss.hasPermi('workers:month:remove')")
    @Log(title = "工人工时按月划分", businessType = BusinessType.DELETE)
    @DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids) {
        return toAjax(workersMonthService.deleteWorkersMonthByIds(ids));
    }
}
