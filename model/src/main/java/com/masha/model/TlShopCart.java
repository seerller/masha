package com.masha.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;

public class TlShopCart implements Serializable {
    private Integer cartId;

    private Integer userId;

    private Integer type;

    private Integer goodsId;

    private Integer amount;

    private BigDecimal price;

    private Integer pointPrice;

    @ApiModelProperty(value = "get_buy_give_point")
    private Integer buyGivePoint;

    private String attr;

    private Short status;

    private String addtime;

    private String goodsSn;

    @ApiModelProperty(value = "0  不是 1 是")
    private Integer isPintuan;

    @ApiModelProperty(value = "拼团ID")
    private Integer pintuanId;

    @ApiModelProperty(value = "商家id")
    private Integer shopId;

    private Integer warehouseId;

    private Integer isZhongchou;

    private Integer isMiaosha;

    @ApiModelProperty(value = "是否试用装")
    private Integer isShiyong;

    private Integer isPoint;

    private static final long serialVersionUID = 1L;

    public Integer getCartId() {
        return cartId;
    }

    public void setCartId(Integer cartId) {
        this.cartId = cartId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getPointPrice() {
        return pointPrice;
    }

    public void setPointPrice(Integer pointPrice) {
        this.pointPrice = pointPrice;
    }

    public Integer getBuyGivePoint() {
        return buyGivePoint;
    }

    public void setBuyGivePoint(Integer buyGivePoint) {
        this.buyGivePoint = buyGivePoint;
    }

    public String getAttr() {
        return attr;
    }

    public void setAttr(String attr) {
        this.attr = attr;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public String getAddtime() {
        return addtime;
    }

    public void setAddtime(String addtime) {
        this.addtime = addtime;
    }

    public String getGoodsSn() {
        return goodsSn;
    }

    public void setGoodsSn(String goodsSn) {
        this.goodsSn = goodsSn;
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

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public Integer getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(Integer warehouseId) {
        this.warehouseId = warehouseId;
    }

    public Integer getIsZhongchou() {
        return isZhongchou;
    }

    public void setIsZhongchou(Integer isZhongchou) {
        this.isZhongchou = isZhongchou;
    }

    public Integer getIsMiaosha() {
        return isMiaosha;
    }

    public void setIsMiaosha(Integer isMiaosha) {
        this.isMiaosha = isMiaosha;
    }

    public Integer getIsShiyong() {
        return isShiyong;
    }

    public void setIsShiyong(Integer isShiyong) {
        this.isShiyong = isShiyong;
    }

    public Integer getIsPoint() {
        return isPoint;
    }

    public void setIsPoint(Integer isPoint) {
        this.isPoint = isPoint;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", cartId=").append(cartId);
        sb.append(", userId=").append(userId);
        sb.append(", type=").append(type);
        sb.append(", goodsId=").append(goodsId);
        sb.append(", amount=").append(amount);
        sb.append(", price=").append(price);
        sb.append(", pointPrice=").append(pointPrice);
        sb.append(", buyGivePoint=").append(buyGivePoint);
        sb.append(", attr=").append(attr);
        sb.append(", status=").append(status);
        sb.append(", addtime=").append(addtime);
        sb.append(", goodsSn=").append(goodsSn);
        sb.append(", isPintuan=").append(isPintuan);
        sb.append(", pintuanId=").append(pintuanId);
        sb.append(", shopId=").append(shopId);
        sb.append(", warehouseId=").append(warehouseId);
        sb.append(", isZhongchou=").append(isZhongchou);
        sb.append(", isMiaosha=").append(isMiaosha);
        sb.append(", isShiyong=").append(isShiyong);
        sb.append(", isPoint=").append(isPoint);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}