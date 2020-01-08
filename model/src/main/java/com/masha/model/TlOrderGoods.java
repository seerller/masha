package com.masha.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class TlOrderGoods implements Serializable {
    private Integer id;

    private Integer orderId;

    private Integer goodsId;

    private Integer amount;

    private Float price;

    @ApiModelProperty(value = "折扣")
    private BigDecimal discount;

    private Integer pointFee;

    private Integer pointGive;

    @ApiModelProperty(value = "购买赠送流量")
    private Float buyGivePoint;

    private Short shippingStatus;

    @ApiModelProperty(value = "0,无退货 1 退货中 2已退货 ")
    private Integer backStatus;

    @ApiModelProperty(value = "1 评论  2 未评论")
    private Integer commentStatus;

    @ApiModelProperty(value = "评论时间")
    private Integer commentTime;

    private Byte confirmStatus;

    private String addtime;

    private String attr;

    private String goodsSn;

    private String app;

    @ApiModelProperty(value = "对应了bbs_topic_id")
    private Integer topicId;

    private Integer warehouseId;

    private Integer kuaidiId;

    @ApiModelProperty(value = "图片")
    private String img;

    @ApiModelProperty(value = "评论内容")
    private String content;

    @ApiModelProperty(value = "评分")
    private Integer commentStar;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
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

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    public Integer getPointFee() {
        return pointFee;
    }

    public void setPointFee(Integer pointFee) {
        this.pointFee = pointFee;
    }

    public Integer getPointGive() {
        return pointGive;
    }

    public void setPointGive(Integer pointGive) {
        this.pointGive = pointGive;
    }

    public Float getBuyGivePoint() {
        return buyGivePoint;
    }

    public void setBuyGivePoint(Float buyGivePoint) {
        this.buyGivePoint = buyGivePoint;
    }

    public Short getShippingStatus() {
        return shippingStatus;
    }

    public void setShippingStatus(Short shippingStatus) {
        this.shippingStatus = shippingStatus;
    }

    public Integer getBackStatus() {
        return backStatus;
    }

    public void setBackStatus(Integer backStatus) {
        this.backStatus = backStatus;
    }

    public Integer getCommentStatus() {
        return commentStatus;
    }

    public void setCommentStatus(Integer commentStatus) {
        this.commentStatus = commentStatus;
    }

    public Integer getCommentTime() {
        return commentTime;
    }

    public void setCommentTime(Integer commentTime) {
        this.commentTime = commentTime;
    }

    public Byte getConfirmStatus() {
        return confirmStatus;
    }

    public void setConfirmStatus(Byte confirmStatus) {
        this.confirmStatus = confirmStatus;
    }

    public String getAddtime() {
        return addtime;
    }

    public void setAddtime(String addtime) {
        this.addtime = addtime;
    }

    public String getAttr() {
        return attr;
    }

    public void setAttr(String attr) {
        this.attr = attr;
    }

    public String getGoodsSn() {
        return goodsSn;
    }

    public void setGoodsSn(String goodsSn) {
        this.goodsSn = goodsSn;
    }

    public String getApp() {
        return app;
    }

    public void setApp(String app) {
        this.app = app;
    }

    public Integer getTopicId() {
        return topicId;
    }

    public void setTopicId(Integer topicId) {
        this.topicId = topicId;
    }

    public Integer getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(Integer warehouseId) {
        this.warehouseId = warehouseId;
    }

    public Integer getKuaidiId() {
        return kuaidiId;
    }

    public void setKuaidiId(Integer kuaidiId) {
        this.kuaidiId = kuaidiId;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getCommentStar() {
        return commentStar;
    }

    public void setCommentStar(Integer commentStar) {
        this.commentStar = commentStar;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", orderId=").append(orderId);
        sb.append(", goodsId=").append(goodsId);
        sb.append(", amount=").append(amount);
        sb.append(", price=").append(price);
        sb.append(", discount=").append(discount);
        sb.append(", pointFee=").append(pointFee);
        sb.append(", pointGive=").append(pointGive);
        sb.append(", buyGivePoint=").append(buyGivePoint);
        sb.append(", shippingStatus=").append(shippingStatus);
        sb.append(", backStatus=").append(backStatus);
        sb.append(", commentStatus=").append(commentStatus);
        sb.append(", commentTime=").append(commentTime);
        sb.append(", confirmStatus=").append(confirmStatus);
        sb.append(", addtime=").append(addtime);
        sb.append(", attr=").append(attr);
        sb.append(", goodsSn=").append(goodsSn);
        sb.append(", app=").append(app);
        sb.append(", topicId=").append(topicId);
        sb.append(", warehouseId=").append(warehouseId);
        sb.append(", kuaidiId=").append(kuaidiId);
        sb.append(", img=").append(img);
        sb.append(", content=").append(content);
        sb.append(", commentStar=").append(commentStar);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
