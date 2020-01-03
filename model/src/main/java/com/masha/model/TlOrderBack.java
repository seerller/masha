package com.masha.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;

public class TlOrderBack implements Serializable {
    private Integer orderBackId;

    private Integer orderId;

    private String orderGoodsId;

    private Float pointFee;

    private BigDecimal moneyFee;

    @ApiModelProperty(value = "退款数量")
    private Integer amount;

    @ApiModelProperty(value = "1 仅退款 2退货退款")
    private Short type;

    private String reason;

    private Integer status;

    @ApiModelProperty(value = "退款次数")
    private Integer backNum;

    private Integer addtime;

    private Integer shopId;

    private String content;

    private static final long serialVersionUID = 1L;

    public Integer getOrderBackId() {
        return orderBackId;
    }

    public void setOrderBackId(Integer orderBackId) {
        this.orderBackId = orderBackId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getOrderGoodsId() {
        return orderGoodsId;
    }

    public void setOrderGoodsId(String orderGoodsId) {
        this.orderGoodsId = orderGoodsId;
    }

    public Float getPointFee() {
        return pointFee;
    }

    public void setPointFee(Float pointFee) {
        this.pointFee = pointFee;
    }

    public BigDecimal getMoneyFee() {
        return moneyFee;
    }

    public void setMoneyFee(BigDecimal moneyFee) {
        this.moneyFee = moneyFee;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Short getType() {
        return type;
    }

    public void setType(Short type) {
        this.type = type;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getBackNum() {
        return backNum;
    }

    public void setBackNum(Integer backNum) {
        this.backNum = backNum;
    }

    public Integer getAddtime() {
        return addtime;
    }

    public void setAddtime(Integer addtime) {
        this.addtime = addtime;
    }

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", orderBackId=").append(orderBackId);
        sb.append(", orderId=").append(orderId);
        sb.append(", orderGoodsId=").append(orderGoodsId);
        sb.append(", pointFee=").append(pointFee);
        sb.append(", moneyFee=").append(moneyFee);
        sb.append(", amount=").append(amount);
        sb.append(", type=").append(type);
        sb.append(", reason=").append(reason);
        sb.append(", status=").append(status);
        sb.append(", backNum=").append(backNum);
        sb.append(", addtime=").append(addtime);
        sb.append(", shopId=").append(shopId);
        sb.append(", content=").append(content);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}