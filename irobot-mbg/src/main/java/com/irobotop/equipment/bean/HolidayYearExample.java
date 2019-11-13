package com.irobotop.equipment.bean;

import java.util.ArrayList;
import java.util.List;

public class HolidayYearExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HolidayYearExample() {
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
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNowDateIsNull() {
            addCriterion("NOW_DATE is null");
            return (Criteria) this;
        }

        public Criteria andNowDateIsNotNull() {
            addCriterion("NOW_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andNowDateEqualTo(String value) {
            addCriterion("NOW_DATE =", value, "nowDate");
            return (Criteria) this;
        }

        public Criteria andNowDateNotEqualTo(String value) {
            addCriterion("NOW_DATE <>", value, "nowDate");
            return (Criteria) this;
        }

        public Criteria andNowDateGreaterThan(String value) {
            addCriterion("NOW_DATE >", value, "nowDate");
            return (Criteria) this;
        }

        public Criteria andNowDateGreaterThanOrEqualTo(String value) {
            addCriterion("NOW_DATE >=", value, "nowDate");
            return (Criteria) this;
        }

        public Criteria andNowDateLessThan(String value) {
            addCriterion("NOW_DATE <", value, "nowDate");
            return (Criteria) this;
        }

        public Criteria andNowDateLessThanOrEqualTo(String value) {
            addCriterion("NOW_DATE <=", value, "nowDate");
            return (Criteria) this;
        }

        public Criteria andNowDateLike(String value) {
            addCriterion("NOW_DATE like", value, "nowDate");
            return (Criteria) this;
        }

        public Criteria andNowDateNotLike(String value) {
            addCriterion("NOW_DATE not like", value, "nowDate");
            return (Criteria) this;
        }

        public Criteria andNowDateIn(List<String> values) {
            addCriterion("NOW_DATE in", values, "nowDate");
            return (Criteria) this;
        }

        public Criteria andNowDateNotIn(List<String> values) {
            addCriterion("NOW_DATE not in", values, "nowDate");
            return (Criteria) this;
        }

        public Criteria andNowDateBetween(String value1, String value2) {
            addCriterion("NOW_DATE between", value1, value2, "nowDate");
            return (Criteria) this;
        }

        public Criteria andNowDateNotBetween(String value1, String value2) {
            addCriterion("NOW_DATE not between", value1, value2, "nowDate");
            return (Criteria) this;
        }

        public Criteria andStr1IsNull() {
            addCriterion("STR1 is null");
            return (Criteria) this;
        }

        public Criteria andStr1IsNotNull() {
            addCriterion("STR1 is not null");
            return (Criteria) this;
        }

        public Criteria andStr1EqualTo(String value) {
            addCriterion("STR1 =", value, "str1");
            return (Criteria) this;
        }

        public Criteria andStr1NotEqualTo(String value) {
            addCriterion("STR1 <>", value, "str1");
            return (Criteria) this;
        }

        public Criteria andStr1GreaterThan(String value) {
            addCriterion("STR1 >", value, "str1");
            return (Criteria) this;
        }

        public Criteria andStr1GreaterThanOrEqualTo(String value) {
            addCriterion("STR1 >=", value, "str1");
            return (Criteria) this;
        }

        public Criteria andStr1LessThan(String value) {
            addCriterion("STR1 <", value, "str1");
            return (Criteria) this;
        }

        public Criteria andStr1LessThanOrEqualTo(String value) {
            addCriterion("STR1 <=", value, "str1");
            return (Criteria) this;
        }

        public Criteria andStr1Like(String value) {
            addCriterion("STR1 like", value, "str1");
            return (Criteria) this;
        }

        public Criteria andStr1NotLike(String value) {
            addCriterion("STR1 not like", value, "str1");
            return (Criteria) this;
        }

        public Criteria andStr1In(List<String> values) {
            addCriterion("STR1 in", values, "str1");
            return (Criteria) this;
        }

        public Criteria andStr1NotIn(List<String> values) {
            addCriterion("STR1 not in", values, "str1");
            return (Criteria) this;
        }

        public Criteria andStr1Between(String value1, String value2) {
            addCriterion("STR1 between", value1, value2, "str1");
            return (Criteria) this;
        }

        public Criteria andStr1NotBetween(String value1, String value2) {
            addCriterion("STR1 not between", value1, value2, "str1");
            return (Criteria) this;
        }

        public Criteria andStr2IsNull() {
            addCriterion("STR2 is null");
            return (Criteria) this;
        }

        public Criteria andStr2IsNotNull() {
            addCriterion("STR2 is not null");
            return (Criteria) this;
        }

        public Criteria andStr2EqualTo(String value) {
            addCriterion("STR2 =", value, "str2");
            return (Criteria) this;
        }

        public Criteria andStr2NotEqualTo(String value) {
            addCriterion("STR2 <>", value, "str2");
            return (Criteria) this;
        }

        public Criteria andStr2GreaterThan(String value) {
            addCriterion("STR2 >", value, "str2");
            return (Criteria) this;
        }

        public Criteria andStr2GreaterThanOrEqualTo(String value) {
            addCriterion("STR2 >=", value, "str2");
            return (Criteria) this;
        }

        public Criteria andStr2LessThan(String value) {
            addCriterion("STR2 <", value, "str2");
            return (Criteria) this;
        }

        public Criteria andStr2LessThanOrEqualTo(String value) {
            addCriterion("STR2 <=", value, "str2");
            return (Criteria) this;
        }

        public Criteria andStr2Like(String value) {
            addCriterion("STR2 like", value, "str2");
            return (Criteria) this;
        }

        public Criteria andStr2NotLike(String value) {
            addCriterion("STR2 not like", value, "str2");
            return (Criteria) this;
        }

        public Criteria andStr2In(List<String> values) {
            addCriterion("STR2 in", values, "str2");
            return (Criteria) this;
        }

        public Criteria andStr2NotIn(List<String> values) {
            addCriterion("STR2 not in", values, "str2");
            return (Criteria) this;
        }

        public Criteria andStr2Between(String value1, String value2) {
            addCriterion("STR2 between", value1, value2, "str2");
            return (Criteria) this;
        }

        public Criteria andStr2NotBetween(String value1, String value2) {
            addCriterion("STR2 not between", value1, value2, "str2");
            return (Criteria) this;
        }

        public Criteria andBeginTimeIsNull() {
            addCriterion("BEGIN_TIME is null");
            return (Criteria) this;
        }

        public Criteria andBeginTimeIsNotNull() {
            addCriterion("BEGIN_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andBeginTimeEqualTo(String value) {
            addCriterion("BEGIN_TIME =", value, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeNotEqualTo(String value) {
            addCriterion("BEGIN_TIME <>", value, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeGreaterThan(String value) {
            addCriterion("BEGIN_TIME >", value, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeGreaterThanOrEqualTo(String value) {
            addCriterion("BEGIN_TIME >=", value, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeLessThan(String value) {
            addCriterion("BEGIN_TIME <", value, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeLessThanOrEqualTo(String value) {
            addCriterion("BEGIN_TIME <=", value, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeLike(String value) {
            addCriterion("BEGIN_TIME like", value, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeNotLike(String value) {
            addCriterion("BEGIN_TIME not like", value, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeIn(List<String> values) {
            addCriterion("BEGIN_TIME in", values, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeNotIn(List<String> values) {
            addCriterion("BEGIN_TIME not in", values, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeBetween(String value1, String value2) {
            addCriterion("BEGIN_TIME between", value1, value2, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeNotBetween(String value1, String value2) {
            addCriterion("BEGIN_TIME not between", value1, value2, "beginTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("END_TIME is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("END_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(String value) {
            addCriterion("END_TIME =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(String value) {
            addCriterion("END_TIME <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(String value) {
            addCriterion("END_TIME >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(String value) {
            addCriterion("END_TIME >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(String value) {
            addCriterion("END_TIME <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(String value) {
            addCriterion("END_TIME <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLike(String value) {
            addCriterion("END_TIME like", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotLike(String value) {
            addCriterion("END_TIME not like", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<String> values) {
            addCriterion("END_TIME in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<String> values) {
            addCriterion("END_TIME not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(String value1, String value2) {
            addCriterion("END_TIME between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(String value1, String value2) {
            addCriterion("END_TIME not between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andTipIsNull() {
            addCriterion("TIP is null");
            return (Criteria) this;
        }

        public Criteria andTipIsNotNull() {
            addCriterion("TIP is not null");
            return (Criteria) this;
        }

        public Criteria andTipEqualTo(String value) {
            addCriterion("TIP =", value, "tip");
            return (Criteria) this;
        }

        public Criteria andTipNotEqualTo(String value) {
            addCriterion("TIP <>", value, "tip");
            return (Criteria) this;
        }

        public Criteria andTipGreaterThan(String value) {
            addCriterion("TIP >", value, "tip");
            return (Criteria) this;
        }

        public Criteria andTipGreaterThanOrEqualTo(String value) {
            addCriterion("TIP >=", value, "tip");
            return (Criteria) this;
        }

        public Criteria andTipLessThan(String value) {
            addCriterion("TIP <", value, "tip");
            return (Criteria) this;
        }

        public Criteria andTipLessThanOrEqualTo(String value) {
            addCriterion("TIP <=", value, "tip");
            return (Criteria) this;
        }

        public Criteria andTipLike(String value) {
            addCriterion("TIP like", value, "tip");
            return (Criteria) this;
        }

        public Criteria andTipNotLike(String value) {
            addCriterion("TIP not like", value, "tip");
            return (Criteria) this;
        }

        public Criteria andTipIn(List<String> values) {
            addCriterion("TIP in", values, "tip");
            return (Criteria) this;
        }

        public Criteria andTipNotIn(List<String> values) {
            addCriterion("TIP not in", values, "tip");
            return (Criteria) this;
        }

        public Criteria andTipBetween(String value1, String value2) {
            addCriterion("TIP between", value1, value2, "tip");
            return (Criteria) this;
        }

        public Criteria andTipNotBetween(String value1, String value2) {
            addCriterion("TIP not between", value1, value2, "tip");
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