package com.masha.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class TlUser implements Serializable {
    @ApiModelProperty(value = "//用户自增ID")
    private Integer id;

    @ApiModelProperty(value = "上级管理的ID")
    private Integer adminId;

    private String loginname;

    @ApiModelProperty(value = "用户名")
    private String username;

    private String truename;

    private String password;

    private String token;

    private Integer parentId;

    private String headimgurl;

    private String phone;

    private BigDecimal account;

    private String parentName;

    private String openid;

    @ApiModelProperty(value = "所有积分总额 ")
    private Integer allPoints;

    @ApiModelProperty(value = "积分")
    private Integer points;

    private String unionid;

    @ApiModelProperty(value = "//上一次登录时间")
    private Integer lastlogin;

    @ApiModelProperty(value = "//0要进行用户名密码登录1微信自动登录2冻结")
    private Short status;

    @ApiModelProperty(value = "0普通用户,1,商城用户")
    private Short type;

    @ApiModelProperty(value = "身份证")
    private String shenfengzheng;

    private String content;

    private Integer startTime;

    private Integer endTime;

    @ApiModelProperty(value = "隶属哪个代理的ID")
    private Integer agentId;

    private Integer addtime;

    private Integer wxId;

    private Integer wxNum;

    private String wxQrcode;

    private String birthday;

    @ApiModelProperty(value = "0")
    private Short isSubscribe;

    @ApiModelProperty(value = "等级ID")
    private Integer gradeId;

    private Integer roleId;

    @ApiModelProperty(value = "联系人")
    private String linkman;

    @ApiModelProperty(value = "2未认证 1认证")
    private Short isApprove;

    @ApiModelProperty(value = "邮箱")
    private String email;

    @ApiModelProperty(value = "图片路径")
    private String imgUrl;

    @ApiModelProperty(value = "身份证")
    private String papersId;

    @ApiModelProperty(value = "性别")
    private Short sex;

    @ApiModelProperty(value = "0 为认证 1 以认证 2 认证不过 3 申请认证 等待中")
    private Short isRenzheng;

    private Short isSign;

    private Short isPay;

    @ApiModelProperty(value = "融云token")
    private String rongcloudToken;

    @ApiModelProperty(value = "设备 token")
    private String deviceToken;

    @ApiModelProperty(value = "设备类型")
    private String deviceType;

    @ApiModelProperty(value = "是否登录")
    private String hasLogined;

    @ApiModelProperty(value = "管理用户的权限 1未过 2 已过 3 冻结 4 已支付 5 试用 6 不通过")
    private Integer userwebStatus;

    @ApiModelProperty(value = "管理用户的到期时间")
    private Integer userwebEndTime;

    private Integer logintime;

    @ApiModelProperty(value = "是否为供应商")
    private Byte isSupplier;

    @ApiModelProperty(value = "行业")
    private Integer province;

    private Integer city;

    private Integer area;

    private Integer street;

    private String address;

    private Integer shareGradeId;

    private Byte userStatus;

    @ApiModelProperty(value = "年费会员")
    private BigDecimal annualFee;

    @ApiModelProperty(value = "登录course过期时间")
    private Integer expireTime;

    @ApiModelProperty(value = "登录course令牌")
    private String courseToken;

    @ApiModelProperty(value = "证书图片地址")
    private String certimgUrl;

    private String bzjPic;

    private String sfz;

    private String sfz1;

    private String sfz2;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public String getLoginname() {
        return loginname;
    }

    public void setLoginname(String loginname) {
        this.loginname = loginname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getTruename() {
        return truename;
    }

    public void setTruename(String truename) {
        this.truename = truename;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getHeadimgurl() {
        return headimgurl;
    }

    public void setHeadimgurl(String headimgurl) {
        this.headimgurl = headimgurl;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public BigDecimal getAccount() {
        return account;
    }

    public void setAccount(BigDecimal account) {
        this.account = account;
    }

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public Integer getAllPoints() {
        return allPoints;
    }

    public void setAllPoints(Integer allPoints) {
        this.allPoints = allPoints;
    }

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }

    public String getUnionid() {
        return unionid;
    }

    public void setUnionid(String unionid) {
        this.unionid = unionid;
    }

    public Integer getLastlogin() {
        return lastlogin;
    }

    public void setLastlogin(Integer lastlogin) {
        this.lastlogin = lastlogin;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public Short getType() {
        return type;
    }

    public void setType(Short type) {
        this.type = type;
    }

    public String getShenfengzheng() {
        return shenfengzheng;
    }

    public void setShenfengzheng(String shenfengzheng) {
        this.shenfengzheng = shenfengzheng;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getStartTime() {
        return startTime;
    }

    public void setStartTime(Integer startTime) {
        this.startTime = startTime;
    }

    public Integer getEndTime() {
        return endTime;
    }

    public void setEndTime(Integer endTime) {
        this.endTime = endTime;
    }

    public Integer getAgentId() {
        return agentId;
    }

    public void setAgentId(Integer agentId) {
        this.agentId = agentId;
    }

    public Integer getAddtime() {
        return addtime;
    }

    public void setAddtime(Integer addtime) {
        this.addtime = addtime;
    }

    public Integer getWxId() {
        return wxId;
    }

    public void setWxId(Integer wxId) {
        this.wxId = wxId;
    }

    public Integer getWxNum() {
        return wxNum;
    }

    public void setWxNum(Integer wxNum) {
        this.wxNum = wxNum;
    }

    public String getWxQrcode() {
        return wxQrcode;
    }

    public void setWxQrcode(String wxQrcode) {
        this.wxQrcode = wxQrcode;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public Short getIsSubscribe() {
        return isSubscribe;
    }

    public void setIsSubscribe(Short isSubscribe) {
        this.isSubscribe = isSubscribe;
    }

    public Integer getGradeId() {
        return gradeId;
    }

    public void setGradeId(Integer gradeId) {
        this.gradeId = gradeId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getLinkman() {
        return linkman;
    }

    public void setLinkman(String linkman) {
        this.linkman = linkman;
    }

    public Short getIsApprove() {
        return isApprove;
    }

    public void setIsApprove(Short isApprove) {
        this.isApprove = isApprove;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getPapersId() {
        return papersId;
    }

    public void setPapersId(String papersId) {
        this.papersId = papersId;
    }

    public Short getSex() {
        return sex;
    }

    public void setSex(Short sex) {
        this.sex = sex;
    }

    public Short getIsRenzheng() {
        return isRenzheng;
    }

    public void setIsRenzheng(Short isRenzheng) {
        this.isRenzheng = isRenzheng;
    }

    public Short getIsSign() {
        return isSign;
    }

    public void setIsSign(Short isSign) {
        this.isSign = isSign;
    }

    public Short getIsPay() {
        return isPay;
    }

    public void setIsPay(Short isPay) {
        this.isPay = isPay;
    }

    public String getRongcloudToken() {
        return rongcloudToken;
    }

    public void setRongcloudToken(String rongcloudToken) {
        this.rongcloudToken = rongcloudToken;
    }

    public String getDeviceToken() {
        return deviceToken;
    }

    public void setDeviceToken(String deviceToken) {
        this.deviceToken = deviceToken;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    public String getHasLogined() {
        return hasLogined;
    }

    public void setHasLogined(String hasLogined) {
        this.hasLogined = hasLogined;
    }

    public Integer getUserwebStatus() {
        return userwebStatus;
    }

    public void setUserwebStatus(Integer userwebStatus) {
        this.userwebStatus = userwebStatus;
    }

    public Integer getUserwebEndTime() {
        return userwebEndTime;
    }

    public void setUserwebEndTime(Integer userwebEndTime) {
        this.userwebEndTime = userwebEndTime;
    }

    public Integer getLogintime() {
        return logintime;
    }

    public void setLogintime(Integer logintime) {
        this.logintime = logintime;
    }

    public Byte getIsSupplier() {
        return isSupplier;
    }

    public void setIsSupplier(Byte isSupplier) {
        this.isSupplier = isSupplier;
    }

    public Integer getProvince() {
        return province;
    }

    public void setProvince(Integer province) {
        this.province = province;
    }

    public Integer getCity() {
        return city;
    }

    public void setCity(Integer city) {
        this.city = city;
    }

    public Integer getArea() {
        return area;
    }

    public void setArea(Integer area) {
        this.area = area;
    }

    public Integer getStreet() {
        return street;
    }

    public void setStreet(Integer street) {
        this.street = street;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getShareGradeId() {
        return shareGradeId;
    }

    public void setShareGradeId(Integer shareGradeId) {
        this.shareGradeId = shareGradeId;
    }

    public Byte getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(Byte userStatus) {
        this.userStatus = userStatus;
    }

    public BigDecimal getAnnualFee() {
        return annualFee;
    }

    public void setAnnualFee(BigDecimal annualFee) {
        this.annualFee = annualFee;
    }

    public Integer getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(Integer expireTime) {
        this.expireTime = expireTime;
    }

    public String getCourseToken() {
        return courseToken;
    }

    public void setCourseToken(String courseToken) {
        this.courseToken = courseToken;
    }

    public String getCertimgUrl() {
        return certimgUrl;
    }

    public void setCertimgUrl(String certimgUrl) {
        this.certimgUrl = certimgUrl;
    }

    public String getBzjPic() {
        return bzjPic;
    }

    public void setBzjPic(String bzjPic) {
        this.bzjPic = bzjPic;
    }

    public String getSfz() {
        return sfz;
    }

    public void setSfz(String sfz) {
        this.sfz = sfz;
    }

    public String getSfz1() {
        return sfz1;
    }

    public void setSfz1(String sfz1) {
        this.sfz1 = sfz1;
    }

    public String getSfz2() {
        return sfz2;
    }

    public void setSfz2(String sfz2) {
        this.sfz2 = sfz2;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", adminId=").append(adminId);
        sb.append(", loginname=").append(loginname);
        sb.append(", username=").append(username);
        sb.append(", truename=").append(truename);
        sb.append(", password=").append(password);
        sb.append(", token=").append(token);
        sb.append(", parentId=").append(parentId);
        sb.append(", headimgurl=").append(headimgurl);
        sb.append(", phone=").append(phone);
        sb.append(", account=").append(account);
        sb.append(", parentName=").append(parentName);
        sb.append(", openid=").append(openid);
        sb.append(", allPoints=").append(allPoints);
        sb.append(", points=").append(points);
        sb.append(", unionid=").append(unionid);
        sb.append(", lastlogin=").append(lastlogin);
        sb.append(", status=").append(status);
        sb.append(", type=").append(type);
        sb.append(", shenfengzheng=").append(shenfengzheng);
        sb.append(", content=").append(content);
        sb.append(", startTime=").append(startTime);
        sb.append(", endTime=").append(endTime);
        sb.append(", agentId=").append(agentId);
        sb.append(", addtime=").append(addtime);
        sb.append(", wxId=").append(wxId);
        sb.append(", wxNum=").append(wxNum);
        sb.append(", wxQrcode=").append(wxQrcode);
        sb.append(", birthday=").append(birthday);
        sb.append(", isSubscribe=").append(isSubscribe);
        sb.append(", gradeId=").append(gradeId);
        sb.append(", roleId=").append(roleId);
        sb.append(", linkman=").append(linkman);
        sb.append(", isApprove=").append(isApprove);
        sb.append(", email=").append(email);
        sb.append(", imgUrl=").append(imgUrl);
        sb.append(", papersId=").append(papersId);
        sb.append(", sex=").append(sex);
        sb.append(", isRenzheng=").append(isRenzheng);
        sb.append(", isSign=").append(isSign);
        sb.append(", isPay=").append(isPay);
        sb.append(", rongcloudToken=").append(rongcloudToken);
        sb.append(", deviceToken=").append(deviceToken);
        sb.append(", deviceType=").append(deviceType);
        sb.append(", hasLogined=").append(hasLogined);
        sb.append(", userwebStatus=").append(userwebStatus);
        sb.append(", userwebEndTime=").append(userwebEndTime);
        sb.append(", logintime=").append(logintime);
        sb.append(", isSupplier=").append(isSupplier);
        sb.append(", province=").append(province);
        sb.append(", city=").append(city);
        sb.append(", area=").append(area);
        sb.append(", street=").append(street);
        sb.append(", address=").append(address);
        sb.append(", shareGradeId=").append(shareGradeId);
        sb.append(", userStatus=").append(userStatus);
        sb.append(", annualFee=").append(annualFee);
        sb.append(", expireTime=").append(expireTime);
        sb.append(", courseToken=").append(courseToken);
        sb.append(", certimgUrl=").append(certimgUrl);
        sb.append(", bzjPic=").append(bzjPic);
        sb.append(", sfz=").append(sfz);
        sb.append(", sfz1=").append(sfz1);
        sb.append(", sfz2=").append(sfz2);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
