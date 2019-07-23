package com.irobot.mbg.model;

import java.io.Serializable;
import java.util.Date;

public class UserDO implements Serializable {
    private Long userId;

    /**
     * 用户名
     */
    private String username;

    private String name;

    /**
     * 密码
     */
    private String password;

    private String deptId;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 手机号
     */
    private String mobile;

    /**
     * 职务
     */
    private String job;

    /**
     * 状态 0:禁用，1:正常
     */
    private Byte status;

    /**
     * 创建用户id
     */
    private Long userIdCreate;

    /**
     * 创建时间
     */
    private Date gmtCreate;

    /**
     * 修改时间
     */
    private Date gmtModified;

    /**
     * 性别
     */
    private Long sex;

    /**
     * 出身日期
     */
    private Date birth;

    private Long picId;

    /**
     * 现居住地
     */
    private String liveAddress;

    /**
     * 爱好
     */
    private String hobby;

    /**
     * 省份
     */
    private String province;

    /**
     * 所在城市
     */
    private String city;

    /**
     * 所在地区
     */
    private String district;

    /**
     * 实体仓库代码
     */
    private String sysUser;

    /**
     * 个人认证时否通过
     */
    private String isperosnalauth;

    /**
     * 企业认证是否通过
     */
    private String isenterpriseauth;

    /**
     * 全局唯一ID
     */
    private String genid;

    /**
     * 证件类型
     */
    private String cardtype;

    /**
     * 证件号码
     */
    private String cardnumber;

    /**
     * 公司ID
     */
    private String companyId;

    /**
     * 公司名称
     */
    private String companyName;

    /**
     * 创建时间
     */
    private Date crateTime;

    /**
     * 创建人
     */
    private String cuser;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 更新人
     */
    private String uuser;

    private String path;

    /**
     * 超级用户角色 admin ，开发者管理员 developer，子开发者管理员 subdeveloper，店铺管理员 shop，子店铺管理员  subshop
     */
    private String position;

    /**
     * 店铺id
     */
    private String shopid;

    private String developerid;

    private static final long serialVersionUID = 1L;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Long getUserIdCreate() {
        return userIdCreate;
    }

    public void setUserIdCreate(Long userIdCreate) {
        this.userIdCreate = userIdCreate;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    public Long getSex() {
        return sex;
    }

    public void setSex(Long sex) {
        this.sex = sex;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public Long getPicId() {
        return picId;
    }

    public void setPicId(Long picId) {
        this.picId = picId;
    }

    public String getLiveAddress() {
        return liveAddress;
    }

    public void setLiveAddress(String liveAddress) {
        this.liveAddress = liveAddress;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getSysUser() {
        return sysUser;
    }

    public void setSysUser(String sysUser) {
        this.sysUser = sysUser;
    }

    public String getIsperosnalauth() {
        return isperosnalauth;
    }

    public void setIsperosnalauth(String isperosnalauth) {
        this.isperosnalauth = isperosnalauth;
    }

    public String getIsenterpriseauth() {
        return isenterpriseauth;
    }

    public void setIsenterpriseauth(String isenterpriseauth) {
        this.isenterpriseauth = isenterpriseauth;
    }

    public String getGenid() {
        return genid;
    }

    public void setGenid(String genid) {
        this.genid = genid;
    }

    public String getCardtype() {
        return cardtype;
    }

    public void setCardtype(String cardtype) {
        this.cardtype = cardtype;
    }

    public String getCardnumber() {
        return cardnumber;
    }

    public void setCardnumber(String cardnumber) {
        this.cardnumber = cardnumber;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Date getCrateTime() {
        return crateTime;
    }

    public void setCrateTime(Date crateTime) {
        this.crateTime = crateTime;
    }

    public String getCuser() {
        return cuser;
    }

    public void setCuser(String cuser) {
        this.cuser = cuser;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getUuser() {
        return uuser;
    }

    public void setUuser(String uuser) {
        this.uuser = uuser;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getShopid() {
        return shopid;
    }

    public void setShopid(String shopid) {
        this.shopid = shopid;
    }

    public String getDeveloperid() {
        return developerid;
    }

    public void setDeveloperid(String developerid) {
        this.developerid = developerid;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userId=").append(userId);
        sb.append(", username=").append(username);
        sb.append(", name=").append(name);
        sb.append(", password=").append(password);
        sb.append(", deptId=").append(deptId);
        sb.append(", email=").append(email);
        sb.append(", mobile=").append(mobile);
        sb.append(", job=").append(job);
        sb.append(", status=").append(status);
        sb.append(", userIdCreate=").append(userIdCreate);
        sb.append(", gmtCreate=").append(gmtCreate);
        sb.append(", gmtModified=").append(gmtModified);
        sb.append(", sex=").append(sex);
        sb.append(", birth=").append(birth);
        sb.append(", picId=").append(picId);
        sb.append(", liveAddress=").append(liveAddress);
        sb.append(", hobby=").append(hobby);
        sb.append(", province=").append(province);
        sb.append(", city=").append(city);
        sb.append(", district=").append(district);
        sb.append(", sysUser=").append(sysUser);
        sb.append(", isperosnalauth=").append(isperosnalauth);
        sb.append(", isenterpriseauth=").append(isenterpriseauth);
        sb.append(", genid=").append(genid);
        sb.append(", cardtype=").append(cardtype);
        sb.append(", cardnumber=").append(cardnumber);
        sb.append(", companyId=").append(companyId);
        sb.append(", companyName=").append(companyName);
        sb.append(", crateTime=").append(crateTime);
        sb.append(", cuser=").append(cuser);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", uuser=").append(uuser);
        sb.append(", path=").append(path);
        sb.append(", position=").append(position);
        sb.append(", shopid=").append(shopid);
        sb.append(", developerid=").append(developerid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}