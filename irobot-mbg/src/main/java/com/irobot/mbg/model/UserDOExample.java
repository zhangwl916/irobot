package com.irobot.mbg.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserDOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserDOExample() {
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

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Long value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Long value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Long value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Long value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Long value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Long> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Long> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Long value1, Long value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Long value1, Long value2) {
            addCriterion("user_id not between", value1, value2, "userId");
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

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
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

        public Criteria andDeptIdIsNull() {
            addCriterion("dept_id is null");
            return (Criteria) this;
        }

        public Criteria andDeptIdIsNotNull() {
            addCriterion("dept_id is not null");
            return (Criteria) this;
        }

        public Criteria andDeptIdEqualTo(String value) {
            addCriterion("dept_id =", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdNotEqualTo(String value) {
            addCriterion("dept_id <>", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdGreaterThan(String value) {
            addCriterion("dept_id >", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdGreaterThanOrEqualTo(String value) {
            addCriterion("dept_id >=", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdLessThan(String value) {
            addCriterion("dept_id <", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdLessThanOrEqualTo(String value) {
            addCriterion("dept_id <=", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdLike(String value) {
            addCriterion("dept_id like", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdNotLike(String value) {
            addCriterion("dept_id not like", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdIn(List<String> values) {
            addCriterion("dept_id in", values, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdNotIn(List<String> values) {
            addCriterion("dept_id not in", values, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdBetween(String value1, String value2) {
            addCriterion("dept_id between", value1, value2, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdNotBetween(String value1, String value2) {
            addCriterion("dept_id not between", value1, value2, "deptId");
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

        public Criteria andMobileIsNull() {
            addCriterion("mobile is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("mobile is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("mobile =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("mobile <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("mobile >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("mobile >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("mobile <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("mobile <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("mobile like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("mobile not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("mobile in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("mobile not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("mobile between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("mobile not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andJobIsNull() {
            addCriterion("job is null");
            return (Criteria) this;
        }

        public Criteria andJobIsNotNull() {
            addCriterion("job is not null");
            return (Criteria) this;
        }

        public Criteria andJobEqualTo(String value) {
            addCriterion("job =", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobNotEqualTo(String value) {
            addCriterion("job <>", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobGreaterThan(String value) {
            addCriterion("job >", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobGreaterThanOrEqualTo(String value) {
            addCriterion("job >=", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobLessThan(String value) {
            addCriterion("job <", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobLessThanOrEqualTo(String value) {
            addCriterion("job <=", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobLike(String value) {
            addCriterion("job like", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobNotLike(String value) {
            addCriterion("job not like", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobIn(List<String> values) {
            addCriterion("job in", values, "job");
            return (Criteria) this;
        }

        public Criteria andJobNotIn(List<String> values) {
            addCriterion("job not in", values, "job");
            return (Criteria) this;
        }

        public Criteria andJobBetween(String value1, String value2) {
            addCriterion("job between", value1, value2, "job");
            return (Criteria) this;
        }

        public Criteria andJobNotBetween(String value1, String value2) {
            addCriterion("job not between", value1, value2, "job");
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

        public Criteria andStatusEqualTo(Byte value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Byte value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Byte value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Byte value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Byte value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Byte> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Byte> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Byte value1, Byte value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andUserIdCreateIsNull() {
            addCriterion("user_id_create is null");
            return (Criteria) this;
        }

        public Criteria andUserIdCreateIsNotNull() {
            addCriterion("user_id_create is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdCreateEqualTo(Long value) {
            addCriterion("user_id_create =", value, "userIdCreate");
            return (Criteria) this;
        }

        public Criteria andUserIdCreateNotEqualTo(Long value) {
            addCriterion("user_id_create <>", value, "userIdCreate");
            return (Criteria) this;
        }

        public Criteria andUserIdCreateGreaterThan(Long value) {
            addCriterion("user_id_create >", value, "userIdCreate");
            return (Criteria) this;
        }

        public Criteria andUserIdCreateGreaterThanOrEqualTo(Long value) {
            addCriterion("user_id_create >=", value, "userIdCreate");
            return (Criteria) this;
        }

        public Criteria andUserIdCreateLessThan(Long value) {
            addCriterion("user_id_create <", value, "userIdCreate");
            return (Criteria) this;
        }

        public Criteria andUserIdCreateLessThanOrEqualTo(Long value) {
            addCriterion("user_id_create <=", value, "userIdCreate");
            return (Criteria) this;
        }

        public Criteria andUserIdCreateIn(List<Long> values) {
            addCriterion("user_id_create in", values, "userIdCreate");
            return (Criteria) this;
        }

        public Criteria andUserIdCreateNotIn(List<Long> values) {
            addCriterion("user_id_create not in", values, "userIdCreate");
            return (Criteria) this;
        }

        public Criteria andUserIdCreateBetween(Long value1, Long value2) {
            addCriterion("user_id_create between", value1, value2, "userIdCreate");
            return (Criteria) this;
        }

        public Criteria andUserIdCreateNotBetween(Long value1, Long value2) {
            addCriterion("user_id_create not between", value1, value2, "userIdCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNull() {
            addCriterion("gmt_create is null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNotNull() {
            addCriterion("gmt_create is not null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateEqualTo(Date value) {
            addCriterion("gmt_create =", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotEqualTo(Date value) {
            addCriterion("gmt_create <>", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThan(Date value) {
            addCriterion("gmt_create >", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_create >=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThan(Date value) {
            addCriterion("gmt_create <", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThanOrEqualTo(Date value) {
            addCriterion("gmt_create <=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIn(List<Date> values) {
            addCriterion("gmt_create in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotIn(List<Date> values) {
            addCriterion("gmt_create not in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateBetween(Date value1, Date value2) {
            addCriterion("gmt_create between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotBetween(Date value1, Date value2) {
            addCriterion("gmt_create not between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIsNull() {
            addCriterion("gmt_modified is null");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIsNotNull() {
            addCriterion("gmt_modified is not null");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedEqualTo(Date value) {
            addCriterion("gmt_modified =", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotEqualTo(Date value) {
            addCriterion("gmt_modified <>", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedGreaterThan(Date value) {
            addCriterion("gmt_modified >", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_modified >=", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedLessThan(Date value) {
            addCriterion("gmt_modified <", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedLessThanOrEqualTo(Date value) {
            addCriterion("gmt_modified <=", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIn(List<Date> values) {
            addCriterion("gmt_modified in", values, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotIn(List<Date> values) {
            addCriterion("gmt_modified not in", values, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedBetween(Date value1, Date value2) {
            addCriterion("gmt_modified between", value1, value2, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotBetween(Date value1, Date value2) {
            addCriterion("gmt_modified not between", value1, value2, "gmtModified");
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

        public Criteria andSexEqualTo(Long value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(Long value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(Long value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(Long value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(Long value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(Long value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<Long> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<Long> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(Long value1, Long value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(Long value1, Long value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andBirthIsNull() {
            addCriterion("birth is null");
            return (Criteria) this;
        }

        public Criteria andBirthIsNotNull() {
            addCriterion("birth is not null");
            return (Criteria) this;
        }

        public Criteria andBirthEqualTo(Date value) {
            addCriterion("birth =", value, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthNotEqualTo(Date value) {
            addCriterion("birth <>", value, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthGreaterThan(Date value) {
            addCriterion("birth >", value, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthGreaterThanOrEqualTo(Date value) {
            addCriterion("birth >=", value, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthLessThan(Date value) {
            addCriterion("birth <", value, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthLessThanOrEqualTo(Date value) {
            addCriterion("birth <=", value, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthIn(List<Date> values) {
            addCriterion("birth in", values, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthNotIn(List<Date> values) {
            addCriterion("birth not in", values, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthBetween(Date value1, Date value2) {
            addCriterion("birth between", value1, value2, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthNotBetween(Date value1, Date value2) {
            addCriterion("birth not between", value1, value2, "birth");
            return (Criteria) this;
        }

        public Criteria andPicIdIsNull() {
            addCriterion("pic_id is null");
            return (Criteria) this;
        }

        public Criteria andPicIdIsNotNull() {
            addCriterion("pic_id is not null");
            return (Criteria) this;
        }

        public Criteria andPicIdEqualTo(Long value) {
            addCriterion("pic_id =", value, "picId");
            return (Criteria) this;
        }

        public Criteria andPicIdNotEqualTo(Long value) {
            addCriterion("pic_id <>", value, "picId");
            return (Criteria) this;
        }

        public Criteria andPicIdGreaterThan(Long value) {
            addCriterion("pic_id >", value, "picId");
            return (Criteria) this;
        }

        public Criteria andPicIdGreaterThanOrEqualTo(Long value) {
            addCriterion("pic_id >=", value, "picId");
            return (Criteria) this;
        }

        public Criteria andPicIdLessThan(Long value) {
            addCriterion("pic_id <", value, "picId");
            return (Criteria) this;
        }

        public Criteria andPicIdLessThanOrEqualTo(Long value) {
            addCriterion("pic_id <=", value, "picId");
            return (Criteria) this;
        }

        public Criteria andPicIdIn(List<Long> values) {
            addCriterion("pic_id in", values, "picId");
            return (Criteria) this;
        }

        public Criteria andPicIdNotIn(List<Long> values) {
            addCriterion("pic_id not in", values, "picId");
            return (Criteria) this;
        }

        public Criteria andPicIdBetween(Long value1, Long value2) {
            addCriterion("pic_id between", value1, value2, "picId");
            return (Criteria) this;
        }

        public Criteria andPicIdNotBetween(Long value1, Long value2) {
            addCriterion("pic_id not between", value1, value2, "picId");
            return (Criteria) this;
        }

        public Criteria andLiveAddressIsNull() {
            addCriterion("live_address is null");
            return (Criteria) this;
        }

        public Criteria andLiveAddressIsNotNull() {
            addCriterion("live_address is not null");
            return (Criteria) this;
        }

        public Criteria andLiveAddressEqualTo(String value) {
            addCriterion("live_address =", value, "liveAddress");
            return (Criteria) this;
        }

        public Criteria andLiveAddressNotEqualTo(String value) {
            addCriterion("live_address <>", value, "liveAddress");
            return (Criteria) this;
        }

        public Criteria andLiveAddressGreaterThan(String value) {
            addCriterion("live_address >", value, "liveAddress");
            return (Criteria) this;
        }

        public Criteria andLiveAddressGreaterThanOrEqualTo(String value) {
            addCriterion("live_address >=", value, "liveAddress");
            return (Criteria) this;
        }

        public Criteria andLiveAddressLessThan(String value) {
            addCriterion("live_address <", value, "liveAddress");
            return (Criteria) this;
        }

        public Criteria andLiveAddressLessThanOrEqualTo(String value) {
            addCriterion("live_address <=", value, "liveAddress");
            return (Criteria) this;
        }

        public Criteria andLiveAddressLike(String value) {
            addCriterion("live_address like", value, "liveAddress");
            return (Criteria) this;
        }

        public Criteria andLiveAddressNotLike(String value) {
            addCriterion("live_address not like", value, "liveAddress");
            return (Criteria) this;
        }

        public Criteria andLiveAddressIn(List<String> values) {
            addCriterion("live_address in", values, "liveAddress");
            return (Criteria) this;
        }

        public Criteria andLiveAddressNotIn(List<String> values) {
            addCriterion("live_address not in", values, "liveAddress");
            return (Criteria) this;
        }

        public Criteria andLiveAddressBetween(String value1, String value2) {
            addCriterion("live_address between", value1, value2, "liveAddress");
            return (Criteria) this;
        }

        public Criteria andLiveAddressNotBetween(String value1, String value2) {
            addCriterion("live_address not between", value1, value2, "liveAddress");
            return (Criteria) this;
        }

        public Criteria andHobbyIsNull() {
            addCriterion("hobby is null");
            return (Criteria) this;
        }

        public Criteria andHobbyIsNotNull() {
            addCriterion("hobby is not null");
            return (Criteria) this;
        }

        public Criteria andHobbyEqualTo(String value) {
            addCriterion("hobby =", value, "hobby");
            return (Criteria) this;
        }

        public Criteria andHobbyNotEqualTo(String value) {
            addCriterion("hobby <>", value, "hobby");
            return (Criteria) this;
        }

        public Criteria andHobbyGreaterThan(String value) {
            addCriterion("hobby >", value, "hobby");
            return (Criteria) this;
        }

        public Criteria andHobbyGreaterThanOrEqualTo(String value) {
            addCriterion("hobby >=", value, "hobby");
            return (Criteria) this;
        }

        public Criteria andHobbyLessThan(String value) {
            addCriterion("hobby <", value, "hobby");
            return (Criteria) this;
        }

        public Criteria andHobbyLessThanOrEqualTo(String value) {
            addCriterion("hobby <=", value, "hobby");
            return (Criteria) this;
        }

        public Criteria andHobbyLike(String value) {
            addCriterion("hobby like", value, "hobby");
            return (Criteria) this;
        }

        public Criteria andHobbyNotLike(String value) {
            addCriterion("hobby not like", value, "hobby");
            return (Criteria) this;
        }

        public Criteria andHobbyIn(List<String> values) {
            addCriterion("hobby in", values, "hobby");
            return (Criteria) this;
        }

        public Criteria andHobbyNotIn(List<String> values) {
            addCriterion("hobby not in", values, "hobby");
            return (Criteria) this;
        }

        public Criteria andHobbyBetween(String value1, String value2) {
            addCriterion("hobby between", value1, value2, "hobby");
            return (Criteria) this;
        }

        public Criteria andHobbyNotBetween(String value1, String value2) {
            addCriterion("hobby not between", value1, value2, "hobby");
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

        public Criteria andProvinceEqualTo(String value) {
            addCriterion("province =", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotEqualTo(String value) {
            addCriterion("province <>", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThan(String value) {
            addCriterion("province >", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("province >=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThan(String value) {
            addCriterion("province <", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThanOrEqualTo(String value) {
            addCriterion("province <=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLike(String value) {
            addCriterion("province like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotLike(String value) {
            addCriterion("province not like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceIn(List<String> values) {
            addCriterion("province in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotIn(List<String> values) {
            addCriterion("province not in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceBetween(String value1, String value2) {
            addCriterion("province between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotBetween(String value1, String value2) {
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

        public Criteria andCityEqualTo(String value) {
            addCriterion("city =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(String value) {
            addCriterion("city <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(String value) {
            addCriterion("city >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(String value) {
            addCriterion("city >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(String value) {
            addCriterion("city <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(String value) {
            addCriterion("city <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLike(String value) {
            addCriterion("city like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotLike(String value) {
            addCriterion("city not like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<String> values) {
            addCriterion("city in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<String> values) {
            addCriterion("city not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(String value1, String value2) {
            addCriterion("city between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(String value1, String value2) {
            addCriterion("city not between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andDistrictIsNull() {
            addCriterion("district is null");
            return (Criteria) this;
        }

        public Criteria andDistrictIsNotNull() {
            addCriterion("district is not null");
            return (Criteria) this;
        }

        public Criteria andDistrictEqualTo(String value) {
            addCriterion("district =", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictNotEqualTo(String value) {
            addCriterion("district <>", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictGreaterThan(String value) {
            addCriterion("district >", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictGreaterThanOrEqualTo(String value) {
            addCriterion("district >=", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictLessThan(String value) {
            addCriterion("district <", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictLessThanOrEqualTo(String value) {
            addCriterion("district <=", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictLike(String value) {
            addCriterion("district like", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictNotLike(String value) {
            addCriterion("district not like", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictIn(List<String> values) {
            addCriterion("district in", values, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictNotIn(List<String> values) {
            addCriterion("district not in", values, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictBetween(String value1, String value2) {
            addCriterion("district between", value1, value2, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictNotBetween(String value1, String value2) {
            addCriterion("district not between", value1, value2, "district");
            return (Criteria) this;
        }

        public Criteria andSysUserIsNull() {
            addCriterion("sys_user is null");
            return (Criteria) this;
        }

        public Criteria andSysUserIsNotNull() {
            addCriterion("sys_user is not null");
            return (Criteria) this;
        }

        public Criteria andSysUserEqualTo(String value) {
            addCriterion("sys_user =", value, "sysUser");
            return (Criteria) this;
        }

        public Criteria andSysUserNotEqualTo(String value) {
            addCriterion("sys_user <>", value, "sysUser");
            return (Criteria) this;
        }

        public Criteria andSysUserGreaterThan(String value) {
            addCriterion("sys_user >", value, "sysUser");
            return (Criteria) this;
        }

        public Criteria andSysUserGreaterThanOrEqualTo(String value) {
            addCriterion("sys_user >=", value, "sysUser");
            return (Criteria) this;
        }

        public Criteria andSysUserLessThan(String value) {
            addCriterion("sys_user <", value, "sysUser");
            return (Criteria) this;
        }

        public Criteria andSysUserLessThanOrEqualTo(String value) {
            addCriterion("sys_user <=", value, "sysUser");
            return (Criteria) this;
        }

        public Criteria andSysUserLike(String value) {
            addCriterion("sys_user like", value, "sysUser");
            return (Criteria) this;
        }

        public Criteria andSysUserNotLike(String value) {
            addCriterion("sys_user not like", value, "sysUser");
            return (Criteria) this;
        }

        public Criteria andSysUserIn(List<String> values) {
            addCriterion("sys_user in", values, "sysUser");
            return (Criteria) this;
        }

        public Criteria andSysUserNotIn(List<String> values) {
            addCriterion("sys_user not in", values, "sysUser");
            return (Criteria) this;
        }

        public Criteria andSysUserBetween(String value1, String value2) {
            addCriterion("sys_user between", value1, value2, "sysUser");
            return (Criteria) this;
        }

        public Criteria andSysUserNotBetween(String value1, String value2) {
            addCriterion("sys_user not between", value1, value2, "sysUser");
            return (Criteria) this;
        }

        public Criteria andIsperosnalauthIsNull() {
            addCriterion("isperosnalauth is null");
            return (Criteria) this;
        }

        public Criteria andIsperosnalauthIsNotNull() {
            addCriterion("isperosnalauth is not null");
            return (Criteria) this;
        }

        public Criteria andIsperosnalauthEqualTo(String value) {
            addCriterion("isperosnalauth =", value, "isperosnalauth");
            return (Criteria) this;
        }

        public Criteria andIsperosnalauthNotEqualTo(String value) {
            addCriterion("isperosnalauth <>", value, "isperosnalauth");
            return (Criteria) this;
        }

        public Criteria andIsperosnalauthGreaterThan(String value) {
            addCriterion("isperosnalauth >", value, "isperosnalauth");
            return (Criteria) this;
        }

        public Criteria andIsperosnalauthGreaterThanOrEqualTo(String value) {
            addCriterion("isperosnalauth >=", value, "isperosnalauth");
            return (Criteria) this;
        }

        public Criteria andIsperosnalauthLessThan(String value) {
            addCriterion("isperosnalauth <", value, "isperosnalauth");
            return (Criteria) this;
        }

        public Criteria andIsperosnalauthLessThanOrEqualTo(String value) {
            addCriterion("isperosnalauth <=", value, "isperosnalauth");
            return (Criteria) this;
        }

        public Criteria andIsperosnalauthLike(String value) {
            addCriterion("isperosnalauth like", value, "isperosnalauth");
            return (Criteria) this;
        }

        public Criteria andIsperosnalauthNotLike(String value) {
            addCriterion("isperosnalauth not like", value, "isperosnalauth");
            return (Criteria) this;
        }

        public Criteria andIsperosnalauthIn(List<String> values) {
            addCriterion("isperosnalauth in", values, "isperosnalauth");
            return (Criteria) this;
        }

        public Criteria andIsperosnalauthNotIn(List<String> values) {
            addCriterion("isperosnalauth not in", values, "isperosnalauth");
            return (Criteria) this;
        }

        public Criteria andIsperosnalauthBetween(String value1, String value2) {
            addCriterion("isperosnalauth between", value1, value2, "isperosnalauth");
            return (Criteria) this;
        }

        public Criteria andIsperosnalauthNotBetween(String value1, String value2) {
            addCriterion("isperosnalauth not between", value1, value2, "isperosnalauth");
            return (Criteria) this;
        }

        public Criteria andIsenterpriseauthIsNull() {
            addCriterion("isenterpriseauth is null");
            return (Criteria) this;
        }

        public Criteria andIsenterpriseauthIsNotNull() {
            addCriterion("isenterpriseauth is not null");
            return (Criteria) this;
        }

        public Criteria andIsenterpriseauthEqualTo(String value) {
            addCriterion("isenterpriseauth =", value, "isenterpriseauth");
            return (Criteria) this;
        }

        public Criteria andIsenterpriseauthNotEqualTo(String value) {
            addCriterion("isenterpriseauth <>", value, "isenterpriseauth");
            return (Criteria) this;
        }

        public Criteria andIsenterpriseauthGreaterThan(String value) {
            addCriterion("isenterpriseauth >", value, "isenterpriseauth");
            return (Criteria) this;
        }

        public Criteria andIsenterpriseauthGreaterThanOrEqualTo(String value) {
            addCriterion("isenterpriseauth >=", value, "isenterpriseauth");
            return (Criteria) this;
        }

        public Criteria andIsenterpriseauthLessThan(String value) {
            addCriterion("isenterpriseauth <", value, "isenterpriseauth");
            return (Criteria) this;
        }

        public Criteria andIsenterpriseauthLessThanOrEqualTo(String value) {
            addCriterion("isenterpriseauth <=", value, "isenterpriseauth");
            return (Criteria) this;
        }

        public Criteria andIsenterpriseauthLike(String value) {
            addCriterion("isenterpriseauth like", value, "isenterpriseauth");
            return (Criteria) this;
        }

        public Criteria andIsenterpriseauthNotLike(String value) {
            addCriterion("isenterpriseauth not like", value, "isenterpriseauth");
            return (Criteria) this;
        }

        public Criteria andIsenterpriseauthIn(List<String> values) {
            addCriterion("isenterpriseauth in", values, "isenterpriseauth");
            return (Criteria) this;
        }

        public Criteria andIsenterpriseauthNotIn(List<String> values) {
            addCriterion("isenterpriseauth not in", values, "isenterpriseauth");
            return (Criteria) this;
        }

        public Criteria andIsenterpriseauthBetween(String value1, String value2) {
            addCriterion("isenterpriseauth between", value1, value2, "isenterpriseauth");
            return (Criteria) this;
        }

        public Criteria andIsenterpriseauthNotBetween(String value1, String value2) {
            addCriterion("isenterpriseauth not between", value1, value2, "isenterpriseauth");
            return (Criteria) this;
        }

        public Criteria andGenidIsNull() {
            addCriterion("genid is null");
            return (Criteria) this;
        }

        public Criteria andGenidIsNotNull() {
            addCriterion("genid is not null");
            return (Criteria) this;
        }

        public Criteria andGenidEqualTo(String value) {
            addCriterion("genid =", value, "genid");
            return (Criteria) this;
        }

        public Criteria andGenidNotEqualTo(String value) {
            addCriterion("genid <>", value, "genid");
            return (Criteria) this;
        }

        public Criteria andGenidGreaterThan(String value) {
            addCriterion("genid >", value, "genid");
            return (Criteria) this;
        }

        public Criteria andGenidGreaterThanOrEqualTo(String value) {
            addCriterion("genid >=", value, "genid");
            return (Criteria) this;
        }

        public Criteria andGenidLessThan(String value) {
            addCriterion("genid <", value, "genid");
            return (Criteria) this;
        }

        public Criteria andGenidLessThanOrEqualTo(String value) {
            addCriterion("genid <=", value, "genid");
            return (Criteria) this;
        }

        public Criteria andGenidLike(String value) {
            addCriterion("genid like", value, "genid");
            return (Criteria) this;
        }

        public Criteria andGenidNotLike(String value) {
            addCriterion("genid not like", value, "genid");
            return (Criteria) this;
        }

        public Criteria andGenidIn(List<String> values) {
            addCriterion("genid in", values, "genid");
            return (Criteria) this;
        }

        public Criteria andGenidNotIn(List<String> values) {
            addCriterion("genid not in", values, "genid");
            return (Criteria) this;
        }

        public Criteria andGenidBetween(String value1, String value2) {
            addCriterion("genid between", value1, value2, "genid");
            return (Criteria) this;
        }

        public Criteria andGenidNotBetween(String value1, String value2) {
            addCriterion("genid not between", value1, value2, "genid");
            return (Criteria) this;
        }

        public Criteria andCardtypeIsNull() {
            addCriterion("cardtype is null");
            return (Criteria) this;
        }

        public Criteria andCardtypeIsNotNull() {
            addCriterion("cardtype is not null");
            return (Criteria) this;
        }

        public Criteria andCardtypeEqualTo(String value) {
            addCriterion("cardtype =", value, "cardtype");
            return (Criteria) this;
        }

        public Criteria andCardtypeNotEqualTo(String value) {
            addCriterion("cardtype <>", value, "cardtype");
            return (Criteria) this;
        }

        public Criteria andCardtypeGreaterThan(String value) {
            addCriterion("cardtype >", value, "cardtype");
            return (Criteria) this;
        }

        public Criteria andCardtypeGreaterThanOrEqualTo(String value) {
            addCriterion("cardtype >=", value, "cardtype");
            return (Criteria) this;
        }

        public Criteria andCardtypeLessThan(String value) {
            addCriterion("cardtype <", value, "cardtype");
            return (Criteria) this;
        }

        public Criteria andCardtypeLessThanOrEqualTo(String value) {
            addCriterion("cardtype <=", value, "cardtype");
            return (Criteria) this;
        }

        public Criteria andCardtypeLike(String value) {
            addCriterion("cardtype like", value, "cardtype");
            return (Criteria) this;
        }

        public Criteria andCardtypeNotLike(String value) {
            addCriterion("cardtype not like", value, "cardtype");
            return (Criteria) this;
        }

        public Criteria andCardtypeIn(List<String> values) {
            addCriterion("cardtype in", values, "cardtype");
            return (Criteria) this;
        }

        public Criteria andCardtypeNotIn(List<String> values) {
            addCriterion("cardtype not in", values, "cardtype");
            return (Criteria) this;
        }

        public Criteria andCardtypeBetween(String value1, String value2) {
            addCriterion("cardtype between", value1, value2, "cardtype");
            return (Criteria) this;
        }

        public Criteria andCardtypeNotBetween(String value1, String value2) {
            addCriterion("cardtype not between", value1, value2, "cardtype");
            return (Criteria) this;
        }

        public Criteria andCardnumberIsNull() {
            addCriterion("cardnumber is null");
            return (Criteria) this;
        }

        public Criteria andCardnumberIsNotNull() {
            addCriterion("cardnumber is not null");
            return (Criteria) this;
        }

        public Criteria andCardnumberEqualTo(String value) {
            addCriterion("cardnumber =", value, "cardnumber");
            return (Criteria) this;
        }

        public Criteria andCardnumberNotEqualTo(String value) {
            addCriterion("cardnumber <>", value, "cardnumber");
            return (Criteria) this;
        }

        public Criteria andCardnumberGreaterThan(String value) {
            addCriterion("cardnumber >", value, "cardnumber");
            return (Criteria) this;
        }

        public Criteria andCardnumberGreaterThanOrEqualTo(String value) {
            addCriterion("cardnumber >=", value, "cardnumber");
            return (Criteria) this;
        }

        public Criteria andCardnumberLessThan(String value) {
            addCriterion("cardnumber <", value, "cardnumber");
            return (Criteria) this;
        }

        public Criteria andCardnumberLessThanOrEqualTo(String value) {
            addCriterion("cardnumber <=", value, "cardnumber");
            return (Criteria) this;
        }

        public Criteria andCardnumberLike(String value) {
            addCriterion("cardnumber like", value, "cardnumber");
            return (Criteria) this;
        }

        public Criteria andCardnumberNotLike(String value) {
            addCriterion("cardnumber not like", value, "cardnumber");
            return (Criteria) this;
        }

        public Criteria andCardnumberIn(List<String> values) {
            addCriterion("cardnumber in", values, "cardnumber");
            return (Criteria) this;
        }

        public Criteria andCardnumberNotIn(List<String> values) {
            addCriterion("cardnumber not in", values, "cardnumber");
            return (Criteria) this;
        }

        public Criteria andCardnumberBetween(String value1, String value2) {
            addCriterion("cardnumber between", value1, value2, "cardnumber");
            return (Criteria) this;
        }

        public Criteria andCardnumberNotBetween(String value1, String value2) {
            addCriterion("cardnumber not between", value1, value2, "cardnumber");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIsNull() {
            addCriterion("company_id is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIsNotNull() {
            addCriterion("company_id is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdEqualTo(String value) {
            addCriterion("company_id =", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotEqualTo(String value) {
            addCriterion("company_id <>", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThan(String value) {
            addCriterion("company_id >", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThanOrEqualTo(String value) {
            addCriterion("company_id >=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThan(String value) {
            addCriterion("company_id <", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThanOrEqualTo(String value) {
            addCriterion("company_id <=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLike(String value) {
            addCriterion("company_id like", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotLike(String value) {
            addCriterion("company_id not like", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIn(List<String> values) {
            addCriterion("company_id in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotIn(List<String> values) {
            addCriterion("company_id not in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdBetween(String value1, String value2) {
            addCriterion("company_id between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotBetween(String value1, String value2) {
            addCriterion("company_id not between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIsNull() {
            addCriterion("company_name is null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIsNotNull() {
            addCriterion("company_name is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameEqualTo(String value) {
            addCriterion("company_name =", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotEqualTo(String value) {
            addCriterion("company_name <>", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThan(String value) {
            addCriterion("company_name >", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThanOrEqualTo(String value) {
            addCriterion("company_name >=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThan(String value) {
            addCriterion("company_name <", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThanOrEqualTo(String value) {
            addCriterion("company_name <=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLike(String value) {
            addCriterion("company_name like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotLike(String value) {
            addCriterion("company_name not like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIn(List<String> values) {
            addCriterion("company_name in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotIn(List<String> values) {
            addCriterion("company_name not in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameBetween(String value1, String value2) {
            addCriterion("company_name between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotBetween(String value1, String value2) {
            addCriterion("company_name not between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andCrateTimeIsNull() {
            addCriterion("crate_time is null");
            return (Criteria) this;
        }

        public Criteria andCrateTimeIsNotNull() {
            addCriterion("crate_time is not null");
            return (Criteria) this;
        }

        public Criteria andCrateTimeEqualTo(Date value) {
            addCriterion("crate_time =", value, "crateTime");
            return (Criteria) this;
        }

        public Criteria andCrateTimeNotEqualTo(Date value) {
            addCriterion("crate_time <>", value, "crateTime");
            return (Criteria) this;
        }

        public Criteria andCrateTimeGreaterThan(Date value) {
            addCriterion("crate_time >", value, "crateTime");
            return (Criteria) this;
        }

        public Criteria andCrateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("crate_time >=", value, "crateTime");
            return (Criteria) this;
        }

        public Criteria andCrateTimeLessThan(Date value) {
            addCriterion("crate_time <", value, "crateTime");
            return (Criteria) this;
        }

        public Criteria andCrateTimeLessThanOrEqualTo(Date value) {
            addCriterion("crate_time <=", value, "crateTime");
            return (Criteria) this;
        }

        public Criteria andCrateTimeIn(List<Date> values) {
            addCriterion("crate_time in", values, "crateTime");
            return (Criteria) this;
        }

        public Criteria andCrateTimeNotIn(List<Date> values) {
            addCriterion("crate_time not in", values, "crateTime");
            return (Criteria) this;
        }

        public Criteria andCrateTimeBetween(Date value1, Date value2) {
            addCriterion("crate_time between", value1, value2, "crateTime");
            return (Criteria) this;
        }

        public Criteria andCrateTimeNotBetween(Date value1, Date value2) {
            addCriterion("crate_time not between", value1, value2, "crateTime");
            return (Criteria) this;
        }

        public Criteria andCuserIsNull() {
            addCriterion("cuser is null");
            return (Criteria) this;
        }

        public Criteria andCuserIsNotNull() {
            addCriterion("cuser is not null");
            return (Criteria) this;
        }

        public Criteria andCuserEqualTo(String value) {
            addCriterion("cuser =", value, "cuser");
            return (Criteria) this;
        }

        public Criteria andCuserNotEqualTo(String value) {
            addCriterion("cuser <>", value, "cuser");
            return (Criteria) this;
        }

        public Criteria andCuserGreaterThan(String value) {
            addCriterion("cuser >", value, "cuser");
            return (Criteria) this;
        }

        public Criteria andCuserGreaterThanOrEqualTo(String value) {
            addCriterion("cuser >=", value, "cuser");
            return (Criteria) this;
        }

        public Criteria andCuserLessThan(String value) {
            addCriterion("cuser <", value, "cuser");
            return (Criteria) this;
        }

        public Criteria andCuserLessThanOrEqualTo(String value) {
            addCriterion("cuser <=", value, "cuser");
            return (Criteria) this;
        }

        public Criteria andCuserLike(String value) {
            addCriterion("cuser like", value, "cuser");
            return (Criteria) this;
        }

        public Criteria andCuserNotLike(String value) {
            addCriterion("cuser not like", value, "cuser");
            return (Criteria) this;
        }

        public Criteria andCuserIn(List<String> values) {
            addCriterion("cuser in", values, "cuser");
            return (Criteria) this;
        }

        public Criteria andCuserNotIn(List<String> values) {
            addCriterion("cuser not in", values, "cuser");
            return (Criteria) this;
        }

        public Criteria andCuserBetween(String value1, String value2) {
            addCriterion("cuser between", value1, value2, "cuser");
            return (Criteria) this;
        }

        public Criteria andCuserNotBetween(String value1, String value2) {
            addCriterion("cuser not between", value1, value2, "cuser");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUuserIsNull() {
            addCriterion("uuser is null");
            return (Criteria) this;
        }

        public Criteria andUuserIsNotNull() {
            addCriterion("uuser is not null");
            return (Criteria) this;
        }

        public Criteria andUuserEqualTo(String value) {
            addCriterion("uuser =", value, "uuser");
            return (Criteria) this;
        }

        public Criteria andUuserNotEqualTo(String value) {
            addCriterion("uuser <>", value, "uuser");
            return (Criteria) this;
        }

        public Criteria andUuserGreaterThan(String value) {
            addCriterion("uuser >", value, "uuser");
            return (Criteria) this;
        }

        public Criteria andUuserGreaterThanOrEqualTo(String value) {
            addCriterion("uuser >=", value, "uuser");
            return (Criteria) this;
        }

        public Criteria andUuserLessThan(String value) {
            addCriterion("uuser <", value, "uuser");
            return (Criteria) this;
        }

        public Criteria andUuserLessThanOrEqualTo(String value) {
            addCriterion("uuser <=", value, "uuser");
            return (Criteria) this;
        }

        public Criteria andUuserLike(String value) {
            addCriterion("uuser like", value, "uuser");
            return (Criteria) this;
        }

        public Criteria andUuserNotLike(String value) {
            addCriterion("uuser not like", value, "uuser");
            return (Criteria) this;
        }

        public Criteria andUuserIn(List<String> values) {
            addCriterion("uuser in", values, "uuser");
            return (Criteria) this;
        }

        public Criteria andUuserNotIn(List<String> values) {
            addCriterion("uuser not in", values, "uuser");
            return (Criteria) this;
        }

        public Criteria andUuserBetween(String value1, String value2) {
            addCriterion("uuser between", value1, value2, "uuser");
            return (Criteria) this;
        }

        public Criteria andUuserNotBetween(String value1, String value2) {
            addCriterion("uuser not between", value1, value2, "uuser");
            return (Criteria) this;
        }

        public Criteria andPathIsNull() {
            addCriterion("path is null");
            return (Criteria) this;
        }

        public Criteria andPathIsNotNull() {
            addCriterion("path is not null");
            return (Criteria) this;
        }

        public Criteria andPathEqualTo(String value) {
            addCriterion("path =", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotEqualTo(String value) {
            addCriterion("path <>", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathGreaterThan(String value) {
            addCriterion("path >", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathGreaterThanOrEqualTo(String value) {
            addCriterion("path >=", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathLessThan(String value) {
            addCriterion("path <", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathLessThanOrEqualTo(String value) {
            addCriterion("path <=", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathLike(String value) {
            addCriterion("path like", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotLike(String value) {
            addCriterion("path not like", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathIn(List<String> values) {
            addCriterion("path in", values, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotIn(List<String> values) {
            addCriterion("path not in", values, "path");
            return (Criteria) this;
        }

        public Criteria andPathBetween(String value1, String value2) {
            addCriterion("path between", value1, value2, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotBetween(String value1, String value2) {
            addCriterion("path not between", value1, value2, "path");
            return (Criteria) this;
        }

        public Criteria andPositionIsNull() {
            addCriterion("position is null");
            return (Criteria) this;
        }

        public Criteria andPositionIsNotNull() {
            addCriterion("position is not null");
            return (Criteria) this;
        }

        public Criteria andPositionEqualTo(String value) {
            addCriterion("position =", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotEqualTo(String value) {
            addCriterion("position <>", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThan(String value) {
            addCriterion("position >", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThanOrEqualTo(String value) {
            addCriterion("position >=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThan(String value) {
            addCriterion("position <", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThanOrEqualTo(String value) {
            addCriterion("position <=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLike(String value) {
            addCriterion("position like", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotLike(String value) {
            addCriterion("position not like", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionIn(List<String> values) {
            addCriterion("position in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotIn(List<String> values) {
            addCriterion("position not in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionBetween(String value1, String value2) {
            addCriterion("position between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotBetween(String value1, String value2) {
            addCriterion("position not between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andShopidIsNull() {
            addCriterion("shopid is null");
            return (Criteria) this;
        }

        public Criteria andShopidIsNotNull() {
            addCriterion("shopid is not null");
            return (Criteria) this;
        }

        public Criteria andShopidEqualTo(String value) {
            addCriterion("shopid =", value, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidNotEqualTo(String value) {
            addCriterion("shopid <>", value, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidGreaterThan(String value) {
            addCriterion("shopid >", value, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidGreaterThanOrEqualTo(String value) {
            addCriterion("shopid >=", value, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidLessThan(String value) {
            addCriterion("shopid <", value, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidLessThanOrEqualTo(String value) {
            addCriterion("shopid <=", value, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidLike(String value) {
            addCriterion("shopid like", value, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidNotLike(String value) {
            addCriterion("shopid not like", value, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidIn(List<String> values) {
            addCriterion("shopid in", values, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidNotIn(List<String> values) {
            addCriterion("shopid not in", values, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidBetween(String value1, String value2) {
            addCriterion("shopid between", value1, value2, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidNotBetween(String value1, String value2) {
            addCriterion("shopid not between", value1, value2, "shopid");
            return (Criteria) this;
        }

        public Criteria andDeveloperidIsNull() {
            addCriterion("developerid is null");
            return (Criteria) this;
        }

        public Criteria andDeveloperidIsNotNull() {
            addCriterion("developerid is not null");
            return (Criteria) this;
        }

        public Criteria andDeveloperidEqualTo(String value) {
            addCriterion("developerid =", value, "developerid");
            return (Criteria) this;
        }

        public Criteria andDeveloperidNotEqualTo(String value) {
            addCriterion("developerid <>", value, "developerid");
            return (Criteria) this;
        }

        public Criteria andDeveloperidGreaterThan(String value) {
            addCriterion("developerid >", value, "developerid");
            return (Criteria) this;
        }

        public Criteria andDeveloperidGreaterThanOrEqualTo(String value) {
            addCriterion("developerid >=", value, "developerid");
            return (Criteria) this;
        }

        public Criteria andDeveloperidLessThan(String value) {
            addCriterion("developerid <", value, "developerid");
            return (Criteria) this;
        }

        public Criteria andDeveloperidLessThanOrEqualTo(String value) {
            addCriterion("developerid <=", value, "developerid");
            return (Criteria) this;
        }

        public Criteria andDeveloperidLike(String value) {
            addCriterion("developerid like", value, "developerid");
            return (Criteria) this;
        }

        public Criteria andDeveloperidNotLike(String value) {
            addCriterion("developerid not like", value, "developerid");
            return (Criteria) this;
        }

        public Criteria andDeveloperidIn(List<String> values) {
            addCriterion("developerid in", values, "developerid");
            return (Criteria) this;
        }

        public Criteria andDeveloperidNotIn(List<String> values) {
            addCriterion("developerid not in", values, "developerid");
            return (Criteria) this;
        }

        public Criteria andDeveloperidBetween(String value1, String value2) {
            addCriterion("developerid between", value1, value2, "developerid");
            return (Criteria) this;
        }

        public Criteria andDeveloperidNotBetween(String value1, String value2) {
            addCriterion("developerid not between", value1, value2, "developerid");
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