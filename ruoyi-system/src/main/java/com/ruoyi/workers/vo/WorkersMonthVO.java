package com.ruoyi.workers.vo;

import com.ruoyi.workers.domain.WorkersMonth;

import java.math.BigDecimal;

public class WorkersMonthVO extends WorkersMonth {
    private BigDecimal totalHours;

    private BigDecimal totalPrice;

    private BigDecimal totalAdvance;

    private  BigDecimal totalCost;

    private BigDecimal totalRest;

    public BigDecimal getTotalHours() {
        return totalHours;
    }

    public void setTotalHours(BigDecimal totalHours) {
        this.totalHours = totalHours;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public BigDecimal getTotalAdvance() {
        return totalAdvance;
    }

    public void setTotalAdvance(BigDecimal totalAdvance) {
        this.totalAdvance = totalAdvance;
    }

    public BigDecimal getTotalRest() {
        return totalRest;
    }

    public void setTotalRest(BigDecimal totalRest) {
        this.totalRest = totalRest;
    }

    public BigDecimal getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(BigDecimal totalCost) {
        this.totalCost = totalCost;
    }
}
