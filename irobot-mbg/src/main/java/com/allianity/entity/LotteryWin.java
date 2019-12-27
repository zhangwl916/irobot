package com.allianity.entity;

import java.io.Serializable;
import java.util.Date;

public class LotteryWin implements Serializable {
    private String id;

    private String custName;

    private String phone;

    private String address;

    private String prizeName;

    private String lotteryNumber;

    private String salesman;

    private String salesmanPhone;

    private String salesmanAgency;

    private Date createTime;

    private String username;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPrizeName() {
        return prizeName;
    }

    public void setPrizeName(String prizeName) {
        this.prizeName = prizeName;
    }

    public String getLotteryNumber() {
        return lotteryNumber;
    }

    public void setLotteryNumber(String lotteryNumber) {
        this.lotteryNumber = lotteryNumber;
    }

    public String getSalesman() {
        return salesman;
    }

    public void setSalesman(String salesman) {
        this.salesman = salesman;
    }

    public String getSalesmanPhone() {
        return salesmanPhone;
    }

    public void setSalesmanPhone(String salesmanPhone) {
        this.salesmanPhone = salesmanPhone;
    }

    public String getSalesmanAgency() {
        return salesmanAgency;
    }

    public void setSalesmanAgency(String salesmanAgency) {
        this.salesmanAgency = salesmanAgency;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", custName=").append(custName);
        sb.append(", phone=").append(phone);
        sb.append(", address=").append(address);
        sb.append(", prizeName=").append(prizeName);
        sb.append(", lotteryNumber=").append(lotteryNumber);
        sb.append(", salesman=").append(salesman);
        sb.append(", salesmanPhone=").append(salesmanPhone);
        sb.append(", salesmanAgency=").append(salesmanAgency);
        sb.append(", createTime=").append(createTime);
        sb.append(", username=").append(username);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}