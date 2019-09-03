package com.irobotop.equipment.bean;

import java.io.Serializable;
import java.util.Date;

public class MapPoiDetailsDO implements Serializable {
    private Integer id;

    /**
     * 任务ID
     **/
    private Integer taskId;

    /**
     * 任务类型
     **/
    private String taskType;

    private String mapId;

    /**
     * 点位ID
     **/
    private Integer poiId;

    /**
     * 点位名称
     **/
    private String poiName;

    /**
     * 语音
     **/
    private String voice;

    /**
     * 表情
     **/
    private String emoji;

    /**
     * 表情类型
     **/
    private String emojiType;

    /**
     * 资源ID
     **/
    private String resourceId;

    /**
     * 资源名称
     **/
    private String resourceName;

    /**
     * 资源类型
     **/
    private String resourceType;

    /**
     * 延迟播放时间
     **/
    private String delayTime;

    /**
     * 任务优先级（任务执行的先后顺序）
     **/
    private Integer priority;

    /**
     * 取物点
     **/
    private Integer takePoiId;

    /**
     * 取物点名称
     **/
    private String takePoiName;

    /**
     * 送物点
     **/
    private Integer deliveryPoiId;

    /**
     * 送物点名称
     **/
    private String deliveryPoiName;

    /**
     * 创建时间
     **/
    private Date createTime;

    /**
     * 创建人姓名
     **/
    private String createUserName;

    /**
     * 更新时间
     **/
    private Date updateTime;

    /**
     * 更新人姓名
     **/
    private String updateUserName;

    /**
     * 状态
     **/
    private String status;

    /**
     * 是否位置导航
     **/
    private String isLocationNavigation;

    /**
     * 单一讲解任务
     **/
    private String signlestatus;

    /**
     * 备注
     **/
    private String remark;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTaskId() {
        return taskId;
    }

    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
    }

    public String getTaskType() {
        return taskType;
    }

    public void setTaskType(String taskType) {
        this.taskType = taskType;
    }

    public String getMapId() {
        return mapId;
    }

    public void setMapId(String mapId) {
        this.mapId = mapId;
    }

    public Integer getPoiId() {
        return poiId;
    }

    public void setPoiId(Integer poiId) {
        this.poiId = poiId;
    }

    public String getPoiName() {
        return poiName;
    }

    public void setPoiName(String poiName) {
        this.poiName = poiName;
    }

    public String getVoice() {
        return voice;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }

    public String getEmoji() {
        return emoji;
    }

    public void setEmoji(String emoji) {
        this.emoji = emoji;
    }

    public String getEmojiType() {
        return emojiType;
    }

    public void setEmojiType(String emojiType) {
        this.emojiType = emojiType;
    }

    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public String getDelayTime() {
        return delayTime;
    }

    public void setDelayTime(String delayTime) {
        this.delayTime = delayTime;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Integer getTakePoiId() {
        return takePoiId;
    }

    public void setTakePoiId(Integer takePoiId) {
        this.takePoiId = takePoiId;
    }

    public String getTakePoiName() {
        return takePoiName;
    }

    public void setTakePoiName(String takePoiName) {
        this.takePoiName = takePoiName;
    }

    public Integer getDeliveryPoiId() {
        return deliveryPoiId;
    }

    public void setDeliveryPoiId(Integer deliveryPoiId) {
        this.deliveryPoiId = deliveryPoiId;
    }

    public String getDeliveryPoiName() {
        return deliveryPoiName;
    }

    public void setDeliveryPoiName(String deliveryPoiName) {
        this.deliveryPoiName = deliveryPoiName;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreateUserName() {
        return createUserName;
    }

    public void setCreateUserName(String createUserName) {
        this.createUserName = createUserName;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdateUserName() {
        return updateUserName;
    }

    public void setUpdateUserName(String updateUserName) {
        this.updateUserName = updateUserName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getIsLocationNavigation() {
        return isLocationNavigation;
    }

    public void setIsLocationNavigation(String isLocationNavigation) {
        this.isLocationNavigation = isLocationNavigation;
    }

    public String getSignlestatus() {
        return signlestatus;
    }

    public void setSignlestatus(String signlestatus) {
        this.signlestatus = signlestatus;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", taskId=").append(taskId);
        sb.append(", taskType=").append(taskType);
        sb.append(", mapId=").append(mapId);
        sb.append(", poiId=").append(poiId);
        sb.append(", poiName=").append(poiName);
        sb.append(", voice=").append(voice);
        sb.append(", emoji=").append(emoji);
        sb.append(", emojiType=").append(emojiType);
        sb.append(", resourceId=").append(resourceId);
        sb.append(", resourceName=").append(resourceName);
        sb.append(", resourceType=").append(resourceType);
        sb.append(", delayTime=").append(delayTime);
        sb.append(", priority=").append(priority);
        sb.append(", takePoiId=").append(takePoiId);
        sb.append(", takePoiName=").append(takePoiName);
        sb.append(", deliveryPoiId=").append(deliveryPoiId);
        sb.append(", deliveryPoiName=").append(deliveryPoiName);
        sb.append(", createTime=").append(createTime);
        sb.append(", createUserName=").append(createUserName);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", updateUserName=").append(updateUserName);
        sb.append(", status=").append(status);
        sb.append(", isLocationNavigation=").append(isLocationNavigation);
        sb.append(", signlestatus=").append(signlestatus);
        sb.append(", remark=").append(remark);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}