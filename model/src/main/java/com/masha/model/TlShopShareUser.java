package com.masha.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class TlShopShareUser implements Serializable {
    private Integer id;

    private Integer businessId;

    private Integer userId;

    private String password;

    @ApiModelProperty(value = "-层级，上级ID，--层级，上级ID，-")
    private Integer parentId;

    private String parentIds;

    private String email;

    @ApiModelProperty(value = "1，认证，0，未认证")
    private Integer isEmailCheck;

    @ApiModelProperty(value = "-1,2-2,3-4,2-5,4")
    private String pathId;

    private Integer pointCps;

    private String qccode;

    private String truename;

    private String tenpay;

    private String alipay;

    private String shenfenzheng;

    private String qq;

    private String wxNum;

    private String phone;

    private String birthday;

    @ApiModelProperty(value = "目前的积分")
    private Integer point;

    private Integer pointAll;

    @ApiModelProperty(value = "目前的现金")
    private BigDecimal cash;

    @ApiModelProperty(value = "累积销售")
    private BigDecimal countOrderfeeAll;

    @ApiModelProperty(value = "累积分佣")
    private Long countSharefeeAll;

    @ApiModelProperty(value = " 累计销售")
    private BigDecimal countOrderfee;

    private BigDecimal countOrderPv;

    @ApiModelProperty(value = "现金 全部的佣金")
    private BigDecimal cashAll;

    private Integer countOrder;

    @ApiModelProperty(value = "所有会员")
    private Integer countAlluser;

    @ApiModelProperty(value = "VIP会员")
    private Integer countVipuser;

    @ApiModelProperty(value = " 普通会员")
    private Integer countComuser;

    @ApiModelProperty(value = "点击链接数 ")
    private Integer countUserClick;

    @ApiModelProperty(value = "成功关注 人")
    private Integer countUserGuanzhu;

    @ApiModelProperty(value = "下单购买 人")
    private Integer countUserBuy;

    @ApiModelProperty(value = "已完成的分销 人")
    private Integer countYiwanchengFenxiao;

    @ApiModelProperty(value = "未完成的分销 人")
    private Integer countWeiwanchengFenxiao;

    @ApiModelProperty(value = "未付款")
    private BigDecimal countCashMeifukuan;

    @ApiModelProperty(value = "已付款")
    private BigDecimal countCashYifukuan;

    @ApiModelProperty(value = "未收货")
    private BigDecimal countCashMeishouhuo;

    @ApiModelProperty(value = "已收货订单佣金")
    private BigDecimal countCashShouhuo;

    @ApiModelProperty(value = "可提现订单佣金")
    private BigDecimal countCashCanTixian;

    @ApiModelProperty(value = "已提现订单佣金")
    private BigDecimal countCashHasTixian;

    @ApiModelProperty(value = "作作废的金额")
    private BigDecimal countCashZuofei;

    @ApiModelProperty(value = "已付款订单金额")
    private BigDecimal countOrderSalePaid;

    @ApiModelProperty(value = "消费积分")
    private BigDecimal countSharePoint;

    @ApiModelProperty(value = "平级奖")
    private BigDecimal countCashEqual;

    @ApiModelProperty(value = "跨级奖")
    private BigDecimal countCashGap;

    @ApiModelProperty(value = "利润奖")
    private BigDecimal countCashProfit;

    @ApiModelProperty(value = "团队奖")
    private BigDecimal countCashTeam;

    private String wxQccode;

    @ApiModelProperty(value = "0,不关注，1已关注")
    private Integer isGuanzhu;

    private Integer addtime;

    @ApiModelProperty(value = "1 正常 2 不正常")
    private Integer status;

    @ApiModelProperty(value = "1 分销资格 0没有")
    private Integer isShare;

    private String checkContent;

    @ApiModelProperty(value = "铜牌股东,银牌股东,金牌股东")
    private String gudongText;

    @ApiModelProperty(value = "店铺类型")
    private String app;

    @ApiModelProperty(value = "分销员级别")
    private Integer shareGradeId;

    @ApiModelProperty(value = "管理登记")
    private Integer guanliGradeId;

    @ApiModelProperty(value = "层级")
    private Integer level;

    @ApiModelProperty(value = "是否认证")
    private Byte isRenzheng;

    @ApiModelProperty(value = "是否可以发展普通会员")
    private Byte isShareUser;

    @ApiModelProperty(value = "是否购买")
    private Integer isBuy;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBusinessId() {
        return businessId;
    }

    public void setBusinessId(Integer businessId) {
        this.businessId = businessId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getParentIds() {
        return parentIds;
    }

    public void setParentIds(String parentIds) {
        this.parentIds = parentIds;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getIsEmailCheck() {
        return isEmailCheck;
    }

    public void setIsEmailCheck(Integer isEmailCheck) {
        this.isEmailCheck = isEmailCheck;
    }

    public String getPathId() {
        return pathId;
    }

    public void setPathId(String pathId) {
        this.pathId = pathId;
    }

    public Integer getPointCps() {
        return pointCps;
    }

    public void setPointCps(Integer pointCps) {
        this.pointCps = pointCps;
    }

    public String getQccode() {
        return qccode;
    }

    public void setQccode(String qccode) {
        this.qccode = qccode;
    }

    public String getTruename() {
        return truename;
    }

    public void setTruename(String truename) {
        this.truename = truename;
    }

    public String getTenpay() {
        return tenpay;
    }

    public void setTenpay(String tenpay) {
        this.tenpay = tenpay;
    }

    public String getAlipay() {
        return alipay;
    }

    public void setAlipay(String alipay) {
        this.alipay = alipay;
    }

    public String getShenfenzheng() {
        return shenfenzheng;
    }

    public void setShenfenzheng(String shenfenzheng) {
        this.shenfenzheng = shenfenzheng;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getWxNum() {
        return wxNum;
    }

    public void setWxNum(String wxNum) {
        this.wxNum = wxNum;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public Integer getPoint() {
        return point;
    }

    public void setPoint(Integer point) {
        this.point = point;
    }

    public Integer getPointAll() {
        return pointAll;
    }

    public void setPointAll(Integer pointAll) {
        this.pointAll = pointAll;
    }

    public BigDecimal getCash() {
        return cash;
    }

    public void setCash(BigDecimal cash) {
        this.cash = cash;
    }

    public BigDecimal getCountOrderfeeAll() {
        return countOrderfeeAll;
    }

    public void setCountOrderfeeAll(BigDecimal countOrderfeeAll) {
        this.countOrderfeeAll = countOrderfeeAll;
    }

    public Long getCountSharefeeAll() {
        return countSharefeeAll;
    }

    public void setCountSharefeeAll(Long countSharefeeAll) {
        this.countSharefeeAll = countSharefeeAll;
    }

    public BigDecimal getCountOrderfee() {
        return countOrderfee;
    }

    public void setCountOrderfee(BigDecimal countOrderfee) {
        this.countOrderfee = countOrderfee;
    }

    public BigDecimal getCountOrderPv() {
        return countOrderPv;
    }

    public void setCountOrderPv(BigDecimal countOrderPv) {
        this.countOrderPv = countOrderPv;
    }

    public BigDecimal getCashAll() {
        return cashAll;
    }

    public void setCashAll(BigDecimal cashAll) {
        this.cashAll = cashAll;
    }

    public Integer getCountOrder() {
        return countOrder;
    }

    public void setCountOrder(Integer countOrder) {
        this.countOrder = countOrder;
    }

    public Integer getCountAlluser() {
        return countAlluser;
    }

    public void setCountAlluser(Integer countAlluser) {
        this.countAlluser = countAlluser;
    }

    public Integer getCountVipuser() {
        return countVipuser;
    }

    public void setCountVipuser(Integer countVipuser) {
        this.countVipuser = countVipuser;
    }

    public Integer getCountComuser() {
        return countComuser;
    }

    public void setCountComuser(Integer countComuser) {
        this.countComuser = countComuser;
    }

    public Integer getCountUserClick() {
        return countUserClick;
    }

    public void setCountUserClick(Integer countUserClick) {
        this.countUserClick = countUserClick;
    }

    public Integer getCountUserGuanzhu() {
        return countUserGuanzhu;
    }

    public void setCountUserGuanzhu(Integer countUserGuanzhu) {
        this.countUserGuanzhu = countUserGuanzhu;
    }

    public Integer getCountUserBuy() {
        return countUserBuy;
    }

    public void setCountUserBuy(Integer countUserBuy) {
        this.countUserBuy = countUserBuy;
    }

    public Integer getCountYiwanchengFenxiao() {
        return countYiwanchengFenxiao;
    }

    public void setCountYiwanchengFenxiao(Integer countYiwanchengFenxiao) {
        this.countYiwanchengFenxiao = countYiwanchengFenxiao;
    }

    public Integer getCountWeiwanchengFenxiao() {
        return countWeiwanchengFenxiao;
    }

    public void setCountWeiwanchengFenxiao(Integer countWeiwanchengFenxiao) {
        this.countWeiwanchengFenxiao = countWeiwanchengFenxiao;
    }

    public BigDecimal getCountCashMeifukuan() {
        return countCashMeifukuan;
    }

    public void setCountCashMeifukuan(BigDecimal countCashMeifukuan) {
        this.countCashMeifukuan = countCashMeifukuan;
    }

    public BigDecimal getCountCashYifukuan() {
        return countCashYifukuan;
    }

    public void setCountCashYifukuan(BigDecimal countCashYifukuan) {
        this.countCashYifukuan = countCashYifukuan;
    }

    public BigDecimal getCountCashMeishouhuo() {
        return countCashMeishouhuo;
    }

    public void setCountCashMeishouhuo(BigDecimal countCashMeishouhuo) {
        this.countCashMeishouhuo = countCashMeishouhuo;
    }

    public BigDecimal getCountCashShouhuo() {
        return countCashShouhuo;
    }

    public void setCountCashShouhuo(BigDecimal countCashShouhuo) {
        this.countCashShouhuo = countCashShouhuo;
    }

    public BigDecimal getCountCashCanTixian() {
        return countCashCanTixian;
    }

    public void setCountCashCanTixian(BigDecimal countCashCanTixian) {
        this.countCashCanTixian = countCashCanTixian;
    }

    public BigDecimal getCountCashHasTixian() {
        return countCashHasTixian;
    }

    public void setCountCashHasTixian(BigDecimal countCashHasTixian) {
        this.countCashHasTixian = countCashHasTixian;
    }

    public BigDecimal getCountCashZuofei() {
        return countCashZuofei;
    }

    public void setCountCashZuofei(BigDecimal countCashZuofei) {
        this.countCashZuofei = countCashZuofei;
    }

    public BigDecimal getCountOrderSalePaid() {
        return countOrderSalePaid;
    }

    public void setCountOrderSalePaid(BigDecimal countOrderSalePaid) {
        this.countOrderSalePaid = countOrderSalePaid;
    }

    public BigDecimal getCountSharePoint() {
        return countSharePoint;
    }

    public void setCountSharePoint(BigDecimal countSharePoint) {
        this.countSharePoint = countSharePoint;
    }

    public BigDecimal getCountCashEqual() {
        return countCashEqual;
    }

    public void setCountCashEqual(BigDecimal countCashEqual) {
        this.countCashEqual = countCashEqual;
    }

    public BigDecimal getCountCashGap() {
        return countCashGap;
    }

    public void setCountCashGap(BigDecimal countCashGap) {
        this.countCashGap = countCashGap;
    }

    public BigDecimal getCountCashProfit() {
        return countCashProfit;
    }

    public void setCountCashProfit(BigDecimal countCashProfit) {
        this.countCashProfit = countCashProfit;
    }

    public BigDecimal getCountCashTeam() {
        return countCashTeam;
    }

    public void setCountCashTeam(BigDecimal countCashTeam) {
        this.countCashTeam = countCashTeam;
    }

    public String getWxQccode() {
        return wxQccode;
    }

    public void setWxQccode(String wxQccode) {
        this.wxQccode = wxQccode;
    }

    public Integer getIsGuanzhu() {
        return isGuanzhu;
    }

    public void setIsGuanzhu(Integer isGuanzhu) {
        this.isGuanzhu = isGuanzhu;
    }

    public Integer getAddtime() {
        return addtime;
    }

    public void setAddtime(Integer addtime) {
        this.addtime = addtime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getIsShare() {
        return isShare;
    }

    public void setIsShare(Integer isShare) {
        this.isShare = isShare;
    }

    public String getCheckContent() {
        return checkContent;
    }

    public void setCheckContent(String checkContent) {
        this.checkContent = checkContent;
    }

    public String getGudongText() {
        return gudongText;
    }

    public void setGudongText(String gudongText) {
        this.gudongText = gudongText;
    }

    public String getApp() {
        return app;
    }

    public void setApp(String app) {
        this.app = app;
    }

    public Integer getShareGradeId() {
        return shareGradeId;
    }

    public void setShareGradeId(Integer shareGradeId) {
        this.shareGradeId = shareGradeId;
    }

    public Integer getGuanliGradeId() {
        return guanliGradeId;
    }

    public void setGuanliGradeId(Integer guanliGradeId) {
        this.guanliGradeId = guanliGradeId;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Byte getIsRenzheng() {
        return isRenzheng;
    }

    public void setIsRenzheng(Byte isRenzheng) {
        this.isRenzheng = isRenzheng;
    }

    public Byte getIsShareUser() {
        return isShareUser;
    }

    public void setIsShareUser(Byte isShareUser) {
        this.isShareUser = isShareUser;
    }

    public Integer getIsBuy() {
        return isBuy;
    }

    public void setIsBuy(Integer isBuy) {
        this.isBuy = isBuy;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", businessId=").append(businessId);
        sb.append(", userId=").append(userId);
        sb.append(", password=").append(password);
        sb.append(", parentId=").append(parentId);
        sb.append(", parentIds=").append(parentIds);
        sb.append(", email=").append(email);
        sb.append(", isEmailCheck=").append(isEmailCheck);
        sb.append(", pathId=").append(pathId);
        sb.append(", pointCps=").append(pointCps);
        sb.append(", qccode=").append(qccode);
        sb.append(", truename=").append(truename);
        sb.append(", tenpay=").append(tenpay);
        sb.append(", alipay=").append(alipay);
        sb.append(", shenfenzheng=").append(shenfenzheng);
        sb.append(", qq=").append(qq);
        sb.append(", wxNum=").append(wxNum);
        sb.append(", phone=").append(phone);
        sb.append(", birthday=").append(birthday);
        sb.append(", point=").append(point);
        sb.append(", pointAll=").append(pointAll);
        sb.append(", cash=").append(cash);
        sb.append(", countOrderfeeAll=").append(countOrderfeeAll);
        sb.append(", countSharefeeAll=").append(countSharefeeAll);
        sb.append(", countOrderfee=").append(countOrderfee);
        sb.append(", countOrderPv=").append(countOrderPv);
        sb.append(", cashAll=").append(cashAll);
        sb.append(", countOrder=").append(countOrder);
        sb.append(", countAlluser=").append(countAlluser);
        sb.append(", countVipuser=").append(countVipuser);
        sb.append(", countComuser=").append(countComuser);
        sb.append(", countUserClick=").append(countUserClick);
        sb.append(", countUserGuanzhu=").append(countUserGuanzhu);
        sb.append(", countUserBuy=").append(countUserBuy);
        sb.append(", countYiwanchengFenxiao=").append(countYiwanchengFenxiao);
        sb.append(", countWeiwanchengFenxiao=").append(countWeiwanchengFenxiao);
        sb.append(", countCashMeifukuan=").append(countCashMeifukuan);
        sb.append(", countCashYifukuan=").append(countCashYifukuan);
        sb.append(", countCashMeishouhuo=").append(countCashMeishouhuo);
        sb.append(", countCashShouhuo=").append(countCashShouhuo);
        sb.append(", countCashCanTixian=").append(countCashCanTixian);
        sb.append(", countCashHasTixian=").append(countCashHasTixian);
        sb.append(", countCashZuofei=").append(countCashZuofei);
        sb.append(", countOrderSalePaid=").append(countOrderSalePaid);
        sb.append(", countSharePoint=").append(countSharePoint);
        sb.append(", countCashEqual=").append(countCashEqual);
        sb.append(", countCashGap=").append(countCashGap);
        sb.append(", countCashProfit=").append(countCashProfit);
        sb.append(", countCashTeam=").append(countCashTeam);
        sb.append(", wxQccode=").append(wxQccode);
        sb.append(", isGuanzhu=").append(isGuanzhu);
        sb.append(", addtime=").append(addtime);
        sb.append(", status=").append(status);
        sb.append(", isShare=").append(isShare);
        sb.append(", checkContent=").append(checkContent);
        sb.append(", gudongText=").append(gudongText);
        sb.append(", app=").append(app);
        sb.append(", shareGradeId=").append(shareGradeId);
        sb.append(", guanliGradeId=").append(guanliGradeId);
        sb.append(", level=").append(level);
        sb.append(", isRenzheng=").append(isRenzheng);
        sb.append(", isShareUser=").append(isShareUser);
        sb.append(", isBuy=").append(isBuy);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
