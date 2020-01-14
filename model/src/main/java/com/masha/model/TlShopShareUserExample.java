package com.masha.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class TlShopShareUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TlShopShareUserExample() {
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

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNull() {
            addCriterion("parent_id is null");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNotNull() {
            addCriterion("parent_id is not null");
            return (Criteria) this;
        }

        public Criteria andParentIdEqualTo(Integer value) {
            addCriterion("parent_id =", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotEqualTo(Integer value) {
            addCriterion("parent_id <>", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThan(Integer value) {
            addCriterion("parent_id >", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("parent_id >=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThan(Integer value) {
            addCriterion("parent_id <", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThanOrEqualTo(Integer value) {
            addCriterion("parent_id <=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdIn(List<Integer> values) {
            addCriterion("parent_id in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotIn(List<Integer> values) {
            addCriterion("parent_id not in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdBetween(Integer value1, Integer value2) {
            addCriterion("parent_id between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("parent_id not between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdsIsNull() {
            addCriterion("parent_ids is null");
            return (Criteria) this;
        }

        public Criteria andParentIdsIsNotNull() {
            addCriterion("parent_ids is not null");
            return (Criteria) this;
        }

        public Criteria andParentIdsEqualTo(String value) {
            addCriterion("parent_ids =", value, "parentIds");
            return (Criteria) this;
        }

        public Criteria andParentIdsNotEqualTo(String value) {
            addCriterion("parent_ids <>", value, "parentIds");
            return (Criteria) this;
        }

        public Criteria andParentIdsGreaterThan(String value) {
            addCriterion("parent_ids >", value, "parentIds");
            return (Criteria) this;
        }

        public Criteria andParentIdsGreaterThanOrEqualTo(String value) {
            addCriterion("parent_ids >=", value, "parentIds");
            return (Criteria) this;
        }

        public Criteria andParentIdsLessThan(String value) {
            addCriterion("parent_ids <", value, "parentIds");
            return (Criteria) this;
        }

        public Criteria andParentIdsLessThanOrEqualTo(String value) {
            addCriterion("parent_ids <=", value, "parentIds");
            return (Criteria) this;
        }

        public Criteria andParentIdsLike(String value) {
            addCriterion("parent_ids like", value, "parentIds");
            return (Criteria) this;
        }

        public Criteria andParentIdsNotLike(String value) {
            addCriterion("parent_ids not like", value, "parentIds");
            return (Criteria) this;
        }

        public Criteria andParentIdsIn(List<String> values) {
            addCriterion("parent_ids in", values, "parentIds");
            return (Criteria) this;
        }

        public Criteria andParentIdsNotIn(List<String> values) {
            addCriterion("parent_ids not in", values, "parentIds");
            return (Criteria) this;
        }

        public Criteria andParentIdsBetween(String value1, String value2) {
            addCriterion("parent_ids between", value1, value2, "parentIds");
            return (Criteria) this;
        }

        public Criteria andParentIdsNotBetween(String value1, String value2) {
            addCriterion("parent_ids not between", value1, value2, "parentIds");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andIsEmailCheckIsNull() {
            addCriterion("is_email_check is null");
            return (Criteria) this;
        }

        public Criteria andIsEmailCheckIsNotNull() {
            addCriterion("is_email_check is not null");
            return (Criteria) this;
        }

        public Criteria andIsEmailCheckEqualTo(Integer value) {
            addCriterion("is_email_check =", value, "isEmailCheck");
            return (Criteria) this;
        }

        public Criteria andIsEmailCheckNotEqualTo(Integer value) {
            addCriterion("is_email_check <>", value, "isEmailCheck");
            return (Criteria) this;
        }

        public Criteria andIsEmailCheckGreaterThan(Integer value) {
            addCriterion("is_email_check >", value, "isEmailCheck");
            return (Criteria) this;
        }

        public Criteria andIsEmailCheckGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_email_check >=", value, "isEmailCheck");
            return (Criteria) this;
        }

        public Criteria andIsEmailCheckLessThan(Integer value) {
            addCriterion("is_email_check <", value, "isEmailCheck");
            return (Criteria) this;
        }

        public Criteria andIsEmailCheckLessThanOrEqualTo(Integer value) {
            addCriterion("is_email_check <=", value, "isEmailCheck");
            return (Criteria) this;
        }

        public Criteria andIsEmailCheckIn(List<Integer> values) {
            addCriterion("is_email_check in", values, "isEmailCheck");
            return (Criteria) this;
        }

        public Criteria andIsEmailCheckNotIn(List<Integer> values) {
            addCriterion("is_email_check not in", values, "isEmailCheck");
            return (Criteria) this;
        }

        public Criteria andIsEmailCheckBetween(Integer value1, Integer value2) {
            addCriterion("is_email_check between", value1, value2, "isEmailCheck");
            return (Criteria) this;
        }

        public Criteria andIsEmailCheckNotBetween(Integer value1, Integer value2) {
            addCriterion("is_email_check not between", value1, value2, "isEmailCheck");
            return (Criteria) this;
        }

        public Criteria andPathIdIsNull() {
            addCriterion("path_id is null");
            return (Criteria) this;
        }

        public Criteria andPathIdIsNotNull() {
            addCriterion("path_id is not null");
            return (Criteria) this;
        }

        public Criteria andPathIdEqualTo(String value) {
            addCriterion("path_id =", value, "pathId");
            return (Criteria) this;
        }

        public Criteria andPathIdNotEqualTo(String value) {
            addCriterion("path_id <>", value, "pathId");
            return (Criteria) this;
        }

        public Criteria andPathIdGreaterThan(String value) {
            addCriterion("path_id >", value, "pathId");
            return (Criteria) this;
        }

        public Criteria andPathIdGreaterThanOrEqualTo(String value) {
            addCriterion("path_id >=", value, "pathId");
            return (Criteria) this;
        }

        public Criteria andPathIdLessThan(String value) {
            addCriterion("path_id <", value, "pathId");
            return (Criteria) this;
        }

        public Criteria andPathIdLessThanOrEqualTo(String value) {
            addCriterion("path_id <=", value, "pathId");
            return (Criteria) this;
        }

        public Criteria andPathIdLike(String value) {
            addCriterion("path_id like", value, "pathId");
            return (Criteria) this;
        }

        public Criteria andPathIdNotLike(String value) {
            addCriterion("path_id not like", value, "pathId");
            return (Criteria) this;
        }

        public Criteria andPathIdIn(List<String> values) {
            addCriterion("path_id in", values, "pathId");
            return (Criteria) this;
        }

        public Criteria andPathIdNotIn(List<String> values) {
            addCriterion("path_id not in", values, "pathId");
            return (Criteria) this;
        }

        public Criteria andPathIdBetween(String value1, String value2) {
            addCriterion("path_id between", value1, value2, "pathId");
            return (Criteria) this;
        }

        public Criteria andPathIdNotBetween(String value1, String value2) {
            addCriterion("path_id not between", value1, value2, "pathId");
            return (Criteria) this;
        }

        public Criteria andPointCpsIsNull() {
            addCriterion("point_cps is null");
            return (Criteria) this;
        }

        public Criteria andPointCpsIsNotNull() {
            addCriterion("point_cps is not null");
            return (Criteria) this;
        }

        public Criteria andPointCpsEqualTo(Integer value) {
            addCriterion("point_cps =", value, "pointCps");
            return (Criteria) this;
        }

        public Criteria andPointCpsNotEqualTo(Integer value) {
            addCriterion("point_cps <>", value, "pointCps");
            return (Criteria) this;
        }

        public Criteria andPointCpsGreaterThan(Integer value) {
            addCriterion("point_cps >", value, "pointCps");
            return (Criteria) this;
        }

        public Criteria andPointCpsGreaterThanOrEqualTo(Integer value) {
            addCriterion("point_cps >=", value, "pointCps");
            return (Criteria) this;
        }

        public Criteria andPointCpsLessThan(Integer value) {
            addCriterion("point_cps <", value, "pointCps");
            return (Criteria) this;
        }

        public Criteria andPointCpsLessThanOrEqualTo(Integer value) {
            addCriterion("point_cps <=", value, "pointCps");
            return (Criteria) this;
        }

        public Criteria andPointCpsIn(List<Integer> values) {
            addCriterion("point_cps in", values, "pointCps");
            return (Criteria) this;
        }

        public Criteria andPointCpsNotIn(List<Integer> values) {
            addCriterion("point_cps not in", values, "pointCps");
            return (Criteria) this;
        }

        public Criteria andPointCpsBetween(Integer value1, Integer value2) {
            addCriterion("point_cps between", value1, value2, "pointCps");
            return (Criteria) this;
        }

        public Criteria andPointCpsNotBetween(Integer value1, Integer value2) {
            addCriterion("point_cps not between", value1, value2, "pointCps");
            return (Criteria) this;
        }

        public Criteria andQccodeIsNull() {
            addCriterion("qccode is null");
            return (Criteria) this;
        }

        public Criteria andQccodeIsNotNull() {
            addCriterion("qccode is not null");
            return (Criteria) this;
        }

        public Criteria andQccodeEqualTo(String value) {
            addCriterion("qccode =", value, "qccode");
            return (Criteria) this;
        }

        public Criteria andQccodeNotEqualTo(String value) {
            addCriterion("qccode <>", value, "qccode");
            return (Criteria) this;
        }

        public Criteria andQccodeGreaterThan(String value) {
            addCriterion("qccode >", value, "qccode");
            return (Criteria) this;
        }

        public Criteria andQccodeGreaterThanOrEqualTo(String value) {
            addCriterion("qccode >=", value, "qccode");
            return (Criteria) this;
        }

        public Criteria andQccodeLessThan(String value) {
            addCriterion("qccode <", value, "qccode");
            return (Criteria) this;
        }

        public Criteria andQccodeLessThanOrEqualTo(String value) {
            addCriterion("qccode <=", value, "qccode");
            return (Criteria) this;
        }

        public Criteria andQccodeLike(String value) {
            addCriterion("qccode like", value, "qccode");
            return (Criteria) this;
        }

        public Criteria andQccodeNotLike(String value) {
            addCriterion("qccode not like", value, "qccode");
            return (Criteria) this;
        }

        public Criteria andQccodeIn(List<String> values) {
            addCriterion("qccode in", values, "qccode");
            return (Criteria) this;
        }

        public Criteria andQccodeNotIn(List<String> values) {
            addCriterion("qccode not in", values, "qccode");
            return (Criteria) this;
        }

        public Criteria andQccodeBetween(String value1, String value2) {
            addCriterion("qccode between", value1, value2, "qccode");
            return (Criteria) this;
        }

        public Criteria andQccodeNotBetween(String value1, String value2) {
            addCriterion("qccode not between", value1, value2, "qccode");
            return (Criteria) this;
        }

        public Criteria andTruenameIsNull() {
            addCriterion("truename is null");
            return (Criteria) this;
        }

        public Criteria andTruenameIsNotNull() {
            addCriterion("truename is not null");
            return (Criteria) this;
        }

        public Criteria andTruenameEqualTo(String value) {
            addCriterion("truename =", value, "truename");
            return (Criteria) this;
        }

        public Criteria andTruenameNotEqualTo(String value) {
            addCriterion("truename <>", value, "truename");
            return (Criteria) this;
        }

        public Criteria andTruenameGreaterThan(String value) {
            addCriterion("truename >", value, "truename");
            return (Criteria) this;
        }

        public Criteria andTruenameGreaterThanOrEqualTo(String value) {
            addCriterion("truename >=", value, "truename");
            return (Criteria) this;
        }

        public Criteria andTruenameLessThan(String value) {
            addCriterion("truename <", value, "truename");
            return (Criteria) this;
        }

        public Criteria andTruenameLessThanOrEqualTo(String value) {
            addCriterion("truename <=", value, "truename");
            return (Criteria) this;
        }

        public Criteria andTruenameLike(String value) {
            addCriterion("truename like", value, "truename");
            return (Criteria) this;
        }

        public Criteria andTruenameNotLike(String value) {
            addCriterion("truename not like", value, "truename");
            return (Criteria) this;
        }

        public Criteria andTruenameIn(List<String> values) {
            addCriterion("truename in", values, "truename");
            return (Criteria) this;
        }

        public Criteria andTruenameNotIn(List<String> values) {
            addCriterion("truename not in", values, "truename");
            return (Criteria) this;
        }

        public Criteria andTruenameBetween(String value1, String value2) {
            addCriterion("truename between", value1, value2, "truename");
            return (Criteria) this;
        }

        public Criteria andTruenameNotBetween(String value1, String value2) {
            addCriterion("truename not between", value1, value2, "truename");
            return (Criteria) this;
        }

        public Criteria andTenpayIsNull() {
            addCriterion("tenpay is null");
            return (Criteria) this;
        }

        public Criteria andTenpayIsNotNull() {
            addCriterion("tenpay is not null");
            return (Criteria) this;
        }

        public Criteria andTenpayEqualTo(String value) {
            addCriterion("tenpay =", value, "tenpay");
            return (Criteria) this;
        }

        public Criteria andTenpayNotEqualTo(String value) {
            addCriterion("tenpay <>", value, "tenpay");
            return (Criteria) this;
        }

        public Criteria andTenpayGreaterThan(String value) {
            addCriterion("tenpay >", value, "tenpay");
            return (Criteria) this;
        }

        public Criteria andTenpayGreaterThanOrEqualTo(String value) {
            addCriterion("tenpay >=", value, "tenpay");
            return (Criteria) this;
        }

        public Criteria andTenpayLessThan(String value) {
            addCriterion("tenpay <", value, "tenpay");
            return (Criteria) this;
        }

        public Criteria andTenpayLessThanOrEqualTo(String value) {
            addCriterion("tenpay <=", value, "tenpay");
            return (Criteria) this;
        }

        public Criteria andTenpayLike(String value) {
            addCriterion("tenpay like", value, "tenpay");
            return (Criteria) this;
        }

        public Criteria andTenpayNotLike(String value) {
            addCriterion("tenpay not like", value, "tenpay");
            return (Criteria) this;
        }

        public Criteria andTenpayIn(List<String> values) {
            addCriterion("tenpay in", values, "tenpay");
            return (Criteria) this;
        }

        public Criteria andTenpayNotIn(List<String> values) {
            addCriterion("tenpay not in", values, "tenpay");
            return (Criteria) this;
        }

        public Criteria andTenpayBetween(String value1, String value2) {
            addCriterion("tenpay between", value1, value2, "tenpay");
            return (Criteria) this;
        }

        public Criteria andTenpayNotBetween(String value1, String value2) {
            addCriterion("tenpay not between", value1, value2, "tenpay");
            return (Criteria) this;
        }

        public Criteria andAlipayIsNull() {
            addCriterion("alipay is null");
            return (Criteria) this;
        }

        public Criteria andAlipayIsNotNull() {
            addCriterion("alipay is not null");
            return (Criteria) this;
        }

        public Criteria andAlipayEqualTo(String value) {
            addCriterion("alipay =", value, "alipay");
            return (Criteria) this;
        }

        public Criteria andAlipayNotEqualTo(String value) {
            addCriterion("alipay <>", value, "alipay");
            return (Criteria) this;
        }

        public Criteria andAlipayGreaterThan(String value) {
            addCriterion("alipay >", value, "alipay");
            return (Criteria) this;
        }

        public Criteria andAlipayGreaterThanOrEqualTo(String value) {
            addCriterion("alipay >=", value, "alipay");
            return (Criteria) this;
        }

        public Criteria andAlipayLessThan(String value) {
            addCriterion("alipay <", value, "alipay");
            return (Criteria) this;
        }

        public Criteria andAlipayLessThanOrEqualTo(String value) {
            addCriterion("alipay <=", value, "alipay");
            return (Criteria) this;
        }

        public Criteria andAlipayLike(String value) {
            addCriterion("alipay like", value, "alipay");
            return (Criteria) this;
        }

        public Criteria andAlipayNotLike(String value) {
            addCriterion("alipay not like", value, "alipay");
            return (Criteria) this;
        }

        public Criteria andAlipayIn(List<String> values) {
            addCriterion("alipay in", values, "alipay");
            return (Criteria) this;
        }

        public Criteria andAlipayNotIn(List<String> values) {
            addCriterion("alipay not in", values, "alipay");
            return (Criteria) this;
        }

        public Criteria andAlipayBetween(String value1, String value2) {
            addCriterion("alipay between", value1, value2, "alipay");
            return (Criteria) this;
        }

        public Criteria andAlipayNotBetween(String value1, String value2) {
            addCriterion("alipay not between", value1, value2, "alipay");
            return (Criteria) this;
        }

        public Criteria andShenfenzhengIsNull() {
            addCriterion("shenfenzheng is null");
            return (Criteria) this;
        }

        public Criteria andShenfenzhengIsNotNull() {
            addCriterion("shenfenzheng is not null");
            return (Criteria) this;
        }

        public Criteria andShenfenzhengEqualTo(String value) {
            addCriterion("shenfenzheng =", value, "shenfenzheng");
            return (Criteria) this;
        }

        public Criteria andShenfenzhengNotEqualTo(String value) {
            addCriterion("shenfenzheng <>", value, "shenfenzheng");
            return (Criteria) this;
        }

        public Criteria andShenfenzhengGreaterThan(String value) {
            addCriterion("shenfenzheng >", value, "shenfenzheng");
            return (Criteria) this;
        }

        public Criteria andShenfenzhengGreaterThanOrEqualTo(String value) {
            addCriterion("shenfenzheng >=", value, "shenfenzheng");
            return (Criteria) this;
        }

        public Criteria andShenfenzhengLessThan(String value) {
            addCriterion("shenfenzheng <", value, "shenfenzheng");
            return (Criteria) this;
        }

        public Criteria andShenfenzhengLessThanOrEqualTo(String value) {
            addCriterion("shenfenzheng <=", value, "shenfenzheng");
            return (Criteria) this;
        }

        public Criteria andShenfenzhengLike(String value) {
            addCriterion("shenfenzheng like", value, "shenfenzheng");
            return (Criteria) this;
        }

        public Criteria andShenfenzhengNotLike(String value) {
            addCriterion("shenfenzheng not like", value, "shenfenzheng");
            return (Criteria) this;
        }

        public Criteria andShenfenzhengIn(List<String> values) {
            addCriterion("shenfenzheng in", values, "shenfenzheng");
            return (Criteria) this;
        }

        public Criteria andShenfenzhengNotIn(List<String> values) {
            addCriterion("shenfenzheng not in", values, "shenfenzheng");
            return (Criteria) this;
        }

        public Criteria andShenfenzhengBetween(String value1, String value2) {
            addCriterion("shenfenzheng between", value1, value2, "shenfenzheng");
            return (Criteria) this;
        }

        public Criteria andShenfenzhengNotBetween(String value1, String value2) {
            addCriterion("shenfenzheng not between", value1, value2, "shenfenzheng");
            return (Criteria) this;
        }

        public Criteria andQqIsNull() {
            addCriterion("qq is null");
            return (Criteria) this;
        }

        public Criteria andQqIsNotNull() {
            addCriterion("qq is not null");
            return (Criteria) this;
        }

        public Criteria andQqEqualTo(String value) {
            addCriterion("qq =", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotEqualTo(String value) {
            addCriterion("qq <>", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqGreaterThan(String value) {
            addCriterion("qq >", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqGreaterThanOrEqualTo(String value) {
            addCriterion("qq >=", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLessThan(String value) {
            addCriterion("qq <", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLessThanOrEqualTo(String value) {
            addCriterion("qq <=", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLike(String value) {
            addCriterion("qq like", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotLike(String value) {
            addCriterion("qq not like", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqIn(List<String> values) {
            addCriterion("qq in", values, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotIn(List<String> values) {
            addCriterion("qq not in", values, "qq");
            return (Criteria) this;
        }

        public Criteria andQqBetween(String value1, String value2) {
            addCriterion("qq between", value1, value2, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotBetween(String value1, String value2) {
            addCriterion("qq not between", value1, value2, "qq");
            return (Criteria) this;
        }

        public Criteria andWxNumIsNull() {
            addCriterion("wx_num is null");
            return (Criteria) this;
        }

        public Criteria andWxNumIsNotNull() {
            addCriterion("wx_num is not null");
            return (Criteria) this;
        }

        public Criteria andWxNumEqualTo(String value) {
            addCriterion("wx_num =", value, "wxNum");
            return (Criteria) this;
        }

        public Criteria andWxNumNotEqualTo(String value) {
            addCriterion("wx_num <>", value, "wxNum");
            return (Criteria) this;
        }

        public Criteria andWxNumGreaterThan(String value) {
            addCriterion("wx_num >", value, "wxNum");
            return (Criteria) this;
        }

        public Criteria andWxNumGreaterThanOrEqualTo(String value) {
            addCriterion("wx_num >=", value, "wxNum");
            return (Criteria) this;
        }

        public Criteria andWxNumLessThan(String value) {
            addCriterion("wx_num <", value, "wxNum");
            return (Criteria) this;
        }

        public Criteria andWxNumLessThanOrEqualTo(String value) {
            addCriterion("wx_num <=", value, "wxNum");
            return (Criteria) this;
        }

        public Criteria andWxNumLike(String value) {
            addCriterion("wx_num like", value, "wxNum");
            return (Criteria) this;
        }

        public Criteria andWxNumNotLike(String value) {
            addCriterion("wx_num not like", value, "wxNum");
            return (Criteria) this;
        }

        public Criteria andWxNumIn(List<String> values) {
            addCriterion("wx_num in", values, "wxNum");
            return (Criteria) this;
        }

        public Criteria andWxNumNotIn(List<String> values) {
            addCriterion("wx_num not in", values, "wxNum");
            return (Criteria) this;
        }

        public Criteria andWxNumBetween(String value1, String value2) {
            addCriterion("wx_num between", value1, value2, "wxNum");
            return (Criteria) this;
        }

        public Criteria andWxNumNotBetween(String value1, String value2) {
            addCriterion("wx_num not between", value1, value2, "wxNum");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNull() {
            addCriterion("birthday is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNotNull() {
            addCriterion("birthday is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayEqualTo(String value) {
            addCriterion("birthday =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(String value) {
            addCriterion("birthday <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(String value) {
            addCriterion("birthday >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(String value) {
            addCriterion("birthday >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(String value) {
            addCriterion("birthday <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(String value) {
            addCriterion("birthday <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLike(String value) {
            addCriterion("birthday like", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotLike(String value) {
            addCriterion("birthday not like", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<String> values) {
            addCriterion("birthday in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<String> values) {
            addCriterion("birthday not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(String value1, String value2) {
            addCriterion("birthday between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(String value1, String value2) {
            addCriterion("birthday not between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andPointIsNull() {
            addCriterion("point is null");
            return (Criteria) this;
        }

        public Criteria andPointIsNotNull() {
            addCriterion("point is not null");
            return (Criteria) this;
        }

        public Criteria andPointEqualTo(Integer value) {
            addCriterion("point =", value, "point");
            return (Criteria) this;
        }

        public Criteria andPointNotEqualTo(Integer value) {
            addCriterion("point <>", value, "point");
            return (Criteria) this;
        }

        public Criteria andPointGreaterThan(Integer value) {
            addCriterion("point >", value, "point");
            return (Criteria) this;
        }

        public Criteria andPointGreaterThanOrEqualTo(Integer value) {
            addCriterion("point >=", value, "point");
            return (Criteria) this;
        }

        public Criteria andPointLessThan(Integer value) {
            addCriterion("point <", value, "point");
            return (Criteria) this;
        }

        public Criteria andPointLessThanOrEqualTo(Integer value) {
            addCriterion("point <=", value, "point");
            return (Criteria) this;
        }

        public Criteria andPointIn(List<Integer> values) {
            addCriterion("point in", values, "point");
            return (Criteria) this;
        }

        public Criteria andPointNotIn(List<Integer> values) {
            addCriterion("point not in", values, "point");
            return (Criteria) this;
        }

        public Criteria andPointBetween(Integer value1, Integer value2) {
            addCriterion("point between", value1, value2, "point");
            return (Criteria) this;
        }

        public Criteria andPointNotBetween(Integer value1, Integer value2) {
            addCriterion("point not between", value1, value2, "point");
            return (Criteria) this;
        }

        public Criteria andPointAllIsNull() {
            addCriterion("point_all is null");
            return (Criteria) this;
        }

        public Criteria andPointAllIsNotNull() {
            addCriterion("point_all is not null");
            return (Criteria) this;
        }

        public Criteria andPointAllEqualTo(Integer value) {
            addCriterion("point_all =", value, "pointAll");
            return (Criteria) this;
        }

        public Criteria andPointAllNotEqualTo(Integer value) {
            addCriterion("point_all <>", value, "pointAll");
            return (Criteria) this;
        }

        public Criteria andPointAllGreaterThan(Integer value) {
            addCriterion("point_all >", value, "pointAll");
            return (Criteria) this;
        }

        public Criteria andPointAllGreaterThanOrEqualTo(Integer value) {
            addCriterion("point_all >=", value, "pointAll");
            return (Criteria) this;
        }

        public Criteria andPointAllLessThan(Integer value) {
            addCriterion("point_all <", value, "pointAll");
            return (Criteria) this;
        }

        public Criteria andPointAllLessThanOrEqualTo(Integer value) {
            addCriterion("point_all <=", value, "pointAll");
            return (Criteria) this;
        }

        public Criteria andPointAllIn(List<Integer> values) {
            addCriterion("point_all in", values, "pointAll");
            return (Criteria) this;
        }

        public Criteria andPointAllNotIn(List<Integer> values) {
            addCriterion("point_all not in", values, "pointAll");
            return (Criteria) this;
        }

        public Criteria andPointAllBetween(Integer value1, Integer value2) {
            addCriterion("point_all between", value1, value2, "pointAll");
            return (Criteria) this;
        }

        public Criteria andPointAllNotBetween(Integer value1, Integer value2) {
            addCriterion("point_all not between", value1, value2, "pointAll");
            return (Criteria) this;
        }

        public Criteria andCashIsNull() {
            addCriterion("cash is null");
            return (Criteria) this;
        }

        public Criteria andCashIsNotNull() {
            addCriterion("cash is not null");
            return (Criteria) this;
        }

        public Criteria andCashEqualTo(BigDecimal value) {
            addCriterion("cash =", value, "cash");
            return (Criteria) this;
        }

        public Criteria andCashNotEqualTo(BigDecimal value) {
            addCriterion("cash <>", value, "cash");
            return (Criteria) this;
        }

        public Criteria andCashGreaterThan(BigDecimal value) {
            addCriterion("cash >", value, "cash");
            return (Criteria) this;
        }

        public Criteria andCashGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("cash >=", value, "cash");
            return (Criteria) this;
        }

        public Criteria andCashLessThan(BigDecimal value) {
            addCriterion("cash <", value, "cash");
            return (Criteria) this;
        }

        public Criteria andCashLessThanOrEqualTo(BigDecimal value) {
            addCriterion("cash <=", value, "cash");
            return (Criteria) this;
        }

        public Criteria andCashIn(List<BigDecimal> values) {
            addCriterion("cash in", values, "cash");
            return (Criteria) this;
        }

        public Criteria andCashNotIn(List<BigDecimal> values) {
            addCriterion("cash not in", values, "cash");
            return (Criteria) this;
        }

        public Criteria andCashBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cash between", value1, value2, "cash");
            return (Criteria) this;
        }

        public Criteria andCashNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cash not between", value1, value2, "cash");
            return (Criteria) this;
        }

        public Criteria andCountOrderfeeAllIsNull() {
            addCriterion("count_orderfee_all is null");
            return (Criteria) this;
        }

        public Criteria andCountOrderfeeAllIsNotNull() {
            addCriterion("count_orderfee_all is not null");
            return (Criteria) this;
        }

        public Criteria andCountOrderfeeAllEqualTo(BigDecimal value) {
            addCriterion("count_orderfee_all =", value, "countOrderfeeAll");
            return (Criteria) this;
        }

        public Criteria andCountOrderfeeAllNotEqualTo(BigDecimal value) {
            addCriterion("count_orderfee_all <>", value, "countOrderfeeAll");
            return (Criteria) this;
        }

        public Criteria andCountOrderfeeAllGreaterThan(BigDecimal value) {
            addCriterion("count_orderfee_all >", value, "countOrderfeeAll");
            return (Criteria) this;
        }

        public Criteria andCountOrderfeeAllGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("count_orderfee_all >=", value, "countOrderfeeAll");
            return (Criteria) this;
        }

        public Criteria andCountOrderfeeAllLessThan(BigDecimal value) {
            addCriterion("count_orderfee_all <", value, "countOrderfeeAll");
            return (Criteria) this;
        }

        public Criteria andCountOrderfeeAllLessThanOrEqualTo(BigDecimal value) {
            addCriterion("count_orderfee_all <=", value, "countOrderfeeAll");
            return (Criteria) this;
        }

        public Criteria andCountOrderfeeAllIn(List<BigDecimal> values) {
            addCriterion("count_orderfee_all in", values, "countOrderfeeAll");
            return (Criteria) this;
        }

        public Criteria andCountOrderfeeAllNotIn(List<BigDecimal> values) {
            addCriterion("count_orderfee_all not in", values, "countOrderfeeAll");
            return (Criteria) this;
        }

        public Criteria andCountOrderfeeAllBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("count_orderfee_all between", value1, value2, "countOrderfeeAll");
            return (Criteria) this;
        }

        public Criteria andCountOrderfeeAllNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("count_orderfee_all not between", value1, value2, "countOrderfeeAll");
            return (Criteria) this;
        }

        public Criteria andCountSharefeeAllIsNull() {
            addCriterion("count_sharefee_all is null");
            return (Criteria) this;
        }

        public Criteria andCountSharefeeAllIsNotNull() {
            addCriterion("count_sharefee_all is not null");
            return (Criteria) this;
        }

        public Criteria andCountSharefeeAllEqualTo(Long value) {
            addCriterion("count_sharefee_all =", value, "countSharefeeAll");
            return (Criteria) this;
        }

        public Criteria andCountSharefeeAllNotEqualTo(Long value) {
            addCriterion("count_sharefee_all <>", value, "countSharefeeAll");
            return (Criteria) this;
        }

        public Criteria andCountSharefeeAllGreaterThan(Long value) {
            addCriterion("count_sharefee_all >", value, "countSharefeeAll");
            return (Criteria) this;
        }

        public Criteria andCountSharefeeAllGreaterThanOrEqualTo(Long value) {
            addCriterion("count_sharefee_all >=", value, "countSharefeeAll");
            return (Criteria) this;
        }

        public Criteria andCountSharefeeAllLessThan(Long value) {
            addCriterion("count_sharefee_all <", value, "countSharefeeAll");
            return (Criteria) this;
        }

        public Criteria andCountSharefeeAllLessThanOrEqualTo(Long value) {
            addCriterion("count_sharefee_all <=", value, "countSharefeeAll");
            return (Criteria) this;
        }

        public Criteria andCountSharefeeAllIn(List<Long> values) {
            addCriterion("count_sharefee_all in", values, "countSharefeeAll");
            return (Criteria) this;
        }

        public Criteria andCountSharefeeAllNotIn(List<Long> values) {
            addCriterion("count_sharefee_all not in", values, "countSharefeeAll");
            return (Criteria) this;
        }

        public Criteria andCountSharefeeAllBetween(Long value1, Long value2) {
            addCriterion("count_sharefee_all between", value1, value2, "countSharefeeAll");
            return (Criteria) this;
        }

        public Criteria andCountSharefeeAllNotBetween(Long value1, Long value2) {
            addCriterion("count_sharefee_all not between", value1, value2, "countSharefeeAll");
            return (Criteria) this;
        }

        public Criteria andCountOrderfeeIsNull() {
            addCriterion("count_orderfee is null");
            return (Criteria) this;
        }

        public Criteria andCountOrderfeeIsNotNull() {
            addCriterion("count_orderfee is not null");
            return (Criteria) this;
        }

        public Criteria andCountOrderfeeEqualTo(BigDecimal value) {
            addCriterion("count_orderfee =", value, "countOrderfee");
            return (Criteria) this;
        }

        public Criteria andCountOrderfeeNotEqualTo(BigDecimal value) {
            addCriterion("count_orderfee <>", value, "countOrderfee");
            return (Criteria) this;
        }

        public Criteria andCountOrderfeeGreaterThan(BigDecimal value) {
            addCriterion("count_orderfee >", value, "countOrderfee");
            return (Criteria) this;
        }

        public Criteria andCountOrderfeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("count_orderfee >=", value, "countOrderfee");
            return (Criteria) this;
        }

        public Criteria andCountOrderfeeLessThan(BigDecimal value) {
            addCriterion("count_orderfee <", value, "countOrderfee");
            return (Criteria) this;
        }

        public Criteria andCountOrderfeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("count_orderfee <=", value, "countOrderfee");
            return (Criteria) this;
        }

        public Criteria andCountOrderfeeIn(List<BigDecimal> values) {
            addCriterion("count_orderfee in", values, "countOrderfee");
            return (Criteria) this;
        }

        public Criteria andCountOrderfeeNotIn(List<BigDecimal> values) {
            addCriterion("count_orderfee not in", values, "countOrderfee");
            return (Criteria) this;
        }

        public Criteria andCountOrderfeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("count_orderfee between", value1, value2, "countOrderfee");
            return (Criteria) this;
        }

        public Criteria andCountOrderfeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("count_orderfee not between", value1, value2, "countOrderfee");
            return (Criteria) this;
        }

        public Criteria andCountOrderPvIsNull() {
            addCriterion("count_order_pv is null");
            return (Criteria) this;
        }

        public Criteria andCountOrderPvIsNotNull() {
            addCriterion("count_order_pv is not null");
            return (Criteria) this;
        }

        public Criteria andCountOrderPvEqualTo(BigDecimal value) {
            addCriterion("count_order_pv =", value, "countOrderPv");
            return (Criteria) this;
        }

        public Criteria andCountOrderPvNotEqualTo(BigDecimal value) {
            addCriterion("count_order_pv <>", value, "countOrderPv");
            return (Criteria) this;
        }

        public Criteria andCountOrderPvGreaterThan(BigDecimal value) {
            addCriterion("count_order_pv >", value, "countOrderPv");
            return (Criteria) this;
        }

        public Criteria andCountOrderPvGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("count_order_pv >=", value, "countOrderPv");
            return (Criteria) this;
        }

        public Criteria andCountOrderPvLessThan(BigDecimal value) {
            addCriterion("count_order_pv <", value, "countOrderPv");
            return (Criteria) this;
        }

        public Criteria andCountOrderPvLessThanOrEqualTo(BigDecimal value) {
            addCriterion("count_order_pv <=", value, "countOrderPv");
            return (Criteria) this;
        }

        public Criteria andCountOrderPvIn(List<BigDecimal> values) {
            addCriterion("count_order_pv in", values, "countOrderPv");
            return (Criteria) this;
        }

        public Criteria andCountOrderPvNotIn(List<BigDecimal> values) {
            addCriterion("count_order_pv not in", values, "countOrderPv");
            return (Criteria) this;
        }

        public Criteria andCountOrderPvBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("count_order_pv between", value1, value2, "countOrderPv");
            return (Criteria) this;
        }

        public Criteria andCountOrderPvNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("count_order_pv not between", value1, value2, "countOrderPv");
            return (Criteria) this;
        }

        public Criteria andCashAllIsNull() {
            addCriterion("cash_all is null");
            return (Criteria) this;
        }

        public Criteria andCashAllIsNotNull() {
            addCriterion("cash_all is not null");
            return (Criteria) this;
        }

        public Criteria andCashAllEqualTo(BigDecimal value) {
            addCriterion("cash_all =", value, "cashAll");
            return (Criteria) this;
        }

        public Criteria andCashAllNotEqualTo(BigDecimal value) {
            addCriterion("cash_all <>", value, "cashAll");
            return (Criteria) this;
        }

        public Criteria andCashAllGreaterThan(BigDecimal value) {
            addCriterion("cash_all >", value, "cashAll");
            return (Criteria) this;
        }

        public Criteria andCashAllGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("cash_all >=", value, "cashAll");
            return (Criteria) this;
        }

        public Criteria andCashAllLessThan(BigDecimal value) {
            addCriterion("cash_all <", value, "cashAll");
            return (Criteria) this;
        }

        public Criteria andCashAllLessThanOrEqualTo(BigDecimal value) {
            addCriterion("cash_all <=", value, "cashAll");
            return (Criteria) this;
        }

        public Criteria andCashAllIn(List<BigDecimal> values) {
            addCriterion("cash_all in", values, "cashAll");
            return (Criteria) this;
        }

        public Criteria andCashAllNotIn(List<BigDecimal> values) {
            addCriterion("cash_all not in", values, "cashAll");
            return (Criteria) this;
        }

        public Criteria andCashAllBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cash_all between", value1, value2, "cashAll");
            return (Criteria) this;
        }

        public Criteria andCashAllNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cash_all not between", value1, value2, "cashAll");
            return (Criteria) this;
        }

        public Criteria andCountOrderIsNull() {
            addCriterion("count_order is null");
            return (Criteria) this;
        }

        public Criteria andCountOrderIsNotNull() {
            addCriterion("count_order is not null");
            return (Criteria) this;
        }

        public Criteria andCountOrderEqualTo(Integer value) {
            addCriterion("count_order =", value, "countOrder");
            return (Criteria) this;
        }

        public Criteria andCountOrderNotEqualTo(Integer value) {
            addCriterion("count_order <>", value, "countOrder");
            return (Criteria) this;
        }

        public Criteria andCountOrderGreaterThan(Integer value) {
            addCriterion("count_order >", value, "countOrder");
            return (Criteria) this;
        }

        public Criteria andCountOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("count_order >=", value, "countOrder");
            return (Criteria) this;
        }

        public Criteria andCountOrderLessThan(Integer value) {
            addCriterion("count_order <", value, "countOrder");
            return (Criteria) this;
        }

        public Criteria andCountOrderLessThanOrEqualTo(Integer value) {
            addCriterion("count_order <=", value, "countOrder");
            return (Criteria) this;
        }

        public Criteria andCountOrderIn(List<Integer> values) {
            addCriterion("count_order in", values, "countOrder");
            return (Criteria) this;
        }

        public Criteria andCountOrderNotIn(List<Integer> values) {
            addCriterion("count_order not in", values, "countOrder");
            return (Criteria) this;
        }

        public Criteria andCountOrderBetween(Integer value1, Integer value2) {
            addCriterion("count_order between", value1, value2, "countOrder");
            return (Criteria) this;
        }

        public Criteria andCountOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("count_order not between", value1, value2, "countOrder");
            return (Criteria) this;
        }

        public Criteria andCountAlluserIsNull() {
            addCriterion("count_alluser is null");
            return (Criteria) this;
        }

        public Criteria andCountAlluserIsNotNull() {
            addCriterion("count_alluser is not null");
            return (Criteria) this;
        }

        public Criteria andCountAlluserEqualTo(Integer value) {
            addCriterion("count_alluser =", value, "countAlluser");
            return (Criteria) this;
        }

        public Criteria andCountAlluserNotEqualTo(Integer value) {
            addCriterion("count_alluser <>", value, "countAlluser");
            return (Criteria) this;
        }

        public Criteria andCountAlluserGreaterThan(Integer value) {
            addCriterion("count_alluser >", value, "countAlluser");
            return (Criteria) this;
        }

        public Criteria andCountAlluserGreaterThanOrEqualTo(Integer value) {
            addCriterion("count_alluser >=", value, "countAlluser");
            return (Criteria) this;
        }

        public Criteria andCountAlluserLessThan(Integer value) {
            addCriterion("count_alluser <", value, "countAlluser");
            return (Criteria) this;
        }

        public Criteria andCountAlluserLessThanOrEqualTo(Integer value) {
            addCriterion("count_alluser <=", value, "countAlluser");
            return (Criteria) this;
        }

        public Criteria andCountAlluserIn(List<Integer> values) {
            addCriterion("count_alluser in", values, "countAlluser");
            return (Criteria) this;
        }

        public Criteria andCountAlluserNotIn(List<Integer> values) {
            addCriterion("count_alluser not in", values, "countAlluser");
            return (Criteria) this;
        }

        public Criteria andCountAlluserBetween(Integer value1, Integer value2) {
            addCriterion("count_alluser between", value1, value2, "countAlluser");
            return (Criteria) this;
        }

        public Criteria andCountAlluserNotBetween(Integer value1, Integer value2) {
            addCriterion("count_alluser not between", value1, value2, "countAlluser");
            return (Criteria) this;
        }

        public Criteria andCountVipuserIsNull() {
            addCriterion("count_vipuser is null");
            return (Criteria) this;
        }

        public Criteria andCountVipuserIsNotNull() {
            addCriterion("count_vipuser is not null");
            return (Criteria) this;
        }

        public Criteria andCountVipuserEqualTo(Integer value) {
            addCriterion("count_vipuser =", value, "countVipuser");
            return (Criteria) this;
        }

        public Criteria andCountVipuserNotEqualTo(Integer value) {
            addCriterion("count_vipuser <>", value, "countVipuser");
            return (Criteria) this;
        }

        public Criteria andCountVipuserGreaterThan(Integer value) {
            addCriterion("count_vipuser >", value, "countVipuser");
            return (Criteria) this;
        }

        public Criteria andCountVipuserGreaterThanOrEqualTo(Integer value) {
            addCriterion("count_vipuser >=", value, "countVipuser");
            return (Criteria) this;
        }

        public Criteria andCountVipuserLessThan(Integer value) {
            addCriterion("count_vipuser <", value, "countVipuser");
            return (Criteria) this;
        }

        public Criteria andCountVipuserLessThanOrEqualTo(Integer value) {
            addCriterion("count_vipuser <=", value, "countVipuser");
            return (Criteria) this;
        }

        public Criteria andCountVipuserIn(List<Integer> values) {
            addCriterion("count_vipuser in", values, "countVipuser");
            return (Criteria) this;
        }

        public Criteria andCountVipuserNotIn(List<Integer> values) {
            addCriterion("count_vipuser not in", values, "countVipuser");
            return (Criteria) this;
        }

        public Criteria andCountVipuserBetween(Integer value1, Integer value2) {
            addCriterion("count_vipuser between", value1, value2, "countVipuser");
            return (Criteria) this;
        }

        public Criteria andCountVipuserNotBetween(Integer value1, Integer value2) {
            addCriterion("count_vipuser not between", value1, value2, "countVipuser");
            return (Criteria) this;
        }

        public Criteria andCountComuserIsNull() {
            addCriterion("count_comuser is null");
            return (Criteria) this;
        }

        public Criteria andCountComuserIsNotNull() {
            addCriterion("count_comuser is not null");
            return (Criteria) this;
        }

        public Criteria andCountComuserEqualTo(Integer value) {
            addCriterion("count_comuser =", value, "countComuser");
            return (Criteria) this;
        }

        public Criteria andCountComuserNotEqualTo(Integer value) {
            addCriterion("count_comuser <>", value, "countComuser");
            return (Criteria) this;
        }

        public Criteria andCountComuserGreaterThan(Integer value) {
            addCriterion("count_comuser >", value, "countComuser");
            return (Criteria) this;
        }

        public Criteria andCountComuserGreaterThanOrEqualTo(Integer value) {
            addCriterion("count_comuser >=", value, "countComuser");
            return (Criteria) this;
        }

        public Criteria andCountComuserLessThan(Integer value) {
            addCriterion("count_comuser <", value, "countComuser");
            return (Criteria) this;
        }

        public Criteria andCountComuserLessThanOrEqualTo(Integer value) {
            addCriterion("count_comuser <=", value, "countComuser");
            return (Criteria) this;
        }

        public Criteria andCountComuserIn(List<Integer> values) {
            addCriterion("count_comuser in", values, "countComuser");
            return (Criteria) this;
        }

        public Criteria andCountComuserNotIn(List<Integer> values) {
            addCriterion("count_comuser not in", values, "countComuser");
            return (Criteria) this;
        }

        public Criteria andCountComuserBetween(Integer value1, Integer value2) {
            addCriterion("count_comuser between", value1, value2, "countComuser");
            return (Criteria) this;
        }

        public Criteria andCountComuserNotBetween(Integer value1, Integer value2) {
            addCriterion("count_comuser not between", value1, value2, "countComuser");
            return (Criteria) this;
        }

        public Criteria andCountUserClickIsNull() {
            addCriterion("count_user_click is null");
            return (Criteria) this;
        }

        public Criteria andCountUserClickIsNotNull() {
            addCriterion("count_user_click is not null");
            return (Criteria) this;
        }

        public Criteria andCountUserClickEqualTo(Integer value) {
            addCriterion("count_user_click =", value, "countUserClick");
            return (Criteria) this;
        }

        public Criteria andCountUserClickNotEqualTo(Integer value) {
            addCriterion("count_user_click <>", value, "countUserClick");
            return (Criteria) this;
        }

        public Criteria andCountUserClickGreaterThan(Integer value) {
            addCriterion("count_user_click >", value, "countUserClick");
            return (Criteria) this;
        }

        public Criteria andCountUserClickGreaterThanOrEqualTo(Integer value) {
            addCriterion("count_user_click >=", value, "countUserClick");
            return (Criteria) this;
        }

        public Criteria andCountUserClickLessThan(Integer value) {
            addCriterion("count_user_click <", value, "countUserClick");
            return (Criteria) this;
        }

        public Criteria andCountUserClickLessThanOrEqualTo(Integer value) {
            addCriterion("count_user_click <=", value, "countUserClick");
            return (Criteria) this;
        }

        public Criteria andCountUserClickIn(List<Integer> values) {
            addCriterion("count_user_click in", values, "countUserClick");
            return (Criteria) this;
        }

        public Criteria andCountUserClickNotIn(List<Integer> values) {
            addCriterion("count_user_click not in", values, "countUserClick");
            return (Criteria) this;
        }

        public Criteria andCountUserClickBetween(Integer value1, Integer value2) {
            addCriterion("count_user_click between", value1, value2, "countUserClick");
            return (Criteria) this;
        }

        public Criteria andCountUserClickNotBetween(Integer value1, Integer value2) {
            addCriterion("count_user_click not between", value1, value2, "countUserClick");
            return (Criteria) this;
        }

        public Criteria andCountUserGuanzhuIsNull() {
            addCriterion("count_user_guanzhu is null");
            return (Criteria) this;
        }

        public Criteria andCountUserGuanzhuIsNotNull() {
            addCriterion("count_user_guanzhu is not null");
            return (Criteria) this;
        }

        public Criteria andCountUserGuanzhuEqualTo(Integer value) {
            addCriterion("count_user_guanzhu =", value, "countUserGuanzhu");
            return (Criteria) this;
        }

        public Criteria andCountUserGuanzhuNotEqualTo(Integer value) {
            addCriterion("count_user_guanzhu <>", value, "countUserGuanzhu");
            return (Criteria) this;
        }

        public Criteria andCountUserGuanzhuGreaterThan(Integer value) {
            addCriterion("count_user_guanzhu >", value, "countUserGuanzhu");
            return (Criteria) this;
        }

        public Criteria andCountUserGuanzhuGreaterThanOrEqualTo(Integer value) {
            addCriterion("count_user_guanzhu >=", value, "countUserGuanzhu");
            return (Criteria) this;
        }

        public Criteria andCountUserGuanzhuLessThan(Integer value) {
            addCriterion("count_user_guanzhu <", value, "countUserGuanzhu");
            return (Criteria) this;
        }

        public Criteria andCountUserGuanzhuLessThanOrEqualTo(Integer value) {
            addCriterion("count_user_guanzhu <=", value, "countUserGuanzhu");
            return (Criteria) this;
        }

        public Criteria andCountUserGuanzhuIn(List<Integer> values) {
            addCriterion("count_user_guanzhu in", values, "countUserGuanzhu");
            return (Criteria) this;
        }

        public Criteria andCountUserGuanzhuNotIn(List<Integer> values) {
            addCriterion("count_user_guanzhu not in", values, "countUserGuanzhu");
            return (Criteria) this;
        }

        public Criteria andCountUserGuanzhuBetween(Integer value1, Integer value2) {
            addCriterion("count_user_guanzhu between", value1, value2, "countUserGuanzhu");
            return (Criteria) this;
        }

        public Criteria andCountUserGuanzhuNotBetween(Integer value1, Integer value2) {
            addCriterion("count_user_guanzhu not between", value1, value2, "countUserGuanzhu");
            return (Criteria) this;
        }

        public Criteria andCountUserBuyIsNull() {
            addCriterion("count_user_buy is null");
            return (Criteria) this;
        }

        public Criteria andCountUserBuyIsNotNull() {
            addCriterion("count_user_buy is not null");
            return (Criteria) this;
        }

        public Criteria andCountUserBuyEqualTo(Integer value) {
            addCriterion("count_user_buy =", value, "countUserBuy");
            return (Criteria) this;
        }

        public Criteria andCountUserBuyNotEqualTo(Integer value) {
            addCriterion("count_user_buy <>", value, "countUserBuy");
            return (Criteria) this;
        }

        public Criteria andCountUserBuyGreaterThan(Integer value) {
            addCriterion("count_user_buy >", value, "countUserBuy");
            return (Criteria) this;
        }

        public Criteria andCountUserBuyGreaterThanOrEqualTo(Integer value) {
            addCriterion("count_user_buy >=", value, "countUserBuy");
            return (Criteria) this;
        }

        public Criteria andCountUserBuyLessThan(Integer value) {
            addCriterion("count_user_buy <", value, "countUserBuy");
            return (Criteria) this;
        }

        public Criteria andCountUserBuyLessThanOrEqualTo(Integer value) {
            addCriterion("count_user_buy <=", value, "countUserBuy");
            return (Criteria) this;
        }

        public Criteria andCountUserBuyIn(List<Integer> values) {
            addCriterion("count_user_buy in", values, "countUserBuy");
            return (Criteria) this;
        }

        public Criteria andCountUserBuyNotIn(List<Integer> values) {
            addCriterion("count_user_buy not in", values, "countUserBuy");
            return (Criteria) this;
        }

        public Criteria andCountUserBuyBetween(Integer value1, Integer value2) {
            addCriterion("count_user_buy between", value1, value2, "countUserBuy");
            return (Criteria) this;
        }

        public Criteria andCountUserBuyNotBetween(Integer value1, Integer value2) {
            addCriterion("count_user_buy not between", value1, value2, "countUserBuy");
            return (Criteria) this;
        }

        public Criteria andCountYiwanchengFenxiaoIsNull() {
            addCriterion("count_yiwancheng_fenxiao is null");
            return (Criteria) this;
        }

        public Criteria andCountYiwanchengFenxiaoIsNotNull() {
            addCriterion("count_yiwancheng_fenxiao is not null");
            return (Criteria) this;
        }

        public Criteria andCountYiwanchengFenxiaoEqualTo(Integer value) {
            addCriterion("count_yiwancheng_fenxiao =", value, "countYiwanchengFenxiao");
            return (Criteria) this;
        }

        public Criteria andCountYiwanchengFenxiaoNotEqualTo(Integer value) {
            addCriterion("count_yiwancheng_fenxiao <>", value, "countYiwanchengFenxiao");
            return (Criteria) this;
        }

        public Criteria andCountYiwanchengFenxiaoGreaterThan(Integer value) {
            addCriterion("count_yiwancheng_fenxiao >", value, "countYiwanchengFenxiao");
            return (Criteria) this;
        }

        public Criteria andCountYiwanchengFenxiaoGreaterThanOrEqualTo(Integer value) {
            addCriterion("count_yiwancheng_fenxiao >=", value, "countYiwanchengFenxiao");
            return (Criteria) this;
        }

        public Criteria andCountYiwanchengFenxiaoLessThan(Integer value) {
            addCriterion("count_yiwancheng_fenxiao <", value, "countYiwanchengFenxiao");
            return (Criteria) this;
        }

        public Criteria andCountYiwanchengFenxiaoLessThanOrEqualTo(Integer value) {
            addCriterion("count_yiwancheng_fenxiao <=", value, "countYiwanchengFenxiao");
            return (Criteria) this;
        }

        public Criteria andCountYiwanchengFenxiaoIn(List<Integer> values) {
            addCriterion("count_yiwancheng_fenxiao in", values, "countYiwanchengFenxiao");
            return (Criteria) this;
        }

        public Criteria andCountYiwanchengFenxiaoNotIn(List<Integer> values) {
            addCriterion("count_yiwancheng_fenxiao not in", values, "countYiwanchengFenxiao");
            return (Criteria) this;
        }

        public Criteria andCountYiwanchengFenxiaoBetween(Integer value1, Integer value2) {
            addCriterion("count_yiwancheng_fenxiao between", value1, value2, "countYiwanchengFenxiao");
            return (Criteria) this;
        }

        public Criteria andCountYiwanchengFenxiaoNotBetween(Integer value1, Integer value2) {
            addCriterion("count_yiwancheng_fenxiao not between", value1, value2, "countYiwanchengFenxiao");
            return (Criteria) this;
        }

        public Criteria andCountWeiwanchengFenxiaoIsNull() {
            addCriterion("count_weiwancheng_fenxiao is null");
            return (Criteria) this;
        }

        public Criteria andCountWeiwanchengFenxiaoIsNotNull() {
            addCriterion("count_weiwancheng_fenxiao is not null");
            return (Criteria) this;
        }

        public Criteria andCountWeiwanchengFenxiaoEqualTo(Integer value) {
            addCriterion("count_weiwancheng_fenxiao =", value, "countWeiwanchengFenxiao");
            return (Criteria) this;
        }

        public Criteria andCountWeiwanchengFenxiaoNotEqualTo(Integer value) {
            addCriterion("count_weiwancheng_fenxiao <>", value, "countWeiwanchengFenxiao");
            return (Criteria) this;
        }

        public Criteria andCountWeiwanchengFenxiaoGreaterThan(Integer value) {
            addCriterion("count_weiwancheng_fenxiao >", value, "countWeiwanchengFenxiao");
            return (Criteria) this;
        }

        public Criteria andCountWeiwanchengFenxiaoGreaterThanOrEqualTo(Integer value) {
            addCriterion("count_weiwancheng_fenxiao >=", value, "countWeiwanchengFenxiao");
            return (Criteria) this;
        }

        public Criteria andCountWeiwanchengFenxiaoLessThan(Integer value) {
            addCriterion("count_weiwancheng_fenxiao <", value, "countWeiwanchengFenxiao");
            return (Criteria) this;
        }

        public Criteria andCountWeiwanchengFenxiaoLessThanOrEqualTo(Integer value) {
            addCriterion("count_weiwancheng_fenxiao <=", value, "countWeiwanchengFenxiao");
            return (Criteria) this;
        }

        public Criteria andCountWeiwanchengFenxiaoIn(List<Integer> values) {
            addCriterion("count_weiwancheng_fenxiao in", values, "countWeiwanchengFenxiao");
            return (Criteria) this;
        }

        public Criteria andCountWeiwanchengFenxiaoNotIn(List<Integer> values) {
            addCriterion("count_weiwancheng_fenxiao not in", values, "countWeiwanchengFenxiao");
            return (Criteria) this;
        }

        public Criteria andCountWeiwanchengFenxiaoBetween(Integer value1, Integer value2) {
            addCriterion("count_weiwancheng_fenxiao between", value1, value2, "countWeiwanchengFenxiao");
            return (Criteria) this;
        }

        public Criteria andCountWeiwanchengFenxiaoNotBetween(Integer value1, Integer value2) {
            addCriterion("count_weiwancheng_fenxiao not between", value1, value2, "countWeiwanchengFenxiao");
            return (Criteria) this;
        }

        public Criteria andCountCashMeifukuanIsNull() {
            addCriterion("count_cash_meifukuan is null");
            return (Criteria) this;
        }

        public Criteria andCountCashMeifukuanIsNotNull() {
            addCriterion("count_cash_meifukuan is not null");
            return (Criteria) this;
        }

        public Criteria andCountCashMeifukuanEqualTo(BigDecimal value) {
            addCriterion("count_cash_meifukuan =", value, "countCashMeifukuan");
            return (Criteria) this;
        }

        public Criteria andCountCashMeifukuanNotEqualTo(BigDecimal value) {
            addCriterion("count_cash_meifukuan <>", value, "countCashMeifukuan");
            return (Criteria) this;
        }

        public Criteria andCountCashMeifukuanGreaterThan(BigDecimal value) {
            addCriterion("count_cash_meifukuan >", value, "countCashMeifukuan");
            return (Criteria) this;
        }

        public Criteria andCountCashMeifukuanGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("count_cash_meifukuan >=", value, "countCashMeifukuan");
            return (Criteria) this;
        }

        public Criteria andCountCashMeifukuanLessThan(BigDecimal value) {
            addCriterion("count_cash_meifukuan <", value, "countCashMeifukuan");
            return (Criteria) this;
        }

        public Criteria andCountCashMeifukuanLessThanOrEqualTo(BigDecimal value) {
            addCriterion("count_cash_meifukuan <=", value, "countCashMeifukuan");
            return (Criteria) this;
        }

        public Criteria andCountCashMeifukuanIn(List<BigDecimal> values) {
            addCriterion("count_cash_meifukuan in", values, "countCashMeifukuan");
            return (Criteria) this;
        }

        public Criteria andCountCashMeifukuanNotIn(List<BigDecimal> values) {
            addCriterion("count_cash_meifukuan not in", values, "countCashMeifukuan");
            return (Criteria) this;
        }

        public Criteria andCountCashMeifukuanBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("count_cash_meifukuan between", value1, value2, "countCashMeifukuan");
            return (Criteria) this;
        }

        public Criteria andCountCashMeifukuanNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("count_cash_meifukuan not between", value1, value2, "countCashMeifukuan");
            return (Criteria) this;
        }

        public Criteria andCountCashYifukuanIsNull() {
            addCriterion("count_cash_yifukuan is null");
            return (Criteria) this;
        }

        public Criteria andCountCashYifukuanIsNotNull() {
            addCriterion("count_cash_yifukuan is not null");
            return (Criteria) this;
        }

        public Criteria andCountCashYifukuanEqualTo(BigDecimal value) {
            addCriterion("count_cash_yifukuan =", value, "countCashYifukuan");
            return (Criteria) this;
        }

        public Criteria andCountCashYifukuanNotEqualTo(BigDecimal value) {
            addCriterion("count_cash_yifukuan <>", value, "countCashYifukuan");
            return (Criteria) this;
        }

        public Criteria andCountCashYifukuanGreaterThan(BigDecimal value) {
            addCriterion("count_cash_yifukuan >", value, "countCashYifukuan");
            return (Criteria) this;
        }

        public Criteria andCountCashYifukuanGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("count_cash_yifukuan >=", value, "countCashYifukuan");
            return (Criteria) this;
        }

        public Criteria andCountCashYifukuanLessThan(BigDecimal value) {
            addCriterion("count_cash_yifukuan <", value, "countCashYifukuan");
            return (Criteria) this;
        }

        public Criteria andCountCashYifukuanLessThanOrEqualTo(BigDecimal value) {
            addCriterion("count_cash_yifukuan <=", value, "countCashYifukuan");
            return (Criteria) this;
        }

        public Criteria andCountCashYifukuanIn(List<BigDecimal> values) {
            addCriterion("count_cash_yifukuan in", values, "countCashYifukuan");
            return (Criteria) this;
        }

        public Criteria andCountCashYifukuanNotIn(List<BigDecimal> values) {
            addCriterion("count_cash_yifukuan not in", values, "countCashYifukuan");
            return (Criteria) this;
        }

        public Criteria andCountCashYifukuanBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("count_cash_yifukuan between", value1, value2, "countCashYifukuan");
            return (Criteria) this;
        }

        public Criteria andCountCashYifukuanNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("count_cash_yifukuan not between", value1, value2, "countCashYifukuan");
            return (Criteria) this;
        }

        public Criteria andCountCashMeishouhuoIsNull() {
            addCriterion("count_cash_meishouhuo is null");
            return (Criteria) this;
        }

        public Criteria andCountCashMeishouhuoIsNotNull() {
            addCriterion("count_cash_meishouhuo is not null");
            return (Criteria) this;
        }

        public Criteria andCountCashMeishouhuoEqualTo(BigDecimal value) {
            addCriterion("count_cash_meishouhuo =", value, "countCashMeishouhuo");
            return (Criteria) this;
        }

        public Criteria andCountCashMeishouhuoNotEqualTo(BigDecimal value) {
            addCriterion("count_cash_meishouhuo <>", value, "countCashMeishouhuo");
            return (Criteria) this;
        }

        public Criteria andCountCashMeishouhuoGreaterThan(BigDecimal value) {
            addCriterion("count_cash_meishouhuo >", value, "countCashMeishouhuo");
            return (Criteria) this;
        }

        public Criteria andCountCashMeishouhuoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("count_cash_meishouhuo >=", value, "countCashMeishouhuo");
            return (Criteria) this;
        }

        public Criteria andCountCashMeishouhuoLessThan(BigDecimal value) {
            addCriterion("count_cash_meishouhuo <", value, "countCashMeishouhuo");
            return (Criteria) this;
        }

        public Criteria andCountCashMeishouhuoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("count_cash_meishouhuo <=", value, "countCashMeishouhuo");
            return (Criteria) this;
        }

        public Criteria andCountCashMeishouhuoIn(List<BigDecimal> values) {
            addCriterion("count_cash_meishouhuo in", values, "countCashMeishouhuo");
            return (Criteria) this;
        }

        public Criteria andCountCashMeishouhuoNotIn(List<BigDecimal> values) {
            addCriterion("count_cash_meishouhuo not in", values, "countCashMeishouhuo");
            return (Criteria) this;
        }

        public Criteria andCountCashMeishouhuoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("count_cash_meishouhuo between", value1, value2, "countCashMeishouhuo");
            return (Criteria) this;
        }

        public Criteria andCountCashMeishouhuoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("count_cash_meishouhuo not between", value1, value2, "countCashMeishouhuo");
            return (Criteria) this;
        }

        public Criteria andCountCashShouhuoIsNull() {
            addCriterion("count_cash_shouhuo is null");
            return (Criteria) this;
        }

        public Criteria andCountCashShouhuoIsNotNull() {
            addCriterion("count_cash_shouhuo is not null");
            return (Criteria) this;
        }

        public Criteria andCountCashShouhuoEqualTo(BigDecimal value) {
            addCriterion("count_cash_shouhuo =", value, "countCashShouhuo");
            return (Criteria) this;
        }

        public Criteria andCountCashShouhuoNotEqualTo(BigDecimal value) {
            addCriterion("count_cash_shouhuo <>", value, "countCashShouhuo");
            return (Criteria) this;
        }

        public Criteria andCountCashShouhuoGreaterThan(BigDecimal value) {
            addCriterion("count_cash_shouhuo >", value, "countCashShouhuo");
            return (Criteria) this;
        }

        public Criteria andCountCashShouhuoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("count_cash_shouhuo >=", value, "countCashShouhuo");
            return (Criteria) this;
        }

        public Criteria andCountCashShouhuoLessThan(BigDecimal value) {
            addCriterion("count_cash_shouhuo <", value, "countCashShouhuo");
            return (Criteria) this;
        }

        public Criteria andCountCashShouhuoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("count_cash_shouhuo <=", value, "countCashShouhuo");
            return (Criteria) this;
        }

        public Criteria andCountCashShouhuoIn(List<BigDecimal> values) {
            addCriterion("count_cash_shouhuo in", values, "countCashShouhuo");
            return (Criteria) this;
        }

        public Criteria andCountCashShouhuoNotIn(List<BigDecimal> values) {
            addCriterion("count_cash_shouhuo not in", values, "countCashShouhuo");
            return (Criteria) this;
        }

        public Criteria andCountCashShouhuoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("count_cash_shouhuo between", value1, value2, "countCashShouhuo");
            return (Criteria) this;
        }

        public Criteria andCountCashShouhuoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("count_cash_shouhuo not between", value1, value2, "countCashShouhuo");
            return (Criteria) this;
        }

        public Criteria andCountCashCanTixianIsNull() {
            addCriterion("count_cash_can_tixian is null");
            return (Criteria) this;
        }

        public Criteria andCountCashCanTixianIsNotNull() {
            addCriterion("count_cash_can_tixian is not null");
            return (Criteria) this;
        }

        public Criteria andCountCashCanTixianEqualTo(BigDecimal value) {
            addCriterion("count_cash_can_tixian =", value, "countCashCanTixian");
            return (Criteria) this;
        }

        public Criteria andCountCashCanTixianNotEqualTo(BigDecimal value) {
            addCriterion("count_cash_can_tixian <>", value, "countCashCanTixian");
            return (Criteria) this;
        }

        public Criteria andCountCashCanTixianGreaterThan(BigDecimal value) {
            addCriterion("count_cash_can_tixian >", value, "countCashCanTixian");
            return (Criteria) this;
        }

        public Criteria andCountCashCanTixianGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("count_cash_can_tixian >=", value, "countCashCanTixian");
            return (Criteria) this;
        }

        public Criteria andCountCashCanTixianLessThan(BigDecimal value) {
            addCriterion("count_cash_can_tixian <", value, "countCashCanTixian");
            return (Criteria) this;
        }

        public Criteria andCountCashCanTixianLessThanOrEqualTo(BigDecimal value) {
            addCriterion("count_cash_can_tixian <=", value, "countCashCanTixian");
            return (Criteria) this;
        }

        public Criteria andCountCashCanTixianIn(List<BigDecimal> values) {
            addCriterion("count_cash_can_tixian in", values, "countCashCanTixian");
            return (Criteria) this;
        }

        public Criteria andCountCashCanTixianNotIn(List<BigDecimal> values) {
            addCriterion("count_cash_can_tixian not in", values, "countCashCanTixian");
            return (Criteria) this;
        }

        public Criteria andCountCashCanTixianBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("count_cash_can_tixian between", value1, value2, "countCashCanTixian");
            return (Criteria) this;
        }

        public Criteria andCountCashCanTixianNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("count_cash_can_tixian not between", value1, value2, "countCashCanTixian");
            return (Criteria) this;
        }

        public Criteria andCountCashHasTixianIsNull() {
            addCriterion("count_cash_has_tixian is null");
            return (Criteria) this;
        }

        public Criteria andCountCashHasTixianIsNotNull() {
            addCriterion("count_cash_has_tixian is not null");
            return (Criteria) this;
        }

        public Criteria andCountCashHasTixianEqualTo(BigDecimal value) {
            addCriterion("count_cash_has_tixian =", value, "countCashHasTixian");
            return (Criteria) this;
        }

        public Criteria andCountCashHasTixianNotEqualTo(BigDecimal value) {
            addCriterion("count_cash_has_tixian <>", value, "countCashHasTixian");
            return (Criteria) this;
        }

        public Criteria andCountCashHasTixianGreaterThan(BigDecimal value) {
            addCriterion("count_cash_has_tixian >", value, "countCashHasTixian");
            return (Criteria) this;
        }

        public Criteria andCountCashHasTixianGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("count_cash_has_tixian >=", value, "countCashHasTixian");
            return (Criteria) this;
        }

        public Criteria andCountCashHasTixianLessThan(BigDecimal value) {
            addCriterion("count_cash_has_tixian <", value, "countCashHasTixian");
            return (Criteria) this;
        }

        public Criteria andCountCashHasTixianLessThanOrEqualTo(BigDecimal value) {
            addCriterion("count_cash_has_tixian <=", value, "countCashHasTixian");
            return (Criteria) this;
        }

        public Criteria andCountCashHasTixianIn(List<BigDecimal> values) {
            addCriterion("count_cash_has_tixian in", values, "countCashHasTixian");
            return (Criteria) this;
        }

        public Criteria andCountCashHasTixianNotIn(List<BigDecimal> values) {
            addCriterion("count_cash_has_tixian not in", values, "countCashHasTixian");
            return (Criteria) this;
        }

        public Criteria andCountCashHasTixianBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("count_cash_has_tixian between", value1, value2, "countCashHasTixian");
            return (Criteria) this;
        }

        public Criteria andCountCashHasTixianNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("count_cash_has_tixian not between", value1, value2, "countCashHasTixian");
            return (Criteria) this;
        }

        public Criteria andCountCashZuofeiIsNull() {
            addCriterion("count_cash_zuofei is null");
            return (Criteria) this;
        }

        public Criteria andCountCashZuofeiIsNotNull() {
            addCriterion("count_cash_zuofei is not null");
            return (Criteria) this;
        }

        public Criteria andCountCashZuofeiEqualTo(BigDecimal value) {
            addCriterion("count_cash_zuofei =", value, "countCashZuofei");
            return (Criteria) this;
        }

        public Criteria andCountCashZuofeiNotEqualTo(BigDecimal value) {
            addCriterion("count_cash_zuofei <>", value, "countCashZuofei");
            return (Criteria) this;
        }

        public Criteria andCountCashZuofeiGreaterThan(BigDecimal value) {
            addCriterion("count_cash_zuofei >", value, "countCashZuofei");
            return (Criteria) this;
        }

        public Criteria andCountCashZuofeiGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("count_cash_zuofei >=", value, "countCashZuofei");
            return (Criteria) this;
        }

        public Criteria andCountCashZuofeiLessThan(BigDecimal value) {
            addCriterion("count_cash_zuofei <", value, "countCashZuofei");
            return (Criteria) this;
        }

        public Criteria andCountCashZuofeiLessThanOrEqualTo(BigDecimal value) {
            addCriterion("count_cash_zuofei <=", value, "countCashZuofei");
            return (Criteria) this;
        }

        public Criteria andCountCashZuofeiIn(List<BigDecimal> values) {
            addCriterion("count_cash_zuofei in", values, "countCashZuofei");
            return (Criteria) this;
        }

        public Criteria andCountCashZuofeiNotIn(List<BigDecimal> values) {
            addCriterion("count_cash_zuofei not in", values, "countCashZuofei");
            return (Criteria) this;
        }

        public Criteria andCountCashZuofeiBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("count_cash_zuofei between", value1, value2, "countCashZuofei");
            return (Criteria) this;
        }

        public Criteria andCountCashZuofeiNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("count_cash_zuofei not between", value1, value2, "countCashZuofei");
            return (Criteria) this;
        }

        public Criteria andCountOrderSalePaidIsNull() {
            addCriterion("count_order_sale_paid is null");
            return (Criteria) this;
        }

        public Criteria andCountOrderSalePaidIsNotNull() {
            addCriterion("count_order_sale_paid is not null");
            return (Criteria) this;
        }

        public Criteria andCountOrderSalePaidEqualTo(BigDecimal value) {
            addCriterion("count_order_sale_paid =", value, "countOrderSalePaid");
            return (Criteria) this;
        }

        public Criteria andCountOrderSalePaidNotEqualTo(BigDecimal value) {
            addCriterion("count_order_sale_paid <>", value, "countOrderSalePaid");
            return (Criteria) this;
        }

        public Criteria andCountOrderSalePaidGreaterThan(BigDecimal value) {
            addCriterion("count_order_sale_paid >", value, "countOrderSalePaid");
            return (Criteria) this;
        }

        public Criteria andCountOrderSalePaidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("count_order_sale_paid >=", value, "countOrderSalePaid");
            return (Criteria) this;
        }

        public Criteria andCountOrderSalePaidLessThan(BigDecimal value) {
            addCriterion("count_order_sale_paid <", value, "countOrderSalePaid");
            return (Criteria) this;
        }

        public Criteria andCountOrderSalePaidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("count_order_sale_paid <=", value, "countOrderSalePaid");
            return (Criteria) this;
        }

        public Criteria andCountOrderSalePaidIn(List<BigDecimal> values) {
            addCriterion("count_order_sale_paid in", values, "countOrderSalePaid");
            return (Criteria) this;
        }

        public Criteria andCountOrderSalePaidNotIn(List<BigDecimal> values) {
            addCriterion("count_order_sale_paid not in", values, "countOrderSalePaid");
            return (Criteria) this;
        }

        public Criteria andCountOrderSalePaidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("count_order_sale_paid between", value1, value2, "countOrderSalePaid");
            return (Criteria) this;
        }

        public Criteria andCountOrderSalePaidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("count_order_sale_paid not between", value1, value2, "countOrderSalePaid");
            return (Criteria) this;
        }

        public Criteria andCountSharePointIsNull() {
            addCriterion("count_share_point is null");
            return (Criteria) this;
        }

        public Criteria andCountSharePointIsNotNull() {
            addCriterion("count_share_point is not null");
            return (Criteria) this;
        }

        public Criteria andCountSharePointEqualTo(BigDecimal value) {
            addCriterion("count_share_point =", value, "countSharePoint");
            return (Criteria) this;
        }

        public Criteria andCountSharePointNotEqualTo(BigDecimal value) {
            addCriterion("count_share_point <>", value, "countSharePoint");
            return (Criteria) this;
        }

        public Criteria andCountSharePointGreaterThan(BigDecimal value) {
            addCriterion("count_share_point >", value, "countSharePoint");
            return (Criteria) this;
        }

        public Criteria andCountSharePointGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("count_share_point >=", value, "countSharePoint");
            return (Criteria) this;
        }

        public Criteria andCountSharePointLessThan(BigDecimal value) {
            addCriterion("count_share_point <", value, "countSharePoint");
            return (Criteria) this;
        }

        public Criteria andCountSharePointLessThanOrEqualTo(BigDecimal value) {
            addCriterion("count_share_point <=", value, "countSharePoint");
            return (Criteria) this;
        }

        public Criteria andCountSharePointIn(List<BigDecimal> values) {
            addCriterion("count_share_point in", values, "countSharePoint");
            return (Criteria) this;
        }

        public Criteria andCountSharePointNotIn(List<BigDecimal> values) {
            addCriterion("count_share_point not in", values, "countSharePoint");
            return (Criteria) this;
        }

        public Criteria andCountSharePointBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("count_share_point between", value1, value2, "countSharePoint");
            return (Criteria) this;
        }

        public Criteria andCountSharePointNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("count_share_point not between", value1, value2, "countSharePoint");
            return (Criteria) this;
        }

        public Criteria andCountCashEqualIsNull() {
            addCriterion("count_cash_equal is null");
            return (Criteria) this;
        }

        public Criteria andCountCashEqualIsNotNull() {
            addCriterion("count_cash_equal is not null");
            return (Criteria) this;
        }

        public Criteria andCountCashEqualEqualTo(BigDecimal value) {
            addCriterion("count_cash_equal =", value, "countCashEqual");
            return (Criteria) this;
        }

        public Criteria andCountCashEqualNotEqualTo(BigDecimal value) {
            addCriterion("count_cash_equal <>", value, "countCashEqual");
            return (Criteria) this;
        }

        public Criteria andCountCashEqualGreaterThan(BigDecimal value) {
            addCriterion("count_cash_equal >", value, "countCashEqual");
            return (Criteria) this;
        }

        public Criteria andCountCashEqualGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("count_cash_equal >=", value, "countCashEqual");
            return (Criteria) this;
        }

        public Criteria andCountCashEqualLessThan(BigDecimal value) {
            addCriterion("count_cash_equal <", value, "countCashEqual");
            return (Criteria) this;
        }

        public Criteria andCountCashEqualLessThanOrEqualTo(BigDecimal value) {
            addCriterion("count_cash_equal <=", value, "countCashEqual");
            return (Criteria) this;
        }

        public Criteria andCountCashEqualIn(List<BigDecimal> values) {
            addCriterion("count_cash_equal in", values, "countCashEqual");
            return (Criteria) this;
        }

        public Criteria andCountCashEqualNotIn(List<BigDecimal> values) {
            addCriterion("count_cash_equal not in", values, "countCashEqual");
            return (Criteria) this;
        }

        public Criteria andCountCashEqualBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("count_cash_equal between", value1, value2, "countCashEqual");
            return (Criteria) this;
        }

        public Criteria andCountCashEqualNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("count_cash_equal not between", value1, value2, "countCashEqual");
            return (Criteria) this;
        }

        public Criteria andCountCashGapIsNull() {
            addCriterion("count_cash_gap is null");
            return (Criteria) this;
        }

        public Criteria andCountCashGapIsNotNull() {
            addCriterion("count_cash_gap is not null");
            return (Criteria) this;
        }

        public Criteria andCountCashGapEqualTo(BigDecimal value) {
            addCriterion("count_cash_gap =", value, "countCashGap");
            return (Criteria) this;
        }

        public Criteria andCountCashGapNotEqualTo(BigDecimal value) {
            addCriterion("count_cash_gap <>", value, "countCashGap");
            return (Criteria) this;
        }

        public Criteria andCountCashGapGreaterThan(BigDecimal value) {
            addCriterion("count_cash_gap >", value, "countCashGap");
            return (Criteria) this;
        }

        public Criteria andCountCashGapGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("count_cash_gap >=", value, "countCashGap");
            return (Criteria) this;
        }

        public Criteria andCountCashGapLessThan(BigDecimal value) {
            addCriterion("count_cash_gap <", value, "countCashGap");
            return (Criteria) this;
        }

        public Criteria andCountCashGapLessThanOrEqualTo(BigDecimal value) {
            addCriterion("count_cash_gap <=", value, "countCashGap");
            return (Criteria) this;
        }

        public Criteria andCountCashGapIn(List<BigDecimal> values) {
            addCriterion("count_cash_gap in", values, "countCashGap");
            return (Criteria) this;
        }

        public Criteria andCountCashGapNotIn(List<BigDecimal> values) {
            addCriterion("count_cash_gap not in", values, "countCashGap");
            return (Criteria) this;
        }

        public Criteria andCountCashGapBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("count_cash_gap between", value1, value2, "countCashGap");
            return (Criteria) this;
        }

        public Criteria andCountCashGapNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("count_cash_gap not between", value1, value2, "countCashGap");
            return (Criteria) this;
        }

        public Criteria andCountCashProfitIsNull() {
            addCriterion("count_cash_profit is null");
            return (Criteria) this;
        }

        public Criteria andCountCashProfitIsNotNull() {
            addCriterion("count_cash_profit is not null");
            return (Criteria) this;
        }

        public Criteria andCountCashProfitEqualTo(BigDecimal value) {
            addCriterion("count_cash_profit =", value, "countCashProfit");
            return (Criteria) this;
        }

        public Criteria andCountCashProfitNotEqualTo(BigDecimal value) {
            addCriterion("count_cash_profit <>", value, "countCashProfit");
            return (Criteria) this;
        }

        public Criteria andCountCashProfitGreaterThan(BigDecimal value) {
            addCriterion("count_cash_profit >", value, "countCashProfit");
            return (Criteria) this;
        }

        public Criteria andCountCashProfitGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("count_cash_profit >=", value, "countCashProfit");
            return (Criteria) this;
        }

        public Criteria andCountCashProfitLessThan(BigDecimal value) {
            addCriterion("count_cash_profit <", value, "countCashProfit");
            return (Criteria) this;
        }

        public Criteria andCountCashProfitLessThanOrEqualTo(BigDecimal value) {
            addCriterion("count_cash_profit <=", value, "countCashProfit");
            return (Criteria) this;
        }

        public Criteria andCountCashProfitIn(List<BigDecimal> values) {
            addCriterion("count_cash_profit in", values, "countCashProfit");
            return (Criteria) this;
        }

        public Criteria andCountCashProfitNotIn(List<BigDecimal> values) {
            addCriterion("count_cash_profit not in", values, "countCashProfit");
            return (Criteria) this;
        }

        public Criteria andCountCashProfitBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("count_cash_profit between", value1, value2, "countCashProfit");
            return (Criteria) this;
        }

        public Criteria andCountCashProfitNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("count_cash_profit not between", value1, value2, "countCashProfit");
            return (Criteria) this;
        }

        public Criteria andCountCashTeamIsNull() {
            addCriterion("count_cash_team is null");
            return (Criteria) this;
        }

        public Criteria andCountCashTeamIsNotNull() {
            addCriterion("count_cash_team is not null");
            return (Criteria) this;
        }

        public Criteria andCountCashTeamEqualTo(BigDecimal value) {
            addCriterion("count_cash_team =", value, "countCashTeam");
            return (Criteria) this;
        }

        public Criteria andCountCashTeamNotEqualTo(BigDecimal value) {
            addCriterion("count_cash_team <>", value, "countCashTeam");
            return (Criteria) this;
        }

        public Criteria andCountCashTeamGreaterThan(BigDecimal value) {
            addCriterion("count_cash_team >", value, "countCashTeam");
            return (Criteria) this;
        }

        public Criteria andCountCashTeamGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("count_cash_team >=", value, "countCashTeam");
            return (Criteria) this;
        }

        public Criteria andCountCashTeamLessThan(BigDecimal value) {
            addCriterion("count_cash_team <", value, "countCashTeam");
            return (Criteria) this;
        }

        public Criteria andCountCashTeamLessThanOrEqualTo(BigDecimal value) {
            addCriterion("count_cash_team <=", value, "countCashTeam");
            return (Criteria) this;
        }

        public Criteria andCountCashTeamIn(List<BigDecimal> values) {
            addCriterion("count_cash_team in", values, "countCashTeam");
            return (Criteria) this;
        }

        public Criteria andCountCashTeamNotIn(List<BigDecimal> values) {
            addCriterion("count_cash_team not in", values, "countCashTeam");
            return (Criteria) this;
        }

        public Criteria andCountCashTeamBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("count_cash_team between", value1, value2, "countCashTeam");
            return (Criteria) this;
        }

        public Criteria andCountCashTeamNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("count_cash_team not between", value1, value2, "countCashTeam");
            return (Criteria) this;
        }

        public Criteria andWxQccodeIsNull() {
            addCriterion("wx_qccode is null");
            return (Criteria) this;
        }

        public Criteria andWxQccodeIsNotNull() {
            addCriterion("wx_qccode is not null");
            return (Criteria) this;
        }

        public Criteria andWxQccodeEqualTo(String value) {
            addCriterion("wx_qccode =", value, "wxQccode");
            return (Criteria) this;
        }

        public Criteria andWxQccodeNotEqualTo(String value) {
            addCriterion("wx_qccode <>", value, "wxQccode");
            return (Criteria) this;
        }

        public Criteria andWxQccodeGreaterThan(String value) {
            addCriterion("wx_qccode >", value, "wxQccode");
            return (Criteria) this;
        }

        public Criteria andWxQccodeGreaterThanOrEqualTo(String value) {
            addCriterion("wx_qccode >=", value, "wxQccode");
            return (Criteria) this;
        }

        public Criteria andWxQccodeLessThan(String value) {
            addCriterion("wx_qccode <", value, "wxQccode");
            return (Criteria) this;
        }

        public Criteria andWxQccodeLessThanOrEqualTo(String value) {
            addCriterion("wx_qccode <=", value, "wxQccode");
            return (Criteria) this;
        }

        public Criteria andWxQccodeLike(String value) {
            addCriterion("wx_qccode like", value, "wxQccode");
            return (Criteria) this;
        }

        public Criteria andWxQccodeNotLike(String value) {
            addCriterion("wx_qccode not like", value, "wxQccode");
            return (Criteria) this;
        }

        public Criteria andWxQccodeIn(List<String> values) {
            addCriterion("wx_qccode in", values, "wxQccode");
            return (Criteria) this;
        }

        public Criteria andWxQccodeNotIn(List<String> values) {
            addCriterion("wx_qccode not in", values, "wxQccode");
            return (Criteria) this;
        }

        public Criteria andWxQccodeBetween(String value1, String value2) {
            addCriterion("wx_qccode between", value1, value2, "wxQccode");
            return (Criteria) this;
        }

        public Criteria andWxQccodeNotBetween(String value1, String value2) {
            addCriterion("wx_qccode not between", value1, value2, "wxQccode");
            return (Criteria) this;
        }

        public Criteria andIsGuanzhuIsNull() {
            addCriterion("is_guanzhu is null");
            return (Criteria) this;
        }

        public Criteria andIsGuanzhuIsNotNull() {
            addCriterion("is_guanzhu is not null");
            return (Criteria) this;
        }

        public Criteria andIsGuanzhuEqualTo(Integer value) {
            addCriterion("is_guanzhu =", value, "isGuanzhu");
            return (Criteria) this;
        }

        public Criteria andIsGuanzhuNotEqualTo(Integer value) {
            addCriterion("is_guanzhu <>", value, "isGuanzhu");
            return (Criteria) this;
        }

        public Criteria andIsGuanzhuGreaterThan(Integer value) {
            addCriterion("is_guanzhu >", value, "isGuanzhu");
            return (Criteria) this;
        }

        public Criteria andIsGuanzhuGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_guanzhu >=", value, "isGuanzhu");
            return (Criteria) this;
        }

        public Criteria andIsGuanzhuLessThan(Integer value) {
            addCriterion("is_guanzhu <", value, "isGuanzhu");
            return (Criteria) this;
        }

        public Criteria andIsGuanzhuLessThanOrEqualTo(Integer value) {
            addCriterion("is_guanzhu <=", value, "isGuanzhu");
            return (Criteria) this;
        }

        public Criteria andIsGuanzhuIn(List<Integer> values) {
            addCriterion("is_guanzhu in", values, "isGuanzhu");
            return (Criteria) this;
        }

        public Criteria andIsGuanzhuNotIn(List<Integer> values) {
            addCriterion("is_guanzhu not in", values, "isGuanzhu");
            return (Criteria) this;
        }

        public Criteria andIsGuanzhuBetween(Integer value1, Integer value2) {
            addCriterion("is_guanzhu between", value1, value2, "isGuanzhu");
            return (Criteria) this;
        }

        public Criteria andIsGuanzhuNotBetween(Integer value1, Integer value2) {
            addCriterion("is_guanzhu not between", value1, value2, "isGuanzhu");
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

        public Criteria andIsShareIsNull() {
            addCriterion("is_share is null");
            return (Criteria) this;
        }

        public Criteria andIsShareIsNotNull() {
            addCriterion("is_share is not null");
            return (Criteria) this;
        }

        public Criteria andIsShareEqualTo(Integer value) {
            addCriterion("is_share =", value, "isShare");
            return (Criteria) this;
        }

        public Criteria andIsShareNotEqualTo(Integer value) {
            addCriterion("is_share <>", value, "isShare");
            return (Criteria) this;
        }

        public Criteria andIsShareGreaterThan(Integer value) {
            addCriterion("is_share >", value, "isShare");
            return (Criteria) this;
        }

        public Criteria andIsShareGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_share >=", value, "isShare");
            return (Criteria) this;
        }

        public Criteria andIsShareLessThan(Integer value) {
            addCriterion("is_share <", value, "isShare");
            return (Criteria) this;
        }

        public Criteria andIsShareLessThanOrEqualTo(Integer value) {
            addCriterion("is_share <=", value, "isShare");
            return (Criteria) this;
        }

        public Criteria andIsShareIn(List<Integer> values) {
            addCriterion("is_share in", values, "isShare");
            return (Criteria) this;
        }

        public Criteria andIsShareNotIn(List<Integer> values) {
            addCriterion("is_share not in", values, "isShare");
            return (Criteria) this;
        }

        public Criteria andIsShareBetween(Integer value1, Integer value2) {
            addCriterion("is_share between", value1, value2, "isShare");
            return (Criteria) this;
        }

        public Criteria andIsShareNotBetween(Integer value1, Integer value2) {
            addCriterion("is_share not between", value1, value2, "isShare");
            return (Criteria) this;
        }

        public Criteria andCheckContentIsNull() {
            addCriterion("check_content is null");
            return (Criteria) this;
        }

        public Criteria andCheckContentIsNotNull() {
            addCriterion("check_content is not null");
            return (Criteria) this;
        }

        public Criteria andCheckContentEqualTo(String value) {
            addCriterion("check_content =", value, "checkContent");
            return (Criteria) this;
        }

        public Criteria andCheckContentNotEqualTo(String value) {
            addCriterion("check_content <>", value, "checkContent");
            return (Criteria) this;
        }

        public Criteria andCheckContentGreaterThan(String value) {
            addCriterion("check_content >", value, "checkContent");
            return (Criteria) this;
        }

        public Criteria andCheckContentGreaterThanOrEqualTo(String value) {
            addCriterion("check_content >=", value, "checkContent");
            return (Criteria) this;
        }

        public Criteria andCheckContentLessThan(String value) {
            addCriterion("check_content <", value, "checkContent");
            return (Criteria) this;
        }

        public Criteria andCheckContentLessThanOrEqualTo(String value) {
            addCriterion("check_content <=", value, "checkContent");
            return (Criteria) this;
        }

        public Criteria andCheckContentLike(String value) {
            addCriterion("check_content like", value, "checkContent");
            return (Criteria) this;
        }

        public Criteria andCheckContentNotLike(String value) {
            addCriterion("check_content not like", value, "checkContent");
            return (Criteria) this;
        }

        public Criteria andCheckContentIn(List<String> values) {
            addCriterion("check_content in", values, "checkContent");
            return (Criteria) this;
        }

        public Criteria andCheckContentNotIn(List<String> values) {
            addCriterion("check_content not in", values, "checkContent");
            return (Criteria) this;
        }

        public Criteria andCheckContentBetween(String value1, String value2) {
            addCriterion("check_content between", value1, value2, "checkContent");
            return (Criteria) this;
        }

        public Criteria andCheckContentNotBetween(String value1, String value2) {
            addCriterion("check_content not between", value1, value2, "checkContent");
            return (Criteria) this;
        }

        public Criteria andGudongTextIsNull() {
            addCriterion("gudong_text is null");
            return (Criteria) this;
        }

        public Criteria andGudongTextIsNotNull() {
            addCriterion("gudong_text is not null");
            return (Criteria) this;
        }

        public Criteria andGudongTextEqualTo(String value) {
            addCriterion("gudong_text =", value, "gudongText");
            return (Criteria) this;
        }

        public Criteria andGudongTextNotEqualTo(String value) {
            addCriterion("gudong_text <>", value, "gudongText");
            return (Criteria) this;
        }

        public Criteria andGudongTextGreaterThan(String value) {
            addCriterion("gudong_text >", value, "gudongText");
            return (Criteria) this;
        }

        public Criteria andGudongTextGreaterThanOrEqualTo(String value) {
            addCriterion("gudong_text >=", value, "gudongText");
            return (Criteria) this;
        }

        public Criteria andGudongTextLessThan(String value) {
            addCriterion("gudong_text <", value, "gudongText");
            return (Criteria) this;
        }

        public Criteria andGudongTextLessThanOrEqualTo(String value) {
            addCriterion("gudong_text <=", value, "gudongText");
            return (Criteria) this;
        }

        public Criteria andGudongTextLike(String value) {
            addCriterion("gudong_text like", value, "gudongText");
            return (Criteria) this;
        }

        public Criteria andGudongTextNotLike(String value) {
            addCriterion("gudong_text not like", value, "gudongText");
            return (Criteria) this;
        }

        public Criteria andGudongTextIn(List<String> values) {
            addCriterion("gudong_text in", values, "gudongText");
            return (Criteria) this;
        }

        public Criteria andGudongTextNotIn(List<String> values) {
            addCriterion("gudong_text not in", values, "gudongText");
            return (Criteria) this;
        }

        public Criteria andGudongTextBetween(String value1, String value2) {
            addCriterion("gudong_text between", value1, value2, "gudongText");
            return (Criteria) this;
        }

        public Criteria andGudongTextNotBetween(String value1, String value2) {
            addCriterion("gudong_text not between", value1, value2, "gudongText");
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

        public Criteria andShareGradeIdIsNull() {
            addCriterion("share_grade_id is null");
            return (Criteria) this;
        }

        public Criteria andShareGradeIdIsNotNull() {
            addCriterion("share_grade_id is not null");
            return (Criteria) this;
        }

        public Criteria andShareGradeIdEqualTo(Integer value) {
            addCriterion("share_grade_id =", value, "shareGradeId");
            return (Criteria) this;
        }

        public Criteria andShareGradeIdNotEqualTo(Integer value) {
            addCriterion("share_grade_id <>", value, "shareGradeId");
            return (Criteria) this;
        }

        public Criteria andShareGradeIdGreaterThan(Integer value) {
            addCriterion("share_grade_id >", value, "shareGradeId");
            return (Criteria) this;
        }

        public Criteria andShareGradeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("share_grade_id >=", value, "shareGradeId");
            return (Criteria) this;
        }

        public Criteria andShareGradeIdLessThan(Integer value) {
            addCriterion("share_grade_id <", value, "shareGradeId");
            return (Criteria) this;
        }

        public Criteria andShareGradeIdLessThanOrEqualTo(Integer value) {
            addCriterion("share_grade_id <=", value, "shareGradeId");
            return (Criteria) this;
        }

        public Criteria andShareGradeIdIn(List<Integer> values) {
            addCriterion("share_grade_id in", values, "shareGradeId");
            return (Criteria) this;
        }

        public Criteria andShareGradeIdNotIn(List<Integer> values) {
            addCriterion("share_grade_id not in", values, "shareGradeId");
            return (Criteria) this;
        }

        public Criteria andShareGradeIdBetween(Integer value1, Integer value2) {
            addCriterion("share_grade_id between", value1, value2, "shareGradeId");
            return (Criteria) this;
        }

        public Criteria andShareGradeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("share_grade_id not between", value1, value2, "shareGradeId");
            return (Criteria) this;
        }

        public Criteria andGuanliGradeIdIsNull() {
            addCriterion("guanli_grade_id is null");
            return (Criteria) this;
        }

        public Criteria andGuanliGradeIdIsNotNull() {
            addCriterion("guanli_grade_id is not null");
            return (Criteria) this;
        }

        public Criteria andGuanliGradeIdEqualTo(Integer value) {
            addCriterion("guanli_grade_id =", value, "guanliGradeId");
            return (Criteria) this;
        }

        public Criteria andGuanliGradeIdNotEqualTo(Integer value) {
            addCriterion("guanli_grade_id <>", value, "guanliGradeId");
            return (Criteria) this;
        }

        public Criteria andGuanliGradeIdGreaterThan(Integer value) {
            addCriterion("guanli_grade_id >", value, "guanliGradeId");
            return (Criteria) this;
        }

        public Criteria andGuanliGradeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("guanli_grade_id >=", value, "guanliGradeId");
            return (Criteria) this;
        }

        public Criteria andGuanliGradeIdLessThan(Integer value) {
            addCriterion("guanli_grade_id <", value, "guanliGradeId");
            return (Criteria) this;
        }

        public Criteria andGuanliGradeIdLessThanOrEqualTo(Integer value) {
            addCriterion("guanli_grade_id <=", value, "guanliGradeId");
            return (Criteria) this;
        }

        public Criteria andGuanliGradeIdIn(List<Integer> values) {
            addCriterion("guanli_grade_id in", values, "guanliGradeId");
            return (Criteria) this;
        }

        public Criteria andGuanliGradeIdNotIn(List<Integer> values) {
            addCriterion("guanli_grade_id not in", values, "guanliGradeId");
            return (Criteria) this;
        }

        public Criteria andGuanliGradeIdBetween(Integer value1, Integer value2) {
            addCriterion("guanli_grade_id between", value1, value2, "guanliGradeId");
            return (Criteria) this;
        }

        public Criteria andGuanliGradeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("guanli_grade_id not between", value1, value2, "guanliGradeId");
            return (Criteria) this;
        }

        public Criteria andLevelIsNull() {
            addCriterion("level is null");
            return (Criteria) this;
        }

        public Criteria andLevelIsNotNull() {
            addCriterion("level is not null");
            return (Criteria) this;
        }

        public Criteria andLevelEqualTo(Integer value) {
            addCriterion("level =", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotEqualTo(Integer value) {
            addCriterion("level <>", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThan(Integer value) {
            addCriterion("level >", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("level >=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThan(Integer value) {
            addCriterion("level <", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThanOrEqualTo(Integer value) {
            addCriterion("level <=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelIn(List<Integer> values) {
            addCriterion("level in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotIn(List<Integer> values) {
            addCriterion("level not in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelBetween(Integer value1, Integer value2) {
            addCriterion("level between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("level not between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andIsRenzhengIsNull() {
            addCriterion("is_renzheng is null");
            return (Criteria) this;
        }

        public Criteria andIsRenzhengIsNotNull() {
            addCriterion("is_renzheng is not null");
            return (Criteria) this;
        }

        public Criteria andIsRenzhengEqualTo(Byte value) {
            addCriterion("is_renzheng =", value, "isRenzheng");
            return (Criteria) this;
        }

        public Criteria andIsRenzhengNotEqualTo(Byte value) {
            addCriterion("is_renzheng <>", value, "isRenzheng");
            return (Criteria) this;
        }

        public Criteria andIsRenzhengGreaterThan(Byte value) {
            addCriterion("is_renzheng >", value, "isRenzheng");
            return (Criteria) this;
        }

        public Criteria andIsRenzhengGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_renzheng >=", value, "isRenzheng");
            return (Criteria) this;
        }

        public Criteria andIsRenzhengLessThan(Byte value) {
            addCriterion("is_renzheng <", value, "isRenzheng");
            return (Criteria) this;
        }

        public Criteria andIsRenzhengLessThanOrEqualTo(Byte value) {
            addCriterion("is_renzheng <=", value, "isRenzheng");
            return (Criteria) this;
        }

        public Criteria andIsRenzhengIn(List<Byte> values) {
            addCriterion("is_renzheng in", values, "isRenzheng");
            return (Criteria) this;
        }

        public Criteria andIsRenzhengNotIn(List<Byte> values) {
            addCriterion("is_renzheng not in", values, "isRenzheng");
            return (Criteria) this;
        }

        public Criteria andIsRenzhengBetween(Byte value1, Byte value2) {
            addCriterion("is_renzheng between", value1, value2, "isRenzheng");
            return (Criteria) this;
        }

        public Criteria andIsRenzhengNotBetween(Byte value1, Byte value2) {
            addCriterion("is_renzheng not between", value1, value2, "isRenzheng");
            return (Criteria) this;
        }

        public Criteria andIsShareUserIsNull() {
            addCriterion("is_share_user is null");
            return (Criteria) this;
        }

        public Criteria andIsShareUserIsNotNull() {
            addCriterion("is_share_user is not null");
            return (Criteria) this;
        }

        public Criteria andIsShareUserEqualTo(Byte value) {
            addCriterion("is_share_user =", value, "isShareUser");
            return (Criteria) this;
        }

        public Criteria andIsShareUserNotEqualTo(Byte value) {
            addCriterion("is_share_user <>", value, "isShareUser");
            return (Criteria) this;
        }

        public Criteria andIsShareUserGreaterThan(Byte value) {
            addCriterion("is_share_user >", value, "isShareUser");
            return (Criteria) this;
        }

        public Criteria andIsShareUserGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_share_user >=", value, "isShareUser");
            return (Criteria) this;
        }

        public Criteria andIsShareUserLessThan(Byte value) {
            addCriterion("is_share_user <", value, "isShareUser");
            return (Criteria) this;
        }

        public Criteria andIsShareUserLessThanOrEqualTo(Byte value) {
            addCriterion("is_share_user <=", value, "isShareUser");
            return (Criteria) this;
        }

        public Criteria andIsShareUserIn(List<Byte> values) {
            addCriterion("is_share_user in", values, "isShareUser");
            return (Criteria) this;
        }

        public Criteria andIsShareUserNotIn(List<Byte> values) {
            addCriterion("is_share_user not in", values, "isShareUser");
            return (Criteria) this;
        }

        public Criteria andIsShareUserBetween(Byte value1, Byte value2) {
            addCriterion("is_share_user between", value1, value2, "isShareUser");
            return (Criteria) this;
        }

        public Criteria andIsShareUserNotBetween(Byte value1, Byte value2) {
            addCriterion("is_share_user not between", value1, value2, "isShareUser");
            return (Criteria) this;
        }

        public Criteria andIsBuyIsNull() {
            addCriterion("is_buy is null");
            return (Criteria) this;
        }

        public Criteria andIsBuyIsNotNull() {
            addCriterion("is_buy is not null");
            return (Criteria) this;
        }

        public Criteria andIsBuyEqualTo(Integer value) {
            addCriterion("is_buy =", value, "isBuy");
            return (Criteria) this;
        }

        public Criteria andIsBuyNotEqualTo(Integer value) {
            addCriterion("is_buy <>", value, "isBuy");
            return (Criteria) this;
        }

        public Criteria andIsBuyGreaterThan(Integer value) {
            addCriterion("is_buy >", value, "isBuy");
            return (Criteria) this;
        }

        public Criteria andIsBuyGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_buy >=", value, "isBuy");
            return (Criteria) this;
        }

        public Criteria andIsBuyLessThan(Integer value) {
            addCriterion("is_buy <", value, "isBuy");
            return (Criteria) this;
        }

        public Criteria andIsBuyLessThanOrEqualTo(Integer value) {
            addCriterion("is_buy <=", value, "isBuy");
            return (Criteria) this;
        }

        public Criteria andIsBuyIn(List<Integer> values) {
            addCriterion("is_buy in", values, "isBuy");
            return (Criteria) this;
        }

        public Criteria andIsBuyNotIn(List<Integer> values) {
            addCriterion("is_buy not in", values, "isBuy");
            return (Criteria) this;
        }

        public Criteria andIsBuyBetween(Integer value1, Integer value2) {
            addCriterion("is_buy between", value1, value2, "isBuy");
            return (Criteria) this;
        }

        public Criteria andIsBuyNotBetween(Integer value1, Integer value2) {
            addCriterion("is_buy not between", value1, value2, "isBuy");
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