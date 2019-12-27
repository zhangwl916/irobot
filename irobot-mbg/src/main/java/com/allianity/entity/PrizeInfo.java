package com.allianity.entity;

import java.io.Serializable;

public class PrizeInfo implements Serializable {
    private String id;

    private String prizeName;

    private String type;

    private Short prizeValue;

    private Short quantity;

    private Object probability;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public Short getPrizeValue() {
        return prizeValue;
    }

    public void setPrizeValue(Short prizeValue) {
        this.prizeValue = prizeValue;
    }

    public Short getQuantity() {
        return quantity;
    }

    public void setQuantity(Short quantity) {
        this.quantity = quantity;
    }

    public Object getProbability() {
        return probability;
    }

    public void setProbability(Object probability) {
        this.probability = probability;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
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