package com.masha.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class TlOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TlOrderExample() {
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

        public Criteria andOrderSnIsNull() {
            addCriterion("order_sn is null");
            return (Criteria) this;
        }

        public Criteria andOrderSnIsNotNull() {
            addCriterion("order_sn is not null");
            return (Criteria) this;
        }

        public Criteria andOrderSnEqualTo(String value) {
            addCriterion("order_sn =", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnNotEqualTo(String value) {
            addCriterion("order_sn <>", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnGreaterThan(String value) {
            addCriterion("order_sn >", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnGreaterThanOrEqualTo(String value) {
            addCriterion("order_sn >=", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnLessThan(String value) {
            addCriterion("order_sn <", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnLessThanOrEqualTo(String value) {
            addCriterion("order_sn <=", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnLike(String value) {
            addCriterion("order_sn like", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnNotLike(String value) {
            addCriterion("order_sn not like", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnIn(List<String> values) {
            addCriterion("order_sn in", values, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnNotIn(List<String> values) {
            addCriterion("order_sn not in", values, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnBetween(String value1, String value2) {
            addCriterion("order_sn between", value1, value2, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnNotBetween(String value1, String value2) {
            addCriterion("order_sn not between", value1, value2, "orderSn");
            return (Criteria) this;
        }

        public Criteria andBackOrderSnIsNull() {
            addCriterion("back_order_sn is null");
            return (Criteria) this;
        }

        public Criteria andBackOrderSnIsNotNull() {
            addCriterion("back_order_sn is not null");
            return (Criteria) this;
        }

        public Criteria andBackOrderSnEqualTo(String value) {
            addCriterion("back_order_sn =", value, "backOrderSn");
            return (Criteria) this;
        }

        public Criteria andBackOrderSnNotEqualTo(String value) {
            addCriterion("back_order_sn <>", value, "backOrderSn");
            return (Criteria) this;
        }

        public Criteria andBackOrderSnGreaterThan(String value) {
            addCriterion("back_order_sn >", value, "backOrderSn");
            return (Criteria) this;
        }

        public Criteria andBackOrderSnGreaterThanOrEqualTo(String value) {
            addCriterion("back_order_sn >=", value, "backOrderSn");
            return (Criteria) this;
        }

        public Criteria andBackOrderSnLessThan(String value) {
            addCriterion("back_order_sn <", value, "backOrderSn");
            return (Criteria) this;
        }

        public Criteria andBackOrderSnLessThanOrEqualTo(String value) {
            addCriterion("back_order_sn <=", value, "backOrderSn");
            return (Criteria) this;
        }

        public Criteria andBackOrderSnLike(String value) {
            addCriterion("back_order_sn like", value, "backOrderSn");
            return (Criteria) this;
        }

        public Criteria andBackOrderSnNotLike(String value) {
            addCriterion("back_order_sn not like", value, "backOrderSn");
            return (Criteria) this;
        }

        public Criteria andBackOrderSnIn(List<String> values) {
            addCriterion("back_order_sn in", values, "backOrderSn");
            return (Criteria) this;
        }

        public Criteria andBackOrderSnNotIn(List<String> values) {
            addCriterion("back_order_sn not in", values, "backOrderSn");
            return (Criteria) this;
        }

        public Criteria andBackOrderSnBetween(String value1, String value2) {
            addCriterion("back_order_sn between", value1, value2, "backOrderSn");
            return (Criteria) this;
        }

        public Criteria andBackOrderSnNotBetween(String value1, String value2) {
            addCriterion("back_order_sn not between", value1, value2, "backOrderSn");
            return (Criteria) this;
        }

        public Criteria andTransactionIdIsNull() {
            addCriterion("transaction_id is null");
            return (Criteria) this;
        }

        public Criteria andTransactionIdIsNotNull() {
            addCriterion("transaction_id is not null");
            return (Criteria) this;
        }

        public Criteria andTransactionIdEqualTo(String value) {
            addCriterion("transaction_id =", value, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdNotEqualTo(String value) {
            addCriterion("transaction_id <>", value, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdGreaterThan(String value) {
            addCriterion("transaction_id >", value, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdGreaterThanOrEqualTo(String value) {
            addCriterion("transaction_id >=", value, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdLessThan(String value) {
            addCriterion("transaction_id <", value, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdLessThanOrEqualTo(String value) {
            addCriterion("transaction_id <=", value, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdLike(String value) {
            addCriterion("transaction_id like", value, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdNotLike(String value) {
            addCriterion("transaction_id not like", value, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdIn(List<String> values) {
            addCriterion("transaction_id in", values, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdNotIn(List<String> values) {
            addCriterion("transaction_id not in", values, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdBetween(String value1, String value2) {
            addCriterion("transaction_id between", value1, value2, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdNotBetween(String value1, String value2) {
            addCriterion("transaction_id not between", value1, value2, "transactionId");
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

        public Criteria andAddressNameIsNull() {
            addCriterion("address_name is null");
            return (Criteria) this;
        }

        public Criteria andAddressNameIsNotNull() {
            addCriterion("address_name is not null");
            return (Criteria) this;
        }

        public Criteria andAddressNameEqualTo(String value) {
            addCriterion("address_name =", value, "addressName");
            return (Criteria) this;
        }

        public Criteria andAddressNameNotEqualTo(String value) {
            addCriterion("address_name <>", value, "addressName");
            return (Criteria) this;
        }

        public Criteria andAddressNameGreaterThan(String value) {
            addCriterion("address_name >", value, "addressName");
            return (Criteria) this;
        }

        public Criteria andAddressNameGreaterThanOrEqualTo(String value) {
            addCriterion("address_name >=", value, "addressName");
            return (Criteria) this;
        }

        public Criteria andAddressNameLessThan(String value) {
            addCriterion("address_name <", value, "addressName");
            return (Criteria) this;
        }

        public Criteria andAddressNameLessThanOrEqualTo(String value) {
            addCriterion("address_name <=", value, "addressName");
            return (Criteria) this;
        }

        public Criteria andAddressNameLike(String value) {
            addCriterion("address_name like", value, "addressName");
            return (Criteria) this;
        }

        public Criteria andAddressNameNotLike(String value) {
            addCriterion("address_name not like", value, "addressName");
            return (Criteria) this;
        }

        public Criteria andAddressNameIn(List<String> values) {
            addCriterion("address_name in", values, "addressName");
            return (Criteria) this;
        }

        public Criteria andAddressNameNotIn(List<String> values) {
            addCriterion("address_name not in", values, "addressName");
            return (Criteria) this;
        }

        public Criteria andAddressNameBetween(String value1, String value2) {
            addCriterion("address_name between", value1, value2, "addressName");
            return (Criteria) this;
        }

        public Criteria andAddressNameNotBetween(String value1, String value2) {
            addCriterion("address_name not between", value1, value2, "addressName");
            return (Criteria) this;
        }

        public Criteria andAddressPhoneIsNull() {
            addCriterion("address_phone is null");
            return (Criteria) this;
        }

        public Criteria andAddressPhoneIsNotNull() {
            addCriterion("address_phone is not null");
            return (Criteria) this;
        }

        public Criteria andAddressPhoneEqualTo(String value) {
            addCriterion("address_phone =", value, "addressPhone");
            return (Criteria) this;
        }

        public Criteria andAddressPhoneNotEqualTo(String value) {
            addCriterion("address_phone <>", value, "addressPhone");
            return (Criteria) this;
        }

        public Criteria andAddressPhoneGreaterThan(String value) {
            addCriterion("address_phone >", value, "addressPhone");
            return (Criteria) this;
        }

        public Criteria andAddressPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("address_phone >=", value, "addressPhone");
            return (Criteria) this;
        }

        public Criteria andAddressPhoneLessThan(String value) {
            addCriterion("address_phone <", value, "addressPhone");
            return (Criteria) this;
        }

        public Criteria andAddressPhoneLessThanOrEqualTo(String value) {
            addCriterion("address_phone <=", value, "addressPhone");
            return (Criteria) this;
        }

        public Criteria andAddressPhoneLike(String value) {
            addCriterion("address_phone like", value, "addressPhone");
            return (Criteria) this;
        }

        public Criteria andAddressPhoneNotLike(String value) {
            addCriterion("address_phone not like", value, "addressPhone");
            return (Criteria) this;
        }

        public Criteria andAddressPhoneIn(List<String> values) {
            addCriterion("address_phone in", values, "addressPhone");
            return (Criteria) this;
        }

        public Criteria andAddressPhoneNotIn(List<String> values) {
            addCriterion("address_phone not in", values, "addressPhone");
            return (Criteria) this;
        }

        public Criteria andAddressPhoneBetween(String value1, String value2) {
            addCriterion("address_phone between", value1, value2, "addressPhone");
            return (Criteria) this;
        }

        public Criteria andAddressPhoneNotBetween(String value1, String value2) {
            addCriterion("address_phone not between", value1, value2, "addressPhone");
            return (Criteria) this;
        }

        public Criteria andAddressIdIsNull() {
            addCriterion("address_id is null");
            return (Criteria) this;
        }

        public Criteria andAddressIdIsNotNull() {
            addCriterion("address_id is not null");
            return (Criteria) this;
        }

        public Criteria andAddressIdEqualTo(Short value) {
            addCriterion("address_id =", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdNotEqualTo(Short value) {
            addCriterion("address_id <>", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdGreaterThan(Short value) {
            addCriterion("address_id >", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdGreaterThanOrEqualTo(Short value) {
            addCriterion("address_id >=", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdLessThan(Short value) {
            addCriterion("address_id <", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdLessThanOrEqualTo(Short value) {
            addCriterion("address_id <=", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdIn(List<Short> values) {
            addCriterion("address_id in", values, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdNotIn(List<Short> values) {
            addCriterion("address_id not in", values, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdBetween(Short value1, Short value2) {
            addCriterion("address_id between", value1, value2, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdNotBetween(Short value1, Short value2) {
            addCriterion("address_id not between", value1, value2, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressProvinceIdIsNull() {
            addCriterion("address_province_id is null");
            return (Criteria) this;
        }

        public Criteria andAddressProvinceIdIsNotNull() {
            addCriterion("address_province_id is not null");
            return (Criteria) this;
        }

        public Criteria andAddressProvinceIdEqualTo(Integer value) {
            addCriterion("address_province_id =", value, "addressProvinceId");
            return (Criteria) this;
        }

        public Criteria andAddressProvinceIdNotEqualTo(Integer value) {
            addCriterion("address_province_id <>", value, "addressProvinceId");
            return (Criteria) this;
        }

        public Criteria andAddressProvinceIdGreaterThan(Integer value) {
            addCriterion("address_province_id >", value, "addressProvinceId");
            return (Criteria) this;
        }

        public Criteria andAddressProvinceIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("address_province_id >=", value, "addressProvinceId");
            return (Criteria) this;
        }

        public Criteria andAddressProvinceIdLessThan(Integer value) {
            addCriterion("address_province_id <", value, "addressProvinceId");
            return (Criteria) this;
        }

        public Criteria andAddressProvinceIdLessThanOrEqualTo(Integer value) {
            addCriterion("address_province_id <=", value, "addressProvinceId");
            return (Criteria) this;
        }

        public Criteria andAddressProvinceIdIn(List<Integer> values) {
            addCriterion("address_province_id in", values, "addressProvinceId");
            return (Criteria) this;
        }

        public Criteria andAddressProvinceIdNotIn(List<Integer> values) {
            addCriterion("address_province_id not in", values, "addressProvinceId");
            return (Criteria) this;
        }

        public Criteria andAddressProvinceIdBetween(Integer value1, Integer value2) {
            addCriterion("address_province_id between", value1, value2, "addressProvinceId");
            return (Criteria) this;
        }

        public Criteria andAddressProvinceIdNotBetween(Integer value1, Integer value2) {
            addCriterion("address_province_id not between", value1, value2, "addressProvinceId");
            return (Criteria) this;
        }

        public Criteria andAddressCityIdIsNull() {
            addCriterion("address_city_id is null");
            return (Criteria) this;
        }

        public Criteria andAddressCityIdIsNotNull() {
            addCriterion("address_city_id is not null");
            return (Criteria) this;
        }

        public Criteria andAddressCityIdEqualTo(Integer value) {
            addCriterion("address_city_id =", value, "addressCityId");
            return (Criteria) this;
        }

        public Criteria andAddressCityIdNotEqualTo(Integer value) {
            addCriterion("address_city_id <>", value, "addressCityId");
            return (Criteria) this;
        }

        public Criteria andAddressCityIdGreaterThan(Integer value) {
            addCriterion("address_city_id >", value, "addressCityId");
            return (Criteria) this;
        }

        public Criteria andAddressCityIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("address_city_id >=", value, "addressCityId");
            return (Criteria) this;
        }

        public Criteria andAddressCityIdLessThan(Integer value) {
            addCriterion("address_city_id <", value, "addressCityId");
            return (Criteria) this;
        }

        public Criteria andAddressCityIdLessThanOrEqualTo(Integer value) {
            addCriterion("address_city_id <=", value, "addressCityId");
            return (Criteria) this;
        }

        public Criteria andAddressCityIdIn(List<Integer> values) {
            addCriterion("address_city_id in", values, "addressCityId");
            return (Criteria) this;
        }

        public Criteria andAddressCityIdNotIn(List<Integer> values) {
            addCriterion("address_city_id not in", values, "addressCityId");
            return (Criteria) this;
        }

        public Criteria andAddressCityIdBetween(Integer value1, Integer value2) {
            addCriterion("address_city_id between", value1, value2, "addressCityId");
            return (Criteria) this;
        }

        public Criteria andAddressCityIdNotBetween(Integer value1, Integer value2) {
            addCriterion("address_city_id not between", value1, value2, "addressCityId");
            return (Criteria) this;
        }

        public Criteria andAddressAreaIdIsNull() {
            addCriterion("address_area_id is null");
            return (Criteria) this;
        }

        public Criteria andAddressAreaIdIsNotNull() {
            addCriterion("address_area_id is not null");
            return (Criteria) this;
        }

        public Criteria andAddressAreaIdEqualTo(Integer value) {
            addCriterion("address_area_id =", value, "addressAreaId");
            return (Criteria) this;
        }

        public Criteria andAddressAreaIdNotEqualTo(Integer value) {
            addCriterion("address_area_id <>", value, "addressAreaId");
            return (Criteria) this;
        }

        public Criteria andAddressAreaIdGreaterThan(Integer value) {
            addCriterion("address_area_id >", value, "addressAreaId");
            return (Criteria) this;
        }

        public Criteria andAddressAreaIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("address_area_id >=", value, "addressAreaId");
            return (Criteria) this;
        }

        public Criteria andAddressAreaIdLessThan(Integer value) {
            addCriterion("address_area_id <", value, "addressAreaId");
            return (Criteria) this;
        }

        public Criteria andAddressAreaIdLessThanOrEqualTo(Integer value) {
            addCriterion("address_area_id <=", value, "addressAreaId");
            return (Criteria) this;
        }

        public Criteria andAddressAreaIdIn(List<Integer> values) {
            addCriterion("address_area_id in", values, "addressAreaId");
            return (Criteria) this;
        }

        public Criteria andAddressAreaIdNotIn(List<Integer> values) {
            addCriterion("address_area_id not in", values, "addressAreaId");
            return (Criteria) this;
        }

        public Criteria andAddressAreaIdBetween(Integer value1, Integer value2) {
            addCriterion("address_area_id between", value1, value2, "addressAreaId");
            return (Criteria) this;
        }

        public Criteria andAddressAreaIdNotBetween(Integer value1, Integer value2) {
            addCriterion("address_area_id not between", value1, value2, "addressAreaId");
            return (Criteria) this;
        }

        public Criteria andAddressStreetIdIsNull() {
            addCriterion("address_street_id is null");
            return (Criteria) this;
        }

        public Criteria andAddressStreetIdIsNotNull() {
            addCriterion("address_street_id is not null");
            return (Criteria) this;
        }

        public Criteria andAddressStreetIdEqualTo(Integer value) {
            addCriterion("address_street_id =", value, "addressStreetId");
            return (Criteria) this;
        }

        public Criteria andAddressStreetIdNotEqualTo(Integer value) {
            addCriterion("address_street_id <>", value, "addressStreetId");
            return (Criteria) this;
        }

        public Criteria andAddressStreetIdGreaterThan(Integer value) {
            addCriterion("address_street_id >", value, "addressStreetId");
            return (Criteria) this;
        }

        public Criteria andAddressStreetIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("address_street_id >=", value, "addressStreetId");
            return (Criteria) this;
        }

        public Criteria andAddressStreetIdLessThan(Integer value) {
            addCriterion("address_street_id <", value, "addressStreetId");
            return (Criteria) this;
        }

        public Criteria andAddressStreetIdLessThanOrEqualTo(Integer value) {
            addCriterion("address_street_id <=", value, "addressStreetId");
            return (Criteria) this;
        }

        public Criteria andAddressStreetIdIn(List<Integer> values) {
            addCriterion("address_street_id in", values, "addressStreetId");
            return (Criteria) this;
        }

        public Criteria andAddressStreetIdNotIn(List<Integer> values) {
            addCriterion("address_street_id not in", values, "addressStreetId");
            return (Criteria) this;
        }

        public Criteria andAddressStreetIdBetween(Integer value1, Integer value2) {
            addCriterion("address_street_id between", value1, value2, "addressStreetId");
            return (Criteria) this;
        }

        public Criteria andAddressStreetIdNotBetween(Integer value1, Integer value2) {
            addCriterion("address_street_id not between", value1, value2, "addressStreetId");
            return (Criteria) this;
        }

        public Criteria andAddressParamsIsNull() {
            addCriterion("address_params is null");
            return (Criteria) this;
        }

        public Criteria andAddressParamsIsNotNull() {
            addCriterion("address_params is not null");
            return (Criteria) this;
        }

        public Criteria andAddressParamsEqualTo(String value) {
            addCriterion("address_params =", value, "addressParams");
            return (Criteria) this;
        }

        public Criteria andAddressParamsNotEqualTo(String value) {
            addCriterion("address_params <>", value, "addressParams");
            return (Criteria) this;
        }

        public Criteria andAddressParamsGreaterThan(String value) {
            addCriterion("address_params >", value, "addressParams");
            return (Criteria) this;
        }

        public Criteria andAddressParamsGreaterThanOrEqualTo(String value) {
            addCriterion("address_params >=", value, "addressParams");
            return (Criteria) this;
        }

        public Criteria andAddressParamsLessThan(String value) {
            addCriterion("address_params <", value, "addressParams");
            return (Criteria) this;
        }

        public Criteria andAddressParamsLessThanOrEqualTo(String value) {
            addCriterion("address_params <=", value, "addressParams");
            return (Criteria) this;
        }

        public Criteria andAddressParamsLike(String value) {
            addCriterion("address_params like", value, "addressParams");
            return (Criteria) this;
        }

        public Criteria andAddressParamsNotLike(String value) {
            addCriterion("address_params not like", value, "addressParams");
            return (Criteria) this;
        }

        public Criteria andAddressParamsIn(List<String> values) {
            addCriterion("address_params in", values, "addressParams");
            return (Criteria) this;
        }

        public Criteria andAddressParamsNotIn(List<String> values) {
            addCriterion("address_params not in", values, "addressParams");
            return (Criteria) this;
        }

        public Criteria andAddressParamsBetween(String value1, String value2) {
            addCriterion("address_params between", value1, value2, "addressParams");
            return (Criteria) this;
        }

        public Criteria andAddressParamsNotBetween(String value1, String value2) {
            addCriterion("address_params not between", value1, value2, "addressParams");
            return (Criteria) this;
        }

        public Criteria andShippingFeeIsNull() {
            addCriterion("shipping_fee is null");
            return (Criteria) this;
        }

        public Criteria andShippingFeeIsNotNull() {
            addCriterion("shipping_fee is not null");
            return (Criteria) this;
        }

        public Criteria andShippingFeeEqualTo(BigDecimal value) {
            addCriterion("shipping_fee =", value, "shippingFee");
            return (Criteria) this;
        }

        public Criteria andShippingFeeNotEqualTo(BigDecimal value) {
            addCriterion("shipping_fee <>", value, "shippingFee");
            return (Criteria) this;
        }

        public Criteria andShippingFeeGreaterThan(BigDecimal value) {
            addCriterion("shipping_fee >", value, "shippingFee");
            return (Criteria) this;
        }

        public Criteria andShippingFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("shipping_fee >=", value, "shippingFee");
            return (Criteria) this;
        }

        public Criteria andShippingFeeLessThan(BigDecimal value) {
            addCriterion("shipping_fee <", value, "shippingFee");
            return (Criteria) this;
        }

        public Criteria andShippingFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("shipping_fee <=", value, "shippingFee");
            return (Criteria) this;
        }

        public Criteria andShippingFeeIn(List<BigDecimal> values) {
            addCriterion("shipping_fee in", values, "shippingFee");
            return (Criteria) this;
        }

        public Criteria andShippingFeeNotIn(List<BigDecimal> values) {
            addCriterion("shipping_fee not in", values, "shippingFee");
            return (Criteria) this;
        }

        public Criteria andShippingFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("shipping_fee between", value1, value2, "shippingFee");
            return (Criteria) this;
        }

        public Criteria andShippingFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("shipping_fee not between", value1, value2, "shippingFee");
            return (Criteria) this;
        }

        public Criteria andGoodsFeeIsNull() {
            addCriterion("goods_fee is null");
            return (Criteria) this;
        }

        public Criteria andGoodsFeeIsNotNull() {
            addCriterion("goods_fee is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsFeeEqualTo(BigDecimal value) {
            addCriterion("goods_fee =", value, "goodsFee");
            return (Criteria) this;
        }

        public Criteria andGoodsFeeNotEqualTo(BigDecimal value) {
            addCriterion("goods_fee <>", value, "goodsFee");
            return (Criteria) this;
        }

        public Criteria andGoodsFeeGreaterThan(BigDecimal value) {
            addCriterion("goods_fee >", value, "goodsFee");
            return (Criteria) this;
        }

        public Criteria andGoodsFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("goods_fee >=", value, "goodsFee");
            return (Criteria) this;
        }

        public Criteria andGoodsFeeLessThan(BigDecimal value) {
            addCriterion("goods_fee <", value, "goodsFee");
            return (Criteria) this;
        }

        public Criteria andGoodsFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("goods_fee <=", value, "goodsFee");
            return (Criteria) this;
        }

        public Criteria andGoodsFeeIn(List<BigDecimal> values) {
            addCriterion("goods_fee in", values, "goodsFee");
            return (Criteria) this;
        }

        public Criteria andGoodsFeeNotIn(List<BigDecimal> values) {
            addCriterion("goods_fee not in", values, "goodsFee");
            return (Criteria) this;
        }

        public Criteria andGoodsFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("goods_fee between", value1, value2, "goodsFee");
            return (Criteria) this;
        }

        public Criteria andGoodsFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("goods_fee not between", value1, value2, "goodsFee");
            return (Criteria) this;
        }

        public Criteria andTotalFeeIsNull() {
            addCriterion("total_fee is null");
            return (Criteria) this;
        }

        public Criteria andTotalFeeIsNotNull() {
            addCriterion("total_fee is not null");
            return (Criteria) this;
        }

        public Criteria andTotalFeeEqualTo(BigDecimal value) {
            addCriterion("total_fee =", value, "totalFee");
            return (Criteria) this;
        }

        public Criteria andTotalFeeNotEqualTo(BigDecimal value) {
            addCriterion("total_fee <>", value, "totalFee");
            return (Criteria) this;
        }

        public Criteria andTotalFeeGreaterThan(BigDecimal value) {
            addCriterion("total_fee >", value, "totalFee");
            return (Criteria) this;
        }

        public Criteria andTotalFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("total_fee >=", value, "totalFee");
            return (Criteria) this;
        }

        public Criteria andTotalFeeLessThan(BigDecimal value) {
            addCriterion("total_fee <", value, "totalFee");
            return (Criteria) this;
        }

        public Criteria andTotalFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("total_fee <=", value, "totalFee");
            return (Criteria) this;
        }

        public Criteria andTotalFeeIn(List<BigDecimal> values) {
            addCriterion("total_fee in", values, "totalFee");
            return (Criteria) this;
        }

        public Criteria andTotalFeeNotIn(List<BigDecimal> values) {
            addCriterion("total_fee not in", values, "totalFee");
            return (Criteria) this;
        }

        public Criteria andTotalFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_fee between", value1, value2, "totalFee");
            return (Criteria) this;
        }

        public Criteria andTotalFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_fee not between", value1, value2, "totalFee");
            return (Criteria) this;
        }

        public Criteria andPayFeeIsNull() {
            addCriterion("pay_fee is null");
            return (Criteria) this;
        }

        public Criteria andPayFeeIsNotNull() {
            addCriterion("pay_fee is not null");
            return (Criteria) this;
        }

        public Criteria andPayFeeEqualTo(BigDecimal value) {
            addCriterion("pay_fee =", value, "payFee");
            return (Criteria) this;
        }

        public Criteria andPayFeeNotEqualTo(BigDecimal value) {
            addCriterion("pay_fee <>", value, "payFee");
            return (Criteria) this;
        }

        public Criteria andPayFeeGreaterThan(BigDecimal value) {
            addCriterion("pay_fee >", value, "payFee");
            return (Criteria) this;
        }

        public Criteria andPayFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("pay_fee >=", value, "payFee");
            return (Criteria) this;
        }

        public Criteria andPayFeeLessThan(BigDecimal value) {
            addCriterion("pay_fee <", value, "payFee");
            return (Criteria) this;
        }

        public Criteria andPayFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("pay_fee <=", value, "payFee");
            return (Criteria) this;
        }

        public Criteria andPayFeeIn(List<BigDecimal> values) {
            addCriterion("pay_fee in", values, "payFee");
            return (Criteria) this;
        }

        public Criteria andPayFeeNotIn(List<BigDecimal> values) {
            addCriterion("pay_fee not in", values, "payFee");
            return (Criteria) this;
        }

        public Criteria andPayFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pay_fee between", value1, value2, "payFee");
            return (Criteria) this;
        }

        public Criteria andPayFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pay_fee not between", value1, value2, "payFee");
            return (Criteria) this;
        }

        public Criteria andPayBeizhuIsNull() {
            addCriterion("pay_beizhu is null");
            return (Criteria) this;
        }

        public Criteria andPayBeizhuIsNotNull() {
            addCriterion("pay_beizhu is not null");
            return (Criteria) this;
        }

        public Criteria andPayBeizhuEqualTo(String value) {
            addCriterion("pay_beizhu =", value, "payBeizhu");
            return (Criteria) this;
        }

        public Criteria andPayBeizhuNotEqualTo(String value) {
            addCriterion("pay_beizhu <>", value, "payBeizhu");
            return (Criteria) this;
        }

        public Criteria andPayBeizhuGreaterThan(String value) {
            addCriterion("pay_beizhu >", value, "payBeizhu");
            return (Criteria) this;
        }

        public Criteria andPayBeizhuGreaterThanOrEqualTo(String value) {
            addCriterion("pay_beizhu >=", value, "payBeizhu");
            return (Criteria) this;
        }

        public Criteria andPayBeizhuLessThan(String value) {
            addCriterion("pay_beizhu <", value, "payBeizhu");
            return (Criteria) this;
        }

        public Criteria andPayBeizhuLessThanOrEqualTo(String value) {
            addCriterion("pay_beizhu <=", value, "payBeizhu");
            return (Criteria) this;
        }

        public Criteria andPayBeizhuLike(String value) {
            addCriterion("pay_beizhu like", value, "payBeizhu");
            return (Criteria) this;
        }

        public Criteria andPayBeizhuNotLike(String value) {
            addCriterion("pay_beizhu not like", value, "payBeizhu");
            return (Criteria) this;
        }

        public Criteria andPayBeizhuIn(List<String> values) {
            addCriterion("pay_beizhu in", values, "payBeizhu");
            return (Criteria) this;
        }

        public Criteria andPayBeizhuNotIn(List<String> values) {
            addCriterion("pay_beizhu not in", values, "payBeizhu");
            return (Criteria) this;
        }

        public Criteria andPayBeizhuBetween(String value1, String value2) {
            addCriterion("pay_beizhu between", value1, value2, "payBeizhu");
            return (Criteria) this;
        }

        public Criteria andPayBeizhuNotBetween(String value1, String value2) {
            addCriterion("pay_beizhu not between", value1, value2, "payBeizhu");
            return (Criteria) this;
        }

        public Criteria andRealFeeIsNull() {
            addCriterion("real_fee is null");
            return (Criteria) this;
        }

        public Criteria andRealFeeIsNotNull() {
            addCriterion("real_fee is not null");
            return (Criteria) this;
        }

        public Criteria andRealFeeEqualTo(BigDecimal value) {
            addCriterion("real_fee =", value, "realFee");
            return (Criteria) this;
        }

        public Criteria andRealFeeNotEqualTo(BigDecimal value) {
            addCriterion("real_fee <>", value, "realFee");
            return (Criteria) this;
        }

        public Criteria andRealFeeGreaterThan(BigDecimal value) {
            addCriterion("real_fee >", value, "realFee");
            return (Criteria) this;
        }

        public Criteria andRealFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("real_fee >=", value, "realFee");
            return (Criteria) this;
        }

        public Criteria andRealFeeLessThan(BigDecimal value) {
            addCriterion("real_fee <", value, "realFee");
            return (Criteria) this;
        }

        public Criteria andRealFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("real_fee <=", value, "realFee");
            return (Criteria) this;
        }

        public Criteria andRealFeeIn(List<BigDecimal> values) {
            addCriterion("real_fee in", values, "realFee");
            return (Criteria) this;
        }

        public Criteria andRealFeeNotIn(List<BigDecimal> values) {
            addCriterion("real_fee not in", values, "realFee");
            return (Criteria) this;
        }

        public Criteria andRealFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("real_fee between", value1, value2, "realFee");
            return (Criteria) this;
        }

        public Criteria andRealFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("real_fee not between", value1, value2, "realFee");
            return (Criteria) this;
        }

        public Criteria andDisFeeIsNull() {
            addCriterion("dis_fee is null");
            return (Criteria) this;
        }

        public Criteria andDisFeeIsNotNull() {
            addCriterion("dis_fee is not null");
            return (Criteria) this;
        }

        public Criteria andDisFeeEqualTo(BigDecimal value) {
            addCriterion("dis_fee =", value, "disFee");
            return (Criteria) this;
        }

        public Criteria andDisFeeNotEqualTo(BigDecimal value) {
            addCriterion("dis_fee <>", value, "disFee");
            return (Criteria) this;
        }

        public Criteria andDisFeeGreaterThan(BigDecimal value) {
            addCriterion("dis_fee >", value, "disFee");
            return (Criteria) this;
        }

        public Criteria andDisFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("dis_fee >=", value, "disFee");
            return (Criteria) this;
        }

        public Criteria andDisFeeLessThan(BigDecimal value) {
            addCriterion("dis_fee <", value, "disFee");
            return (Criteria) this;
        }

        public Criteria andDisFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("dis_fee <=", value, "disFee");
            return (Criteria) this;
        }

        public Criteria andDisFeeIn(List<BigDecimal> values) {
            addCriterion("dis_fee in", values, "disFee");
            return (Criteria) this;
        }

        public Criteria andDisFeeNotIn(List<BigDecimal> values) {
            addCriterion("dis_fee not in", values, "disFee");
            return (Criteria) this;
        }

        public Criteria andDisFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dis_fee between", value1, value2, "disFee");
            return (Criteria) this;
        }

        public Criteria andDisFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dis_fee not between", value1, value2, "disFee");
            return (Criteria) this;
        }

        public Criteria andDiscountFeeIsNull() {
            addCriterion("discount_fee is null");
            return (Criteria) this;
        }

        public Criteria andDiscountFeeIsNotNull() {
            addCriterion("discount_fee is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountFeeEqualTo(BigDecimal value) {
            addCriterion("discount_fee =", value, "discountFee");
            return (Criteria) this;
        }

        public Criteria andDiscountFeeNotEqualTo(BigDecimal value) {
            addCriterion("discount_fee <>", value, "discountFee");
            return (Criteria) this;
        }

        public Criteria andDiscountFeeGreaterThan(BigDecimal value) {
            addCriterion("discount_fee >", value, "discountFee");
            return (Criteria) this;
        }

        public Criteria andDiscountFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("discount_fee >=", value, "discountFee");
            return (Criteria) this;
        }

        public Criteria andDiscountFeeLessThan(BigDecimal value) {
            addCriterion("discount_fee <", value, "discountFee");
            return (Criteria) this;
        }

        public Criteria andDiscountFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("discount_fee <=", value, "discountFee");
            return (Criteria) this;
        }

        public Criteria andDiscountFeeIn(List<BigDecimal> values) {
            addCriterion("discount_fee in", values, "discountFee");
            return (Criteria) this;
        }

        public Criteria andDiscountFeeNotIn(List<BigDecimal> values) {
            addCriterion("discount_fee not in", values, "discountFee");
            return (Criteria) this;
        }

        public Criteria andDiscountFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("discount_fee between", value1, value2, "discountFee");
            return (Criteria) this;
        }

        public Criteria andDiscountFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("discount_fee not between", value1, value2, "discountFee");
            return (Criteria) this;
        }

        public Criteria andAccountFeeIsNull() {
            addCriterion("account_fee is null");
            return (Criteria) this;
        }

        public Criteria andAccountFeeIsNotNull() {
            addCriterion("account_fee is not null");
            return (Criteria) this;
        }

        public Criteria andAccountFeeEqualTo(BigDecimal value) {
            addCriterion("account_fee =", value, "accountFee");
            return (Criteria) this;
        }

        public Criteria andAccountFeeNotEqualTo(BigDecimal value) {
            addCriterion("account_fee <>", value, "accountFee");
            return (Criteria) this;
        }

        public Criteria andAccountFeeGreaterThan(BigDecimal value) {
            addCriterion("account_fee >", value, "accountFee");
            return (Criteria) this;
        }

        public Criteria andAccountFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("account_fee >=", value, "accountFee");
            return (Criteria) this;
        }

        public Criteria andAccountFeeLessThan(BigDecimal value) {
            addCriterion("account_fee <", value, "accountFee");
            return (Criteria) this;
        }

        public Criteria andAccountFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("account_fee <=", value, "accountFee");
            return (Criteria) this;
        }

        public Criteria andAccountFeeIn(List<BigDecimal> values) {
            addCriterion("account_fee in", values, "accountFee");
            return (Criteria) this;
        }

        public Criteria andAccountFeeNotIn(List<BigDecimal> values) {
            addCriterion("account_fee not in", values, "accountFee");
            return (Criteria) this;
        }

        public Criteria andAccountFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("account_fee between", value1, value2, "accountFee");
            return (Criteria) this;
        }

        public Criteria andAccountFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("account_fee not between", value1, value2, "accountFee");
            return (Criteria) this;
        }

        public Criteria andShuidianFeeIsNull() {
            addCriterion("shuidian_fee is null");
            return (Criteria) this;
        }

        public Criteria andShuidianFeeIsNotNull() {
            addCriterion("shuidian_fee is not null");
            return (Criteria) this;
        }

        public Criteria andShuidianFeeEqualTo(String value) {
            addCriterion("shuidian_fee =", value, "shuidianFee");
            return (Criteria) this;
        }

        public Criteria andShuidianFeeNotEqualTo(String value) {
            addCriterion("shuidian_fee <>", value, "shuidianFee");
            return (Criteria) this;
        }

        public Criteria andShuidianFeeGreaterThan(String value) {
            addCriterion("shuidian_fee >", value, "shuidianFee");
            return (Criteria) this;
        }

        public Criteria andShuidianFeeGreaterThanOrEqualTo(String value) {
            addCriterion("shuidian_fee >=", value, "shuidianFee");
            return (Criteria) this;
        }

        public Criteria andShuidianFeeLessThan(String value) {
            addCriterion("shuidian_fee <", value, "shuidianFee");
            return (Criteria) this;
        }

        public Criteria andShuidianFeeLessThanOrEqualTo(String value) {
            addCriterion("shuidian_fee <=", value, "shuidianFee");
            return (Criteria) this;
        }

        public Criteria andShuidianFeeLike(String value) {
            addCriterion("shuidian_fee like", value, "shuidianFee");
            return (Criteria) this;
        }

        public Criteria andShuidianFeeNotLike(String value) {
            addCriterion("shuidian_fee not like", value, "shuidianFee");
            return (Criteria) this;
        }

        public Criteria andShuidianFeeIn(List<String> values) {
            addCriterion("shuidian_fee in", values, "shuidianFee");
            return (Criteria) this;
        }

        public Criteria andShuidianFeeNotIn(List<String> values) {
            addCriterion("shuidian_fee not in", values, "shuidianFee");
            return (Criteria) this;
        }

        public Criteria andShuidianFeeBetween(String value1, String value2) {
            addCriterion("shuidian_fee between", value1, value2, "shuidianFee");
            return (Criteria) this;
        }

        public Criteria andShuidianFeeNotBetween(String value1, String value2) {
            addCriterion("shuidian_fee not between", value1, value2, "shuidianFee");
            return (Criteria) this;
        }

        public Criteria andDiscountFeeParamsIsNull() {
            addCriterion("discount_fee_params is null");
            return (Criteria) this;
        }

        public Criteria andDiscountFeeParamsIsNotNull() {
            addCriterion("discount_fee_params is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountFeeParamsEqualTo(String value) {
            addCriterion("discount_fee_params =", value, "discountFeeParams");
            return (Criteria) this;
        }

        public Criteria andDiscountFeeParamsNotEqualTo(String value) {
            addCriterion("discount_fee_params <>", value, "discountFeeParams");
            return (Criteria) this;
        }

        public Criteria andDiscountFeeParamsGreaterThan(String value) {
            addCriterion("discount_fee_params >", value, "discountFeeParams");
            return (Criteria) this;
        }

        public Criteria andDiscountFeeParamsGreaterThanOrEqualTo(String value) {
            addCriterion("discount_fee_params >=", value, "discountFeeParams");
            return (Criteria) this;
        }

        public Criteria andDiscountFeeParamsLessThan(String value) {
            addCriterion("discount_fee_params <", value, "discountFeeParams");
            return (Criteria) this;
        }

        public Criteria andDiscountFeeParamsLessThanOrEqualTo(String value) {
            addCriterion("discount_fee_params <=", value, "discountFeeParams");
            return (Criteria) this;
        }

        public Criteria andDiscountFeeParamsLike(String value) {
            addCriterion("discount_fee_params like", value, "discountFeeParams");
            return (Criteria) this;
        }

        public Criteria andDiscountFeeParamsNotLike(String value) {
            addCriterion("discount_fee_params not like", value, "discountFeeParams");
            return (Criteria) this;
        }

        public Criteria andDiscountFeeParamsIn(List<String> values) {
            addCriterion("discount_fee_params in", values, "discountFeeParams");
            return (Criteria) this;
        }

        public Criteria andDiscountFeeParamsNotIn(List<String> values) {
            addCriterion("discount_fee_params not in", values, "discountFeeParams");
            return (Criteria) this;
        }

        public Criteria andDiscountFeeParamsBetween(String value1, String value2) {
            addCriterion("discount_fee_params between", value1, value2, "discountFeeParams");
            return (Criteria) this;
        }

        public Criteria andDiscountFeeParamsNotBetween(String value1, String value2) {
            addCriterion("discount_fee_params not between", value1, value2, "discountFeeParams");
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

        public Criteria andTeacherFeeIsNull() {
            addCriterion("teacher_fee is null");
            return (Criteria) this;
        }

        public Criteria andTeacherFeeIsNotNull() {
            addCriterion("teacher_fee is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherFeeEqualTo(BigDecimal value) {
            addCriterion("teacher_fee =", value, "teacherFee");
            return (Criteria) this;
        }

        public Criteria andTeacherFeeNotEqualTo(BigDecimal value) {
            addCriterion("teacher_fee <>", value, "teacherFee");
            return (Criteria) this;
        }

        public Criteria andTeacherFeeGreaterThan(BigDecimal value) {
            addCriterion("teacher_fee >", value, "teacherFee");
            return (Criteria) this;
        }

        public Criteria andTeacherFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("teacher_fee >=", value, "teacherFee");
            return (Criteria) this;
        }

        public Criteria andTeacherFeeLessThan(BigDecimal value) {
            addCriterion("teacher_fee <", value, "teacherFee");
            return (Criteria) this;
        }

        public Criteria andTeacherFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("teacher_fee <=", value, "teacherFee");
            return (Criteria) this;
        }

        public Criteria andTeacherFeeIn(List<BigDecimal> values) {
            addCriterion("teacher_fee in", values, "teacherFee");
            return (Criteria) this;
        }

        public Criteria andTeacherFeeNotIn(List<BigDecimal> values) {
            addCriterion("teacher_fee not in", values, "teacherFee");
            return (Criteria) this;
        }

        public Criteria andTeacherFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("teacher_fee between", value1, value2, "teacherFee");
            return (Criteria) this;
        }

        public Criteria andTeacherFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("teacher_fee not between", value1, value2, "teacherFee");
            return (Criteria) this;
        }

        public Criteria andFeeDisForCouponIsNull() {
            addCriterion("fee_dis_for_coupon is null");
            return (Criteria) this;
        }

        public Criteria andFeeDisForCouponIsNotNull() {
            addCriterion("fee_dis_for_coupon is not null");
            return (Criteria) this;
        }

        public Criteria andFeeDisForCouponEqualTo(BigDecimal value) {
            addCriterion("fee_dis_for_coupon =", value, "feeDisForCoupon");
            return (Criteria) this;
        }

        public Criteria andFeeDisForCouponNotEqualTo(BigDecimal value) {
            addCriterion("fee_dis_for_coupon <>", value, "feeDisForCoupon");
            return (Criteria) this;
        }

        public Criteria andFeeDisForCouponGreaterThan(BigDecimal value) {
            addCriterion("fee_dis_for_coupon >", value, "feeDisForCoupon");
            return (Criteria) this;
        }

        public Criteria andFeeDisForCouponGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("fee_dis_for_coupon >=", value, "feeDisForCoupon");
            return (Criteria) this;
        }

        public Criteria andFeeDisForCouponLessThan(BigDecimal value) {
            addCriterion("fee_dis_for_coupon <", value, "feeDisForCoupon");
            return (Criteria) this;
        }

        public Criteria andFeeDisForCouponLessThanOrEqualTo(BigDecimal value) {
            addCriterion("fee_dis_for_coupon <=", value, "feeDisForCoupon");
            return (Criteria) this;
        }

        public Criteria andFeeDisForCouponIn(List<BigDecimal> values) {
            addCriterion("fee_dis_for_coupon in", values, "feeDisForCoupon");
            return (Criteria) this;
        }

        public Criteria andFeeDisForCouponNotIn(List<BigDecimal> values) {
            addCriterion("fee_dis_for_coupon not in", values, "feeDisForCoupon");
            return (Criteria) this;
        }

        public Criteria andFeeDisForCouponBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fee_dis_for_coupon between", value1, value2, "feeDisForCoupon");
            return (Criteria) this;
        }

        public Criteria andFeeDisForCouponNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fee_dis_for_coupon not between", value1, value2, "feeDisForCoupon");
            return (Criteria) this;
        }

        public Criteria andCouponIdIsNull() {
            addCriterion("coupon_id is null");
            return (Criteria) this;
        }

        public Criteria andCouponIdIsNotNull() {
            addCriterion("coupon_id is not null");
            return (Criteria) this;
        }

        public Criteria andCouponIdEqualTo(String value) {
            addCriterion("coupon_id =", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdNotEqualTo(String value) {
            addCriterion("coupon_id <>", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdGreaterThan(String value) {
            addCriterion("coupon_id >", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdGreaterThanOrEqualTo(String value) {
            addCriterion("coupon_id >=", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdLessThan(String value) {
            addCriterion("coupon_id <", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdLessThanOrEqualTo(String value) {
            addCriterion("coupon_id <=", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdLike(String value) {
            addCriterion("coupon_id like", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdNotLike(String value) {
            addCriterion("coupon_id not like", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdIn(List<String> values) {
            addCriterion("coupon_id in", values, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdNotIn(List<String> values) {
            addCriterion("coupon_id not in", values, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdBetween(String value1, String value2) {
            addCriterion("coupon_id between", value1, value2, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdNotBetween(String value1, String value2) {
            addCriterion("coupon_id not between", value1, value2, "couponId");
            return (Criteria) this;
        }

        public Criteria andUserCouponIdIsNull() {
            addCriterion("user_coupon_id is null");
            return (Criteria) this;
        }

        public Criteria andUserCouponIdIsNotNull() {
            addCriterion("user_coupon_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserCouponIdEqualTo(String value) {
            addCriterion("user_coupon_id =", value, "userCouponId");
            return (Criteria) this;
        }

        public Criteria andUserCouponIdNotEqualTo(String value) {
            addCriterion("user_coupon_id <>", value, "userCouponId");
            return (Criteria) this;
        }

        public Criteria andUserCouponIdGreaterThan(String value) {
            addCriterion("user_coupon_id >", value, "userCouponId");
            return (Criteria) this;
        }

        public Criteria andUserCouponIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_coupon_id >=", value, "userCouponId");
            return (Criteria) this;
        }

        public Criteria andUserCouponIdLessThan(String value) {
            addCriterion("user_coupon_id <", value, "userCouponId");
            return (Criteria) this;
        }

        public Criteria andUserCouponIdLessThanOrEqualTo(String value) {
            addCriterion("user_coupon_id <=", value, "userCouponId");
            return (Criteria) this;
        }

        public Criteria andUserCouponIdLike(String value) {
            addCriterion("user_coupon_id like", value, "userCouponId");
            return (Criteria) this;
        }

        public Criteria andUserCouponIdNotLike(String value) {
            addCriterion("user_coupon_id not like", value, "userCouponId");
            return (Criteria) this;
        }

        public Criteria andUserCouponIdIn(List<String> values) {
            addCriterion("user_coupon_id in", values, "userCouponId");
            return (Criteria) this;
        }

        public Criteria andUserCouponIdNotIn(List<String> values) {
            addCriterion("user_coupon_id not in", values, "userCouponId");
            return (Criteria) this;
        }

        public Criteria andUserCouponIdBetween(String value1, String value2) {
            addCriterion("user_coupon_id between", value1, value2, "userCouponId");
            return (Criteria) this;
        }

        public Criteria andUserCouponIdNotBetween(String value1, String value2) {
            addCriterion("user_coupon_id not between", value1, value2, "userCouponId");
            return (Criteria) this;
        }

        public Criteria andShopFeeIsNull() {
            addCriterion("shop_fee is null");
            return (Criteria) this;
        }

        public Criteria andShopFeeIsNotNull() {
            addCriterion("shop_fee is not null");
            return (Criteria) this;
        }

        public Criteria andShopFeeEqualTo(BigDecimal value) {
            addCriterion("shop_fee =", value, "shopFee");
            return (Criteria) this;
        }

        public Criteria andShopFeeNotEqualTo(BigDecimal value) {
            addCriterion("shop_fee <>", value, "shopFee");
            return (Criteria) this;
        }

        public Criteria andShopFeeGreaterThan(BigDecimal value) {
            addCriterion("shop_fee >", value, "shopFee");
            return (Criteria) this;
        }

        public Criteria andShopFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("shop_fee >=", value, "shopFee");
            return (Criteria) this;
        }

        public Criteria andShopFeeLessThan(BigDecimal value) {
            addCriterion("shop_fee <", value, "shopFee");
            return (Criteria) this;
        }

        public Criteria andShopFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("shop_fee <=", value, "shopFee");
            return (Criteria) this;
        }

        public Criteria andShopFeeIn(List<BigDecimal> values) {
            addCriterion("shop_fee in", values, "shopFee");
            return (Criteria) this;
        }

        public Criteria andShopFeeNotIn(List<BigDecimal> values) {
            addCriterion("shop_fee not in", values, "shopFee");
            return (Criteria) this;
        }

        public Criteria andShopFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("shop_fee between", value1, value2, "shopFee");
            return (Criteria) this;
        }

        public Criteria andShopFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("shop_fee not between", value1, value2, "shopFee");
            return (Criteria) this;
        }

        public Criteria andShopFeePreIsNull() {
            addCriterion("shop_fee_pre is null");
            return (Criteria) this;
        }

        public Criteria andShopFeePreIsNotNull() {
            addCriterion("shop_fee_pre is not null");
            return (Criteria) this;
        }

        public Criteria andShopFeePreEqualTo(Integer value) {
            addCriterion("shop_fee_pre =", value, "shopFeePre");
            return (Criteria) this;
        }

        public Criteria andShopFeePreNotEqualTo(Integer value) {
            addCriterion("shop_fee_pre <>", value, "shopFeePre");
            return (Criteria) this;
        }

        public Criteria andShopFeePreGreaterThan(Integer value) {
            addCriterion("shop_fee_pre >", value, "shopFeePre");
            return (Criteria) this;
        }

        public Criteria andShopFeePreGreaterThanOrEqualTo(Integer value) {
            addCriterion("shop_fee_pre >=", value, "shopFeePre");
            return (Criteria) this;
        }

        public Criteria andShopFeePreLessThan(Integer value) {
            addCriterion("shop_fee_pre <", value, "shopFeePre");
            return (Criteria) this;
        }

        public Criteria andShopFeePreLessThanOrEqualTo(Integer value) {
            addCriterion("shop_fee_pre <=", value, "shopFeePre");
            return (Criteria) this;
        }

        public Criteria andShopFeePreIn(List<Integer> values) {
            addCriterion("shop_fee_pre in", values, "shopFeePre");
            return (Criteria) this;
        }

        public Criteria andShopFeePreNotIn(List<Integer> values) {
            addCriterion("shop_fee_pre not in", values, "shopFeePre");
            return (Criteria) this;
        }

        public Criteria andShopFeePreBetween(Integer value1, Integer value2) {
            addCriterion("shop_fee_pre between", value1, value2, "shopFeePre");
            return (Criteria) this;
        }

        public Criteria andShopFeePreNotBetween(Integer value1, Integer value2) {
            addCriterion("shop_fee_pre not between", value1, value2, "shopFeePre");
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

        public Criteria andOrderStatusIsNull() {
            addCriterion("order_status is null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNotNull() {
            addCriterion("order_status is not null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusEqualTo(Integer value) {
            addCriterion("order_status =", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotEqualTo(Integer value) {
            addCriterion("order_status <>", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThan(Integer value) {
            addCriterion("order_status >", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_status >=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThan(Integer value) {
            addCriterion("order_status <", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThanOrEqualTo(Integer value) {
            addCriterion("order_status <=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIn(List<Integer> values) {
            addCriterion("order_status in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotIn(List<Integer> values) {
            addCriterion("order_status not in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusBetween(Integer value1, Integer value2) {
            addCriterion("order_status between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("order_status not between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andSuccessTimeIsNull() {
            addCriterion("success_time is null");
            return (Criteria) this;
        }

        public Criteria andSuccessTimeIsNotNull() {
            addCriterion("success_time is not null");
            return (Criteria) this;
        }

        public Criteria andSuccessTimeEqualTo(Integer value) {
            addCriterion("success_time =", value, "successTime");
            return (Criteria) this;
        }

        public Criteria andSuccessTimeNotEqualTo(Integer value) {
            addCriterion("success_time <>", value, "successTime");
            return (Criteria) this;
        }

        public Criteria andSuccessTimeGreaterThan(Integer value) {
            addCriterion("success_time >", value, "successTime");
            return (Criteria) this;
        }

        public Criteria andSuccessTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("success_time >=", value, "successTime");
            return (Criteria) this;
        }

        public Criteria andSuccessTimeLessThan(Integer value) {
            addCriterion("success_time <", value, "successTime");
            return (Criteria) this;
        }

        public Criteria andSuccessTimeLessThanOrEqualTo(Integer value) {
            addCriterion("success_time <=", value, "successTime");
            return (Criteria) this;
        }

        public Criteria andSuccessTimeIn(List<Integer> values) {
            addCriterion("success_time in", values, "successTime");
            return (Criteria) this;
        }

        public Criteria andSuccessTimeNotIn(List<Integer> values) {
            addCriterion("success_time not in", values, "successTime");
            return (Criteria) this;
        }

        public Criteria andSuccessTimeBetween(Integer value1, Integer value2) {
            addCriterion("success_time between", value1, value2, "successTime");
            return (Criteria) this;
        }

        public Criteria andSuccessTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("success_time not between", value1, value2, "successTime");
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

        public Criteria andBackEndContentIsNull() {
            addCriterion("back_end_content is null");
            return (Criteria) this;
        }

        public Criteria andBackEndContentIsNotNull() {
            addCriterion("back_end_content is not null");
            return (Criteria) this;
        }

        public Criteria andBackEndContentEqualTo(String value) {
            addCriterion("back_end_content =", value, "backEndContent");
            return (Criteria) this;
        }

        public Criteria andBackEndContentNotEqualTo(String value) {
            addCriterion("back_end_content <>", value, "backEndContent");
            return (Criteria) this;
        }

        public Criteria andBackEndContentGreaterThan(String value) {
            addCriterion("back_end_content >", value, "backEndContent");
            return (Criteria) this;
        }

        public Criteria andBackEndContentGreaterThanOrEqualTo(String value) {
            addCriterion("back_end_content >=", value, "backEndContent");
            return (Criteria) this;
        }

        public Criteria andBackEndContentLessThan(String value) {
            addCriterion("back_end_content <", value, "backEndContent");
            return (Criteria) this;
        }

        public Criteria andBackEndContentLessThanOrEqualTo(String value) {
            addCriterion("back_end_content <=", value, "backEndContent");
            return (Criteria) this;
        }

        public Criteria andBackEndContentLike(String value) {
            addCriterion("back_end_content like", value, "backEndContent");
            return (Criteria) this;
        }

        public Criteria andBackEndContentNotLike(String value) {
            addCriterion("back_end_content not like", value, "backEndContent");
            return (Criteria) this;
        }

        public Criteria andBackEndContentIn(List<String> values) {
            addCriterion("back_end_content in", values, "backEndContent");
            return (Criteria) this;
        }

        public Criteria andBackEndContentNotIn(List<String> values) {
            addCriterion("back_end_content not in", values, "backEndContent");
            return (Criteria) this;
        }

        public Criteria andBackEndContentBetween(String value1, String value2) {
            addCriterion("back_end_content between", value1, value2, "backEndContent");
            return (Criteria) this;
        }

        public Criteria andBackEndContentNotBetween(String value1, String value2) {
            addCriterion("back_end_content not between", value1, value2, "backEndContent");
            return (Criteria) this;
        }

        public Criteria andBackEndIsNull() {
            addCriterion("back_end is null");
            return (Criteria) this;
        }

        public Criteria andBackEndIsNotNull() {
            addCriterion("back_end is not null");
            return (Criteria) this;
        }

        public Criteria andBackEndEqualTo(Integer value) {
            addCriterion("back_end =", value, "backEnd");
            return (Criteria) this;
        }

        public Criteria andBackEndNotEqualTo(Integer value) {
            addCriterion("back_end <>", value, "backEnd");
            return (Criteria) this;
        }

        public Criteria andBackEndGreaterThan(Integer value) {
            addCriterion("back_end >", value, "backEnd");
            return (Criteria) this;
        }

        public Criteria andBackEndGreaterThanOrEqualTo(Integer value) {
            addCriterion("back_end >=", value, "backEnd");
            return (Criteria) this;
        }

        public Criteria andBackEndLessThan(Integer value) {
            addCriterion("back_end <", value, "backEnd");
            return (Criteria) this;
        }

        public Criteria andBackEndLessThanOrEqualTo(Integer value) {
            addCriterion("back_end <=", value, "backEnd");
            return (Criteria) this;
        }

        public Criteria andBackEndIn(List<Integer> values) {
            addCriterion("back_end in", values, "backEnd");
            return (Criteria) this;
        }

        public Criteria andBackEndNotIn(List<Integer> values) {
            addCriterion("back_end not in", values, "backEnd");
            return (Criteria) this;
        }

        public Criteria andBackEndBetween(Integer value1, Integer value2) {
            addCriterion("back_end between", value1, value2, "backEnd");
            return (Criteria) this;
        }

        public Criteria andBackEndNotBetween(Integer value1, Integer value2) {
            addCriterion("back_end not between", value1, value2, "backEnd");
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

        public Criteria andBackComfirmIsNull() {
            addCriterion("back_comfirm is null");
            return (Criteria) this;
        }

        public Criteria andBackComfirmIsNotNull() {
            addCriterion("back_comfirm is not null");
            return (Criteria) this;
        }

        public Criteria andBackComfirmEqualTo(Integer value) {
            addCriterion("back_comfirm =", value, "backComfirm");
            return (Criteria) this;
        }

        public Criteria andBackComfirmNotEqualTo(Integer value) {
            addCriterion("back_comfirm <>", value, "backComfirm");
            return (Criteria) this;
        }

        public Criteria andBackComfirmGreaterThan(Integer value) {
            addCriterion("back_comfirm >", value, "backComfirm");
            return (Criteria) this;
        }

        public Criteria andBackComfirmGreaterThanOrEqualTo(Integer value) {
            addCriterion("back_comfirm >=", value, "backComfirm");
            return (Criteria) this;
        }

        public Criteria andBackComfirmLessThan(Integer value) {
            addCriterion("back_comfirm <", value, "backComfirm");
            return (Criteria) this;
        }

        public Criteria andBackComfirmLessThanOrEqualTo(Integer value) {
            addCriterion("back_comfirm <=", value, "backComfirm");
            return (Criteria) this;
        }

        public Criteria andBackComfirmIn(List<Integer> values) {
            addCriterion("back_comfirm in", values, "backComfirm");
            return (Criteria) this;
        }

        public Criteria andBackComfirmNotIn(List<Integer> values) {
            addCriterion("back_comfirm not in", values, "backComfirm");
            return (Criteria) this;
        }

        public Criteria andBackComfirmBetween(Integer value1, Integer value2) {
            addCriterion("back_comfirm between", value1, value2, "backComfirm");
            return (Criteria) this;
        }

        public Criteria andBackComfirmNotBetween(Integer value1, Integer value2) {
            addCriterion("back_comfirm not between", value1, value2, "backComfirm");
            return (Criteria) this;
        }

        public Criteria andBackComfirmTimeIsNull() {
            addCriterion("back_comfirm_time is null");
            return (Criteria) this;
        }

        public Criteria andBackComfirmTimeIsNotNull() {
            addCriterion("back_comfirm_time is not null");
            return (Criteria) this;
        }

        public Criteria andBackComfirmTimeEqualTo(Integer value) {
            addCriterion("back_comfirm_time =", value, "backComfirmTime");
            return (Criteria) this;
        }

        public Criteria andBackComfirmTimeNotEqualTo(Integer value) {
            addCriterion("back_comfirm_time <>", value, "backComfirmTime");
            return (Criteria) this;
        }

        public Criteria andBackComfirmTimeGreaterThan(Integer value) {
            addCriterion("back_comfirm_time >", value, "backComfirmTime");
            return (Criteria) this;
        }

        public Criteria andBackComfirmTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("back_comfirm_time >=", value, "backComfirmTime");
            return (Criteria) this;
        }

        public Criteria andBackComfirmTimeLessThan(Integer value) {
            addCriterion("back_comfirm_time <", value, "backComfirmTime");
            return (Criteria) this;
        }

        public Criteria andBackComfirmTimeLessThanOrEqualTo(Integer value) {
            addCriterion("back_comfirm_time <=", value, "backComfirmTime");
            return (Criteria) this;
        }

        public Criteria andBackComfirmTimeIn(List<Integer> values) {
            addCriterion("back_comfirm_time in", values, "backComfirmTime");
            return (Criteria) this;
        }

        public Criteria andBackComfirmTimeNotIn(List<Integer> values) {
            addCriterion("back_comfirm_time not in", values, "backComfirmTime");
            return (Criteria) this;
        }

        public Criteria andBackComfirmTimeBetween(Integer value1, Integer value2) {
            addCriterion("back_comfirm_time between", value1, value2, "backComfirmTime");
            return (Criteria) this;
        }

        public Criteria andBackComfirmTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("back_comfirm_time not between", value1, value2, "backComfirmTime");
            return (Criteria) this;
        }

        public Criteria andBackFromIsNull() {
            addCriterion("back_from is null");
            return (Criteria) this;
        }

        public Criteria andBackFromIsNotNull() {
            addCriterion("back_from is not null");
            return (Criteria) this;
        }

        public Criteria andBackFromEqualTo(String value) {
            addCriterion("back_from =", value, "backFrom");
            return (Criteria) this;
        }

        public Criteria andBackFromNotEqualTo(String value) {
            addCriterion("back_from <>", value, "backFrom");
            return (Criteria) this;
        }

        public Criteria andBackFromGreaterThan(String value) {
            addCriterion("back_from >", value, "backFrom");
            return (Criteria) this;
        }

        public Criteria andBackFromGreaterThanOrEqualTo(String value) {
            addCriterion("back_from >=", value, "backFrom");
            return (Criteria) this;
        }

        public Criteria andBackFromLessThan(String value) {
            addCriterion("back_from <", value, "backFrom");
            return (Criteria) this;
        }

        public Criteria andBackFromLessThanOrEqualTo(String value) {
            addCriterion("back_from <=", value, "backFrom");
            return (Criteria) this;
        }

        public Criteria andBackFromLike(String value) {
            addCriterion("back_from like", value, "backFrom");
            return (Criteria) this;
        }

        public Criteria andBackFromNotLike(String value) {
            addCriterion("back_from not like", value, "backFrom");
            return (Criteria) this;
        }

        public Criteria andBackFromIn(List<String> values) {
            addCriterion("back_from in", values, "backFrom");
            return (Criteria) this;
        }

        public Criteria andBackFromNotIn(List<String> values) {
            addCriterion("back_from not in", values, "backFrom");
            return (Criteria) this;
        }

        public Criteria andBackFromBetween(String value1, String value2) {
            addCriterion("back_from between", value1, value2, "backFrom");
            return (Criteria) this;
        }

        public Criteria andBackFromNotBetween(String value1, String value2) {
            addCriterion("back_from not between", value1, value2, "backFrom");
            return (Criteria) this;
        }

        public Criteria andGiftStatusIsNull() {
            addCriterion("gift_status is null");
            return (Criteria) this;
        }

        public Criteria andGiftStatusIsNotNull() {
            addCriterion("gift_status is not null");
            return (Criteria) this;
        }

        public Criteria andGiftStatusEqualTo(Integer value) {
            addCriterion("gift_status =", value, "giftStatus");
            return (Criteria) this;
        }

        public Criteria andGiftStatusNotEqualTo(Integer value) {
            addCriterion("gift_status <>", value, "giftStatus");
            return (Criteria) this;
        }

        public Criteria andGiftStatusGreaterThan(Integer value) {
            addCriterion("gift_status >", value, "giftStatus");
            return (Criteria) this;
        }

        public Criteria andGiftStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("gift_status >=", value, "giftStatus");
            return (Criteria) this;
        }

        public Criteria andGiftStatusLessThan(Integer value) {
            addCriterion("gift_status <", value, "giftStatus");
            return (Criteria) this;
        }

        public Criteria andGiftStatusLessThanOrEqualTo(Integer value) {
            addCriterion("gift_status <=", value, "giftStatus");
            return (Criteria) this;
        }

        public Criteria andGiftStatusIn(List<Integer> values) {
            addCriterion("gift_status in", values, "giftStatus");
            return (Criteria) this;
        }

        public Criteria andGiftStatusNotIn(List<Integer> values) {
            addCriterion("gift_status not in", values, "giftStatus");
            return (Criteria) this;
        }

        public Criteria andGiftStatusBetween(Integer value1, Integer value2) {
            addCriterion("gift_status between", value1, value2, "giftStatus");
            return (Criteria) this;
        }

        public Criteria andGiftStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("gift_status not between", value1, value2, "giftStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusIsNull() {
            addCriterion("pay_status is null");
            return (Criteria) this;
        }

        public Criteria andPayStatusIsNotNull() {
            addCriterion("pay_status is not null");
            return (Criteria) this;
        }

        public Criteria andPayStatusEqualTo(Short value) {
            addCriterion("pay_status =", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusNotEqualTo(Short value) {
            addCriterion("pay_status <>", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusGreaterThan(Short value) {
            addCriterion("pay_status >", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("pay_status >=", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusLessThan(Short value) {
            addCriterion("pay_status <", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusLessThanOrEqualTo(Short value) {
            addCriterion("pay_status <=", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusIn(List<Short> values) {
            addCriterion("pay_status in", values, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusNotIn(List<Short> values) {
            addCriterion("pay_status not in", values, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusBetween(Short value1, Short value2) {
            addCriterion("pay_status between", value1, value2, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusNotBetween(Short value1, Short value2) {
            addCriterion("pay_status not between", value1, value2, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPaytimeIsNull() {
            addCriterion("paytime is null");
            return (Criteria) this;
        }

        public Criteria andPaytimeIsNotNull() {
            addCriterion("paytime is not null");
            return (Criteria) this;
        }

        public Criteria andPaytimeEqualTo(Integer value) {
            addCriterion("paytime =", value, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeNotEqualTo(Integer value) {
            addCriterion("paytime <>", value, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeGreaterThan(Integer value) {
            addCriterion("paytime >", value, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("paytime >=", value, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeLessThan(Integer value) {
            addCriterion("paytime <", value, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeLessThanOrEqualTo(Integer value) {
            addCriterion("paytime <=", value, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeIn(List<Integer> values) {
            addCriterion("paytime in", values, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeNotIn(List<Integer> values) {
            addCriterion("paytime not in", values, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeBetween(Integer value1, Integer value2) {
            addCriterion("paytime between", value1, value2, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeNotBetween(Integer value1, Integer value2) {
            addCriterion("paytime not between", value1, value2, "paytime");
            return (Criteria) this;
        }

        public Criteria andComfirmStautsIsNull() {
            addCriterion("comfirm_stauts is null");
            return (Criteria) this;
        }

        public Criteria andComfirmStautsIsNotNull() {
            addCriterion("comfirm_stauts is not null");
            return (Criteria) this;
        }

        public Criteria andComfirmStautsEqualTo(Short value) {
            addCriterion("comfirm_stauts =", value, "comfirmStauts");
            return (Criteria) this;
        }

        public Criteria andComfirmStautsNotEqualTo(Short value) {
            addCriterion("comfirm_stauts <>", value, "comfirmStauts");
            return (Criteria) this;
        }

        public Criteria andComfirmStautsGreaterThan(Short value) {
            addCriterion("comfirm_stauts >", value, "comfirmStauts");
            return (Criteria) this;
        }

        public Criteria andComfirmStautsGreaterThanOrEqualTo(Short value) {
            addCriterion("comfirm_stauts >=", value, "comfirmStauts");
            return (Criteria) this;
        }

        public Criteria andComfirmStautsLessThan(Short value) {
            addCriterion("comfirm_stauts <", value, "comfirmStauts");
            return (Criteria) this;
        }

        public Criteria andComfirmStautsLessThanOrEqualTo(Short value) {
            addCriterion("comfirm_stauts <=", value, "comfirmStauts");
            return (Criteria) this;
        }

        public Criteria andComfirmStautsIn(List<Short> values) {
            addCriterion("comfirm_stauts in", values, "comfirmStauts");
            return (Criteria) this;
        }

        public Criteria andComfirmStautsNotIn(List<Short> values) {
            addCriterion("comfirm_stauts not in", values, "comfirmStauts");
            return (Criteria) this;
        }

        public Criteria andComfirmStautsBetween(Short value1, Short value2) {
            addCriterion("comfirm_stauts between", value1, value2, "comfirmStauts");
            return (Criteria) this;
        }

        public Criteria andComfirmStautsNotBetween(Short value1, Short value2) {
            addCriterion("comfirm_stauts not between", value1, value2, "comfirmStauts");
            return (Criteria) this;
        }

        public Criteria andTuangouStatusIsNull() {
            addCriterion("tuangou_status is null");
            return (Criteria) this;
        }

        public Criteria andTuangouStatusIsNotNull() {
            addCriterion("tuangou_status is not null");
            return (Criteria) this;
        }

        public Criteria andTuangouStatusEqualTo(Short value) {
            addCriterion("tuangou_status =", value, "tuangouStatus");
            return (Criteria) this;
        }

        public Criteria andTuangouStatusNotEqualTo(Short value) {
            addCriterion("tuangou_status <>", value, "tuangouStatus");
            return (Criteria) this;
        }

        public Criteria andTuangouStatusGreaterThan(Short value) {
            addCriterion("tuangou_status >", value, "tuangouStatus");
            return (Criteria) this;
        }

        public Criteria andTuangouStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("tuangou_status >=", value, "tuangouStatus");
            return (Criteria) this;
        }

        public Criteria andTuangouStatusLessThan(Short value) {
            addCriterion("tuangou_status <", value, "tuangouStatus");
            return (Criteria) this;
        }

        public Criteria andTuangouStatusLessThanOrEqualTo(Short value) {
            addCriterion("tuangou_status <=", value, "tuangouStatus");
            return (Criteria) this;
        }

        public Criteria andTuangouStatusIn(List<Short> values) {
            addCriterion("tuangou_status in", values, "tuangouStatus");
            return (Criteria) this;
        }

        public Criteria andTuangouStatusNotIn(List<Short> values) {
            addCriterion("tuangou_status not in", values, "tuangouStatus");
            return (Criteria) this;
        }

        public Criteria andTuangouStatusBetween(Short value1, Short value2) {
            addCriterion("tuangou_status between", value1, value2, "tuangouStatus");
            return (Criteria) this;
        }

        public Criteria andTuangouStatusNotBetween(Short value1, Short value2) {
            addCriterion("tuangou_status not between", value1, value2, "tuangouStatus");
            return (Criteria) this;
        }

        public Criteria andIsRealIsNull() {
            addCriterion("is_real is null");
            return (Criteria) this;
        }

        public Criteria andIsRealIsNotNull() {
            addCriterion("is_real is not null");
            return (Criteria) this;
        }

        public Criteria andIsRealEqualTo(Integer value) {
            addCriterion("is_real =", value, "isReal");
            return (Criteria) this;
        }

        public Criteria andIsRealNotEqualTo(Integer value) {
            addCriterion("is_real <>", value, "isReal");
            return (Criteria) this;
        }

        public Criteria andIsRealGreaterThan(Integer value) {
            addCriterion("is_real >", value, "isReal");
            return (Criteria) this;
        }

        public Criteria andIsRealGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_real >=", value, "isReal");
            return (Criteria) this;
        }

        public Criteria andIsRealLessThan(Integer value) {
            addCriterion("is_real <", value, "isReal");
            return (Criteria) this;
        }

        public Criteria andIsRealLessThanOrEqualTo(Integer value) {
            addCriterion("is_real <=", value, "isReal");
            return (Criteria) this;
        }

        public Criteria andIsRealIn(List<Integer> values) {
            addCriterion("is_real in", values, "isReal");
            return (Criteria) this;
        }

        public Criteria andIsRealNotIn(List<Integer> values) {
            addCriterion("is_real not in", values, "isReal");
            return (Criteria) this;
        }

        public Criteria andIsRealBetween(Integer value1, Integer value2) {
            addCriterion("is_real between", value1, value2, "isReal");
            return (Criteria) this;
        }

        public Criteria andIsRealNotBetween(Integer value1, Integer value2) {
            addCriterion("is_real not between", value1, value2, "isReal");
            return (Criteria) this;
        }

        public Criteria andIsTuangouIsNull() {
            addCriterion("is_tuangou is null");
            return (Criteria) this;
        }

        public Criteria andIsTuangouIsNotNull() {
            addCriterion("is_tuangou is not null");
            return (Criteria) this;
        }

        public Criteria andIsTuangouEqualTo(Short value) {
            addCriterion("is_tuangou =", value, "isTuangou");
            return (Criteria) this;
        }

        public Criteria andIsTuangouNotEqualTo(Short value) {
            addCriterion("is_tuangou <>", value, "isTuangou");
            return (Criteria) this;
        }

        public Criteria andIsTuangouGreaterThan(Short value) {
            addCriterion("is_tuangou >", value, "isTuangou");
            return (Criteria) this;
        }

        public Criteria andIsTuangouGreaterThanOrEqualTo(Short value) {
            addCriterion("is_tuangou >=", value, "isTuangou");
            return (Criteria) this;
        }

        public Criteria andIsTuangouLessThan(Short value) {
            addCriterion("is_tuangou <", value, "isTuangou");
            return (Criteria) this;
        }

        public Criteria andIsTuangouLessThanOrEqualTo(Short value) {
            addCriterion("is_tuangou <=", value, "isTuangou");
            return (Criteria) this;
        }

        public Criteria andIsTuangouIn(List<Short> values) {
            addCriterion("is_tuangou in", values, "isTuangou");
            return (Criteria) this;
        }

        public Criteria andIsTuangouNotIn(List<Short> values) {
            addCriterion("is_tuangou not in", values, "isTuangou");
            return (Criteria) this;
        }

        public Criteria andIsTuangouBetween(Short value1, Short value2) {
            addCriterion("is_tuangou between", value1, value2, "isTuangou");
            return (Criteria) this;
        }

        public Criteria andIsTuangouNotBetween(Short value1, Short value2) {
            addCriterion("is_tuangou not between", value1, value2, "isTuangou");
            return (Criteria) this;
        }

        public Criteria andShippingCodeIsNull() {
            addCriterion("shipping_code is null");
            return (Criteria) this;
        }

        public Criteria andShippingCodeIsNotNull() {
            addCriterion("shipping_code is not null");
            return (Criteria) this;
        }

        public Criteria andShippingCodeEqualTo(String value) {
            addCriterion("shipping_code =", value, "shippingCode");
            return (Criteria) this;
        }

        public Criteria andShippingCodeNotEqualTo(String value) {
            addCriterion("shipping_code <>", value, "shippingCode");
            return (Criteria) this;
        }

        public Criteria andShippingCodeGreaterThan(String value) {
            addCriterion("shipping_code >", value, "shippingCode");
            return (Criteria) this;
        }

        public Criteria andShippingCodeGreaterThanOrEqualTo(String value) {
            addCriterion("shipping_code >=", value, "shippingCode");
            return (Criteria) this;
        }

        public Criteria andShippingCodeLessThan(String value) {
            addCriterion("shipping_code <", value, "shippingCode");
            return (Criteria) this;
        }

        public Criteria andShippingCodeLessThanOrEqualTo(String value) {
            addCriterion("shipping_code <=", value, "shippingCode");
            return (Criteria) this;
        }

        public Criteria andShippingCodeLike(String value) {
            addCriterion("shipping_code like", value, "shippingCode");
            return (Criteria) this;
        }

        public Criteria andShippingCodeNotLike(String value) {
            addCriterion("shipping_code not like", value, "shippingCode");
            return (Criteria) this;
        }

        public Criteria andShippingCodeIn(List<String> values) {
            addCriterion("shipping_code in", values, "shippingCode");
            return (Criteria) this;
        }

        public Criteria andShippingCodeNotIn(List<String> values) {
            addCriterion("shipping_code not in", values, "shippingCode");
            return (Criteria) this;
        }

        public Criteria andShippingCodeBetween(String value1, String value2) {
            addCriterion("shipping_code between", value1, value2, "shippingCode");
            return (Criteria) this;
        }

        public Criteria andShippingCodeNotBetween(String value1, String value2) {
            addCriterion("shipping_code not between", value1, value2, "shippingCode");
            return (Criteria) this;
        }

        public Criteria andShippingIdIsNull() {
            addCriterion("shipping_id is null");
            return (Criteria) this;
        }

        public Criteria andShippingIdIsNotNull() {
            addCriterion("shipping_id is not null");
            return (Criteria) this;
        }

        public Criteria andShippingIdEqualTo(String value) {
            addCriterion("shipping_id =", value, "shippingId");
            return (Criteria) this;
        }

        public Criteria andShippingIdNotEqualTo(String value) {
            addCriterion("shipping_id <>", value, "shippingId");
            return (Criteria) this;
        }

        public Criteria andShippingIdGreaterThan(String value) {
            addCriterion("shipping_id >", value, "shippingId");
            return (Criteria) this;
        }

        public Criteria andShippingIdGreaterThanOrEqualTo(String value) {
            addCriterion("shipping_id >=", value, "shippingId");
            return (Criteria) this;
        }

        public Criteria andShippingIdLessThan(String value) {
            addCriterion("shipping_id <", value, "shippingId");
            return (Criteria) this;
        }

        public Criteria andShippingIdLessThanOrEqualTo(String value) {
            addCriterion("shipping_id <=", value, "shippingId");
            return (Criteria) this;
        }

        public Criteria andShippingIdLike(String value) {
            addCriterion("shipping_id like", value, "shippingId");
            return (Criteria) this;
        }

        public Criteria andShippingIdNotLike(String value) {
            addCriterion("shipping_id not like", value, "shippingId");
            return (Criteria) this;
        }

        public Criteria andShippingIdIn(List<String> values) {
            addCriterion("shipping_id in", values, "shippingId");
            return (Criteria) this;
        }

        public Criteria andShippingIdNotIn(List<String> values) {
            addCriterion("shipping_id not in", values, "shippingId");
            return (Criteria) this;
        }

        public Criteria andShippingIdBetween(String value1, String value2) {
            addCriterion("shipping_id between", value1, value2, "shippingId");
            return (Criteria) this;
        }

        public Criteria andShippingIdNotBetween(String value1, String value2) {
            addCriterion("shipping_id not between", value1, value2, "shippingId");
            return (Criteria) this;
        }

        public Criteria andShippingSnIsNull() {
            addCriterion("shipping_sn is null");
            return (Criteria) this;
        }

        public Criteria andShippingSnIsNotNull() {
            addCriterion("shipping_sn is not null");
            return (Criteria) this;
        }

        public Criteria andShippingSnEqualTo(String value) {
            addCriterion("shipping_sn =", value, "shippingSn");
            return (Criteria) this;
        }

        public Criteria andShippingSnNotEqualTo(String value) {
            addCriterion("shipping_sn <>", value, "shippingSn");
            return (Criteria) this;
        }

        public Criteria andShippingSnGreaterThan(String value) {
            addCriterion("shipping_sn >", value, "shippingSn");
            return (Criteria) this;
        }

        public Criteria andShippingSnGreaterThanOrEqualTo(String value) {
            addCriterion("shipping_sn >=", value, "shippingSn");
            return (Criteria) this;
        }

        public Criteria andShippingSnLessThan(String value) {
            addCriterion("shipping_sn <", value, "shippingSn");
            return (Criteria) this;
        }

        public Criteria andShippingSnLessThanOrEqualTo(String value) {
            addCriterion("shipping_sn <=", value, "shippingSn");
            return (Criteria) this;
        }

        public Criteria andShippingSnLike(String value) {
            addCriterion("shipping_sn like", value, "shippingSn");
            return (Criteria) this;
        }

        public Criteria andShippingSnNotLike(String value) {
            addCriterion("shipping_sn not like", value, "shippingSn");
            return (Criteria) this;
        }

        public Criteria andShippingSnIn(List<String> values) {
            addCriterion("shipping_sn in", values, "shippingSn");
            return (Criteria) this;
        }

        public Criteria andShippingSnNotIn(List<String> values) {
            addCriterion("shipping_sn not in", values, "shippingSn");
            return (Criteria) this;
        }

        public Criteria andShippingSnBetween(String value1, String value2) {
            addCriterion("shipping_sn between", value1, value2, "shippingSn");
            return (Criteria) this;
        }

        public Criteria andShippingSnNotBetween(String value1, String value2) {
            addCriterion("shipping_sn not between", value1, value2, "shippingSn");
            return (Criteria) this;
        }

        public Criteria andPayIdIsNull() {
            addCriterion("pay_id is null");
            return (Criteria) this;
        }

        public Criteria andPayIdIsNotNull() {
            addCriterion("pay_id is not null");
            return (Criteria) this;
        }

        public Criteria andPayIdEqualTo(Integer value) {
            addCriterion("pay_id =", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdNotEqualTo(Integer value) {
            addCriterion("pay_id <>", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdGreaterThan(Integer value) {
            addCriterion("pay_id >", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("pay_id >=", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdLessThan(Integer value) {
            addCriterion("pay_id <", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdLessThanOrEqualTo(Integer value) {
            addCriterion("pay_id <=", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdIn(List<Integer> values) {
            addCriterion("pay_id in", values, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdNotIn(List<Integer> values) {
            addCriterion("pay_id not in", values, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdBetween(Integer value1, Integer value2) {
            addCriterion("pay_id between", value1, value2, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdNotBetween(Integer value1, Integer value2) {
            addCriterion("pay_id not between", value1, value2, "payId");
            return (Criteria) this;
        }

        public Criteria andBackTimeIsNull() {
            addCriterion("back_time is null");
            return (Criteria) this;
        }

        public Criteria andBackTimeIsNotNull() {
            addCriterion("back_time is not null");
            return (Criteria) this;
        }

        public Criteria andBackTimeEqualTo(Integer value) {
            addCriterion("back_time =", value, "backTime");
            return (Criteria) this;
        }

        public Criteria andBackTimeNotEqualTo(Integer value) {
            addCriterion("back_time <>", value, "backTime");
            return (Criteria) this;
        }

        public Criteria andBackTimeGreaterThan(Integer value) {
            addCriterion("back_time >", value, "backTime");
            return (Criteria) this;
        }

        public Criteria andBackTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("back_time >=", value, "backTime");
            return (Criteria) this;
        }

        public Criteria andBackTimeLessThan(Integer value) {
            addCriterion("back_time <", value, "backTime");
            return (Criteria) this;
        }

        public Criteria andBackTimeLessThanOrEqualTo(Integer value) {
            addCriterion("back_time <=", value, "backTime");
            return (Criteria) this;
        }

        public Criteria andBackTimeIn(List<Integer> values) {
            addCriterion("back_time in", values, "backTime");
            return (Criteria) this;
        }

        public Criteria andBackTimeNotIn(List<Integer> values) {
            addCriterion("back_time not in", values, "backTime");
            return (Criteria) this;
        }

        public Criteria andBackTimeBetween(Integer value1, Integer value2) {
            addCriterion("back_time between", value1, value2, "backTime");
            return (Criteria) this;
        }

        public Criteria andBackTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("back_time not between", value1, value2, "backTime");
            return (Criteria) this;
        }

        public Criteria andShippingTimeIsNull() {
            addCriterion("shipping_time is null");
            return (Criteria) this;
        }

        public Criteria andShippingTimeIsNotNull() {
            addCriterion("shipping_time is not null");
            return (Criteria) this;
        }

        public Criteria andShippingTimeEqualTo(Integer value) {
            addCriterion("shipping_time =", value, "shippingTime");
            return (Criteria) this;
        }

        public Criteria andShippingTimeNotEqualTo(Integer value) {
            addCriterion("shipping_time <>", value, "shippingTime");
            return (Criteria) this;
        }

        public Criteria andShippingTimeGreaterThan(Integer value) {
            addCriterion("shipping_time >", value, "shippingTime");
            return (Criteria) this;
        }

        public Criteria andShippingTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("shipping_time >=", value, "shippingTime");
            return (Criteria) this;
        }

        public Criteria andShippingTimeLessThan(Integer value) {
            addCriterion("shipping_time <", value, "shippingTime");
            return (Criteria) this;
        }

        public Criteria andShippingTimeLessThanOrEqualTo(Integer value) {
            addCriterion("shipping_time <=", value, "shippingTime");
            return (Criteria) this;
        }

        public Criteria andShippingTimeIn(List<Integer> values) {
            addCriterion("shipping_time in", values, "shippingTime");
            return (Criteria) this;
        }

        public Criteria andShippingTimeNotIn(List<Integer> values) {
            addCriterion("shipping_time not in", values, "shippingTime");
            return (Criteria) this;
        }

        public Criteria andShippingTimeBetween(Integer value1, Integer value2) {
            addCriterion("shipping_time between", value1, value2, "shippingTime");
            return (Criteria) this;
        }

        public Criteria andShippingTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("shipping_time not between", value1, value2, "shippingTime");
            return (Criteria) this;
        }

        public Criteria andComfirmTimeIsNull() {
            addCriterion("comfirm_time is null");
            return (Criteria) this;
        }

        public Criteria andComfirmTimeIsNotNull() {
            addCriterion("comfirm_time is not null");
            return (Criteria) this;
        }

        public Criteria andComfirmTimeEqualTo(Integer value) {
            addCriterion("comfirm_time =", value, "comfirmTime");
            return (Criteria) this;
        }

        public Criteria andComfirmTimeNotEqualTo(Integer value) {
            addCriterion("comfirm_time <>", value, "comfirmTime");
            return (Criteria) this;
        }

        public Criteria andComfirmTimeGreaterThan(Integer value) {
            addCriterion("comfirm_time >", value, "comfirmTime");
            return (Criteria) this;
        }

        public Criteria andComfirmTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("comfirm_time >=", value, "comfirmTime");
            return (Criteria) this;
        }

        public Criteria andComfirmTimeLessThan(Integer value) {
            addCriterion("comfirm_time <", value, "comfirmTime");
            return (Criteria) this;
        }

        public Criteria andComfirmTimeLessThanOrEqualTo(Integer value) {
            addCriterion("comfirm_time <=", value, "comfirmTime");
            return (Criteria) this;
        }

        public Criteria andComfirmTimeIn(List<Integer> values) {
            addCriterion("comfirm_time in", values, "comfirmTime");
            return (Criteria) this;
        }

        public Criteria andComfirmTimeNotIn(List<Integer> values) {
            addCriterion("comfirm_time not in", values, "comfirmTime");
            return (Criteria) this;
        }

        public Criteria andComfirmTimeBetween(Integer value1, Integer value2) {
            addCriterion("comfirm_time between", value1, value2, "comfirmTime");
            return (Criteria) this;
        }

        public Criteria andComfirmTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("comfirm_time not between", value1, value2, "comfirmTime");
            return (Criteria) this;
        }

        public Criteria andBackTypeIsNull() {
            addCriterion("back_type is null");
            return (Criteria) this;
        }

        public Criteria andBackTypeIsNotNull() {
            addCriterion("back_type is not null");
            return (Criteria) this;
        }

        public Criteria andBackTypeEqualTo(Integer value) {
            addCriterion("back_type =", value, "backType");
            return (Criteria) this;
        }

        public Criteria andBackTypeNotEqualTo(Integer value) {
            addCriterion("back_type <>", value, "backType");
            return (Criteria) this;
        }

        public Criteria andBackTypeGreaterThan(Integer value) {
            addCriterion("back_type >", value, "backType");
            return (Criteria) this;
        }

        public Criteria andBackTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("back_type >=", value, "backType");
            return (Criteria) this;
        }

        public Criteria andBackTypeLessThan(Integer value) {
            addCriterion("back_type <", value, "backType");
            return (Criteria) this;
        }

        public Criteria andBackTypeLessThanOrEqualTo(Integer value) {
            addCriterion("back_type <=", value, "backType");
            return (Criteria) this;
        }

        public Criteria andBackTypeIn(List<Integer> values) {
            addCriterion("back_type in", values, "backType");
            return (Criteria) this;
        }

        public Criteria andBackTypeNotIn(List<Integer> values) {
            addCriterion("back_type not in", values, "backType");
            return (Criteria) this;
        }

        public Criteria andBackTypeBetween(Integer value1, Integer value2) {
            addCriterion("back_type between", value1, value2, "backType");
            return (Criteria) this;
        }

        public Criteria andBackTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("back_type not between", value1, value2, "backType");
            return (Criteria) this;
        }

        public Criteria andBackShippingAddtimeIsNull() {
            addCriterion("back_shipping_addtime is null");
            return (Criteria) this;
        }

        public Criteria andBackShippingAddtimeIsNotNull() {
            addCriterion("back_shipping_addtime is not null");
            return (Criteria) this;
        }

        public Criteria andBackShippingAddtimeEqualTo(Integer value) {
            addCriterion("back_shipping_addtime =", value, "backShippingAddtime");
            return (Criteria) this;
        }

        public Criteria andBackShippingAddtimeNotEqualTo(Integer value) {
            addCriterion("back_shipping_addtime <>", value, "backShippingAddtime");
            return (Criteria) this;
        }

        public Criteria andBackShippingAddtimeGreaterThan(Integer value) {
            addCriterion("back_shipping_addtime >", value, "backShippingAddtime");
            return (Criteria) this;
        }

        public Criteria andBackShippingAddtimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("back_shipping_addtime >=", value, "backShippingAddtime");
            return (Criteria) this;
        }

        public Criteria andBackShippingAddtimeLessThan(Integer value) {
            addCriterion("back_shipping_addtime <", value, "backShippingAddtime");
            return (Criteria) this;
        }

        public Criteria andBackShippingAddtimeLessThanOrEqualTo(Integer value) {
            addCriterion("back_shipping_addtime <=", value, "backShippingAddtime");
            return (Criteria) this;
        }

        public Criteria andBackShippingAddtimeIn(List<Integer> values) {
            addCriterion("back_shipping_addtime in", values, "backShippingAddtime");
            return (Criteria) this;
        }

        public Criteria andBackShippingAddtimeNotIn(List<Integer> values) {
            addCriterion("back_shipping_addtime not in", values, "backShippingAddtime");
            return (Criteria) this;
        }

        public Criteria andBackShippingAddtimeBetween(Integer value1, Integer value2) {
            addCriterion("back_shipping_addtime between", value1, value2, "backShippingAddtime");
            return (Criteria) this;
        }

        public Criteria andBackShippingAddtimeNotBetween(Integer value1, Integer value2) {
            addCriterion("back_shipping_addtime not between", value1, value2, "backShippingAddtime");
            return (Criteria) this;
        }

        public Criteria andBackShippingCodeIsNull() {
            addCriterion("back_shipping_code is null");
            return (Criteria) this;
        }

        public Criteria andBackShippingCodeIsNotNull() {
            addCriterion("back_shipping_code is not null");
            return (Criteria) this;
        }

        public Criteria andBackShippingCodeEqualTo(String value) {
            addCriterion("back_shipping_code =", value, "backShippingCode");
            return (Criteria) this;
        }

        public Criteria andBackShippingCodeNotEqualTo(String value) {
            addCriterion("back_shipping_code <>", value, "backShippingCode");
            return (Criteria) this;
        }

        public Criteria andBackShippingCodeGreaterThan(String value) {
            addCriterion("back_shipping_code >", value, "backShippingCode");
            return (Criteria) this;
        }

        public Criteria andBackShippingCodeGreaterThanOrEqualTo(String value) {
            addCriterion("back_shipping_code >=", value, "backShippingCode");
            return (Criteria) this;
        }

        public Criteria andBackShippingCodeLessThan(String value) {
            addCriterion("back_shipping_code <", value, "backShippingCode");
            return (Criteria) this;
        }

        public Criteria andBackShippingCodeLessThanOrEqualTo(String value) {
            addCriterion("back_shipping_code <=", value, "backShippingCode");
            return (Criteria) this;
        }

        public Criteria andBackShippingCodeLike(String value) {
            addCriterion("back_shipping_code like", value, "backShippingCode");
            return (Criteria) this;
        }

        public Criteria andBackShippingCodeNotLike(String value) {
            addCriterion("back_shipping_code not like", value, "backShippingCode");
            return (Criteria) this;
        }

        public Criteria andBackShippingCodeIn(List<String> values) {
            addCriterion("back_shipping_code in", values, "backShippingCode");
            return (Criteria) this;
        }

        public Criteria andBackShippingCodeNotIn(List<String> values) {
            addCriterion("back_shipping_code not in", values, "backShippingCode");
            return (Criteria) this;
        }

        public Criteria andBackShippingCodeBetween(String value1, String value2) {
            addCriterion("back_shipping_code between", value1, value2, "backShippingCode");
            return (Criteria) this;
        }

        public Criteria andBackShippingCodeNotBetween(String value1, String value2) {
            addCriterion("back_shipping_code not between", value1, value2, "backShippingCode");
            return (Criteria) this;
        }

        public Criteria andBackShippingIdIsNull() {
            addCriterion("back_shipping_id is null");
            return (Criteria) this;
        }

        public Criteria andBackShippingIdIsNotNull() {
            addCriterion("back_shipping_id is not null");
            return (Criteria) this;
        }

        public Criteria andBackShippingIdEqualTo(String value) {
            addCriterion("back_shipping_id =", value, "backShippingId");
            return (Criteria) this;
        }

        public Criteria andBackShippingIdNotEqualTo(String value) {
            addCriterion("back_shipping_id <>", value, "backShippingId");
            return (Criteria) this;
        }

        public Criteria andBackShippingIdGreaterThan(String value) {
            addCriterion("back_shipping_id >", value, "backShippingId");
            return (Criteria) this;
        }

        public Criteria andBackShippingIdGreaterThanOrEqualTo(String value) {
            addCriterion("back_shipping_id >=", value, "backShippingId");
            return (Criteria) this;
        }

        public Criteria andBackShippingIdLessThan(String value) {
            addCriterion("back_shipping_id <", value, "backShippingId");
            return (Criteria) this;
        }

        public Criteria andBackShippingIdLessThanOrEqualTo(String value) {
            addCriterion("back_shipping_id <=", value, "backShippingId");
            return (Criteria) this;
        }

        public Criteria andBackShippingIdLike(String value) {
            addCriterion("back_shipping_id like", value, "backShippingId");
            return (Criteria) this;
        }

        public Criteria andBackShippingIdNotLike(String value) {
            addCriterion("back_shipping_id not like", value, "backShippingId");
            return (Criteria) this;
        }

        public Criteria andBackShippingIdIn(List<String> values) {
            addCriterion("back_shipping_id in", values, "backShippingId");
            return (Criteria) this;
        }

        public Criteria andBackShippingIdNotIn(List<String> values) {
            addCriterion("back_shipping_id not in", values, "backShippingId");
            return (Criteria) this;
        }

        public Criteria andBackShippingIdBetween(String value1, String value2) {
            addCriterion("back_shipping_id between", value1, value2, "backShippingId");
            return (Criteria) this;
        }

        public Criteria andBackShippingIdNotBetween(String value1, String value2) {
            addCriterion("back_shipping_id not between", value1, value2, "backShippingId");
            return (Criteria) this;
        }

        public Criteria andBackAddressIsNull() {
            addCriterion("back_address is null");
            return (Criteria) this;
        }

        public Criteria andBackAddressIsNotNull() {
            addCriterion("back_address is not null");
            return (Criteria) this;
        }

        public Criteria andBackAddressEqualTo(String value) {
            addCriterion("back_address =", value, "backAddress");
            return (Criteria) this;
        }

        public Criteria andBackAddressNotEqualTo(String value) {
            addCriterion("back_address <>", value, "backAddress");
            return (Criteria) this;
        }

        public Criteria andBackAddressGreaterThan(String value) {
            addCriterion("back_address >", value, "backAddress");
            return (Criteria) this;
        }

        public Criteria andBackAddressGreaterThanOrEqualTo(String value) {
            addCriterion("back_address >=", value, "backAddress");
            return (Criteria) this;
        }

        public Criteria andBackAddressLessThan(String value) {
            addCriterion("back_address <", value, "backAddress");
            return (Criteria) this;
        }

        public Criteria andBackAddressLessThanOrEqualTo(String value) {
            addCriterion("back_address <=", value, "backAddress");
            return (Criteria) this;
        }

        public Criteria andBackAddressLike(String value) {
            addCriterion("back_address like", value, "backAddress");
            return (Criteria) this;
        }

        public Criteria andBackAddressNotLike(String value) {
            addCriterion("back_address not like", value, "backAddress");
            return (Criteria) this;
        }

        public Criteria andBackAddressIn(List<String> values) {
            addCriterion("back_address in", values, "backAddress");
            return (Criteria) this;
        }

        public Criteria andBackAddressNotIn(List<String> values) {
            addCriterion("back_address not in", values, "backAddress");
            return (Criteria) this;
        }

        public Criteria andBackAddressBetween(String value1, String value2) {
            addCriterion("back_address between", value1, value2, "backAddress");
            return (Criteria) this;
        }

        public Criteria andBackAddressNotBetween(String value1, String value2) {
            addCriterion("back_address not between", value1, value2, "backAddress");
            return (Criteria) this;
        }

        public Criteria andBackFeeIsNull() {
            addCriterion("back_fee is null");
            return (Criteria) this;
        }

        public Criteria andBackFeeIsNotNull() {
            addCriterion("back_fee is not null");
            return (Criteria) this;
        }

        public Criteria andBackFeeEqualTo(BigDecimal value) {
            addCriterion("back_fee =", value, "backFee");
            return (Criteria) this;
        }

        public Criteria andBackFeeNotEqualTo(BigDecimal value) {
            addCriterion("back_fee <>", value, "backFee");
            return (Criteria) this;
        }

        public Criteria andBackFeeGreaterThan(BigDecimal value) {
            addCriterion("back_fee >", value, "backFee");
            return (Criteria) this;
        }

        public Criteria andBackFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("back_fee >=", value, "backFee");
            return (Criteria) this;
        }

        public Criteria andBackFeeLessThan(BigDecimal value) {
            addCriterion("back_fee <", value, "backFee");
            return (Criteria) this;
        }

        public Criteria andBackFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("back_fee <=", value, "backFee");
            return (Criteria) this;
        }

        public Criteria andBackFeeIn(List<BigDecimal> values) {
            addCriterion("back_fee in", values, "backFee");
            return (Criteria) this;
        }

        public Criteria andBackFeeNotIn(List<BigDecimal> values) {
            addCriterion("back_fee not in", values, "backFee");
            return (Criteria) this;
        }

        public Criteria andBackFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("back_fee between", value1, value2, "backFee");
            return (Criteria) this;
        }

        public Criteria andBackFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("back_fee not between", value1, value2, "backFee");
            return (Criteria) this;
        }

        public Criteria andActionIsNull() {
            addCriterion("action is null");
            return (Criteria) this;
        }

        public Criteria andActionIsNotNull() {
            addCriterion("action is not null");
            return (Criteria) this;
        }

        public Criteria andActionEqualTo(String value) {
            addCriterion("action =", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionNotEqualTo(String value) {
            addCriterion("action <>", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionGreaterThan(String value) {
            addCriterion("action >", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionGreaterThanOrEqualTo(String value) {
            addCriterion("action >=", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionLessThan(String value) {
            addCriterion("action <", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionLessThanOrEqualTo(String value) {
            addCriterion("action <=", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionLike(String value) {
            addCriterion("action like", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionNotLike(String value) {
            addCriterion("action not like", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionIn(List<String> values) {
            addCriterion("action in", values, "action");
            return (Criteria) this;
        }

        public Criteria andActionNotIn(List<String> values) {
            addCriterion("action not in", values, "action");
            return (Criteria) this;
        }

        public Criteria andActionBetween(String value1, String value2) {
            addCriterion("action between", value1, value2, "action");
            return (Criteria) this;
        }

        public Criteria andActionNotBetween(String value1, String value2) {
            addCriterion("action not between", value1, value2, "action");
            return (Criteria) this;
        }

        public Criteria andMsgIsNull() {
            addCriterion("msg is null");
            return (Criteria) this;
        }

        public Criteria andMsgIsNotNull() {
            addCriterion("msg is not null");
            return (Criteria) this;
        }

        public Criteria andMsgEqualTo(String value) {
            addCriterion("msg =", value, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgNotEqualTo(String value) {
            addCriterion("msg <>", value, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgGreaterThan(String value) {
            addCriterion("msg >", value, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgGreaterThanOrEqualTo(String value) {
            addCriterion("msg >=", value, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgLessThan(String value) {
            addCriterion("msg <", value, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgLessThanOrEqualTo(String value) {
            addCriterion("msg <=", value, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgLike(String value) {
            addCriterion("msg like", value, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgNotLike(String value) {
            addCriterion("msg not like", value, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgIn(List<String> values) {
            addCriterion("msg in", values, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgNotIn(List<String> values) {
            addCriterion("msg not in", values, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgBetween(String value1, String value2) {
            addCriterion("msg between", value1, value2, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgNotBetween(String value1, String value2) {
            addCriterion("msg not between", value1, value2, "msg");
            return (Criteria) this;
        }

        public Criteria andBiaozhuIsNull() {
            addCriterion("biaozhu is null");
            return (Criteria) this;
        }

        public Criteria andBiaozhuIsNotNull() {
            addCriterion("biaozhu is not null");
            return (Criteria) this;
        }

        public Criteria andBiaozhuEqualTo(Integer value) {
            addCriterion("biaozhu =", value, "biaozhu");
            return (Criteria) this;
        }

        public Criteria andBiaozhuNotEqualTo(Integer value) {
            addCriterion("biaozhu <>", value, "biaozhu");
            return (Criteria) this;
        }

        public Criteria andBiaozhuGreaterThan(Integer value) {
            addCriterion("biaozhu >", value, "biaozhu");
            return (Criteria) this;
        }

        public Criteria andBiaozhuGreaterThanOrEqualTo(Integer value) {
            addCriterion("biaozhu >=", value, "biaozhu");
            return (Criteria) this;
        }

        public Criteria andBiaozhuLessThan(Integer value) {
            addCriterion("biaozhu <", value, "biaozhu");
            return (Criteria) this;
        }

        public Criteria andBiaozhuLessThanOrEqualTo(Integer value) {
            addCriterion("biaozhu <=", value, "biaozhu");
            return (Criteria) this;
        }

        public Criteria andBiaozhuIn(List<Integer> values) {
            addCriterion("biaozhu in", values, "biaozhu");
            return (Criteria) this;
        }

        public Criteria andBiaozhuNotIn(List<Integer> values) {
            addCriterion("biaozhu not in", values, "biaozhu");
            return (Criteria) this;
        }

        public Criteria andBiaozhuBetween(Integer value1, Integer value2) {
            addCriterion("biaozhu between", value1, value2, "biaozhu");
            return (Criteria) this;
        }

        public Criteria andBiaozhuNotBetween(Integer value1, Integer value2) {
            addCriterion("biaozhu not between", value1, value2, "biaozhu");
            return (Criteria) this;
        }

        public Criteria andContentBackIsNull() {
            addCriterion("content_back is null");
            return (Criteria) this;
        }

        public Criteria andContentBackIsNotNull() {
            addCriterion("content_back is not null");
            return (Criteria) this;
        }

        public Criteria andContentBackEqualTo(String value) {
            addCriterion("content_back =", value, "contentBack");
            return (Criteria) this;
        }

        public Criteria andContentBackNotEqualTo(String value) {
            addCriterion("content_back <>", value, "contentBack");
            return (Criteria) this;
        }

        public Criteria andContentBackGreaterThan(String value) {
            addCriterion("content_back >", value, "contentBack");
            return (Criteria) this;
        }

        public Criteria andContentBackGreaterThanOrEqualTo(String value) {
            addCriterion("content_back >=", value, "contentBack");
            return (Criteria) this;
        }

        public Criteria andContentBackLessThan(String value) {
            addCriterion("content_back <", value, "contentBack");
            return (Criteria) this;
        }

        public Criteria andContentBackLessThanOrEqualTo(String value) {
            addCriterion("content_back <=", value, "contentBack");
            return (Criteria) this;
        }

        public Criteria andContentBackLike(String value) {
            addCriterion("content_back like", value, "contentBack");
            return (Criteria) this;
        }

        public Criteria andContentBackNotLike(String value) {
            addCriterion("content_back not like", value, "contentBack");
            return (Criteria) this;
        }

        public Criteria andContentBackIn(List<String> values) {
            addCriterion("content_back in", values, "contentBack");
            return (Criteria) this;
        }

        public Criteria andContentBackNotIn(List<String> values) {
            addCriterion("content_back not in", values, "contentBack");
            return (Criteria) this;
        }

        public Criteria andContentBackBetween(String value1, String value2) {
            addCriterion("content_back between", value1, value2, "contentBack");
            return (Criteria) this;
        }

        public Criteria andContentBackNotBetween(String value1, String value2) {
            addCriterion("content_back not between", value1, value2, "contentBack");
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

        public Criteria andBusinessIdIsNull() {
            addCriterion("business_id is null");
            return (Criteria) this;
        }

        public Criteria andBusinessIdIsNotNull() {
            addCriterion("business_id is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessIdEqualTo(Integer value) {
            addCriterion("business_id =", value, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdNotEqualTo(Integer value) {
            addCriterion("business_id <>", value, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdGreaterThan(Integer value) {
            addCriterion("business_id >", value, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("business_id >=", value, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdLessThan(Integer value) {
            addCriterion("business_id <", value, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdLessThanOrEqualTo(Integer value) {
            addCriterion("business_id <=", value, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdIn(List<Integer> values) {
            addCriterion("business_id in", values, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdNotIn(List<Integer> values) {
            addCriterion("business_id not in", values, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdBetween(Integer value1, Integer value2) {
            addCriterion("business_id between", value1, value2, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdNotBetween(Integer value1, Integer value2) {
            addCriterion("business_id not between", value1, value2, "businessId");
            return (Criteria) this;
        }

        public Criteria andScheduleIdIsNull() {
            addCriterion("schedule_id is null");
            return (Criteria) this;
        }

        public Criteria andScheduleIdIsNotNull() {
            addCriterion("schedule_id is not null");
            return (Criteria) this;
        }

        public Criteria andScheduleIdEqualTo(Integer value) {
            addCriterion("schedule_id =", value, "scheduleId");
            return (Criteria) this;
        }

        public Criteria andScheduleIdNotEqualTo(Integer value) {
            addCriterion("schedule_id <>", value, "scheduleId");
            return (Criteria) this;
        }

        public Criteria andScheduleIdGreaterThan(Integer value) {
            addCriterion("schedule_id >", value, "scheduleId");
            return (Criteria) this;
        }

        public Criteria andScheduleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("schedule_id >=", value, "scheduleId");
            return (Criteria) this;
        }

        public Criteria andScheduleIdLessThan(Integer value) {
            addCriterion("schedule_id <", value, "scheduleId");
            return (Criteria) this;
        }

        public Criteria andScheduleIdLessThanOrEqualTo(Integer value) {
            addCriterion("schedule_id <=", value, "scheduleId");
            return (Criteria) this;
        }

        public Criteria andScheduleIdIn(List<Integer> values) {
            addCriterion("schedule_id in", values, "scheduleId");
            return (Criteria) this;
        }

        public Criteria andScheduleIdNotIn(List<Integer> values) {
            addCriterion("schedule_id not in", values, "scheduleId");
            return (Criteria) this;
        }

        public Criteria andScheduleIdBetween(Integer value1, Integer value2) {
            addCriterion("schedule_id between", value1, value2, "scheduleId");
            return (Criteria) this;
        }

        public Criteria andScheduleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("schedule_id not between", value1, value2, "scheduleId");
            return (Criteria) this;
        }

        public Criteria andServiceShopIdIsNull() {
            addCriterion("service_shop_id is null");
            return (Criteria) this;
        }

        public Criteria andServiceShopIdIsNotNull() {
            addCriterion("service_shop_id is not null");
            return (Criteria) this;
        }

        public Criteria andServiceShopIdEqualTo(Integer value) {
            addCriterion("service_shop_id =", value, "serviceShopId");
            return (Criteria) this;
        }

        public Criteria andServiceShopIdNotEqualTo(Integer value) {
            addCriterion("service_shop_id <>", value, "serviceShopId");
            return (Criteria) this;
        }

        public Criteria andServiceShopIdGreaterThan(Integer value) {
            addCriterion("service_shop_id >", value, "serviceShopId");
            return (Criteria) this;
        }

        public Criteria andServiceShopIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("service_shop_id >=", value, "serviceShopId");
            return (Criteria) this;
        }

        public Criteria andServiceShopIdLessThan(Integer value) {
            addCriterion("service_shop_id <", value, "serviceShopId");
            return (Criteria) this;
        }

        public Criteria andServiceShopIdLessThanOrEqualTo(Integer value) {
            addCriterion("service_shop_id <=", value, "serviceShopId");
            return (Criteria) this;
        }

        public Criteria andServiceShopIdIn(List<Integer> values) {
            addCriterion("service_shop_id in", values, "serviceShopId");
            return (Criteria) this;
        }

        public Criteria andServiceShopIdNotIn(List<Integer> values) {
            addCriterion("service_shop_id not in", values, "serviceShopId");
            return (Criteria) this;
        }

        public Criteria andServiceShopIdBetween(Integer value1, Integer value2) {
            addCriterion("service_shop_id between", value1, value2, "serviceShopId");
            return (Criteria) this;
        }

        public Criteria andServiceShopIdNotBetween(Integer value1, Integer value2) {
            addCriterion("service_shop_id not between", value1, value2, "serviceShopId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdIsNull() {
            addCriterion("teacher_id is null");
            return (Criteria) this;
        }

        public Criteria andTeacherIdIsNotNull() {
            addCriterion("teacher_id is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherIdEqualTo(Integer value) {
            addCriterion("teacher_id =", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdNotEqualTo(Integer value) {
            addCriterion("teacher_id <>", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdGreaterThan(Integer value) {
            addCriterion("teacher_id >", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("teacher_id >=", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdLessThan(Integer value) {
            addCriterion("teacher_id <", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdLessThanOrEqualTo(Integer value) {
            addCriterion("teacher_id <=", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdIn(List<Integer> values) {
            addCriterion("teacher_id in", values, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdNotIn(List<Integer> values) {
            addCriterion("teacher_id not in", values, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdBetween(Integer value1, Integer value2) {
            addCriterion("teacher_id between", value1, value2, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdNotBetween(Integer value1, Integer value2) {
            addCriterion("teacher_id not between", value1, value2, "teacherId");
            return (Criteria) this;
        }

        public Criteria andScheduleDateIsNull() {
            addCriterion("schedule_date is null");
            return (Criteria) this;
        }

        public Criteria andScheduleDateIsNotNull() {
            addCriterion("schedule_date is not null");
            return (Criteria) this;
        }

        public Criteria andScheduleDateEqualTo(String value) {
            addCriterion("schedule_date =", value, "scheduleDate");
            return (Criteria) this;
        }

        public Criteria andScheduleDateNotEqualTo(String value) {
            addCriterion("schedule_date <>", value, "scheduleDate");
            return (Criteria) this;
        }

        public Criteria andScheduleDateGreaterThan(String value) {
            addCriterion("schedule_date >", value, "scheduleDate");
            return (Criteria) this;
        }

        public Criteria andScheduleDateGreaterThanOrEqualTo(String value) {
            addCriterion("schedule_date >=", value, "scheduleDate");
            return (Criteria) this;
        }

        public Criteria andScheduleDateLessThan(String value) {
            addCriterion("schedule_date <", value, "scheduleDate");
            return (Criteria) this;
        }

        public Criteria andScheduleDateLessThanOrEqualTo(String value) {
            addCriterion("schedule_date <=", value, "scheduleDate");
            return (Criteria) this;
        }

        public Criteria andScheduleDateLike(String value) {
            addCriterion("schedule_date like", value, "scheduleDate");
            return (Criteria) this;
        }

        public Criteria andScheduleDateNotLike(String value) {
            addCriterion("schedule_date not like", value, "scheduleDate");
            return (Criteria) this;
        }

        public Criteria andScheduleDateIn(List<String> values) {
            addCriterion("schedule_date in", values, "scheduleDate");
            return (Criteria) this;
        }

        public Criteria andScheduleDateNotIn(List<String> values) {
            addCriterion("schedule_date not in", values, "scheduleDate");
            return (Criteria) this;
        }

        public Criteria andScheduleDateBetween(String value1, String value2) {
            addCriterion("schedule_date between", value1, value2, "scheduleDate");
            return (Criteria) this;
        }

        public Criteria andScheduleDateNotBetween(String value1, String value2) {
            addCriterion("schedule_date not between", value1, value2, "scheduleDate");
            return (Criteria) this;
        }

        public Criteria andScheduleTimepartIsNull() {
            addCriterion("schedule_timepart is null");
            return (Criteria) this;
        }

        public Criteria andScheduleTimepartIsNotNull() {
            addCriterion("schedule_timepart is not null");
            return (Criteria) this;
        }

        public Criteria andScheduleTimepartEqualTo(String value) {
            addCriterion("schedule_timepart =", value, "scheduleTimepart");
            return (Criteria) this;
        }

        public Criteria andScheduleTimepartNotEqualTo(String value) {
            addCriterion("schedule_timepart <>", value, "scheduleTimepart");
            return (Criteria) this;
        }

        public Criteria andScheduleTimepartGreaterThan(String value) {
            addCriterion("schedule_timepart >", value, "scheduleTimepart");
            return (Criteria) this;
        }

        public Criteria andScheduleTimepartGreaterThanOrEqualTo(String value) {
            addCriterion("schedule_timepart >=", value, "scheduleTimepart");
            return (Criteria) this;
        }

        public Criteria andScheduleTimepartLessThan(String value) {
            addCriterion("schedule_timepart <", value, "scheduleTimepart");
            return (Criteria) this;
        }

        public Criteria andScheduleTimepartLessThanOrEqualTo(String value) {
            addCriterion("schedule_timepart <=", value, "scheduleTimepart");
            return (Criteria) this;
        }

        public Criteria andScheduleTimepartLike(String value) {
            addCriterion("schedule_timepart like", value, "scheduleTimepart");
            return (Criteria) this;
        }

        public Criteria andScheduleTimepartNotLike(String value) {
            addCriterion("schedule_timepart not like", value, "scheduleTimepart");
            return (Criteria) this;
        }

        public Criteria andScheduleTimepartIn(List<String> values) {
            addCriterion("schedule_timepart in", values, "scheduleTimepart");
            return (Criteria) this;
        }

        public Criteria andScheduleTimepartNotIn(List<String> values) {
            addCriterion("schedule_timepart not in", values, "scheduleTimepart");
            return (Criteria) this;
        }

        public Criteria andScheduleTimepartBetween(String value1, String value2) {
            addCriterion("schedule_timepart between", value1, value2, "scheduleTimepart");
            return (Criteria) this;
        }

        public Criteria andScheduleTimepartNotBetween(String value1, String value2) {
            addCriterion("schedule_timepart not between", value1, value2, "scheduleTimepart");
            return (Criteria) this;
        }

        public Criteria andScheduleTimepartArrIsNull() {
            addCriterion("schedule_timepart_arr is null");
            return (Criteria) this;
        }

        public Criteria andScheduleTimepartArrIsNotNull() {
            addCriterion("schedule_timepart_arr is not null");
            return (Criteria) this;
        }

        public Criteria andScheduleTimepartArrEqualTo(String value) {
            addCriterion("schedule_timepart_arr =", value, "scheduleTimepartArr");
            return (Criteria) this;
        }

        public Criteria andScheduleTimepartArrNotEqualTo(String value) {
            addCriterion("schedule_timepart_arr <>", value, "scheduleTimepartArr");
            return (Criteria) this;
        }

        public Criteria andScheduleTimepartArrGreaterThan(String value) {
            addCriterion("schedule_timepart_arr >", value, "scheduleTimepartArr");
            return (Criteria) this;
        }

        public Criteria andScheduleTimepartArrGreaterThanOrEqualTo(String value) {
            addCriterion("schedule_timepart_arr >=", value, "scheduleTimepartArr");
            return (Criteria) this;
        }

        public Criteria andScheduleTimepartArrLessThan(String value) {
            addCriterion("schedule_timepart_arr <", value, "scheduleTimepartArr");
            return (Criteria) this;
        }

        public Criteria andScheduleTimepartArrLessThanOrEqualTo(String value) {
            addCriterion("schedule_timepart_arr <=", value, "scheduleTimepartArr");
            return (Criteria) this;
        }

        public Criteria andScheduleTimepartArrLike(String value) {
            addCriterion("schedule_timepart_arr like", value, "scheduleTimepartArr");
            return (Criteria) this;
        }

        public Criteria andScheduleTimepartArrNotLike(String value) {
            addCriterion("schedule_timepart_arr not like", value, "scheduleTimepartArr");
            return (Criteria) this;
        }

        public Criteria andScheduleTimepartArrIn(List<String> values) {
            addCriterion("schedule_timepart_arr in", values, "scheduleTimepartArr");
            return (Criteria) this;
        }

        public Criteria andScheduleTimepartArrNotIn(List<String> values) {
            addCriterion("schedule_timepart_arr not in", values, "scheduleTimepartArr");
            return (Criteria) this;
        }

        public Criteria andScheduleTimepartArrBetween(String value1, String value2) {
            addCriterion("schedule_timepart_arr between", value1, value2, "scheduleTimepartArr");
            return (Criteria) this;
        }

        public Criteria andScheduleTimepartArrNotBetween(String value1, String value2) {
            addCriterion("schedule_timepart_arr not between", value1, value2, "scheduleTimepartArr");
            return (Criteria) this;
        }

        public Criteria andServiceStatusIsNull() {
            addCriterion("service_status is null");
            return (Criteria) this;
        }

        public Criteria andServiceStatusIsNotNull() {
            addCriterion("service_status is not null");
            return (Criteria) this;
        }

        public Criteria andServiceStatusEqualTo(Byte value) {
            addCriterion("service_status =", value, "serviceStatus");
            return (Criteria) this;
        }

        public Criteria andServiceStatusNotEqualTo(Byte value) {
            addCriterion("service_status <>", value, "serviceStatus");
            return (Criteria) this;
        }

        public Criteria andServiceStatusGreaterThan(Byte value) {
            addCriterion("service_status >", value, "serviceStatus");
            return (Criteria) this;
        }

        public Criteria andServiceStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("service_status >=", value, "serviceStatus");
            return (Criteria) this;
        }

        public Criteria andServiceStatusLessThan(Byte value) {
            addCriterion("service_status <", value, "serviceStatus");
            return (Criteria) this;
        }

        public Criteria andServiceStatusLessThanOrEqualTo(Byte value) {
            addCriterion("service_status <=", value, "serviceStatus");
            return (Criteria) this;
        }

        public Criteria andServiceStatusIn(List<Byte> values) {
            addCriterion("service_status in", values, "serviceStatus");
            return (Criteria) this;
        }

        public Criteria andServiceStatusNotIn(List<Byte> values) {
            addCriterion("service_status not in", values, "serviceStatus");
            return (Criteria) this;
        }

        public Criteria andServiceStatusBetween(Byte value1, Byte value2) {
            addCriterion("service_status between", value1, value2, "serviceStatus");
            return (Criteria) this;
        }

        public Criteria andServiceStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("service_status not between", value1, value2, "serviceStatus");
            return (Criteria) this;
        }

        public Criteria andServiceTypeIsNull() {
            addCriterion("service_type is null");
            return (Criteria) this;
        }

        public Criteria andServiceTypeIsNotNull() {
            addCriterion("service_type is not null");
            return (Criteria) this;
        }

        public Criteria andServiceTypeEqualTo(Integer value) {
            addCriterion("service_type =", value, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeNotEqualTo(Integer value) {
            addCriterion("service_type <>", value, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeGreaterThan(Integer value) {
            addCriterion("service_type >", value, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("service_type >=", value, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeLessThan(Integer value) {
            addCriterion("service_type <", value, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeLessThanOrEqualTo(Integer value) {
            addCriterion("service_type <=", value, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeIn(List<Integer> values) {
            addCriterion("service_type in", values, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeNotIn(List<Integer> values) {
            addCriterion("service_type not in", values, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeBetween(Integer value1, Integer value2) {
            addCriterion("service_type between", value1, value2, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("service_type not between", value1, value2, "serviceType");
            return (Criteria) this;
        }

        public Criteria andFoodStatusIsNull() {
            addCriterion("food_status is null");
            return (Criteria) this;
        }

        public Criteria andFoodStatusIsNotNull() {
            addCriterion("food_status is not null");
            return (Criteria) this;
        }

        public Criteria andFoodStatusEqualTo(Integer value) {
            addCriterion("food_status =", value, "foodStatus");
            return (Criteria) this;
        }

        public Criteria andFoodStatusNotEqualTo(Integer value) {
            addCriterion("food_status <>", value, "foodStatus");
            return (Criteria) this;
        }

        public Criteria andFoodStatusGreaterThan(Integer value) {
            addCriterion("food_status >", value, "foodStatus");
            return (Criteria) this;
        }

        public Criteria andFoodStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("food_status >=", value, "foodStatus");
            return (Criteria) this;
        }

        public Criteria andFoodStatusLessThan(Integer value) {
            addCriterion("food_status <", value, "foodStatus");
            return (Criteria) this;
        }

        public Criteria andFoodStatusLessThanOrEqualTo(Integer value) {
            addCriterion("food_status <=", value, "foodStatus");
            return (Criteria) this;
        }

        public Criteria andFoodStatusIn(List<Integer> values) {
            addCriterion("food_status in", values, "foodStatus");
            return (Criteria) this;
        }

        public Criteria andFoodStatusNotIn(List<Integer> values) {
            addCriterion("food_status not in", values, "foodStatus");
            return (Criteria) this;
        }

        public Criteria andFoodStatusBetween(Integer value1, Integer value2) {
            addCriterion("food_status between", value1, value2, "foodStatus");
            return (Criteria) this;
        }

        public Criteria andFoodStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("food_status not between", value1, value2, "foodStatus");
            return (Criteria) this;
        }

        public Criteria andTuangouUserIdIsNull() {
            addCriterion("tuangou_user_id is null");
            return (Criteria) this;
        }

        public Criteria andTuangouUserIdIsNotNull() {
            addCriterion("tuangou_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andTuangouUserIdEqualTo(Integer value) {
            addCriterion("tuangou_user_id =", value, "tuangouUserId");
            return (Criteria) this;
        }

        public Criteria andTuangouUserIdNotEqualTo(Integer value) {
            addCriterion("tuangou_user_id <>", value, "tuangouUserId");
            return (Criteria) this;
        }

        public Criteria andTuangouUserIdGreaterThan(Integer value) {
            addCriterion("tuangou_user_id >", value, "tuangouUserId");
            return (Criteria) this;
        }

        public Criteria andTuangouUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("tuangou_user_id >=", value, "tuangouUserId");
            return (Criteria) this;
        }

        public Criteria andTuangouUserIdLessThan(Integer value) {
            addCriterion("tuangou_user_id <", value, "tuangouUserId");
            return (Criteria) this;
        }

        public Criteria andTuangouUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("tuangou_user_id <=", value, "tuangouUserId");
            return (Criteria) this;
        }

        public Criteria andTuangouUserIdIn(List<Integer> values) {
            addCriterion("tuangou_user_id in", values, "tuangouUserId");
            return (Criteria) this;
        }

        public Criteria andTuangouUserIdNotIn(List<Integer> values) {
            addCriterion("tuangou_user_id not in", values, "tuangouUserId");
            return (Criteria) this;
        }

        public Criteria andTuangouUserIdBetween(Integer value1, Integer value2) {
            addCriterion("tuangou_user_id between", value1, value2, "tuangouUserId");
            return (Criteria) this;
        }

        public Criteria andTuangouUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("tuangou_user_id not between", value1, value2, "tuangouUserId");
            return (Criteria) this;
        }

        public Criteria andTuangouAddtimeIsNull() {
            addCriterion("tuangou_addtime is null");
            return (Criteria) this;
        }

        public Criteria andTuangouAddtimeIsNotNull() {
            addCriterion("tuangou_addtime is not null");
            return (Criteria) this;
        }

        public Criteria andTuangouAddtimeEqualTo(Integer value) {
            addCriterion("tuangou_addtime =", value, "tuangouAddtime");
            return (Criteria) this;
        }

        public Criteria andTuangouAddtimeNotEqualTo(Integer value) {
            addCriterion("tuangou_addtime <>", value, "tuangouAddtime");
            return (Criteria) this;
        }

        public Criteria andTuangouAddtimeGreaterThan(Integer value) {
            addCriterion("tuangou_addtime >", value, "tuangouAddtime");
            return (Criteria) this;
        }

        public Criteria andTuangouAddtimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("tuangou_addtime >=", value, "tuangouAddtime");
            return (Criteria) this;
        }

        public Criteria andTuangouAddtimeLessThan(Integer value) {
            addCriterion("tuangou_addtime <", value, "tuangouAddtime");
            return (Criteria) this;
        }

        public Criteria andTuangouAddtimeLessThanOrEqualTo(Integer value) {
            addCriterion("tuangou_addtime <=", value, "tuangouAddtime");
            return (Criteria) this;
        }

        public Criteria andTuangouAddtimeIn(List<Integer> values) {
            addCriterion("tuangou_addtime in", values, "tuangouAddtime");
            return (Criteria) this;
        }

        public Criteria andTuangouAddtimeNotIn(List<Integer> values) {
            addCriterion("tuangou_addtime not in", values, "tuangouAddtime");
            return (Criteria) this;
        }

        public Criteria andTuangouAddtimeBetween(Integer value1, Integer value2) {
            addCriterion("tuangou_addtime between", value1, value2, "tuangouAddtime");
            return (Criteria) this;
        }

        public Criteria andTuangouAddtimeNotBetween(Integer value1, Integer value2) {
            addCriterion("tuangou_addtime not between", value1, value2, "tuangouAddtime");
            return (Criteria) this;
        }

        public Criteria andTuangouShopIdIsNull() {
            addCriterion("tuangou_shop_id is null");
            return (Criteria) this;
        }

        public Criteria andTuangouShopIdIsNotNull() {
            addCriterion("tuangou_shop_id is not null");
            return (Criteria) this;
        }

        public Criteria andTuangouShopIdEqualTo(Integer value) {
            addCriterion("tuangou_shop_id =", value, "tuangouShopId");
            return (Criteria) this;
        }

        public Criteria andTuangouShopIdNotEqualTo(Integer value) {
            addCriterion("tuangou_shop_id <>", value, "tuangouShopId");
            return (Criteria) this;
        }

        public Criteria andTuangouShopIdGreaterThan(Integer value) {
            addCriterion("tuangou_shop_id >", value, "tuangouShopId");
            return (Criteria) this;
        }

        public Criteria andTuangouShopIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("tuangou_shop_id >=", value, "tuangouShopId");
            return (Criteria) this;
        }

        public Criteria andTuangouShopIdLessThan(Integer value) {
            addCriterion("tuangou_shop_id <", value, "tuangouShopId");
            return (Criteria) this;
        }

        public Criteria andTuangouShopIdLessThanOrEqualTo(Integer value) {
            addCriterion("tuangou_shop_id <=", value, "tuangouShopId");
            return (Criteria) this;
        }

        public Criteria andTuangouShopIdIn(List<Integer> values) {
            addCriterion("tuangou_shop_id in", values, "tuangouShopId");
            return (Criteria) this;
        }

        public Criteria andTuangouShopIdNotIn(List<Integer> values) {
            addCriterion("tuangou_shop_id not in", values, "tuangouShopId");
            return (Criteria) this;
        }

        public Criteria andTuangouShopIdBetween(Integer value1, Integer value2) {
            addCriterion("tuangou_shop_id between", value1, value2, "tuangouShopId");
            return (Criteria) this;
        }

        public Criteria andTuangouShopIdNotBetween(Integer value1, Integer value2) {
            addCriterion("tuangou_shop_id not between", value1, value2, "tuangouShopId");
            return (Criteria) this;
        }

        public Criteria andWxIdIsNull() {
            addCriterion("wx_id is null");
            return (Criteria) this;
        }

        public Criteria andWxIdIsNotNull() {
            addCriterion("wx_id is not null");
            return (Criteria) this;
        }

        public Criteria andWxIdEqualTo(Integer value) {
            addCriterion("wx_id =", value, "wxId");
            return (Criteria) this;
        }

        public Criteria andWxIdNotEqualTo(Integer value) {
            addCriterion("wx_id <>", value, "wxId");
            return (Criteria) this;
        }

        public Criteria andWxIdGreaterThan(Integer value) {
            addCriterion("wx_id >", value, "wxId");
            return (Criteria) this;
        }

        public Criteria andWxIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("wx_id >=", value, "wxId");
            return (Criteria) this;
        }

        public Criteria andWxIdLessThan(Integer value) {
            addCriterion("wx_id <", value, "wxId");
            return (Criteria) this;
        }

        public Criteria andWxIdLessThanOrEqualTo(Integer value) {
            addCriterion("wx_id <=", value, "wxId");
            return (Criteria) this;
        }

        public Criteria andWxIdIn(List<Integer> values) {
            addCriterion("wx_id in", values, "wxId");
            return (Criteria) this;
        }

        public Criteria andWxIdNotIn(List<Integer> values) {
            addCriterion("wx_id not in", values, "wxId");
            return (Criteria) this;
        }

        public Criteria andWxIdBetween(Integer value1, Integer value2) {
            addCriterion("wx_id between", value1, value2, "wxId");
            return (Criteria) this;
        }

        public Criteria andWxIdNotBetween(Integer value1, Integer value2) {
            addCriterion("wx_id not between", value1, value2, "wxId");
            return (Criteria) this;
        }

        public Criteria andUserDelIsNull() {
            addCriterion("user_del is null");
            return (Criteria) this;
        }

        public Criteria andUserDelIsNotNull() {
            addCriterion("user_del is not null");
            return (Criteria) this;
        }

        public Criteria andUserDelEqualTo(Integer value) {
            addCriterion("user_del =", value, "userDel");
            return (Criteria) this;
        }

        public Criteria andUserDelNotEqualTo(Integer value) {
            addCriterion("user_del <>", value, "userDel");
            return (Criteria) this;
        }

        public Criteria andUserDelGreaterThan(Integer value) {
            addCriterion("user_del >", value, "userDel");
            return (Criteria) this;
        }

        public Criteria andUserDelGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_del >=", value, "userDel");
            return (Criteria) this;
        }

        public Criteria andUserDelLessThan(Integer value) {
            addCriterion("user_del <", value, "userDel");
            return (Criteria) this;
        }

        public Criteria andUserDelLessThanOrEqualTo(Integer value) {
            addCriterion("user_del <=", value, "userDel");
            return (Criteria) this;
        }

        public Criteria andUserDelIn(List<Integer> values) {
            addCriterion("user_del in", values, "userDel");
            return (Criteria) this;
        }

        public Criteria andUserDelNotIn(List<Integer> values) {
            addCriterion("user_del not in", values, "userDel");
            return (Criteria) this;
        }

        public Criteria andUserDelBetween(Integer value1, Integer value2) {
            addCriterion("user_del between", value1, value2, "userDel");
            return (Criteria) this;
        }

        public Criteria andUserDelNotBetween(Integer value1, Integer value2) {
            addCriterion("user_del not between", value1, value2, "userDel");
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

        public Criteria andUserCouponIdStrIsNull() {
            addCriterion("user_coupon_id_str is null");
            return (Criteria) this;
        }

        public Criteria andUserCouponIdStrIsNotNull() {
            addCriterion("user_coupon_id_str is not null");
            return (Criteria) this;
        }

        public Criteria andUserCouponIdStrEqualTo(String value) {
            addCriterion("user_coupon_id_str =", value, "userCouponIdStr");
            return (Criteria) this;
        }

        public Criteria andUserCouponIdStrNotEqualTo(String value) {
            addCriterion("user_coupon_id_str <>", value, "userCouponIdStr");
            return (Criteria) this;
        }

        public Criteria andUserCouponIdStrGreaterThan(String value) {
            addCriterion("user_coupon_id_str >", value, "userCouponIdStr");
            return (Criteria) this;
        }

        public Criteria andUserCouponIdStrGreaterThanOrEqualTo(String value) {
            addCriterion("user_coupon_id_str >=", value, "userCouponIdStr");
            return (Criteria) this;
        }

        public Criteria andUserCouponIdStrLessThan(String value) {
            addCriterion("user_coupon_id_str <", value, "userCouponIdStr");
            return (Criteria) this;
        }

        public Criteria andUserCouponIdStrLessThanOrEqualTo(String value) {
            addCriterion("user_coupon_id_str <=", value, "userCouponIdStr");
            return (Criteria) this;
        }

        public Criteria andUserCouponIdStrLike(String value) {
            addCriterion("user_coupon_id_str like", value, "userCouponIdStr");
            return (Criteria) this;
        }

        public Criteria andUserCouponIdStrNotLike(String value) {
            addCriterion("user_coupon_id_str not like", value, "userCouponIdStr");
            return (Criteria) this;
        }

        public Criteria andUserCouponIdStrIn(List<String> values) {
            addCriterion("user_coupon_id_str in", values, "userCouponIdStr");
            return (Criteria) this;
        }

        public Criteria andUserCouponIdStrNotIn(List<String> values) {
            addCriterion("user_coupon_id_str not in", values, "userCouponIdStr");
            return (Criteria) this;
        }

        public Criteria andUserCouponIdStrBetween(String value1, String value2) {
            addCriterion("user_coupon_id_str between", value1, value2, "userCouponIdStr");
            return (Criteria) this;
        }

        public Criteria andUserCouponIdStrNotBetween(String value1, String value2) {
            addCriterion("user_coupon_id_str not between", value1, value2, "userCouponIdStr");
            return (Criteria) this;
        }

        public Criteria andPayStyleIsNull() {
            addCriterion("pay_style is null");
            return (Criteria) this;
        }

        public Criteria andPayStyleIsNotNull() {
            addCriterion("pay_style is not null");
            return (Criteria) this;
        }

        public Criteria andPayStyleEqualTo(Integer value) {
            addCriterion("pay_style =", value, "payStyle");
            return (Criteria) this;
        }

        public Criteria andPayStyleNotEqualTo(Integer value) {
            addCriterion("pay_style <>", value, "payStyle");
            return (Criteria) this;
        }

        public Criteria andPayStyleGreaterThan(Integer value) {
            addCriterion("pay_style >", value, "payStyle");
            return (Criteria) this;
        }

        public Criteria andPayStyleGreaterThanOrEqualTo(Integer value) {
            addCriterion("pay_style >=", value, "payStyle");
            return (Criteria) this;
        }

        public Criteria andPayStyleLessThan(Integer value) {
            addCriterion("pay_style <", value, "payStyle");
            return (Criteria) this;
        }

        public Criteria andPayStyleLessThanOrEqualTo(Integer value) {
            addCriterion("pay_style <=", value, "payStyle");
            return (Criteria) this;
        }

        public Criteria andPayStyleIn(List<Integer> values) {
            addCriterion("pay_style in", values, "payStyle");
            return (Criteria) this;
        }

        public Criteria andPayStyleNotIn(List<Integer> values) {
            addCriterion("pay_style not in", values, "payStyle");
            return (Criteria) this;
        }

        public Criteria andPayStyleBetween(Integer value1, Integer value2) {
            addCriterion("pay_style between", value1, value2, "payStyle");
            return (Criteria) this;
        }

        public Criteria andPayStyleNotBetween(Integer value1, Integer value2) {
            addCriterion("pay_style not between", value1, value2, "payStyle");
            return (Criteria) this;
        }

        public Criteria andPayTimeIsNull() {
            addCriterion("pay_time is null");
            return (Criteria) this;
        }

        public Criteria andPayTimeIsNotNull() {
            addCriterion("pay_time is not null");
            return (Criteria) this;
        }

        public Criteria andPayTimeEqualTo(Integer value) {
            addCriterion("pay_time =", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotEqualTo(Integer value) {
            addCriterion("pay_time <>", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeGreaterThan(Integer value) {
            addCriterion("pay_time >", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("pay_time >=", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeLessThan(Integer value) {
            addCriterion("pay_time <", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeLessThanOrEqualTo(Integer value) {
            addCriterion("pay_time <=", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeIn(List<Integer> values) {
            addCriterion("pay_time in", values, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotIn(List<Integer> values) {
            addCriterion("pay_time not in", values, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeBetween(Integer value1, Integer value2) {
            addCriterion("pay_time between", value1, value2, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("pay_time not between", value1, value2, "payTime");
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

        public Criteria andCommentStatusIsNull() {
            addCriterion("comment_status is null");
            return (Criteria) this;
        }

        public Criteria andCommentStatusIsNotNull() {
            addCriterion("comment_status is not null");
            return (Criteria) this;
        }

        public Criteria andCommentStatusEqualTo(Byte value) {
            addCriterion("comment_status =", value, "commentStatus");
            return (Criteria) this;
        }

        public Criteria andCommentStatusNotEqualTo(Byte value) {
            addCriterion("comment_status <>", value, "commentStatus");
            return (Criteria) this;
        }

        public Criteria andCommentStatusGreaterThan(Byte value) {
            addCriterion("comment_status >", value, "commentStatus");
            return (Criteria) this;
        }

        public Criteria andCommentStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("comment_status >=", value, "commentStatus");
            return (Criteria) this;
        }

        public Criteria andCommentStatusLessThan(Byte value) {
            addCriterion("comment_status <", value, "commentStatus");
            return (Criteria) this;
        }

        public Criteria andCommentStatusLessThanOrEqualTo(Byte value) {
            addCriterion("comment_status <=", value, "commentStatus");
            return (Criteria) this;
        }

        public Criteria andCommentStatusIn(List<Byte> values) {
            addCriterion("comment_status in", values, "commentStatus");
            return (Criteria) this;
        }

        public Criteria andCommentStatusNotIn(List<Byte> values) {
            addCriterion("comment_status not in", values, "commentStatus");
            return (Criteria) this;
        }

        public Criteria andCommentStatusBetween(Byte value1, Byte value2) {
            addCriterion("comment_status between", value1, value2, "commentStatus");
            return (Criteria) this;
        }

        public Criteria andCommentStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("comment_status not between", value1, value2, "commentStatus");
            return (Criteria) this;
        }

        public Criteria andAddShopLogIsNull() {
            addCriterion("add_shop_log is null");
            return (Criteria) this;
        }

        public Criteria andAddShopLogIsNotNull() {
            addCriterion("add_shop_log is not null");
            return (Criteria) this;
        }

        public Criteria andAddShopLogEqualTo(Integer value) {
            addCriterion("add_shop_log =", value, "addShopLog");
            return (Criteria) this;
        }

        public Criteria andAddShopLogNotEqualTo(Integer value) {
            addCriterion("add_shop_log <>", value, "addShopLog");
            return (Criteria) this;
        }

        public Criteria andAddShopLogGreaterThan(Integer value) {
            addCriterion("add_shop_log >", value, "addShopLog");
            return (Criteria) this;
        }

        public Criteria andAddShopLogGreaterThanOrEqualTo(Integer value) {
            addCriterion("add_shop_log >=", value, "addShopLog");
            return (Criteria) this;
        }

        public Criteria andAddShopLogLessThan(Integer value) {
            addCriterion("add_shop_log <", value, "addShopLog");
            return (Criteria) this;
        }

        public Criteria andAddShopLogLessThanOrEqualTo(Integer value) {
            addCriterion("add_shop_log <=", value, "addShopLog");
            return (Criteria) this;
        }

        public Criteria andAddShopLogIn(List<Integer> values) {
            addCriterion("add_shop_log in", values, "addShopLog");
            return (Criteria) this;
        }

        public Criteria andAddShopLogNotIn(List<Integer> values) {
            addCriterion("add_shop_log not in", values, "addShopLog");
            return (Criteria) this;
        }

        public Criteria andAddShopLogBetween(Integer value1, Integer value2) {
            addCriterion("add_shop_log between", value1, value2, "addShopLog");
            return (Criteria) this;
        }

        public Criteria andAddShopLogNotBetween(Integer value1, Integer value2) {
            addCriterion("add_shop_log not between", value1, value2, "addShopLog");
            return (Criteria) this;
        }

        public Criteria andAddDailiLogIsNull() {
            addCriterion("add_daili_log is null");
            return (Criteria) this;
        }

        public Criteria andAddDailiLogIsNotNull() {
            addCriterion("add_daili_log is not null");
            return (Criteria) this;
        }

        public Criteria andAddDailiLogEqualTo(Integer value) {
            addCriterion("add_daili_log =", value, "addDailiLog");
            return (Criteria) this;
        }

        public Criteria andAddDailiLogNotEqualTo(Integer value) {
            addCriterion("add_daili_log <>", value, "addDailiLog");
            return (Criteria) this;
        }

        public Criteria andAddDailiLogGreaterThan(Integer value) {
            addCriterion("add_daili_log >", value, "addDailiLog");
            return (Criteria) this;
        }

        public Criteria andAddDailiLogGreaterThanOrEqualTo(Integer value) {
            addCriterion("add_daili_log >=", value, "addDailiLog");
            return (Criteria) this;
        }

        public Criteria andAddDailiLogLessThan(Integer value) {
            addCriterion("add_daili_log <", value, "addDailiLog");
            return (Criteria) this;
        }

        public Criteria andAddDailiLogLessThanOrEqualTo(Integer value) {
            addCriterion("add_daili_log <=", value, "addDailiLog");
            return (Criteria) this;
        }

        public Criteria andAddDailiLogIn(List<Integer> values) {
            addCriterion("add_daili_log in", values, "addDailiLog");
            return (Criteria) this;
        }

        public Criteria andAddDailiLogNotIn(List<Integer> values) {
            addCriterion("add_daili_log not in", values, "addDailiLog");
            return (Criteria) this;
        }

        public Criteria andAddDailiLogBetween(Integer value1, Integer value2) {
            addCriterion("add_daili_log between", value1, value2, "addDailiLog");
            return (Criteria) this;
        }

        public Criteria andAddDailiLogNotBetween(Integer value1, Integer value2) {
            addCriterion("add_daili_log not between", value1, value2, "addDailiLog");
            return (Criteria) this;
        }

        public Criteria andAddZhaoshangLogIsNull() {
            addCriterion("add_zhaoshang_log is null");
            return (Criteria) this;
        }

        public Criteria andAddZhaoshangLogIsNotNull() {
            addCriterion("add_zhaoshang_log is not null");
            return (Criteria) this;
        }

        public Criteria andAddZhaoshangLogEqualTo(Integer value) {
            addCriterion("add_zhaoshang_log =", value, "addZhaoshangLog");
            return (Criteria) this;
        }

        public Criteria andAddZhaoshangLogNotEqualTo(Integer value) {
            addCriterion("add_zhaoshang_log <>", value, "addZhaoshangLog");
            return (Criteria) this;
        }

        public Criteria andAddZhaoshangLogGreaterThan(Integer value) {
            addCriterion("add_zhaoshang_log >", value, "addZhaoshangLog");
            return (Criteria) this;
        }

        public Criteria andAddZhaoshangLogGreaterThanOrEqualTo(Integer value) {
            addCriterion("add_zhaoshang_log >=", value, "addZhaoshangLog");
            return (Criteria) this;
        }

        public Criteria andAddZhaoshangLogLessThan(Integer value) {
            addCriterion("add_zhaoshang_log <", value, "addZhaoshangLog");
            return (Criteria) this;
        }

        public Criteria andAddZhaoshangLogLessThanOrEqualTo(Integer value) {
            addCriterion("add_zhaoshang_log <=", value, "addZhaoshangLog");
            return (Criteria) this;
        }

        public Criteria andAddZhaoshangLogIn(List<Integer> values) {
            addCriterion("add_zhaoshang_log in", values, "addZhaoshangLog");
            return (Criteria) this;
        }

        public Criteria andAddZhaoshangLogNotIn(List<Integer> values) {
            addCriterion("add_zhaoshang_log not in", values, "addZhaoshangLog");
            return (Criteria) this;
        }

        public Criteria andAddZhaoshangLogBetween(Integer value1, Integer value2) {
            addCriterion("add_zhaoshang_log between", value1, value2, "addZhaoshangLog");
            return (Criteria) this;
        }

        public Criteria andAddZhaoshangLogNotBetween(Integer value1, Integer value2) {
            addCriterion("add_zhaoshang_log not between", value1, value2, "addZhaoshangLog");
            return (Criteria) this;
        }

        public Criteria andAddMemberLogIsNull() {
            addCriterion("add_member_log is null");
            return (Criteria) this;
        }

        public Criteria andAddMemberLogIsNotNull() {
            addCriterion("add_member_log is not null");
            return (Criteria) this;
        }

        public Criteria andAddMemberLogEqualTo(Integer value) {
            addCriterion("add_member_log =", value, "addMemberLog");
            return (Criteria) this;
        }

        public Criteria andAddMemberLogNotEqualTo(Integer value) {
            addCriterion("add_member_log <>", value, "addMemberLog");
            return (Criteria) this;
        }

        public Criteria andAddMemberLogGreaterThan(Integer value) {
            addCriterion("add_member_log >", value, "addMemberLog");
            return (Criteria) this;
        }

        public Criteria andAddMemberLogGreaterThanOrEqualTo(Integer value) {
            addCriterion("add_member_log >=", value, "addMemberLog");
            return (Criteria) this;
        }

        public Criteria andAddMemberLogLessThan(Integer value) {
            addCriterion("add_member_log <", value, "addMemberLog");
            return (Criteria) this;
        }

        public Criteria andAddMemberLogLessThanOrEqualTo(Integer value) {
            addCriterion("add_member_log <=", value, "addMemberLog");
            return (Criteria) this;
        }

        public Criteria andAddMemberLogIn(List<Integer> values) {
            addCriterion("add_member_log in", values, "addMemberLog");
            return (Criteria) this;
        }

        public Criteria andAddMemberLogNotIn(List<Integer> values) {
            addCriterion("add_member_log not in", values, "addMemberLog");
            return (Criteria) this;
        }

        public Criteria andAddMemberLogBetween(Integer value1, Integer value2) {
            addCriterion("add_member_log between", value1, value2, "addMemberLog");
            return (Criteria) this;
        }

        public Criteria andAddMemberLogNotBetween(Integer value1, Integer value2) {
            addCriterion("add_member_log not between", value1, value2, "addMemberLog");
            return (Criteria) this;
        }

        public Criteria andCouponIdStrIsNull() {
            addCriterion("coupon_id_str is null");
            return (Criteria) this;
        }

        public Criteria andCouponIdStrIsNotNull() {
            addCriterion("coupon_id_str is not null");
            return (Criteria) this;
        }

        public Criteria andCouponIdStrEqualTo(String value) {
            addCriterion("coupon_id_str =", value, "couponIdStr");
            return (Criteria) this;
        }

        public Criteria andCouponIdStrNotEqualTo(String value) {
            addCriterion("coupon_id_str <>", value, "couponIdStr");
            return (Criteria) this;
        }

        public Criteria andCouponIdStrGreaterThan(String value) {
            addCriterion("coupon_id_str >", value, "couponIdStr");
            return (Criteria) this;
        }

        public Criteria andCouponIdStrGreaterThanOrEqualTo(String value) {
            addCriterion("coupon_id_str >=", value, "couponIdStr");
            return (Criteria) this;
        }

        public Criteria andCouponIdStrLessThan(String value) {
            addCriterion("coupon_id_str <", value, "couponIdStr");
            return (Criteria) this;
        }

        public Criteria andCouponIdStrLessThanOrEqualTo(String value) {
            addCriterion("coupon_id_str <=", value, "couponIdStr");
            return (Criteria) this;
        }

        public Criteria andCouponIdStrLike(String value) {
            addCriterion("coupon_id_str like", value, "couponIdStr");
            return (Criteria) this;
        }

        public Criteria andCouponIdStrNotLike(String value) {
            addCriterion("coupon_id_str not like", value, "couponIdStr");
            return (Criteria) this;
        }

        public Criteria andCouponIdStrIn(List<String> values) {
            addCriterion("coupon_id_str in", values, "couponIdStr");
            return (Criteria) this;
        }

        public Criteria andCouponIdStrNotIn(List<String> values) {
            addCriterion("coupon_id_str not in", values, "couponIdStr");
            return (Criteria) this;
        }

        public Criteria andCouponIdStrBetween(String value1, String value2) {
            addCriterion("coupon_id_str between", value1, value2, "couponIdStr");
            return (Criteria) this;
        }

        public Criteria andCouponIdStrNotBetween(String value1, String value2) {
            addCriterion("coupon_id_str not between", value1, value2, "couponIdStr");
            return (Criteria) this;
        }

        public Criteria andDayIsNull() {
            addCriterion("day is null");
            return (Criteria) this;
        }

        public Criteria andDayIsNotNull() {
            addCriterion("day is not null");
            return (Criteria) this;
        }

        public Criteria andDayEqualTo(Integer value) {
            addCriterion("day =", value, "day");
            return (Criteria) this;
        }

        public Criteria andDayNotEqualTo(Integer value) {
            addCriterion("day <>", value, "day");
            return (Criteria) this;
        }

        public Criteria andDayGreaterThan(Integer value) {
            addCriterion("day >", value, "day");
            return (Criteria) this;
        }

        public Criteria andDayGreaterThanOrEqualTo(Integer value) {
            addCriterion("day >=", value, "day");
            return (Criteria) this;
        }

        public Criteria andDayLessThan(Integer value) {
            addCriterion("day <", value, "day");
            return (Criteria) this;
        }

        public Criteria andDayLessThanOrEqualTo(Integer value) {
            addCriterion("day <=", value, "day");
            return (Criteria) this;
        }

        public Criteria andDayIn(List<Integer> values) {
            addCriterion("day in", values, "day");
            return (Criteria) this;
        }

        public Criteria andDayNotIn(List<Integer> values) {
            addCriterion("day not in", values, "day");
            return (Criteria) this;
        }

        public Criteria andDayBetween(Integer value1, Integer value2) {
            addCriterion("day between", value1, value2, "day");
            return (Criteria) this;
        }

        public Criteria andDayNotBetween(Integer value1, Integer value2) {
            addCriterion("day not between", value1, value2, "day");
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

        public Criteria andPintuanStatusIsNull() {
            addCriterion("pintuan_status is null");
            return (Criteria) this;
        }

        public Criteria andPintuanStatusIsNotNull() {
            addCriterion("pintuan_status is not null");
            return (Criteria) this;
        }

        public Criteria andPintuanStatusEqualTo(Integer value) {
            addCriterion("pintuan_status =", value, "pintuanStatus");
            return (Criteria) this;
        }

        public Criteria andPintuanStatusNotEqualTo(Integer value) {
            addCriterion("pintuan_status <>", value, "pintuanStatus");
            return (Criteria) this;
        }

        public Criteria andPintuanStatusGreaterThan(Integer value) {
            addCriterion("pintuan_status >", value, "pintuanStatus");
            return (Criteria) this;
        }

        public Criteria andPintuanStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("pintuan_status >=", value, "pintuanStatus");
            return (Criteria) this;
        }

        public Criteria andPintuanStatusLessThan(Integer value) {
            addCriterion("pintuan_status <", value, "pintuanStatus");
            return (Criteria) this;
        }

        public Criteria andPintuanStatusLessThanOrEqualTo(Integer value) {
            addCriterion("pintuan_status <=", value, "pintuanStatus");
            return (Criteria) this;
        }

        public Criteria andPintuanStatusIn(List<Integer> values) {
            addCriterion("pintuan_status in", values, "pintuanStatus");
            return (Criteria) this;
        }

        public Criteria andPintuanStatusNotIn(List<Integer> values) {
            addCriterion("pintuan_status not in", values, "pintuanStatus");
            return (Criteria) this;
        }

        public Criteria andPintuanStatusBetween(Integer value1, Integer value2) {
            addCriterion("pintuan_status between", value1, value2, "pintuanStatus");
            return (Criteria) this;
        }

        public Criteria andPintuanStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("pintuan_status not between", value1, value2, "pintuanStatus");
            return (Criteria) this;
        }

        public Criteria andPintuanAppIsNull() {
            addCriterion("pintuan_app is null");
            return (Criteria) this;
        }

        public Criteria andPintuanAppIsNotNull() {
            addCriterion("pintuan_app is not null");
            return (Criteria) this;
        }

        public Criteria andPintuanAppEqualTo(String value) {
            addCriterion("pintuan_app =", value, "pintuanApp");
            return (Criteria) this;
        }

        public Criteria andPintuanAppNotEqualTo(String value) {
            addCriterion("pintuan_app <>", value, "pintuanApp");
            return (Criteria) this;
        }

        public Criteria andPintuanAppGreaterThan(String value) {
            addCriterion("pintuan_app >", value, "pintuanApp");
            return (Criteria) this;
        }

        public Criteria andPintuanAppGreaterThanOrEqualTo(String value) {
            addCriterion("pintuan_app >=", value, "pintuanApp");
            return (Criteria) this;
        }

        public Criteria andPintuanAppLessThan(String value) {
            addCriterion("pintuan_app <", value, "pintuanApp");
            return (Criteria) this;
        }

        public Criteria andPintuanAppLessThanOrEqualTo(String value) {
            addCriterion("pintuan_app <=", value, "pintuanApp");
            return (Criteria) this;
        }

        public Criteria andPintuanAppLike(String value) {
            addCriterion("pintuan_app like", value, "pintuanApp");
            return (Criteria) this;
        }

        public Criteria andPintuanAppNotLike(String value) {
            addCriterion("pintuan_app not like", value, "pintuanApp");
            return (Criteria) this;
        }

        public Criteria andPintuanAppIn(List<String> values) {
            addCriterion("pintuan_app in", values, "pintuanApp");
            return (Criteria) this;
        }

        public Criteria andPintuanAppNotIn(List<String> values) {
            addCriterion("pintuan_app not in", values, "pintuanApp");
            return (Criteria) this;
        }

        public Criteria andPintuanAppBetween(String value1, String value2) {
            addCriterion("pintuan_app between", value1, value2, "pintuanApp");
            return (Criteria) this;
        }

        public Criteria andPintuanAppNotBetween(String value1, String value2) {
            addCriterion("pintuan_app not between", value1, value2, "pintuanApp");
            return (Criteria) this;
        }

        public Criteria andPintuanEndtimeIsNull() {
            addCriterion("pintuan_endtime is null");
            return (Criteria) this;
        }

        public Criteria andPintuanEndtimeIsNotNull() {
            addCriterion("pintuan_endtime is not null");
            return (Criteria) this;
        }

        public Criteria andPintuanEndtimeEqualTo(Integer value) {
            addCriterion("pintuan_endtime =", value, "pintuanEndtime");
            return (Criteria) this;
        }

        public Criteria andPintuanEndtimeNotEqualTo(Integer value) {
            addCriterion("pintuan_endtime <>", value, "pintuanEndtime");
            return (Criteria) this;
        }

        public Criteria andPintuanEndtimeGreaterThan(Integer value) {
            addCriterion("pintuan_endtime >", value, "pintuanEndtime");
            return (Criteria) this;
        }

        public Criteria andPintuanEndtimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("pintuan_endtime >=", value, "pintuanEndtime");
            return (Criteria) this;
        }

        public Criteria andPintuanEndtimeLessThan(Integer value) {
            addCriterion("pintuan_endtime <", value, "pintuanEndtime");
            return (Criteria) this;
        }

        public Criteria andPintuanEndtimeLessThanOrEqualTo(Integer value) {
            addCriterion("pintuan_endtime <=", value, "pintuanEndtime");
            return (Criteria) this;
        }

        public Criteria andPintuanEndtimeIn(List<Integer> values) {
            addCriterion("pintuan_endtime in", values, "pintuanEndtime");
            return (Criteria) this;
        }

        public Criteria andPintuanEndtimeNotIn(List<Integer> values) {
            addCriterion("pintuan_endtime not in", values, "pintuanEndtime");
            return (Criteria) this;
        }

        public Criteria andPintuanEndtimeBetween(Integer value1, Integer value2) {
            addCriterion("pintuan_endtime between", value1, value2, "pintuanEndtime");
            return (Criteria) this;
        }

        public Criteria andPintuanEndtimeNotBetween(Integer value1, Integer value2) {
            addCriterion("pintuan_endtime not between", value1, value2, "pintuanEndtime");
            return (Criteria) this;
        }

        public Criteria andPintuanTypeIsNull() {
            addCriterion("pintuan_type is null");
            return (Criteria) this;
        }

        public Criteria andPintuanTypeIsNotNull() {
            addCriterion("pintuan_type is not null");
            return (Criteria) this;
        }

        public Criteria andPintuanTypeEqualTo(Integer value) {
            addCriterion("pintuan_type =", value, "pintuanType");
            return (Criteria) this;
        }

        public Criteria andPintuanTypeNotEqualTo(Integer value) {
            addCriterion("pintuan_type <>", value, "pintuanType");
            return (Criteria) this;
        }

        public Criteria andPintuanTypeGreaterThan(Integer value) {
            addCriterion("pintuan_type >", value, "pintuanType");
            return (Criteria) this;
        }

        public Criteria andPintuanTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("pintuan_type >=", value, "pintuanType");
            return (Criteria) this;
        }

        public Criteria andPintuanTypeLessThan(Integer value) {
            addCriterion("pintuan_type <", value, "pintuanType");
            return (Criteria) this;
        }

        public Criteria andPintuanTypeLessThanOrEqualTo(Integer value) {
            addCriterion("pintuan_type <=", value, "pintuanType");
            return (Criteria) this;
        }

        public Criteria andPintuanTypeIn(List<Integer> values) {
            addCriterion("pintuan_type in", values, "pintuanType");
            return (Criteria) this;
        }

        public Criteria andPintuanTypeNotIn(List<Integer> values) {
            addCriterion("pintuan_type not in", values, "pintuanType");
            return (Criteria) this;
        }

        public Criteria andPintuanTypeBetween(Integer value1, Integer value2) {
            addCriterion("pintuan_type between", value1, value2, "pintuanType");
            return (Criteria) this;
        }

        public Criteria andPintuanTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("pintuan_type not between", value1, value2, "pintuanType");
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

        public Criteria andParamsIsNull() {
            addCriterion("params is null");
            return (Criteria) this;
        }

        public Criteria andParamsIsNotNull() {
            addCriterion("params is not null");
            return (Criteria) this;
        }

        public Criteria andParamsEqualTo(String value) {
            addCriterion("params =", value, "params");
            return (Criteria) this;
        }

        public Criteria andParamsNotEqualTo(String value) {
            addCriterion("params <>", value, "params");
            return (Criteria) this;
        }

        public Criteria andParamsGreaterThan(String value) {
            addCriterion("params >", value, "params");
            return (Criteria) this;
        }

        public Criteria andParamsGreaterThanOrEqualTo(String value) {
            addCriterion("params >=", value, "params");
            return (Criteria) this;
        }

        public Criteria andParamsLessThan(String value) {
            addCriterion("params <", value, "params");
            return (Criteria) this;
        }

        public Criteria andParamsLessThanOrEqualTo(String value) {
            addCriterion("params <=", value, "params");
            return (Criteria) this;
        }

        public Criteria andParamsLike(String value) {
            addCriterion("params like", value, "params");
            return (Criteria) this;
        }

        public Criteria andParamsNotLike(String value) {
            addCriterion("params not like", value, "params");
            return (Criteria) this;
        }

        public Criteria andParamsIn(List<String> values) {
            addCriterion("params in", values, "params");
            return (Criteria) this;
        }

        public Criteria andParamsNotIn(List<String> values) {
            addCriterion("params not in", values, "params");
            return (Criteria) this;
        }

        public Criteria andParamsBetween(String value1, String value2) {
            addCriterion("params between", value1, value2, "params");
            return (Criteria) this;
        }

        public Criteria andParamsNotBetween(String value1, String value2) {
            addCriterion("params not between", value1, value2, "params");
            return (Criteria) this;
        }

        public Criteria andVipZhekouIsNull() {
            addCriterion("vip_zhekou is null");
            return (Criteria) this;
        }

        public Criteria andVipZhekouIsNotNull() {
            addCriterion("vip_zhekou is not null");
            return (Criteria) this;
        }

        public Criteria andVipZhekouEqualTo(BigDecimal value) {
            addCriterion("vip_zhekou =", value, "vipZhekou");
            return (Criteria) this;
        }

        public Criteria andVipZhekouNotEqualTo(BigDecimal value) {
            addCriterion("vip_zhekou <>", value, "vipZhekou");
            return (Criteria) this;
        }

        public Criteria andVipZhekouGreaterThan(BigDecimal value) {
            addCriterion("vip_zhekou >", value, "vipZhekou");
            return (Criteria) this;
        }

        public Criteria andVipZhekouGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("vip_zhekou >=", value, "vipZhekou");
            return (Criteria) this;
        }

        public Criteria andVipZhekouLessThan(BigDecimal value) {
            addCriterion("vip_zhekou <", value, "vipZhekou");
            return (Criteria) this;
        }

        public Criteria andVipZhekouLessThanOrEqualTo(BigDecimal value) {
            addCriterion("vip_zhekou <=", value, "vipZhekou");
            return (Criteria) this;
        }

        public Criteria andVipZhekouIn(List<BigDecimal> values) {
            addCriterion("vip_zhekou in", values, "vipZhekou");
            return (Criteria) this;
        }

        public Criteria andVipZhekouNotIn(List<BigDecimal> values) {
            addCriterion("vip_zhekou not in", values, "vipZhekou");
            return (Criteria) this;
        }

        public Criteria andVipZhekouBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("vip_zhekou between", value1, value2, "vipZhekou");
            return (Criteria) this;
        }

        public Criteria andVipZhekouNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("vip_zhekou not between", value1, value2, "vipZhekou");
            return (Criteria) this;
        }

        public Criteria andChildIdIsNull() {
            addCriterion("child_id is null");
            return (Criteria) this;
        }

        public Criteria andChildIdIsNotNull() {
            addCriterion("child_id is not null");
            return (Criteria) this;
        }

        public Criteria andChildIdEqualTo(Integer value) {
            addCriterion("child_id =", value, "childId");
            return (Criteria) this;
        }

        public Criteria andChildIdNotEqualTo(Integer value) {
            addCriterion("child_id <>", value, "childId");
            return (Criteria) this;
        }

        public Criteria andChildIdGreaterThan(Integer value) {
            addCriterion("child_id >", value, "childId");
            return (Criteria) this;
        }

        public Criteria andChildIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("child_id >=", value, "childId");
            return (Criteria) this;
        }

        public Criteria andChildIdLessThan(Integer value) {
            addCriterion("child_id <", value, "childId");
            return (Criteria) this;
        }

        public Criteria andChildIdLessThanOrEqualTo(Integer value) {
            addCriterion("child_id <=", value, "childId");
            return (Criteria) this;
        }

        public Criteria andChildIdIn(List<Integer> values) {
            addCriterion("child_id in", values, "childId");
            return (Criteria) this;
        }

        public Criteria andChildIdNotIn(List<Integer> values) {
            addCriterion("child_id not in", values, "childId");
            return (Criteria) this;
        }

        public Criteria andChildIdBetween(Integer value1, Integer value2) {
            addCriterion("child_id between", value1, value2, "childId");
            return (Criteria) this;
        }

        public Criteria andChildIdNotBetween(Integer value1, Integer value2) {
            addCriterion("child_id not between", value1, value2, "childId");
            return (Criteria) this;
        }

        public Criteria andServiceCardNumIsNull() {
            addCriterion("service_card_num is null");
            return (Criteria) this;
        }

        public Criteria andServiceCardNumIsNotNull() {
            addCriterion("service_card_num is not null");
            return (Criteria) this;
        }

        public Criteria andServiceCardNumEqualTo(String value) {
            addCriterion("service_card_num =", value, "serviceCardNum");
            return (Criteria) this;
        }

        public Criteria andServiceCardNumNotEqualTo(String value) {
            addCriterion("service_card_num <>", value, "serviceCardNum");
            return (Criteria) this;
        }

        public Criteria andServiceCardNumGreaterThan(String value) {
            addCriterion("service_card_num >", value, "serviceCardNum");
            return (Criteria) this;
        }

        public Criteria andServiceCardNumGreaterThanOrEqualTo(String value) {
            addCriterion("service_card_num >=", value, "serviceCardNum");
            return (Criteria) this;
        }

        public Criteria andServiceCardNumLessThan(String value) {
            addCriterion("service_card_num <", value, "serviceCardNum");
            return (Criteria) this;
        }

        public Criteria andServiceCardNumLessThanOrEqualTo(String value) {
            addCriterion("service_card_num <=", value, "serviceCardNum");
            return (Criteria) this;
        }

        public Criteria andServiceCardNumLike(String value) {
            addCriterion("service_card_num like", value, "serviceCardNum");
            return (Criteria) this;
        }

        public Criteria andServiceCardNumNotLike(String value) {
            addCriterion("service_card_num not like", value, "serviceCardNum");
            return (Criteria) this;
        }

        public Criteria andServiceCardNumIn(List<String> values) {
            addCriterion("service_card_num in", values, "serviceCardNum");
            return (Criteria) this;
        }

        public Criteria andServiceCardNumNotIn(List<String> values) {
            addCriterion("service_card_num not in", values, "serviceCardNum");
            return (Criteria) this;
        }

        public Criteria andServiceCardNumBetween(String value1, String value2) {
            addCriterion("service_card_num between", value1, value2, "serviceCardNum");
            return (Criteria) this;
        }

        public Criteria andServiceCardNumNotBetween(String value1, String value2) {
            addCriterion("service_card_num not between", value1, value2, "serviceCardNum");
            return (Criteria) this;
        }

        public Criteria andIsServiceIsNull() {
            addCriterion("is_service is null");
            return (Criteria) this;
        }

        public Criteria andIsServiceIsNotNull() {
            addCriterion("is_service is not null");
            return (Criteria) this;
        }

        public Criteria andIsServiceEqualTo(Integer value) {
            addCriterion("is_service =", value, "isService");
            return (Criteria) this;
        }

        public Criteria andIsServiceNotEqualTo(Integer value) {
            addCriterion("is_service <>", value, "isService");
            return (Criteria) this;
        }

        public Criteria andIsServiceGreaterThan(Integer value) {
            addCriterion("is_service >", value, "isService");
            return (Criteria) this;
        }

        public Criteria andIsServiceGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_service >=", value, "isService");
            return (Criteria) this;
        }

        public Criteria andIsServiceLessThan(Integer value) {
            addCriterion("is_service <", value, "isService");
            return (Criteria) this;
        }

        public Criteria andIsServiceLessThanOrEqualTo(Integer value) {
            addCriterion("is_service <=", value, "isService");
            return (Criteria) this;
        }

        public Criteria andIsServiceIn(List<Integer> values) {
            addCriterion("is_service in", values, "isService");
            return (Criteria) this;
        }

        public Criteria andIsServiceNotIn(List<Integer> values) {
            addCriterion("is_service not in", values, "isService");
            return (Criteria) this;
        }

        public Criteria andIsServiceBetween(Integer value1, Integer value2) {
            addCriterion("is_service between", value1, value2, "isService");
            return (Criteria) this;
        }

        public Criteria andIsServiceNotBetween(Integer value1, Integer value2) {
            addCriterion("is_service not between", value1, value2, "isService");
            return (Criteria) this;
        }

        public Criteria andIsDaifaIsNull() {
            addCriterion("is_daifa is null");
            return (Criteria) this;
        }

        public Criteria andIsDaifaIsNotNull() {
            addCriterion("is_daifa is not null");
            return (Criteria) this;
        }

        public Criteria andIsDaifaEqualTo(Byte value) {
            addCriterion("is_daifa =", value, "isDaifa");
            return (Criteria) this;
        }

        public Criteria andIsDaifaNotEqualTo(Byte value) {
            addCriterion("is_daifa <>", value, "isDaifa");
            return (Criteria) this;
        }

        public Criteria andIsDaifaGreaterThan(Byte value) {
            addCriterion("is_daifa >", value, "isDaifa");
            return (Criteria) this;
        }

        public Criteria andIsDaifaGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_daifa >=", value, "isDaifa");
            return (Criteria) this;
        }

        public Criteria andIsDaifaLessThan(Byte value) {
            addCriterion("is_daifa <", value, "isDaifa");
            return (Criteria) this;
        }

        public Criteria andIsDaifaLessThanOrEqualTo(Byte value) {
            addCriterion("is_daifa <=", value, "isDaifa");
            return (Criteria) this;
        }

        public Criteria andIsDaifaIn(List<Byte> values) {
            addCriterion("is_daifa in", values, "isDaifa");
            return (Criteria) this;
        }

        public Criteria andIsDaifaNotIn(List<Byte> values) {
            addCriterion("is_daifa not in", values, "isDaifa");
            return (Criteria) this;
        }

        public Criteria andIsDaifaBetween(Byte value1, Byte value2) {
            addCriterion("is_daifa between", value1, value2, "isDaifa");
            return (Criteria) this;
        }

        public Criteria andIsDaifaNotBetween(Byte value1, Byte value2) {
            addCriterion("is_daifa not between", value1, value2, "isDaifa");
            return (Criteria) this;
        }

        public Criteria andDaifaAddressIsNull() {
            addCriterion("daifa_address is null");
            return (Criteria) this;
        }

        public Criteria andDaifaAddressIsNotNull() {
            addCriterion("daifa_address is not null");
            return (Criteria) this;
        }

        public Criteria andDaifaAddressEqualTo(Integer value) {
            addCriterion("daifa_address =", value, "daifaAddress");
            return (Criteria) this;
        }

        public Criteria andDaifaAddressNotEqualTo(Integer value) {
            addCriterion("daifa_address <>", value, "daifaAddress");
            return (Criteria) this;
        }

        public Criteria andDaifaAddressGreaterThan(Integer value) {
            addCriterion("daifa_address >", value, "daifaAddress");
            return (Criteria) this;
        }

        public Criteria andDaifaAddressGreaterThanOrEqualTo(Integer value) {
            addCriterion("daifa_address >=", value, "daifaAddress");
            return (Criteria) this;
        }

        public Criteria andDaifaAddressLessThan(Integer value) {
            addCriterion("daifa_address <", value, "daifaAddress");
            return (Criteria) this;
        }

        public Criteria andDaifaAddressLessThanOrEqualTo(Integer value) {
            addCriterion("daifa_address <=", value, "daifaAddress");
            return (Criteria) this;
        }

        public Criteria andDaifaAddressIn(List<Integer> values) {
            addCriterion("daifa_address in", values, "daifaAddress");
            return (Criteria) this;
        }

        public Criteria andDaifaAddressNotIn(List<Integer> values) {
            addCriterion("daifa_address not in", values, "daifaAddress");
            return (Criteria) this;
        }

        public Criteria andDaifaAddressBetween(Integer value1, Integer value2) {
            addCriterion("daifa_address between", value1, value2, "daifaAddress");
            return (Criteria) this;
        }

        public Criteria andDaifaAddressNotBetween(Integer value1, Integer value2) {
            addCriterion("daifa_address not between", value1, value2, "daifaAddress");
            return (Criteria) this;
        }

        public Criteria andIsInvoiceIsNull() {
            addCriterion("is_invoice is null");
            return (Criteria) this;
        }

        public Criteria andIsInvoiceIsNotNull() {
            addCriterion("is_invoice is not null");
            return (Criteria) this;
        }

        public Criteria andIsInvoiceEqualTo(Byte value) {
            addCriterion("is_invoice =", value, "isInvoice");
            return (Criteria) this;
        }

        public Criteria andIsInvoiceNotEqualTo(Byte value) {
            addCriterion("is_invoice <>", value, "isInvoice");
            return (Criteria) this;
        }

        public Criteria andIsInvoiceGreaterThan(Byte value) {
            addCriterion("is_invoice >", value, "isInvoice");
            return (Criteria) this;
        }

        public Criteria andIsInvoiceGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_invoice >=", value, "isInvoice");
            return (Criteria) this;
        }

        public Criteria andIsInvoiceLessThan(Byte value) {
            addCriterion("is_invoice <", value, "isInvoice");
            return (Criteria) this;
        }

        public Criteria andIsInvoiceLessThanOrEqualTo(Byte value) {
            addCriterion("is_invoice <=", value, "isInvoice");
            return (Criteria) this;
        }

        public Criteria andIsInvoiceIn(List<Byte> values) {
            addCriterion("is_invoice in", values, "isInvoice");
            return (Criteria) this;
        }

        public Criteria andIsInvoiceNotIn(List<Byte> values) {
            addCriterion("is_invoice not in", values, "isInvoice");
            return (Criteria) this;
        }

        public Criteria andIsInvoiceBetween(Byte value1, Byte value2) {
            addCriterion("is_invoice between", value1, value2, "isInvoice");
            return (Criteria) this;
        }

        public Criteria andIsInvoiceNotBetween(Byte value1, Byte value2) {
            addCriterion("is_invoice not between", value1, value2, "isInvoice");
            return (Criteria) this;
        }

        public Criteria andGivePointsAllIsNull() {
            addCriterion("give_points_all is null");
            return (Criteria) this;
        }

        public Criteria andGivePointsAllIsNotNull() {
            addCriterion("give_points_all is not null");
            return (Criteria) this;
        }

        public Criteria andGivePointsAllEqualTo(Integer value) {
            addCriterion("give_points_all =", value, "givePointsAll");
            return (Criteria) this;
        }

        public Criteria andGivePointsAllNotEqualTo(Integer value) {
            addCriterion("give_points_all <>", value, "givePointsAll");
            return (Criteria) this;
        }

        public Criteria andGivePointsAllGreaterThan(Integer value) {
            addCriterion("give_points_all >", value, "givePointsAll");
            return (Criteria) this;
        }

        public Criteria andGivePointsAllGreaterThanOrEqualTo(Integer value) {
            addCriterion("give_points_all >=", value, "givePointsAll");
            return (Criteria) this;
        }

        public Criteria andGivePointsAllLessThan(Integer value) {
            addCriterion("give_points_all <", value, "givePointsAll");
            return (Criteria) this;
        }

        public Criteria andGivePointsAllLessThanOrEqualTo(Integer value) {
            addCriterion("give_points_all <=", value, "givePointsAll");
            return (Criteria) this;
        }

        public Criteria andGivePointsAllIn(List<Integer> values) {
            addCriterion("give_points_all in", values, "givePointsAll");
            return (Criteria) this;
        }

        public Criteria andGivePointsAllNotIn(List<Integer> values) {
            addCriterion("give_points_all not in", values, "givePointsAll");
            return (Criteria) this;
        }

        public Criteria andGivePointsAllBetween(Integer value1, Integer value2) {
            addCriterion("give_points_all between", value1, value2, "givePointsAll");
            return (Criteria) this;
        }

        public Criteria andGivePointsAllNotBetween(Integer value1, Integer value2) {
            addCriterion("give_points_all not between", value1, value2, "givePointsAll");
            return (Criteria) this;
        }

        public Criteria andUsePointsIsNull() {
            addCriterion("use_points is null");
            return (Criteria) this;
        }

        public Criteria andUsePointsIsNotNull() {
            addCriterion("use_points is not null");
            return (Criteria) this;
        }

        public Criteria andUsePointsEqualTo(Integer value) {
            addCriterion("use_points =", value, "usePoints");
            return (Criteria) this;
        }

        public Criteria andUsePointsNotEqualTo(Integer value) {
            addCriterion("use_points <>", value, "usePoints");
            return (Criteria) this;
        }

        public Criteria andUsePointsGreaterThan(Integer value) {
            addCriterion("use_points >", value, "usePoints");
            return (Criteria) this;
        }

        public Criteria andUsePointsGreaterThanOrEqualTo(Integer value) {
            addCriterion("use_points >=", value, "usePoints");
            return (Criteria) this;
        }

        public Criteria andUsePointsLessThan(Integer value) {
            addCriterion("use_points <", value, "usePoints");
            return (Criteria) this;
        }

        public Criteria andUsePointsLessThanOrEqualTo(Integer value) {
            addCriterion("use_points <=", value, "usePoints");
            return (Criteria) this;
        }

        public Criteria andUsePointsIn(List<Integer> values) {
            addCriterion("use_points in", values, "usePoints");
            return (Criteria) this;
        }

        public Criteria andUsePointsNotIn(List<Integer> values) {
            addCriterion("use_points not in", values, "usePoints");
            return (Criteria) this;
        }

        public Criteria andUsePointsBetween(Integer value1, Integer value2) {
            addCriterion("use_points between", value1, value2, "usePoints");
            return (Criteria) this;
        }

        public Criteria andUsePointsNotBetween(Integer value1, Integer value2) {
            addCriterion("use_points not between", value1, value2, "usePoints");
            return (Criteria) this;
        }

        public Criteria andIsUsePointsIsNull() {
            addCriterion("is_use_points is null");
            return (Criteria) this;
        }

        public Criteria andIsUsePointsIsNotNull() {
            addCriterion("is_use_points is not null");
            return (Criteria) this;
        }

        public Criteria andIsUsePointsEqualTo(String value) {
            addCriterion("is_use_points =", value, "isUsePoints");
            return (Criteria) this;
        }

        public Criteria andIsUsePointsNotEqualTo(String value) {
            addCriterion("is_use_points <>", value, "isUsePoints");
            return (Criteria) this;
        }

        public Criteria andIsUsePointsGreaterThan(String value) {
            addCriterion("is_use_points >", value, "isUsePoints");
            return (Criteria) this;
        }

        public Criteria andIsUsePointsGreaterThanOrEqualTo(String value) {
            addCriterion("is_use_points >=", value, "isUsePoints");
            return (Criteria) this;
        }

        public Criteria andIsUsePointsLessThan(String value) {
            addCriterion("is_use_points <", value, "isUsePoints");
            return (Criteria) this;
        }

        public Criteria andIsUsePointsLessThanOrEqualTo(String value) {
            addCriterion("is_use_points <=", value, "isUsePoints");
            return (Criteria) this;
        }

        public Criteria andIsUsePointsLike(String value) {
            addCriterion("is_use_points like", value, "isUsePoints");
            return (Criteria) this;
        }

        public Criteria andIsUsePointsNotLike(String value) {
            addCriterion("is_use_points not like", value, "isUsePoints");
            return (Criteria) this;
        }

        public Criteria andIsUsePointsIn(List<String> values) {
            addCriterion("is_use_points in", values, "isUsePoints");
            return (Criteria) this;
        }

        public Criteria andIsUsePointsNotIn(List<String> values) {
            addCriterion("is_use_points not in", values, "isUsePoints");
            return (Criteria) this;
        }

        public Criteria andIsUsePointsBetween(String value1, String value2) {
            addCriterion("is_use_points between", value1, value2, "isUsePoints");
            return (Criteria) this;
        }

        public Criteria andIsUsePointsNotBetween(String value1, String value2) {
            addCriterion("is_use_points not between", value1, value2, "isUsePoints");
            return (Criteria) this;
        }

        public Criteria andPointsFeeIsNull() {
            addCriterion("points_fee is null");
            return (Criteria) this;
        }

        public Criteria andPointsFeeIsNotNull() {
            addCriterion("points_fee is not null");
            return (Criteria) this;
        }

        public Criteria andPointsFeeEqualTo(BigDecimal value) {
            addCriterion("points_fee =", value, "pointsFee");
            return (Criteria) this;
        }

        public Criteria andPointsFeeNotEqualTo(BigDecimal value) {
            addCriterion("points_fee <>", value, "pointsFee");
            return (Criteria) this;
        }

        public Criteria andPointsFeeGreaterThan(BigDecimal value) {
            addCriterion("points_fee >", value, "pointsFee");
            return (Criteria) this;
        }

        public Criteria andPointsFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("points_fee >=", value, "pointsFee");
            return (Criteria) this;
        }

        public Criteria andPointsFeeLessThan(BigDecimal value) {
            addCriterion("points_fee <", value, "pointsFee");
            return (Criteria) this;
        }

        public Criteria andPointsFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("points_fee <=", value, "pointsFee");
            return (Criteria) this;
        }

        public Criteria andPointsFeeIn(List<BigDecimal> values) {
            addCriterion("points_fee in", values, "pointsFee");
            return (Criteria) this;
        }

        public Criteria andPointsFeeNotIn(List<BigDecimal> values) {
            addCriterion("points_fee not in", values, "pointsFee");
            return (Criteria) this;
        }

        public Criteria andPointsFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("points_fee between", value1, value2, "pointsFee");
            return (Criteria) this;
        }

        public Criteria andPointsFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("points_fee not between", value1, value2, "pointsFee");
            return (Criteria) this;
        }

        public Criteria andGiftIdIsNull() {
            addCriterion("gift_id is null");
            return (Criteria) this;
        }

        public Criteria andGiftIdIsNotNull() {
            addCriterion("gift_id is not null");
            return (Criteria) this;
        }

        public Criteria andGiftIdEqualTo(Integer value) {
            addCriterion("gift_id =", value, "giftId");
            return (Criteria) this;
        }

        public Criteria andGiftIdNotEqualTo(Integer value) {
            addCriterion("gift_id <>", value, "giftId");
            return (Criteria) this;
        }

        public Criteria andGiftIdGreaterThan(Integer value) {
            addCriterion("gift_id >", value, "giftId");
            return (Criteria) this;
        }

        public Criteria andGiftIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("gift_id >=", value, "giftId");
            return (Criteria) this;
        }

        public Criteria andGiftIdLessThan(Integer value) {
            addCriterion("gift_id <", value, "giftId");
            return (Criteria) this;
        }

        public Criteria andGiftIdLessThanOrEqualTo(Integer value) {
            addCriterion("gift_id <=", value, "giftId");
            return (Criteria) this;
        }

        public Criteria andGiftIdIn(List<Integer> values) {
            addCriterion("gift_id in", values, "giftId");
            return (Criteria) this;
        }

        public Criteria andGiftIdNotIn(List<Integer> values) {
            addCriterion("gift_id not in", values, "giftId");
            return (Criteria) this;
        }

        public Criteria andGiftIdBetween(Integer value1, Integer value2) {
            addCriterion("gift_id between", value1, value2, "giftId");
            return (Criteria) this;
        }

        public Criteria andGiftIdNotBetween(Integer value1, Integer value2) {
            addCriterion("gift_id not between", value1, value2, "giftId");
            return (Criteria) this;
        }

        public Criteria andIccidIsNull() {
            addCriterion("iccid is null");
            return (Criteria) this;
        }

        public Criteria andIccidIsNotNull() {
            addCriterion("iccid is not null");
            return (Criteria) this;
        }

        public Criteria andIccidEqualTo(String value) {
            addCriterion("iccid =", value, "iccid");
            return (Criteria) this;
        }

        public Criteria andIccidNotEqualTo(String value) {
            addCriterion("iccid <>", value, "iccid");
            return (Criteria) this;
        }

        public Criteria andIccidGreaterThan(String value) {
            addCriterion("iccid >", value, "iccid");
            return (Criteria) this;
        }

        public Criteria andIccidGreaterThanOrEqualTo(String value) {
            addCriterion("iccid >=", value, "iccid");
            return (Criteria) this;
        }

        public Criteria andIccidLessThan(String value) {
            addCriterion("iccid <", value, "iccid");
            return (Criteria) this;
        }

        public Criteria andIccidLessThanOrEqualTo(String value) {
            addCriterion("iccid <=", value, "iccid");
            return (Criteria) this;
        }

        public Criteria andIccidLike(String value) {
            addCriterion("iccid like", value, "iccid");
            return (Criteria) this;
        }

        public Criteria andIccidNotLike(String value) {
            addCriterion("iccid not like", value, "iccid");
            return (Criteria) this;
        }

        public Criteria andIccidIn(List<String> values) {
            addCriterion("iccid in", values, "iccid");
            return (Criteria) this;
        }

        public Criteria andIccidNotIn(List<String> values) {
            addCriterion("iccid not in", values, "iccid");
            return (Criteria) this;
        }

        public Criteria andIccidBetween(String value1, String value2) {
            addCriterion("iccid between", value1, value2, "iccid");
            return (Criteria) this;
        }

        public Criteria andIccidNotBetween(String value1, String value2) {
            addCriterion("iccid not between", value1, value2, "iccid");
            return (Criteria) this;
        }

        public Criteria andKuaidiTypeIsNull() {
            addCriterion("kuaidi_type is null");
            return (Criteria) this;
        }

        public Criteria andKuaidiTypeIsNotNull() {
            addCriterion("kuaidi_type is not null");
            return (Criteria) this;
        }

        public Criteria andKuaidiTypeEqualTo(Integer value) {
            addCriterion("kuaidi_type =", value, "kuaidiType");
            return (Criteria) this;
        }

        public Criteria andKuaidiTypeNotEqualTo(Integer value) {
            addCriterion("kuaidi_type <>", value, "kuaidiType");
            return (Criteria) this;
        }

        public Criteria andKuaidiTypeGreaterThan(Integer value) {
            addCriterion("kuaidi_type >", value, "kuaidiType");
            return (Criteria) this;
        }

        public Criteria andKuaidiTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("kuaidi_type >=", value, "kuaidiType");
            return (Criteria) this;
        }

        public Criteria andKuaidiTypeLessThan(Integer value) {
            addCriterion("kuaidi_type <", value, "kuaidiType");
            return (Criteria) this;
        }

        public Criteria andKuaidiTypeLessThanOrEqualTo(Integer value) {
            addCriterion("kuaidi_type <=", value, "kuaidiType");
            return (Criteria) this;
        }

        public Criteria andKuaidiTypeIn(List<Integer> values) {
            addCriterion("kuaidi_type in", values, "kuaidiType");
            return (Criteria) this;
        }

        public Criteria andKuaidiTypeNotIn(List<Integer> values) {
            addCriterion("kuaidi_type not in", values, "kuaidiType");
            return (Criteria) this;
        }

        public Criteria andKuaidiTypeBetween(Integer value1, Integer value2) {
            addCriterion("kuaidi_type between", value1, value2, "kuaidiType");
            return (Criteria) this;
        }

        public Criteria andKuaidiTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("kuaidi_type not between", value1, value2, "kuaidiType");
            return (Criteria) this;
        }

        public Criteria andSaleAccountIdIsNull() {
            addCriterion("sale_account_id is null");
            return (Criteria) this;
        }

        public Criteria andSaleAccountIdIsNotNull() {
            addCriterion("sale_account_id is not null");
            return (Criteria) this;
        }

        public Criteria andSaleAccountIdEqualTo(Integer value) {
            addCriterion("sale_account_id =", value, "saleAccountId");
            return (Criteria) this;
        }

        public Criteria andSaleAccountIdNotEqualTo(Integer value) {
            addCriterion("sale_account_id <>", value, "saleAccountId");
            return (Criteria) this;
        }

        public Criteria andSaleAccountIdGreaterThan(Integer value) {
            addCriterion("sale_account_id >", value, "saleAccountId");
            return (Criteria) this;
        }

        public Criteria andSaleAccountIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sale_account_id >=", value, "saleAccountId");
            return (Criteria) this;
        }

        public Criteria andSaleAccountIdLessThan(Integer value) {
            addCriterion("sale_account_id <", value, "saleAccountId");
            return (Criteria) this;
        }

        public Criteria andSaleAccountIdLessThanOrEqualTo(Integer value) {
            addCriterion("sale_account_id <=", value, "saleAccountId");
            return (Criteria) this;
        }

        public Criteria andSaleAccountIdIn(List<Integer> values) {
            addCriterion("sale_account_id in", values, "saleAccountId");
            return (Criteria) this;
        }

        public Criteria andSaleAccountIdNotIn(List<Integer> values) {
            addCriterion("sale_account_id not in", values, "saleAccountId");
            return (Criteria) this;
        }

        public Criteria andSaleAccountIdBetween(Integer value1, Integer value2) {
            addCriterion("sale_account_id between", value1, value2, "saleAccountId");
            return (Criteria) this;
        }

        public Criteria andSaleAccountIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sale_account_id not between", value1, value2, "saleAccountId");
            return (Criteria) this;
        }

        public Criteria andFromUserIdIsNull() {
            addCriterion("from_user_id is null");
            return (Criteria) this;
        }

        public Criteria andFromUserIdIsNotNull() {
            addCriterion("from_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andFromUserIdEqualTo(Integer value) {
            addCriterion("from_user_id =", value, "fromUserId");
            return (Criteria) this;
        }

        public Criteria andFromUserIdNotEqualTo(Integer value) {
            addCriterion("from_user_id <>", value, "fromUserId");
            return (Criteria) this;
        }

        public Criteria andFromUserIdGreaterThan(Integer value) {
            addCriterion("from_user_id >", value, "fromUserId");
            return (Criteria) this;
        }

        public Criteria andFromUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("from_user_id >=", value, "fromUserId");
            return (Criteria) this;
        }

        public Criteria andFromUserIdLessThan(Integer value) {
            addCriterion("from_user_id <", value, "fromUserId");
            return (Criteria) this;
        }

        public Criteria andFromUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("from_user_id <=", value, "fromUserId");
            return (Criteria) this;
        }

        public Criteria andFromUserIdIn(List<Integer> values) {
            addCriterion("from_user_id in", values, "fromUserId");
            return (Criteria) this;
        }

        public Criteria andFromUserIdNotIn(List<Integer> values) {
            addCriterion("from_user_id not in", values, "fromUserId");
            return (Criteria) this;
        }

        public Criteria andFromUserIdBetween(Integer value1, Integer value2) {
            addCriterion("from_user_id between", value1, value2, "fromUserId");
            return (Criteria) this;
        }

        public Criteria andFromUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("from_user_id not between", value1, value2, "fromUserId");
            return (Criteria) this;
        }

        public Criteria andFromShopIdIsNull() {
            addCriterion("from_shop_id is null");
            return (Criteria) this;
        }

        public Criteria andFromShopIdIsNotNull() {
            addCriterion("from_shop_id is not null");
            return (Criteria) this;
        }

        public Criteria andFromShopIdEqualTo(Integer value) {
            addCriterion("from_shop_id =", value, "fromShopId");
            return (Criteria) this;
        }

        public Criteria andFromShopIdNotEqualTo(Integer value) {
            addCriterion("from_shop_id <>", value, "fromShopId");
            return (Criteria) this;
        }

        public Criteria andFromShopIdGreaterThan(Integer value) {
            addCriterion("from_shop_id >", value, "fromShopId");
            return (Criteria) this;
        }

        public Criteria andFromShopIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("from_shop_id >=", value, "fromShopId");
            return (Criteria) this;
        }

        public Criteria andFromShopIdLessThan(Integer value) {
            addCriterion("from_shop_id <", value, "fromShopId");
            return (Criteria) this;
        }

        public Criteria andFromShopIdLessThanOrEqualTo(Integer value) {
            addCriterion("from_shop_id <=", value, "fromShopId");
            return (Criteria) this;
        }

        public Criteria andFromShopIdIn(List<Integer> values) {
            addCriterion("from_shop_id in", values, "fromShopId");
            return (Criteria) this;
        }

        public Criteria andFromShopIdNotIn(List<Integer> values) {
            addCriterion("from_shop_id not in", values, "fromShopId");
            return (Criteria) this;
        }

        public Criteria andFromShopIdBetween(Integer value1, Integer value2) {
            addCriterion("from_shop_id between", value1, value2, "fromShopId");
            return (Criteria) this;
        }

        public Criteria andFromShopIdNotBetween(Integer value1, Integer value2) {
            addCriterion("from_shop_id not between", value1, value2, "fromShopId");
            return (Criteria) this;
        }

        public Criteria andIsSelfStatusIsNull() {
            addCriterion("is_self_status is null");
            return (Criteria) this;
        }

        public Criteria andIsSelfStatusIsNotNull() {
            addCriterion("is_self_status is not null");
            return (Criteria) this;
        }

        public Criteria andIsSelfStatusEqualTo(Integer value) {
            addCriterion("is_self_status =", value, "isSelfStatus");
            return (Criteria) this;
        }

        public Criteria andIsSelfStatusNotEqualTo(Integer value) {
            addCriterion("is_self_status <>", value, "isSelfStatus");
            return (Criteria) this;
        }

        public Criteria andIsSelfStatusGreaterThan(Integer value) {
            addCriterion("is_self_status >", value, "isSelfStatus");
            return (Criteria) this;
        }

        public Criteria andIsSelfStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_self_status >=", value, "isSelfStatus");
            return (Criteria) this;
        }

        public Criteria andIsSelfStatusLessThan(Integer value) {
            addCriterion("is_self_status <", value, "isSelfStatus");
            return (Criteria) this;
        }

        public Criteria andIsSelfStatusLessThanOrEqualTo(Integer value) {
            addCriterion("is_self_status <=", value, "isSelfStatus");
            return (Criteria) this;
        }

        public Criteria andIsSelfStatusIn(List<Integer> values) {
            addCriterion("is_self_status in", values, "isSelfStatus");
            return (Criteria) this;
        }

        public Criteria andIsSelfStatusNotIn(List<Integer> values) {
            addCriterion("is_self_status not in", values, "isSelfStatus");
            return (Criteria) this;
        }

        public Criteria andIsSelfStatusBetween(Integer value1, Integer value2) {
            addCriterion("is_self_status between", value1, value2, "isSelfStatus");
            return (Criteria) this;
        }

        public Criteria andIsSelfStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("is_self_status not between", value1, value2, "isSelfStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsPintuanIdIsNull() {
            addCriterion("goods_pintuan_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodsPintuanIdIsNotNull() {
            addCriterion("goods_pintuan_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsPintuanIdEqualTo(Integer value) {
            addCriterion("goods_pintuan_id =", value, "goodsPintuanId");
            return (Criteria) this;
        }

        public Criteria andGoodsPintuanIdNotEqualTo(Integer value) {
            addCriterion("goods_pintuan_id <>", value, "goodsPintuanId");
            return (Criteria) this;
        }

        public Criteria andGoodsPintuanIdGreaterThan(Integer value) {
            addCriterion("goods_pintuan_id >", value, "goodsPintuanId");
            return (Criteria) this;
        }

        public Criteria andGoodsPintuanIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_pintuan_id >=", value, "goodsPintuanId");
            return (Criteria) this;
        }

        public Criteria andGoodsPintuanIdLessThan(Integer value) {
            addCriterion("goods_pintuan_id <", value, "goodsPintuanId");
            return (Criteria) this;
        }

        public Criteria andGoodsPintuanIdLessThanOrEqualTo(Integer value) {
            addCriterion("goods_pintuan_id <=", value, "goodsPintuanId");
            return (Criteria) this;
        }

        public Criteria andGoodsPintuanIdIn(List<Integer> values) {
            addCriterion("goods_pintuan_id in", values, "goodsPintuanId");
            return (Criteria) this;
        }

        public Criteria andGoodsPintuanIdNotIn(List<Integer> values) {
            addCriterion("goods_pintuan_id not in", values, "goodsPintuanId");
            return (Criteria) this;
        }

        public Criteria andGoodsPintuanIdBetween(Integer value1, Integer value2) {
            addCriterion("goods_pintuan_id between", value1, value2, "goodsPintuanId");
            return (Criteria) this;
        }

        public Criteria andGoodsPintuanIdNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_pintuan_id not between", value1, value2, "goodsPintuanId");
            return (Criteria) this;
        }

        public Criteria andIsYuncangFromIsNull() {
            addCriterion("is_yuncang_from is null");
            return (Criteria) this;
        }

        public Criteria andIsYuncangFromIsNotNull() {
            addCriterion("is_yuncang_from is not null");
            return (Criteria) this;
        }

        public Criteria andIsYuncangFromEqualTo(Short value) {
            addCriterion("is_yuncang_from =", value, "isYuncangFrom");
            return (Criteria) this;
        }

        public Criteria andIsYuncangFromNotEqualTo(Short value) {
            addCriterion("is_yuncang_from <>", value, "isYuncangFrom");
            return (Criteria) this;
        }

        public Criteria andIsYuncangFromGreaterThan(Short value) {
            addCriterion("is_yuncang_from >", value, "isYuncangFrom");
            return (Criteria) this;
        }

        public Criteria andIsYuncangFromGreaterThanOrEqualTo(Short value) {
            addCriterion("is_yuncang_from >=", value, "isYuncangFrom");
            return (Criteria) this;
        }

        public Criteria andIsYuncangFromLessThan(Short value) {
            addCriterion("is_yuncang_from <", value, "isYuncangFrom");
            return (Criteria) this;
        }

        public Criteria andIsYuncangFromLessThanOrEqualTo(Short value) {
            addCriterion("is_yuncang_from <=", value, "isYuncangFrom");
            return (Criteria) this;
        }

        public Criteria andIsYuncangFromIn(List<Short> values) {
            addCriterion("is_yuncang_from in", values, "isYuncangFrom");
            return (Criteria) this;
        }

        public Criteria andIsYuncangFromNotIn(List<Short> values) {
            addCriterion("is_yuncang_from not in", values, "isYuncangFrom");
            return (Criteria) this;
        }

        public Criteria andIsYuncangFromBetween(Short value1, Short value2) {
            addCriterion("is_yuncang_from between", value1, value2, "isYuncangFrom");
            return (Criteria) this;
        }

        public Criteria andIsYuncangFromNotBetween(Short value1, Short value2) {
            addCriterion("is_yuncang_from not between", value1, value2, "isYuncangFrom");
            return (Criteria) this;
        }

        public Criteria andIsYuncangIsNull() {
            addCriterion("is_yuncang is null");
            return (Criteria) this;
        }

        public Criteria andIsYuncangIsNotNull() {
            addCriterion("is_yuncang is not null");
            return (Criteria) this;
        }

        public Criteria andIsYuncangEqualTo(Short value) {
            addCriterion("is_yuncang =", value, "isYuncang");
            return (Criteria) this;
        }

        public Criteria andIsYuncangNotEqualTo(Short value) {
            addCriterion("is_yuncang <>", value, "isYuncang");
            return (Criteria) this;
        }

        public Criteria andIsYuncangGreaterThan(Short value) {
            addCriterion("is_yuncang >", value, "isYuncang");
            return (Criteria) this;
        }

        public Criteria andIsYuncangGreaterThanOrEqualTo(Short value) {
            addCriterion("is_yuncang >=", value, "isYuncang");
            return (Criteria) this;
        }

        public Criteria andIsYuncangLessThan(Short value) {
            addCriterion("is_yuncang <", value, "isYuncang");
            return (Criteria) this;
        }

        public Criteria andIsYuncangLessThanOrEqualTo(Short value) {
            addCriterion("is_yuncang <=", value, "isYuncang");
            return (Criteria) this;
        }

        public Criteria andIsYuncangIn(List<Short> values) {
            addCriterion("is_yuncang in", values, "isYuncang");
            return (Criteria) this;
        }

        public Criteria andIsYuncangNotIn(List<Short> values) {
            addCriterion("is_yuncang not in", values, "isYuncang");
            return (Criteria) this;
        }

        public Criteria andIsYuncangBetween(Short value1, Short value2) {
            addCriterion("is_yuncang between", value1, value2, "isYuncang");
            return (Criteria) this;
        }

        public Criteria andIsYuncangNotBetween(Short value1, Short value2) {
            addCriterion("is_yuncang not between", value1, value2, "isYuncang");
            return (Criteria) this;
        }

        public Criteria andIsSignIsNull() {
            addCriterion("is_sign is null");
            return (Criteria) this;
        }

        public Criteria andIsSignIsNotNull() {
            addCriterion("is_sign is not null");
            return (Criteria) this;
        }

        public Criteria andIsSignEqualTo(Short value) {
            addCriterion("is_sign =", value, "isSign");
            return (Criteria) this;
        }

        public Criteria andIsSignNotEqualTo(Short value) {
            addCriterion("is_sign <>", value, "isSign");
            return (Criteria) this;
        }

        public Criteria andIsSignGreaterThan(Short value) {
            addCriterion("is_sign >", value, "isSign");
            return (Criteria) this;
        }

        public Criteria andIsSignGreaterThanOrEqualTo(Short value) {
            addCriterion("is_sign >=", value, "isSign");
            return (Criteria) this;
        }

        public Criteria andIsSignLessThan(Short value) {
            addCriterion("is_sign <", value, "isSign");
            return (Criteria) this;
        }

        public Criteria andIsSignLessThanOrEqualTo(Short value) {
            addCriterion("is_sign <=", value, "isSign");
            return (Criteria) this;
        }

        public Criteria andIsSignIn(List<Short> values) {
            addCriterion("is_sign in", values, "isSign");
            return (Criteria) this;
        }

        public Criteria andIsSignNotIn(List<Short> values) {
            addCriterion("is_sign not in", values, "isSign");
            return (Criteria) this;
        }

        public Criteria andIsSignBetween(Short value1, Short value2) {
            addCriterion("is_sign between", value1, value2, "isSign");
            return (Criteria) this;
        }

        public Criteria andIsSignNotBetween(Short value1, Short value2) {
            addCriterion("is_sign not between", value1, value2, "isSign");
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