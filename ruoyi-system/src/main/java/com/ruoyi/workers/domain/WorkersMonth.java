package com.ruoyi.workers.domain;

import java.math.BigDecimal;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 工人工时按月划分对象 workers_month
 * 
 * @author chengxl
 * @date 2023-09-07
 */
public class WorkersMonth extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long workerId;

    /** 月份 */
    @Excel(name = "月份")
    private Long month;

    /** 工时 */
    @Excel(name = "工时")
    private BigDecimal hours;

    /** 当月人工 */
    @Excel(name = "当月人工")
    private BigDecimal price;

    /** 预支 */
    @Excel(name = "预支")
    private BigDecimal advance;

    /** 余额 */
    @Excel(name = "余额")
    private BigDecimal rest;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String status;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setWorkerId(Long workerId) 
    {
        this.workerId = workerId;
    }

    public Long getWorkerId() 
    {
        return workerId;
    }
    public void setMonth(Long month) 
    {
        this.month = month;
    }

    public Long getMonth() 
    {
        return month;
    }
    public void setHours(BigDecimal hours) 
    {
        this.hours = hours;
    }

    public BigDecimal getHours() 
    {
        return hours;
    }
    public void setPrice(BigDecimal price) 
    {
        this.price = price;
    }

    public BigDecimal getPrice() 
    {
        return price;
    }
    public void setAdvance(BigDecimal advance) 
    {
        this.advance = advance;
    }

    public BigDecimal getAdvance() 
    {
        return advance;
    }
    public void setRest(BigDecimal rest) 
    {
        this.rest = rest;
    }

    public BigDecimal getRest() 
    {
        return rest;
    }
    public void setStatus(String status) 
    {
        this.status = status;
    }

    public String getStatus() 
    {
        return status;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("workerId", getWorkerId())
            .append("month", getMonth())
            .append("hours", getHours())
            .append("price", getPrice())
            .append("advance", getAdvance())
            .append("rest", getRest())
            .append("status", getStatus())
            .append("remark", getRemark())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
