package com.irobot.admin.bean;

import java.io.Serializable;
import java.math.BigDecimal;

public class Prize implements Serializable {
    private Integer prizeId;

    private String prizeName;

    private String type;

    private BigDecimal prizeValue;

    private Integer quantity;

    private BigDecimal probability;

    private static final long serialVersionUID = 1L;

    public Integer getPrizeId() {
        return prizeId;
    }

    public void setPrizeId(Integer prizeId) {
        this.prizeId = prizeId;
    }

    public String getPrizeName() {
        return prizeName;
    }

    public void setPrizeName(String prizeName) {
        this.prizeName = prizeName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public BigDecimal getPrizeValue() {
        return prizeValue;
    }

    public void setPrizeValue(BigDecimal prizeValue) {
        this.prizeValue = prizeValue;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getProbability() {
        return probability;
    }

    public void setProbability(BigDecimal probability) {
        this.probability = probability;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", prizeId=").append(prizeId);
        sb.append(", prizeName=").append(prizeName);
        sb.append(", type=").append(type);
        sb.append(", prizeValue=").append(prizeValue);
        sb.append(", quantity=").append(quantity);
        sb.append(", probability=").append(probability);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}