package com.masha.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class TlOrderGoodsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TlOrderGoodsExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(Integer value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(Integer value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(Integer value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(Integer value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(Integer value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<Integer> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<Integer> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(Integer value1, Integer value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIsNull() {
            addCriterion("goods_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIsNotNull() {
            addCriterion("goods_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdEqualTo(Integer value) {
            addCriterion("goods_id =", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotEqualTo(Integer value) {
            addCriterion("goods_id <>", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThan(Integer value) {
            addCriterion("goods_id >", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_id >=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThan(Integer value) {
            addCriterion("goods_id <", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThanOrEqualTo(Integer value) {
            addCriterion("goods_id <=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIn(List<Integer> values) {
            addCriterion("goods_id in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotIn(List<Integer> values) {
            addCriterion("goods_id not in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdBetween(Integer value1, Integer value2) {
            addCriterion("goods_id between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_id not between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andAmountIsNull() {
            addCriterion("amount is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("amount is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(Integer value) {
            addCriterion("amount =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(Integer value) {
            addCriterion("amount <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(Integer value) {
            addCriterion("amount >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("amount >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(Integer value) {
            addCriterion("amount <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(Integer value) {
            addCriterion("amount <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<Integer> values) {
            addCriterion("amount in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<Integer> values) {
            addCriterion("amount not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(Integer value1, Integer value2) {
            addCriterion("amount between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("amount not between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(Float value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Float value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Float value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Float value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Float value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Float value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Float> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Float> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Float value1, Float value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Float value1, Float value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andDiscountIsNull() {
            addCriterion("discount is null");
            return (Criteria) this;
        }

        public Criteria andDiscountIsNotNull() {
            addCriterion("discount is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountEqualTo(BigDecimal value) {
            addCriterion("discount =", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotEqualTo(BigDecimal value) {
            addCriterion("discount <>", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountGreaterThan(BigDecimal value) {
            addCriterion("discount >", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("discount >=", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountLessThan(BigDecimal value) {
            addCriterion("discount <", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("discount <=", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountIn(List<BigDecimal> values) {
            addCriterion("discount in", values, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotIn(List<BigDecimal> values) {
            addCriterion("discount not in", values, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("discount between", value1, value2, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("discount not between", value1, value2, "discount");
            return (Criteria) this;
        }

        public Criteria andPointFeeIsNull() {
            addCriterion("point_fee is null");
            return (Criteria) this;
        }

        public Criteria andPointFeeIsNotNull() {
            addCriterion("point_fee is not null");
            return (Criteria) this;
        }

        public Criteria andPointFeeEqualTo(Integer value) {
            addCriterion("point_fee =", value, "pointFee");
            return (Criteria) this;
        }

        public Criteria andPointFeeNotEqualTo(Integer value) {
            addCriterion("point_fee <>", value, "pointFee");
            return (Criteria) this;
        }

        public Criteria andPointFeeGreaterThan(Integer value) {
            addCriterion("point_fee >", value, "pointFee");
            return (Criteria) this;
        }

        public Criteria andPointFeeGreaterThanOrEqualTo(Integer value) {
            addCriterion("point_fee >=", value, "pointFee");
            return (Criteria) this;
        }

        public Criteria andPointFeeLessThan(Integer value) {
            addCriterion("point_fee <", value, "pointFee");
            return (Criteria) this;
        }

        public Criteria andPointFeeLessThanOrEqualTo(Integer value) {
            addCriterion("point_fee <=", value, "pointFee");
            return (Criteria) this;
        }

        public Criteria andPointFeeIn(List<Integer> values) {
            addCriterion("point_fee in", values, "pointFee");
            return (Criteria) this;
        }

        public Criteria andPointFeeNotIn(List<Integer> values) {
            addCriterion("point_fee not in", values, "pointFee");
            return (Criteria) this;
        }

        public Criteria andPointFeeBetween(Integer value1, Integer value2) {
            addCriterion("point_fee between", value1, value2, "pointFee");
            return (Criteria) this;
        }

        public Criteria andPointFeeNotBetween(Integer value1, Integer value2) {
            addCriterion("point_fee not between", value1, value2, "pointFee");
            return (Criteria) this;
        }

        public Criteria andPointGiveIsNull() {
            addCriterion("point_give is null");
            return (Criteria) this;
        }

        public Criteria andPointGiveIsNotNull() {
            addCriterion("point_give is not null");
            return (Criteria) this;
        }

        public Criteria andPointGiveEqualTo(Integer value) {
            addCriterion("point_give =", value, "pointGive");
            return (Criteria) this;
        }

        public Criteria andPointGiveNotEqualTo(Integer value) {
            addCriterion("point_give <>", value, "pointGive");
            return (Criteria) this;
        }

        public Criteria andPointGiveGreaterThan(Integer value) {
            addCriterion("point_give >", value, "pointGive");
            return (Criteria) this;
        }

        public Criteria andPointGiveGreaterThanOrEqualTo(Integer value) {
            addCriterion("point_give >=", value, "pointGive");
            return (Criteria) this;
        }

        public Criteria andPointGiveLessThan(Integer value) {
            addCriterion("point_give <", value, "pointGive");
            return (Criteria) this;
        }

        public Criteria andPointGiveLessThanOrEqualTo(Integer value) {
            addCriterion("point_give <=", value, "pointGive");
            return (Criteria) this;
        }

        public Criteria andPointGiveIn(List<Integer> values) {
            addCriterion("point_give in", values, "pointGive");
            return (Criteria) this;
        }

        public Criteria andPointGiveNotIn(List<Integer> values) {
            addCriterion("point_give not in", values, "pointGive");
            return (Criteria) this;
        }

        public Criteria andPointGiveBetween(Integer value1, Integer value2) {
            addCriterion("point_give between", value1, value2, "pointGive");
            return (Criteria) this;
        }

        public Criteria andPointGiveNotBetween(Integer value1, Integer value2) {
            addCriterion("point_give not between", value1, value2, "pointGive");
            return (Criteria) this;
        }

        public Criteria andBuyGivePointIsNull() {
            addCriterion("buy_give_point is null");
            return (Criteria) this;
        }

        public Criteria andBuyGivePointIsNotNull() {
            addCriterion("buy_give_point is not null");
            return (Criteria) this;
        }

        public Criteria andBuyGivePointEqualTo(Float value) {
            addCriterion("buy_give_point =", value, "buyGivePoint");
            return (Criteria) this;
        }

        public Criteria andBuyGivePointNotEqualTo(Float value) {
            addCriterion("buy_give_point <>", value, "buyGivePoint");
            return (Criteria) this;
        }

        public Criteria andBuyGivePointGreaterThan(Float value) {
            addCriterion("buy_give_point >", value, "buyGivePoint");
            return (Criteria) this;
        }

        public Criteria andBuyGivePointGreaterThanOrEqualTo(Float value) {
            addCriterion("buy_give_point >=", value, "buyGivePoint");
            return (Criteria) this;
        }

        public Criteria andBuyGivePointLessThan(Float value) {
            addCriterion("buy_give_point <", value, "buyGivePoint");
            return (Criteria) this;
        }

        public Criteria andBuyGivePointLessThanOrEqualTo(Float value) {
            addCriterion("buy_give_point <=", value, "buyGivePoint");
            return (Criteria) this;
        }

        public Criteria andBuyGivePointIn(List<Float> values) {
            addCriterion("buy_give_point in", values, "buyGivePoint");
            return (Criteria) this;
        }

        public Criteria andBuyGivePointNotIn(List<Float> values) {
            addCriterion("buy_give_point not in", values, "buyGivePoint");
            return (Criteria) this;
        }

        public Criteria andBuyGivePointBetween(Float value1, Float value2) {
            addCriterion("buy_give_point between", value1, value2, "buyGivePoint");
            return (Criteria) this;
        }

        public Criteria andBuyGivePointNotBetween(Float value1, Float value2) {
            addCriterion("buy_give_point not between", value1, value2, "buyGivePoint");
            return (Criteria) this;
        }

        public Criteria andShippingStatusIsNull() {
            addCriterion("shipping_status is null");
            return (Criteria) this;
        }

        public Criteria andShippingStatusIsNotNull() {
            addCriterion("shipping_status is not null");
            return (Criteria) this;
        }

        public Criteria andShippingStatusEqualTo(Short value) {
            addCriterion("shipping_status =", value, "shippingStatus");
            return (Criteria) this;
        }

        public Criteria andShippingStatusNotEqualTo(Short value) {
            addCriterion("shipping_status <>", value, "shippingStatus");
            return (Criteria) this;
        }

        public Criteria andShippingStatusGreaterThan(Short value) {
            addCriterion("shipping_status >", value, "shippingStatus");
            return (Criteria) this;
        }

        public Criteria andShippingStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("shipping_status >=", value, "shippingStatus");
            return (Criteria) this;
        }

        public Criteria andShippingStatusLessThan(Short value) {
            addCriterion("shipping_status <", value, "shippingStatus");
            return (Criteria) this;
        }

        public Criteria andShippingStatusLessThanOrEqualTo(Short value) {
            addCriterion("shipping_status <=", value, "shippingStatus");
            return (Criteria) this;
        }

        public Criteria andShippingStatusIn(List<Short> values) {
            addCriterion("shipping_status in", values, "shippingStatus");
            return (Criteria) this;
        }

        public Criteria andShippingStatusNotIn(List<Short> values) {
            addCriterion("shipping_status not in", values, "shippingStatus");
            return (Criteria) this;
        }

        public Criteria andShippingStatusBetween(Short value1, Short value2) {
            addCriterion("shipping_status between", value1, value2, "shippingStatus");
            return (Criteria) this;
        }

        public Criteria andShippingStatusNotBetween(Short value1, Short value2) {
            addCriterion("shipping_status not between", value1, value2, "shippingStatus");
            return (Criteria) this;
        }

        public Criteria andBackStatusIsNull() {
            addCriterion("back_status is null");
            return (Criteria) this;
        }

        public Criteria andBackStatusIsNotNull() {
            addCriterion("back_status is not null");
            return (Criteria) this;
        }

        public Criteria andBackStatusEqualTo(Integer value) {
            addCriterion("back_status =", value, "backStatus");
            return (Criteria) this;
        }

        public Criteria andBackStatusNotEqualTo(Integer value) {
            addCriterion("back_status <>", value, "backStatus");
            return (Criteria) this;
        }

        public Criteria andBackStatusGreaterThan(Integer value) {
            addCriterion("back_status >", value, "backStatus");
            return (Criteria) this;
        }

        public Criteria andBackStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("back_status >=", value, "backStatus");
            return (Criteria) this;
        }

        public Criteria andBackStatusLessThan(Integer value) {
            addCriterion("back_status <", value, "backStatus");
            return (Criteria) this;
        }

        public Criteria andBackStatusLessThanOrEqualTo(Integer value) {
            addCriterion("back_status <=", value, "backStatus");
            return (Criteria) this;
        }

        public Criteria andBackStatusIn(List<Integer> values) {
            addCriterion("back_status in", values, "backStatus");
            return (Criteria) this;
        }

        public Criteria andBackStatusNotIn(List<Integer> values) {
            addCriterion("back_status not in", values, "backStatus");
            return (Criteria) this;
        }

        public Criteria andBackStatusBetween(Integer value1, Integer value2) {
            addCriterion("back_status between", value1, value2, "backStatus");
            return (Criteria) this;
        }

        public Criteria andBackStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("back_status not between", value1, value2, "backStatus");
            return (Criteria) this;
        }

        public Criteria andCommentStatusIsNull() {
            addCriterion("comment_status is null");
            return (Criteria) this;
        }

        public Criteria andCommentStatusIsNotNull() {
            addCriterion("comment_status is not null");
            return (Criteria) this;
        }

        public Criteria andCommentStatusEqualTo(Integer value) {
            addCriterion("comment_status =", value, "commentStatus");
            return (Criteria) this;
        }

        public Criteria andCommentStatusNotEqualTo(Integer value) {
            addCriterion("comment_status <>", value, "commentStatus");
            return (Criteria) this;
        }

        public Criteria andCommentStatusGreaterThan(Integer value) {
            addCriterion("comment_status >", value, "commentStatus");
            return (Criteria) this;
        }

        public Criteria andCommentStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("comment_status >=", value, "commentStatus");
            return (Criteria) this;
        }

        public Criteria andCommentStatusLessThan(Integer value) {
            addCriterion("comment_status <", value, "commentStatus");
            return (Criteria) this;
        }

        public Criteria andCommentStatusLessThanOrEqualTo(Integer value) {
            addCriterion("comment_status <=", value, "commentStatus");
            return (Criteria) this;
        }

        public Criteria andCommentStatusIn(List<Integer> values) {
            addCriterion("comment_status in", values, "commentStatus");
            return (Criteria) this;
        }

        public Criteria andCommentStatusNotIn(List<Integer> values) {
            addCriterion("comment_status not in", values, "commentStatus");
            return (Criteria) this;
        }

        public Criteria andCommentStatusBetween(Integer value1, Integer value2) {
            addCriterion("comment_status between", value1, value2, "commentStatus");
            return (Criteria) this;
        }

        public Criteria andCommentStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("comment_status not between", value1, value2, "commentStatus");
            return (Criteria) this;
        }

        public Criteria andCommentTimeIsNull() {
            addCriterion("comment_time is null");
            return (Criteria) this;
        }

        public Criteria andCommentTimeIsNotNull() {
            addCriterion("comment_time is not null");
            return (Criteria) this;
        }

        public Criteria andCommentTimeEqualTo(Integer value) {
            addCriterion("comment_time =", value, "commentTime");
            return (Criteria) this;
        }

        public Criteria andCommentTimeNotEqualTo(Integer value) {
            addCriterion("comment_time <>", value, "commentTime");
            return (Criteria) this;
        }

        public Criteria andCommentTimeGreaterThan(Integer value) {
            addCriterion("comment_time >", value, "commentTime");
            return (Criteria) this;
        }

        public Criteria andCommentTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("comment_time >=", value, "commentTime");
            return (Criteria) this;
        }

        public Criteria andCommentTimeLessThan(Integer value) {
            addCriterion("comment_time <", value, "commentTime");
            return (Criteria) this;
        }

        public Criteria andCommentTimeLessThanOrEqualTo(Integer value) {
            addCriterion("comment_time <=", value, "commentTime");
            return (Criteria) this;
        }

        public Criteria andCommentTimeIn(List<Integer> values) {
            addCriterion("comment_time in", values, "commentTime");
            return (Criteria) this;
        }

        public Criteria andCommentTimeNotIn(List<Integer> values) {
            addCriterion("comment_time not in", values, "commentTime");
            return (Criteria) this;
        }

        public Criteria andCommentTimeBetween(Integer value1, Integer value2) {
            addCriterion("comment_time between", value1, value2, "commentTime");
            return (Criteria) this;
        }

        public Criteria andCommentTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("comment_time not between", value1, value2, "commentTime");
            return (Criteria) this;
        }

        public Criteria andConfirmStatusIsNull() {
            addCriterion("confirm_status is null");
            return (Criteria) this;
        }

        public Criteria andConfirmStatusIsNotNull() {
            addCriterion("confirm_status is not null");
            return (Criteria) this;
        }

        public Criteria andConfirmStatusEqualTo(Byte value) {
            addCriterion("confirm_status =", value, "confirmStatus");
            return (Criteria) this;
        }

        public Criteria andConfirmStatusNotEqualTo(Byte value) {
            addCriterion("confirm_status <>", value, "confirmStatus");
            return (Criteria) this;
        }

        public Criteria andConfirmStatusGreaterThan(Byte value) {
            addCriterion("confirm_status >", value, "confirmStatus");
            return (Criteria) this;
        }

        public Criteria andConfirmStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("confirm_status >=", value, "confirmStatus");
            return (Criteria) this;
        }

        public Criteria andConfirmStatusLessThan(Byte value) {
            addCriterion("confirm_status <", value, "confirmStatus");
            return (Criteria) this;
        }

        public Criteria andConfirmStatusLessThanOrEqualTo(Byte value) {
            addCriterion("confirm_status <=", value, "confirmStatus");
            return (Criteria) this;
        }

        public Criteria andConfirmStatusIn(List<Byte> values) {
            addCriterion("confirm_status in", values, "confirmStatus");
            return (Criteria) this;
        }

        public Criteria andConfirmStatusNotIn(List<Byte> values) {
            addCriterion("confirm_status not in", values, "confirmStatus");
            return (Criteria) this;
        }

        public Criteria andConfirmStatusBetween(Byte value1, Byte value2) {
            addCriterion("confirm_status between", value1, value2, "confirmStatus");
            return (Criteria) this;
        }

        public Criteria andConfirmStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("confirm_status not between", value1, value2, "confirmStatus");
            return (Criteria) this;
        }

        public Criteria andAddtimeIsNull() {
            addCriterion("addtime is null");
            return (Criteria) this;
        }

        public Criteria andAddtimeIsNotNull() {
            addCriterion("addtime is not null");
            return (Criteria) this;
        }

        public Criteria andAddtimeEqualTo(String value) {
            addCriterion("addtime =", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotEqualTo(String value) {
            addCriterion("addtime <>", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeGreaterThan(String value) {
            addCriterion("addtime >", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeGreaterThanOrEqualTo(String value) {
            addCriterion("addtime >=", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeLessThan(String value) {
            addCriterion("addtime <", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeLessThanOrEqualTo(String value) {
            addCriterion("addtime <=", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeLike(String value) {
            addCriterion("addtime like", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotLike(String value) {
            addCriterion("addtime not like", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeIn(List<String> values) {
            addCriterion("addtime in", values, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotIn(List<String> values) {
            addCriterion("addtime not in", values, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeBetween(String value1, String value2) {
            addCriterion("addtime between", value1, value2, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotBetween(String value1, String value2) {
            addCriterion("addtime not between", value1, value2, "addtime");
            return (Criteria) this;
        }

        public Criteria andAttrIsNull() {
            addCriterion("attr is null");
            return (Criteria) this;
        }

        public Criteria andAttrIsNotNull() {
            addCriterion("attr is not null");
            return (Criteria) this;
        }

        public Criteria andAttrEqualTo(String value) {
            addCriterion("attr =", value, "attr");
            return (Criteria) this;
        }

        public Criteria andAttrNotEqualTo(String value) {
            addCriterion("attr <>", value, "attr");
            return (Criteria) this;
        }

        public Criteria andAttrGreaterThan(String value) {
            addCriterion("attr >", value, "attr");
            return (Criteria) this;
        }

        public Criteria andAttrGreaterThanOrEqualTo(String value) {
            addCriterion("attr >=", value, "attr");
            return (Criteria) this;
        }

        public Criteria andAttrLessThan(String value) {
            addCriterion("attr <", value, "attr");
            return (Criteria) this;
        }

        public Criteria andAttrLessThanOrEqualTo(String value) {
            addCriterion("attr <=", value, "attr");
            return (Criteria) this;
        }

        public Criteria andAttrLike(String value) {
            addCriterion("attr like", value, "attr");
            return (Criteria) this;
        }

        public Criteria andAttrNotLike(String value) {
            addCriterion("attr not like", value, "attr");
            return (Criteria) this;
        }

        public Criteria andAttrIn(List<String> values) {
            addCriterion("attr in", values, "attr");
            return (Criteria) this;
        }

        public Criteria andAttrNotIn(List<String> values) {
            addCriterion("attr not in", values, "attr");
            return (Criteria) this;
        }

        public Criteria andAttrBetween(String value1, String value2) {
            addCriterion("attr between", value1, value2, "attr");
            return (Criteria) this;
        }

        public Criteria andAttrNotBetween(String value1, String value2) {
            addCriterion("attr not between", value1, value2, "attr");
            return (Criteria) this;
        }

        public Criteria andGoodsSnIsNull() {
            addCriterion("goods_sn is null");
            return (Criteria) this;
        }

        public Criteria andGoodsSnIsNotNull() {
            addCriterion("goods_sn is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsSnEqualTo(String value) {
            addCriterion("goods_sn =", value, "goodsSn");
            return (Criteria) this;
        }

        public Criteria andGoodsSnNotEqualTo(String value) {
            addCriterion("goods_sn <>", value, "goodsSn");
            return (Criteria) this;
        }

        public Criteria andGoodsSnGreaterThan(String value) {
            addCriterion("goods_sn >", value, "goodsSn");
            return (Criteria) this;
        }

        public Criteria andGoodsSnGreaterThanOrEqualTo(String value) {
            addCriterion("goods_sn >=", value, "goodsSn");
            return (Criteria) this;
        }

        public Criteria andGoodsSnLessThan(String value) {
            addCriterion("goods_sn <", value, "goodsSn");
            return (Criteria) this;
        }

        public Criteria andGoodsSnLessThanOrEqualTo(String value) {
            addCriterion("goods_sn <=", value, "goodsSn");
            return (Criteria) this;
        }

        public Criteria andGoodsSnLike(String value) {
            addCriterion("goods_sn like", value, "goodsSn");
            return (Criteria) this;
        }

        public Criteria andGoodsSnNotLike(String value) {
            addCriterion("goods_sn not like", value, "goodsSn");
            return (Criteria) this;
        }

        public Criteria andGoodsSnIn(List<String> values) {
            addCriterion("goods_sn in", values, "goodsSn");
            return (Criteria) this;
        }

        public Criteria andGoodsSnNotIn(List<String> values) {
            addCriterion("goods_sn not in", values, "goodsSn");
            return (Criteria) this;
        }

        public Criteria andGoodsSnBetween(String value1, String value2) {
            addCriterion("goods_sn between", value1, value2, "goodsSn");
            return (Criteria) this;
        }

        public Criteria andGoodsSnNotBetween(String value1, String value2) {
            addCriterion("goods_sn not between", value1, value2, "goodsSn");
            return (Criteria) this;
        }

        public Criteria andAppIsNull() {
            addCriterion("app is null");
            return (Criteria) this;
        }

        public Criteria andAppIsNotNull() {
            addCriterion("app is not null");
            return (Criteria) this;
        }

        public Criteria andAppEqualTo(String value) {
            addCriterion("app =", value, "app");
            return (Criteria) this;
        }

        public Criteria andAppNotEqualTo(String value) {
            addCriterion("app <>", value, "app");
            return (Criteria) this;
        }

        public Criteria andAppGreaterThan(String value) {
            addCriterion("app >", value, "app");
            return (Criteria) this;
        }

        public Criteria andAppGreaterThanOrEqualTo(String value) {
            addCriterion("app >=", value, "app");
            return (Criteria) this;
        }

        public Criteria andAppLessThan(String value) {
            addCriterion("app <", value, "app");
            return (Criteria) this;
        }

        public Criteria andAppLessThanOrEqualTo(String value) {
            addCriterion("app <=", value, "app");
            return (Criteria) this;
        }

        public Criteria andAppLike(String value) {
            addCriterion("app like", value, "app");
            return (Criteria) this;
        }

        public Criteria andAppNotLike(String value) {
            addCriterion("app not like", value, "app");
            return (Criteria) this;
        }

        public Criteria andAppIn(List<String> values) {
            addCriterion("app in", values, "app");
            return (Criteria) this;
        }

        public Criteria andAppNotIn(List<String> values) {
            addCriterion("app not in", values, "app");
            return (Criteria) this;
        }

        public Criteria andAppBetween(String value1, String value2) {
            addCriterion("app between", value1, value2, "app");
            return (Criteria) this;
        }

        public Criteria andAppNotBetween(String value1, String value2) {
            addCriterion("app not between", value1, value2, "app");
            return (Criteria) this;
        }

        public Criteria andTopicIdIsNull() {
            addCriterion("topic_id is null");
            return (Criteria) this;
        }

        public Criteria andTopicIdIsNotNull() {
            addCriterion("topic_id is not null");
            return (Criteria) this;
        }

        public Criteria andTopicIdEqualTo(Integer value) {
            addCriterion("topic_id =", value, "topicId");
            return (Criteria) this;
        }

        public Criteria andTopicIdNotEqualTo(Integer value) {
            addCriterion("topic_id <>", value, "topicId");
            return (Criteria) this;
        }

        public Criteria andTopicIdGreaterThan(Integer value) {
            addCriterion("topic_id >", value, "topicId");
            return (Criteria) this;
        }

        public Criteria andTopicIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("topic_id >=", value, "topicId");
            return (Criteria) this;
        }

        public Criteria andTopicIdLessThan(Integer value) {
            addCriterion("topic_id <", value, "topicId");
            return (Criteria) this;
        }

        public Criteria andTopicIdLessThanOrEqualTo(Integer value) {
            addCriterion("topic_id <=", value, "topicId");
            return (Criteria) this;
        }

        public Criteria andTopicIdIn(List<Integer> values) {
            addCriterion("topic_id in", values, "topicId");
            return (Criteria) this;
        }

        public Criteria andTopicIdNotIn(List<Integer> values) {
            addCriterion("topic_id not in", values, "topicId");
            return (Criteria) this;
        }

        public Criteria andTopicIdBetween(Integer value1, Integer value2) {
            addCriterion("topic_id between", value1, value2, "topicId");
            return (Criteria) this;
        }

        public Criteria andTopicIdNotBetween(Integer value1, Integer value2) {
            addCriterion("topic_id not between", value1, value2, "topicId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdIsNull() {
            addCriterion("warehouse_id is null");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdIsNotNull() {
            addCriterion("warehouse_id is not null");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdEqualTo(Integer value) {
            addCriterion("warehouse_id =", value, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdNotEqualTo(Integer value) {
            addCriterion("warehouse_id <>", value, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdGreaterThan(Integer value) {
            addCriterion("warehouse_id >", value, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("warehouse_id >=", value, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdLessThan(Integer value) {
            addCriterion("warehouse_id <", value, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdLessThanOrEqualTo(Integer value) {
            addCriterion("warehouse_id <=", value, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdIn(List<Integer> values) {
            addCriterion("warehouse_id in", values, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdNotIn(List<Integer> values) {
            addCriterion("warehouse_id not in", values, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdBetween(Integer value1, Integer value2) {
            addCriterion("warehouse_id between", value1, value2, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdNotBetween(Integer value1, Integer value2) {
            addCriterion("warehouse_id not between", value1, value2, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andKuaidiIdIsNull() {
            addCriterion("kuaidi_id is null");
            return (Criteria) this;
        }

        public Criteria andKuaidiIdIsNotNull() {
            addCriterion("kuaidi_id is not null");
            return (Criteria) this;
        }

        public Criteria andKuaidiIdEqualTo(Integer value) {
            addCriterion("kuaidi_id =", value, "kuaidiId");
            return (Criteria) this;
        }

        public Criteria andKuaidiIdNotEqualTo(Integer value) {
            addCriterion("kuaidi_id <>", value, "kuaidiId");
            return (Criteria) this;
        }

        public Criteria andKuaidiIdGreaterThan(Integer value) {
            addCriterion("kuaidi_id >", value, "kuaidiId");
            return (Criteria) this;
        }

        public Criteria andKuaidiIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("kuaidi_id >=", value, "kuaidiId");
            return (Criteria) this;
        }

        public Criteria andKuaidiIdLessThan(Integer value) {
            addCriterion("kuaidi_id <", value, "kuaidiId");
            return (Criteria) this;
        }

        public Criteria andKuaidiIdLessThanOrEqualTo(Integer value) {
            addCriterion("kuaidi_id <=", value, "kuaidiId");
            return (Criteria) this;
        }

        public Criteria andKuaidiIdIn(List<Integer> values) {
            addCriterion("kuaidi_id in", values, "kuaidiId");
            return (Criteria) this;
        }

        public Criteria andKuaidiIdNotIn(List<Integer> values) {
            addCriterion("kuaidi_id not in", values, "kuaidiId");
            return (Criteria) this;
        }

        public Criteria andKuaidiIdBetween(Integer value1, Integer value2) {
            addCriterion("kuaidi_id between", value1, value2, "kuaidiId");
            return (Criteria) this;
        }

        public Criteria andKuaidiIdNotBetween(Integer value1, Integer value2) {
            addCriterion("kuaidi_id not between", value1, value2, "kuaidiId");
            return (Criteria) this;
        }

        public Criteria andImgIsNull() {
            addCriterion("img is null");
            return (Criteria) this;
        }

        public Criteria andImgIsNotNull() {
            addCriterion("img is not null");
            return (Criteria) this;
        }

        public Criteria andImgEqualTo(String value) {
            addCriterion("img =", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgNotEqualTo(String value) {
            addCriterion("img <>", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgGreaterThan(String value) {
            addCriterion("img >", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgGreaterThanOrEqualTo(String value) {
            addCriterion("img >=", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgLessThan(String value) {
            addCriterion("img <", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgLessThanOrEqualTo(String value) {
            addCriterion("img <=", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgLike(String value) {
            addCriterion("img like", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgNotLike(String value) {
            addCriterion("img not like", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgIn(List<String> values) {
            addCriterion("img in", values, "img");
            return (Criteria) this;
        }

        public Criteria andImgNotIn(List<String> values) {
            addCriterion("img not in", values, "img");
            return (Criteria) this;
        }

        public Criteria andImgBetween(String value1, String value2) {
            addCriterion("img between", value1, value2, "img");
            return (Criteria) this;
        }

        public Criteria andImgNotBetween(String value1, String value2) {
            addCriterion("img not between", value1, value2, "img");
            return (Criteria) this;
        }

        public Criteria andContentIsNull() {
            addCriterion("content is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("content is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("content =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("content <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("content >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("content >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("content <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("content <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("content like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("content not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("content in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("content not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("content between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("content not between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andCommentStarIsNull() {
            addCriterion("comment_star is null");
            return (Criteria) this;
        }

        public Criteria andCommentStarIsNotNull() {
            addCriterion("comment_star is not null");
            return (Criteria) this;
        }

        public Criteria andCommentStarEqualTo(Integer value) {
            addCriterion("comment_star =", value, "commentStar");
            return (Criteria) this;
        }

        public Criteria andCommentStarNotEqualTo(Integer value) {
            addCriterion("comment_star <>", value, "commentStar");
            return (Criteria) this;
        }

        public Criteria andCommentStarGreaterThan(Integer value) {
            addCriterion("comment_star >", value, "commentStar");
            return (Criteria) this;
        }

        public Criteria andCommentStarGreaterThanOrEqualTo(Integer value) {
            addCriterion("comment_star >=", value, "commentStar");
            return (Criteria) this;
        }

        public Criteria andCommentStarLessThan(Integer value) {
            addCriterion("comment_star <", value, "commentStar");
            return (Criteria) this;
        }

        public Criteria andCommentStarLessThanOrEqualTo(Integer value) {
            addCriterion("comment_star <=", value, "commentStar");
            return (Criteria) this;
        }

        public Criteria andCommentStarIn(List<Integer> values) {
            addCriterion("comment_star in", values, "commentStar");
            return (Criteria) this;
        }

        public Criteria andCommentStarNotIn(List<Integer> values) {
            addCriterion("comment_star not in", values, "commentStar");
            return (Criteria) this;
        }

        public Criteria andCommentStarBetween(Integer value1, Integer value2) {
            addCriterion("comment_star between", value1, value2, "commentStar");
            return (Criteria) this;
        }

        public Criteria andCommentStarNotBetween(Integer value1, Integer value2) {
            addCriterion("comment_star not between", value1, value2, "commentStar");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}