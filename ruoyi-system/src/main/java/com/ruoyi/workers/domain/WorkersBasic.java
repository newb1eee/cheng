package com.ruoyi.workers.domain;

import java.util.List;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 工人基本信息对象 workers_basic
 * 
 * @author chengxl
 * @date 2023-09-07
 */
public class WorkersBasic extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 姓名 */
    @Excel(name = "姓名")
    private String name;

    /** 用户性别（0男 1女 2未知） */
    @Excel(name = "用户性别", readConverterExp = "0=男,1=女,2=未知")
    private String sex;

    /** 年纪 */
    @Excel(name = "年纪")
    private Long age;

    /** 头像地址 */
    @Excel(name = "头像地址")
    private String avatar;

    /** 住址 */
    @Excel(name = "住址")
    private String address;

    /** 类别0小 1大 9其他 */
    @Excel(name = "类别0小 1大 9其他")
    private Long workerType;

    /** 所属管理人 */
    @Excel(name = "所属管理人")
    private String leader;

    /** 工地 */
    @Excel(name = "工地")
    private String position;

    /** 身份证地址 */
    @Excel(name = "身份证地址")
    private String idCardUrl;

    /** 开户行 */
    @Excel(name = "开户行")
    private String bank;

    /** 银行卡号 */
    @Excel(name = "银行卡号")
    private String bankCard;

    /** 银行卡地址 */
    @Excel(name = "银行卡地址")
    private String bankCardUrl;

    /** 状态0正常 4删除 */
    @Excel(name = "状态0正常 4删除")
    private String status;

    /** 工人工时按月划分信息 */
    private List<WorkersMonth> workersMonthList;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setSex(String sex) 
    {
        this.sex = sex;
    }

    public String getSex() 
    {
        return sex;
    }
    public void setAge(Long age) 
    {
        this.age = age;
    }

    public Long getAge() 
    {
        return age;
    }
    public void setAvatar(String avatar) 
    {
        this.avatar = avatar;
    }

    public String getAvatar() 
    {
        return avatar;
    }
    public void setAddress(String address) 
    {
        this.address = address;
    }

    public String getAddress() 
    {
        return address;
    }
    public void setWorkerType(Long workerType) 
    {
        this.workerType = workerType;
    }

    public Long getWorkerType() 
    {
        return workerType;
    }
    public void setLeader(String leader) 
    {
        this.leader = leader;
    }

    public String getLeader() 
    {
        return leader;
    }
    public void setPosition(String position) 
    {
        this.position = position;
    }

    public String getPosition() 
    {
        return position;
    }
    public void setIdCardUrl(String idCardUrl) 
    {
        this.idCardUrl = idCardUrl;
    }

    public String getIdCardUrl() 
    {
        return idCardUrl;
    }
    public void setBank(String bank) 
    {
        this.bank = bank;
    }

    public String getBank() 
    {
        return bank;
    }
    public void setBankCard(String bankCard) 
    {
        this.bankCard = bankCard;
    }

    public String getBankCard() 
    {
        return bankCard;
    }
    public void setBankCardUrl(String bankCardUrl) 
    {
        this.bankCardUrl = bankCardUrl;
    }

    public String getBankCardUrl() 
    {
        return bankCardUrl;
    }
    public void setStatus(String status) 
    {
        this.status = status;
    }

    public String getStatus() 
    {
        return status;
    }

    public List<WorkersMonth> getWorkersMonthList()
    {
        return workersMonthList;
    }

    public void setWorkersMonthList(List<WorkersMonth> workersMonthList)
    {
        this.workersMonthList = workersMonthList;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("name", getName())
            .append("sex", getSex())
            .append("age", getAge())
            .append("avatar", getAvatar())
            .append("address", getAddress())
            .append("workerType", getWorkerType())
            .append("leader", getLeader())
            .append("position", getPosition())
            .append("idCardUrl", getIdCardUrl())
            .append("bank", getBank())
            .append("bankCard", getBankCard())
            .append("bankCardUrl", getBankCardUrl())
            .append("status", getStatus())
            .append("remark", getRemark())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("workersMonthList", getWorkersMonthList())
            .toString();
    }
}
