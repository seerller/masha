package com.masha.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class TlShopGoodsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TlShopGoodsExample() {
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

        public Criteria andGoodsNameIsNull() {
            addCriterion("goods_name is null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIsNotNull() {
            addCriterion("goods_name is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameEqualTo(String value) {
            addCriterion("goods_name =", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotEqualTo(String value) {
            addCriterion("goods_name <>", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThan(String value) {
            addCriterion("goods_name >", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThanOrEqualTo(String value) {
            addCriterion("goods_name >=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThan(String value) {
            addCriterion("goods_name <", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThanOrEqualTo(String value) {
            addCriterion("goods_name <=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLike(String value) {
            addCriterion("goods_name like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotLike(String value) {
            addCriterion("goods_name not like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIn(List<String> values) {
            addCriterion("goods_name in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotIn(List<String> values) {
            addCriterion("goods_name not in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameBetween(String value1, String value2) {
            addCriterion("goods_name between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotBetween(String value1, String value2) {
            addCriterion("goods_name not between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andSubTitleIsNull() {
            addCriterion("sub_title is null");
            return (Criteria) this;
        }

        public Criteria andSubTitleIsNotNull() {
            addCriterion("sub_title is not null");
            return (Criteria) this;
        }

        public Criteria andSubTitleEqualTo(String value) {
            addCriterion("sub_title =", value, "subTitle");
            return (Criteria) this;
        }

        public Criteria andSubTitleNotEqualTo(String value) {
            addCriterion("sub_title <>", value, "subTitle");
            return (Criteria) this;
        }

        public Criteria andSubTitleGreaterThan(String value) {
            addCriterion("sub_title >", value, "subTitle");
            return (Criteria) this;
        }

        public Criteria andSubTitleGreaterThanOrEqualTo(String value) {
            addCriterion("sub_title >=", value, "subTitle");
            return (Criteria) this;
        }

        public Criteria andSubTitleLessThan(String value) {
            addCriterion("sub_title <", value, "subTitle");
            return (Criteria) this;
        }

        public Criteria andSubTitleLessThanOrEqualTo(String value) {
            addCriterion("sub_title <=", value, "subTitle");
            return (Criteria) this;
        }

        public Criteria andSubTitleLike(String value) {
            addCriterion("sub_title like", value, "subTitle");
            return (Criteria) this;
        }

        public Criteria andSubTitleNotLike(String value) {
            addCriterion("sub_title not like", value, "subTitle");
            return (Criteria) this;
        }

        public Criteria andSubTitleIn(List<String> values) {
            addCriterion("sub_title in", values, "subTitle");
            return (Criteria) this;
        }

        public Criteria andSubTitleNotIn(List<String> values) {
            addCriterion("sub_title not in", values, "subTitle");
            return (Criteria) this;
        }

        public Criteria andSubTitleBetween(String value1, String value2) {
            addCriterion("sub_title between", value1, value2, "subTitle");
            return (Criteria) this;
        }

        public Criteria andSubTitleNotBetween(String value1, String value2) {
            addCriterion("sub_title not between", value1, value2, "subTitle");
            return (Criteria) this;
        }

        public Criteria andGoodsNameStyleIsNull() {
            addCriterion("goods_name_style is null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameStyleIsNotNull() {
            addCriterion("goods_name_style is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameStyleEqualTo(String value) {
            addCriterion("goods_name_style =", value, "goodsNameStyle");
            return (Criteria) this;
        }

        public Criteria andGoodsNameStyleNotEqualTo(String value) {
            addCriterion("goods_name_style <>", value, "goodsNameStyle");
            return (Criteria) this;
        }

        public Criteria andGoodsNameStyleGreaterThan(String value) {
            addCriterion("goods_name_style >", value, "goodsNameStyle");
            return (Criteria) this;
        }

        public Criteria andGoodsNameStyleGreaterThanOrEqualTo(String value) {
            addCriterion("goods_name_style >=", value, "goodsNameStyle");
            return (Criteria) this;
        }

        public Criteria andGoodsNameStyleLessThan(String value) {
            addCriterion("goods_name_style <", value, "goodsNameStyle");
            return (Criteria) this;
        }

        public Criteria andGoodsNameStyleLessThanOrEqualTo(String value) {
            addCriterion("goods_name_style <=", value, "goodsNameStyle");
            return (Criteria) this;
        }

        public Criteria andGoodsNameStyleLike(String value) {
            addCriterion("goods_name_style like", value, "goodsNameStyle");
            return (Criteria) this;
        }

        public Criteria andGoodsNameStyleNotLike(String value) {
            addCriterion("goods_name_style not like", value, "goodsNameStyle");
            return (Criteria) this;
        }

        public Criteria andGoodsNameStyleIn(List<String> values) {
            addCriterion("goods_name_style in", values, "goodsNameStyle");
            return (Criteria) this;
        }

        public Criteria andGoodsNameStyleNotIn(List<String> values) {
            addCriterion("goods_name_style not in", values, "goodsNameStyle");
            return (Criteria) this;
        }

        public Criteria andGoodsNameStyleBetween(String value1, String value2) {
            addCriterion("goods_name_style between", value1, value2, "goodsNameStyle");
            return (Criteria) this;
        }

        public Criteria andGoodsNameStyleNotBetween(String value1, String value2) {
            addCriterion("goods_name_style not between", value1, value2, "goodsNameStyle");
            return (Criteria) this;
        }

        public Criteria andKeywordIsNull() {
            addCriterion("keyword is null");
            return (Criteria) this;
        }

        public Criteria andKeywordIsNotNull() {
            addCriterion("keyword is not null");
            return (Criteria) this;
        }

        public Criteria andKeywordEqualTo(String value) {
            addCriterion("keyword =", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordNotEqualTo(String value) {
            addCriterion("keyword <>", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordGreaterThan(String value) {
            addCriterion("keyword >", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordGreaterThanOrEqualTo(String value) {
            addCriterion("keyword >=", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordLessThan(String value) {
            addCriterion("keyword <", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordLessThanOrEqualTo(String value) {
            addCriterion("keyword <=", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordLike(String value) {
            addCriterion("keyword like", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordNotLike(String value) {
            addCriterion("keyword not like", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordIn(List<String> values) {
            addCriterion("keyword in", values, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordNotIn(List<String> values) {
            addCriterion("keyword not in", values, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordBetween(String value1, String value2) {
            addCriterion("keyword between", value1, value2, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordNotBetween(String value1, String value2) {
            addCriterion("keyword not between", value1, value2, "keyword");
            return (Criteria) this;
        }

        public Criteria andCountBuyIsNull() {
            addCriterion("count_buy is null");
            return (Criteria) this;
        }

        public Criteria andCountBuyIsNotNull() {
            addCriterion("count_buy is not null");
            return (Criteria) this;
        }

        public Criteria andCountBuyEqualTo(Integer value) {
            addCriterion("count_buy =", value, "countBuy");
            return (Criteria) this;
        }

        public Criteria andCountBuyNotEqualTo(Integer value) {
            addCriterion("count_buy <>", value, "countBuy");
            return (Criteria) this;
        }

        public Criteria andCountBuyGreaterThan(Integer value) {
            addCriterion("count_buy >", value, "countBuy");
            return (Criteria) this;
        }

        public Criteria andCountBuyGreaterThanOrEqualTo(Integer value) {
            addCriterion("count_buy >=", value, "countBuy");
            return (Criteria) this;
        }

        public Criteria andCountBuyLessThan(Integer value) {
            addCriterion("count_buy <", value, "countBuy");
            return (Criteria) this;
        }

        public Criteria andCountBuyLessThanOrEqualTo(Integer value) {
            addCriterion("count_buy <=", value, "countBuy");
            return (Criteria) this;
        }

        public Criteria andCountBuyIn(List<Integer> values) {
            addCriterion("count_buy in", values, "countBuy");
            return (Criteria) this;
        }

        public Criteria andCountBuyNotIn(List<Integer> values) {
            addCriterion("count_buy not in", values, "countBuy");
            return (Criteria) this;
        }

        public Criteria andCountBuyBetween(Integer value1, Integer value2) {
            addCriterion("count_buy between", value1, value2, "countBuy");
            return (Criteria) this;
        }

        public Criteria andCountBuyNotBetween(Integer value1, Integer value2) {
            addCriterion("count_buy not between", value1, value2, "countBuy");
            return (Criteria) this;
        }

        public Criteria andCountViewIsNull() {
            addCriterion("count_view is null");
            return (Criteria) this;
        }

        public Criteria andCountViewIsNotNull() {
            addCriterion("count_view is not null");
            return (Criteria) this;
        }

        public Criteria andCountViewEqualTo(Integer value) {
            addCriterion("count_view =", value, "countView");
            return (Criteria) this;
        }

        public Criteria andCountViewNotEqualTo(Integer value) {
            addCriterion("count_view <>", value, "countView");
            return (Criteria) this;
        }

        public Criteria andCountViewGreaterThan(Integer value) {
            addCriterion("count_view >", value, "countView");
            return (Criteria) this;
        }

        public Criteria andCountViewGreaterThanOrEqualTo(Integer value) {
            addCriterion("count_view >=", value, "countView");
            return (Criteria) this;
        }

        public Criteria andCountViewLessThan(Integer value) {
            addCriterion("count_view <", value, "countView");
            return (Criteria) this;
        }

        public Criteria andCountViewLessThanOrEqualTo(Integer value) {
            addCriterion("count_view <=", value, "countView");
            return (Criteria) this;
        }

        public Criteria andCountViewIn(List<Integer> values) {
            addCriterion("count_view in", values, "countView");
            return (Criteria) this;
        }

        public Criteria andCountViewNotIn(List<Integer> values) {
            addCriterion("count_view not in", values, "countView");
            return (Criteria) this;
        }

        public Criteria andCountViewBetween(Integer value1, Integer value2) {
            addCriterion("count_view between", value1, value2, "countView");
            return (Criteria) this;
        }

        public Criteria andCountViewNotBetween(Integer value1, Integer value2) {
            addCriterion("count_view not between", value1, value2, "countView");
            return (Criteria) this;
        }

        public Criteria andCateIdIsNull() {
            addCriterion("cate_id is null");
            return (Criteria) this;
        }

        public Criteria andCateIdIsNotNull() {
            addCriterion("cate_id is not null");
            return (Criteria) this;
        }

        public Criteria andCateIdEqualTo(Integer value) {
            addCriterion("cate_id =", value, "cateId");
            return (Criteria) this;
        }

        public Criteria andCateIdNotEqualTo(Integer value) {
            addCriterion("cate_id <>", value, "cateId");
            return (Criteria) this;
        }

        public Criteria andCateIdGreaterThan(Integer value) {
            addCriterion("cate_id >", value, "cateId");
            return (Criteria) this;
        }

        public Criteria andCateIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("cate_id >=", value, "cateId");
            return (Criteria) this;
        }

        public Criteria andCateIdLessThan(Integer value) {
            addCriterion("cate_id <", value, "cateId");
            return (Criteria) this;
        }

        public Criteria andCateIdLessThanOrEqualTo(Integer value) {
            addCriterion("cate_id <=", value, "cateId");
            return (Criteria) this;
        }

        public Criteria andCateIdIn(List<Integer> values) {
            addCriterion("cate_id in", values, "cateId");
            return (Criteria) this;
        }

        public Criteria andCateIdNotIn(List<Integer> values) {
            addCriterion("cate_id not in", values, "cateId");
            return (Criteria) this;
        }

        public Criteria andCateIdBetween(Integer value1, Integer value2) {
            addCriterion("cate_id between", value1, value2, "cateId");
            return (Criteria) this;
        }

        public Criteria andCateIdNotBetween(Integer value1, Integer value2) {
            addCriterion("cate_id not between", value1, value2, "cateId");
            return (Criteria) this;
        }

        public Criteria andHomeCateIsNull() {
            addCriterion("home_cate is null");
            return (Criteria) this;
        }

        public Criteria andHomeCateIsNotNull() {
            addCriterion("home_cate is not null");
            return (Criteria) this;
        }

        public Criteria andHomeCateEqualTo(Integer value) {
            addCriterion("home_cate =", value, "homeCate");
            return (Criteria) this;
        }

        public Criteria andHomeCateNotEqualTo(Integer value) {
            addCriterion("home_cate <>", value, "homeCate");
            return (Criteria) this;
        }

        public Criteria andHomeCateGreaterThan(Integer value) {
            addCriterion("home_cate >", value, "homeCate");
            return (Criteria) this;
        }

        public Criteria andHomeCateGreaterThanOrEqualTo(Integer value) {
            addCriterion("home_cate >=", value, "homeCate");
            return (Criteria) this;
        }

        public Criteria andHomeCateLessThan(Integer value) {
            addCriterion("home_cate <", value, "homeCate");
            return (Criteria) this;
        }

        public Criteria andHomeCateLessThanOrEqualTo(Integer value) {
            addCriterion("home_cate <=", value, "homeCate");
            return (Criteria) this;
        }

        public Criteria andHomeCateIn(List<Integer> values) {
            addCriterion("home_cate in", values, "homeCate");
            return (Criteria) this;
        }

        public Criteria andHomeCateNotIn(List<Integer> values) {
            addCriterion("home_cate not in", values, "homeCate");
            return (Criteria) this;
        }

        public Criteria andHomeCateBetween(Integer value1, Integer value2) {
            addCriterion("home_cate between", value1, value2, "homeCate");
            return (Criteria) this;
        }

        public Criteria andHomeCateNotBetween(Integer value1, Integer value2) {
            addCriterion("home_cate not between", value1, value2, "homeCate");
            return (Criteria) this;
        }

        public Criteria andCateSelfIdIsNull() {
            addCriterion("cate_self_id is null");
            return (Criteria) this;
        }

        public Criteria andCateSelfIdIsNotNull() {
            addCriterion("cate_self_id is not null");
            return (Criteria) this;
        }

        public Criteria andCateSelfIdEqualTo(Integer value) {
            addCriterion("cate_self_id =", value, "cateSelfId");
            return (Criteria) this;
        }

        public Criteria andCateSelfIdNotEqualTo(Integer value) {
            addCriterion("cate_self_id <>", value, "cateSelfId");
            return (Criteria) this;
        }

        public Criteria andCateSelfIdGreaterThan(Integer value) {
            addCriterion("cate_self_id >", value, "cateSelfId");
            return (Criteria) this;
        }

        public Criteria andCateSelfIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("cate_self_id >=", value, "cateSelfId");
            return (Criteria) this;
        }

        public Criteria andCateSelfIdLessThan(Integer value) {
            addCriterion("cate_self_id <", value, "cateSelfId");
            return (Criteria) this;
        }

        public Criteria andCateSelfIdLessThanOrEqualTo(Integer value) {
            addCriterion("cate_self_id <=", value, "cateSelfId");
            return (Criteria) this;
        }

        public Criteria andCateSelfIdIn(List<Integer> values) {
            addCriterion("cate_self_id in", values, "cateSelfId");
            return (Criteria) this;
        }

        public Criteria andCateSelfIdNotIn(List<Integer> values) {
            addCriterion("cate_self_id not in", values, "cateSelfId");
            return (Criteria) this;
        }

        public Criteria andCateSelfIdBetween(Integer value1, Integer value2) {
            addCriterion("cate_self_id between", value1, value2, "cateSelfId");
            return (Criteria) this;
        }

        public Criteria andCateSelfIdNotBetween(Integer value1, Integer value2) {
            addCriterion("cate_self_id not between", value1, value2, "cateSelfId");
            return (Criteria) this;
        }

        public Criteria andBrandIdIsNull() {
            addCriterion("brand_id is null");
            return (Criteria) this;
        }

        public Criteria andBrandIdIsNotNull() {
            addCriterion("brand_id is not null");
            return (Criteria) this;
        }

        public Criteria andBrandIdEqualTo(Short value) {
            addCriterion("brand_id =", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdNotEqualTo(Short value) {
            addCriterion("brand_id <>", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdGreaterThan(Short value) {
            addCriterion("brand_id >", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdGreaterThanOrEqualTo(Short value) {
            addCriterion("brand_id >=", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdLessThan(Short value) {
            addCriterion("brand_id <", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdLessThanOrEqualTo(Short value) {
            addCriterion("brand_id <=", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdIn(List<Short> values) {
            addCriterion("brand_id in", values, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdNotIn(List<Short> values) {
            addCriterion("brand_id not in", values, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdBetween(Short value1, Short value2) {
            addCriterion("brand_id between", value1, value2, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdNotBetween(Short value1, Short value2) {
            addCriterion("brand_id not between", value1, value2, "brandId");
            return (Criteria) this;
        }

        public Criteria andAttributeCateIdIsNull() {
            addCriterion("attribute_cate_id is null");
            return (Criteria) this;
        }

        public Criteria andAttributeCateIdIsNotNull() {
            addCriterion("attribute_cate_id is not null");
            return (Criteria) this;
        }

        public Criteria andAttributeCateIdEqualTo(Integer value) {
            addCriterion("attribute_cate_id =", value, "attributeCateId");
            return (Criteria) this;
        }

        public Criteria andAttributeCateIdNotEqualTo(Integer value) {
            addCriterion("attribute_cate_id <>", value, "attributeCateId");
            return (Criteria) this;
        }

        public Criteria andAttributeCateIdGreaterThan(Integer value) {
            addCriterion("attribute_cate_id >", value, "attributeCateId");
            return (Criteria) this;
        }

        public Criteria andAttributeCateIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("attribute_cate_id >=", value, "attributeCateId");
            return (Criteria) this;
        }

        public Criteria andAttributeCateIdLessThan(Integer value) {
            addCriterion("attribute_cate_id <", value, "attributeCateId");
            return (Criteria) this;
        }

        public Criteria andAttributeCateIdLessThanOrEqualTo(Integer value) {
            addCriterion("attribute_cate_id <=", value, "attributeCateId");
            return (Criteria) this;
        }

        public Criteria andAttributeCateIdIn(List<Integer> values) {
            addCriterion("attribute_cate_id in", values, "attributeCateId");
            return (Criteria) this;
        }

        public Criteria andAttributeCateIdNotIn(List<Integer> values) {
            addCriterion("attribute_cate_id not in", values, "attributeCateId");
            return (Criteria) this;
        }

        public Criteria andAttributeCateIdBetween(Integer value1, Integer value2) {
            addCriterion("attribute_cate_id between", value1, value2, "attributeCateId");
            return (Criteria) this;
        }

        public Criteria andAttributeCateIdNotBetween(Integer value1, Integer value2) {
            addCriterion("attribute_cate_id not between", value1, value2, "attributeCateId");
            return (Criteria) this;
        }

        public Criteria andProviderIdIsNull() {
            addCriterion("provider_id is null");
            return (Criteria) this;
        }

        public Criteria andProviderIdIsNotNull() {
            addCriterion("provider_id is not null");
            return (Criteria) this;
        }

        public Criteria andProviderIdEqualTo(String value) {
            addCriterion("provider_id =", value, "providerId");
            return (Criteria) this;
        }

        public Criteria andProviderIdNotEqualTo(String value) {
            addCriterion("provider_id <>", value, "providerId");
            return (Criteria) this;
        }

        public Criteria andProviderIdGreaterThan(String value) {
            addCriterion("provider_id >", value, "providerId");
            return (Criteria) this;
        }

        public Criteria andProviderIdGreaterThanOrEqualTo(String value) {
            addCriterion("provider_id >=", value, "providerId");
            return (Criteria) this;
        }

        public Criteria andProviderIdLessThan(String value) {
            addCriterion("provider_id <", value, "providerId");
            return (Criteria) this;
        }

        public Criteria andProviderIdLessThanOrEqualTo(String value) {
            addCriterion("provider_id <=", value, "providerId");
            return (Criteria) this;
        }

        public Criteria andProviderIdLike(String value) {
            addCriterion("provider_id like", value, "providerId");
            return (Criteria) this;
        }

        public Criteria andProviderIdNotLike(String value) {
            addCriterion("provider_id not like", value, "providerId");
            return (Criteria) this;
        }

        public Criteria andProviderIdIn(List<String> values) {
            addCriterion("provider_id in", values, "providerId");
            return (Criteria) this;
        }

        public Criteria andProviderIdNotIn(List<String> values) {
            addCriterion("provider_id not in", values, "providerId");
            return (Criteria) this;
        }

        public Criteria andProviderIdBetween(String value1, String value2) {
            addCriterion("provider_id between", value1, value2, "providerId");
            return (Criteria) this;
        }

        public Criteria andProviderIdNotBetween(String value1, String value2) {
            addCriterion("provider_id not between", value1, value2, "providerId");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberIsNull() {
            addCriterion("goods_number is null");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberIsNotNull() {
            addCriterion("goods_number is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberEqualTo(Integer value) {
            addCriterion("goods_number =", value, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberNotEqualTo(Integer value) {
            addCriterion("goods_number <>", value, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberGreaterThan(Integer value) {
            addCriterion("goods_number >", value, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_number >=", value, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberLessThan(Integer value) {
            addCriterion("goods_number <", value, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberLessThanOrEqualTo(Integer value) {
            addCriterion("goods_number <=", value, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberIn(List<Integer> values) {
            addCriterion("goods_number in", values, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberNotIn(List<Integer> values) {
            addCriterion("goods_number not in", values, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberBetween(Integer value1, Integer value2) {
            addCriterion("goods_number between", value1, value2, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_number not between", value1, value2, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsWeightIsNull() {
            addCriterion("goods_weight is null");
            return (Criteria) this;
        }

        public Criteria andGoodsWeightIsNotNull() {
            addCriterion("goods_weight is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsWeightEqualTo(BigDecimal value) {
            addCriterion("goods_weight =", value, "goodsWeight");
            return (Criteria) this;
        }

        public Criteria andGoodsWeightNotEqualTo(BigDecimal value) {
            addCriterion("goods_weight <>", value, "goodsWeight");
            return (Criteria) this;
        }

        public Criteria andGoodsWeightGreaterThan(BigDecimal value) {
            addCriterion("goods_weight >", value, "goodsWeight");
            return (Criteria) this;
        }

        public Criteria andGoodsWeightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("goods_weight >=", value, "goodsWeight");
            return (Criteria) this;
        }

        public Criteria andGoodsWeightLessThan(BigDecimal value) {
            addCriterion("goods_weight <", value, "goodsWeight");
            return (Criteria) this;
        }

        public Criteria andGoodsWeightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("goods_weight <=", value, "goodsWeight");
            return (Criteria) this;
        }

        public Criteria andGoodsWeightIn(List<BigDecimal> values) {
            addCriterion("goods_weight in", values, "goodsWeight");
            return (Criteria) this;
        }

        public Criteria andGoodsWeightNotIn(List<BigDecimal> values) {
            addCriterion("goods_weight not in", values, "goodsWeight");
            return (Criteria) this;
        }

        public Criteria andGoodsWeightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("goods_weight between", value1, value2, "goodsWeight");
            return (Criteria) this;
        }

        public Criteria andGoodsWeightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("goods_weight not between", value1, value2, "goodsWeight");
            return (Criteria) this;
        }

        public Criteria andMarketPriceIsNull() {
            addCriterion("market_price is null");
            return (Criteria) this;
        }

        public Criteria andMarketPriceIsNotNull() {
            addCriterion("market_price is not null");
            return (Criteria) this;
        }

        public Criteria andMarketPriceEqualTo(BigDecimal value) {
            addCriterion("market_price =", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceNotEqualTo(BigDecimal value) {
            addCriterion("market_price <>", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceGreaterThan(BigDecimal value) {
            addCriterion("market_price >", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("market_price >=", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceLessThan(BigDecimal value) {
            addCriterion("market_price <", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("market_price <=", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceIn(List<BigDecimal> values) {
            addCriterion("market_price in", values, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceNotIn(List<BigDecimal> values) {
            addCriterion("market_price not in", values, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("market_price between", value1, value2, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("market_price not between", value1, value2, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andShopPriceIsNull() {
            addCriterion("shop_price is null");
            return (Criteria) this;
        }

        public Criteria andShopPriceIsNotNull() {
            addCriterion("shop_price is not null");
            return (Criteria) this;
        }

        public Criteria andShopPriceEqualTo(BigDecimal value) {
            addCriterion("shop_price =", value, "shopPrice");
            return (Criteria) this;
        }

        public Criteria andShopPriceNotEqualTo(BigDecimal value) {
            addCriterion("shop_price <>", value, "shopPrice");
            return (Criteria) this;
        }

        public Criteria andShopPriceGreaterThan(BigDecimal value) {
            addCriterion("shop_price >", value, "shopPrice");
            return (Criteria) this;
        }

        public Criteria andShopPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("shop_price >=", value, "shopPrice");
            return (Criteria) this;
        }

        public Criteria andShopPriceLessThan(BigDecimal value) {
            addCriterion("shop_price <", value, "shopPrice");
            return (Criteria) this;
        }

        public Criteria andShopPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("shop_price <=", value, "shopPrice");
            return (Criteria) this;
        }

        public Criteria andShopPriceIn(List<BigDecimal> values) {
            addCriterion("shop_price in", values, "shopPrice");
            return (Criteria) this;
        }

        public Criteria andShopPriceNotIn(List<BigDecimal> values) {
            addCriterion("shop_price not in", values, "shopPrice");
            return (Criteria) this;
        }

        public Criteria andShopPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("shop_price between", value1, value2, "shopPrice");
            return (Criteria) this;
        }

        public Criteria andShopPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("shop_price not between", value1, value2, "shopPrice");
            return (Criteria) this;
        }

        public Criteria andShiyongPriceIsNull() {
            addCriterion("shiyong_price is null");
            return (Criteria) this;
        }

        public Criteria andShiyongPriceIsNotNull() {
            addCriterion("shiyong_price is not null");
            return (Criteria) this;
        }

        public Criteria andShiyongPriceEqualTo(BigDecimal value) {
            addCriterion("shiyong_price =", value, "shiyongPrice");
            return (Criteria) this;
        }

        public Criteria andShiyongPriceNotEqualTo(BigDecimal value) {
            addCriterion("shiyong_price <>", value, "shiyongPrice");
            return (Criteria) this;
        }

        public Criteria andShiyongPriceGreaterThan(BigDecimal value) {
            addCriterion("shiyong_price >", value, "shiyongPrice");
            return (Criteria) this;
        }

        public Criteria andShiyongPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("shiyong_price >=", value, "shiyongPrice");
            return (Criteria) this;
        }

        public Criteria andShiyongPriceLessThan(BigDecimal value) {
            addCriterion("shiyong_price <", value, "shiyongPrice");
            return (Criteria) this;
        }

        public Criteria andShiyongPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("shiyong_price <=", value, "shiyongPrice");
            return (Criteria) this;
        }

        public Criteria andShiyongPriceIn(List<BigDecimal> values) {
            addCriterion("shiyong_price in", values, "shiyongPrice");
            return (Criteria) this;
        }

        public Criteria andShiyongPriceNotIn(List<BigDecimal> values) {
            addCriterion("shiyong_price not in", values, "shiyongPrice");
            return (Criteria) this;
        }

        public Criteria andShiyongPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("shiyong_price between", value1, value2, "shiyongPrice");
            return (Criteria) this;
        }

        public Criteria andShiyongPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("shiyong_price not between", value1, value2, "shiyongPrice");
            return (Criteria) this;
        }

        public Criteria andVipPriceIsNull() {
            addCriterion("vip_price is null");
            return (Criteria) this;
        }

        public Criteria andVipPriceIsNotNull() {
            addCriterion("vip_price is not null");
            return (Criteria) this;
        }

        public Criteria andVipPriceEqualTo(BigDecimal value) {
            addCriterion("vip_price =", value, "vipPrice");
            return (Criteria) this;
        }

        public Criteria andVipPriceNotEqualTo(BigDecimal value) {
            addCriterion("vip_price <>", value, "vipPrice");
            return (Criteria) this;
        }

        public Criteria andVipPriceGreaterThan(BigDecimal value) {
            addCriterion("vip_price >", value, "vipPrice");
            return (Criteria) this;
        }

        public Criteria andVipPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("vip_price >=", value, "vipPrice");
            return (Criteria) this;
        }

        public Criteria andVipPriceLessThan(BigDecimal value) {
            addCriterion("vip_price <", value, "vipPrice");
            return (Criteria) this;
        }

        public Criteria andVipPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("vip_price <=", value, "vipPrice");
            return (Criteria) this;
        }

        public Criteria andVipPriceIn(List<BigDecimal> values) {
            addCriterion("vip_price in", values, "vipPrice");
            return (Criteria) this;
        }

        public Criteria andVipPriceNotIn(List<BigDecimal> values) {
            addCriterion("vip_price not in", values, "vipPrice");
            return (Criteria) this;
        }

        public Criteria andVipPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("vip_price between", value1, value2, "vipPrice");
            return (Criteria) this;
        }

        public Criteria andVipPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("vip_price not between", value1, value2, "vipPrice");
            return (Criteria) this;
        }

        public Criteria andPifaPriceIsNull() {
            addCriterion("pifa_price is null");
            return (Criteria) this;
        }

        public Criteria andPifaPriceIsNotNull() {
            addCriterion("pifa_price is not null");
            return (Criteria) this;
        }

        public Criteria andPifaPriceEqualTo(BigDecimal value) {
            addCriterion("pifa_price =", value, "pifaPrice");
            return (Criteria) this;
        }

        public Criteria andPifaPriceNotEqualTo(BigDecimal value) {
            addCriterion("pifa_price <>", value, "pifaPrice");
            return (Criteria) this;
        }

        public Criteria andPifaPriceGreaterThan(BigDecimal value) {
            addCriterion("pifa_price >", value, "pifaPrice");
            return (Criteria) this;
        }

        public Criteria andPifaPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("pifa_price >=", value, "pifaPrice");
            return (Criteria) this;
        }

        public Criteria andPifaPriceLessThan(BigDecimal value) {
            addCriterion("pifa_price <", value, "pifaPrice");
            return (Criteria) this;
        }

        public Criteria andPifaPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("pifa_price <=", value, "pifaPrice");
            return (Criteria) this;
        }

        public Criteria andPifaPriceIn(List<BigDecimal> values) {
            addCriterion("pifa_price in", values, "pifaPrice");
            return (Criteria) this;
        }

        public Criteria andPifaPriceNotIn(List<BigDecimal> values) {
            addCriterion("pifa_price not in", values, "pifaPrice");
            return (Criteria) this;
        }

        public Criteria andPifaPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pifa_price between", value1, value2, "pifaPrice");
            return (Criteria) this;
        }

        public Criteria andPifaPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pifa_price not between", value1, value2, "pifaPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceIsNull() {
            addCriterion("cost_price is null");
            return (Criteria) this;
        }

        public Criteria andCostPriceIsNotNull() {
            addCriterion("cost_price is not null");
            return (Criteria) this;
        }

        public Criteria andCostPriceEqualTo(BigDecimal value) {
            addCriterion("cost_price =", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceNotEqualTo(BigDecimal value) {
            addCriterion("cost_price <>", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceGreaterThan(BigDecimal value) {
            addCriterion("cost_price >", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("cost_price >=", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceLessThan(BigDecimal value) {
            addCriterion("cost_price <", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("cost_price <=", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceIn(List<BigDecimal> values) {
            addCriterion("cost_price in", values, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceNotIn(List<BigDecimal> values) {
            addCriterion("cost_price not in", values, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cost_price between", value1, value2, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cost_price not between", value1, value2, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCalPriceIsNull() {
            addCriterion("cal_price is null");
            return (Criteria) this;
        }

        public Criteria andCalPriceIsNotNull() {
            addCriterion("cal_price is not null");
            return (Criteria) this;
        }

        public Criteria andCalPriceEqualTo(BigDecimal value) {
            addCriterion("cal_price =", value, "calPrice");
            return (Criteria) this;
        }

        public Criteria andCalPriceNotEqualTo(BigDecimal value) {
            addCriterion("cal_price <>", value, "calPrice");
            return (Criteria) this;
        }

        public Criteria andCalPriceGreaterThan(BigDecimal value) {
            addCriterion("cal_price >", value, "calPrice");
            return (Criteria) this;
        }

        public Criteria andCalPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("cal_price >=", value, "calPrice");
            return (Criteria) this;
        }

        public Criteria andCalPriceLessThan(BigDecimal value) {
            addCriterion("cal_price <", value, "calPrice");
            return (Criteria) this;
        }

        public Criteria andCalPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("cal_price <=", value, "calPrice");
            return (Criteria) this;
        }

        public Criteria andCalPriceIn(List<BigDecimal> values) {
            addCriterion("cal_price in", values, "calPrice");
            return (Criteria) this;
        }

        public Criteria andCalPriceNotIn(List<BigDecimal> values) {
            addCriterion("cal_price not in", values, "calPrice");
            return (Criteria) this;
        }

        public Criteria andCalPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cal_price between", value1, value2, "calPrice");
            return (Criteria) this;
        }

        public Criteria andCalPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cal_price not between", value1, value2, "calPrice");
            return (Criteria) this;
        }

        public Criteria andCouponFeeIsNull() {
            addCriterion("coupon_fee is null");
            return (Criteria) this;
        }

        public Criteria andCouponFeeIsNotNull() {
            addCriterion("coupon_fee is not null");
            return (Criteria) this;
        }

        public Criteria andCouponFeeEqualTo(BigDecimal value) {
            addCriterion("coupon_fee =", value, "couponFee");
            return (Criteria) this;
        }

        public Criteria andCouponFeeNotEqualTo(BigDecimal value) {
            addCriterion("coupon_fee <>", value, "couponFee");
            return (Criteria) this;
        }

        public Criteria andCouponFeeGreaterThan(BigDecimal value) {
            addCriterion("coupon_fee >", value, "couponFee");
            return (Criteria) this;
        }

        public Criteria andCouponFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("coupon_fee >=", value, "couponFee");
            return (Criteria) this;
        }

        public Criteria andCouponFeeLessThan(BigDecimal value) {
            addCriterion("coupon_fee <", value, "couponFee");
            return (Criteria) this;
        }

        public Criteria andCouponFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("coupon_fee <=", value, "couponFee");
            return (Criteria) this;
        }

        public Criteria andCouponFeeIn(List<BigDecimal> values) {
            addCriterion("coupon_fee in", values, "couponFee");
            return (Criteria) this;
        }

        public Criteria andCouponFeeNotIn(List<BigDecimal> values) {
            addCriterion("coupon_fee not in", values, "couponFee");
            return (Criteria) this;
        }

        public Criteria andCouponFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("coupon_fee between", value1, value2, "couponFee");
            return (Criteria) this;
        }

        public Criteria andCouponFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("coupon_fee not between", value1, value2, "couponFee");
            return (Criteria) this;
        }

        public Criteria andCouponDiscountIsNull() {
            addCriterion("coupon_discount is null");
            return (Criteria) this;
        }

        public Criteria andCouponDiscountIsNotNull() {
            addCriterion("coupon_discount is not null");
            return (Criteria) this;
        }

        public Criteria andCouponDiscountEqualTo(Integer value) {
            addCriterion("coupon_discount =", value, "couponDiscount");
            return (Criteria) this;
        }

        public Criteria andCouponDiscountNotEqualTo(Integer value) {
            addCriterion("coupon_discount <>", value, "couponDiscount");
            return (Criteria) this;
        }

        public Criteria andCouponDiscountGreaterThan(Integer value) {
            addCriterion("coupon_discount >", value, "couponDiscount");
            return (Criteria) this;
        }

        public Criteria andCouponDiscountGreaterThanOrEqualTo(Integer value) {
            addCriterion("coupon_discount >=", value, "couponDiscount");
            return (Criteria) this;
        }

        public Criteria andCouponDiscountLessThan(Integer value) {
            addCriterion("coupon_discount <", value, "couponDiscount");
            return (Criteria) this;
        }

        public Criteria andCouponDiscountLessThanOrEqualTo(Integer value) {
            addCriterion("coupon_discount <=", value, "couponDiscount");
            return (Criteria) this;
        }

        public Criteria andCouponDiscountIn(List<Integer> values) {
            addCriterion("coupon_discount in", values, "couponDiscount");
            return (Criteria) this;
        }

        public Criteria andCouponDiscountNotIn(List<Integer> values) {
            addCriterion("coupon_discount not in", values, "couponDiscount");
            return (Criteria) this;
        }

        public Criteria andCouponDiscountBetween(Integer value1, Integer value2) {
            addCriterion("coupon_discount between", value1, value2, "couponDiscount");
            return (Criteria) this;
        }

        public Criteria andCouponDiscountNotBetween(Integer value1, Integer value2) {
            addCriterion("coupon_discount not between", value1, value2, "couponDiscount");
            return (Criteria) this;
        }

        public Criteria andGradeSeeAllIsNull() {
            addCriterion("grade_see_all is null");
            return (Criteria) this;
        }

        public Criteria andGradeSeeAllIsNotNull() {
            addCriterion("grade_see_all is not null");
            return (Criteria) this;
        }

        public Criteria andGradeSeeAllEqualTo(Integer value) {
            addCriterion("grade_see_all =", value, "gradeSeeAll");
            return (Criteria) this;
        }

        public Criteria andGradeSeeAllNotEqualTo(Integer value) {
            addCriterion("grade_see_all <>", value, "gradeSeeAll");
            return (Criteria) this;
        }

        public Criteria andGradeSeeAllGreaterThan(Integer value) {
            addCriterion("grade_see_all >", value, "gradeSeeAll");
            return (Criteria) this;
        }

        public Criteria andGradeSeeAllGreaterThanOrEqualTo(Integer value) {
            addCriterion("grade_see_all >=", value, "gradeSeeAll");
            return (Criteria) this;
        }

        public Criteria andGradeSeeAllLessThan(Integer value) {
            addCriterion("grade_see_all <", value, "gradeSeeAll");
            return (Criteria) this;
        }

        public Criteria andGradeSeeAllLessThanOrEqualTo(Integer value) {
            addCriterion("grade_see_all <=", value, "gradeSeeAll");
            return (Criteria) this;
        }

        public Criteria andGradeSeeAllIn(List<Integer> values) {
            addCriterion("grade_see_all in", values, "gradeSeeAll");
            return (Criteria) this;
        }

        public Criteria andGradeSeeAllNotIn(List<Integer> values) {
            addCriterion("grade_see_all not in", values, "gradeSeeAll");
            return (Criteria) this;
        }

        public Criteria andGradeSeeAllBetween(Integer value1, Integer value2) {
            addCriterion("grade_see_all between", value1, value2, "gradeSeeAll");
            return (Criteria) this;
        }

        public Criteria andGradeSeeAllNotBetween(Integer value1, Integer value2) {
            addCriterion("grade_see_all not between", value1, value2, "gradeSeeAll");
            return (Criteria) this;
        }

        public Criteria andGradeSeeIdsIsNull() {
            addCriterion("grade_see_ids is null");
            return (Criteria) this;
        }

        public Criteria andGradeSeeIdsIsNotNull() {
            addCriterion("grade_see_ids is not null");
            return (Criteria) this;
        }

        public Criteria andGradeSeeIdsEqualTo(String value) {
            addCriterion("grade_see_ids =", value, "gradeSeeIds");
            return (Criteria) this;
        }

        public Criteria andGradeSeeIdsNotEqualTo(String value) {
            addCriterion("grade_see_ids <>", value, "gradeSeeIds");
            return (Criteria) this;
        }

        public Criteria andGradeSeeIdsGreaterThan(String value) {
            addCriterion("grade_see_ids >", value, "gradeSeeIds");
            return (Criteria) this;
        }

        public Criteria andGradeSeeIdsGreaterThanOrEqualTo(String value) {
            addCriterion("grade_see_ids >=", value, "gradeSeeIds");
            return (Criteria) this;
        }

        public Criteria andGradeSeeIdsLessThan(String value) {
            addCriterion("grade_see_ids <", value, "gradeSeeIds");
            return (Criteria) this;
        }

        public Criteria andGradeSeeIdsLessThanOrEqualTo(String value) {
            addCriterion("grade_see_ids <=", value, "gradeSeeIds");
            return (Criteria) this;
        }

        public Criteria andGradeSeeIdsLike(String value) {
            addCriterion("grade_see_ids like", value, "gradeSeeIds");
            return (Criteria) this;
        }

        public Criteria andGradeSeeIdsNotLike(String value) {
            addCriterion("grade_see_ids not like", value, "gradeSeeIds");
            return (Criteria) this;
        }

        public Criteria andGradeSeeIdsIn(List<String> values) {
            addCriterion("grade_see_ids in", values, "gradeSeeIds");
            return (Criteria) this;
        }

        public Criteria andGradeSeeIdsNotIn(List<String> values) {
            addCriterion("grade_see_ids not in", values, "gradeSeeIds");
            return (Criteria) this;
        }

        public Criteria andGradeSeeIdsBetween(String value1, String value2) {
            addCriterion("grade_see_ids between", value1, value2, "gradeSeeIds");
            return (Criteria) this;
        }

        public Criteria andGradeSeeIdsNotBetween(String value1, String value2) {
            addCriterion("grade_see_ids not between", value1, value2, "gradeSeeIds");
            return (Criteria) this;
        }

        public Criteria andIsFreeShippingFeeIsNull() {
            addCriterion("is_free_shipping_fee is null");
            return (Criteria) this;
        }

        public Criteria andIsFreeShippingFeeIsNotNull() {
            addCriterion("is_free_shipping_fee is not null");
            return (Criteria) this;
        }

        public Criteria andIsFreeShippingFeeEqualTo(Integer value) {
            addCriterion("is_free_shipping_fee =", value, "isFreeShippingFee");
            return (Criteria) this;
        }

        public Criteria andIsFreeShippingFeeNotEqualTo(Integer value) {
            addCriterion("is_free_shipping_fee <>", value, "isFreeShippingFee");
            return (Criteria) this;
        }

        public Criteria andIsFreeShippingFeeGreaterThan(Integer value) {
            addCriterion("is_free_shipping_fee >", value, "isFreeShippingFee");
            return (Criteria) this;
        }

        public Criteria andIsFreeShippingFeeGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_free_shipping_fee >=", value, "isFreeShippingFee");
            return (Criteria) this;
        }

        public Criteria andIsFreeShippingFeeLessThan(Integer value) {
            addCriterion("is_free_shipping_fee <", value, "isFreeShippingFee");
            return (Criteria) this;
        }

        public Criteria andIsFreeShippingFeeLessThanOrEqualTo(Integer value) {
            addCriterion("is_free_shipping_fee <=", value, "isFreeShippingFee");
            return (Criteria) this;
        }

        public Criteria andIsFreeShippingFeeIn(List<Integer> values) {
            addCriterion("is_free_shipping_fee in", values, "isFreeShippingFee");
            return (Criteria) this;
        }

        public Criteria andIsFreeShippingFeeNotIn(List<Integer> values) {
            addCriterion("is_free_shipping_fee not in", values, "isFreeShippingFee");
            return (Criteria) this;
        }

        public Criteria andIsFreeShippingFeeBetween(Integer value1, Integer value2) {
            addCriterion("is_free_shipping_fee between", value1, value2, "isFreeShippingFee");
            return (Criteria) this;
        }

        public Criteria andIsFreeShippingFeeNotBetween(Integer value1, Integer value2) {
            addCriterion("is_free_shipping_fee not between", value1, value2, "isFreeShippingFee");
            return (Criteria) this;
        }

        public Criteria andMealPriceIsNull() {
            addCriterion("meal_price is null");
            return (Criteria) this;
        }

        public Criteria andMealPriceIsNotNull() {
            addCriterion("meal_price is not null");
            return (Criteria) this;
        }

        public Criteria andMealPriceEqualTo(BigDecimal value) {
            addCriterion("meal_price =", value, "mealPrice");
            return (Criteria) this;
        }

        public Criteria andMealPriceNotEqualTo(BigDecimal value) {
            addCriterion("meal_price <>", value, "mealPrice");
            return (Criteria) this;
        }

        public Criteria andMealPriceGreaterThan(BigDecimal value) {
            addCriterion("meal_price >", value, "mealPrice");
            return (Criteria) this;
        }

        public Criteria andMealPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("meal_price >=", value, "mealPrice");
            return (Criteria) this;
        }

        public Criteria andMealPriceLessThan(BigDecimal value) {
            addCriterion("meal_price <", value, "mealPrice");
            return (Criteria) this;
        }

        public Criteria andMealPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("meal_price <=", value, "mealPrice");
            return (Criteria) this;
        }

        public Criteria andMealPriceIn(List<BigDecimal> values) {
            addCriterion("meal_price in", values, "mealPrice");
            return (Criteria) this;
        }

        public Criteria andMealPriceNotIn(List<BigDecimal> values) {
            addCriterion("meal_price not in", values, "mealPrice");
            return (Criteria) this;
        }

        public Criteria andMealPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("meal_price between", value1, value2, "mealPrice");
            return (Criteria) this;
        }

        public Criteria andMealPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("meal_price not between", value1, value2, "mealPrice");
            return (Criteria) this;
        }

        public Criteria andDisPriceIsNull() {
            addCriterion("dis_price is null");
            return (Criteria) this;
        }

        public Criteria andDisPriceIsNotNull() {
            addCriterion("dis_price is not null");
            return (Criteria) this;
        }

        public Criteria andDisPriceEqualTo(BigDecimal value) {
            addCriterion("dis_price =", value, "disPrice");
            return (Criteria) this;
        }

        public Criteria andDisPriceNotEqualTo(BigDecimal value) {
            addCriterion("dis_price <>", value, "disPrice");
            return (Criteria) this;
        }

        public Criteria andDisPriceGreaterThan(BigDecimal value) {
            addCriterion("dis_price >", value, "disPrice");
            return (Criteria) this;
        }

        public Criteria andDisPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("dis_price >=", value, "disPrice");
            return (Criteria) this;
        }

        public Criteria andDisPriceLessThan(BigDecimal value) {
            addCriterion("dis_price <", value, "disPrice");
            return (Criteria) this;
        }

        public Criteria andDisPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("dis_price <=", value, "disPrice");
            return (Criteria) this;
        }

        public Criteria andDisPriceIn(List<BigDecimal> values) {
            addCriterion("dis_price in", values, "disPrice");
            return (Criteria) this;
        }

        public Criteria andDisPriceNotIn(List<BigDecimal> values) {
            addCriterion("dis_price not in", values, "disPrice");
            return (Criteria) this;
        }

        public Criteria andDisPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dis_price between", value1, value2, "disPrice");
            return (Criteria) this;
        }

        public Criteria andDisPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dis_price not between", value1, value2, "disPrice");
            return (Criteria) this;
        }

        public Criteria andMaxPointPreIsNull() {
            addCriterion("max_point_pre is null");
            return (Criteria) this;
        }

        public Criteria andMaxPointPreIsNotNull() {
            addCriterion("max_point_pre is not null");
            return (Criteria) this;
        }

        public Criteria andMaxPointPreEqualTo(Integer value) {
            addCriterion("max_point_pre =", value, "maxPointPre");
            return (Criteria) this;
        }

        public Criteria andMaxPointPreNotEqualTo(Integer value) {
            addCriterion("max_point_pre <>", value, "maxPointPre");
            return (Criteria) this;
        }

        public Criteria andMaxPointPreGreaterThan(Integer value) {
            addCriterion("max_point_pre >", value, "maxPointPre");
            return (Criteria) this;
        }

        public Criteria andMaxPointPreGreaterThanOrEqualTo(Integer value) {
            addCriterion("max_point_pre >=", value, "maxPointPre");
            return (Criteria) this;
        }

        public Criteria andMaxPointPreLessThan(Integer value) {
            addCriterion("max_point_pre <", value, "maxPointPre");
            return (Criteria) this;
        }

        public Criteria andMaxPointPreLessThanOrEqualTo(Integer value) {
            addCriterion("max_point_pre <=", value, "maxPointPre");
            return (Criteria) this;
        }

        public Criteria andMaxPointPreIn(List<Integer> values) {
            addCriterion("max_point_pre in", values, "maxPointPre");
            return (Criteria) this;
        }

        public Criteria andMaxPointPreNotIn(List<Integer> values) {
            addCriterion("max_point_pre not in", values, "maxPointPre");
            return (Criteria) this;
        }

        public Criteria andMaxPointPreBetween(Integer value1, Integer value2) {
            addCriterion("max_point_pre between", value1, value2, "maxPointPre");
            return (Criteria) this;
        }

        public Criteria andMaxPointPreNotBetween(Integer value1, Integer value2) {
            addCriterion("max_point_pre not between", value1, value2, "maxPointPre");
            return (Criteria) this;
        }

        public Criteria andMaxPointIsNull() {
            addCriterion("max_point is null");
            return (Criteria) this;
        }

        public Criteria andMaxPointIsNotNull() {
            addCriterion("max_point is not null");
            return (Criteria) this;
        }

        public Criteria andMaxPointEqualTo(Integer value) {
            addCriterion("max_point =", value, "maxPoint");
            return (Criteria) this;
        }

        public Criteria andMaxPointNotEqualTo(Integer value) {
            addCriterion("max_point <>", value, "maxPoint");
            return (Criteria) this;
        }

        public Criteria andMaxPointGreaterThan(Integer value) {
            addCriterion("max_point >", value, "maxPoint");
            return (Criteria) this;
        }

        public Criteria andMaxPointGreaterThanOrEqualTo(Integer value) {
            addCriterion("max_point >=", value, "maxPoint");
            return (Criteria) this;
        }

        public Criteria andMaxPointLessThan(Integer value) {
            addCriterion("max_point <", value, "maxPoint");
            return (Criteria) this;
        }

        public Criteria andMaxPointLessThanOrEqualTo(Integer value) {
            addCriterion("max_point <=", value, "maxPoint");
            return (Criteria) this;
        }

        public Criteria andMaxPointIn(List<Integer> values) {
            addCriterion("max_point in", values, "maxPoint");
            return (Criteria) this;
        }

        public Criteria andMaxPointNotIn(List<Integer> values) {
            addCriterion("max_point not in", values, "maxPoint");
            return (Criteria) this;
        }

        public Criteria andMaxPointBetween(Integer value1, Integer value2) {
            addCriterion("max_point between", value1, value2, "maxPoint");
            return (Criteria) this;
        }

        public Criteria andMaxPointNotBetween(Integer value1, Integer value2) {
            addCriterion("max_point not between", value1, value2, "maxPoint");
            return (Criteria) this;
        }

        public Criteria andPromotePriceIsNull() {
            addCriterion("promote_price is null");
            return (Criteria) this;
        }

        public Criteria andPromotePriceIsNotNull() {
            addCriterion("promote_price is not null");
            return (Criteria) this;
        }

        public Criteria andPromotePriceEqualTo(BigDecimal value) {
            addCriterion("promote_price =", value, "promotePrice");
            return (Criteria) this;
        }

        public Criteria andPromotePriceNotEqualTo(BigDecimal value) {
            addCriterion("promote_price <>", value, "promotePrice");
            return (Criteria) this;
        }

        public Criteria andPromotePriceGreaterThan(BigDecimal value) {
            addCriterion("promote_price >", value, "promotePrice");
            return (Criteria) this;
        }

        public Criteria andPromotePriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("promote_price >=", value, "promotePrice");
            return (Criteria) this;
        }

        public Criteria andPromotePriceLessThan(BigDecimal value) {
            addCriterion("promote_price <", value, "promotePrice");
            return (Criteria) this;
        }

        public Criteria andPromotePriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("promote_price <=", value, "promotePrice");
            return (Criteria) this;
        }

        public Criteria andPromotePriceIn(List<BigDecimal> values) {
            addCriterion("promote_price in", values, "promotePrice");
            return (Criteria) this;
        }

        public Criteria andPromotePriceNotIn(List<BigDecimal> values) {
            addCriterion("promote_price not in", values, "promotePrice");
            return (Criteria) this;
        }

        public Criteria andPromotePriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("promote_price between", value1, value2, "promotePrice");
            return (Criteria) this;
        }

        public Criteria andPromotePriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("promote_price not between", value1, value2, "promotePrice");
            return (Criteria) this;
        }

        public Criteria andPromoteStartDateIsNull() {
            addCriterion("promote_start_date is null");
            return (Criteria) this;
        }

        public Criteria andPromoteStartDateIsNotNull() {
            addCriterion("promote_start_date is not null");
            return (Criteria) this;
        }

        public Criteria andPromoteStartDateEqualTo(Integer value) {
            addCriterion("promote_start_date =", value, "promoteStartDate");
            return (Criteria) this;
        }

        public Criteria andPromoteStartDateNotEqualTo(Integer value) {
            addCriterion("promote_start_date <>", value, "promoteStartDate");
            return (Criteria) this;
        }

        public Criteria andPromoteStartDateGreaterThan(Integer value) {
            addCriterion("promote_start_date >", value, "promoteStartDate");
            return (Criteria) this;
        }

        public Criteria andPromoteStartDateGreaterThanOrEqualTo(Integer value) {
            addCriterion("promote_start_date >=", value, "promoteStartDate");
            return (Criteria) this;
        }

        public Criteria andPromoteStartDateLessThan(Integer value) {
            addCriterion("promote_start_date <", value, "promoteStartDate");
            return (Criteria) this;
        }

        public Criteria andPromoteStartDateLessThanOrEqualTo(Integer value) {
            addCriterion("promote_start_date <=", value, "promoteStartDate");
            return (Criteria) this;
        }

        public Criteria andPromoteStartDateIn(List<Integer> values) {
            addCriterion("promote_start_date in", values, "promoteStartDate");
            return (Criteria) this;
        }

        public Criteria andPromoteStartDateNotIn(List<Integer> values) {
            addCriterion("promote_start_date not in", values, "promoteStartDate");
            return (Criteria) this;
        }

        public Criteria andPromoteStartDateBetween(Integer value1, Integer value2) {
            addCriterion("promote_start_date between", value1, value2, "promoteStartDate");
            return (Criteria) this;
        }

        public Criteria andPromoteStartDateNotBetween(Integer value1, Integer value2) {
            addCriterion("promote_start_date not between", value1, value2, "promoteStartDate");
            return (Criteria) this;
        }

        public Criteria andPointEndDateIsNull() {
            addCriterion("point_end_date is null");
            return (Criteria) this;
        }

        public Criteria andPointEndDateIsNotNull() {
            addCriterion("point_end_date is not null");
            return (Criteria) this;
        }

        public Criteria andPointEndDateEqualTo(Integer value) {
            addCriterion("point_end_date =", value, "pointEndDate");
            return (Criteria) this;
        }

        public Criteria andPointEndDateNotEqualTo(Integer value) {
            addCriterion("point_end_date <>", value, "pointEndDate");
            return (Criteria) this;
        }

        public Criteria andPointEndDateGreaterThan(Integer value) {
            addCriterion("point_end_date >", value, "pointEndDate");
            return (Criteria) this;
        }

        public Criteria andPointEndDateGreaterThanOrEqualTo(Integer value) {
            addCriterion("point_end_date >=", value, "pointEndDate");
            return (Criteria) this;
        }

        public Criteria andPointEndDateLessThan(Integer value) {
            addCriterion("point_end_date <", value, "pointEndDate");
            return (Criteria) this;
        }

        public Criteria andPointEndDateLessThanOrEqualTo(Integer value) {
            addCriterion("point_end_date <=", value, "pointEndDate");
            return (Criteria) this;
        }

        public Criteria andPointEndDateIn(List<Integer> values) {
            addCriterion("point_end_date in", values, "pointEndDate");
            return (Criteria) this;
        }

        public Criteria andPointEndDateNotIn(List<Integer> values) {
            addCriterion("point_end_date not in", values, "pointEndDate");
            return (Criteria) this;
        }

        public Criteria andPointEndDateBetween(Integer value1, Integer value2) {
            addCriterion("point_end_date between", value1, value2, "pointEndDate");
            return (Criteria) this;
        }

        public Criteria andPointEndDateNotBetween(Integer value1, Integer value2) {
            addCriterion("point_end_date not between", value1, value2, "pointEndDate");
            return (Criteria) this;
        }

        public Criteria andPromoteEndDateIsNull() {
            addCriterion("promote_end_date is null");
            return (Criteria) this;
        }

        public Criteria andPromoteEndDateIsNotNull() {
            addCriterion("promote_end_date is not null");
            return (Criteria) this;
        }

        public Criteria andPromoteEndDateEqualTo(Integer value) {
            addCriterion("promote_end_date =", value, "promoteEndDate");
            return (Criteria) this;
        }

        public Criteria andPromoteEndDateNotEqualTo(Integer value) {
            addCriterion("promote_end_date <>", value, "promoteEndDate");
            return (Criteria) this;
        }

        public Criteria andPromoteEndDateGreaterThan(Integer value) {
            addCriterion("promote_end_date >", value, "promoteEndDate");
            return (Criteria) this;
        }

        public Criteria andPromoteEndDateGreaterThanOrEqualTo(Integer value) {
            addCriterion("promote_end_date >=", value, "promoteEndDate");
            return (Criteria) this;
        }

        public Criteria andPromoteEndDateLessThan(Integer value) {
            addCriterion("promote_end_date <", value, "promoteEndDate");
            return (Criteria) this;
        }

        public Criteria andPromoteEndDateLessThanOrEqualTo(Integer value) {
            addCriterion("promote_end_date <=", value, "promoteEndDate");
            return (Criteria) this;
        }

        public Criteria andPromoteEndDateIn(List<Integer> values) {
            addCriterion("promote_end_date in", values, "promoteEndDate");
            return (Criteria) this;
        }

        public Criteria andPromoteEndDateNotIn(List<Integer> values) {
            addCriterion("promote_end_date not in", values, "promoteEndDate");
            return (Criteria) this;
        }

        public Criteria andPromoteEndDateBetween(Integer value1, Integer value2) {
            addCriterion("promote_end_date between", value1, value2, "promoteEndDate");
            return (Criteria) this;
        }

        public Criteria andPromoteEndDateNotBetween(Integer value1, Integer value2) {
            addCriterion("promote_end_date not between", value1, value2, "promoteEndDate");
            return (Criteria) this;
        }

        public Criteria andCommissionMoneyIsNull() {
            addCriterion("commission_money is null");
            return (Criteria) this;
        }

        public Criteria andCommissionMoneyIsNotNull() {
            addCriterion("commission_money is not null");
            return (Criteria) this;
        }

        public Criteria andCommissionMoneyEqualTo(BigDecimal value) {
            addCriterion("commission_money =", value, "commissionMoney");
            return (Criteria) this;
        }

        public Criteria andCommissionMoneyNotEqualTo(BigDecimal value) {
            addCriterion("commission_money <>", value, "commissionMoney");
            return (Criteria) this;
        }

        public Criteria andCommissionMoneyGreaterThan(BigDecimal value) {
            addCriterion("commission_money >", value, "commissionMoney");
            return (Criteria) this;
        }

        public Criteria andCommissionMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("commission_money >=", value, "commissionMoney");
            return (Criteria) this;
        }

        public Criteria andCommissionMoneyLessThan(BigDecimal value) {
            addCriterion("commission_money <", value, "commissionMoney");
            return (Criteria) this;
        }

        public Criteria andCommissionMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("commission_money <=", value, "commissionMoney");
            return (Criteria) this;
        }

        public Criteria andCommissionMoneyIn(List<BigDecimal> values) {
            addCriterion("commission_money in", values, "commissionMoney");
            return (Criteria) this;
        }

        public Criteria andCommissionMoneyNotIn(List<BigDecimal> values) {
            addCriterion("commission_money not in", values, "commissionMoney");
            return (Criteria) this;
        }

        public Criteria andCommissionMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("commission_money between", value1, value2, "commissionMoney");
            return (Criteria) this;
        }

        public Criteria andCommissionMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("commission_money not between", value1, value2, "commissionMoney");
            return (Criteria) this;
        }

        public Criteria andDiscountNumIsNull() {
            addCriterion("discount_num is null");
            return (Criteria) this;
        }

        public Criteria andDiscountNumIsNotNull() {
            addCriterion("discount_num is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountNumEqualTo(String value) {
            addCriterion("discount_num =", value, "discountNum");
            return (Criteria) this;
        }

        public Criteria andDiscountNumNotEqualTo(String value) {
            addCriterion("discount_num <>", value, "discountNum");
            return (Criteria) this;
        }

        public Criteria andDiscountNumGreaterThan(String value) {
            addCriterion("discount_num >", value, "discountNum");
            return (Criteria) this;
        }

        public Criteria andDiscountNumGreaterThanOrEqualTo(String value) {
            addCriterion("discount_num >=", value, "discountNum");
            return (Criteria) this;
        }

        public Criteria andDiscountNumLessThan(String value) {
            addCriterion("discount_num <", value, "discountNum");
            return (Criteria) this;
        }

        public Criteria andDiscountNumLessThanOrEqualTo(String value) {
            addCriterion("discount_num <=", value, "discountNum");
            return (Criteria) this;
        }

        public Criteria andDiscountNumLike(String value) {
            addCriterion("discount_num like", value, "discountNum");
            return (Criteria) this;
        }

        public Criteria andDiscountNumNotLike(String value) {
            addCriterion("discount_num not like", value, "discountNum");
            return (Criteria) this;
        }

        public Criteria andDiscountNumIn(List<String> values) {
            addCriterion("discount_num in", values, "discountNum");
            return (Criteria) this;
        }

        public Criteria andDiscountNumNotIn(List<String> values) {
            addCriterion("discount_num not in", values, "discountNum");
            return (Criteria) this;
        }

        public Criteria andDiscountNumBetween(String value1, String value2) {
            addCriterion("discount_num between", value1, value2, "discountNum");
            return (Criteria) this;
        }

        public Criteria andDiscountNumNotBetween(String value1, String value2) {
            addCriterion("discount_num not between", value1, value2, "discountNum");
            return (Criteria) this;
        }

        public Criteria andDiscountMoneyIsNull() {
            addCriterion("discount_money is null");
            return (Criteria) this;
        }

        public Criteria andDiscountMoneyIsNotNull() {
            addCriterion("discount_money is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountMoneyEqualTo(BigDecimal value) {
            addCriterion("discount_money =", value, "discountMoney");
            return (Criteria) this;
        }

        public Criteria andDiscountMoneyNotEqualTo(BigDecimal value) {
            addCriterion("discount_money <>", value, "discountMoney");
            return (Criteria) this;
        }

        public Criteria andDiscountMoneyGreaterThan(BigDecimal value) {
            addCriterion("discount_money >", value, "discountMoney");
            return (Criteria) this;
        }

        public Criteria andDiscountMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("discount_money >=", value, "discountMoney");
            return (Criteria) this;
        }

        public Criteria andDiscountMoneyLessThan(BigDecimal value) {
            addCriterion("discount_money <", value, "discountMoney");
            return (Criteria) this;
        }

        public Criteria andDiscountMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("discount_money <=", value, "discountMoney");
            return (Criteria) this;
        }

        public Criteria andDiscountMoneyIn(List<BigDecimal> values) {
            addCriterion("discount_money in", values, "discountMoney");
            return (Criteria) this;
        }

        public Criteria andDiscountMoneyNotIn(List<BigDecimal> values) {
            addCriterion("discount_money not in", values, "discountMoney");
            return (Criteria) this;
        }

        public Criteria andDiscountMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("discount_money between", value1, value2, "discountMoney");
            return (Criteria) this;
        }

        public Criteria andDiscountMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("discount_money not between", value1, value2, "discountMoney");
            return (Criteria) this;
        }

        public Criteria andShareGivePointIsNull() {
            addCriterion("share_give_point is null");
            return (Criteria) this;
        }

        public Criteria andShareGivePointIsNotNull() {
            addCriterion("share_give_point is not null");
            return (Criteria) this;
        }

        public Criteria andShareGivePointEqualTo(Integer value) {
            addCriterion("share_give_point =", value, "shareGivePoint");
            return (Criteria) this;
        }

        public Criteria andShareGivePointNotEqualTo(Integer value) {
            addCriterion("share_give_point <>", value, "shareGivePoint");
            return (Criteria) this;
        }

        public Criteria andShareGivePointGreaterThan(Integer value) {
            addCriterion("share_give_point >", value, "shareGivePoint");
            return (Criteria) this;
        }

        public Criteria andShareGivePointGreaterThanOrEqualTo(Integer value) {
            addCriterion("share_give_point >=", value, "shareGivePoint");
            return (Criteria) this;
        }

        public Criteria andShareGivePointLessThan(Integer value) {
            addCriterion("share_give_point <", value, "shareGivePoint");
            return (Criteria) this;
        }

        public Criteria andShareGivePointLessThanOrEqualTo(Integer value) {
            addCriterion("share_give_point <=", value, "shareGivePoint");
            return (Criteria) this;
        }

        public Criteria andShareGivePointIn(List<Integer> values) {
            addCriterion("share_give_point in", values, "shareGivePoint");
            return (Criteria) this;
        }

        public Criteria andShareGivePointNotIn(List<Integer> values) {
            addCriterion("share_give_point not in", values, "shareGivePoint");
            return (Criteria) this;
        }

        public Criteria andShareGivePointBetween(Integer value1, Integer value2) {
            addCriterion("share_give_point between", value1, value2, "shareGivePoint");
            return (Criteria) this;
        }

        public Criteria andShareGivePointNotBetween(Integer value1, Integer value2) {
            addCriterion("share_give_point not between", value1, value2, "shareGivePoint");
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

        public Criteria andBuyPvIsNull() {
            addCriterion("buy_pv is null");
            return (Criteria) this;
        }

        public Criteria andBuyPvIsNotNull() {
            addCriterion("buy_pv is not null");
            return (Criteria) this;
        }

        public Criteria andBuyPvEqualTo(BigDecimal value) {
            addCriterion("buy_pv =", value, "buyPv");
            return (Criteria) this;
        }

        public Criteria andBuyPvNotEqualTo(BigDecimal value) {
            addCriterion("buy_pv <>", value, "buyPv");
            return (Criteria) this;
        }

        public Criteria andBuyPvGreaterThan(BigDecimal value) {
            addCriterion("buy_pv >", value, "buyPv");
            return (Criteria) this;
        }

        public Criteria andBuyPvGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("buy_pv >=", value, "buyPv");
            return (Criteria) this;
        }

        public Criteria andBuyPvLessThan(BigDecimal value) {
            addCriterion("buy_pv <", value, "buyPv");
            return (Criteria) this;
        }

        public Criteria andBuyPvLessThanOrEqualTo(BigDecimal value) {
            addCriterion("buy_pv <=", value, "buyPv");
            return (Criteria) this;
        }

        public Criteria andBuyPvIn(List<BigDecimal> values) {
            addCriterion("buy_pv in", values, "buyPv");
            return (Criteria) this;
        }

        public Criteria andBuyPvNotIn(List<BigDecimal> values) {
            addCriterion("buy_pv not in", values, "buyPv");
            return (Criteria) this;
        }

        public Criteria andBuyPvBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("buy_pv between", value1, value2, "buyPv");
            return (Criteria) this;
        }

        public Criteria andBuyPvNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("buy_pv not between", value1, value2, "buyPv");
            return (Criteria) this;
        }

        public Criteria andImgThumbIsNull() {
            addCriterion("img_thumb is null");
            return (Criteria) this;
        }

        public Criteria andImgThumbIsNotNull() {
            addCriterion("img_thumb is not null");
            return (Criteria) this;
        }

        public Criteria andImgThumbEqualTo(String value) {
            addCriterion("img_thumb =", value, "imgThumb");
            return (Criteria) this;
        }

        public Criteria andImgThumbNotEqualTo(String value) {
            addCriterion("img_thumb <>", value, "imgThumb");
            return (Criteria) this;
        }

        public Criteria andImgThumbGreaterThan(String value) {
            addCriterion("img_thumb >", value, "imgThumb");
            return (Criteria) this;
        }

        public Criteria andImgThumbGreaterThanOrEqualTo(String value) {
            addCriterion("img_thumb >=", value, "imgThumb");
            return (Criteria) this;
        }

        public Criteria andImgThumbLessThan(String value) {
            addCriterion("img_thumb <", value, "imgThumb");
            return (Criteria) this;
        }

        public Criteria andImgThumbLessThanOrEqualTo(String value) {
            addCriterion("img_thumb <=", value, "imgThumb");
            return (Criteria) this;
        }

        public Criteria andImgThumbLike(String value) {
            addCriterion("img_thumb like", value, "imgThumb");
            return (Criteria) this;
        }

        public Criteria andImgThumbNotLike(String value) {
            addCriterion("img_thumb not like", value, "imgThumb");
            return (Criteria) this;
        }

        public Criteria andImgThumbIn(List<String> values) {
            addCriterion("img_thumb in", values, "imgThumb");
            return (Criteria) this;
        }

        public Criteria andImgThumbNotIn(List<String> values) {
            addCriterion("img_thumb not in", values, "imgThumb");
            return (Criteria) this;
        }

        public Criteria andImgThumbBetween(String value1, String value2) {
            addCriterion("img_thumb between", value1, value2, "imgThumb");
            return (Criteria) this;
        }

        public Criteria andImgThumbNotBetween(String value1, String value2) {
            addCriterion("img_thumb not between", value1, value2, "imgThumb");
            return (Criteria) this;
        }

        public Criteria andImgOroginIsNull() {
            addCriterion("img_orogin is null");
            return (Criteria) this;
        }

        public Criteria andImgOroginIsNotNull() {
            addCriterion("img_orogin is not null");
            return (Criteria) this;
        }

        public Criteria andImgOroginEqualTo(String value) {
            addCriterion("img_orogin =", value, "imgOrogin");
            return (Criteria) this;
        }

        public Criteria andImgOroginNotEqualTo(String value) {
            addCriterion("img_orogin <>", value, "imgOrogin");
            return (Criteria) this;
        }

        public Criteria andImgOroginGreaterThan(String value) {
            addCriterion("img_orogin >", value, "imgOrogin");
            return (Criteria) this;
        }

        public Criteria andImgOroginGreaterThanOrEqualTo(String value) {
            addCriterion("img_orogin >=", value, "imgOrogin");
            return (Criteria) this;
        }

        public Criteria andImgOroginLessThan(String value) {
            addCriterion("img_orogin <", value, "imgOrogin");
            return (Criteria) this;
        }

        public Criteria andImgOroginLessThanOrEqualTo(String value) {
            addCriterion("img_orogin <=", value, "imgOrogin");
            return (Criteria) this;
        }

        public Criteria andImgOroginLike(String value) {
            addCriterion("img_orogin like", value, "imgOrogin");
            return (Criteria) this;
        }

        public Criteria andImgOroginNotLike(String value) {
            addCriterion("img_orogin not like", value, "imgOrogin");
            return (Criteria) this;
        }

        public Criteria andImgOroginIn(List<String> values) {
            addCriterion("img_orogin in", values, "imgOrogin");
            return (Criteria) this;
        }

        public Criteria andImgOroginNotIn(List<String> values) {
            addCriterion("img_orogin not in", values, "imgOrogin");
            return (Criteria) this;
        }

        public Criteria andImgOroginBetween(String value1, String value2) {
            addCriterion("img_orogin between", value1, value2, "imgOrogin");
            return (Criteria) this;
        }

        public Criteria andImgOroginNotBetween(String value1, String value2) {
            addCriterion("img_orogin not between", value1, value2, "imgOrogin");
            return (Criteria) this;
        }

        public Criteria andImgPromoteIsNull() {
            addCriterion("img_promote is null");
            return (Criteria) this;
        }

        public Criteria andImgPromoteIsNotNull() {
            addCriterion("img_promote is not null");
            return (Criteria) this;
        }

        public Criteria andImgPromoteEqualTo(String value) {
            addCriterion("img_promote =", value, "imgPromote");
            return (Criteria) this;
        }

        public Criteria andImgPromoteNotEqualTo(String value) {
            addCriterion("img_promote <>", value, "imgPromote");
            return (Criteria) this;
        }

        public Criteria andImgPromoteGreaterThan(String value) {
            addCriterion("img_promote >", value, "imgPromote");
            return (Criteria) this;
        }

        public Criteria andImgPromoteGreaterThanOrEqualTo(String value) {
            addCriterion("img_promote >=", value, "imgPromote");
            return (Criteria) this;
        }

        public Criteria andImgPromoteLessThan(String value) {
            addCriterion("img_promote <", value, "imgPromote");
            return (Criteria) this;
        }

        public Criteria andImgPromoteLessThanOrEqualTo(String value) {
            addCriterion("img_promote <=", value, "imgPromote");
            return (Criteria) this;
        }

        public Criteria andImgPromoteLike(String value) {
            addCriterion("img_promote like", value, "imgPromote");
            return (Criteria) this;
        }

        public Criteria andImgPromoteNotLike(String value) {
            addCriterion("img_promote not like", value, "imgPromote");
            return (Criteria) this;
        }

        public Criteria andImgPromoteIn(List<String> values) {
            addCriterion("img_promote in", values, "imgPromote");
            return (Criteria) this;
        }

        public Criteria andImgPromoteNotIn(List<String> values) {
            addCriterion("img_promote not in", values, "imgPromote");
            return (Criteria) this;
        }

        public Criteria andImgPromoteBetween(String value1, String value2) {
            addCriterion("img_promote between", value1, value2, "imgPromote");
            return (Criteria) this;
        }

        public Criteria andImgPromoteNotBetween(String value1, String value2) {
            addCriterion("img_promote not between", value1, value2, "imgPromote");
            return (Criteria) this;
        }

        public Criteria andGoodsBefIsNull() {
            addCriterion("goods_bef is null");
            return (Criteria) this;
        }

        public Criteria andGoodsBefIsNotNull() {
            addCriterion("goods_bef is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsBefEqualTo(String value) {
            addCriterion("goods_bef =", value, "goodsBef");
            return (Criteria) this;
        }

        public Criteria andGoodsBefNotEqualTo(String value) {
            addCriterion("goods_bef <>", value, "goodsBef");
            return (Criteria) this;
        }

        public Criteria andGoodsBefGreaterThan(String value) {
            addCriterion("goods_bef >", value, "goodsBef");
            return (Criteria) this;
        }

        public Criteria andGoodsBefGreaterThanOrEqualTo(String value) {
            addCriterion("goods_bef >=", value, "goodsBef");
            return (Criteria) this;
        }

        public Criteria andGoodsBefLessThan(String value) {
            addCriterion("goods_bef <", value, "goodsBef");
            return (Criteria) this;
        }

        public Criteria andGoodsBefLessThanOrEqualTo(String value) {
            addCriterion("goods_bef <=", value, "goodsBef");
            return (Criteria) this;
        }

        public Criteria andGoodsBefLike(String value) {
            addCriterion("goods_bef like", value, "goodsBef");
            return (Criteria) this;
        }

        public Criteria andGoodsBefNotLike(String value) {
            addCriterion("goods_bef not like", value, "goodsBef");
            return (Criteria) this;
        }

        public Criteria andGoodsBefIn(List<String> values) {
            addCriterion("goods_bef in", values, "goodsBef");
            return (Criteria) this;
        }

        public Criteria andGoodsBefNotIn(List<String> values) {
            addCriterion("goods_bef not in", values, "goodsBef");
            return (Criteria) this;
        }

        public Criteria andGoodsBefBetween(String value1, String value2) {
            addCriterion("goods_bef between", value1, value2, "goodsBef");
            return (Criteria) this;
        }

        public Criteria andGoodsBefNotBetween(String value1, String value2) {
            addCriterion("goods_bef not between", value1, value2, "goodsBef");
            return (Criteria) this;
        }

        public Criteria andSellNumberIsNull() {
            addCriterion("sell_number is null");
            return (Criteria) this;
        }

        public Criteria andSellNumberIsNotNull() {
            addCriterion("sell_number is not null");
            return (Criteria) this;
        }

        public Criteria andSellNumberEqualTo(Integer value) {
            addCriterion("sell_number =", value, "sellNumber");
            return (Criteria) this;
        }

        public Criteria andSellNumberNotEqualTo(Integer value) {
            addCriterion("sell_number <>", value, "sellNumber");
            return (Criteria) this;
        }

        public Criteria andSellNumberGreaterThan(Integer value) {
            addCriterion("sell_number >", value, "sellNumber");
            return (Criteria) this;
        }

        public Criteria andSellNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("sell_number >=", value, "sellNumber");
            return (Criteria) this;
        }

        public Criteria andSellNumberLessThan(Integer value) {
            addCriterion("sell_number <", value, "sellNumber");
            return (Criteria) this;
        }

        public Criteria andSellNumberLessThanOrEqualTo(Integer value) {
            addCriterion("sell_number <=", value, "sellNumber");
            return (Criteria) this;
        }

        public Criteria andSellNumberIn(List<Integer> values) {
            addCriterion("sell_number in", values, "sellNumber");
            return (Criteria) this;
        }

        public Criteria andSellNumberNotIn(List<Integer> values) {
            addCriterion("sell_number not in", values, "sellNumber");
            return (Criteria) this;
        }

        public Criteria andSellNumberBetween(Integer value1, Integer value2) {
            addCriterion("sell_number between", value1, value2, "sellNumber");
            return (Criteria) this;
        }

        public Criteria andSellNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("sell_number not between", value1, value2, "sellNumber");
            return (Criteria) this;
        }

        public Criteria andSortIsNull() {
            addCriterion("sort is null");
            return (Criteria) this;
        }

        public Criteria andSortIsNotNull() {
            addCriterion("sort is not null");
            return (Criteria) this;
        }

        public Criteria andSortEqualTo(Integer value) {
            addCriterion("sort =", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotEqualTo(Integer value) {
            addCriterion("sort <>", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThan(Integer value) {
            addCriterion("sort >", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("sort >=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThan(Integer value) {
            addCriterion("sort <", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThanOrEqualTo(Integer value) {
            addCriterion("sort <=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortIn(List<Integer> values) {
            addCriterion("sort in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotIn(List<Integer> values) {
            addCriterion("sort not in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortBetween(Integer value1, Integer value2) {
            addCriterion("sort between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotBetween(Integer value1, Integer value2) {
            addCriterion("sort not between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andShopSortIsNull() {
            addCriterion("shop_sort is null");
            return (Criteria) this;
        }

        public Criteria andShopSortIsNotNull() {
            addCriterion("shop_sort is not null");
            return (Criteria) this;
        }

        public Criteria andShopSortEqualTo(Integer value) {
            addCriterion("shop_sort =", value, "shopSort");
            return (Criteria) this;
        }

        public Criteria andShopSortNotEqualTo(Integer value) {
            addCriterion("shop_sort <>", value, "shopSort");
            return (Criteria) this;
        }

        public Criteria andShopSortGreaterThan(Integer value) {
            addCriterion("shop_sort >", value, "shopSort");
            return (Criteria) this;
        }

        public Criteria andShopSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("shop_sort >=", value, "shopSort");
            return (Criteria) this;
        }

        public Criteria andShopSortLessThan(Integer value) {
            addCriterion("shop_sort <", value, "shopSort");
            return (Criteria) this;
        }

        public Criteria andShopSortLessThanOrEqualTo(Integer value) {
            addCriterion("shop_sort <=", value, "shopSort");
            return (Criteria) this;
        }

        public Criteria andShopSortIn(List<Integer> values) {
            addCriterion("shop_sort in", values, "shopSort");
            return (Criteria) this;
        }

        public Criteria andShopSortNotIn(List<Integer> values) {
            addCriterion("shop_sort not in", values, "shopSort");
            return (Criteria) this;
        }

        public Criteria andShopSortBetween(Integer value1, Integer value2) {
            addCriterion("shop_sort between", value1, value2, "shopSort");
            return (Criteria) this;
        }

        public Criteria andShopSortNotBetween(Integer value1, Integer value2) {
            addCriterion("shop_sort not between", value1, value2, "shopSort");
            return (Criteria) this;
        }

        public Criteria andPurchaseIsNull() {
            addCriterion("purchase is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseIsNotNull() {
            addCriterion("purchase is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseEqualTo(String value) {
            addCriterion("purchase =", value, "purchase");
            return (Criteria) this;
        }

        public Criteria andPurchaseNotEqualTo(String value) {
            addCriterion("purchase <>", value, "purchase");
            return (Criteria) this;
        }

        public Criteria andPurchaseGreaterThan(String value) {
            addCriterion("purchase >", value, "purchase");
            return (Criteria) this;
        }

        public Criteria andPurchaseGreaterThanOrEqualTo(String value) {
            addCriterion("purchase >=", value, "purchase");
            return (Criteria) this;
        }

        public Criteria andPurchaseLessThan(String value) {
            addCriterion("purchase <", value, "purchase");
            return (Criteria) this;
        }

        public Criteria andPurchaseLessThanOrEqualTo(String value) {
            addCriterion("purchase <=", value, "purchase");
            return (Criteria) this;
        }

        public Criteria andPurchaseLike(String value) {
            addCriterion("purchase like", value, "purchase");
            return (Criteria) this;
        }

        public Criteria andPurchaseNotLike(String value) {
            addCriterion("purchase not like", value, "purchase");
            return (Criteria) this;
        }

        public Criteria andPurchaseIn(List<String> values) {
            addCriterion("purchase in", values, "purchase");
            return (Criteria) this;
        }

        public Criteria andPurchaseNotIn(List<String> values) {
            addCriterion("purchase not in", values, "purchase");
            return (Criteria) this;
        }

        public Criteria andPurchaseBetween(String value1, String value2) {
            addCriterion("purchase between", value1, value2, "purchase");
            return (Criteria) this;
        }

        public Criteria andPurchaseNotBetween(String value1, String value2) {
            addCriterion("purchase not between", value1, value2, "purchase");
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

        public Criteria andIsPintuanEqualTo(Short value) {
            addCriterion("is_pintuan =", value, "isPintuan");
            return (Criteria) this;
        }

        public Criteria andIsPintuanNotEqualTo(Short value) {
            addCriterion("is_pintuan <>", value, "isPintuan");
            return (Criteria) this;
        }

        public Criteria andIsPintuanGreaterThan(Short value) {
            addCriterion("is_pintuan >", value, "isPintuan");
            return (Criteria) this;
        }

        public Criteria andIsPintuanGreaterThanOrEqualTo(Short value) {
            addCriterion("is_pintuan >=", value, "isPintuan");
            return (Criteria) this;
        }

        public Criteria andIsPintuanLessThan(Short value) {
            addCriterion("is_pintuan <", value, "isPintuan");
            return (Criteria) this;
        }

        public Criteria andIsPintuanLessThanOrEqualTo(Short value) {
            addCriterion("is_pintuan <=", value, "isPintuan");
            return (Criteria) this;
        }

        public Criteria andIsPintuanIn(List<Short> values) {
            addCriterion("is_pintuan in", values, "isPintuan");
            return (Criteria) this;
        }

        public Criteria andIsPintuanNotIn(List<Short> values) {
            addCriterion("is_pintuan not in", values, "isPintuan");
            return (Criteria) this;
        }

        public Criteria andIsPintuanBetween(Short value1, Short value2) {
            addCriterion("is_pintuan between", value1, value2, "isPintuan");
            return (Criteria) this;
        }

        public Criteria andIsPintuanNotBetween(Short value1, Short value2) {
            addCriterion("is_pintuan not between", value1, value2, "isPintuan");
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

        public Criteria andIsZhongchouEqualTo(Short value) {
            addCriterion("is_zhongchou =", value, "isZhongchou");
            return (Criteria) this;
        }

        public Criteria andIsZhongchouNotEqualTo(Short value) {
            addCriterion("is_zhongchou <>", value, "isZhongchou");
            return (Criteria) this;
        }

        public Criteria andIsZhongchouGreaterThan(Short value) {
            addCriterion("is_zhongchou >", value, "isZhongchou");
            return (Criteria) this;
        }

        public Criteria andIsZhongchouGreaterThanOrEqualTo(Short value) {
            addCriterion("is_zhongchou >=", value, "isZhongchou");
            return (Criteria) this;
        }

        public Criteria andIsZhongchouLessThan(Short value) {
            addCriterion("is_zhongchou <", value, "isZhongchou");
            return (Criteria) this;
        }

        public Criteria andIsZhongchouLessThanOrEqualTo(Short value) {
            addCriterion("is_zhongchou <=", value, "isZhongchou");
            return (Criteria) this;
        }

        public Criteria andIsZhongchouIn(List<Short> values) {
            addCriterion("is_zhongchou in", values, "isZhongchou");
            return (Criteria) this;
        }

        public Criteria andIsZhongchouNotIn(List<Short> values) {
            addCriterion("is_zhongchou not in", values, "isZhongchou");
            return (Criteria) this;
        }

        public Criteria andIsZhongchouBetween(Short value1, Short value2) {
            addCriterion("is_zhongchou between", value1, value2, "isZhongchou");
            return (Criteria) this;
        }

        public Criteria andIsZhongchouNotBetween(Short value1, Short value2) {
            addCriterion("is_zhongchou not between", value1, value2, "isZhongchou");
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

        public Criteria andIsRealEqualTo(Short value) {
            addCriterion("is_real =", value, "isReal");
            return (Criteria) this;
        }

        public Criteria andIsRealNotEqualTo(Short value) {
            addCriterion("is_real <>", value, "isReal");
            return (Criteria) this;
        }

        public Criteria andIsRealGreaterThan(Short value) {
            addCriterion("is_real >", value, "isReal");
            return (Criteria) this;
        }

        public Criteria andIsRealGreaterThanOrEqualTo(Short value) {
            addCriterion("is_real >=", value, "isReal");
            return (Criteria) this;
        }

        public Criteria andIsRealLessThan(Short value) {
            addCriterion("is_real <", value, "isReal");
            return (Criteria) this;
        }

        public Criteria andIsRealLessThanOrEqualTo(Short value) {
            addCriterion("is_real <=", value, "isReal");
            return (Criteria) this;
        }

        public Criteria andIsRealIn(List<Short> values) {
            addCriterion("is_real in", values, "isReal");
            return (Criteria) this;
        }

        public Criteria andIsRealNotIn(List<Short> values) {
            addCriterion("is_real not in", values, "isReal");
            return (Criteria) this;
        }

        public Criteria andIsRealBetween(Short value1, Short value2) {
            addCriterion("is_real between", value1, value2, "isReal");
            return (Criteria) this;
        }

        public Criteria andIsRealNotBetween(Short value1, Short value2) {
            addCriterion("is_real not between", value1, value2, "isReal");
            return (Criteria) this;
        }

        public Criteria andIsQianggouIsNull() {
            addCriterion("is_qianggou is null");
            return (Criteria) this;
        }

        public Criteria andIsQianggouIsNotNull() {
            addCriterion("is_qianggou is not null");
            return (Criteria) this;
        }

        public Criteria andIsQianggouEqualTo(Short value) {
            addCriterion("is_qianggou =", value, "isQianggou");
            return (Criteria) this;
        }

        public Criteria andIsQianggouNotEqualTo(Short value) {
            addCriterion("is_qianggou <>", value, "isQianggou");
            return (Criteria) this;
        }

        public Criteria andIsQianggouGreaterThan(Short value) {
            addCriterion("is_qianggou >", value, "isQianggou");
            return (Criteria) this;
        }

        public Criteria andIsQianggouGreaterThanOrEqualTo(Short value) {
            addCriterion("is_qianggou >=", value, "isQianggou");
            return (Criteria) this;
        }

        public Criteria andIsQianggouLessThan(Short value) {
            addCriterion("is_qianggou <", value, "isQianggou");
            return (Criteria) this;
        }

        public Criteria andIsQianggouLessThanOrEqualTo(Short value) {
            addCriterion("is_qianggou <=", value, "isQianggou");
            return (Criteria) this;
        }

        public Criteria andIsQianggouIn(List<Short> values) {
            addCriterion("is_qianggou in", values, "isQianggou");
            return (Criteria) this;
        }

        public Criteria andIsQianggouNotIn(List<Short> values) {
            addCriterion("is_qianggou not in", values, "isQianggou");
            return (Criteria) this;
        }

        public Criteria andIsQianggouBetween(Short value1, Short value2) {
            addCriterion("is_qianggou between", value1, value2, "isQianggou");
            return (Criteria) this;
        }

        public Criteria andIsQianggouNotBetween(Short value1, Short value2) {
            addCriterion("is_qianggou not between", value1, value2, "isQianggou");
            return (Criteria) this;
        }

        public Criteria andIsPromoteIsNull() {
            addCriterion("is_promote is null");
            return (Criteria) this;
        }

        public Criteria andIsPromoteIsNotNull() {
            addCriterion("is_promote is not null");
            return (Criteria) this;
        }

        public Criteria andIsPromoteEqualTo(Short value) {
            addCriterion("is_promote =", value, "isPromote");
            return (Criteria) this;
        }

        public Criteria andIsPromoteNotEqualTo(Short value) {
            addCriterion("is_promote <>", value, "isPromote");
            return (Criteria) this;
        }

        public Criteria andIsPromoteGreaterThan(Short value) {
            addCriterion("is_promote >", value, "isPromote");
            return (Criteria) this;
        }

        public Criteria andIsPromoteGreaterThanOrEqualTo(Short value) {
            addCriterion("is_promote >=", value, "isPromote");
            return (Criteria) this;
        }

        public Criteria andIsPromoteLessThan(Short value) {
            addCriterion("is_promote <", value, "isPromote");
            return (Criteria) this;
        }

        public Criteria andIsPromoteLessThanOrEqualTo(Short value) {
            addCriterion("is_promote <=", value, "isPromote");
            return (Criteria) this;
        }

        public Criteria andIsPromoteIn(List<Short> values) {
            addCriterion("is_promote in", values, "isPromote");
            return (Criteria) this;
        }

        public Criteria andIsPromoteNotIn(List<Short> values) {
            addCriterion("is_promote not in", values, "isPromote");
            return (Criteria) this;
        }

        public Criteria andIsPromoteBetween(Short value1, Short value2) {
            addCriterion("is_promote between", value1, value2, "isPromote");
            return (Criteria) this;
        }

        public Criteria andIsPromoteNotBetween(Short value1, Short value2) {
            addCriterion("is_promote not between", value1, value2, "isPromote");
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

        public Criteria andIsMiaoshaEqualTo(Short value) {
            addCriterion("is_miaosha =", value, "isMiaosha");
            return (Criteria) this;
        }

        public Criteria andIsMiaoshaNotEqualTo(Short value) {
            addCriterion("is_miaosha <>", value, "isMiaosha");
            return (Criteria) this;
        }

        public Criteria andIsMiaoshaGreaterThan(Short value) {
            addCriterion("is_miaosha >", value, "isMiaosha");
            return (Criteria) this;
        }

        public Criteria andIsMiaoshaGreaterThanOrEqualTo(Short value) {
            addCriterion("is_miaosha >=", value, "isMiaosha");
            return (Criteria) this;
        }

        public Criteria andIsMiaoshaLessThan(Short value) {
            addCriterion("is_miaosha <", value, "isMiaosha");
            return (Criteria) this;
        }

        public Criteria andIsMiaoshaLessThanOrEqualTo(Short value) {
            addCriterion("is_miaosha <=", value, "isMiaosha");
            return (Criteria) this;
        }

        public Criteria andIsMiaoshaIn(List<Short> values) {
            addCriterion("is_miaosha in", values, "isMiaosha");
            return (Criteria) this;
        }

        public Criteria andIsMiaoshaNotIn(List<Short> values) {
            addCriterion("is_miaosha not in", values, "isMiaosha");
            return (Criteria) this;
        }

        public Criteria andIsMiaoshaBetween(Short value1, Short value2) {
            addCriterion("is_miaosha between", value1, value2, "isMiaosha");
            return (Criteria) this;
        }

        public Criteria andIsMiaoshaNotBetween(Short value1, Short value2) {
            addCriterion("is_miaosha not between", value1, value2, "isMiaosha");
            return (Criteria) this;
        }

        public Criteria andIsXiangliangIsNull() {
            addCriterion("is_xiangliang is null");
            return (Criteria) this;
        }

        public Criteria andIsXiangliangIsNotNull() {
            addCriterion("is_xiangliang is not null");
            return (Criteria) this;
        }

        public Criteria andIsXiangliangEqualTo(Short value) {
            addCriterion("is_xiangliang =", value, "isXiangliang");
            return (Criteria) this;
        }

        public Criteria andIsXiangliangNotEqualTo(Short value) {
            addCriterion("is_xiangliang <>", value, "isXiangliang");
            return (Criteria) this;
        }

        public Criteria andIsXiangliangGreaterThan(Short value) {
            addCriterion("is_xiangliang >", value, "isXiangliang");
            return (Criteria) this;
        }

        public Criteria andIsXiangliangGreaterThanOrEqualTo(Short value) {
            addCriterion("is_xiangliang >=", value, "isXiangliang");
            return (Criteria) this;
        }

        public Criteria andIsXiangliangLessThan(Short value) {
            addCriterion("is_xiangliang <", value, "isXiangliang");
            return (Criteria) this;
        }

        public Criteria andIsXiangliangLessThanOrEqualTo(Short value) {
            addCriterion("is_xiangliang <=", value, "isXiangliang");
            return (Criteria) this;
        }

        public Criteria andIsXiangliangIn(List<Short> values) {
            addCriterion("is_xiangliang in", values, "isXiangliang");
            return (Criteria) this;
        }

        public Criteria andIsXiangliangNotIn(List<Short> values) {
            addCriterion("is_xiangliang not in", values, "isXiangliang");
            return (Criteria) this;
        }

        public Criteria andIsXiangliangBetween(Short value1, Short value2) {
            addCriterion("is_xiangliang between", value1, value2, "isXiangliang");
            return (Criteria) this;
        }

        public Criteria andIsXiangliangNotBetween(Short value1, Short value2) {
            addCriterion("is_xiangliang not between", value1, value2, "isXiangliang");
            return (Criteria) this;
        }

        public Criteria andIsPreIsNull() {
            addCriterion("is_pre is null");
            return (Criteria) this;
        }

        public Criteria andIsPreIsNotNull() {
            addCriterion("is_pre is not null");
            return (Criteria) this;
        }

        public Criteria andIsPreEqualTo(Short value) {
            addCriterion("is_pre =", value, "isPre");
            return (Criteria) this;
        }

        public Criteria andIsPreNotEqualTo(Short value) {
            addCriterion("is_pre <>", value, "isPre");
            return (Criteria) this;
        }

        public Criteria andIsPreGreaterThan(Short value) {
            addCriterion("is_pre >", value, "isPre");
            return (Criteria) this;
        }

        public Criteria andIsPreGreaterThanOrEqualTo(Short value) {
            addCriterion("is_pre >=", value, "isPre");
            return (Criteria) this;
        }

        public Criteria andIsPreLessThan(Short value) {
            addCriterion("is_pre <", value, "isPre");
            return (Criteria) this;
        }

        public Criteria andIsPreLessThanOrEqualTo(Short value) {
            addCriterion("is_pre <=", value, "isPre");
            return (Criteria) this;
        }

        public Criteria andIsPreIn(List<Short> values) {
            addCriterion("is_pre in", values, "isPre");
            return (Criteria) this;
        }

        public Criteria andIsPreNotIn(List<Short> values) {
            addCriterion("is_pre not in", values, "isPre");
            return (Criteria) this;
        }

        public Criteria andIsPreBetween(Short value1, Short value2) {
            addCriterion("is_pre between", value1, value2, "isPre");
            return (Criteria) this;
        }

        public Criteria andIsPreNotBetween(Short value1, Short value2) {
            addCriterion("is_pre not between", value1, value2, "isPre");
            return (Criteria) this;
        }

        public Criteria andIsHotIsNull() {
            addCriterion("is_hot is null");
            return (Criteria) this;
        }

        public Criteria andIsHotIsNotNull() {
            addCriterion("is_hot is not null");
            return (Criteria) this;
        }

        public Criteria andIsHotEqualTo(Short value) {
            addCriterion("is_hot =", value, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotNotEqualTo(Short value) {
            addCriterion("is_hot <>", value, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotGreaterThan(Short value) {
            addCriterion("is_hot >", value, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotGreaterThanOrEqualTo(Short value) {
            addCriterion("is_hot >=", value, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotLessThan(Short value) {
            addCriterion("is_hot <", value, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotLessThanOrEqualTo(Short value) {
            addCriterion("is_hot <=", value, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotIn(List<Short> values) {
            addCriterion("is_hot in", values, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotNotIn(List<Short> values) {
            addCriterion("is_hot not in", values, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotBetween(Short value1, Short value2) {
            addCriterion("is_hot between", value1, value2, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotNotBetween(Short value1, Short value2) {
            addCriterion("is_hot not between", value1, value2, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsDangpinIsNull() {
            addCriterion("is_dangpin is null");
            return (Criteria) this;
        }

        public Criteria andIsDangpinIsNotNull() {
            addCriterion("is_dangpin is not null");
            return (Criteria) this;
        }

        public Criteria andIsDangpinEqualTo(Short value) {
            addCriterion("is_dangpin =", value, "isDangpin");
            return (Criteria) this;
        }

        public Criteria andIsDangpinNotEqualTo(Short value) {
            addCriterion("is_dangpin <>", value, "isDangpin");
            return (Criteria) this;
        }

        public Criteria andIsDangpinGreaterThan(Short value) {
            addCriterion("is_dangpin >", value, "isDangpin");
            return (Criteria) this;
        }

        public Criteria andIsDangpinGreaterThanOrEqualTo(Short value) {
            addCriterion("is_dangpin >=", value, "isDangpin");
            return (Criteria) this;
        }

        public Criteria andIsDangpinLessThan(Short value) {
            addCriterion("is_dangpin <", value, "isDangpin");
            return (Criteria) this;
        }

        public Criteria andIsDangpinLessThanOrEqualTo(Short value) {
            addCriterion("is_dangpin <=", value, "isDangpin");
            return (Criteria) this;
        }

        public Criteria andIsDangpinIn(List<Short> values) {
            addCriterion("is_dangpin in", values, "isDangpin");
            return (Criteria) this;
        }

        public Criteria andIsDangpinNotIn(List<Short> values) {
            addCriterion("is_dangpin not in", values, "isDangpin");
            return (Criteria) this;
        }

        public Criteria andIsDangpinBetween(Short value1, Short value2) {
            addCriterion("is_dangpin between", value1, value2, "isDangpin");
            return (Criteria) this;
        }

        public Criteria andIsDangpinNotBetween(Short value1, Short value2) {
            addCriterion("is_dangpin not between", value1, value2, "isDangpin");
            return (Criteria) this;
        }

        public Criteria andIsRecommendedIsNull() {
            addCriterion("is_recommended is null");
            return (Criteria) this;
        }

        public Criteria andIsRecommendedIsNotNull() {
            addCriterion("is_recommended is not null");
            return (Criteria) this;
        }

        public Criteria andIsRecommendedEqualTo(Short value) {
            addCriterion("is_recommended =", value, "isRecommended");
            return (Criteria) this;
        }

        public Criteria andIsRecommendedNotEqualTo(Short value) {
            addCriterion("is_recommended <>", value, "isRecommended");
            return (Criteria) this;
        }

        public Criteria andIsRecommendedGreaterThan(Short value) {
            addCriterion("is_recommended >", value, "isRecommended");
            return (Criteria) this;
        }

        public Criteria andIsRecommendedGreaterThanOrEqualTo(Short value) {
            addCriterion("is_recommended >=", value, "isRecommended");
            return (Criteria) this;
        }

        public Criteria andIsRecommendedLessThan(Short value) {
            addCriterion("is_recommended <", value, "isRecommended");
            return (Criteria) this;
        }

        public Criteria andIsRecommendedLessThanOrEqualTo(Short value) {
            addCriterion("is_recommended <=", value, "isRecommended");
            return (Criteria) this;
        }

        public Criteria andIsRecommendedIn(List<Short> values) {
            addCriterion("is_recommended in", values, "isRecommended");
            return (Criteria) this;
        }

        public Criteria andIsRecommendedNotIn(List<Short> values) {
            addCriterion("is_recommended not in", values, "isRecommended");
            return (Criteria) this;
        }

        public Criteria andIsRecommendedBetween(Short value1, Short value2) {
            addCriterion("is_recommended between", value1, value2, "isRecommended");
            return (Criteria) this;
        }

        public Criteria andIsRecommendedNotBetween(Short value1, Short value2) {
            addCriterion("is_recommended not between", value1, value2, "isRecommended");
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

        public Criteria andIsPointEqualTo(Short value) {
            addCriterion("is_point =", value, "isPoint");
            return (Criteria) this;
        }

        public Criteria andIsPointNotEqualTo(Short value) {
            addCriterion("is_point <>", value, "isPoint");
            return (Criteria) this;
        }

        public Criteria andIsPointGreaterThan(Short value) {
            addCriterion("is_point >", value, "isPoint");
            return (Criteria) this;
        }

        public Criteria andIsPointGreaterThanOrEqualTo(Short value) {
            addCriterion("is_point >=", value, "isPoint");
            return (Criteria) this;
        }

        public Criteria andIsPointLessThan(Short value) {
            addCriterion("is_point <", value, "isPoint");
            return (Criteria) this;
        }

        public Criteria andIsPointLessThanOrEqualTo(Short value) {
            addCriterion("is_point <=", value, "isPoint");
            return (Criteria) this;
        }

        public Criteria andIsPointIn(List<Short> values) {
            addCriterion("is_point in", values, "isPoint");
            return (Criteria) this;
        }

        public Criteria andIsPointNotIn(List<Short> values) {
            addCriterion("is_point not in", values, "isPoint");
            return (Criteria) this;
        }

        public Criteria andIsPointBetween(Short value1, Short value2) {
            addCriterion("is_point between", value1, value2, "isPoint");
            return (Criteria) this;
        }

        public Criteria andIsPointNotBetween(Short value1, Short value2) {
            addCriterion("is_point not between", value1, value2, "isPoint");
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

        public Criteria andIsNewIsNull() {
            addCriterion("is_new is null");
            return (Criteria) this;
        }

        public Criteria andIsNewIsNotNull() {
            addCriterion("is_new is not null");
            return (Criteria) this;
        }

        public Criteria andIsNewEqualTo(Short value) {
            addCriterion("is_new =", value, "isNew");
            return (Criteria) this;
        }

        public Criteria andIsNewNotEqualTo(Short value) {
            addCriterion("is_new <>", value, "isNew");
            return (Criteria) this;
        }

        public Criteria andIsNewGreaterThan(Short value) {
            addCriterion("is_new >", value, "isNew");
            return (Criteria) this;
        }

        public Criteria andIsNewGreaterThanOrEqualTo(Short value) {
            addCriterion("is_new >=", value, "isNew");
            return (Criteria) this;
        }

        public Criteria andIsNewLessThan(Short value) {
            addCriterion("is_new <", value, "isNew");
            return (Criteria) this;
        }

        public Criteria andIsNewLessThanOrEqualTo(Short value) {
            addCriterion("is_new <=", value, "isNew");
            return (Criteria) this;
        }

        public Criteria andIsNewIn(List<Short> values) {
            addCriterion("is_new in", values, "isNew");
            return (Criteria) this;
        }

        public Criteria andIsNewNotIn(List<Short> values) {
            addCriterion("is_new not in", values, "isNew");
            return (Criteria) this;
        }

        public Criteria andIsNewBetween(Short value1, Short value2) {
            addCriterion("is_new between", value1, value2, "isNew");
            return (Criteria) this;
        }

        public Criteria andIsNewNotBetween(Short value1, Short value2) {
            addCriterion("is_new not between", value1, value2, "isNew");
            return (Criteria) this;
        }

        public Criteria andIsHadGiftIsNull() {
            addCriterion("is_had_gift is null");
            return (Criteria) this;
        }

        public Criteria andIsHadGiftIsNotNull() {
            addCriterion("is_had_gift is not null");
            return (Criteria) this;
        }

        public Criteria andIsHadGiftEqualTo(Short value) {
            addCriterion("is_had_gift =", value, "isHadGift");
            return (Criteria) this;
        }

        public Criteria andIsHadGiftNotEqualTo(Short value) {
            addCriterion("is_had_gift <>", value, "isHadGift");
            return (Criteria) this;
        }

        public Criteria andIsHadGiftGreaterThan(Short value) {
            addCriterion("is_had_gift >", value, "isHadGift");
            return (Criteria) this;
        }

        public Criteria andIsHadGiftGreaterThanOrEqualTo(Short value) {
            addCriterion("is_had_gift >=", value, "isHadGift");
            return (Criteria) this;
        }

        public Criteria andIsHadGiftLessThan(Short value) {
            addCriterion("is_had_gift <", value, "isHadGift");
            return (Criteria) this;
        }

        public Criteria andIsHadGiftLessThanOrEqualTo(Short value) {
            addCriterion("is_had_gift <=", value, "isHadGift");
            return (Criteria) this;
        }

        public Criteria andIsHadGiftIn(List<Short> values) {
            addCriterion("is_had_gift in", values, "isHadGift");
            return (Criteria) this;
        }

        public Criteria andIsHadGiftNotIn(List<Short> values) {
            addCriterion("is_had_gift not in", values, "isHadGift");
            return (Criteria) this;
        }

        public Criteria andIsHadGiftBetween(Short value1, Short value2) {
            addCriterion("is_had_gift between", value1, value2, "isHadGift");
            return (Criteria) this;
        }

        public Criteria andIsHadGiftNotBetween(Short value1, Short value2) {
            addCriterion("is_had_gift not between", value1, value2, "isHadGift");
            return (Criteria) this;
        }

        public Criteria andIsTraIsNull() {
            addCriterion("is_tra is null");
            return (Criteria) this;
        }

        public Criteria andIsTraIsNotNull() {
            addCriterion("is_tra is not null");
            return (Criteria) this;
        }

        public Criteria andIsTraEqualTo(Short value) {
            addCriterion("is_tra =", value, "isTra");
            return (Criteria) this;
        }

        public Criteria andIsTraNotEqualTo(Short value) {
            addCriterion("is_tra <>", value, "isTra");
            return (Criteria) this;
        }

        public Criteria andIsTraGreaterThan(Short value) {
            addCriterion("is_tra >", value, "isTra");
            return (Criteria) this;
        }

        public Criteria andIsTraGreaterThanOrEqualTo(Short value) {
            addCriterion("is_tra >=", value, "isTra");
            return (Criteria) this;
        }

        public Criteria andIsTraLessThan(Short value) {
            addCriterion("is_tra <", value, "isTra");
            return (Criteria) this;
        }

        public Criteria andIsTraLessThanOrEqualTo(Short value) {
            addCriterion("is_tra <=", value, "isTra");
            return (Criteria) this;
        }

        public Criteria andIsTraIn(List<Short> values) {
            addCriterion("is_tra in", values, "isTra");
            return (Criteria) this;
        }

        public Criteria andIsTraNotIn(List<Short> values) {
            addCriterion("is_tra not in", values, "isTra");
            return (Criteria) this;
        }

        public Criteria andIsTraBetween(Short value1, Short value2) {
            addCriterion("is_tra between", value1, value2, "isTra");
            return (Criteria) this;
        }

        public Criteria andIsTraNotBetween(Short value1, Short value2) {
            addCriterion("is_tra not between", value1, value2, "isTra");
            return (Criteria) this;
        }

        public Criteria andIsShareIsNull() {
            addCriterion("is_share is null");
            return (Criteria) this;
        }

        public Criteria andIsShareIsNotNull() {
            addCriterion("is_share is not null");
            return (Criteria) this;
        }

        public Criteria andIsShareEqualTo(Short value) {
            addCriterion("is_share =", value, "isShare");
            return (Criteria) this;
        }

        public Criteria andIsShareNotEqualTo(Short value) {
            addCriterion("is_share <>", value, "isShare");
            return (Criteria) this;
        }

        public Criteria andIsShareGreaterThan(Short value) {
            addCriterion("is_share >", value, "isShare");
            return (Criteria) this;
        }

        public Criteria andIsShareGreaterThanOrEqualTo(Short value) {
            addCriterion("is_share >=", value, "isShare");
            return (Criteria) this;
        }

        public Criteria andIsShareLessThan(Short value) {
            addCriterion("is_share <", value, "isShare");
            return (Criteria) this;
        }

        public Criteria andIsShareLessThanOrEqualTo(Short value) {
            addCriterion("is_share <=", value, "isShare");
            return (Criteria) this;
        }

        public Criteria andIsShareIn(List<Short> values) {
            addCriterion("is_share in", values, "isShare");
            return (Criteria) this;
        }

        public Criteria andIsShareNotIn(List<Short> values) {
            addCriterion("is_share not in", values, "isShare");
            return (Criteria) this;
        }

        public Criteria andIsShareBetween(Short value1, Short value2) {
            addCriterion("is_share between", value1, value2, "isShare");
            return (Criteria) this;
        }

        public Criteria andIsShareNotBetween(Short value1, Short value2) {
            addCriterion("is_share not between", value1, value2, "isShare");
            return (Criteria) this;
        }

        public Criteria andIsBargainIsNull() {
            addCriterion("is_bargain is null");
            return (Criteria) this;
        }

        public Criteria andIsBargainIsNotNull() {
            addCriterion("is_bargain is not null");
            return (Criteria) this;
        }

        public Criteria andIsBargainEqualTo(Short value) {
            addCriterion("is_bargain =", value, "isBargain");
            return (Criteria) this;
        }

        public Criteria andIsBargainNotEqualTo(Short value) {
            addCriterion("is_bargain <>", value, "isBargain");
            return (Criteria) this;
        }

        public Criteria andIsBargainGreaterThan(Short value) {
            addCriterion("is_bargain >", value, "isBargain");
            return (Criteria) this;
        }

        public Criteria andIsBargainGreaterThanOrEqualTo(Short value) {
            addCriterion("is_bargain >=", value, "isBargain");
            return (Criteria) this;
        }

        public Criteria andIsBargainLessThan(Short value) {
            addCriterion("is_bargain <", value, "isBargain");
            return (Criteria) this;
        }

        public Criteria andIsBargainLessThanOrEqualTo(Short value) {
            addCriterion("is_bargain <=", value, "isBargain");
            return (Criteria) this;
        }

        public Criteria andIsBargainIn(List<Short> values) {
            addCriterion("is_bargain in", values, "isBargain");
            return (Criteria) this;
        }

        public Criteria andIsBargainNotIn(List<Short> values) {
            addCriterion("is_bargain not in", values, "isBargain");
            return (Criteria) this;
        }

        public Criteria andIsBargainBetween(Short value1, Short value2) {
            addCriterion("is_bargain between", value1, value2, "isBargain");
            return (Criteria) this;
        }

        public Criteria andIsBargainNotBetween(Short value1, Short value2) {
            addCriterion("is_bargain not between", value1, value2, "isBargain");
            return (Criteria) this;
        }

        public Criteria andIsUserCouponIsNull() {
            addCriterion("is_user_coupon is null");
            return (Criteria) this;
        }

        public Criteria andIsUserCouponIsNotNull() {
            addCriterion("is_user_coupon is not null");
            return (Criteria) this;
        }

        public Criteria andIsUserCouponEqualTo(Short value) {
            addCriterion("is_user_coupon =", value, "isUserCoupon");
            return (Criteria) this;
        }

        public Criteria andIsUserCouponNotEqualTo(Short value) {
            addCriterion("is_user_coupon <>", value, "isUserCoupon");
            return (Criteria) this;
        }

        public Criteria andIsUserCouponGreaterThan(Short value) {
            addCriterion("is_user_coupon >", value, "isUserCoupon");
            return (Criteria) this;
        }

        public Criteria andIsUserCouponGreaterThanOrEqualTo(Short value) {
            addCriterion("is_user_coupon >=", value, "isUserCoupon");
            return (Criteria) this;
        }

        public Criteria andIsUserCouponLessThan(Short value) {
            addCriterion("is_user_coupon <", value, "isUserCoupon");
            return (Criteria) this;
        }

        public Criteria andIsUserCouponLessThanOrEqualTo(Short value) {
            addCriterion("is_user_coupon <=", value, "isUserCoupon");
            return (Criteria) this;
        }

        public Criteria andIsUserCouponIn(List<Short> values) {
            addCriterion("is_user_coupon in", values, "isUserCoupon");
            return (Criteria) this;
        }

        public Criteria andIsUserCouponNotIn(List<Short> values) {
            addCriterion("is_user_coupon not in", values, "isUserCoupon");
            return (Criteria) this;
        }

        public Criteria andIsUserCouponBetween(Short value1, Short value2) {
            addCriterion("is_user_coupon between", value1, value2, "isUserCoupon");
            return (Criteria) this;
        }

        public Criteria andIsUserCouponNotBetween(Short value1, Short value2) {
            addCriterion("is_user_coupon not between", value1, value2, "isUserCoupon");
            return (Criteria) this;
        }

        public Criteria andIsDiscountIsNull() {
            addCriterion("is_discount is null");
            return (Criteria) this;
        }

        public Criteria andIsDiscountIsNotNull() {
            addCriterion("is_discount is not null");
            return (Criteria) this;
        }

        public Criteria andIsDiscountEqualTo(Short value) {
            addCriterion("is_discount =", value, "isDiscount");
            return (Criteria) this;
        }

        public Criteria andIsDiscountNotEqualTo(Short value) {
            addCriterion("is_discount <>", value, "isDiscount");
            return (Criteria) this;
        }

        public Criteria andIsDiscountGreaterThan(Short value) {
            addCriterion("is_discount >", value, "isDiscount");
            return (Criteria) this;
        }

        public Criteria andIsDiscountGreaterThanOrEqualTo(Short value) {
            addCriterion("is_discount >=", value, "isDiscount");
            return (Criteria) this;
        }

        public Criteria andIsDiscountLessThan(Short value) {
            addCriterion("is_discount <", value, "isDiscount");
            return (Criteria) this;
        }

        public Criteria andIsDiscountLessThanOrEqualTo(Short value) {
            addCriterion("is_discount <=", value, "isDiscount");
            return (Criteria) this;
        }

        public Criteria andIsDiscountIn(List<Short> values) {
            addCriterion("is_discount in", values, "isDiscount");
            return (Criteria) this;
        }

        public Criteria andIsDiscountNotIn(List<Short> values) {
            addCriterion("is_discount not in", values, "isDiscount");
            return (Criteria) this;
        }

        public Criteria andIsDiscountBetween(Short value1, Short value2) {
            addCriterion("is_discount between", value1, value2, "isDiscount");
            return (Criteria) this;
        }

        public Criteria andIsDiscountNotBetween(Short value1, Short value2) {
            addCriterion("is_discount not between", value1, value2, "isDiscount");
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

        public Criteria andIsYanguangIsNull() {
            addCriterion("is_yanguang is null");
            return (Criteria) this;
        }

        public Criteria andIsYanguangIsNotNull() {
            addCriterion("is_yanguang is not null");
            return (Criteria) this;
        }

        public Criteria andIsYanguangEqualTo(Short value) {
            addCriterion("is_yanguang =", value, "isYanguang");
            return (Criteria) this;
        }

        public Criteria andIsYanguangNotEqualTo(Short value) {
            addCriterion("is_yanguang <>", value, "isYanguang");
            return (Criteria) this;
        }

        public Criteria andIsYanguangGreaterThan(Short value) {
            addCriterion("is_yanguang >", value, "isYanguang");
            return (Criteria) this;
        }

        public Criteria andIsYanguangGreaterThanOrEqualTo(Short value) {
            addCriterion("is_yanguang >=", value, "isYanguang");
            return (Criteria) this;
        }

        public Criteria andIsYanguangLessThan(Short value) {
            addCriterion("is_yanguang <", value, "isYanguang");
            return (Criteria) this;
        }

        public Criteria andIsYanguangLessThanOrEqualTo(Short value) {
            addCriterion("is_yanguang <=", value, "isYanguang");
            return (Criteria) this;
        }

        public Criteria andIsYanguangIn(List<Short> values) {
            addCriterion("is_yanguang in", values, "isYanguang");
            return (Criteria) this;
        }

        public Criteria andIsYanguangNotIn(List<Short> values) {
            addCriterion("is_yanguang not in", values, "isYanguang");
            return (Criteria) this;
        }

        public Criteria andIsYanguangBetween(Short value1, Short value2) {
            addCriterion("is_yanguang between", value1, value2, "isYanguang");
            return (Criteria) this;
        }

        public Criteria andIsYanguangNotBetween(Short value1, Short value2) {
            addCriterion("is_yanguang not between", value1, value2, "isYanguang");
            return (Criteria) this;
        }

        public Criteria andIsUserCouponFeeIsNull() {
            addCriterion("is_user_coupon_fee is null");
            return (Criteria) this;
        }

        public Criteria andIsUserCouponFeeIsNotNull() {
            addCriterion("is_user_coupon_fee is not null");
            return (Criteria) this;
        }

        public Criteria andIsUserCouponFeeEqualTo(BigDecimal value) {
            addCriterion("is_user_coupon_fee =", value, "isUserCouponFee");
            return (Criteria) this;
        }

        public Criteria andIsUserCouponFeeNotEqualTo(BigDecimal value) {
            addCriterion("is_user_coupon_fee <>", value, "isUserCouponFee");
            return (Criteria) this;
        }

        public Criteria andIsUserCouponFeeGreaterThan(BigDecimal value) {
            addCriterion("is_user_coupon_fee >", value, "isUserCouponFee");
            return (Criteria) this;
        }

        public Criteria andIsUserCouponFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("is_user_coupon_fee >=", value, "isUserCouponFee");
            return (Criteria) this;
        }

        public Criteria andIsUserCouponFeeLessThan(BigDecimal value) {
            addCriterion("is_user_coupon_fee <", value, "isUserCouponFee");
            return (Criteria) this;
        }

        public Criteria andIsUserCouponFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("is_user_coupon_fee <=", value, "isUserCouponFee");
            return (Criteria) this;
        }

        public Criteria andIsUserCouponFeeIn(List<BigDecimal> values) {
            addCriterion("is_user_coupon_fee in", values, "isUserCouponFee");
            return (Criteria) this;
        }

        public Criteria andIsUserCouponFeeNotIn(List<BigDecimal> values) {
            addCriterion("is_user_coupon_fee not in", values, "isUserCouponFee");
            return (Criteria) this;
        }

        public Criteria andIsUserCouponFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("is_user_coupon_fee between", value1, value2, "isUserCouponFee");
            return (Criteria) this;
        }

        public Criteria andIsUserCouponFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("is_user_coupon_fee not between", value1, value2, "isUserCouponFee");
            return (Criteria) this;
        }

        public Criteria andIsCoupon50IsNull() {
            addCriterion("is_coupon_50 is null");
            return (Criteria) this;
        }

        public Criteria andIsCoupon50IsNotNull() {
            addCriterion("is_coupon_50 is not null");
            return (Criteria) this;
        }

        public Criteria andIsCoupon50EqualTo(Short value) {
            addCriterion("is_coupon_50 =", value, "isCoupon50");
            return (Criteria) this;
        }

        public Criteria andIsCoupon50NotEqualTo(Short value) {
            addCriterion("is_coupon_50 <>", value, "isCoupon50");
            return (Criteria) this;
        }

        public Criteria andIsCoupon50GreaterThan(Short value) {
            addCriterion("is_coupon_50 >", value, "isCoupon50");
            return (Criteria) this;
        }

        public Criteria andIsCoupon50GreaterThanOrEqualTo(Short value) {
            addCriterion("is_coupon_50 >=", value, "isCoupon50");
            return (Criteria) this;
        }

        public Criteria andIsCoupon50LessThan(Short value) {
            addCriterion("is_coupon_50 <", value, "isCoupon50");
            return (Criteria) this;
        }

        public Criteria andIsCoupon50LessThanOrEqualTo(Short value) {
            addCriterion("is_coupon_50 <=", value, "isCoupon50");
            return (Criteria) this;
        }

        public Criteria andIsCoupon50In(List<Short> values) {
            addCriterion("is_coupon_50 in", values, "isCoupon50");
            return (Criteria) this;
        }

        public Criteria andIsCoupon50NotIn(List<Short> values) {
            addCriterion("is_coupon_50 not in", values, "isCoupon50");
            return (Criteria) this;
        }

        public Criteria andIsCoupon50Between(Short value1, Short value2) {
            addCriterion("is_coupon_50 between", value1, value2, "isCoupon50");
            return (Criteria) this;
        }

        public Criteria andIsCoupon50NotBetween(Short value1, Short value2) {
            addCriterion("is_coupon_50 not between", value1, value2, "isCoupon50");
            return (Criteria) this;
        }

        public Criteria andIsCoupon100IsNull() {
            addCriterion("is_coupon_100 is null");
            return (Criteria) this;
        }

        public Criteria andIsCoupon100IsNotNull() {
            addCriterion("is_coupon_100 is not null");
            return (Criteria) this;
        }

        public Criteria andIsCoupon100EqualTo(Short value) {
            addCriterion("is_coupon_100 =", value, "isCoupon100");
            return (Criteria) this;
        }

        public Criteria andIsCoupon100NotEqualTo(Short value) {
            addCriterion("is_coupon_100 <>", value, "isCoupon100");
            return (Criteria) this;
        }

        public Criteria andIsCoupon100GreaterThan(Short value) {
            addCriterion("is_coupon_100 >", value, "isCoupon100");
            return (Criteria) this;
        }

        public Criteria andIsCoupon100GreaterThanOrEqualTo(Short value) {
            addCriterion("is_coupon_100 >=", value, "isCoupon100");
            return (Criteria) this;
        }

        public Criteria andIsCoupon100LessThan(Short value) {
            addCriterion("is_coupon_100 <", value, "isCoupon100");
            return (Criteria) this;
        }

        public Criteria andIsCoupon100LessThanOrEqualTo(Short value) {
            addCriterion("is_coupon_100 <=", value, "isCoupon100");
            return (Criteria) this;
        }

        public Criteria andIsCoupon100In(List<Short> values) {
            addCriterion("is_coupon_100 in", values, "isCoupon100");
            return (Criteria) this;
        }

        public Criteria andIsCoupon100NotIn(List<Short> values) {
            addCriterion("is_coupon_100 not in", values, "isCoupon100");
            return (Criteria) this;
        }

        public Criteria andIsCoupon100Between(Short value1, Short value2) {
            addCriterion("is_coupon_100 between", value1, value2, "isCoupon100");
            return (Criteria) this;
        }

        public Criteria andIsCoupon100NotBetween(Short value1, Short value2) {
            addCriterion("is_coupon_100 not between", value1, value2, "isCoupon100");
            return (Criteria) this;
        }

        public Criteria andIsDaojishituanIsNull() {
            addCriterion("is_daojishituan is null");
            return (Criteria) this;
        }

        public Criteria andIsDaojishituanIsNotNull() {
            addCriterion("is_daojishituan is not null");
            return (Criteria) this;
        }

        public Criteria andIsDaojishituanEqualTo(Short value) {
            addCriterion("is_daojishituan =", value, "isDaojishituan");
            return (Criteria) this;
        }

        public Criteria andIsDaojishituanNotEqualTo(Short value) {
            addCriterion("is_daojishituan <>", value, "isDaojishituan");
            return (Criteria) this;
        }

        public Criteria andIsDaojishituanGreaterThan(Short value) {
            addCriterion("is_daojishituan >", value, "isDaojishituan");
            return (Criteria) this;
        }

        public Criteria andIsDaojishituanGreaterThanOrEqualTo(Short value) {
            addCriterion("is_daojishituan >=", value, "isDaojishituan");
            return (Criteria) this;
        }

        public Criteria andIsDaojishituanLessThan(Short value) {
            addCriterion("is_daojishituan <", value, "isDaojishituan");
            return (Criteria) this;
        }

        public Criteria andIsDaojishituanLessThanOrEqualTo(Short value) {
            addCriterion("is_daojishituan <=", value, "isDaojishituan");
            return (Criteria) this;
        }

        public Criteria andIsDaojishituanIn(List<Short> values) {
            addCriterion("is_daojishituan in", values, "isDaojishituan");
            return (Criteria) this;
        }

        public Criteria andIsDaojishituanNotIn(List<Short> values) {
            addCriterion("is_daojishituan not in", values, "isDaojishituan");
            return (Criteria) this;
        }

        public Criteria andIsDaojishituanBetween(Short value1, Short value2) {
            addCriterion("is_daojishituan between", value1, value2, "isDaojishituan");
            return (Criteria) this;
        }

        public Criteria andIsDaojishituanNotBetween(Short value1, Short value2) {
            addCriterion("is_daojishituan not between", value1, value2, "isDaojishituan");
            return (Criteria) this;
        }

        public Criteria andIsGuangxueIsNull() {
            addCriterion("is_guangxue is null");
            return (Criteria) this;
        }

        public Criteria andIsGuangxueIsNotNull() {
            addCriterion("is_guangxue is not null");
            return (Criteria) this;
        }

        public Criteria andIsGuangxueEqualTo(Short value) {
            addCriterion("is_guangxue =", value, "isGuangxue");
            return (Criteria) this;
        }

        public Criteria andIsGuangxueNotEqualTo(Short value) {
            addCriterion("is_guangxue <>", value, "isGuangxue");
            return (Criteria) this;
        }

        public Criteria andIsGuangxueGreaterThan(Short value) {
            addCriterion("is_guangxue >", value, "isGuangxue");
            return (Criteria) this;
        }

        public Criteria andIsGuangxueGreaterThanOrEqualTo(Short value) {
            addCriterion("is_guangxue >=", value, "isGuangxue");
            return (Criteria) this;
        }

        public Criteria andIsGuangxueLessThan(Short value) {
            addCriterion("is_guangxue <", value, "isGuangxue");
            return (Criteria) this;
        }

        public Criteria andIsGuangxueLessThanOrEqualTo(Short value) {
            addCriterion("is_guangxue <=", value, "isGuangxue");
            return (Criteria) this;
        }

        public Criteria andIsGuangxueIn(List<Short> values) {
            addCriterion("is_guangxue in", values, "isGuangxue");
            return (Criteria) this;
        }

        public Criteria andIsGuangxueNotIn(List<Short> values) {
            addCriterion("is_guangxue not in", values, "isGuangxue");
            return (Criteria) this;
        }

        public Criteria andIsGuangxueBetween(Short value1, Short value2) {
            addCriterion("is_guangxue between", value1, value2, "isGuangxue");
            return (Criteria) this;
        }

        public Criteria andIsGuangxueNotBetween(Short value1, Short value2) {
            addCriterion("is_guangxue not between", value1, value2, "isGuangxue");
            return (Criteria) this;
        }

        public Criteria andZhongchouCateIdIsNull() {
            addCriterion("zhongchou_cate_id is null");
            return (Criteria) this;
        }

        public Criteria andZhongchouCateIdIsNotNull() {
            addCriterion("zhongchou_cate_id is not null");
            return (Criteria) this;
        }

        public Criteria andZhongchouCateIdEqualTo(Short value) {
            addCriterion("zhongchou_cate_id =", value, "zhongchouCateId");
            return (Criteria) this;
        }

        public Criteria andZhongchouCateIdNotEqualTo(Short value) {
            addCriterion("zhongchou_cate_id <>", value, "zhongchouCateId");
            return (Criteria) this;
        }

        public Criteria andZhongchouCateIdGreaterThan(Short value) {
            addCriterion("zhongchou_cate_id >", value, "zhongchouCateId");
            return (Criteria) this;
        }

        public Criteria andZhongchouCateIdGreaterThanOrEqualTo(Short value) {
            addCriterion("zhongchou_cate_id >=", value, "zhongchouCateId");
            return (Criteria) this;
        }

        public Criteria andZhongchouCateIdLessThan(Short value) {
            addCriterion("zhongchou_cate_id <", value, "zhongchouCateId");
            return (Criteria) this;
        }

        public Criteria andZhongchouCateIdLessThanOrEqualTo(Short value) {
            addCriterion("zhongchou_cate_id <=", value, "zhongchouCateId");
            return (Criteria) this;
        }

        public Criteria andZhongchouCateIdIn(List<Short> values) {
            addCriterion("zhongchou_cate_id in", values, "zhongchouCateId");
            return (Criteria) this;
        }

        public Criteria andZhongchouCateIdNotIn(List<Short> values) {
            addCriterion("zhongchou_cate_id not in", values, "zhongchouCateId");
            return (Criteria) this;
        }

        public Criteria andZhongchouCateIdBetween(Short value1, Short value2) {
            addCriterion("zhongchou_cate_id between", value1, value2, "zhongchouCateId");
            return (Criteria) this;
        }

        public Criteria andZhongchouCateIdNotBetween(Short value1, Short value2) {
            addCriterion("zhongchou_cate_id not between", value1, value2, "zhongchouCateId");
            return (Criteria) this;
        }

        public Criteria andIsPayOnceIsNull() {
            addCriterion("is_pay_once is null");
            return (Criteria) this;
        }

        public Criteria andIsPayOnceIsNotNull() {
            addCriterion("is_pay_once is not null");
            return (Criteria) this;
        }

        public Criteria andIsPayOnceEqualTo(Short value) {
            addCriterion("is_pay_once =", value, "isPayOnce");
            return (Criteria) this;
        }

        public Criteria andIsPayOnceNotEqualTo(Short value) {
            addCriterion("is_pay_once <>", value, "isPayOnce");
            return (Criteria) this;
        }

        public Criteria andIsPayOnceGreaterThan(Short value) {
            addCriterion("is_pay_once >", value, "isPayOnce");
            return (Criteria) this;
        }

        public Criteria andIsPayOnceGreaterThanOrEqualTo(Short value) {
            addCriterion("is_pay_once >=", value, "isPayOnce");
            return (Criteria) this;
        }

        public Criteria andIsPayOnceLessThan(Short value) {
            addCriterion("is_pay_once <", value, "isPayOnce");
            return (Criteria) this;
        }

        public Criteria andIsPayOnceLessThanOrEqualTo(Short value) {
            addCriterion("is_pay_once <=", value, "isPayOnce");
            return (Criteria) this;
        }

        public Criteria andIsPayOnceIn(List<Short> values) {
            addCriterion("is_pay_once in", values, "isPayOnce");
            return (Criteria) this;
        }

        public Criteria andIsPayOnceNotIn(List<Short> values) {
            addCriterion("is_pay_once not in", values, "isPayOnce");
            return (Criteria) this;
        }

        public Criteria andIsPayOnceBetween(Short value1, Short value2) {
            addCriterion("is_pay_once between", value1, value2, "isPayOnce");
            return (Criteria) this;
        }

        public Criteria andIsPayOnceNotBetween(Short value1, Short value2) {
            addCriterion("is_pay_once not between", value1, value2, "isPayOnce");
            return (Criteria) this;
        }

        public Criteria andTwoPushIsNull() {
            addCriterion("two_push is null");
            return (Criteria) this;
        }

        public Criteria andTwoPushIsNotNull() {
            addCriterion("two_push is not null");
            return (Criteria) this;
        }

        public Criteria andTwoPushEqualTo(String value) {
            addCriterion("two_push =", value, "twoPush");
            return (Criteria) this;
        }

        public Criteria andTwoPushNotEqualTo(String value) {
            addCriterion("two_push <>", value, "twoPush");
            return (Criteria) this;
        }

        public Criteria andTwoPushGreaterThan(String value) {
            addCriterion("two_push >", value, "twoPush");
            return (Criteria) this;
        }

        public Criteria andTwoPushGreaterThanOrEqualTo(String value) {
            addCriterion("two_push >=", value, "twoPush");
            return (Criteria) this;
        }

        public Criteria andTwoPushLessThan(String value) {
            addCriterion("two_push <", value, "twoPush");
            return (Criteria) this;
        }

        public Criteria andTwoPushLessThanOrEqualTo(String value) {
            addCriterion("two_push <=", value, "twoPush");
            return (Criteria) this;
        }

        public Criteria andTwoPushLike(String value) {
            addCriterion("two_push like", value, "twoPush");
            return (Criteria) this;
        }

        public Criteria andTwoPushNotLike(String value) {
            addCriterion("two_push not like", value, "twoPush");
            return (Criteria) this;
        }

        public Criteria andTwoPushIn(List<String> values) {
            addCriterion("two_push in", values, "twoPush");
            return (Criteria) this;
        }

        public Criteria andTwoPushNotIn(List<String> values) {
            addCriterion("two_push not in", values, "twoPush");
            return (Criteria) this;
        }

        public Criteria andTwoPushBetween(String value1, String value2) {
            addCriterion("two_push between", value1, value2, "twoPush");
            return (Criteria) this;
        }

        public Criteria andTwoPushNotBetween(String value1, String value2) {
            addCriterion("two_push not between", value1, value2, "twoPush");
            return (Criteria) this;
        }

        public Criteria andOnePushIsNull() {
            addCriterion("one_push is null");
            return (Criteria) this;
        }

        public Criteria andOnePushIsNotNull() {
            addCriterion("one_push is not null");
            return (Criteria) this;
        }

        public Criteria andOnePushEqualTo(String value) {
            addCriterion("one_push =", value, "onePush");
            return (Criteria) this;
        }

        public Criteria andOnePushNotEqualTo(String value) {
            addCriterion("one_push <>", value, "onePush");
            return (Criteria) this;
        }

        public Criteria andOnePushGreaterThan(String value) {
            addCriterion("one_push >", value, "onePush");
            return (Criteria) this;
        }

        public Criteria andOnePushGreaterThanOrEqualTo(String value) {
            addCriterion("one_push >=", value, "onePush");
            return (Criteria) this;
        }

        public Criteria andOnePushLessThan(String value) {
            addCriterion("one_push <", value, "onePush");
            return (Criteria) this;
        }

        public Criteria andOnePushLessThanOrEqualTo(String value) {
            addCriterion("one_push <=", value, "onePush");
            return (Criteria) this;
        }

        public Criteria andOnePushLike(String value) {
            addCriterion("one_push like", value, "onePush");
            return (Criteria) this;
        }

        public Criteria andOnePushNotLike(String value) {
            addCriterion("one_push not like", value, "onePush");
            return (Criteria) this;
        }

        public Criteria andOnePushIn(List<String> values) {
            addCriterion("one_push in", values, "onePush");
            return (Criteria) this;
        }

        public Criteria andOnePushNotIn(List<String> values) {
            addCriterion("one_push not in", values, "onePush");
            return (Criteria) this;
        }

        public Criteria andOnePushBetween(String value1, String value2) {
            addCriterion("one_push between", value1, value2, "onePush");
            return (Criteria) this;
        }

        public Criteria andOnePushNotBetween(String value1, String value2) {
            addCriterion("one_push not between", value1, value2, "onePush");
            return (Criteria) this;
        }

        public Criteria andGiftListsIsNull() {
            addCriterion("gift_lists is null");
            return (Criteria) this;
        }

        public Criteria andGiftListsIsNotNull() {
            addCriterion("gift_lists is not null");
            return (Criteria) this;
        }

        public Criteria andGiftListsEqualTo(String value) {
            addCriterion("gift_lists =", value, "giftLists");
            return (Criteria) this;
        }

        public Criteria andGiftListsNotEqualTo(String value) {
            addCriterion("gift_lists <>", value, "giftLists");
            return (Criteria) this;
        }

        public Criteria andGiftListsGreaterThan(String value) {
            addCriterion("gift_lists >", value, "giftLists");
            return (Criteria) this;
        }

        public Criteria andGiftListsGreaterThanOrEqualTo(String value) {
            addCriterion("gift_lists >=", value, "giftLists");
            return (Criteria) this;
        }

        public Criteria andGiftListsLessThan(String value) {
            addCriterion("gift_lists <", value, "giftLists");
            return (Criteria) this;
        }

        public Criteria andGiftListsLessThanOrEqualTo(String value) {
            addCriterion("gift_lists <=", value, "giftLists");
            return (Criteria) this;
        }

        public Criteria andGiftListsLike(String value) {
            addCriterion("gift_lists like", value, "giftLists");
            return (Criteria) this;
        }

        public Criteria andGiftListsNotLike(String value) {
            addCriterion("gift_lists not like", value, "giftLists");
            return (Criteria) this;
        }

        public Criteria andGiftListsIn(List<String> values) {
            addCriterion("gift_lists in", values, "giftLists");
            return (Criteria) this;
        }

        public Criteria andGiftListsNotIn(List<String> values) {
            addCriterion("gift_lists not in", values, "giftLists");
            return (Criteria) this;
        }

        public Criteria andGiftListsBetween(String value1, String value2) {
            addCriterion("gift_lists between", value1, value2, "giftLists");
            return (Criteria) this;
        }

        public Criteria andGiftListsNotBetween(String value1, String value2) {
            addCriterion("gift_lists not between", value1, value2, "giftLists");
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

        public Criteria andBuyDeductionPointIsNull() {
            addCriterion("buy_deduction_point is null");
            return (Criteria) this;
        }

        public Criteria andBuyDeductionPointIsNotNull() {
            addCriterion("buy_deduction_point is not null");
            return (Criteria) this;
        }

        public Criteria andBuyDeductionPointEqualTo(Integer value) {
            addCriterion("buy_deduction_point =", value, "buyDeductionPoint");
            return (Criteria) this;
        }

        public Criteria andBuyDeductionPointNotEqualTo(Integer value) {
            addCriterion("buy_deduction_point <>", value, "buyDeductionPoint");
            return (Criteria) this;
        }

        public Criteria andBuyDeductionPointGreaterThan(Integer value) {
            addCriterion("buy_deduction_point >", value, "buyDeductionPoint");
            return (Criteria) this;
        }

        public Criteria andBuyDeductionPointGreaterThanOrEqualTo(Integer value) {
            addCriterion("buy_deduction_point >=", value, "buyDeductionPoint");
            return (Criteria) this;
        }

        public Criteria andBuyDeductionPointLessThan(Integer value) {
            addCriterion("buy_deduction_point <", value, "buyDeductionPoint");
            return (Criteria) this;
        }

        public Criteria andBuyDeductionPointLessThanOrEqualTo(Integer value) {
            addCriterion("buy_deduction_point <=", value, "buyDeductionPoint");
            return (Criteria) this;
        }

        public Criteria andBuyDeductionPointIn(List<Integer> values) {
            addCriterion("buy_deduction_point in", values, "buyDeductionPoint");
            return (Criteria) this;
        }

        public Criteria andBuyDeductionPointNotIn(List<Integer> values) {
            addCriterion("buy_deduction_point not in", values, "buyDeductionPoint");
            return (Criteria) this;
        }

        public Criteria andBuyDeductionPointBetween(Integer value1, Integer value2) {
            addCriterion("buy_deduction_point between", value1, value2, "buyDeductionPoint");
            return (Criteria) this;
        }

        public Criteria andBuyDeductionPointNotBetween(Integer value1, Integer value2) {
            addCriterion("buy_deduction_point not between", value1, value2, "buyDeductionPoint");
            return (Criteria) this;
        }

        public Criteria andBuyGiveSharePointIsNull() {
            addCriterion("buy_give_share_point is null");
            return (Criteria) this;
        }

        public Criteria andBuyGiveSharePointIsNotNull() {
            addCriterion("buy_give_share_point is not null");
            return (Criteria) this;
        }

        public Criteria andBuyGiveSharePointEqualTo(Integer value) {
            addCriterion("buy_give_share_point =", value, "buyGiveSharePoint");
            return (Criteria) this;
        }

        public Criteria andBuyGiveSharePointNotEqualTo(Integer value) {
            addCriterion("buy_give_share_point <>", value, "buyGiveSharePoint");
            return (Criteria) this;
        }

        public Criteria andBuyGiveSharePointGreaterThan(Integer value) {
            addCriterion("buy_give_share_point >", value, "buyGiveSharePoint");
            return (Criteria) this;
        }

        public Criteria andBuyGiveSharePointGreaterThanOrEqualTo(Integer value) {
            addCriterion("buy_give_share_point >=", value, "buyGiveSharePoint");
            return (Criteria) this;
        }

        public Criteria andBuyGiveSharePointLessThan(Integer value) {
            addCriterion("buy_give_share_point <", value, "buyGiveSharePoint");
            return (Criteria) this;
        }

        public Criteria andBuyGiveSharePointLessThanOrEqualTo(Integer value) {
            addCriterion("buy_give_share_point <=", value, "buyGiveSharePoint");
            return (Criteria) this;
        }

        public Criteria andBuyGiveSharePointIn(List<Integer> values) {
            addCriterion("buy_give_share_point in", values, "buyGiveSharePoint");
            return (Criteria) this;
        }

        public Criteria andBuyGiveSharePointNotIn(List<Integer> values) {
            addCriterion("buy_give_share_point not in", values, "buyGiveSharePoint");
            return (Criteria) this;
        }

        public Criteria andBuyGiveSharePointBetween(Integer value1, Integer value2) {
            addCriterion("buy_give_share_point between", value1, value2, "buyGiveSharePoint");
            return (Criteria) this;
        }

        public Criteria andBuyGiveSharePointNotBetween(Integer value1, Integer value2) {
            addCriterion("buy_give_share_point not between", value1, value2, "buyGiveSharePoint");
            return (Criteria) this;
        }

        public Criteria andPayLevelListsIsNull() {
            addCriterion("pay_level_lists is null");
            return (Criteria) this;
        }

        public Criteria andPayLevelListsIsNotNull() {
            addCriterion("pay_level_lists is not null");
            return (Criteria) this;
        }

        public Criteria andPayLevelListsEqualTo(Float value) {
            addCriterion("pay_level_lists =", value, "payLevelLists");
            return (Criteria) this;
        }

        public Criteria andPayLevelListsNotEqualTo(Float value) {
            addCriterion("pay_level_lists <>", value, "payLevelLists");
            return (Criteria) this;
        }

        public Criteria andPayLevelListsGreaterThan(Float value) {
            addCriterion("pay_level_lists >", value, "payLevelLists");
            return (Criteria) this;
        }

        public Criteria andPayLevelListsGreaterThanOrEqualTo(Float value) {
            addCriterion("pay_level_lists >=", value, "payLevelLists");
            return (Criteria) this;
        }

        public Criteria andPayLevelListsLessThan(Float value) {
            addCriterion("pay_level_lists <", value, "payLevelLists");
            return (Criteria) this;
        }

        public Criteria andPayLevelListsLessThanOrEqualTo(Float value) {
            addCriterion("pay_level_lists <=", value, "payLevelLists");
            return (Criteria) this;
        }

        public Criteria andPayLevelListsIn(List<Float> values) {
            addCriterion("pay_level_lists in", values, "payLevelLists");
            return (Criteria) this;
        }

        public Criteria andPayLevelListsNotIn(List<Float> values) {
            addCriterion("pay_level_lists not in", values, "payLevelLists");
            return (Criteria) this;
        }

        public Criteria andPayLevelListsBetween(Float value1, Float value2) {
            addCriterion("pay_level_lists between", value1, value2, "payLevelLists");
            return (Criteria) this;
        }

        public Criteria andPayLevelListsNotBetween(Float value1, Float value2) {
            addCriterion("pay_level_lists not between", value1, value2, "payLevelLists");
            return (Criteria) this;
        }

        public Criteria andReviewGivePointIsNull() {
            addCriterion("review_give_point is null");
            return (Criteria) this;
        }

        public Criteria andReviewGivePointIsNotNull() {
            addCriterion("review_give_point is not null");
            return (Criteria) this;
        }

        public Criteria andReviewGivePointEqualTo(Integer value) {
            addCriterion("review_give_point =", value, "reviewGivePoint");
            return (Criteria) this;
        }

        public Criteria andReviewGivePointNotEqualTo(Integer value) {
            addCriterion("review_give_point <>", value, "reviewGivePoint");
            return (Criteria) this;
        }

        public Criteria andReviewGivePointGreaterThan(Integer value) {
            addCriterion("review_give_point >", value, "reviewGivePoint");
            return (Criteria) this;
        }

        public Criteria andReviewGivePointGreaterThanOrEqualTo(Integer value) {
            addCriterion("review_give_point >=", value, "reviewGivePoint");
            return (Criteria) this;
        }

        public Criteria andReviewGivePointLessThan(Integer value) {
            addCriterion("review_give_point <", value, "reviewGivePoint");
            return (Criteria) this;
        }

        public Criteria andReviewGivePointLessThanOrEqualTo(Integer value) {
            addCriterion("review_give_point <=", value, "reviewGivePoint");
            return (Criteria) this;
        }

        public Criteria andReviewGivePointIn(List<Integer> values) {
            addCriterion("review_give_point in", values, "reviewGivePoint");
            return (Criteria) this;
        }

        public Criteria andReviewGivePointNotIn(List<Integer> values) {
            addCriterion("review_give_point not in", values, "reviewGivePoint");
            return (Criteria) this;
        }

        public Criteria andReviewGivePointBetween(Integer value1, Integer value2) {
            addCriterion("review_give_point between", value1, value2, "reviewGivePoint");
            return (Criteria) this;
        }

        public Criteria andReviewGivePointNotBetween(Integer value1, Integer value2) {
            addCriterion("review_give_point not between", value1, value2, "reviewGivePoint");
            return (Criteria) this;
        }

        public Criteria andPintuanParamsIsNull() {
            addCriterion("pintuan_params is null");
            return (Criteria) this;
        }

        public Criteria andPintuanParamsIsNotNull() {
            addCriterion("pintuan_params is not null");
            return (Criteria) this;
        }

        public Criteria andPintuanParamsEqualTo(String value) {
            addCriterion("pintuan_params =", value, "pintuanParams");
            return (Criteria) this;
        }

        public Criteria andPintuanParamsNotEqualTo(String value) {
            addCriterion("pintuan_params <>", value, "pintuanParams");
            return (Criteria) this;
        }

        public Criteria andPintuanParamsGreaterThan(String value) {
            addCriterion("pintuan_params >", value, "pintuanParams");
            return (Criteria) this;
        }

        public Criteria andPintuanParamsGreaterThanOrEqualTo(String value) {
            addCriterion("pintuan_params >=", value, "pintuanParams");
            return (Criteria) this;
        }

        public Criteria andPintuanParamsLessThan(String value) {
            addCriterion("pintuan_params <", value, "pintuanParams");
            return (Criteria) this;
        }

        public Criteria andPintuanParamsLessThanOrEqualTo(String value) {
            addCriterion("pintuan_params <=", value, "pintuanParams");
            return (Criteria) this;
        }

        public Criteria andPintuanParamsLike(String value) {
            addCriterion("pintuan_params like", value, "pintuanParams");
            return (Criteria) this;
        }

        public Criteria andPintuanParamsNotLike(String value) {
            addCriterion("pintuan_params not like", value, "pintuanParams");
            return (Criteria) this;
        }

        public Criteria andPintuanParamsIn(List<String> values) {
            addCriterion("pintuan_params in", values, "pintuanParams");
            return (Criteria) this;
        }

        public Criteria andPintuanParamsNotIn(List<String> values) {
            addCriterion("pintuan_params not in", values, "pintuanParams");
            return (Criteria) this;
        }

        public Criteria andPintuanParamsBetween(String value1, String value2) {
            addCriterion("pintuan_params between", value1, value2, "pintuanParams");
            return (Criteria) this;
        }

        public Criteria andPintuanParamsNotBetween(String value1, String value2) {
            addCriterion("pintuan_params not between", value1, value2, "pintuanParams");
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

        public Criteria andImgPintuanIsNull() {
            addCriterion("img_pintuan is null");
            return (Criteria) this;
        }

        public Criteria andImgPintuanIsNotNull() {
            addCriterion("img_pintuan is not null");
            return (Criteria) this;
        }

        public Criteria andImgPintuanEqualTo(String value) {
            addCriterion("img_pintuan =", value, "imgPintuan");
            return (Criteria) this;
        }

        public Criteria andImgPintuanNotEqualTo(String value) {
            addCriterion("img_pintuan <>", value, "imgPintuan");
            return (Criteria) this;
        }

        public Criteria andImgPintuanGreaterThan(String value) {
            addCriterion("img_pintuan >", value, "imgPintuan");
            return (Criteria) this;
        }

        public Criteria andImgPintuanGreaterThanOrEqualTo(String value) {
            addCriterion("img_pintuan >=", value, "imgPintuan");
            return (Criteria) this;
        }

        public Criteria andImgPintuanLessThan(String value) {
            addCriterion("img_pintuan <", value, "imgPintuan");
            return (Criteria) this;
        }

        public Criteria andImgPintuanLessThanOrEqualTo(String value) {
            addCriterion("img_pintuan <=", value, "imgPintuan");
            return (Criteria) this;
        }

        public Criteria andImgPintuanLike(String value) {
            addCriterion("img_pintuan like", value, "imgPintuan");
            return (Criteria) this;
        }

        public Criteria andImgPintuanNotLike(String value) {
            addCriterion("img_pintuan not like", value, "imgPintuan");
            return (Criteria) this;
        }

        public Criteria andImgPintuanIn(List<String> values) {
            addCriterion("img_pintuan in", values, "imgPintuan");
            return (Criteria) this;
        }

        public Criteria andImgPintuanNotIn(List<String> values) {
            addCriterion("img_pintuan not in", values, "imgPintuan");
            return (Criteria) this;
        }

        public Criteria andImgPintuanBetween(String value1, String value2) {
            addCriterion("img_pintuan between", value1, value2, "imgPintuan");
            return (Criteria) this;
        }

        public Criteria andImgPintuanNotBetween(String value1, String value2) {
            addCriterion("img_pintuan not between", value1, value2, "imgPintuan");
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

        public Criteria andEdittimeIsNull() {
            addCriterion("edittime is null");
            return (Criteria) this;
        }

        public Criteria andEdittimeIsNotNull() {
            addCriterion("edittime is not null");
            return (Criteria) this;
        }

        public Criteria andEdittimeEqualTo(Integer value) {
            addCriterion("edittime =", value, "edittime");
            return (Criteria) this;
        }

        public Criteria andEdittimeNotEqualTo(Integer value) {
            addCriterion("edittime <>", value, "edittime");
            return (Criteria) this;
        }

        public Criteria andEdittimeGreaterThan(Integer value) {
            addCriterion("edittime >", value, "edittime");
            return (Criteria) this;
        }

        public Criteria andEdittimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("edittime >=", value, "edittime");
            return (Criteria) this;
        }

        public Criteria andEdittimeLessThan(Integer value) {
            addCriterion("edittime <", value, "edittime");
            return (Criteria) this;
        }

        public Criteria andEdittimeLessThanOrEqualTo(Integer value) {
            addCriterion("edittime <=", value, "edittime");
            return (Criteria) this;
        }

        public Criteria andEdittimeIn(List<Integer> values) {
            addCriterion("edittime in", values, "edittime");
            return (Criteria) this;
        }

        public Criteria andEdittimeNotIn(List<Integer> values) {
            addCriterion("edittime not in", values, "edittime");
            return (Criteria) this;
        }

        public Criteria andEdittimeBetween(Integer value1, Integer value2) {
            addCriterion("edittime between", value1, value2, "edittime");
            return (Criteria) this;
        }

        public Criteria andEdittimeNotBetween(Integer value1, Integer value2) {
            addCriterion("edittime not between", value1, value2, "edittime");
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

        public Criteria andWarehouseIdsIsNull() {
            addCriterion("warehouse_ids is null");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdsIsNotNull() {
            addCriterion("warehouse_ids is not null");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdsEqualTo(String value) {
            addCriterion("warehouse_ids =", value, "warehouseIds");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdsNotEqualTo(String value) {
            addCriterion("warehouse_ids <>", value, "warehouseIds");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdsGreaterThan(String value) {
            addCriterion("warehouse_ids >", value, "warehouseIds");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdsGreaterThanOrEqualTo(String value) {
            addCriterion("warehouse_ids >=", value, "warehouseIds");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdsLessThan(String value) {
            addCriterion("warehouse_ids <", value, "warehouseIds");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdsLessThanOrEqualTo(String value) {
            addCriterion("warehouse_ids <=", value, "warehouseIds");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdsLike(String value) {
            addCriterion("warehouse_ids like", value, "warehouseIds");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdsNotLike(String value) {
            addCriterion("warehouse_ids not like", value, "warehouseIds");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdsIn(List<String> values) {
            addCriterion("warehouse_ids in", values, "warehouseIds");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdsNotIn(List<String> values) {
            addCriterion("warehouse_ids not in", values, "warehouseIds");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdsBetween(String value1, String value2) {
            addCriterion("warehouse_ids between", value1, value2, "warehouseIds");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdsNotBetween(String value1, String value2) {
            addCriterion("warehouse_ids not between", value1, value2, "warehouseIds");
            return (Criteria) this;
        }

        public Criteria andKuaidiIdsIsNull() {
            addCriterion("kuaidi_ids is null");
            return (Criteria) this;
        }

        public Criteria andKuaidiIdsIsNotNull() {
            addCriterion("kuaidi_ids is not null");
            return (Criteria) this;
        }

        public Criteria andKuaidiIdsEqualTo(String value) {
            addCriterion("kuaidi_ids =", value, "kuaidiIds");
            return (Criteria) this;
        }

        public Criteria andKuaidiIdsNotEqualTo(String value) {
            addCriterion("kuaidi_ids <>", value, "kuaidiIds");
            return (Criteria) this;
        }

        public Criteria andKuaidiIdsGreaterThan(String value) {
            addCriterion("kuaidi_ids >", value, "kuaidiIds");
            return (Criteria) this;
        }

        public Criteria andKuaidiIdsGreaterThanOrEqualTo(String value) {
            addCriterion("kuaidi_ids >=", value, "kuaidiIds");
            return (Criteria) this;
        }

        public Criteria andKuaidiIdsLessThan(String value) {
            addCriterion("kuaidi_ids <", value, "kuaidiIds");
            return (Criteria) this;
        }

        public Criteria andKuaidiIdsLessThanOrEqualTo(String value) {
            addCriterion("kuaidi_ids <=", value, "kuaidiIds");
            return (Criteria) this;
        }

        public Criteria andKuaidiIdsLike(String value) {
            addCriterion("kuaidi_ids like", value, "kuaidiIds");
            return (Criteria) this;
        }

        public Criteria andKuaidiIdsNotLike(String value) {
            addCriterion("kuaidi_ids not like", value, "kuaidiIds");
            return (Criteria) this;
        }

        public Criteria andKuaidiIdsIn(List<String> values) {
            addCriterion("kuaidi_ids in", values, "kuaidiIds");
            return (Criteria) this;
        }

        public Criteria andKuaidiIdsNotIn(List<String> values) {
            addCriterion("kuaidi_ids not in", values, "kuaidiIds");
            return (Criteria) this;
        }

        public Criteria andKuaidiIdsBetween(String value1, String value2) {
            addCriterion("kuaidi_ids between", value1, value2, "kuaidiIds");
            return (Criteria) this;
        }

        public Criteria andKuaidiIdsNotBetween(String value1, String value2) {
            addCriterion("kuaidi_ids not between", value1, value2, "kuaidiIds");
            return (Criteria) this;
        }

        public Criteria andSupplierIdIsNull() {
            addCriterion("supplier_id is null");
            return (Criteria) this;
        }

        public Criteria andSupplierIdIsNotNull() {
            addCriterion("supplier_id is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierIdEqualTo(Integer value) {
            addCriterion("supplier_id =", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdNotEqualTo(Integer value) {
            addCriterion("supplier_id <>", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdGreaterThan(Integer value) {
            addCriterion("supplier_id >", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("supplier_id >=", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdLessThan(Integer value) {
            addCriterion("supplier_id <", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdLessThanOrEqualTo(Integer value) {
            addCriterion("supplier_id <=", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdIn(List<Integer> values) {
            addCriterion("supplier_id in", values, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdNotIn(List<Integer> values) {
            addCriterion("supplier_id not in", values, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdBetween(Integer value1, Integer value2) {
            addCriterion("supplier_id between", value1, value2, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdNotBetween(Integer value1, Integer value2) {
            addCriterion("supplier_id not between", value1, value2, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplyPriceIsNull() {
            addCriterion("supply_price is null");
            return (Criteria) this;
        }

        public Criteria andSupplyPriceIsNotNull() {
            addCriterion("supply_price is not null");
            return (Criteria) this;
        }

        public Criteria andSupplyPriceEqualTo(BigDecimal value) {
            addCriterion("supply_price =", value, "supplyPrice");
            return (Criteria) this;
        }

        public Criteria andSupplyPriceNotEqualTo(BigDecimal value) {
            addCriterion("supply_price <>", value, "supplyPrice");
            return (Criteria) this;
        }

        public Criteria andSupplyPriceGreaterThan(BigDecimal value) {
            addCriterion("supply_price >", value, "supplyPrice");
            return (Criteria) this;
        }

        public Criteria andSupplyPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("supply_price >=", value, "supplyPrice");
            return (Criteria) this;
        }

        public Criteria andSupplyPriceLessThan(BigDecimal value) {
            addCriterion("supply_price <", value, "supplyPrice");
            return (Criteria) this;
        }

        public Criteria andSupplyPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("supply_price <=", value, "supplyPrice");
            return (Criteria) this;
        }

        public Criteria andSupplyPriceIn(List<BigDecimal> values) {
            addCriterion("supply_price in", values, "supplyPrice");
            return (Criteria) this;
        }

        public Criteria andSupplyPriceNotIn(List<BigDecimal> values) {
            addCriterion("supply_price not in", values, "supplyPrice");
            return (Criteria) this;
        }

        public Criteria andSupplyPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("supply_price between", value1, value2, "supplyPrice");
            return (Criteria) this;
        }

        public Criteria andSupplyPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("supply_price not between", value1, value2, "supplyPrice");
            return (Criteria) this;
        }

        public Criteria andIsTopIsNull() {
            addCriterion("is_top is null");
            return (Criteria) this;
        }

        public Criteria andIsTopIsNotNull() {
            addCriterion("is_top is not null");
            return (Criteria) this;
        }

        public Criteria andIsTopEqualTo(Byte value) {
            addCriterion("is_top =", value, "isTop");
            return (Criteria) this;
        }

        public Criteria andIsTopNotEqualTo(Byte value) {
            addCriterion("is_top <>", value, "isTop");
            return (Criteria) this;
        }

        public Criteria andIsTopGreaterThan(Byte value) {
            addCriterion("is_top >", value, "isTop");
            return (Criteria) this;
        }

        public Criteria andIsTopGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_top >=", value, "isTop");
            return (Criteria) this;
        }

        public Criteria andIsTopLessThan(Byte value) {
            addCriterion("is_top <", value, "isTop");
            return (Criteria) this;
        }

        public Criteria andIsTopLessThanOrEqualTo(Byte value) {
            addCriterion("is_top <=", value, "isTop");
            return (Criteria) this;
        }

        public Criteria andIsTopIn(List<Byte> values) {
            addCriterion("is_top in", values, "isTop");
            return (Criteria) this;
        }

        public Criteria andIsTopNotIn(List<Byte> values) {
            addCriterion("is_top not in", values, "isTop");
            return (Criteria) this;
        }

        public Criteria andIsTopBetween(Byte value1, Byte value2) {
            addCriterion("is_top between", value1, value2, "isTop");
            return (Criteria) this;
        }

        public Criteria andIsTopNotBetween(Byte value1, Byte value2) {
            addCriterion("is_top not between", value1, value2, "isTop");
            return (Criteria) this;
        }

        public Criteria andGivePointsIsNull() {
            addCriterion("give_points is null");
            return (Criteria) this;
        }

        public Criteria andGivePointsIsNotNull() {
            addCriterion("give_points is not null");
            return (Criteria) this;
        }

        public Criteria andGivePointsEqualTo(Integer value) {
            addCriterion("give_points =", value, "givePoints");
            return (Criteria) this;
        }

        public Criteria andGivePointsNotEqualTo(Integer value) {
            addCriterion("give_points <>", value, "givePoints");
            return (Criteria) this;
        }

        public Criteria andGivePointsGreaterThan(Integer value) {
            addCriterion("give_points >", value, "givePoints");
            return (Criteria) this;
        }

        public Criteria andGivePointsGreaterThanOrEqualTo(Integer value) {
            addCriterion("give_points >=", value, "givePoints");
            return (Criteria) this;
        }

        public Criteria andGivePointsLessThan(Integer value) {
            addCriterion("give_points <", value, "givePoints");
            return (Criteria) this;
        }

        public Criteria andGivePointsLessThanOrEqualTo(Integer value) {
            addCriterion("give_points <=", value, "givePoints");
            return (Criteria) this;
        }

        public Criteria andGivePointsIn(List<Integer> values) {
            addCriterion("give_points in", values, "givePoints");
            return (Criteria) this;
        }

        public Criteria andGivePointsNotIn(List<Integer> values) {
            addCriterion("give_points not in", values, "givePoints");
            return (Criteria) this;
        }

        public Criteria andGivePointsBetween(Integer value1, Integer value2) {
            addCriterion("give_points between", value1, value2, "givePoints");
            return (Criteria) this;
        }

        public Criteria andGivePointsNotBetween(Integer value1, Integer value2) {
            addCriterion("give_points not between", value1, value2, "givePoints");
            return (Criteria) this;
        }

        public Criteria andClickCountIsNull() {
            addCriterion("click_count is null");
            return (Criteria) this;
        }

        public Criteria andClickCountIsNotNull() {
            addCriterion("click_count is not null");
            return (Criteria) this;
        }

        public Criteria andClickCountEqualTo(Integer value) {
            addCriterion("click_count =", value, "clickCount");
            return (Criteria) this;
        }

        public Criteria andClickCountNotEqualTo(Integer value) {
            addCriterion("click_count <>", value, "clickCount");
            return (Criteria) this;
        }

        public Criteria andClickCountGreaterThan(Integer value) {
            addCriterion("click_count >", value, "clickCount");
            return (Criteria) this;
        }

        public Criteria andClickCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("click_count >=", value, "clickCount");
            return (Criteria) this;
        }

        public Criteria andClickCountLessThan(Integer value) {
            addCriterion("click_count <", value, "clickCount");
            return (Criteria) this;
        }

        public Criteria andClickCountLessThanOrEqualTo(Integer value) {
            addCriterion("click_count <=", value, "clickCount");
            return (Criteria) this;
        }

        public Criteria andClickCountIn(List<Integer> values) {
            addCriterion("click_count in", values, "clickCount");
            return (Criteria) this;
        }

        public Criteria andClickCountNotIn(List<Integer> values) {
            addCriterion("click_count not in", values, "clickCount");
            return (Criteria) this;
        }

        public Criteria andClickCountBetween(Integer value1, Integer value2) {
            addCriterion("click_count between", value1, value2, "clickCount");
            return (Criteria) this;
        }

        public Criteria andClickCountNotBetween(Integer value1, Integer value2) {
            addCriterion("click_count not between", value1, value2, "clickCount");
            return (Criteria) this;
        }

        public Criteria andIsPromoteQmIsNull() {
            addCriterion("is_promote_qm is null");
            return (Criteria) this;
        }

        public Criteria andIsPromoteQmIsNotNull() {
            addCriterion("is_promote_qm is not null");
            return (Criteria) this;
        }

        public Criteria andIsPromoteQmEqualTo(Byte value) {
            addCriterion("is_promote_qm =", value, "isPromoteQm");
            return (Criteria) this;
        }

        public Criteria andIsPromoteQmNotEqualTo(Byte value) {
            addCriterion("is_promote_qm <>", value, "isPromoteQm");
            return (Criteria) this;
        }

        public Criteria andIsPromoteQmGreaterThan(Byte value) {
            addCriterion("is_promote_qm >", value, "isPromoteQm");
            return (Criteria) this;
        }

        public Criteria andIsPromoteQmGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_promote_qm >=", value, "isPromoteQm");
            return (Criteria) this;
        }

        public Criteria andIsPromoteQmLessThan(Byte value) {
            addCriterion("is_promote_qm <", value, "isPromoteQm");
            return (Criteria) this;
        }

        public Criteria andIsPromoteQmLessThanOrEqualTo(Byte value) {
            addCriterion("is_promote_qm <=", value, "isPromoteQm");
            return (Criteria) this;
        }

        public Criteria andIsPromoteQmIn(List<Byte> values) {
            addCriterion("is_promote_qm in", values, "isPromoteQm");
            return (Criteria) this;
        }

        public Criteria andIsPromoteQmNotIn(List<Byte> values) {
            addCriterion("is_promote_qm not in", values, "isPromoteQm");
            return (Criteria) this;
        }

        public Criteria andIsPromoteQmBetween(Byte value1, Byte value2) {
            addCriterion("is_promote_qm between", value1, value2, "isPromoteQm");
            return (Criteria) this;
        }

        public Criteria andIsPromoteQmNotBetween(Byte value1, Byte value2) {
            addCriterion("is_promote_qm not between", value1, value2, "isPromoteQm");
            return (Criteria) this;
        }

        public Criteria andImgDetailIsNull() {
            addCriterion("img_detail is null");
            return (Criteria) this;
        }

        public Criteria andImgDetailIsNotNull() {
            addCriterion("img_detail is not null");
            return (Criteria) this;
        }

        public Criteria andImgDetailEqualTo(String value) {
            addCriterion("img_detail =", value, "imgDetail");
            return (Criteria) this;
        }

        public Criteria andImgDetailNotEqualTo(String value) {
            addCriterion("img_detail <>", value, "imgDetail");
            return (Criteria) this;
        }

        public Criteria andImgDetailGreaterThan(String value) {
            addCriterion("img_detail >", value, "imgDetail");
            return (Criteria) this;
        }

        public Criteria andImgDetailGreaterThanOrEqualTo(String value) {
            addCriterion("img_detail >=", value, "imgDetail");
            return (Criteria) this;
        }

        public Criteria andImgDetailLessThan(String value) {
            addCriterion("img_detail <", value, "imgDetail");
            return (Criteria) this;
        }

        public Criteria andImgDetailLessThanOrEqualTo(String value) {
            addCriterion("img_detail <=", value, "imgDetail");
            return (Criteria) this;
        }

        public Criteria andImgDetailLike(String value) {
            addCriterion("img_detail like", value, "imgDetail");
            return (Criteria) this;
        }

        public Criteria andImgDetailNotLike(String value) {
            addCriterion("img_detail not like", value, "imgDetail");
            return (Criteria) this;
        }

        public Criteria andImgDetailIn(List<String> values) {
            addCriterion("img_detail in", values, "imgDetail");
            return (Criteria) this;
        }

        public Criteria andImgDetailNotIn(List<String> values) {
            addCriterion("img_detail not in", values, "imgDetail");
            return (Criteria) this;
        }

        public Criteria andImgDetailBetween(String value1, String value2) {
            addCriterion("img_detail between", value1, value2, "imgDetail");
            return (Criteria) this;
        }

        public Criteria andImgDetailNotBetween(String value1, String value2) {
            addCriterion("img_detail not between", value1, value2, "imgDetail");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusIsNull() {
            addCriterion("goods_status is null");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusIsNotNull() {
            addCriterion("goods_status is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusEqualTo(String value) {
            addCriterion("goods_status =", value, "goodsStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusNotEqualTo(String value) {
            addCriterion("goods_status <>", value, "goodsStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusGreaterThan(String value) {
            addCriterion("goods_status >", value, "goodsStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusGreaterThanOrEqualTo(String value) {
            addCriterion("goods_status >=", value, "goodsStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusLessThan(String value) {
            addCriterion("goods_status <", value, "goodsStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusLessThanOrEqualTo(String value) {
            addCriterion("goods_status <=", value, "goodsStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusLike(String value) {
            addCriterion("goods_status like", value, "goodsStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusNotLike(String value) {
            addCriterion("goods_status not like", value, "goodsStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusIn(List<String> values) {
            addCriterion("goods_status in", values, "goodsStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusNotIn(List<String> values) {
            addCriterion("goods_status not in", values, "goodsStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusBetween(String value1, String value2) {
            addCriterion("goods_status between", value1, value2, "goodsStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusNotBetween(String value1, String value2) {
            addCriterion("goods_status not between", value1, value2, "goodsStatus");
            return (Criteria) this;
        }

        public Criteria andKfUrlIsNull() {
            addCriterion("kf_url is null");
            return (Criteria) this;
        }

        public Criteria andKfUrlIsNotNull() {
            addCriterion("kf_url is not null");
            return (Criteria) this;
        }

        public Criteria andKfUrlEqualTo(String value) {
            addCriterion("kf_url =", value, "kfUrl");
            return (Criteria) this;
        }

        public Criteria andKfUrlNotEqualTo(String value) {
            addCriterion("kf_url <>", value, "kfUrl");
            return (Criteria) this;
        }

        public Criteria andKfUrlGreaterThan(String value) {
            addCriterion("kf_url >", value, "kfUrl");
            return (Criteria) this;
        }

        public Criteria andKfUrlGreaterThanOrEqualTo(String value) {
            addCriterion("kf_url >=", value, "kfUrl");
            return (Criteria) this;
        }

        public Criteria andKfUrlLessThan(String value) {
            addCriterion("kf_url <", value, "kfUrl");
            return (Criteria) this;
        }

        public Criteria andKfUrlLessThanOrEqualTo(String value) {
            addCriterion("kf_url <=", value, "kfUrl");
            return (Criteria) this;
        }

        public Criteria andKfUrlLike(String value) {
            addCriterion("kf_url like", value, "kfUrl");
            return (Criteria) this;
        }

        public Criteria andKfUrlNotLike(String value) {
            addCriterion("kf_url not like", value, "kfUrl");
            return (Criteria) this;
        }

        public Criteria andKfUrlIn(List<String> values) {
            addCriterion("kf_url in", values, "kfUrl");
            return (Criteria) this;
        }

        public Criteria andKfUrlNotIn(List<String> values) {
            addCriterion("kf_url not in", values, "kfUrl");
            return (Criteria) this;
        }

        public Criteria andKfUrlBetween(String value1, String value2) {
            addCriterion("kf_url between", value1, value2, "kfUrl");
            return (Criteria) this;
        }

        public Criteria andKfUrlNotBetween(String value1, String value2) {
            addCriterion("kf_url not between", value1, value2, "kfUrl");
            return (Criteria) this;
        }

        public Criteria andIndextplIdIsNull() {
            addCriterion("indextpl_id is null");
            return (Criteria) this;
        }

        public Criteria andIndextplIdIsNotNull() {
            addCriterion("indextpl_id is not null");
            return (Criteria) this;
        }

        public Criteria andIndextplIdEqualTo(Integer value) {
            addCriterion("indextpl_id =", value, "indextplId");
            return (Criteria) this;
        }

        public Criteria andIndextplIdNotEqualTo(Integer value) {
            addCriterion("indextpl_id <>", value, "indextplId");
            return (Criteria) this;
        }

        public Criteria andIndextplIdGreaterThan(Integer value) {
            addCriterion("indextpl_id >", value, "indextplId");
            return (Criteria) this;
        }

        public Criteria andIndextplIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("indextpl_id >=", value, "indextplId");
            return (Criteria) this;
        }

        public Criteria andIndextplIdLessThan(Integer value) {
            addCriterion("indextpl_id <", value, "indextplId");
            return (Criteria) this;
        }

        public Criteria andIndextplIdLessThanOrEqualTo(Integer value) {
            addCriterion("indextpl_id <=", value, "indextplId");
            return (Criteria) this;
        }

        public Criteria andIndextplIdIn(List<Integer> values) {
            addCriterion("indextpl_id in", values, "indextplId");
            return (Criteria) this;
        }

        public Criteria andIndextplIdNotIn(List<Integer> values) {
            addCriterion("indextpl_id not in", values, "indextplId");
            return (Criteria) this;
        }

        public Criteria andIndextplIdBetween(Integer value1, Integer value2) {
            addCriterion("indextpl_id between", value1, value2, "indextplId");
            return (Criteria) this;
        }

        public Criteria andIndextplIdNotBetween(Integer value1, Integer value2) {
            addCriterion("indextpl_id not between", value1, value2, "indextplId");
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