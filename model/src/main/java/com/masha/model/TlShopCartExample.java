package com.masha.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class TlShopCartExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TlShopCartExample() {
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

        public Criteria andCartIdIsNull() {
            addCriterion("cart_id is null");
            return (Criteria) this;
        }

        public Criteria andCartIdIsNotNull() {
            addCriterion("cart_id is not null");
            return (Criteria) this;
        }

        public Criteria andCartIdEqualTo(Integer value) {
            addCriterion("cart_id =", value, "cartId");
            return (Criteria) this;
        }

        public Criteria andCartIdNotEqualTo(Integer value) {
            addCriterion("cart_id <>", value, "cartId");
            return (Criteria) this;
        }

        public Criteria andCartIdGreaterThan(Integer value) {
            addCriterion("cart_id >", value, "cartId");
            return (Criteria) this;
        }

        public Criteria andCartIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("cart_id >=", value, "cartId");
            return (Criteria) this;
        }

        public Criteria andCartIdLessThan(Integer value) {
            addCriterion("cart_id <", value, "cartId");
            return (Criteria) this;
        }

        public Criteria andCartIdLessThanOrEqualTo(Integer value) {
            addCriterion("cart_id <=", value, "cartId");
            return (Criteria) this;
        }

        public Criteria andCartIdIn(List<Integer> values) {
            addCriterion("cart_id in", values, "cartId");
            return (Criteria) this;
        }

        public Criteria andCartIdNotIn(List<Integer> values) {
            addCriterion("cart_id not in", values, "cartId");
            return (Criteria) this;
        }

        public Criteria andCartIdBetween(Integer value1, Integer value2) {
            addCriterion("cart_id between", value1, value2, "cartId");
            return (Criteria) this;
        }

        public Criteria andCartIdNotBetween(Integer value1, Integer value2) {
            addCriterion("cart_id not between", value1, value2, "cartId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("type not between", value1, value2, "type");
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

        public Criteria andPriceEqualTo(BigDecimal value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(BigDecimal value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(BigDecimal value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(BigDecimal value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<BigDecimal> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<BigDecimal> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPointPriceIsNull() {
            addCriterion("point_price is null");
            return (Criteria) this;
        }

        public Criteria andPointPriceIsNotNull() {
            addCriterion("point_price is not null");
            return (Criteria) this;
        }

        public Criteria andPointPriceEqualTo(Integer value) {
            addCriterion("point_price =", value, "pointPrice");
            return (Criteria) this;
        }

        public Criteria andPointPriceNotEqualTo(Integer value) {
            addCriterion("point_price <>", value, "pointPrice");
            return (Criteria) this;
        }

        public Criteria andPointPriceGreaterThan(Integer value) {
            addCriterion("point_price >", value, "pointPrice");
            return (Criteria) this;
        }

        public Criteria andPointPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("point_price >=", value, "pointPrice");
            return (Criteria) this;
        }

        public Criteria andPointPriceLessThan(Integer value) {
            addCriterion("point_price <", value, "pointPrice");
            return (Criteria) this;
        }

        public Criteria andPointPriceLessThanOrEqualTo(Integer value) {
            addCriterion("point_price <=", value, "pointPrice");
            return (Criteria) this;
        }

        public Criteria andPointPriceIn(List<Integer> values) {
            addCriterion("point_price in", values, "pointPrice");
            return (Criteria) this;
        }

        public Criteria andPointPriceNotIn(List<Integer> values) {
            addCriterion("point_price not in", values, "pointPrice");
            return (Criteria) this;
        }

        public Criteria andPointPriceBetween(Integer value1, Integer value2) {
            addCriterion("point_price between", value1, value2, "pointPrice");
            return (Criteria) this;
        }

        public Criteria andPointPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("point_price not between", value1, value2, "pointPrice");
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

        public Criteria andBuyGivePointEqualTo(Integer value) {
            addCriterion("buy_give_point =", value, "buyGivePoint");
            return (Criteria) this;
        }

        public Criteria andBuyGivePointNotEqualTo(Integer value) {
            addCriterion("buy_give_point <>", value, "buyGivePoint");
            return (Criteria) this;
        }

        public Criteria andBuyGivePointGreaterThan(Integer value) {
            addCriterion("buy_give_point >", value, "buyGivePoint");
            return (Criteria) this;
        }

        public Criteria andBuyGivePointGreaterThanOrEqualTo(Integer value) {
            addCriterion("buy_give_point >=", value, "buyGivePoint");
            return (Criteria) this;
        }

        public Criteria andBuyGivePointLessThan(Integer value) {
            addCriterion("buy_give_point <", value, "buyGivePoint");
            return (Criteria) this;
        }

        public Criteria andBuyGivePointLessThanOrEqualTo(Integer value) {
            addCriterion("buy_give_point <=", value, "buyGivePoint");
            return (Criteria) this;
        }

        public Criteria andBuyGivePointIn(List<Integer> values) {
            addCriterion("buy_give_point in", values, "buyGivePoint");
            return (Criteria) this;
        }

        public Criteria andBuyGivePointNotIn(List<Integer> values) {
            addCriterion("buy_give_point not in", values, "buyGivePoint");
            return (Criteria) this;
        }

        public Criteria andBuyGivePointBetween(Integer value1, Integer value2) {
            addCriterion("buy_give_point between", value1, value2, "buyGivePoint");
            return (Criteria) this;
        }

        public Criteria andBuyGivePointNotBetween(Integer value1, Integer value2) {
            addCriterion("buy_give_point not between", value1, value2, "buyGivePoint");
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

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Short value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Short value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Short value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Short value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Short value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Short> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Short> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Short value1, Short value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Short value1, Short value2) {
            addCriterion("status not between", value1, value2, "status");
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

        public Criteria andIsPintuanIsNull() {
            addCriterion("is_pintuan is null");
            return (Criteria) this;
        }

        public Criteria andIsPintuanIsNotNull() {
            addCriterion("is_pintuan is not null");
            return (Criteria) this;
        }

        public Criteria andIsPintuanEqualTo(Integer value) {
            addCriterion("is_pintuan =", value, "isPintuan");
            return (Criteria) this;
        }

        public Criteria andIsPintuanNotEqualTo(Integer value) {
            addCriterion("is_pintuan <>", value, "isPintuan");
            return (Criteria) this;
        }

        public Criteria andIsPintuanGreaterThan(Integer value) {
            addCriterion("is_pintuan >", value, "isPintuan");
            return (Criteria) this;
        }

        public Criteria andIsPintuanGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_pintuan >=", value, "isPintuan");
            return (Criteria) this;
        }

        public Criteria andIsPintuanLessThan(Integer value) {
            addCriterion("is_pintuan <", value, "isPintuan");
            return (Criteria) this;
        }

        public Criteria andIsPintuanLessThanOrEqualTo(Integer value) {
            addCriterion("is_pintuan <=", value, "isPintuan");
            return (Criteria) this;
        }

        public Criteria andIsPintuanIn(List<Integer> values) {
            addCriterion("is_pintuan in", values, "isPintuan");
            return (Criteria) this;
        }

        public Criteria andIsPintuanNotIn(List<Integer> values) {
            addCriterion("is_pintuan not in", values, "isPintuan");
            return (Criteria) this;
        }

        public Criteria andIsPintuanBetween(Integer value1, Integer value2) {
            addCriterion("is_pintuan between", value1, value2, "isPintuan");
            return (Criteria) this;
        }

        public Criteria andIsPintuanNotBetween(Integer value1, Integer value2) {
            addCriterion("is_pintuan not between", value1, value2, "isPintuan");
            return (Criteria) this;
        }

        public Criteria andPintuanIdIsNull() {
            addCriterion("pintuan_id is null");
            return (Criteria) this;
        }

        public Criteria andPintuanIdIsNotNull() {
            addCriterion("pintuan_id is not null");
            return (Criteria) this;
        }

        public Criteria andPintuanIdEqualTo(Integer value) {
            addCriterion("pintuan_id =", value, "pintuanId");
            return (Criteria) this;
        }

        public Criteria andPintuanIdNotEqualTo(Integer value) {
            addCriterion("pintuan_id <>", value, "pintuanId");
            return (Criteria) this;
        }

        public Criteria andPintuanIdGreaterThan(Integer value) {
            addCriterion("pintuan_id >", value, "pintuanId");
            return (Criteria) this;
        }

        public Criteria andPintuanIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("pintuan_id >=", value, "pintuanId");
            return (Criteria) this;
        }

        public Criteria andPintuanIdLessThan(Integer value) {
            addCriterion("pintuan_id <", value, "pintuanId");
            return (Criteria) this;
        }

        public Criteria andPintuanIdLessThanOrEqualTo(Integer value) {
            addCriterion("pintuan_id <=", value, "pintuanId");
            return (Criteria) this;
        }

        public Criteria andPintuanIdIn(List<Integer> values) {
            addCriterion("pintuan_id in", values, "pintuanId");
            return (Criteria) this;
        }

        public Criteria andPintuanIdNotIn(List<Integer> values) {
            addCriterion("pintuan_id not in", values, "pintuanId");
            return (Criteria) this;
        }

        public Criteria andPintuanIdBetween(Integer value1, Integer value2) {
            addCriterion("pintuan_id between", value1, value2, "pintuanId");
            return (Criteria) this;
        }

        public Criteria andPintuanIdNotBetween(Integer value1, Integer value2) {
            addCriterion("pintuan_id not between", value1, value2, "pintuanId");
            return (Criteria) this;
        }

        public Criteria andShopIdIsNull() {
            addCriterion("shop_id is null");
            return (Criteria) this;
        }

        public Criteria andShopIdIsNotNull() {
            addCriterion("shop_id is not null");
            return (Criteria) this;
        }

        public Criteria andShopIdEqualTo(Integer value) {
            addCriterion("shop_id =", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotEqualTo(Integer value) {
            addCriterion("shop_id <>", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdGreaterThan(Integer value) {
            addCriterion("shop_id >", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("shop_id >=", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdLessThan(Integer value) {
            addCriterion("shop_id <", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdLessThanOrEqualTo(Integer value) {
            addCriterion("shop_id <=", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdIn(List<Integer> values) {
            addCriterion("shop_id in", values, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotIn(List<Integer> values) {
            addCriterion("shop_id not in", values, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdBetween(Integer value1, Integer value2) {
            addCriterion("shop_id between", value1, value2, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotBetween(Integer value1, Integer value2) {
            addCriterion("shop_id not between", value1, value2, "shopId");
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

        public Criteria andIsZhongchouIsNull() {
            addCriterion("is_zhongchou is null");
            return (Criteria) this;
        }

        public Criteria andIsZhongchouIsNotNull() {
            addCriterion("is_zhongchou is not null");
            return (Criteria) this;
        }

        public Criteria andIsZhongchouEqualTo(Integer value) {
            addCriterion("is_zhongchou =", value, "isZhongchou");
            return (Criteria) this;
        }

        public Criteria andIsZhongchouNotEqualTo(Integer value) {
            addCriterion("is_zhongchou <>", value, "isZhongchou");
            return (Criteria) this;
        }

        public Criteria andIsZhongchouGreaterThan(Integer value) {
            addCriterion("is_zhongchou >", value, "isZhongchou");
            return (Criteria) this;
        }

        public Criteria andIsZhongchouGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_zhongchou >=", value, "isZhongchou");
            return (Criteria) this;
        }

        public Criteria andIsZhongchouLessThan(Integer value) {
            addCriterion("is_zhongchou <", value, "isZhongchou");
            return (Criteria) this;
        }

        public Criteria andIsZhongchouLessThanOrEqualTo(Integer value) {
            addCriterion("is_zhongchou <=", value, "isZhongchou");
            return (Criteria) this;
        }

        public Criteria andIsZhongchouIn(List<Integer> values) {
            addCriterion("is_zhongchou in", values, "isZhongchou");
            return (Criteria) this;
        }

        public Criteria andIsZhongchouNotIn(List<Integer> values) {
            addCriterion("is_zhongchou not in", values, "isZhongchou");
            return (Criteria) this;
        }

        public Criteria andIsZhongchouBetween(Integer value1, Integer value2) {
            addCriterion("is_zhongchou between", value1, value2, "isZhongchou");
            return (Criteria) this;
        }

        public Criteria andIsZhongchouNotBetween(Integer value1, Integer value2) {
            addCriterion("is_zhongchou not between", value1, value2, "isZhongchou");
            return (Criteria) this;
        }

        public Criteria andIsMiaoshaIsNull() {
            addCriterion("is_miaosha is null");
            return (Criteria) this;
        }

        public Criteria andIsMiaoshaIsNotNull() {
            addCriterion("is_miaosha is not null");
            return (Criteria) this;
        }

        public Criteria andIsMiaoshaEqualTo(Integer value) {
            addCriterion("is_miaosha =", value, "isMiaosha");
            return (Criteria) this;
        }

        public Criteria andIsMiaoshaNotEqualTo(Integer value) {
            addCriterion("is_miaosha <>", value, "isMiaosha");
            return (Criteria) this;
        }

        public Criteria andIsMiaoshaGreaterThan(Integer value) {
            addCriterion("is_miaosha >", value, "isMiaosha");
            return (Criteria) this;
        }

        public Criteria andIsMiaoshaGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_miaosha >=", value, "isMiaosha");
            return (Criteria) this;
        }

        public Criteria andIsMiaoshaLessThan(Integer value) {
            addCriterion("is_miaosha <", value, "isMiaosha");
            return (Criteria) this;
        }

        public Criteria andIsMiaoshaLessThanOrEqualTo(Integer value) {
            addCriterion("is_miaosha <=", value, "isMiaosha");
            return (Criteria) this;
        }

        public Criteria andIsMiaoshaIn(List<Integer> values) {
            addCriterion("is_miaosha in", values, "isMiaosha");
            return (Criteria) this;
        }

        public Criteria andIsMiaoshaNotIn(List<Integer> values) {
            addCriterion("is_miaosha not in", values, "isMiaosha");
            return (Criteria) this;
        }

        public Criteria andIsMiaoshaBetween(Integer value1, Integer value2) {
            addCriterion("is_miaosha between", value1, value2, "isMiaosha");
            return (Criteria) this;
        }

        public Criteria andIsMiaoshaNotBetween(Integer value1, Integer value2) {
            addCriterion("is_miaosha not between", value1, value2, "isMiaosha");
            return (Criteria) this;
        }

        public Criteria andIsShiyongIsNull() {
            addCriterion("is_shiyong is null");
            return (Criteria) this;
        }

        public Criteria andIsShiyongIsNotNull() {
            addCriterion("is_shiyong is not null");
            return (Criteria) this;
        }

        public Criteria andIsShiyongEqualTo(Integer value) {
            addCriterion("is_shiyong =", value, "isShiyong");
            return (Criteria) this;
        }

        public Criteria andIsShiyongNotEqualTo(Integer value) {
            addCriterion("is_shiyong <>", value, "isShiyong");
            return (Criteria) this;
        }

        public Criteria andIsShiyongGreaterThan(Integer value) {
            addCriterion("is_shiyong >", value, "isShiyong");
            return (Criteria) this;
        }

        public Criteria andIsShiyongGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_shiyong >=", value, "isShiyong");
            return (Criteria) this;
        }

        public Criteria andIsShiyongLessThan(Integer value) {
            addCriterion("is_shiyong <", value, "isShiyong");
            return (Criteria) this;
        }

        public Criteria andIsShiyongLessThanOrEqualTo(Integer value) {
            addCriterion("is_shiyong <=", value, "isShiyong");
            return (Criteria) this;
        }

        public Criteria andIsShiyongIn(List<Integer> values) {
            addCriterion("is_shiyong in", values, "isShiyong");
            return (Criteria) this;
        }

        public Criteria andIsShiyongNotIn(List<Integer> values) {
            addCriterion("is_shiyong not in", values, "isShiyong");
            return (Criteria) this;
        }

        public Criteria andIsShiyongBetween(Integer value1, Integer value2) {
            addCriterion("is_shiyong between", value1, value2, "isShiyong");
            return (Criteria) this;
        }

        public Criteria andIsShiyongNotBetween(Integer value1, Integer value2) {
            addCriterion("is_shiyong not between", value1, value2, "isShiyong");
            return (Criteria) this;
        }

        public Criteria andIsPointIsNull() {
            addCriterion("is_point is null");
            return (Criteria) this;
        }

        public Criteria andIsPointIsNotNull() {
            addCriterion("is_point is not null");
            return (Criteria) this;
        }

        public Criteria andIsPointEqualTo(Integer value) {
            addCriterion("is_point =", value, "isPoint");
            return (Criteria) this;
        }

        public Criteria andIsPointNotEqualTo(Integer value) {
            addCriterion("is_point <>", value, "isPoint");
            return (Criteria) this;
        }

        public Criteria andIsPointGreaterThan(Integer value) {
            addCriterion("is_point >", value, "isPoint");
            return (Criteria) this;
        }

        public Criteria andIsPointGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_point >=", value, "isPoint");
            return (Criteria) this;
        }

        public Criteria andIsPointLessThan(Integer value) {
            addCriterion("is_point <", value, "isPoint");
            return (Criteria) this;
        }

        public Criteria andIsPointLessThanOrEqualTo(Integer value) {
            addCriterion("is_point <=", value, "isPoint");
            return (Criteria) this;
        }

        public Criteria andIsPointIn(List<Integer> values) {
            addCriterion("is_point in", values, "isPoint");
            return (Criteria) this;
        }

        public Criteria andIsPointNotIn(List<Integer> values) {
            addCriterion("is_point not in", values, "isPoint");
            return (Criteria) this;
        }

        public Criteria andIsPointBetween(Integer value1, Integer value2) {
            addCriterion("is_point between", value1, value2, "isPoint");
            return (Criteria) this;
        }

        public Criteria andIsPointNotBetween(Integer value1, Integer value2) {
            addCriterion("is_point not between", value1, value2, "isPoint");
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