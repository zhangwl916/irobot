package com.irobotop.account.bean;

import java.io.Serializable;
import java.util.Date;

public class AppVsersion implements Serializable {
    private Integer id;

    /**
     * 产品名称
     **/
    private String appname;

    /**
     * 平台
     **/
    private String platform;

    /**
     * 版本
     **/
    private String version;

    /**
     * 版本状态（0 无效，1有效）
     **/
    private String status;

    /**
     * 更新描述
     **/
    private String description;

    /**
     * 下载地址
     **/
    private String urlpath;

    /**
     * 创建时间
     **/
    private Date crateTime;

    /**
     * 更新时间
     **/
    private Date updateTime;

    /**
     * 创建者
     **/
    private String createUser;

    /**
     * 更新者
     **/
    private String updateUser;

    private String remark;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAppname() {
        return appname;
    }

    public void setAppname(String appname) {
        this.appname = appname;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrlpath() {
        return urlpath;
    }

    public void setUrlpath(String urlpath) {
        this.urlpath = urlpath;
    }

    public Date getCrateTime() {
        return crateTime;
    }

    public void setCrateTime(Date crateTime) {
        this.crateTime = crateTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
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
        sb.append(", appname=").append(appname);
        sb.append(", platform=").append(platform);
        sb.append(", version=").append(version);
        sb.append(", status=").append(status);
        sb.append(", description=").append(description);
        sb.append(", urlpath=").append(urlpath);
        sb.append(", crateTime=").append(crateTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", createUser=").append(createUser);
        sb.append(", updateUser=").append(updateUser);
        sb.append(", remark=").append(remark);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}