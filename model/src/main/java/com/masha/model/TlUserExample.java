package com.masha.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class TlUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TlUserExample() {
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

        public Criteria andAdminIdIsNull() {
            addCriterion("admin_id is null");
            return (Criteria) this;
        }

        public Criteria andAdminIdIsNotNull() {
            addCriterion("admin_id is not null");
            return (Criteria) this;
        }

        public Criteria andAdminIdEqualTo(Integer value) {
            addCriterion("admin_id =", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdNotEqualTo(Integer value) {
            addCriterion("admin_id <>", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdGreaterThan(Integer value) {
            addCriterion("admin_id >", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("admin_id >=", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdLessThan(Integer value) {
            addCriterion("admin_id <", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdLessThanOrEqualTo(Integer value) {
            addCriterion("admin_id <=", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdIn(List<Integer> values) {
            addCriterion("admin_id in", values, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdNotIn(List<Integer> values) {
            addCriterion("admin_id not in", values, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdBetween(Integer value1, Integer value2) {
            addCriterion("admin_id between", value1, value2, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdNotBetween(Integer value1, Integer value2) {
            addCriterion("admin_id not between", value1, value2, "adminId");
            return (Criteria) this;
        }

        public Criteria andLoginnameIsNull() {
            addCriterion("loginname is null");
            return (Criteria) this;
        }

        public Criteria andLoginnameIsNotNull() {
            addCriterion("loginname is not null");
            return (Criteria) this;
        }

        public Criteria andLoginnameEqualTo(String value) {
            addCriterion("loginname =", value, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameNotEqualTo(String value) {
            addCriterion("loginname <>", value, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameGreaterThan(String value) {
            addCriterion("loginname >", value, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameGreaterThanOrEqualTo(String value) {
            addCriterion("loginname >=", value, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameLessThan(String value) {
            addCriterion("loginname <", value, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameLessThanOrEqualTo(String value) {
            addCriterion("loginname <=", value, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameLike(String value) {
            addCriterion("loginname like", value, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameNotLike(String value) {
            addCriterion("loginname not like", value, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameIn(List<String> values) {
            addCriterion("loginname in", values, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameNotIn(List<String> values) {
            addCriterion("loginname not in", values, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameBetween(String value1, String value2) {
            addCriterion("loginname between", value1, value2, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameNotBetween(String value1, String value2) {
            addCriterion("loginname not between", value1, value2, "loginname");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
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

        public Criteria andTokenIsNull() {
            addCriterion("token is null");
            return (Criteria) this;
        }

        public Criteria andTokenIsNotNull() {
            addCriterion("token is not null");
            return (Criteria) this;
        }

        public Criteria andTokenEqualTo(String value) {
            addCriterion("token =", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotEqualTo(String value) {
            addCriterion("token <>", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenGreaterThan(String value) {
            addCriterion("token >", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenGreaterThanOrEqualTo(String value) {
            addCriterion("token >=", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenLessThan(String value) {
            addCriterion("token <", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenLessThanOrEqualTo(String value) {
            addCriterion("token <=", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenLike(String value) {
            addCriterion("token like", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotLike(String value) {
            addCriterion("token not like", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenIn(List<String> values) {
            addCriterion("token in", values, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotIn(List<String> values) {
            addCriterion("token not in", values, "token");
            return (Criteria) this;
        }

        public Criteria andTokenBetween(String value1, String value2) {
            addCriterion("token between", value1, value2, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotBetween(String value1, String value2) {
            addCriterion("token not between", value1, value2, "token");
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

        public Criteria andHeadimgurlIsNull() {
            addCriterion("headimgurl is null");
            return (Criteria) this;
        }

        public Criteria andHeadimgurlIsNotNull() {
            addCriterion("headimgurl is not null");
            return (Criteria) this;
        }

        public Criteria andHeadimgurlEqualTo(String value) {
            addCriterion("headimgurl =", value, "headimgurl");
            return (Criteria) this;
        }

        public Criteria andHeadimgurlNotEqualTo(String value) {
            addCriterion("headimgurl <>", value, "headimgurl");
            return (Criteria) this;
        }

        public Criteria andHeadimgurlGreaterThan(String value) {
            addCriterion("headimgurl >", value, "headimgurl");
            return (Criteria) this;
        }

        public Criteria andHeadimgurlGreaterThanOrEqualTo(String value) {
            addCriterion("headimgurl >=", value, "headimgurl");
            return (Criteria) this;
        }

        public Criteria andHeadimgurlLessThan(String value) {
            addCriterion("headimgurl <", value, "headimgurl");
            return (Criteria) this;
        }

        public Criteria andHeadimgurlLessThanOrEqualTo(String value) {
            addCriterion("headimgurl <=", value, "headimgurl");
            return (Criteria) this;
        }

        public Criteria andHeadimgurlLike(String value) {
            addCriterion("headimgurl like", value, "headimgurl");
            return (Criteria) this;
        }

        public Criteria andHeadimgurlNotLike(String value) {
            addCriterion("headimgurl not like", value, "headimgurl");
            return (Criteria) this;
        }

        public Criteria andHeadimgurlIn(List<String> values) {
            addCriterion("headimgurl in", values, "headimgurl");
            return (Criteria) this;
        }

        public Criteria andHeadimgurlNotIn(List<String> values) {
            addCriterion("headimgurl not in", values, "headimgurl");
            return (Criteria) this;
        }

        public Criteria andHeadimgurlBetween(String value1, String value2) {
            addCriterion("headimgurl between", value1, value2, "headimgurl");
            return (Criteria) this;
        }

        public Criteria andHeadimgurlNotBetween(String value1, String value2) {
            addCriterion("headimgurl not between", value1, value2, "headimgurl");
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

        public Criteria andAccountIsNull() {
            addCriterion("account is null");
            return (Criteria) this;
        }

        public Criteria andAccountIsNotNull() {
            addCriterion("account is not null");
            return (Criteria) this;
        }

        public Criteria andAccountEqualTo(BigDecimal value) {
            addCriterion("account =", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotEqualTo(BigDecimal value) {
            addCriterion("account <>", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountGreaterThan(BigDecimal value) {
            addCriterion("account >", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("account >=", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLessThan(BigDecimal value) {
            addCriterion("account <", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("account <=", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountIn(List<BigDecimal> values) {
            addCriterion("account in", values, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotIn(List<BigDecimal> values) {
            addCriterion("account not in", values, "account");
            return (Criteria) this;
        }

        public Criteria andAccountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("account between", value1, value2, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("account not between", value1, value2, "account");
            return (Criteria) this;
        }

        public Criteria andParentNameIsNull() {
            addCriterion("parent_name is null");
            return (Criteria) this;
        }

        public Criteria andParentNameIsNotNull() {
            addCriterion("parent_name is not null");
            return (Criteria) this;
        }

        public Criteria andParentNameEqualTo(String value) {
            addCriterion("parent_name =", value, "parentName");
            return (Criteria) this;
        }

        public Criteria andParentNameNotEqualTo(String value) {
            addCriterion("parent_name <>", value, "parentName");
            return (Criteria) this;
        }

        public Criteria andParentNameGreaterThan(String value) {
            addCriterion("parent_name >", value, "parentName");
            return (Criteria) this;
        }

        public Criteria andParentNameGreaterThanOrEqualTo(String value) {
            addCriterion("parent_name >=", value, "parentName");
            return (Criteria) this;
        }

        public Criteria andParentNameLessThan(String value) {
            addCriterion("parent_name <", value, "parentName");
            return (Criteria) this;
        }

        public Criteria andParentNameLessThanOrEqualTo(String value) {
            addCriterion("parent_name <=", value, "parentName");
            return (Criteria) this;
        }

        public Criteria andParentNameLike(String value) {
            addCriterion("parent_name like", value, "parentName");
            return (Criteria) this;
        }

        public Criteria andParentNameNotLike(String value) {
            addCriterion("parent_name not like", value, "parentName");
            return (Criteria) this;
        }

        public Criteria andParentNameIn(List<String> values) {
            addCriterion("parent_name in", values, "parentName");
            return (Criteria) this;
        }

        public Criteria andParentNameNotIn(List<String> values) {
            addCriterion("parent_name not in", values, "parentName");
            return (Criteria) this;
        }

        public Criteria andParentNameBetween(String value1, String value2) {
            addCriterion("parent_name between", value1, value2, "parentName");
            return (Criteria) this;
        }

        public Criteria andParentNameNotBetween(String value1, String value2) {
            addCriterion("parent_name not between", value1, value2, "parentName");
            return (Criteria) this;
        }

        public Criteria andOpenidIsNull() {
            addCriterion("openid is null");
            return (Criteria) this;
        }

        public Criteria andOpenidIsNotNull() {
            addCriterion("openid is not null");
            return (Criteria) this;
        }

        public Criteria andOpenidEqualTo(String value) {
            addCriterion("openid =", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotEqualTo(String value) {
            addCriterion("openid <>", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidGreaterThan(String value) {
            addCriterion("openid >", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidGreaterThanOrEqualTo(String value) {
            addCriterion("openid >=", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidLessThan(String value) {
            addCriterion("openid <", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidLessThanOrEqualTo(String value) {
            addCriterion("openid <=", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidLike(String value) {
            addCriterion("openid like", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotLike(String value) {
            addCriterion("openid not like", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidIn(List<String> values) {
            addCriterion("openid in", values, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotIn(List<String> values) {
            addCriterion("openid not in", values, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidBetween(String value1, String value2) {
            addCriterion("openid between", value1, value2, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotBetween(String value1, String value2) {
            addCriterion("openid not between", value1, value2, "openid");
            return (Criteria) this;
        }

        public Criteria andAllPointsIsNull() {
            addCriterion("all_points is null");
            return (Criteria) this;
        }

        public Criteria andAllPointsIsNotNull() {
            addCriterion("all_points is not null");
            return (Criteria) this;
        }

        public Criteria andAllPointsEqualTo(Integer value) {
            addCriterion("all_points =", value, "allPoints");
            return (Criteria) this;
        }

        public Criteria andAllPointsNotEqualTo(Integer value) {
            addCriterion("all_points <>", value, "allPoints");
            return (Criteria) this;
        }

        public Criteria andAllPointsGreaterThan(Integer value) {
            addCriterion("all_points >", value, "allPoints");
            return (Criteria) this;
        }

        public Criteria andAllPointsGreaterThanOrEqualTo(Integer value) {
            addCriterion("all_points >=", value, "allPoints");
            return (Criteria) this;
        }

        public Criteria andAllPointsLessThan(Integer value) {
            addCriterion("all_points <", value, "allPoints");
            return (Criteria) this;
        }

        public Criteria andAllPointsLessThanOrEqualTo(Integer value) {
            addCriterion("all_points <=", value, "allPoints");
            return (Criteria) this;
        }

        public Criteria andAllPointsIn(List<Integer> values) {
            addCriterion("all_points in", values, "allPoints");
            return (Criteria) this;
        }

        public Criteria andAllPointsNotIn(List<Integer> values) {
            addCriterion("all_points not in", values, "allPoints");
            return (Criteria) this;
        }

        public Criteria andAllPointsBetween(Integer value1, Integer value2) {
            addCriterion("all_points between", value1, value2, "allPoints");
            return (Criteria) this;
        }

        public Criteria andAllPointsNotBetween(Integer value1, Integer value2) {
            addCriterion("all_points not between", value1, value2, "allPoints");
            return (Criteria) this;
        }

        public Criteria andPointsIsNull() {
            addCriterion("points is null");
            return (Criteria) this;
        }

        public Criteria andPointsIsNotNull() {
            addCriterion("points is not null");
            return (Criteria) this;
        }

        public Criteria andPointsEqualTo(Integer value) {
            addCriterion("points =", value, "points");
            return (Criteria) this;
        }

        public Criteria andPointsNotEqualTo(Integer value) {
            addCriterion("points <>", value, "points");
            return (Criteria) this;
        }

        public Criteria andPointsGreaterThan(Integer value) {
            addCriterion("points >", value, "points");
            return (Criteria) this;
        }

        public Criteria andPointsGreaterThanOrEqualTo(Integer value) {
            addCriterion("points >=", value, "points");
            return (Criteria) this;
        }

        public Criteria andPointsLessThan(Integer value) {
            addCriterion("points <", value, "points");
            return (Criteria) this;
        }

        public Criteria andPointsLessThanOrEqualTo(Integer value) {
            addCriterion("points <=", value, "points");
            return (Criteria) this;
        }

        public Criteria andPointsIn(List<Integer> values) {
            addCriterion("points in", values, "points");
            return (Criteria) this;
        }

        public Criteria andPointsNotIn(List<Integer> values) {
            addCriterion("points not in", values, "points");
            return (Criteria) this;
        }

        public Criteria andPointsBetween(Integer value1, Integer value2) {
            addCriterion("points between", value1, value2, "points");
            return (Criteria) this;
        }

        public Criteria andPointsNotBetween(Integer value1, Integer value2) {
            addCriterion("points not between", value1, value2, "points");
            return (Criteria) this;
        }

        public Criteria andUnionidIsNull() {
            addCriterion("unionid is null");
            return (Criteria) this;
        }

        public Criteria andUnionidIsNotNull() {
            addCriterion("unionid is not null");
            return (Criteria) this;
        }

        public Criteria andUnionidEqualTo(String value) {
            addCriterion("unionid =", value, "unionid");
            return (Criteria) this;
        }

        public Criteria andUnionidNotEqualTo(String value) {
            addCriterion("unionid <>", value, "unionid");
            return (Criteria) this;
        }

        public Criteria andUnionidGreaterThan(String value) {
            addCriterion("unionid >", value, "unionid");
            return (Criteria) this;
        }

        public Criteria andUnionidGreaterThanOrEqualTo(String value) {
            addCriterion("unionid >=", value, "unionid");
            return (Criteria) this;
        }

        public Criteria andUnionidLessThan(String value) {
            addCriterion("unionid <", value, "unionid");
            return (Criteria) this;
        }

        public Criteria andUnionidLessThanOrEqualTo(String value) {
            addCriterion("unionid <=", value, "unionid");
            return (Criteria) this;
        }

        public Criteria andUnionidLike(String value) {
            addCriterion("unionid like", value, "unionid");
            return (Criteria) this;
        }

        public Criteria andUnionidNotLike(String value) {
            addCriterion("unionid not like", value, "unionid");
            return (Criteria) this;
        }

        public Criteria andUnionidIn(List<String> values) {
            addCriterion("unionid in", values, "unionid");
            return (Criteria) this;
        }

        public Criteria andUnionidNotIn(List<String> values) {
            addCriterion("unionid not in", values, "unionid");
            return (Criteria) this;
        }

        public Criteria andUnionidBetween(String value1, String value2) {
            addCriterion("unionid between", value1, value2, "unionid");
            return (Criteria) this;
        }

        public Criteria andUnionidNotBetween(String value1, String value2) {
            addCriterion("unionid not between", value1, value2, "unionid");
            return (Criteria) this;
        }

        public Criteria andLastloginIsNull() {
            addCriterion("lastlogin is null");
            return (Criteria) this;
        }

        public Criteria andLastloginIsNotNull() {
            addCriterion("lastlogin is not null");
            return (Criteria) this;
        }

        public Criteria andLastloginEqualTo(Integer value) {
            addCriterion("lastlogin =", value, "lastlogin");
            return (Criteria) this;
        }

        public Criteria andLastloginNotEqualTo(Integer value) {
            addCriterion("lastlogin <>", value, "lastlogin");
            return (Criteria) this;
        }

        public Criteria andLastloginGreaterThan(Integer value) {
            addCriterion("lastlogin >", value, "lastlogin");
            return (Criteria) this;
        }

        public Criteria andLastloginGreaterThanOrEqualTo(Integer value) {
            addCriterion("lastlogin >=", value, "lastlogin");
            return (Criteria) this;
        }

        public Criteria andLastloginLessThan(Integer value) {
            addCriterion("lastlogin <", value, "lastlogin");
            return (Criteria) this;
        }

        public Criteria andLastloginLessThanOrEqualTo(Integer value) {
            addCriterion("lastlogin <=", value, "lastlogin");
            return (Criteria) this;
        }

        public Criteria andLastloginIn(List<Integer> values) {
            addCriterion("lastlogin in", values, "lastlogin");
            return (Criteria) this;
        }

        public Criteria andLastloginNotIn(List<Integer> values) {
            addCriterion("lastlogin not in", values, "lastlogin");
            return (Criteria) this;
        }

        public Criteria andLastloginBetween(Integer value1, Integer value2) {
            addCriterion("lastlogin between", value1, value2, "lastlogin");
            return (Criteria) this;
        }

        public Criteria andLastloginNotBetween(Integer value1, Integer value2) {
            addCriterion("lastlogin not between", value1, value2, "lastlogin");
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

        public Criteria andShenfengzhengIsNull() {
            addCriterion("shenfengzheng is null");
            return (Criteria) this;
        }

        public Criteria andShenfengzhengIsNotNull() {
            addCriterion("shenfengzheng is not null");
            return (Criteria) this;
        }

        public Criteria andShenfengzhengEqualTo(String value) {
            addCriterion("shenfengzheng =", value, "shenfengzheng");
            return (Criteria) this;
        }

        public Criteria andShenfengzhengNotEqualTo(String value) {
            addCriterion("shenfengzheng <>", value, "shenfengzheng");
            return (Criteria) this;
        }

        public Criteria andShenfengzhengGreaterThan(String value) {
            addCriterion("shenfengzheng >", value, "shenfengzheng");
            return (Criteria) this;
        }

        public Criteria andShenfengzhengGreaterThanOrEqualTo(String value) {
            addCriterion("shenfengzheng >=", value, "shenfengzheng");
            return (Criteria) this;
        }

        public Criteria andShenfengzhengLessThan(String value) {
            addCriterion("shenfengzheng <", value, "shenfengzheng");
            return (Criteria) this;
        }

        public Criteria andShenfengzhengLessThanOrEqualTo(String value) {
            addCriterion("shenfengzheng <=", value, "shenfengzheng");
            return (Criteria) this;
        }

        public Criteria andShenfengzhengLike(String value) {
            addCriterion("shenfengzheng like", value, "shenfengzheng");
            return (Criteria) this;
        }

        public Criteria andShenfengzhengNotLike(String value) {
            addCriterion("shenfengzheng not like", value, "shenfengzheng");
            return (Criteria) this;
        }

        public Criteria andShenfengzhengIn(List<String> values) {
            addCriterion("shenfengzheng in", values, "shenfengzheng");
            return (Criteria) this;
        }

        public Criteria andShenfengzhengNotIn(List<String> values) {
            addCriterion("shenfengzheng not in", values, "shenfengzheng");
            return (Criteria) this;
        }

        public Criteria andShenfengzhengBetween(String value1, String value2) {
            addCriterion("shenfengzheng between", value1, value2, "shenfengzheng");
            return (Criteria) this;
        }

        public Criteria andShenfengzhengNotBetween(String value1, String value2) {
            addCriterion("shenfengzheng not between", value1, value2, "shenfengzheng");
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

        public Criteria andStartTimeIsNull() {
            addCriterion("start_time is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("start_time is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(Integer value) {
            addCriterion("start_time =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(Integer value) {
            addCriterion("start_time <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(Integer value) {
            addCriterion("start_time >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("start_time >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(Integer value) {
            addCriterion("start_time <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(Integer value) {
            addCriterion("start_time <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<Integer> values) {
            addCriterion("start_time in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<Integer> values) {
            addCriterion("start_time not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(Integer value1, Integer value2) {
            addCriterion("start_time between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("start_time not between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("end_time is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("end_time is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(Integer value) {
            addCriterion("end_time =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(Integer value) {
            addCriterion("end_time <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(Integer value) {
            addCriterion("end_time >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("end_time >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(Integer value) {
            addCriterion("end_time <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(Integer value) {
            addCriterion("end_time <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<Integer> values) {
            addCriterion("end_time in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<Integer> values) {
            addCriterion("end_time not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(Integer value1, Integer value2) {
            addCriterion("end_time between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("end_time not between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andAgentIdIsNull() {
            addCriterion("agent_id is null");
            return (Criteria) this;
        }

        public Criteria andAgentIdIsNotNull() {
            addCriterion("agent_id is not null");
            return (Criteria) this;
        }

        public Criteria andAgentIdEqualTo(Integer value) {
            addCriterion("agent_id =", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdNotEqualTo(Integer value) {
            addCriterion("agent_id <>", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdGreaterThan(Integer value) {
            addCriterion("agent_id >", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("agent_id >=", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdLessThan(Integer value) {
            addCriterion("agent_id <", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdLessThanOrEqualTo(Integer value) {
            addCriterion("agent_id <=", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdIn(List<Integer> values) {
            addCriterion("agent_id in", values, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdNotIn(List<Integer> values) {
            addCriterion("agent_id not in", values, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdBetween(Integer value1, Integer value2) {
            addCriterion("agent_id between", value1, value2, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("agent_id not between", value1, value2, "agentId");
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

        public Criteria andWxNumIsNull() {
            addCriterion("wx_num is null");
            return (Criteria) this;
        }

        public Criteria andWxNumIsNotNull() {
            addCriterion("wx_num is not null");
            return (Criteria) this;
        }

        public Criteria andWxNumEqualTo(Integer value) {
            addCriterion("wx_num =", value, "wxNum");
            return (Criteria) this;
        }

        public Criteria andWxNumNotEqualTo(Integer value) {
            addCriterion("wx_num <>", value, "wxNum");
            return (Criteria) this;
        }

        public Criteria andWxNumGreaterThan(Integer value) {
            addCriterion("wx_num >", value, "wxNum");
            return (Criteria) this;
        }

        public Criteria andWxNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("wx_num >=", value, "wxNum");
            return (Criteria) this;
        }

        public Criteria andWxNumLessThan(Integer value) {
            addCriterion("wx_num <", value, "wxNum");
            return (Criteria) this;
        }

        public Criteria andWxNumLessThanOrEqualTo(Integer value) {
            addCriterion("wx_num <=", value, "wxNum");
            return (Criteria) this;
        }

        public Criteria andWxNumIn(List<Integer> values) {
            addCriterion("wx_num in", values, "wxNum");
            return (Criteria) this;
        }

        public Criteria andWxNumNotIn(List<Integer> values) {
            addCriterion("wx_num not in", values, "wxNum");
            return (Criteria) this;
        }

        public Criteria andWxNumBetween(Integer value1, Integer value2) {
            addCriterion("wx_num between", value1, value2, "wxNum");
            return (Criteria) this;
        }

        public Criteria andWxNumNotBetween(Integer value1, Integer value2) {
            addCriterion("wx_num not between", value1, value2, "wxNum");
            return (Criteria) this;
        }

        public Criteria andWxQrcodeIsNull() {
            addCriterion("wx_qrcode is null");
            return (Criteria) this;
        }

        public Criteria andWxQrcodeIsNotNull() {
            addCriterion("wx_qrcode is not null");
            return (Criteria) this;
        }

        public Criteria andWxQrcodeEqualTo(String value) {
            addCriterion("wx_qrcode =", value, "wxQrcode");
            return (Criteria) this;
        }

        public Criteria andWxQrcodeNotEqualTo(String value) {
            addCriterion("wx_qrcode <>", value, "wxQrcode");
            return (Criteria) this;
        }

        public Criteria andWxQrcodeGreaterThan(String value) {
            addCriterion("wx_qrcode >", value, "wxQrcode");
            return (Criteria) this;
        }

        public Criteria andWxQrcodeGreaterThanOrEqualTo(String value) {
            addCriterion("wx_qrcode >=", value, "wxQrcode");
            return (Criteria) this;
        }

        public Criteria andWxQrcodeLessThan(String value) {
            addCriterion("wx_qrcode <", value, "wxQrcode");
            return (Criteria) this;
        }

        public Criteria andWxQrcodeLessThanOrEqualTo(String value) {
            addCriterion("wx_qrcode <=", value, "wxQrcode");
            return (Criteria) this;
        }

        public Criteria andWxQrcodeLike(String value) {
            addCriterion("wx_qrcode like", value, "wxQrcode");
            return (Criteria) this;
        }

        public Criteria andWxQrcodeNotLike(String value) {
            addCriterion("wx_qrcode not like", value, "wxQrcode");
            return (Criteria) this;
        }

        public Criteria andWxQrcodeIn(List<String> values) {
            addCriterion("wx_qrcode in", values, "wxQrcode");
            return (Criteria) this;
        }

        public Criteria andWxQrcodeNotIn(List<String> values) {
            addCriterion("wx_qrcode not in", values, "wxQrcode");
            return (Criteria) this;
        }

        public Criteria andWxQrcodeBetween(String value1, String value2) {
            addCriterion("wx_qrcode between", value1, value2, "wxQrcode");
            return (Criteria) this;
        }

        public Criteria andWxQrcodeNotBetween(String value1, String value2) {
            addCriterion("wx_qrcode not between", value1, value2, "wxQrcode");
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

        public Criteria andIsSubscribeIsNull() {
            addCriterion("is_subscribe is null");
            return (Criteria) this;
        }

        public Criteria andIsSubscribeIsNotNull() {
            addCriterion("is_subscribe is not null");
            return (Criteria) this;
        }

        public Criteria andIsSubscribeEqualTo(Short value) {
            addCriterion("is_subscribe =", value, "isSubscribe");
            return (Criteria) this;
        }

        public Criteria andIsSubscribeNotEqualTo(Short value) {
            addCriterion("is_subscribe <>", value, "isSubscribe");
            return (Criteria) this;
        }

        public Criteria andIsSubscribeGreaterThan(Short value) {
            addCriterion("is_subscribe >", value, "isSubscribe");
            return (Criteria) this;
        }

        public Criteria andIsSubscribeGreaterThanOrEqualTo(Short value) {
            addCriterion("is_subscribe >=", value, "isSubscribe");
            return (Criteria) this;
        }

        public Criteria andIsSubscribeLessThan(Short value) {
            addCriterion("is_subscribe <", value, "isSubscribe");
            return (Criteria) this;
        }

        public Criteria andIsSubscribeLessThanOrEqualTo(Short value) {
            addCriterion("is_subscribe <=", value, "isSubscribe");
            return (Criteria) this;
        }

        public Criteria andIsSubscribeIn(List<Short> values) {
            addCriterion("is_subscribe in", values, "isSubscribe");
            return (Criteria) this;
        }

        public Criteria andIsSubscribeNotIn(List<Short> values) {
            addCriterion("is_subscribe not in", values, "isSubscribe");
            return (Criteria) this;
        }

        public Criteria andIsSubscribeBetween(Short value1, Short value2) {
            addCriterion("is_subscribe between", value1, value2, "isSubscribe");
            return (Criteria) this;
        }

        public Criteria andIsSubscribeNotBetween(Short value1, Short value2) {
            addCriterion("is_subscribe not between", value1, value2, "isSubscribe");
            return (Criteria) this;
        }

        public Criteria andGradeIdIsNull() {
            addCriterion("grade_id is null");
            return (Criteria) this;
        }

        public Criteria andGradeIdIsNotNull() {
            addCriterion("grade_id is not null");
            return (Criteria) this;
        }

        public Criteria andGradeIdEqualTo(Integer value) {
            addCriterion("grade_id =", value, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdNotEqualTo(Integer value) {
            addCriterion("grade_id <>", value, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdGreaterThan(Integer value) {
            addCriterion("grade_id >", value, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("grade_id >=", value, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdLessThan(Integer value) {
            addCriterion("grade_id <", value, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdLessThanOrEqualTo(Integer value) {
            addCriterion("grade_id <=", value, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdIn(List<Integer> values) {
            addCriterion("grade_id in", values, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdNotIn(List<Integer> values) {
            addCriterion("grade_id not in", values, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdBetween(Integer value1, Integer value2) {
            addCriterion("grade_id between", value1, value2, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("grade_id not between", value1, value2, "gradeId");
            return (Criteria) this;
        }

        public Criteria andRoleIdIsNull() {
            addCriterion("role_id is null");
            return (Criteria) this;
        }

        public Criteria andRoleIdIsNotNull() {
            addCriterion("role_id is not null");
            return (Criteria) this;
        }

        public Criteria andRoleIdEqualTo(Integer value) {
            addCriterion("role_id =", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotEqualTo(Integer value) {
            addCriterion("role_id <>", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdGreaterThan(Integer value) {
            addCriterion("role_id >", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("role_id >=", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdLessThan(Integer value) {
            addCriterion("role_id <", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdLessThanOrEqualTo(Integer value) {
            addCriterion("role_id <=", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdIn(List<Integer> values) {
            addCriterion("role_id in", values, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotIn(List<Integer> values) {
            addCriterion("role_id not in", values, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdBetween(Integer value1, Integer value2) {
            addCriterion("role_id between", value1, value2, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("role_id not between", value1, value2, "roleId");
            return (Criteria) this;
        }

        public Criteria andLinkmanIsNull() {
            addCriterion("linkman is null");
            return (Criteria) this;
        }

        public Criteria andLinkmanIsNotNull() {
            addCriterion("linkman is not null");
            return (Criteria) this;
        }

        public Criteria andLinkmanEqualTo(String value) {
            addCriterion("linkman =", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanNotEqualTo(String value) {
            addCriterion("linkman <>", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanGreaterThan(String value) {
            addCriterion("linkman >", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanGreaterThanOrEqualTo(String value) {
            addCriterion("linkman >=", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanLessThan(String value) {
            addCriterion("linkman <", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanLessThanOrEqualTo(String value) {
            addCriterion("linkman <=", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanLike(String value) {
            addCriterion("linkman like", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanNotLike(String value) {
            addCriterion("linkman not like", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanIn(List<String> values) {
            addCriterion("linkman in", values, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanNotIn(List<String> values) {
            addCriterion("linkman not in", values, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanBetween(String value1, String value2) {
            addCriterion("linkman between", value1, value2, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanNotBetween(String value1, String value2) {
            addCriterion("linkman not between", value1, value2, "linkman");
            return (Criteria) this;
        }

        public Criteria andIsApproveIsNull() {
            addCriterion("is_approve is null");
            return (Criteria) this;
        }

        public Criteria andIsApproveIsNotNull() {
            addCriterion("is_approve is not null");
            return (Criteria) this;
        }

        public Criteria andIsApproveEqualTo(Short value) {
            addCriterion("is_approve =", value, "isApprove");
            return (Criteria) this;
        }

        public Criteria andIsApproveNotEqualTo(Short value) {
            addCriterion("is_approve <>", value, "isApprove");
            return (Criteria) this;
        }

        public Criteria andIsApproveGreaterThan(Short value) {
            addCriterion("is_approve >", value, "isApprove");
            return (Criteria) this;
        }

        public Criteria andIsApproveGreaterThanOrEqualTo(Short value) {
            addCriterion("is_approve >=", value, "isApprove");
            return (Criteria) this;
        }

        public Criteria andIsApproveLessThan(Short value) {
            addCriterion("is_approve <", value, "isApprove");
            return (Criteria) this;
        }

        public Criteria andIsApproveLessThanOrEqualTo(Short value) {
            addCriterion("is_approve <=", value, "isApprove");
            return (Criteria) this;
        }

        public Criteria andIsApproveIn(List<Short> values) {
            addCriterion("is_approve in", values, "isApprove");
            return (Criteria) this;
        }

        public Criteria andIsApproveNotIn(List<Short> values) {
            addCriterion("is_approve not in", values, "isApprove");
            return (Criteria) this;
        }

        public Criteria andIsApproveBetween(Short value1, Short value2) {
            addCriterion("is_approve between", value1, value2, "isApprove");
            return (Criteria) this;
        }

        public Criteria andIsApproveNotBetween(Short value1, Short value2) {
            addCriterion("is_approve not between", value1, value2, "isApprove");
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

        public Criteria andImgUrlIsNull() {
            addCriterion("img_url is null");
            return (Criteria) this;
        }

        public Criteria andImgUrlIsNotNull() {
            addCriterion("img_url is not null");
            return (Criteria) this;
        }

        public Criteria andImgUrlEqualTo(String value) {
            addCriterion("img_url =", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlNotEqualTo(String value) {
            addCriterion("img_url <>", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlGreaterThan(String value) {
            addCriterion("img_url >", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlGreaterThanOrEqualTo(String value) {
            addCriterion("img_url >=", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlLessThan(String value) {
            addCriterion("img_url <", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlLessThanOrEqualTo(String value) {
            addCriterion("img_url <=", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlLike(String value) {
            addCriterion("img_url like", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlNotLike(String value) {
            addCriterion("img_url not like", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlIn(List<String> values) {
            addCriterion("img_url in", values, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlNotIn(List<String> values) {
            addCriterion("img_url not in", values, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlBetween(String value1, String value2) {
            addCriterion("img_url between", value1, value2, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlNotBetween(String value1, String value2) {
            addCriterion("img_url not between", value1, value2, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andPapersIdIsNull() {
            addCriterion("papers_id is null");
            return (Criteria) this;
        }

        public Criteria andPapersIdIsNotNull() {
            addCriterion("papers_id is not null");
            return (Criteria) this;
        }

        public Criteria andPapersIdEqualTo(String value) {
            addCriterion("papers_id =", value, "papersId");
            return (Criteria) this;
        }

        public Criteria andPapersIdNotEqualTo(String value) {
            addCriterion("papers_id <>", value, "papersId");
            return (Criteria) this;
        }

        public Criteria andPapersIdGreaterThan(String value) {
            addCriterion("papers_id >", value, "papersId");
            return (Criteria) this;
        }

        public Criteria andPapersIdGreaterThanOrEqualTo(String value) {
            addCriterion("papers_id >=", value, "papersId");
            return (Criteria) this;
        }

        public Criteria andPapersIdLessThan(String value) {
            addCriterion("papers_id <", value, "papersId");
            return (Criteria) this;
        }

        public Criteria andPapersIdLessThanOrEqualTo(String value) {
            addCriterion("papers_id <=", value, "papersId");
            return (Criteria) this;
        }

        public Criteria andPapersIdLike(String value) {
            addCriterion("papers_id like", value, "papersId");
            return (Criteria) this;
        }

        public Criteria andPapersIdNotLike(String value) {
            addCriterion("papers_id not like", value, "papersId");
            return (Criteria) this;
        }

        public Criteria andPapersIdIn(List<String> values) {
            addCriterion("papers_id in", values, "papersId");
            return (Criteria) this;
        }

        public Criteria andPapersIdNotIn(List<String> values) {
            addCriterion("papers_id not in", values, "papersId");
            return (Criteria) this;
        }

        public Criteria andPapersIdBetween(String value1, String value2) {
            addCriterion("papers_id between", value1, value2, "papersId");
            return (Criteria) this;
        }

        public Criteria andPapersIdNotBetween(String value1, String value2) {
            addCriterion("papers_id not between", value1, value2, "papersId");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(Short value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(Short value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(Short value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(Short value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(Short value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(Short value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<Short> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<Short> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(Short value1, Short value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(Short value1, Short value2) {
            addCriterion("sex not between", value1, value2, "sex");
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

        public Criteria andIsRenzhengEqualTo(Short value) {
            addCriterion("is_renzheng =", value, "isRenzheng");
            return (Criteria) this;
        }

        public Criteria andIsRenzhengNotEqualTo(Short value) {
            addCriterion("is_renzheng <>", value, "isRenzheng");
            return (Criteria) this;
        }

        public Criteria andIsRenzhengGreaterThan(Short value) {
            addCriterion("is_renzheng >", value, "isRenzheng");
            return (Criteria) this;
        }

        public Criteria andIsRenzhengGreaterThanOrEqualTo(Short value) {
            addCriterion("is_renzheng >=", value, "isRenzheng");
            return (Criteria) this;
        }

        public Criteria andIsRenzhengLessThan(Short value) {
            addCriterion("is_renzheng <", value, "isRenzheng");
            return (Criteria) this;
        }

        public Criteria andIsRenzhengLessThanOrEqualTo(Short value) {
            addCriterion("is_renzheng <=", value, "isRenzheng");
            return (Criteria) this;
        }

        public Criteria andIsRenzhengIn(List<Short> values) {
            addCriterion("is_renzheng in", values, "isRenzheng");
            return (Criteria) this;
        }

        public Criteria andIsRenzhengNotIn(List<Short> values) {
            addCriterion("is_renzheng not in", values, "isRenzheng");
            return (Criteria) this;
        }

        public Criteria andIsRenzhengBetween(Short value1, Short value2) {
            addCriterion("is_renzheng between", value1, value2, "isRenzheng");
            return (Criteria) this;
        }

        public Criteria andIsRenzhengNotBetween(Short value1, Short value2) {
            addCriterion("is_renzheng not between", value1, value2, "isRenzheng");
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

        public Criteria andIsPayIsNull() {
            addCriterion("is_pay is null");
            return (Criteria) this;
        }

        public Criteria andIsPayIsNotNull() {
            addCriterion("is_pay is not null");
            return (Criteria) this;
        }

        public Criteria andIsPayEqualTo(Short value) {
            addCriterion("is_pay =", value, "isPay");
            return (Criteria) this;
        }

        public Criteria andIsPayNotEqualTo(Short value) {
            addCriterion("is_pay <>", value, "isPay");
            return (Criteria) this;
        }

        public Criteria andIsPayGreaterThan(Short value) {
            addCriterion("is_pay >", value, "isPay");
            return (Criteria) this;
        }

        public Criteria andIsPayGreaterThanOrEqualTo(Short value) {
            addCriterion("is_pay >=", value, "isPay");
            return (Criteria) this;
        }

        public Criteria andIsPayLessThan(Short value) {
            addCriterion("is_pay <", value, "isPay");
            return (Criteria) this;
        }

        public Criteria andIsPayLessThanOrEqualTo(Short value) {
            addCriterion("is_pay <=", value, "isPay");
            return (Criteria) this;
        }

        public Criteria andIsPayIn(List<Short> values) {
            addCriterion("is_pay in", values, "isPay");
            return (Criteria) this;
        }

        public Criteria andIsPayNotIn(List<Short> values) {
            addCriterion("is_pay not in", values, "isPay");
            return (Criteria) this;
        }

        public Criteria andIsPayBetween(Short value1, Short value2) {
            addCriterion("is_pay between", value1, value2, "isPay");
            return (Criteria) this;
        }

        public Criteria andIsPayNotBetween(Short value1, Short value2) {
            addCriterion("is_pay not between", value1, value2, "isPay");
            return (Criteria) this;
        }

        public Criteria andRongcloudTokenIsNull() {
            addCriterion("rongcloud_token is null");
            return (Criteria) this;
        }

        public Criteria andRongcloudTokenIsNotNull() {
            addCriterion("rongcloud_token is not null");
            return (Criteria) this;
        }

        public Criteria andRongcloudTokenEqualTo(String value) {
            addCriterion("rongcloud_token =", value, "rongcloudToken");
            return (Criteria) this;
        }

        public Criteria andRongcloudTokenNotEqualTo(String value) {
            addCriterion("rongcloud_token <>", value, "rongcloudToken");
            return (Criteria) this;
        }

        public Criteria andRongcloudTokenGreaterThan(String value) {
            addCriterion("rongcloud_token >", value, "rongcloudToken");
            return (Criteria) this;
        }

        public Criteria andRongcloudTokenGreaterThanOrEqualTo(String value) {
            addCriterion("rongcloud_token >=", value, "rongcloudToken");
            return (Criteria) this;
        }

        public Criteria andRongcloudTokenLessThan(String value) {
            addCriterion("rongcloud_token <", value, "rongcloudToken");
            return (Criteria) this;
        }

        public Criteria andRongcloudTokenLessThanOrEqualTo(String value) {
            addCriterion("rongcloud_token <=", value, "rongcloudToken");
            return (Criteria) this;
        }

        public Criteria andRongcloudTokenLike(String value) {
            addCriterion("rongcloud_token like", value, "rongcloudToken");
            return (Criteria) this;
        }

        public Criteria andRongcloudTokenNotLike(String value) {
            addCriterion("rongcloud_token not like", value, "rongcloudToken");
            return (Criteria) this;
        }

        public Criteria andRongcloudTokenIn(List<String> values) {
            addCriterion("rongcloud_token in", values, "rongcloudToken");
            return (Criteria) this;
        }

        public Criteria andRongcloudTokenNotIn(List<String> values) {
            addCriterion("rongcloud_token not in", values, "rongcloudToken");
            return (Criteria) this;
        }

        public Criteria andRongcloudTokenBetween(String value1, String value2) {
            addCriterion("rongcloud_token between", value1, value2, "rongcloudToken");
            return (Criteria) this;
        }

        public Criteria andRongcloudTokenNotBetween(String value1, String value2) {
            addCriterion("rongcloud_token not between", value1, value2, "rongcloudToken");
            return (Criteria) this;
        }

        public Criteria andDeviceTokenIsNull() {
            addCriterion("device_token is null");
            return (Criteria) this;
        }

        public Criteria andDeviceTokenIsNotNull() {
            addCriterion("device_token is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceTokenEqualTo(String value) {
            addCriterion("device_token =", value, "deviceToken");
            return (Criteria) this;
        }

        public Criteria andDeviceTokenNotEqualTo(String value) {
            addCriterion("device_token <>", value, "deviceToken");
            return (Criteria) this;
        }

        public Criteria andDeviceTokenGreaterThan(String value) {
            addCriterion("device_token >", value, "deviceToken");
            return (Criteria) this;
        }

        public Criteria andDeviceTokenGreaterThanOrEqualTo(String value) {
            addCriterion("device_token >=", value, "deviceToken");
            return (Criteria) this;
        }

        public Criteria andDeviceTokenLessThan(String value) {
            addCriterion("device_token <", value, "deviceToken");
            return (Criteria) this;
        }

        public Criteria andDeviceTokenLessThanOrEqualTo(String value) {
            addCriterion("device_token <=", value, "deviceToken");
            return (Criteria) this;
        }

        public Criteria andDeviceTokenLike(String value) {
            addCriterion("device_token like", value, "deviceToken");
            return (Criteria) this;
        }

        public Criteria andDeviceTokenNotLike(String value) {
            addCriterion("device_token not like", value, "deviceToken");
            return (Criteria) this;
        }

        public Criteria andDeviceTokenIn(List<String> values) {
            addCriterion("device_token in", values, "deviceToken");
            return (Criteria) this;
        }

        public Criteria andDeviceTokenNotIn(List<String> values) {
            addCriterion("device_token not in", values, "deviceToken");
            return (Criteria) this;
        }

        public Criteria andDeviceTokenBetween(String value1, String value2) {
            addCriterion("device_token between", value1, value2, "deviceToken");
            return (Criteria) this;
        }

        public Criteria andDeviceTokenNotBetween(String value1, String value2) {
            addCriterion("device_token not between", value1, value2, "deviceToken");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeIsNull() {
            addCriterion("device_type is null");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeIsNotNull() {
            addCriterion("device_type is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeEqualTo(String value) {
            addCriterion("device_type =", value, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeNotEqualTo(String value) {
            addCriterion("device_type <>", value, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeGreaterThan(String value) {
            addCriterion("device_type >", value, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeGreaterThanOrEqualTo(String value) {
            addCriterion("device_type >=", value, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeLessThan(String value) {
            addCriterion("device_type <", value, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeLessThanOrEqualTo(String value) {
            addCriterion("device_type <=", value, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeLike(String value) {
            addCriterion("device_type like", value, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeNotLike(String value) {
            addCriterion("device_type not like", value, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeIn(List<String> values) {
            addCriterion("device_type in", values, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeNotIn(List<String> values) {
            addCriterion("device_type not in", values, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeBetween(String value1, String value2) {
            addCriterion("device_type between", value1, value2, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeNotBetween(String value1, String value2) {
            addCriterion("device_type not between", value1, value2, "deviceType");
            return (Criteria) this;
        }

        public Criteria andHasLoginedIsNull() {
            addCriterion("has_logined is null");
            return (Criteria) this;
        }

        public Criteria andHasLoginedIsNotNull() {
            addCriterion("has_logined is not null");
            return (Criteria) this;
        }

        public Criteria andHasLoginedEqualTo(String value) {
            addCriterion("has_logined =", value, "hasLogined");
            return (Criteria) this;
        }

        public Criteria andHasLoginedNotEqualTo(String value) {
            addCriterion("has_logined <>", value, "hasLogined");
            return (Criteria) this;
        }

        public Criteria andHasLoginedGreaterThan(String value) {
            addCriterion("has_logined >", value, "hasLogined");
            return (Criteria) this;
        }

        public Criteria andHasLoginedGreaterThanOrEqualTo(String value) {
            addCriterion("has_logined >=", value, "hasLogined");
            return (Criteria) this;
        }

        public Criteria andHasLoginedLessThan(String value) {
            addCriterion("has_logined <", value, "hasLogined");
            return (Criteria) this;
        }

        public Criteria andHasLoginedLessThanOrEqualTo(String value) {
            addCriterion("has_logined <=", value, "hasLogined");
            return (Criteria) this;
        }

        public Criteria andHasLoginedLike(String value) {
            addCriterion("has_logined like", value, "hasLogined");
            return (Criteria) this;
        }

        public Criteria andHasLoginedNotLike(String value) {
            addCriterion("has_logined not like", value, "hasLogined");
            return (Criteria) this;
        }

        public Criteria andHasLoginedIn(List<String> values) {
            addCriterion("has_logined in", values, "hasLogined");
            return (Criteria) this;
        }

        public Criteria andHasLoginedNotIn(List<String> values) {
            addCriterion("has_logined not in", values, "hasLogined");
            return (Criteria) this;
        }

        public Criteria andHasLoginedBetween(String value1, String value2) {
            addCriterion("has_logined between", value1, value2, "hasLogined");
            return (Criteria) this;
        }

        public Criteria andHasLoginedNotBetween(String value1, String value2) {
            addCriterion("has_logined not between", value1, value2, "hasLogined");
            return (Criteria) this;
        }

        public Criteria andUserwebStatusIsNull() {
            addCriterion("userweb_status is null");
            return (Criteria) this;
        }

        public Criteria andUserwebStatusIsNotNull() {
            addCriterion("userweb_status is not null");
            return (Criteria) this;
        }

        public Criteria andUserwebStatusEqualTo(Integer value) {
            addCriterion("userweb_status =", value, "userwebStatus");
            return (Criteria) this;
        }

        public Criteria andUserwebStatusNotEqualTo(Integer value) {
            addCriterion("userweb_status <>", value, "userwebStatus");
            return (Criteria) this;
        }

        public Criteria andUserwebStatusGreaterThan(Integer value) {
            addCriterion("userweb_status >", value, "userwebStatus");
            return (Criteria) this;
        }

        public Criteria andUserwebStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("userweb_status >=", value, "userwebStatus");
            return (Criteria) this;
        }

        public Criteria andUserwebStatusLessThan(Integer value) {
            addCriterion("userweb_status <", value, "userwebStatus");
            return (Criteria) this;
        }

        public Criteria andUserwebStatusLessThanOrEqualTo(Integer value) {
            addCriterion("userweb_status <=", value, "userwebStatus");
            return (Criteria) this;
        }

        public Criteria andUserwebStatusIn(List<Integer> values) {
            addCriterion("userweb_status in", values, "userwebStatus");
            return (Criteria) this;
        }

        public Criteria andUserwebStatusNotIn(List<Integer> values) {
            addCriterion("userweb_status not in", values, "userwebStatus");
            return (Criteria) this;
        }

        public Criteria andUserwebStatusBetween(Integer value1, Integer value2) {
            addCriterion("userweb_status between", value1, value2, "userwebStatus");
            return (Criteria) this;
        }

        public Criteria andUserwebStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("userweb_status not between", value1, value2, "userwebStatus");
            return (Criteria) this;
        }

        public Criteria andUserwebEndTimeIsNull() {
            addCriterion("userweb_end_time is null");
            return (Criteria) this;
        }

        public Criteria andUserwebEndTimeIsNotNull() {
            addCriterion("userweb_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andUserwebEndTimeEqualTo(Integer value) {
            addCriterion("userweb_end_time =", value, "userwebEndTime");
            return (Criteria) this;
        }

        public Criteria andUserwebEndTimeNotEqualTo(Integer value) {
            addCriterion("userweb_end_time <>", value, "userwebEndTime");
            return (Criteria) this;
        }

        public Criteria andUserwebEndTimeGreaterThan(Integer value) {
            addCriterion("userweb_end_time >", value, "userwebEndTime");
            return (Criteria) this;
        }

        public Criteria andUserwebEndTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("userweb_end_time >=", value, "userwebEndTime");
            return (Criteria) this;
        }

        public Criteria andUserwebEndTimeLessThan(Integer value) {
            addCriterion("userweb_end_time <", value, "userwebEndTime");
            return (Criteria) this;
        }

        public Criteria andUserwebEndTimeLessThanOrEqualTo(Integer value) {
            addCriterion("userweb_end_time <=", value, "userwebEndTime");
            return (Criteria) this;
        }

        public Criteria andUserwebEndTimeIn(List<Integer> values) {
            addCriterion("userweb_end_time in", values, "userwebEndTime");
            return (Criteria) this;
        }

        public Criteria andUserwebEndTimeNotIn(List<Integer> values) {
            addCriterion("userweb_end_time not in", values, "userwebEndTime");
            return (Criteria) this;
        }

        public Criteria andUserwebEndTimeBetween(Integer value1, Integer value2) {
            addCriterion("userweb_end_time between", value1, value2, "userwebEndTime");
            return (Criteria) this;
        }

        public Criteria andUserwebEndTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("userweb_end_time not between", value1, value2, "userwebEndTime");
            return (Criteria) this;
        }

        public Criteria andLogintimeIsNull() {
            addCriterion("logintime is null");
            return (Criteria) this;
        }

        public Criteria andLogintimeIsNotNull() {
            addCriterion("logintime is not null");
            return (Criteria) this;
        }

        public Criteria andLogintimeEqualTo(Integer value) {
            addCriterion("logintime =", value, "logintime");
            return (Criteria) this;
        }

        public Criteria andLogintimeNotEqualTo(Integer value) {
            addCriterion("logintime <>", value, "logintime");
            return (Criteria) this;
        }

        public Criteria andLogintimeGreaterThan(Integer value) {
            addCriterion("logintime >", value, "logintime");
            return (Criteria) this;
        }

        public Criteria andLogintimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("logintime >=", value, "logintime");
            return (Criteria) this;
        }

        public Criteria andLogintimeLessThan(Integer value) {
            addCriterion("logintime <", value, "logintime");
            return (Criteria) this;
        }

        public Criteria andLogintimeLessThanOrEqualTo(Integer value) {
            addCriterion("logintime <=", value, "logintime");
            return (Criteria) this;
        }

        public Criteria andLogintimeIn(List<Integer> values) {
            addCriterion("logintime in", values, "logintime");
            return (Criteria) this;
        }

        public Criteria andLogintimeNotIn(List<Integer> values) {
            addCriterion("logintime not in", values, "logintime");
            return (Criteria) this;
        }

        public Criteria andLogintimeBetween(Integer value1, Integer value2) {
            addCriterion("logintime between", value1, value2, "logintime");
            return (Criteria) this;
        }

        public Criteria andLogintimeNotBetween(Integer value1, Integer value2) {
            addCriterion("logintime not between", value1, value2, "logintime");
            return (Criteria) this;
        }

        public Criteria andIsSupplierIsNull() {
            addCriterion("is_supplier is null");
            return (Criteria) this;
        }

        public Criteria andIsSupplierIsNotNull() {
            addCriterion("is_supplier is not null");
            return (Criteria) this;
        }

        public Criteria andIsSupplierEqualTo(Byte value) {
            addCriterion("is_supplier =", value, "isSupplier");
            return (Criteria) this;
        }

        public Criteria andIsSupplierNotEqualTo(Byte value) {
            addCriterion("is_supplier <>", value, "isSupplier");
            return (Criteria) this;
        }

        public Criteria andIsSupplierGreaterThan(Byte value) {
            addCriterion("is_supplier >", value, "isSupplier");
            return (Criteria) this;
        }

        public Criteria andIsSupplierGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_supplier >=", value, "isSupplier");
            return (Criteria) this;
        }

        public Criteria andIsSupplierLessThan(Byte value) {
            addCriterion("is_supplier <", value, "isSupplier");
            return (Criteria) this;
        }

        public Criteria andIsSupplierLessThanOrEqualTo(Byte value) {
            addCriterion("is_supplier <=", value, "isSupplier");
            return (Criteria) this;
        }

        public Criteria andIsSupplierIn(List<Byte> values) {
            addCriterion("is_supplier in", values, "isSupplier");
            return (Criteria) this;
        }

        public Criteria andIsSupplierNotIn(List<Byte> values) {
            addCriterion("is_supplier not in", values, "isSupplier");
            return (Criteria) this;
        }

        public Criteria andIsSupplierBetween(Byte value1, Byte value2) {
            addCriterion("is_supplier between", value1, value2, "isSupplier");
            return (Criteria) this;
        }

        public Criteria andIsSupplierNotBetween(Byte value1, Byte value2) {
            addCriterion("is_supplier not between", value1, value2, "isSupplier");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNull() {
            addCriterion("province is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNotNull() {
            addCriterion("province is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceEqualTo(Integer value) {
            addCriterion("province =", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotEqualTo(Integer value) {
            addCriterion("province <>", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThan(Integer value) {
            addCriterion("province >", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThanOrEqualTo(Integer value) {
            addCriterion("province >=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThan(Integer value) {
            addCriterion("province <", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThanOrEqualTo(Integer value) {
            addCriterion("province <=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceIn(List<Integer> values) {
            addCriterion("province in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotIn(List<Integer> values) {
            addCriterion("province not in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceBetween(Integer value1, Integer value2) {
            addCriterion("province between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotBetween(Integer value1, Integer value2) {
            addCriterion("province not between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("city is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("city is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(Integer value) {
            addCriterion("city =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(Integer value) {
            addCriterion("city <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(Integer value) {
            addCriterion("city >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(Integer value) {
            addCriterion("city >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(Integer value) {
            addCriterion("city <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(Integer value) {
            addCriterion("city <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<Integer> values) {
            addCriterion("city in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<Integer> values) {
            addCriterion("city not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(Integer value1, Integer value2) {
            addCriterion("city between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(Integer value1, Integer value2) {
            addCriterion("city not between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andAreaIsNull() {
            addCriterion("area is null");
            return (Criteria) this;
        }

        public Criteria andAreaIsNotNull() {
            addCriterion("area is not null");
            return (Criteria) this;
        }

        public Criteria andAreaEqualTo(Integer value) {
            addCriterion("area =", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotEqualTo(Integer value) {
            addCriterion("area <>", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThan(Integer value) {
            addCriterion("area >", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThanOrEqualTo(Integer value) {
            addCriterion("area >=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThan(Integer value) {
            addCriterion("area <", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThanOrEqualTo(Integer value) {
            addCriterion("area <=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaIn(List<Integer> values) {
            addCriterion("area in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotIn(List<Integer> values) {
            addCriterion("area not in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaBetween(Integer value1, Integer value2) {
            addCriterion("area between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotBetween(Integer value1, Integer value2) {
            addCriterion("area not between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andStreetIsNull() {
            addCriterion("street is null");
            return (Criteria) this;
        }

        public Criteria andStreetIsNotNull() {
            addCriterion("street is not null");
            return (Criteria) this;
        }

        public Criteria andStreetEqualTo(Integer value) {
            addCriterion("street =", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetNotEqualTo(Integer value) {
            addCriterion("street <>", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetGreaterThan(Integer value) {
            addCriterion("street >", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetGreaterThanOrEqualTo(Integer value) {
            addCriterion("street >=", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetLessThan(Integer value) {
            addCriterion("street <", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetLessThanOrEqualTo(Integer value) {
            addCriterion("street <=", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetIn(List<Integer> values) {
            addCriterion("street in", values, "street");
            return (Criteria) this;
        }

        public Criteria andStreetNotIn(List<Integer> values) {
            addCriterion("street not in", values, "street");
            return (Criteria) this;
        }

        public Criteria andStreetBetween(Integer value1, Integer value2) {
            addCriterion("street between", value1, value2, "street");
            return (Criteria) this;
        }

        public Criteria andStreetNotBetween(Integer value1, Integer value2) {
            addCriterion("street not between", value1, value2, "street");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
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

        public Criteria andUserStatusIsNull() {
            addCriterion("user_status is null");
            return (Criteria) this;
        }

        public Criteria andUserStatusIsNotNull() {
            addCriterion("user_status is not null");
            return (Criteria) this;
        }

        public Criteria andUserStatusEqualTo(Byte value) {
            addCriterion("user_status =", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusNotEqualTo(Byte value) {
            addCriterion("user_status <>", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusGreaterThan(Byte value) {
            addCriterion("user_status >", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("user_status >=", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusLessThan(Byte value) {
            addCriterion("user_status <", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusLessThanOrEqualTo(Byte value) {
            addCriterion("user_status <=", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusIn(List<Byte> values) {
            addCriterion("user_status in", values, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusNotIn(List<Byte> values) {
            addCriterion("user_status not in", values, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusBetween(Byte value1, Byte value2) {
            addCriterion("user_status between", value1, value2, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("user_status not between", value1, value2, "userStatus");
            return (Criteria) this;
        }

        public Criteria andAnnualFeeIsNull() {
            addCriterion("annual_fee is null");
            return (Criteria) this;
        }

        public Criteria andAnnualFeeIsNotNull() {
            addCriterion("annual_fee is not null");
            return (Criteria) this;
        }

        public Criteria andAnnualFeeEqualTo(BigDecimal value) {
            addCriterion("annual_fee =", value, "annualFee");
            return (Criteria) this;
        }

        public Criteria andAnnualFeeNotEqualTo(BigDecimal value) {
            addCriterion("annual_fee <>", value, "annualFee");
            return (Criteria) this;
        }

        public Criteria andAnnualFeeGreaterThan(BigDecimal value) {
            addCriterion("annual_fee >", value, "annualFee");
            return (Criteria) this;
        }

        public Criteria andAnnualFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("annual_fee >=", value, "annualFee");
            return (Criteria) this;
        }

        public Criteria andAnnualFeeLessThan(BigDecimal value) {
            addCriterion("annual_fee <", value, "annualFee");
            return (Criteria) this;
        }

        public Criteria andAnnualFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("annual_fee <=", value, "annualFee");
            return (Criteria) this;
        }

        public Criteria andAnnualFeeIn(List<BigDecimal> values) {
            addCriterion("annual_fee in", values, "annualFee");
            return (Criteria) this;
        }

        public Criteria andAnnualFeeNotIn(List<BigDecimal> values) {
            addCriterion("annual_fee not in", values, "annualFee");
            return (Criteria) this;
        }

        public Criteria andAnnualFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("annual_fee between", value1, value2, "annualFee");
            return (Criteria) this;
        }

        public Criteria andAnnualFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("annual_fee not between", value1, value2, "annualFee");
            return (Criteria) this;
        }

        public Criteria andExpireTimeIsNull() {
            addCriterion("expire_time is null");
            return (Criteria) this;
        }

        public Criteria andExpireTimeIsNotNull() {
            addCriterion("expire_time is not null");
            return (Criteria) this;
        }

        public Criteria andExpireTimeEqualTo(Integer value) {
            addCriterion("expire_time =", value, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeNotEqualTo(Integer value) {
            addCriterion("expire_time <>", value, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeGreaterThan(Integer value) {
            addCriterion("expire_time >", value, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("expire_time >=", value, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeLessThan(Integer value) {
            addCriterion("expire_time <", value, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeLessThanOrEqualTo(Integer value) {
            addCriterion("expire_time <=", value, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeIn(List<Integer> values) {
            addCriterion("expire_time in", values, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeNotIn(List<Integer> values) {
            addCriterion("expire_time not in", values, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeBetween(Integer value1, Integer value2) {
            addCriterion("expire_time between", value1, value2, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("expire_time not between", value1, value2, "expireTime");
            return (Criteria) this;
        }

        public Criteria andCourseTokenIsNull() {
            addCriterion("course_token is null");
            return (Criteria) this;
        }

        public Criteria andCourseTokenIsNotNull() {
            addCriterion("course_token is not null");
            return (Criteria) this;
        }

        public Criteria andCourseTokenEqualTo(String value) {
            addCriterion("course_token =", value, "courseToken");
            return (Criteria) this;
        }

        public Criteria andCourseTokenNotEqualTo(String value) {
            addCriterion("course_token <>", value, "courseToken");
            return (Criteria) this;
        }

        public Criteria andCourseTokenGreaterThan(String value) {
            addCriterion("course_token >", value, "courseToken");
            return (Criteria) this;
        }

        public Criteria andCourseTokenGreaterThanOrEqualTo(String value) {
            addCriterion("course_token >=", value, "courseToken");
            return (Criteria) this;
        }

        public Criteria andCourseTokenLessThan(String value) {
            addCriterion("course_token <", value, "courseToken");
            return (Criteria) this;
        }

        public Criteria andCourseTokenLessThanOrEqualTo(String value) {
            addCriterion("course_token <=", value, "courseToken");
            return (Criteria) this;
        }

        public Criteria andCourseTokenLike(String value) {
            addCriterion("course_token like", value, "courseToken");
            return (Criteria) this;
        }

        public Criteria andCourseTokenNotLike(String value) {
            addCriterion("course_token not like", value, "courseToken");
            return (Criteria) this;
        }

        public Criteria andCourseTokenIn(List<String> values) {
            addCriterion("course_token in", values, "courseToken");
            return (Criteria) this;
        }

        public Criteria andCourseTokenNotIn(List<String> values) {
            addCriterion("course_token not in", values, "courseToken");
            return (Criteria) this;
        }

        public Criteria andCourseTokenBetween(String value1, String value2) {
            addCriterion("course_token between", value1, value2, "courseToken");
            return (Criteria) this;
        }

        public Criteria andCourseTokenNotBetween(String value1, String value2) {
            addCriterion("course_token not between", value1, value2, "courseToken");
            return (Criteria) this;
        }

        public Criteria andCertimgUrlIsNull() {
            addCriterion("certimg_url is null");
            return (Criteria) this;
        }

        public Criteria andCertimgUrlIsNotNull() {
            addCriterion("certimg_url is not null");
            return (Criteria) this;
        }

        public Criteria andCertimgUrlEqualTo(String value) {
            addCriterion("certimg_url =", value, "certimgUrl");
            return (Criteria) this;
        }

        public Criteria andCertimgUrlNotEqualTo(String value) {
            addCriterion("certimg_url <>", value, "certimgUrl");
            return (Criteria) this;
        }

        public Criteria andCertimgUrlGreaterThan(String value) {
            addCriterion("certimg_url >", value, "certimgUrl");
            return (Criteria) this;
        }

        public Criteria andCertimgUrlGreaterThanOrEqualTo(String value) {
            addCriterion("certimg_url >=", value, "certimgUrl");
            return (Criteria) this;
        }

        public Criteria andCertimgUrlLessThan(String value) {
            addCriterion("certimg_url <", value, "certimgUrl");
            return (Criteria) this;
        }

        public Criteria andCertimgUrlLessThanOrEqualTo(String value) {
            addCriterion("certimg_url <=", value, "certimgUrl");
            return (Criteria) this;
        }

        public Criteria andCertimgUrlLike(String value) {
            addCriterion("certimg_url like", value, "certimgUrl");
            return (Criteria) this;
        }

        public Criteria andCertimgUrlNotLike(String value) {
            addCriterion("certimg_url not like", value, "certimgUrl");
            return (Criteria) this;
        }

        public Criteria andCertimgUrlIn(List<String> values) {
            addCriterion("certimg_url in", values, "certimgUrl");
            return (Criteria) this;
        }

        public Criteria andCertimgUrlNotIn(List<String> values) {
            addCriterion("certimg_url not in", values, "certimgUrl");
            return (Criteria) this;
        }

        public Criteria andCertimgUrlBetween(String value1, String value2) {
            addCriterion("certimg_url between", value1, value2, "certimgUrl");
            return (Criteria) this;
        }

        public Criteria andCertimgUrlNotBetween(String value1, String value2) {
            addCriterion("certimg_url not between", value1, value2, "certimgUrl");
            return (Criteria) this;
        }

        public Criteria andBzjPicIsNull() {
            addCriterion("bzj_pic is null");
            return (Criteria) this;
        }

        public Criteria andBzjPicIsNotNull() {
            addCriterion("bzj_pic is not null");
            return (Criteria) this;
        }

        public Criteria andBzjPicEqualTo(String value) {
            addCriterion("bzj_pic =", value, "bzjPic");
            return (Criteria) this;
        }

        public Criteria andBzjPicNotEqualTo(String value) {
            addCriterion("bzj_pic <>", value, "bzjPic");
            return (Criteria) this;
        }

        public Criteria andBzjPicGreaterThan(String value) {
            addCriterion("bzj_pic >", value, "bzjPic");
            return (Criteria) this;
        }

        public Criteria andBzjPicGreaterThanOrEqualTo(String value) {
            addCriterion("bzj_pic >=", value, "bzjPic");
            return (Criteria) this;
        }

        public Criteria andBzjPicLessThan(String value) {
            addCriterion("bzj_pic <", value, "bzjPic");
            return (Criteria) this;
        }

        public Criteria andBzjPicLessThanOrEqualTo(String value) {
            addCriterion("bzj_pic <=", value, "bzjPic");
            return (Criteria) this;
        }

        public Criteria andBzjPicLike(String value) {
            addCriterion("bzj_pic like", value, "bzjPic");
            return (Criteria) this;
        }

        public Criteria andBzjPicNotLike(String value) {
            addCriterion("bzj_pic not like", value, "bzjPic");
            return (Criteria) this;
        }

        public Criteria andBzjPicIn(List<String> values) {
            addCriterion("bzj_pic in", values, "bzjPic");
            return (Criteria) this;
        }

        public Criteria andBzjPicNotIn(List<String> values) {
            addCriterion("bzj_pic not in", values, "bzjPic");
            return (Criteria) this;
        }

        public Criteria andBzjPicBetween(String value1, String value2) {
            addCriterion("bzj_pic between", value1, value2, "bzjPic");
            return (Criteria) this;
        }

        public Criteria andBzjPicNotBetween(String value1, String value2) {
            addCriterion("bzj_pic not between", value1, value2, "bzjPic");
            return (Criteria) this;
        }

        public Criteria andSfzIsNull() {
            addCriterion("sfz is null");
            return (Criteria) this;
        }

        public Criteria andSfzIsNotNull() {
            addCriterion("sfz is not null");
            return (Criteria) this;
        }

        public Criteria andSfzEqualTo(String value) {
            addCriterion("sfz =", value, "sfz");
            return (Criteria) this;
        }

        public Criteria andSfzNotEqualTo(String value) {
            addCriterion("sfz <>", value, "sfz");
            return (Criteria) this;
        }

        public Criteria andSfzGreaterThan(String value) {
            addCriterion("sfz >", value, "sfz");
            return (Criteria) this;
        }

        public Criteria andSfzGreaterThanOrEqualTo(String value) {
            addCriterion("sfz >=", value, "sfz");
            return (Criteria) this;
        }

        public Criteria andSfzLessThan(String value) {
            addCriterion("sfz <", value, "sfz");
            return (Criteria) this;
        }

        public Criteria andSfzLessThanOrEqualTo(String value) {
            addCriterion("sfz <=", value, "sfz");
            return (Criteria) this;
        }

        public Criteria andSfzLike(String value) {
            addCriterion("sfz like", value, "sfz");
            return (Criteria) this;
        }

        public Criteria andSfzNotLike(String value) {
            addCriterion("sfz not like", value, "sfz");
            return (Criteria) this;
        }

        public Criteria andSfzIn(List<String> values) {
            addCriterion("sfz in", values, "sfz");
            return (Criteria) this;
        }

        public Criteria andSfzNotIn(List<String> values) {
            addCriterion("sfz not in", values, "sfz");
            return (Criteria) this;
        }

        public Criteria andSfzBetween(String value1, String value2) {
            addCriterion("sfz between", value1, value2, "sfz");
            return (Criteria) this;
        }

        public Criteria andSfzNotBetween(String value1, String value2) {
            addCriterion("sfz not between", value1, value2, "sfz");
            return (Criteria) this;
        }

        public Criteria andSfz1IsNull() {
            addCriterion("sfz_1 is null");
            return (Criteria) this;
        }

        public Criteria andSfz1IsNotNull() {
            addCriterion("sfz_1 is not null");
            return (Criteria) this;
        }

        public Criteria andSfz1EqualTo(String value) {
            addCriterion("sfz_1 =", value, "sfz1");
            return (Criteria) this;
        }

        public Criteria andSfz1NotEqualTo(String value) {
            addCriterion("sfz_1 <>", value, "sfz1");
            return (Criteria) this;
        }

        public Criteria andSfz1GreaterThan(String value) {
            addCriterion("sfz_1 >", value, "sfz1");
            return (Criteria) this;
        }

        public Criteria andSfz1GreaterThanOrEqualTo(String value) {
            addCriterion("sfz_1 >=", value, "sfz1");
            return (Criteria) this;
        }

        public Criteria andSfz1LessThan(String value) {
            addCriterion("sfz_1 <", value, "sfz1");
            return (Criteria) this;
        }

        public Criteria andSfz1LessThanOrEqualTo(String value) {
            addCriterion("sfz_1 <=", value, "sfz1");
            return (Criteria) this;
        }

        public Criteria andSfz1Like(String value) {
            addCriterion("sfz_1 like", value, "sfz1");
            return (Criteria) this;
        }

        public Criteria andSfz1NotLike(String value) {
            addCriterion("sfz_1 not like", value, "sfz1");
            return (Criteria) this;
        }

        public Criteria andSfz1In(List<String> values) {
            addCriterion("sfz_1 in", values, "sfz1");
            return (Criteria) this;
        }

        public Criteria andSfz1NotIn(List<String> values) {
            addCriterion("sfz_1 not in", values, "sfz1");
            return (Criteria) this;
        }

        public Criteria andSfz1Between(String value1, String value2) {
            addCriterion("sfz_1 between", value1, value2, "sfz1");
            return (Criteria) this;
        }

        public Criteria andSfz1NotBetween(String value1, String value2) {
            addCriterion("sfz_1 not between", value1, value2, "sfz1");
            return (Criteria) this;
        }

        public Criteria andSfz2IsNull() {
            addCriterion("sfz_2 is null");
            return (Criteria) this;
        }

        public Criteria andSfz2IsNotNull() {
            addCriterion("sfz_2 is not null");
            return (Criteria) this;
        }

        public Criteria andSfz2EqualTo(String value) {
            addCriterion("sfz_2 =", value, "sfz2");
            return (Criteria) this;
        }

        public Criteria andSfz2NotEqualTo(String value) {
            addCriterion("sfz_2 <>", value, "sfz2");
            return (Criteria) this;
        }

        public Criteria andSfz2GreaterThan(String value) {
            addCriterion("sfz_2 >", value, "sfz2");
            return (Criteria) this;
        }

        public Criteria andSfz2GreaterThanOrEqualTo(String value) {
            addCriterion("sfz_2 >=", value, "sfz2");
            return (Criteria) this;
        }

        public Criteria andSfz2LessThan(String value) {
            addCriterion("sfz_2 <", value, "sfz2");
            return (Criteria) this;
        }

        public Criteria andSfz2LessThanOrEqualTo(String value) {
            addCriterion("sfz_2 <=", value, "sfz2");
            return (Criteria) this;
        }

        public Criteria andSfz2Like(String value) {
            addCriterion("sfz_2 like", value, "sfz2");
            return (Criteria) this;
        }

        public Criteria andSfz2NotLike(String value) {
            addCriterion("sfz_2 not like", value, "sfz2");
            return (Criteria) this;
        }

        public Criteria andSfz2In(List<String> values) {
            addCriterion("sfz_2 in", values, "sfz2");
            return (Criteria) this;
        }

        public Criteria andSfz2NotIn(List<String> values) {
            addCriterion("sfz_2 not in", values, "sfz2");
            return (Criteria) this;
        }

        public Criteria andSfz2Between(String value1, String value2) {
            addCriterion("sfz_2 between", value1, value2, "sfz2");
            return (Criteria) this;
        }

        public Criteria andSfz2NotBetween(String value1, String value2) {
            addCriterion("sfz_2 not between", value1, value2, "sfz2");
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