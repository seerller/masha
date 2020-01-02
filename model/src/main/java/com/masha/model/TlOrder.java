package com.masha.model;

import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 订单实体类
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("tl_order")
@ApiModel("我的订单")
public class TlOrder implements Serializable {

    private Integer orderId;

    @ApiModelProperty(value = "订单号")
    private String orderSn;

    @ApiModelProperty(value = "退款订单号")
    private String backOrderSn;

    @ApiModelProperty(value = "支付订单号")
    private String transactionId;

    private Integer userId;

    private String addressName;

    private String addressPhone;

    private Short addressId;

    private Integer addressProvinceId;

    private Integer addressCityId;

    private Integer addressAreaId;

    private Integer addressStreetId;

    private String addressParams;

    @ApiModelProperty(value = "快递费")
    private BigDecimal shippingFee;

    private BigDecimal goodsFee;

    private BigDecimal totalFee;

    @ApiModelProperty(value = "余额支付+现金支付")
    private BigDecimal payFee;

    private String payBeizhu;

    private BigDecimal realFee;

    @ApiModelProperty(value = "减少费用")
    private BigDecimal disFee;

    @ApiModelProperty(value = "减少费用")
    private BigDecimal discountFee;

    private BigDecimal accountFee;

    @ApiModelProperty(value = "税费")
    private String shuidianFee;

    @ApiModelProperty(value = "费用减少的原因")
    private String discountFeeParams;

    private Float pointFee;

    private BigDecimal teacherFee;

    @ApiModelProperty(value = "优惠券 抵扣")
    private BigDecimal feeDisForCoupon;

    @ApiModelProperty(value = "优惠券")
    private String couponId;

    private String userCouponId;

    @ApiModelProperty(value = "商家的分红点")
    private BigDecimal shopFee;

    @ApiModelProperty(value = "具体费率")
    private Integer shopFeePre;

    @ApiModelProperty(value = " 购买赠送的积分")
    private Integer buyGivePoint;

    @ApiModelProperty(value = "1,正常,2,关闭 ,3,成功,不可以退货")
    private Integer orderStatus;

    @ApiModelProperty(value = "订单成功不可退款的时间")
    private Integer successTime;

    @ApiModelProperty(value = "0 未发货 1 已发货（未收货）  5 部分发货  2 已收货  ")
    private Short shippingStatus;

    private String backEndContent;

    @ApiModelProperty(value = "0 无争议 1 有争议 2 争议结束   平台介入")
    private Integer backEnd;

    @ApiModelProperty(value = "0,无退货 1 售后处理中 2已同意退货3拒绝退货4买家已发货(退货)5退货完成 6 退货结束")
    private Integer backStatus;

    @ApiModelProperty(value = "0 未完成 1退货完成")
    private Integer backComfirm;

    @ApiModelProperty(value = "确定退款时间")
    private Integer backComfirmTime;

    @ApiModelProperty(value = "申请介入 来源")
    private String backFrom;

    @ApiModelProperty(value = "送礼状态0未领取 1已领取")
    private Integer giftStatus;

    @ApiModelProperty(value = "0 未付款 1 已付款")
    private Short payStatus;

    private Integer paytime;

    @ApiModelProperty(value = "收货状态 1 系统收货2")
    private Short comfirmStauts;

    @ApiModelProperty(value = "0 未消费 1 已消费 2 未消费,已过期")
    private Short tuangouStatus;

    @ApiModelProperty(value = "1 真实商品 2 虚拟商品")
    private Integer isReal;

    private Short isTuangou;

    private String shippingCode;

    @ApiModelProperty(value = "快递公司ID")
    private String shippingId;

    @ApiModelProperty(value = "快递单号")
    private String shippingSn;

    private Integer payId;

    @ApiModelProperty(value = "申请退货时间")
    private Integer backTime;

    @ApiModelProperty(value = "发货时间")
    private Integer shippingTime;

    @ApiModelProperty(value = "确认收货时间")
    private Integer comfirmTime;

    @ApiModelProperty(value = "back_type 1 仅退款 2退货退款  3 仅退货")
    private Integer backType;

    private Integer backShippingAddtime;

    private String backShippingCode;

    private String backShippingId;

    @ApiModelProperty(value = "退货地址")
    private String backAddress;

    @ApiModelProperty(value = "退款金额")
    private BigDecimal backFee;

    @ApiModelProperty(value = "操作来源 ,1 后台，2，用户下单")
    private String action;

    @ApiModelProperty(value = "留言")
    private String msg;

    @ApiModelProperty(value = "旗帜标注")
    private Integer biaozhu;

    @ApiModelProperty(value = "content_back")
    private String contentBack;

    @ApiModelProperty(value = "客服备注")
    private String content;

    private Integer type;

    @ApiModelProperty(value = "应用名称")
    private String app;

    @ApiModelProperty(value = "业务ID")
    private Integer businessId;

    @ApiModelProperty(value = "课程id")
    private Integer scheduleId;

    private Integer serviceShopId;

    @ApiModelProperty(value = "教师id")
    private Integer teacherId;

    private String scheduleDate;

    private String scheduleTimepart;

    private String scheduleTimepartArr;

    @ApiModelProperty(value = "0技师接单中(默认)1技师已接单2技师未接单老板派单中3老板派单成功4老板派单失败已退款5开始服务计时6服务完成7用户申请退款8退款成功9拒绝退款")
    private Byte serviceStatus;

    @ApiModelProperty(value = "0上门服务1到店服务")
    private Integer serviceType;

    @ApiModelProperty(value = "1 未结单 2 已结单")
    private Integer foodStatus;

    @ApiModelProperty(value = "扫码的ID")
    private Integer tuangouUserId;

    private Integer tuangouAddtime;

    @ApiModelProperty(value = "消费的商家")
    private Integer tuangouShopId;

    private Integer wxId;

    @ApiModelProperty(value = "是否用户删除")
    private Integer userDel;

    private Integer amount;

    private String userCouponIdStr;

    private Integer payStyle;

    private Integer payTime;

    private Integer commentTime;

    @ApiModelProperty(value = "0未平均，1已平均")
    private Byte commentStatus;

    @ApiModelProperty(value = "0 未结算  1结算")
    private Integer addShopLog;

    @ApiModelProperty(value = "0 未结算  1结算")
    private Integer addDailiLog;

    @ApiModelProperty(value = "0 未结算  1结算")
    private Integer addZhaoshangLog;

    @ApiModelProperty(value = "0 未结算  1结算")
    private Integer addMemberLog;

    private String couponIdStr;

    @ApiModelProperty(value = "新增时间")
    private Integer day;

    private Integer addtime;

    @ApiModelProperty(value = "0 不是 1众筹订单")
    private Integer isZhongchou;

    @ApiModelProperty(value = "0 不是 1  属于拼团订单 对以主拼团有")
    private Integer isPintuan;

    @ApiModelProperty(value = "对应的拼团 shop_pintuan id 商品类的 或order_id")
    private Integer pintuanId;

    @ApiModelProperty(value = "0 拼团中  1 拼团成功 2 平台失败")
    private Integer pintuanStatus;

    @ApiModelProperty(value = "拼团类型 ")
    private String pintuanApp;

    @ApiModelProperty(value = "结束时间")
    private Integer pintuanEndtime;

    @ApiModelProperty(value = "0 非发起人  1发起人")
    private Integer pintuanType;

    private Integer goodsId;

    private String params;

    private BigDecimal vipZhekou;

    @ApiModelProperty(value = "子账号")
    private Integer childId;

    @ApiModelProperty(value = "服务卡号")
    private String serviceCardNum;

    @ApiModelProperty(value = "0 非仅服务 1 仅服务")
    private Integer isService;

    @ApiModelProperty(value = "是否代发 1:代发")
    private Byte isDaifa;

    @ApiModelProperty(value = "代发地址ID")
    private Integer daifaAddress;

    @ApiModelProperty(value = "是否需要发票 1：需要")
    private Byte isInvoice;

    private Integer givePointsAll;

    private Integer usePoints;

    private String isUsePoints;

    private BigDecimal pointsFee;

    private Integer giftId;

    private String iccid;

    @ApiModelProperty(value = "1 快递  2 自提")
    private Integer kuaidiType;

    @ApiModelProperty(value = "账号ID")
    private Integer saleAccountId;

    @ApiModelProperty(value = "来自I")
    private Integer fromUserId;

    @ApiModelProperty(value = "来自公司")
    private Integer fromShopId;

    private Integer isSelfStatus;

    @ApiModelProperty(value = "拼团ID ")
    private Integer goodsPintuanId;

    @ApiModelProperty(value = "是否来自云仓发货")
    private Short isYuncangFrom;

    @ApiModelProperty(value = "是否云仓")
    private Short isYuncang;

    private Short isSign;

    private String address;

    @ApiModelProperty(value = "平台处理意见")
    private String backEndContentPingtai;

    @ApiModelProperty(value = "微信支付单号")
    private String weixinOrderSn;

    @ApiModelProperty(value = "预约数据")
    private String paramsBooking;

    private String paramsYanguang;

    private static final long serialVersionUID = 1L;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getOrderSn() {
        return orderSn;
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn;
    }

    public String getBackOrderSn() {
        return backOrderSn;
    }

    public void setBackOrderSn(String backOrderSn) {
        this.backOrderSn = backOrderSn;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getAddressName() {
        return addressName;
    }

    public void setAddressName(String addressName) {
        this.addressName = addressName;
    }

    public String getAddressPhone() {
        return addressPhone;
    }

    public void setAddressPhone(String addressPhone) {
        this.addressPhone = addressPhone;
    }

    public Short getAddressId() {
        return addressId;
    }

    public void setAddressId(Short addressId) {
        this.addressId = addressId;
    }

    public Integer getAddressProvinceId() {
        return addressProvinceId;
    }

    public void setAddressProvinceId(Integer addressProvinceId) {
        this.addressProvinceId = addressProvinceId;
    }

    public Integer getAddressCityId() {
        return addressCityId;
    }

    public void setAddressCityId(Integer addressCityId) {
        this.addressCityId = addressCityId;
    }

    public Integer getAddressAreaId() {
        return addressAreaId;
    }

    public void setAddressAreaId(Integer addressAreaId) {
        this.addressAreaId = addressAreaId;
    }

    public Integer getAddressStreetId() {
        return addressStreetId;
    }

    public void setAddressStreetId(Integer addressStreetId) {
        this.addressStreetId = addressStreetId;
    }

    public String getAddressParams() {
        return addressParams;
    }

    public void setAddressParams(String addressParams) {
        this.addressParams = addressParams;
    }

    public BigDecimal getShippingFee() {
        return shippingFee;
    }

    public void setShippingFee(BigDecimal shippingFee) {
        this.shippingFee = shippingFee;
    }

    public BigDecimal getGoodsFee() {
        return goodsFee;
    }

    public void setGoodsFee(BigDecimal goodsFee) {
        this.goodsFee = goodsFee;
    }

    public BigDecimal getTotalFee() {
        return totalFee;
    }

    public void setTotalFee(BigDecimal totalFee) {
        this.totalFee = totalFee;
    }

    public BigDecimal getPayFee() {
        return payFee;
    }

    public void setPayFee(BigDecimal payFee) {
        this.payFee = payFee;
    }

    public String getPayBeizhu() {
        return payBeizhu;
    }

    public void setPayBeizhu(String payBeizhu) {
        this.payBeizhu = payBeizhu;
    }

    public BigDecimal getRealFee() {
        return realFee;
    }

    public void setRealFee(BigDecimal realFee) {
        this.realFee = realFee;
    }

    public BigDecimal getDisFee() {
        return disFee;
    }

    public void setDisFee(BigDecimal disFee) {
        this.disFee = disFee;
    }

    public BigDecimal getDiscountFee() {
        return discountFee;
    }

    public void setDiscountFee(BigDecimal discountFee) {
        this.discountFee = discountFee;
    }

    public BigDecimal getAccountFee() {
        return accountFee;
    }

    public void setAccountFee(BigDecimal accountFee) {
        this.accountFee = accountFee;
    }

    public String getShuidianFee() {
        return shuidianFee;
    }

    public void setShuidianFee(String shuidianFee) {
        this.shuidianFee = shuidianFee;
    }

    public String getDiscountFeeParams() {
        return discountFeeParams;
    }

    public void setDiscountFeeParams(String discountFeeParams) {
        this.discountFeeParams = discountFeeParams;
    }

    public Float getPointFee() {
        return pointFee;
    }

    public void setPointFee(Float pointFee) {
        this.pointFee = pointFee;
    }

    public BigDecimal getTeacherFee() {
        return teacherFee;
    }

    public void setTeacherFee(BigDecimal teacherFee) {
        this.teacherFee = teacherFee;
    }

    public BigDecimal getFeeDisForCoupon() {
        return feeDisForCoupon;
    }

    public void setFeeDisForCoupon(BigDecimal feeDisForCoupon) {
        this.feeDisForCoupon = feeDisForCoupon;
    }

    public String getCouponId() {
        return couponId;
    }

    public void setCouponId(String couponId) {
        this.couponId = couponId;
    }

    public String getUserCouponId() {
        return userCouponId;
    }

    public void setUserCouponId(String userCouponId) {
        this.userCouponId = userCouponId;
    }

    public BigDecimal getShopFee() {
        return shopFee;
    }

    public void setShopFee(BigDecimal shopFee) {
        this.shopFee = shopFee;
    }

    public Integer getShopFeePre() {
        return shopFeePre;
    }

    public void setShopFeePre(Integer shopFeePre) {
        this.shopFeePre = shopFeePre;
    }

    public Integer getBuyGivePoint() {
        return buyGivePoint;
    }

    public void setBuyGivePoint(Integer buyGivePoint) {
        this.buyGivePoint = buyGivePoint;
    }

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Integer getSuccessTime() {
        return successTime;
    }

    public void setSuccessTime(Integer successTime) {
        this.successTime = successTime;
    }

    public Short getShippingStatus() {
        return shippingStatus;
    }

    public void setShippingStatus(Short shippingStatus) {
        this.shippingStatus = shippingStatus;
    }

    public String getBackEndContent() {
        return backEndContent;
    }

    public void setBackEndContent(String backEndContent) {
        this.backEndContent = backEndContent;
    }

    public Integer getBackEnd() {
        return backEnd;
    }

    public void setBackEnd(Integer backEnd) {
        this.backEnd = backEnd;
    }

    public Integer getBackStatus() {
        return backStatus;
    }

    public void setBackStatus(Integer backStatus) {
        this.backStatus = backStatus;
    }

    public Integer getBackComfirm() {
        return backComfirm;
    }

    public void setBackComfirm(Integer backComfirm) {
        this.backComfirm = backComfirm;
    }

    public Integer getBackComfirmTime() {
        return backComfirmTime;
    }

    public void setBackComfirmTime(Integer backComfirmTime) {
        this.backComfirmTime = backComfirmTime;
    }

    public String getBackFrom() {
        return backFrom;
    }

    public void setBackFrom(String backFrom) {
        this.backFrom = backFrom;
    }

    public Integer getGiftStatus() {
        return giftStatus;
    }

    public void setGiftStatus(Integer giftStatus) {
        this.giftStatus = giftStatus;
    }

    public Short getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(Short payStatus) {
        this.payStatus = payStatus;
    }

    public Integer getPaytime() {
        return paytime;
    }

    public void setPaytime(Integer paytime) {
        this.paytime = paytime;
    }

    public Short getComfirmStauts() {
        return comfirmStauts;
    }

    public void setComfirmStauts(Short comfirmStauts) {
        this.comfirmStauts = comfirmStauts;
    }

    public Short getTuangouStatus() {
        return tuangouStatus;
    }

    public void setTuangouStatus(Short tuangouStatus) {
        this.tuangouStatus = tuangouStatus;
    }

    public Integer getIsReal() {
        return isReal;
    }

    public void setIsReal(Integer isReal) {
        this.isReal = isReal;
    }

    public Short getIsTuangou() {
        return isTuangou;
    }

    public void setIsTuangou(Short isTuangou) {
        this.isTuangou = isTuangou;
    }

    public String getShippingCode() {
        return shippingCode;
    }

    public void setShippingCode(String shippingCode) {
        this.shippingCode = shippingCode;
    }

    public String getShippingId() {
        return shippingId;
    }

    public void setShippingId(String shippingId) {
        this.shippingId = shippingId;
    }

    public String getShippingSn() {
        return shippingSn;
    }

    public void setShippingSn(String shippingSn) {
        this.shippingSn = shippingSn;
    }

    public Integer getPayId() {
        return payId;
    }

    public void setPayId(Integer payId) {
        this.payId = payId;
    }

    public Integer getBackTime() {
        return backTime;
    }

    public void setBackTime(Integer backTime) {
        this.backTime = backTime;
    }

    public Integer getShippingTime() {
        return shippingTime;
    }

    public void setShippingTime(Integer shippingTime) {
        this.shippingTime = shippingTime;
    }

    public Integer getComfirmTime() {
        return comfirmTime;
    }

    public void setComfirmTime(Integer comfirmTime) {
        this.comfirmTime = comfirmTime;
    }

    public Integer getBackType() {
        return backType;
    }

    public void setBackType(Integer backType) {
        this.backType = backType;
    }

    public Integer getBackShippingAddtime() {
        return backShippingAddtime;
    }

    public void setBackShippingAddtime(Integer backShippingAddtime) {
        this.backShippingAddtime = backShippingAddtime;
    }

    public String getBackShippingCode() {
        return backShippingCode;
    }

    public void setBackShippingCode(String backShippingCode) {
        this.backShippingCode = backShippingCode;
    }

    public String getBackShippingId() {
        return backShippingId;
    }

    public void setBackShippingId(String backShippingId) {
        this.backShippingId = backShippingId;
    }

    public String getBackAddress() {
        return backAddress;
    }

    public void setBackAddress(String backAddress) {
        this.backAddress = backAddress;
    }

    public BigDecimal getBackFee() {
        return backFee;
    }

    public void setBackFee(BigDecimal backFee) {
        this.backFee = backFee;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Integer getBiaozhu() {
        return biaozhu;
    }

    public void setBiaozhu(Integer biaozhu) {
        this.biaozhu = biaozhu;
    }

    public String getContentBack() {
        return contentBack;
    }

    public void setContentBack(String contentBack) {
        this.contentBack = contentBack;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getApp() {
        return app;
    }

    public void setApp(String app) {
        this.app = app;
    }

    public Integer getBusinessId() {
        return businessId;
    }

    public void setBusinessId(Integer businessId) {
        this.businessId = businessId;
    }

    public Integer getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(Integer scheduleId) {
        this.scheduleId = scheduleId;
    }

    public Integer getServiceShopId() {
        return serviceShopId;
    }

    public void setServiceShopId(Integer serviceShopId) {
        this.serviceShopId = serviceShopId;
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public String getScheduleDate() {
        return scheduleDate;
    }

    public void setScheduleDate(String scheduleDate) {
        this.scheduleDate = scheduleDate;
    }

    public String getScheduleTimepart() {
        return scheduleTimepart;
    }

    public void setScheduleTimepart(String scheduleTimepart) {
        this.scheduleTimepart = scheduleTimepart;
    }

    public String getScheduleTimepartArr() {
        return scheduleTimepartArr;
    }

    public void setScheduleTimepartArr(String scheduleTimepartArr) {
        this.scheduleTimepartArr = scheduleTimepartArr;
    }

    public Byte getServiceStatus() {
        return serviceStatus;
    }

    public void setServiceStatus(Byte serviceStatus) {
        this.serviceStatus = serviceStatus;
    }

    public Integer getServiceType() {
        return serviceType;
    }

    public void setServiceType(Integer serviceType) {
        this.serviceType = serviceType;
    }

    public Integer getFoodStatus() {
        return foodStatus;
    }

    public void setFoodStatus(Integer foodStatus) {
        this.foodStatus = foodStatus;
    }

    public Integer getTuangouUserId() {
        return tuangouUserId;
    }

    public void setTuangouUserId(Integer tuangouUserId) {
        this.tuangouUserId = tuangouUserId;
    }

    public Integer getTuangouAddtime() {
        return tuangouAddtime;
    }

    public void setTuangouAddtime(Integer tuangouAddtime) {
        this.tuangouAddtime = tuangouAddtime;
    }

    public Integer getTuangouShopId() {
        return tuangouShopId;
    }

    public void setTuangouShopId(Integer tuangouShopId) {
        this.tuangouShopId = tuangouShopId;
    }

    public Integer getWxId() {
        return wxId;
    }

    public void setWxId(Integer wxId) {
        this.wxId = wxId;
    }

    public Integer getUserDel() {
        return userDel;
    }

    public void setUserDel(Integer userDel) {
        this.userDel = userDel;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getUserCouponIdStr() {
        return userCouponIdStr;
    }

    public void setUserCouponIdStr(String userCouponIdStr) {
        this.userCouponIdStr = userCouponIdStr;
    }

    public Integer getPayStyle() {
        return payStyle;
    }

    public void setPayStyle(Integer payStyle) {
        this.payStyle = payStyle;
    }

    public Integer getPayTime() {
        return payTime;
    }

    public void setPayTime(Integer payTime) {
        this.payTime = payTime;
    }

    public Integer getCommentTime() {
        return commentTime;
    }

    public void setCommentTime(Integer commentTime) {
        this.commentTime = commentTime;
    }

    public Byte getCommentStatus() {
        return commentStatus;
    }

    public void setCommentStatus(Byte commentStatus) {
        this.commentStatus = commentStatus;
    }

    public Integer getAddShopLog() {
        return addShopLog;
    }

    public void setAddShopLog(Integer addShopLog) {
        this.addShopLog = addShopLog;
    }

    public Integer getAddDailiLog() {
        return addDailiLog;
    }

    public void setAddDailiLog(Integer addDailiLog) {
        this.addDailiLog = addDailiLog;
    }

    public Integer getAddZhaoshangLog() {
        return addZhaoshangLog;
    }

    public void setAddZhaoshangLog(Integer addZhaoshangLog) {
        this.addZhaoshangLog = addZhaoshangLog;
    }

    public Integer getAddMemberLog() {
        return addMemberLog;
    }

    public void setAddMemberLog(Integer addMemberLog) {
        this.addMemberLog = addMemberLog;
    }

    public String getCouponIdStr() {
        return couponIdStr;
    }

    public void setCouponIdStr(String couponIdStr) {
        this.couponIdStr = couponIdStr;
    }

    public Integer getDay() {
        return day;
    }

    public void setDay(Integer day) {
        this.day = day;
    }

    public Integer getAddtime() {
        return addtime;
    }

    public void setAddtime(Integer addtime) {
        this.addtime = addtime;
    }

    public Integer getIsZhongchou() {
        return isZhongchou;
    }

    public void setIsZhongchou(Integer isZhongchou) {
        this.isZhongchou = isZhongchou;
    }

    public Integer getIsPintuan() {
        return isPintuan;
    }

    public void setIsPintuan(Integer isPintuan) {
        this.isPintuan = isPintuan;
    }

    public Integer getPintuanId() {
        return pintuanId;
    }

    public void setPintuanId(Integer pintuanId) {
        this.pintuanId = pintuanId;
    }

    public Integer getPintuanStatus() {
        return pintuanStatus;
    }

    public void setPintuanStatus(Integer pintuanStatus) {
        this.pintuanStatus = pintuanStatus;
    }

    public String getPintuanApp() {
        return pintuanApp;
    }

    public void setPintuanApp(String pintuanApp) {
        this.pintuanApp = pintuanApp;
    }

    public Integer getPintuanEndtime() {
        return pintuanEndtime;
    }

    public void setPintuanEndtime(Integer pintuanEndtime) {
        this.pintuanEndtime = pintuanEndtime;
    }

    public Integer getPintuanType() {
        return pintuanType;
    }

    public void setPintuanType(Integer pintuanType) {
        this.pintuanType = pintuanType;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getParams() {
        return params;
    }

    public void setParams(String params) {
        this.params = params;
    }

    public BigDecimal getVipZhekou() {
        return vipZhekou;
    }

    public void setVipZhekou(BigDecimal vipZhekou) {
        this.vipZhekou = vipZhekou;
    }

    public Integer getChildId() {
        return childId;
    }

    public void setChildId(Integer childId) {
        this.childId = childId;
    }

    public String getServiceCardNum() {
        return serviceCardNum;
    }

    public void setServiceCardNum(String serviceCardNum) {
        this.serviceCardNum = serviceCardNum;
    }

    public Integer getIsService() {
        return isService;
    }

    public void setIsService(Integer isService) {
        this.isService = isService;
    }

    public Byte getIsDaifa() {
        return isDaifa;
    }

    public void setIsDaifa(Byte isDaifa) {
        this.isDaifa = isDaifa;
    }

    public Integer getDaifaAddress() {
        return daifaAddress;
    }

    public void setDaifaAddress(Integer daifaAddress) {
        this.daifaAddress = daifaAddress;
    }

    public Byte getIsInvoice() {
        return isInvoice;
    }

    public void setIsInvoice(Byte isInvoice) {
        this.isInvoice = isInvoice;
    }

    public Integer getGivePointsAll() {
        return givePointsAll;
    }

    public void setGivePointsAll(Integer givePointsAll) {
        this.givePointsAll = givePointsAll;
    }

    public Integer getUsePoints() {
        return usePoints;
    }

    public void setUsePoints(Integer usePoints) {
        this.usePoints = usePoints;
    }

    public String getIsUsePoints() {
        return isUsePoints;
    }

    public void setIsUsePoints(String isUsePoints) {
        this.isUsePoints = isUsePoints;
    }

    public BigDecimal getPointsFee() {
        return pointsFee;
    }

    public void setPointsFee(BigDecimal pointsFee) {
        this.pointsFee = pointsFee;
    }

    public Integer getGiftId() {
        return giftId;
    }

    public void setGiftId(Integer giftId) {
        this.giftId = giftId;
    }

    public String getIccid() {
        return iccid;
    }

    public void setIccid(String iccid) {
        this.iccid = iccid;
    }

    public Integer getKuaidiType() {
        return kuaidiType;
    }

    public void setKuaidiType(Integer kuaidiType) {
        this.kuaidiType = kuaidiType;
    }

    public Integer getSaleAccountId() {
        return saleAccountId;
    }

    public void setSaleAccountId(Integer saleAccountId) {
        this.saleAccountId = saleAccountId;
    }

    public Integer getFromUserId() {
        return fromUserId;
    }

    public void setFromUserId(Integer fromUserId) {
        this.fromUserId = fromUserId;
    }

    public Integer getFromShopId() {
        return fromShopId;
    }

    public void setFromShopId(Integer fromShopId) {
        this.fromShopId = fromShopId;
    }

    public Integer getIsSelfStatus() {
        return isSelfStatus;
    }

    public void setIsSelfStatus(Integer isSelfStatus) {
        this.isSelfStatus = isSelfStatus;
    }

    public Integer getGoodsPintuanId() {
        return goodsPintuanId;
    }

    public void setGoodsPintuanId(Integer goodsPintuanId) {
        this.goodsPintuanId = goodsPintuanId;
    }

    public Short getIsYuncangFrom() {
        return isYuncangFrom;
    }

    public void setIsYuncangFrom(Short isYuncangFrom) {
        this.isYuncangFrom = isYuncangFrom;
    }

    public Short getIsYuncang() {
        return isYuncang;
    }

    public void setIsYuncang(Short isYuncang) {
        this.isYuncang = isYuncang;
    }

    public Short getIsSign() {
        return isSign;
    }

    public void setIsSign(Short isSign) {
        this.isSign = isSign;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBackEndContentPingtai() {
        return backEndContentPingtai;
    }

    public void setBackEndContentPingtai(String backEndContentPingtai) {
        this.backEndContentPingtai = backEndContentPingtai;
    }

    public String getWeixinOrderSn() {
        return weixinOrderSn;
    }

    public void setWeixinOrderSn(String weixinOrderSn) {
        this.weixinOrderSn = weixinOrderSn;
    }

    public String getParamsBooking() {
        return paramsBooking;
    }

    public void setParamsBooking(String paramsBooking) {
        this.paramsBooking = paramsBooking;
    }

    public String getParamsYanguang() {
        return paramsYanguang;
    }

    public void setParamsYanguang(String paramsYanguang) {
        this.paramsYanguang = paramsYanguang;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", orderId=").append(orderId);
        sb.append(", orderSn=").append(orderSn);
        sb.append(", backOrderSn=").append(backOrderSn);
        sb.append(", transactionId=").append(transactionId);
        sb.append(", userId=").append(userId);
        sb.append(", addressName=").append(addressName);
        sb.append(", addressPhone=").append(addressPhone);
        sb.append(", addressId=").append(addressId);
        sb.append(", addressProvinceId=").append(addressProvinceId);
        sb.append(", addressCityId=").append(addressCityId);
        sb.append(", addressAreaId=").append(addressAreaId);
        sb.append(", addressStreetId=").append(addressStreetId);
        sb.append(", addressParams=").append(addressParams);
        sb.append(", shippingFee=").append(shippingFee);
        sb.append(", goodsFee=").append(goodsFee);
        sb.append(", totalFee=").append(totalFee);
        sb.append(", payFee=").append(payFee);
        sb.append(", payBeizhu=").append(payBeizhu);
        sb.append(", realFee=").append(realFee);
        sb.append(", disFee=").append(disFee);
        sb.append(", discountFee=").append(discountFee);
        sb.append(", accountFee=").append(accountFee);
        sb.append(", shuidianFee=").append(shuidianFee);
        sb.append(", discountFeeParams=").append(discountFeeParams);
        sb.append(", pointFee=").append(pointFee);
        sb.append(", teacherFee=").append(teacherFee);
        sb.append(", feeDisForCoupon=").append(feeDisForCoupon);
        sb.append(", couponId=").append(couponId);
        sb.append(", userCouponId=").append(userCouponId);
        sb.append(", shopFee=").append(shopFee);
        sb.append(", shopFeePre=").append(shopFeePre);
        sb.append(", buyGivePoint=").append(buyGivePoint);
        sb.append(", orderStatus=").append(orderStatus);
        sb.append(", successTime=").append(successTime);
        sb.append(", shippingStatus=").append(shippingStatus);
        sb.append(", backEndContent=").append(backEndContent);
        sb.append(", backEnd=").append(backEnd);
        sb.append(", backStatus=").append(backStatus);
        sb.append(", backComfirm=").append(backComfirm);
        sb.append(", backComfirmTime=").append(backComfirmTime);
        sb.append(", backFrom=").append(backFrom);
        sb.append(", giftStatus=").append(giftStatus);
        sb.append(", payStatus=").append(payStatus);
        sb.append(", paytime=").append(paytime);
        sb.append(", comfirmStauts=").append(comfirmStauts);
        sb.append(", tuangouStatus=").append(tuangouStatus);
        sb.append(", isReal=").append(isReal);
        sb.append(", isTuangou=").append(isTuangou);
        sb.append(", shippingCode=").append(shippingCode);
        sb.append(", shippingId=").append(shippingId);
        sb.append(", shippingSn=").append(shippingSn);
        sb.append(", payId=").append(payId);
        sb.append(", backTime=").append(backTime);
        sb.append(", shippingTime=").append(shippingTime);
        sb.append(", comfirmTime=").append(comfirmTime);
        sb.append(", backType=").append(backType);
        sb.append(", backShippingAddtime=").append(backShippingAddtime);
        sb.append(", backShippingCode=").append(backShippingCode);
        sb.append(", backShippingId=").append(backShippingId);
        sb.append(", backAddress=").append(backAddress);
        sb.append(", backFee=").append(backFee);
        sb.append(", action=").append(action);
        sb.append(", msg=").append(msg);
        sb.append(", biaozhu=").append(biaozhu);
        sb.append(", contentBack=").append(contentBack);
        sb.append(", content=").append(content);
        sb.append(", type=").append(type);
        sb.append(", app=").append(app);
        sb.append(", businessId=").append(businessId);
        sb.append(", scheduleId=").append(scheduleId);
        sb.append(", serviceShopId=").append(serviceShopId);
        sb.append(", teacherId=").append(teacherId);
        sb.append(", scheduleDate=").append(scheduleDate);
        sb.append(", scheduleTimepart=").append(scheduleTimepart);
        sb.append(", scheduleTimepartArr=").append(scheduleTimepartArr);
        sb.append(", serviceStatus=").append(serviceStatus);
        sb.append(", serviceType=").append(serviceType);
        sb.append(", foodStatus=").append(foodStatus);
        sb.append(", tuangouUserId=").append(tuangouUserId);
        sb.append(", tuangouAddtime=").append(tuangouAddtime);
        sb.append(", tuangouShopId=").append(tuangouShopId);
        sb.append(", wxId=").append(wxId);
        sb.append(", userDel=").append(userDel);
        sb.append(", amount=").append(amount);
        sb.append(", userCouponIdStr=").append(userCouponIdStr);
        sb.append(", payStyle=").append(payStyle);
        sb.append(", payTime=").append(payTime);
        sb.append(", commentTime=").append(commentTime);
        sb.append(", commentStatus=").append(commentStatus);
        sb.append(", addShopLog=").append(addShopLog);
        sb.append(", addDailiLog=").append(addDailiLog);
        sb.append(", addZhaoshangLog=").append(addZhaoshangLog);
        sb.append(", addMemberLog=").append(addMemberLog);
        sb.append(", couponIdStr=").append(couponIdStr);
        sb.append(", day=").append(day);
        sb.append(", addtime=").append(addtime);
        sb.append(", isZhongchou=").append(isZhongchou);
        sb.append(", isPintuan=").append(isPintuan);
        sb.append(", pintuanId=").append(pintuanId);
        sb.append(", pintuanStatus=").append(pintuanStatus);
        sb.append(", pintuanApp=").append(pintuanApp);
        sb.append(", pintuanEndtime=").append(pintuanEndtime);
        sb.append(", pintuanType=").append(pintuanType);
        sb.append(", goodsId=").append(goodsId);
        sb.append(", params=").append(params);
        sb.append(", vipZhekou=").append(vipZhekou);
        sb.append(", childId=").append(childId);
        sb.append(", serviceCardNum=").append(serviceCardNum);
        sb.append(", isService=").append(isService);
        sb.append(", isDaifa=").append(isDaifa);
        sb.append(", daifaAddress=").append(daifaAddress);
        sb.append(", isInvoice=").append(isInvoice);
        sb.append(", givePointsAll=").append(givePointsAll);
        sb.append(", usePoints=").append(usePoints);
        sb.append(", isUsePoints=").append(isUsePoints);
        sb.append(", pointsFee=").append(pointsFee);
        sb.append(", giftId=").append(giftId);
        sb.append(", iccid=").append(iccid);
        sb.append(", kuaidiType=").append(kuaidiType);
        sb.append(", saleAccountId=").append(saleAccountId);
        sb.append(", fromUserId=").append(fromUserId);
        sb.append(", fromShopId=").append(fromShopId);
        sb.append(", isSelfStatus=").append(isSelfStatus);
        sb.append(", goodsPintuanId=").append(goodsPintuanId);
        sb.append(", isYuncangFrom=").append(isYuncangFrom);
        sb.append(", isYuncang=").append(isYuncang);
        sb.append(", isSign=").append(isSign);
        sb.append(", address=").append(address);
        sb.append(", backEndContentPingtai=").append(backEndContentPingtai);
        sb.append(", weixinOrderSn=").append(weixinOrderSn);
        sb.append(", paramsBooking=").append(paramsBooking);
        sb.append(", paramsYanguang=").append(paramsYanguang);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
