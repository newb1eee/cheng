package com.ruoyi.web.controller.workers;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.workers.domain.WorkersBasic;
import com.ruoyi.workers.service.IWorkersBasicService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 工人基本信息Controller
 * 
 * @author chengxl
 * @date 2023-09-07
 */
@RestController
@RequestMapping("/workers/basic")
public class WorkersBasicController extends BaseController
{
    @Autowired
    private IWorkersBasicService workersBasicService;

    /**
     * 查询工人基本信息列表
     */
    @PreAuthorize("@ss.hasPermi('workers:basic:list')")
    @GetMapping("/list")
    public TableDataInfo list(WorkersBasic workersBasic)
    {
        startPage();
        List<WorkersBasic> list = workersBasicService.selectWorkersBasicList(workersBasic);
        return getDataTable(list);
    }

    /**
     * 导出工人基本信息列表
     */
    @PreAuthorize("@ss.hasPermi('workers:basic:export')")
    @Log(title = "工人基本信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, WorkersBasic workersBasic)
    {
        List<WorkersBasic> list = workersBasicService.selectWorkersBasicList(workersBasic);
        ExcelUtil<WorkersBasic> util = new ExcelUtil<WorkersBasic>(WorkersBasic.class);
        util.exportExcel(response, list, "工人基本信息数据");
    }

    /**
     * 获取工人基本信息详细信息
     */
    @PreAuthorize("@ss.hasPermi('workers:basic:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(workersBasicService.selectWorkersBasicById(id));
    }

    /**
     * 新增工人基本信息
     */
    @PreAuthorize("@ss.hasPermi('workers:basic:add')")
    @Log(title = "工人基本信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody WorkersBasic workersBasic)
    {
        return toAjax(workersBasicService.insertWorkersBasic(workersBasic));
    }

    /**
     * 修改工人基本信息
     */
    @PreAuthorize("@ss.hasPermi('workers:basic:edit')")
    @Log(title = "工人基本信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody WorkersBasic workersBasic)
    {
        return toAjax(workersBasicService.updateWorkersBasic(workersBasic));
    }

    /**
     * 删除工人基本信息
     */
    @PreAuthorize("@ss.hasPermi('workers:basic:remove')")
    @Log(title = "工人基本信息", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(workersBasicService.deleteWorkersBasicByIds(ids));
    }
}
