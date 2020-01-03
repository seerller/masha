package com.masha.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class TlOrderBackExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TlOrderBackExample() {
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

        public Criteria andOrderBackIdIsNull() {
            addCriterion("order_back_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderBackIdIsNotNull() {
            addCriterion("order_back_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderBackIdEqualTo(Integer value) {
            addCriterion("order_back_id =", value, "orderBackId");
            return (Criteria) this;
        }

        public Criteria andOrderBackIdNotEqualTo(Integer value) {
            addCriterion("order_back_id <>", value, "orderBackId");
            return (Criteria) this;
        }

        public Criteria andOrderBackIdGreaterThan(Integer value) {
            addCriterion("order_back_id >", value, "orderBackId");
            return (Criteria) this;
        }

        public Criteria andOrderBackIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_back_id >=", value, "orderBackId");
            return (Criteria) this;
        }

        public Criteria andOrderBackIdLessThan(Integer value) {
            addCriterion("order_back_id <", value, "orderBackId");
            return (Criteria) this;
        }

        public Criteria andOrderBackIdLessThanOrEqualTo(Integer value) {
            addCriterion("order_back_id <=", value, "orderBackId");
            return (Criteria) this;
        }

        public Criteria andOrderBackIdIn(List<Integer> values) {
            addCriterion("order_back_id in", values, "orderBackId");
            return (Criteria) this;
        }

        public Criteria andOrderBackIdNotIn(List<Integer> values) {
            addCriterion("order_back_id not in", values, "orderBackId");
            return (Criteria) this;
        }

        public Criteria andOrderBackIdBetween(Integer value1, Integer value2) {
            addCriterion("order_back_id between", value1, value2, "orderBackId");
            return (Criteria) this;
        }

        public Criteria andOrderBackIdNotBetween(Integer value1, Integer value2) {
            addCriterion("order_back_id not between", value1, value2, "orderBackId");
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

        public Criteria andOrderGoodsIdIsNull() {
            addCriterion("order_goods_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsIdIsNotNull() {
            addCriterion("order_goods_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsIdEqualTo(String value) {
            addCriterion("order_goods_id =", value, "orderGoodsId");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsIdNotEqualTo(String value) {
            addCriterion("order_goods_id <>", value, "orderGoodsId");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsIdGreaterThan(String value) {
            addCriterion("order_goods_id >", value, "orderGoodsId");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsIdGreaterThanOrEqualTo(String value) {
            addCriterion("order_goods_id >=", value, "orderGoodsId");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsIdLessThan(String value) {
            addCriterion("order_goods_id <", value, "orderGoodsId");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsIdLessThanOrEqualTo(String value) {
            addCriterion("order_goods_id <=", value, "orderGoodsId");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsIdLike(String value) {
            addCriterion("order_goods_id like", value, "orderGoodsId");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsIdNotLike(String value) {
            addCriterion("order_goods_id not like", value, "orderGoodsId");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsIdIn(List<String> values) {
            addCriterion("order_goods_id in", values, "orderGoodsId");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsIdNotIn(List<String> values) {
            addCriterion("order_goods_id not in", values, "orderGoodsId");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsIdBetween(String value1, String value2) {
            addCriterion("order_goods_id between", value1, value2, "orderGoodsId");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsIdNotBetween(String value1, String value2) {
            addCriterion("order_goods_id not between", value1, value2, "orderGoodsId");
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

        public Criteria andPointFeeEqualTo(Float value) {
            addCriterion("point_fee =", value, "pointFee");
            return (Criteria) this;
        }

        public Criteria andPointFeeNotEqualTo(Float value) {
            addCriterion("point_fee <>", value, "pointFee");
            return (Criteria) this;
        }

        public Criteria andPointFeeGreaterThan(Float value) {
            addCriterion("point_fee >", value, "pointFee");
            return (Criteria) this;
        }

        public Criteria andPointFeeGreaterThanOrEqualTo(Float value) {
            addCriterion("point_fee >=", value, "pointFee");
            return (Criteria) this;
        }

        public Criteria andPointFeeLessThan(Float value) {
            addCriterion("point_fee <", value, "pointFee");
            return (Criteria) this;
        }

        public Criteria andPointFeeLessThanOrEqualTo(Float value) {
            addCriterion("point_fee <=", value, "pointFee");
            return (Criteria) this;
        }

        public Criteria andPointFeeIn(List<Float> values) {
            addCriterion("point_fee in", values, "pointFee");
            return (Criteria) this;
        }

        public Criteria andPointFeeNotIn(List<Float> values) {
            addCriterion("point_fee not in", values, "pointFee");
            return (Criteria) this;
        }

        public Criteria andPointFeeBetween(Float value1, Float value2) {
            addCriterion("point_fee between", value1, value2, "pointFee");
            return (Criteria) this;
        }

        public Criteria andPointFeeNotBetween(Float value1, Float value2) {
            addCriterion("point_fee not between", value1, value2, "pointFee");
            return (Criteria) this;
        }

        public Criteria andMoneyFeeIsNull() {
            addCriterion("money_fee is null");
            return (Criteria) this;
        }

        public Criteria andMoneyFeeIsNotNull() {
            addCriterion("money_fee is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyFeeEqualTo(BigDecimal value) {
            addCriterion("money_fee =", value, "moneyFee");
            return (Criteria) this;
        }

        public Criteria andMoneyFeeNotEqualTo(BigDecimal value) {
            addCriterion("money_fee <>", value, "moneyFee");
            return (Criteria) this;
        }

        public Criteria andMoneyFeeGreaterThan(BigDecimal value) {
            addCriterion("money_fee >", value, "moneyFee");
            return (Criteria) this;
        }

        public Criteria andMoneyFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("money_fee >=", value, "moneyFee");
            return (Criteria) this;
        }

        public Criteria andMoneyFeeLessThan(BigDecimal value) {
            addCriterion("money_fee <", value, "moneyFee");
            return (Criteria) this;
        }

        public Criteria andMoneyFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("money_fee <=", value, "moneyFee");
            return (Criteria) this;
        }

        public Criteria andMoneyFeeIn(List<BigDecimal> values) {
            addCriterion("money_fee in", values, "moneyFee");
            return (Criteria) this;
        }

        public Criteria andMoneyFeeNotIn(List<BigDecimal> values) {
            addCriterion("money_fee not in", values, "moneyFee");
            return (Criteria) this;
        }

        public Criteria andMoneyFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("money_fee between", value1, value2, "moneyFee");
            return (Criteria) this;
        }

        public Criteria andMoneyFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("money_fee not between", value1, value2, "moneyFee");
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

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Short value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Short value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Short value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Short value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Short value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Short> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Short> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Short value1, Short value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Short value1, Short value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andReasonIsNull() {
            addCriterion("reason is null");
            return (Criteria) this;
        }

        public Criteria andReasonIsNotNull() {
            addCriterion("reason is not null");
            return (Criteria) this;
        }

        public Criteria andReasonEqualTo(String value) {
            addCriterion("reason =", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotEqualTo(String value) {
            addCriterion("reason <>", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonGreaterThan(String value) {
            addCriterion("reason >", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonGreaterThanOrEqualTo(String value) {
            addCriterion("reason >=", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLessThan(String value) {
            addCriterion("reason <", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLessThanOrEqualTo(String value) {
            addCriterion("reason <=", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLike(String value) {
            addCriterion("reason like", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotLike(String value) {
            addCriterion("reason not like", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonIn(List<String> values) {
            addCriterion("reason in", values, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotIn(List<String> values) {
            addCriterion("reason not in", values, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonBetween(String value1, String value2) {
            addCriterion("reason between", value1, value2, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotBetween(String value1, String value2) {
            addCriterion("reason not between", value1, value2, "reason");
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

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andBackNumIsNull() {
            addCriterion("back_num is null");
            return (Criteria) this;
        }

        public Criteria andBackNumIsNotNull() {
            addCriterion("back_num is not null");
            return (Criteria) this;
        }

        public Criteria andBackNumEqualTo(Integer value) {
            addCriterion("back_num =", value, "backNum");
            return (Criteria) this;
        }

        public Criteria andBackNumNotEqualTo(Integer value) {
            addCriterion("back_num <>", value, "backNum");
            return (Criteria) this;
        }

        public Criteria andBackNumGreaterThan(Integer value) {
            addCriterion("back_num >", value, "backNum");
            return (Criteria) this;
        }

        public Criteria andBackNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("back_num >=", value, "backNum");
            return (Criteria) this;
        }

        public Criteria andBackNumLessThan(Integer value) {
            addCriterion("back_num <", value, "backNum");
            return (Criteria) this;
        }

        public Criteria andBackNumLessThanOrEqualTo(Integer value) {
            addCriterion("back_num <=", value, "backNum");
            return (Criteria) this;
        }

        public Criteria andBackNumIn(List<Integer> values) {
            addCriterion("back_num in", values, "backNum");
            return (Criteria) this;
        }

        public Criteria andBackNumNotIn(List<Integer> values) {
            addCriterion("back_num not in", values, "backNum");
            return (Criteria) this;
        }

        public Criteria andBackNumBetween(Integer value1, Integer value2) {
            addCriterion("back_num between", value1, value2, "backNum");
            return (Criteria) this;
        }

        public Criteria andBackNumNotBetween(Integer value1, Integer value2) {
            addCriterion("back_num not between", value1, value2, "backNum");
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

        public Criteria andAddtimeEqualTo(Integer value) {
            addCriterion("addtime =", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotEqualTo(Integer value) {
            addCriterion("addtime <>", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeGreaterThan(Integer value) {
            addCriterion("addtime >", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("addtime >=", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeLessThan(Integer value) {
            addCriterion("addtime <", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeLessThanOrEqualTo(Integer value) {
            addCriterion("addtime <=", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeIn(List<Integer> values) {
            addCriterion("addtime in", values, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotIn(List<Integer> values) {
            addCriterion("addtime not in", values, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeBetween(Integer value1, Integer value2) {
            addCriterion("addtime between", value1, value2, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotBetween(Integer value1, Integer value2) {
            addCriterion("addtime not between", value1, value2, "addtime");
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