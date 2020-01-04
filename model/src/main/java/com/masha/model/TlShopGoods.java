package com.masha.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;

public class TlShopGoods implements Serializable {
    private Integer goodsId;

    @ApiModelProperty(value = "商品货号")
    private String goodsSn;

    @ApiModelProperty(value = "是否云仓商品")
    private Short isYuncang;

    @ApiModelProperty(value = "商品名")
    private String goodsName;

    @ApiModelProperty(value = "小标题")
    private String subTitle;

    @ApiModelProperty(value = "商品名样式")
    private String goodsNameStyle;

    @ApiModelProperty(value = "检索关键字")
    private String keyword;

    @ApiModelProperty(value = "购买次数")
    private Integer countBuy;

    @ApiModelProperty(value = "浏览次数")
    private Integer countView;

    private Integer cateId;

    private Integer homeCate;

    @ApiModelProperty(value = "自定义ID")
    private Integer cateSelfId;

    @ApiModelProperty(value = "品牌id")
    private Short brandId;

    @ApiModelProperty(value = "属性组别ID")
    private Integer attributeCateId;

    @ApiModelProperty(value = "供应商id")
    private String providerId;

    @ApiModelProperty(value = "库存")
    private Integer goodsNumber;

    @ApiModelProperty(value = "重量")
    private BigDecimal goodsWeight;

    @ApiModelProperty(value = "市场价")
    private BigDecimal marketPrice;

    @ApiModelProperty(value = "本店价")
    private BigDecimal shopPrice;

    private BigDecimal shiyongPrice;

    @ApiModelProperty(value = "会员价")
    private BigDecimal vipPrice;

    @ApiModelProperty(value = "批发价")
    private BigDecimal pifaPrice;

    @ApiModelProperty(value = "成本价")
    private BigDecimal costPrice;

    @ApiModelProperty(value = "核算价")
    private BigDecimal calPrice;

    @ApiModelProperty(value = "最高可用白拿券")
    private BigDecimal couponFee;

    @ApiModelProperty(value = "折扣")
    private Integer couponDiscount;

    @ApiModelProperty(value = "1 不限等级，即可浏览")
    private Integer gradeSeeAll;

    @ApiModelProperty(value = "等级ID")
    private String gradeSeeIds;

    @ApiModelProperty(value = "0 不免邮  1免邮")
    private Integer isFreeShippingFee;

    @ApiModelProperty(value = "组成套餐优惠价格")
    private BigDecimal mealPrice;

    @ApiModelProperty(value = "分成金额")
    private BigDecimal disPrice;

    private Integer maxPointPre;

    @ApiModelProperty(value = "最多可以使用积分")
    private Integer maxPoint;

    @ApiModelProperty(value = "促销、特卖价")
    private BigDecimal promotePrice;

    @ApiModelProperty(value = "促销特卖开始时间")
    private Integer promoteStartDate;

    @ApiModelProperty(value = "积分倒计时")
    private Integer pointEndDate;

    @ApiModelProperty(value = "促销特卖结束时间")
    private Integer promoteEndDate;

    @ApiModelProperty(value = "分成金额")
    private BigDecimal commissionMoney;

    @ApiModelProperty(value = "折扣所需数量")
    private String discountNum;

    @ApiModelProperty(value = "折扣金额")
    private BigDecimal discountMoney;

    @ApiModelProperty(value = "分享赠送积分")
    private Integer shareGivePoint;

    @ApiModelProperty(value = "购买赠送流量")
    private Integer buyGivePoint;

    private BigDecimal buyPv;

    @ApiModelProperty(value = "缩略图")
    private String imgThumb;

    @ApiModelProperty(value = "商品原图")
    private String imgOrogin;

    private String imgPromote;

    @ApiModelProperty(value = "简介")
    private String goodsBef;

    @ApiModelProperty(value = "销量")
    private Integer sellNumber;

    @ApiModelProperty(value = "排序")
    private Integer sort;

    private Integer shopSort;

    @ApiModelProperty(value = "限购")
    private String purchase;

    @ApiModelProperty(value = "0 不 1 是")
    private Short isPintuan;

    @ApiModelProperty(value = "0 非众筹 1 是")
    private Short isZhongchou;

    @ApiModelProperty(value = "是否真是商品")
    private Short isReal;

    @ApiModelProperty(value = "抢购")
    private Short isQianggou;

    @ApiModelProperty(value = "是否促销")
    private Short isPromote;

    @ApiModelProperty(value = "是否是秒杀")
    private Short isMiaosha;

    @ApiModelProperty(value = "0 限量团")
    private Short isXiangliang;

    @ApiModelProperty(value = "是否预购")
    private Short isPre;

    @ApiModelProperty(value = "是否热销")
    private Short isHot;

    @ApiModelProperty(value = "0 是否单品团 1 ")
    private Short isDangpin;

    @ApiModelProperty(value = "首页推荐推荐")
    private Short isRecommended;

    @ApiModelProperty(value = "是否积分")
    private Short isPoint;

    @ApiModelProperty(value = "积分商品 所需积分")
    private Integer pointPrice;

    @ApiModelProperty(value = "是否新品")
    private Short isNew;

    @ApiModelProperty(value = "是否具有赠品")
    private Short isHadGift;

    private Short isTra;

    @ApiModelProperty(value = "0 不分销  1 分销")
    private Short isShare;

    @ApiModelProperty(value = "是否砍价")
    private Short isBargain;

    @ApiModelProperty(value = "0 不可以使用 1 可以使用")
    private Short isUserCoupon;

    private Short isDiscount;

    private Short isTuangou;

    @ApiModelProperty(value = "是否是光学")
    private Short isYanguang;

    @ApiModelProperty(value = "最高可抵扣")
    private BigDecimal isUserCouponFee;

    @ApiModelProperty(value = "0 1 眼镜白拿 半价")
    private Short isCoupon50;

    @ApiModelProperty(value = "0 1 眼镜白拿 全免")
    private Short isCoupon100;

    private Short isDaojishituan;

    @ApiModelProperty(value = "1 是光学眼镜")
    private Short isGuangxue;

    @ApiModelProperty(value = "1 预热  2 本期 3 公益")
    private Short zhongchouCateId;

    @ApiModelProperty(value = "是否是 结账系统的商品")
    private Short isPayOnce;

    @ApiModelProperty(value = "双向关联的商品号(逗号隔开)")
    private String twoPush;

    @ApiModelProperty(value = "单向关联的商品号(逗号隔开)")
    private String onePush;

    @ApiModelProperty(value = "赠品的商品号")
    private String giftLists;

    @ApiModelProperty(value = "0为上架1为下架2为过季3为滞销品4为当季5待审核")
    private Short status;

    @ApiModelProperty(value = "允许流量抵扣")
    private Integer buyDeductionPoint;

    @ApiModelProperty(value = "购买赠送分享人")
    private Integer buyGiveSharePoint;

    private Float payLevelLists;

    @ApiModelProperty(value = "评论赠送流量")
    private Integer reviewGivePoint;

    @ApiModelProperty(value = "拼团")
    private String pintuanParams;

    private String params;

    @ApiModelProperty(value = "拼团结束时间")
    private Integer pintuanEndtime;

    private String imgPintuan;

    private Integer shopId;

    @ApiModelProperty(value = "修改时间")
    private Integer edittime;

    private Integer addtime;

    @ApiModelProperty(value = "仓库ID")
    private String warehouseIds;

    private String kuaidiIds;

    @ApiModelProperty(value = "供应商ID")
    private Integer supplierId;

    @ApiModelProperty(value = "供应价")
    private BigDecimal supplyPrice;

    @ApiModelProperty(value = "是否排在前面")
    private Byte isTop;

    private Integer givePoints;

    private Integer clickCount;

    @ApiModelProperty(value = "是否抢购秒杀")
    private Byte isPromoteQm;

    @ApiModelProperty(value = "商品详情二维码")
    private String imgDetail;

    @ApiModelProperty(value = "商品状态 ")
    private String goodsStatus;

    @ApiModelProperty(value = "客服URL")
    private String kfUrl;

    private Integer indextplId;

    @ApiModelProperty(value = "商品介绍、详情")
    private String goodsDes;

    @ApiModelProperty(value = "视频地址")
    private String video;

    private String videoBef;

    private String service;

    private static final long serialVersionUID = 1L;

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsSn() {
        return goodsSn;
    }

    public void setGoodsSn(String goodsSn) {
        this.goodsSn = goodsSn;
    }

    public Short getIsYuncang() {
        return isYuncang;
    }

    public void setIsYuncang(Short isYuncang) {
        this.isYuncang = isYuncang;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public String getGoodsNameStyle() {
        return goodsNameStyle;
    }

    public void setGoodsNameStyle(String goodsNameStyle) {
        this.goodsNameStyle = goodsNameStyle;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public Integer getCountBuy() {
        return countBuy;
    }

    public void setCountBuy(Integer countBuy) {
        this.countBuy = countBuy;
    }

    public Integer getCountView() {
        return countView;
    }

    public void setCountView(Integer countView) {
        this.countView = countView;
    }

    public Integer getCateId() {
        return cateId;
    }

    public void setCateId(Integer cateId) {
        this.cateId = cateId;
    }

    public Integer getHomeCate() {
        return homeCate;
    }

    public void setHomeCate(Integer homeCate) {
        this.homeCate = homeCate;
    }

    public Integer getCateSelfId() {
        return cateSelfId;
    }

    public void setCateSelfId(Integer cateSelfId) {
        this.cateSelfId = cateSelfId;
    }

    public Short getBrandId() {
        return brandId;
    }

    public void setBrandId(Short brandId) {
        this.brandId = brandId;
    }

    public Integer getAttributeCateId() {
        return attributeCateId;
    }

    public void setAttributeCateId(Integer attributeCateId) {
        this.attributeCateId = attributeCateId;
    }

    public String getProviderId() {
        return providerId;
    }

    public void setProviderId(String providerId) {
        this.providerId = providerId;
    }

    public Integer getGoodsNumber() {
        return goodsNumber;
    }

    public void setGoodsNumber(Integer goodsNumber) {
        this.goodsNumber = goodsNumber;
    }

    public BigDecimal getGoodsWeight() {
        return goodsWeight;
    }

    public void setGoodsWeight(BigDecimal goodsWeight) {
        this.goodsWeight = goodsWeight;
    }

    public BigDecimal getMarketPrice() {
        return marketPrice;
    }

    public void setMarketPrice(BigDecimal marketPrice) {
        this.marketPrice = marketPrice;
    }

    public BigDecimal getShopPrice() {
        return shopPrice;
    }

    public void setShopPrice(BigDecimal shopPrice) {
        this.shopPrice = shopPrice;
    }

    public BigDecimal getShiyongPrice() {
        return shiyongPrice;
    }

    public void setShiyongPrice(BigDecimal shiyongPrice) {
        this.shiyongPrice = shiyongPrice;
    }

    public BigDecimal getVipPrice() {
        return vipPrice;
    }

    public void setVipPrice(BigDecimal vipPrice) {
        this.vipPrice = vipPrice;
    }

    public BigDecimal getPifaPrice() {
        return pifaPrice;
    }

    public void setPifaPrice(BigDecimal pifaPrice) {
        this.pifaPrice = pifaPrice;
    }

    public BigDecimal getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(BigDecimal costPrice) {
        this.costPrice = costPrice;
    }

    public BigDecimal getCalPrice() {
        return calPrice;
    }

    public void setCalPrice(BigDecimal calPrice) {
        this.calPrice = calPrice;
    }

    public BigDecimal getCouponFee() {
        return couponFee;
    }

    public void setCouponFee(BigDecimal couponFee) {
        this.couponFee = couponFee;
    }

    public Integer getCouponDiscount() {
        return couponDiscount;
    }

    public void setCouponDiscount(Integer couponDiscount) {
        this.couponDiscount = couponDiscount;
    }

    public Integer getGradeSeeAll() {
        return gradeSeeAll;
    }

    public void setGradeSeeAll(Integer gradeSeeAll) {
        this.gradeSeeAll = gradeSeeAll;
    }

    public String getGradeSeeIds() {
        return gradeSeeIds;
    }

    public void setGradeSeeIds(String gradeSeeIds) {
        this.gradeSeeIds = gradeSeeIds;
    }

    public Integer getIsFreeShippingFee() {
        return isFreeShippingFee;
    }

    public void setIsFreeShippingFee(Integer isFreeShippingFee) {
        this.isFreeShippingFee = isFreeShippingFee;
    }

    public BigDecimal getMealPrice() {
        return mealPrice;
    }

    public void setMealPrice(BigDecimal mealPrice) {
        this.mealPrice = mealPrice;
    }

    public BigDecimal getDisPrice() {
        return disPrice;
    }

    public void setDisPrice(BigDecimal disPrice) {
        this.disPrice = disPrice;
    }

    public Integer getMaxPointPre() {
        return maxPointPre;
    }

    public void setMaxPointPre(Integer maxPointPre) {
        this.maxPointPre = maxPointPre;
    }

    public Integer getMaxPoint() {
        return maxPoint;
    }

    public void setMaxPoint(Integer maxPoint) {
        this.maxPoint = maxPoint;
    }

    public BigDecimal getPromotePrice() {
        return promotePrice;
    }

    public void setPromotePrice(BigDecimal promotePrice) {
        this.promotePrice = promotePrice;
    }

    public Integer getPromoteStartDate() {
        return promoteStartDate;
    }

    public void setPromoteStartDate(Integer promoteStartDate) {
        this.promoteStartDate = promoteStartDate;
    }

    public Integer getPointEndDate() {
        return pointEndDate;
    }

    public void setPointEndDate(Integer pointEndDate) {
        this.pointEndDate = pointEndDate;
    }

    public Integer getPromoteEndDate() {
        return promoteEndDate;
    }

    public void setPromoteEndDate(Integer promoteEndDate) {
        this.promoteEndDate = promoteEndDate;
    }

    public BigDecimal getCommissionMoney() {
        return commissionMoney;
    }

    public void setCommissionMoney(BigDecimal commissionMoney) {
        this.commissionMoney = commissionMoney;
    }

    public String getDiscountNum() {
        return discountNum;
    }

    public void setDiscountNum(String discountNum) {
        this.discountNum = discountNum;
    }

    public BigDecimal getDiscountMoney() {
        return discountMoney;
    }

    public void setDiscountMoney(BigDecimal discountMoney) {
        this.discountMoney = discountMoney;
    }

    public Integer getShareGivePoint() {
        return shareGivePoint;
    }

    public void setShareGivePoint(Integer shareGivePoint) {
        this.shareGivePoint = shareGivePoint;
    }

    public Integer getBuyGivePoint() {
        return buyGivePoint;
    }

    public void setBuyGivePoint(Integer buyGivePoint) {
        this.buyGivePoint = buyGivePoint;
    }

    public BigDecimal getBuyPv() {
        return buyPv;
    }

    public void setBuyPv(BigDecimal buyPv) {
        this.buyPv = buyPv;
    }

    public String getImgThumb() {
        return imgThumb;
    }

    public void setImgThumb(String imgThumb) {
        this.imgThumb = imgThumb;
    }

    public String getImgOrogin() {
        return imgOrogin;
    }

    public void setImgOrogin(String imgOrogin) {
        this.imgOrogin = imgOrogin;
    }

    public String getImgPromote() {
        return imgPromote;
    }

    public void setImgPromote(String imgPromote) {
        this.imgPromote = imgPromote;
    }

    public String getGoodsBef() {
        return goodsBef;
    }

    public void setGoodsBef(String goodsBef) {
        this.goodsBef = goodsBef;
    }

    public Integer getSellNumber() {
        return sellNumber;
    }

    public void setSellNumber(Integer sellNumber) {
        this.sellNumber = sellNumber;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Integer getShopSort() {
        return shopSort;
    }

    public void setShopSort(Integer shopSort) {
        this.shopSort = shopSort;
    }

    public String getPurchase() {
        return purchase;
    }

    public void setPurchase(String purchase) {
        this.purchase = purchase;
    }

    public Short getIsPintuan() {
        return isPintuan;
    }

    public void setIsPintuan(Short isPintuan) {
        this.isPintuan = isPintuan;
    }

    public Short getIsZhongchou() {
        return isZhongchou;
    }

    public void setIsZhongchou(Short isZhongchou) {
        this.isZhongchou = isZhongchou;
    }

    public Short getIsReal() {
        return isReal;
    }

    public void setIsReal(Short isReal) {
        this.isReal = isReal;
    }

    public Short getIsQianggou() {
        return isQianggou;
    }

    public void setIsQianggou(Short isQianggou) {
        this.isQianggou = isQianggou;
    }

    public Short getIsPromote() {
        return isPromote;
    }

    public void setIsPromote(Short isPromote) {
        this.isPromote = isPromote;
    }

    public Short getIsMiaosha() {
        return isMiaosha;
    }

    public void setIsMiaosha(Short isMiaosha) {
        this.isMiaosha = isMiaosha;
    }

    public Short getIsXiangliang() {
        return isXiangliang;
    }

    public void setIsXiangliang(Short isXiangliang) {
        this.isXiangliang = isXiangliang;
    }

    public Short getIsPre() {
        return isPre;
    }

    public void setIsPre(Short isPre) {
        this.isPre = isPre;
    }

    public Short getIsHot() {
        return isHot;
    }

    public void setIsHot(Short isHot) {
        this.isHot = isHot;
    }

    public Short getIsDangpin() {
        return isDangpin;
    }

    public void setIsDangpin(Short isDangpin) {
        this.isDangpin = isDangpin;
    }

    public Short getIsRecommended() {
        return isRecommended;
    }

    public void setIsRecommended(Short isRecommended) {
        this.isRecommended = isRecommended;
    }

    public Short getIsPoint() {
        return isPoint;
    }

    public void setIsPoint(Short isPoint) {
        this.isPoint = isPoint;
    }

    public Integer getPointPrice() {
        return pointPrice;
    }

    public void setPointPrice(Integer pointPrice) {
        this.pointPrice = pointPrice;
    }

    public Short getIsNew() {
        return isNew;
    }

    public void setIsNew(Short isNew) {
        this.isNew = isNew;
    }

    public Short getIsHadGift() {
        return isHadGift;
    }

    public void setIsHadGift(Short isHadGift) {
        this.isHadGift = isHadGift;
    }

    public Short getIsTra() {
        return isTra;
    }

    public void setIsTra(Short isTra) {
        this.isTra = isTra;
    }

    public Short getIsShare() {
        return isShare;
    }

    public void setIsShare(Short isShare) {
        this.isShare = isShare;
    }

    public Short getIsBargain() {
        return isBargain;
    }

    public void setIsBargain(Short isBargain) {
        this.isBargain = isBargain;
    }

    public Short getIsUserCoupon() {
        return isUserCoupon;
    }

    public void setIsUserCoupon(Short isUserCoupon) {
        this.isUserCoupon = isUserCoupon;
    }

    public Short getIsDiscount() {
        return isDiscount;
    }

    public void setIsDiscount(Short isDiscount) {
        this.isDiscount = isDiscount;
    }

    public Short getIsTuangou() {
        return isTuangou;
    }

    public void setIsTuangou(Short isTuangou) {
        this.isTuangou = isTuangou;
    }

    public Short getIsYanguang() {
        return isYanguang;
    }

    public void setIsYanguang(Short isYanguang) {
        this.isYanguang = isYanguang;
    }

    public BigDecimal getIsUserCouponFee() {
        return isUserCouponFee;
    }

    public void setIsUserCouponFee(BigDecimal isUserCouponFee) {
        this.isUserCouponFee = isUserCouponFee;
    }

    public Short getIsCoupon50() {
        return isCoupon50;
    }

    public void setIsCoupon50(Short isCoupon50) {
        this.isCoupon50 = isCoupon50;
    }

    public Short getIsCoupon100() {
        return isCoupon100;
    }

    public void setIsCoupon100(Short isCoupon100) {
        this.isCoupon100 = isCoupon100;
    }

    public Short getIsDaojishituan() {
        return isDaojishituan;
    }

    public void setIsDaojishituan(Short isDaojishituan) {
        this.isDaojishituan = isDaojishituan;
    }

    public Short getIsGuangxue() {
        return isGuangxue;
    }

    public void setIsGuangxue(Short isGuangxue) {
        this.isGuangxue = isGuangxue;
    }

    public Short getZhongchouCateId() {
        return zhongchouCateId;
    }

    public void setZhongchouCateId(Short zhongchouCateId) {
        this.zhongchouCateId = zhongchouCateId;
    }

    public Short getIsPayOnce() {
        return isPayOnce;
    }

    public void setIsPayOnce(Short isPayOnce) {
        this.isPayOnce = isPayOnce;
    }

    public String getTwoPush() {
        return twoPush;
    }

    public void setTwoPush(String twoPush) {
        this.twoPush = twoPush;
    }

    public String getOnePush() {
        return onePush;
    }

    public void setOnePush(String onePush) {
        this.onePush = onePush;
    }

    public String getGiftLists() {
        return giftLists;
    }

    public void setGiftLists(String giftLists) {
        this.giftLists = giftLists;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public Integer getBuyDeductionPoint() {
        return buyDeductionPoint;
    }

    public void setBuyDeductionPoint(Integer buyDeductionPoint) {
        this.buyDeductionPoint = buyDeductionPoint;
    }

    public Integer getBuyGiveSharePoint() {
        return buyGiveSharePoint;
    }

    public void setBuyGiveSharePoint(Integer buyGiveSharePoint) {
        this.buyGiveSharePoint = buyGiveSharePoint;
    }

    public Float getPayLevelLists() {
        return payLevelLists;
    }

    public void setPayLevelLists(Float payLevelLists) {
        this.payLevelLists = payLevelLists;
    }

    public Integer getReviewGivePoint() {
        return reviewGivePoint;
    }

    public void setReviewGivePoint(Integer reviewGivePoint) {
        this.reviewGivePoint = reviewGivePoint;
    }

    public String getPintuanParams() {
        return pintuanParams;
    }

    public void setPintuanParams(String pintuanParams) {
        this.pintuanParams = pintuanParams;
    }

    public String getParams() {
        return params;
    }

    public void setParams(String params) {
        this.params = params;
    }

    public Integer getPintuanEndtime() {
        return pintuanEndtime;
    }

    public void setPintuanEndtime(Integer pintuanEndtime) {
        this.pintuanEndtime = pintuanEndtime;
    }

    public String getImgPintuan() {
        return imgPintuan;
    }

    public void setImgPintuan(String imgPintuan) {
        this.imgPintuan = imgPintuan;
    }

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public Integer getEdittime() {
        return edittime;
    }

    public void setEdittime(Integer edittime) {
        this.edittime = edittime;
    }

    public Integer getAddtime() {
        return addtime;
    }

    public void setAddtime(Integer addtime) {
        this.addtime = addtime;
    }

    public String getWarehouseIds() {
        return warehouseIds;
    }

    public void setWarehouseIds(String warehouseIds) {
        this.warehouseIds = warehouseIds;
    }

    public String getKuaidiIds() {
        return kuaidiIds;
    }

    public void setKuaidiIds(String kuaidiIds) {
        this.kuaidiIds = kuaidiIds;
    }

    public Integer getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Integer supplierId) {
        this.supplierId = supplierId;
    }

    public BigDecimal getSupplyPrice() {
        return supplyPrice;
    }

    public void setSupplyPrice(BigDecimal supplyPrice) {
        this.supplyPrice = supplyPrice;
    }

    public Byte getIsTop() {
        return isTop;
    }

    public void setIsTop(Byte isTop) {
        this.isTop = isTop;
    }

    public Integer getGivePoints() {
        return givePoints;
    }

    public void setGivePoints(Integer givePoints) {
        this.givePoints = givePoints;
    }

    public Integer getClickCount() {
        return clickCount;
    }

    public void setClickCount(Integer clickCount) {
        this.clickCount = clickCount;
    }

    public Byte getIsPromoteQm() {
        return isPromoteQm;
    }

    public void setIsPromoteQm(Byte isPromoteQm) {
        this.isPromoteQm = isPromoteQm;
    }

    public String getImgDetail() {
        return imgDetail;
    }

    public void setImgDetail(String imgDetail) {
        this.imgDetail = imgDetail;
    }

    public String getGoodsStatus() {
        return goodsStatus;
    }

    public void setGoodsStatus(String goodsStatus) {
        this.goodsStatus = goodsStatus;
    }

    public String getKfUrl() {
        return kfUrl;
    }

    public void setKfUrl(String kfUrl) {
        this.kfUrl = kfUrl;
    }

    public Integer getIndextplId() {
        return indextplId;
    }

    public void setIndextplId(Integer indextplId) {
        this.indextplId = indextplId;
    }

    public String getGoodsDes() {
        return goodsDes;
    }

    public void setGoodsDes(String goodsDes) {
        this.goodsDes = goodsDes;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    public String getVideoBef() {
        return videoBef;
    }

    public void setVideoBef(String videoBef) {
        this.videoBef = videoBef;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", goodsId=").append(goodsId);
        sb.append(", goodsSn=").append(goodsSn);
        sb.append(", isYuncang=").append(isYuncang);
        sb.append(", goodsName=").append(goodsName);
        sb.append(", subTitle=").append(subTitle);
        sb.append(", goodsNameStyle=").append(goodsNameStyle);
        sb.append(", keyword=").append(keyword);
        sb.append(", countBuy=").append(countBuy);
        sb.append(", countView=").append(countView);
        sb.append(", cateId=").append(cateId);
        sb.append(", homeCate=").append(homeCate);
        sb.append(", cateSelfId=").append(cateSelfId);
        sb.append(", brandId=").append(brandId);
        sb.append(", attributeCateId=").append(attributeCateId);
        sb.append(", providerId=").append(providerId);
        sb.append(", goodsNumber=").append(goodsNumber);
        sb.append(", goodsWeight=").append(goodsWeight);
        sb.append(", marketPrice=").append(marketPrice);
        sb.append(", shopPrice=").append(shopPrice);
        sb.append(", shiyongPrice=").append(shiyongPrice);
        sb.append(", vipPrice=").append(vipPrice);
        sb.append(", pifaPrice=").append(pifaPrice);
        sb.append(", costPrice=").append(costPrice);
        sb.append(", calPrice=").append(calPrice);
        sb.append(", couponFee=").append(couponFee);
        sb.append(", couponDiscount=").append(couponDiscount);
        sb.append(", gradeSeeAll=").append(gradeSeeAll);
        sb.append(", gradeSeeIds=").append(gradeSeeIds);
        sb.append(", isFreeShippingFee=").append(isFreeShippingFee);
        sb.append(", mealPrice=").append(mealPrice);
        sb.append(", disPrice=").append(disPrice);
        sb.append(", maxPointPre=").append(maxPointPre);
        sb.append(", maxPoint=").append(maxPoint);
        sb.append(", promotePrice=").append(promotePrice);
        sb.append(", promoteStartDate=").append(promoteStartDate);
        sb.append(", pointEndDate=").append(pointEndDate);
        sb.append(", promoteEndDate=").append(promoteEndDate);
        sb.append(", commissionMoney=").append(commissionMoney);
        sb.append(", discountNum=").append(discountNum);
        sb.append(", discountMoney=").append(discountMoney);
        sb.append(", shareGivePoint=").append(shareGivePoint);
        sb.append(", buyGivePoint=").append(buyGivePoint);
        sb.append(", buyPv=").append(buyPv);
        sb.append(", imgThumb=").append(imgThumb);
        sb.append(", imgOrogin=").append(imgOrogin);
        sb.append(", imgPromote=").append(imgPromote);
        sb.append(", goodsBef=").append(goodsBef);
        sb.append(", sellNumber=").append(sellNumber);
        sb.append(", sort=").append(sort);
        sb.append(", shopSort=").append(shopSort);
        sb.append(", purchase=").append(purchase);
        sb.append(", isPintuan=").append(isPintuan);
        sb.append(", isZhongchou=").append(isZhongchou);
        sb.append(", isReal=").append(isReal);
        sb.append(", isQianggou=").append(isQianggou);
        sb.append(", isPromote=").append(isPromote);
        sb.append(", isMiaosha=").append(isMiaosha);
        sb.append(", isXiangliang=").append(isXiangliang);
        sb.append(", isPre=").append(isPre);
        sb.append(", isHot=").append(isHot);
        sb.append(", isDangpin=").append(isDangpin);
        sb.append(", isRecommended=").append(isRecommended);
        sb.append(", isPoint=").append(isPoint);
        sb.append(", pointPrice=").append(pointPrice);
        sb.append(", isNew=").append(isNew);
        sb.append(", isHadGift=").append(isHadGift);
        sb.append(", isTra=").append(isTra);
        sb.append(", isShare=").append(isShare);
        sb.append(", isBargain=").append(isBargain);
        sb.append(", isUserCoupon=").append(isUserCoupon);
        sb.append(", isDiscount=").append(isDiscount);
        sb.append(", isTuangou=").append(isTuangou);
        sb.append(", isYanguang=").append(isYanguang);
        sb.append(", isUserCouponFee=").append(isUserCouponFee);
        sb.append(", isCoupon50=").append(isCoupon50);
        sb.append(", isCoupon100=").append(isCoupon100);
        sb.append(", isDaojishituan=").append(isDaojishituan);
        sb.append(", isGuangxue=").append(isGuangxue);
        sb.append(", zhongchouCateId=").append(zhongchouCateId);
        sb.append(", isPayOnce=").append(isPayOnce);
        sb.append(", twoPush=").append(twoPush);
        sb.append(", onePush=").append(onePush);
        sb.append(", giftLists=").append(giftLists);
        sb.append(", status=").append(status);
        sb.append(", buyDeductionPoint=").append(buyDeductionPoint);
        sb.append(", buyGiveSharePoint=").append(buyGiveSharePoint);
        sb.append(", payLevelLists=").append(payLevelLists);
        sb.append(", reviewGivePoint=").append(reviewGivePoint);
        sb.append(", pintuanParams=").append(pintuanParams);
        sb.append(", params=").append(params);
        sb.append(", pintuanEndtime=").append(pintuanEndtime);
        sb.append(", imgPintuan=").append(imgPintuan);
        sb.append(", shopId=").append(shopId);
        sb.append(", edittime=").append(edittime);
        sb.append(", addtime=").append(addtime);
        sb.append(", warehouseIds=").append(warehouseIds);
        sb.append(", kuaidiIds=").append(kuaidiIds);
        sb.append(", supplierId=").append(supplierId);
        sb.append(", supplyPrice=").append(supplyPrice);
        sb.append(", isTop=").append(isTop);
        sb.append(", givePoints=").append(givePoints);
        sb.append(", clickCount=").append(clickCount);
        sb.append(", isPromoteQm=").append(isPromoteQm);
        sb.append(", imgDetail=").append(imgDetail);
        sb.append(", goodsStatus=").append(goodsStatus);
        sb.append(", kfUrl=").append(kfUrl);
        sb.append(", indextplId=").append(indextplId);
        sb.append(", goodsDes=").append(goodsDes);
        sb.append(", video=").append(video);
        sb.append(", videoBef=").append(videoBef);
        sb.append(", service=").append(service);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}