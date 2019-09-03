package com.irobotop.shop.bean;

import java.io.Serializable;
import java.util.Date;

public class ResourceDO implements Serializable {
    /**
     * 主键
     **/
    private Integer id;

    /**
     * 上传人
     **/
    private String genid;

    /**
     * 资源类型(0 是图片，1是音频，2是视频)
     **/
    private String type;

    /**
     * 资源用途
     **/
    private String userType;

    /**
     * 资源oss路径
     **/
    private String url;

    /**
     * OSS http路径
     **/
    private String ossurl;

    /**
     * 资源大小
     **/
    private String filesize;

    /**
     * 时长
     **/
    private String filetime;

    /**
     * 资源名称
     **/
    private String filename;

    /**
     * 所属店铺
     **/
    private String shopId;

    /**
     * 所属开发者
     **/
    private String developerId;

    /**
     * 资源上传者
     **/
    private String cuer;

    /**
     * 资源所有者（只有三种身份，管理员，开发者，一般员工）
     **/
    private String owner;

    /**
     * 创建时间
     **/
    private Date crateTime;

    /**
     * 更新时间
     **/
    private Date updateTime;

    /**
     * 状态
     **/
    private String status;

    /**
     * 删除标志
     **/
    private String delFlag;

    private String cuername;

    private String remark;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGenid() {
        return genid;
    }

    public void setGenid(String genid) {
        this.genid = genid;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getOssurl() {
        return ossurl;
    }

    public void setOssurl(String ossurl) {
        this.ossurl = ossurl;
    }

    public String getFilesize() {
        return filesize;
    }

    public void setFilesize(String filesize) {
        this.filesize = filesize;
    }

    public String getFiletime() {
        return filetime;
    }

    public void setFiletime(String filetime) {
        this.filetime = filetime;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    public String getDeveloperId() {
        return developerId;
    }

    public void setDeveloperId(String developerId) {
        this.developerId = developerId;
    }

    public String getCuer() {
        return cuer;
    }

    public void setCuer(String cuer) {
        this.cuer = cuer;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
    }

    public String getCuername() {
        return cuername;
    }

    public void setCuername(String cuername) {
        this.cuername = cuername;
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
        sb.append(", genid=").append(genid);
        sb.append(", type=").append(type);
        sb.append(", userType=").append(userType);
        sb.append(", url=").append(url);
        sb.append(", ossurl=").append(ossurl);
        sb.append(", filesize=").append(filesize);
        sb.append(", filetime=").append(filetime);
        sb.append(", filename=").append(filename);
        sb.append(", shopId=").append(shopId);
        sb.append(", developerId=").append(developerId);
        sb.append(", cuer=").append(cuer);
        sb.append(", owner=").append(owner);
        sb.append(", crateTime=").append(crateTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", status=").append(status);
        sb.append(", delFlag=").append(delFlag);
        sb.append(", cuername=").append(cuername);
        sb.append(", remark=").append(remark);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}