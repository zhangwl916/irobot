package com.allianity.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LotteryWinExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LotteryWinExample() {
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

        public Criteria andCustNameIsNull() {
            addCriterion("CUST_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCustNameIsNotNull() {
            addCriterion("CUST_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCustNameEqualTo(String value) {
            addCriterion("CUST_NAME =", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameNotEqualTo(String value) {
            addCriterion("CUST_NAME <>", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameGreaterThan(String value) {
            addCriterion("CUST_NAME >", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameGreaterThanOrEqualTo(String value) {
            addCriterion("CUST_NAME >=", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameLessThan(String value) {
            addCriterion("CUST_NAME <", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameLessThanOrEqualTo(String value) {
            addCriterion("CUST_NAME <=", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameLike(String value) {
            addCriterion("CUST_NAME like", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameNotLike(String value) {
            addCriterion("CUST_NAME not like", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameIn(List<String> values) {
            addCriterion("CUST_NAME in", values, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameNotIn(List<String> values) {
            addCriterion("CUST_NAME not in", values, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameBetween(String value1, String value2) {
            addCriterion("CUST_NAME between", value1, value2, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameNotBetween(String value1, String value2) {
            addCriterion("CUST_NAME not between", value1, value2, "custName");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("PHONE is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("PHONE =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("PHONE <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("PHONE >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("PHONE >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("PHONE <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("PHONE <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("PHONE like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("PHONE not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("PHONE in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("PHONE not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("PHONE between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("PHONE not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("ADDRESS =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("ADDRESS <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("ADDRESS >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("ADDRESS >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("ADDRESS <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("ADDRESS <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("ADDRESS like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("ADDRESS not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("ADDRESS in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("ADDRESS not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("ADDRESS between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("ADDRESS not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andPrizeNameIsNull() {
            addCriterion("PRIZE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andPrizeNameIsNotNull() {
            addCriterion("PRIZE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andPrizeNameEqualTo(String value) {
            addCriterion("PRIZE_NAME =", value, "prizeName");
            return (Criteria) this;
        }

        public Criteria andPrizeNameNotEqualTo(String value) {
            addCriterion("PRIZE_NAME <>", value, "prizeName");
            return (Criteria) this;
        }

        public Criteria andPrizeNameGreaterThan(String value) {
            addCriterion("PRIZE_NAME >", value, "prizeName");
            return (Criteria) this;
        }

        public Criteria andPrizeNameGreaterThanOrEqualTo(String value) {
            addCriterion("PRIZE_NAME >=", value, "prizeName");
            return (Criteria) this;
        }

        public Criteria andPrizeNameLessThan(String value) {
            addCriterion("PRIZE_NAME <", value, "prizeName");
            return (Criteria) this;
        }

        public Criteria andPrizeNameLessThanOrEqualTo(String value) {
            addCriterion("PRIZE_NAME <=", value, "prizeName");
            return (Criteria) this;
        }

        public Criteria andPrizeNameLike(String value) {
            addCriterion("PRIZE_NAME like", value, "prizeName");
            return (Criteria) this;
        }

        public Criteria andPrizeNameNotLike(String value) {
            addCriterion("PRIZE_NAME not like", value, "prizeName");
            return (Criteria) this;
        }

        public Criteria andPrizeNameIn(List<String> values) {
            addCriterion("PRIZE_NAME in", values, "prizeName");
            return (Criteria) this;
        }

        public Criteria andPrizeNameNotIn(List<String> values) {
            addCriterion("PRIZE_NAME not in", values, "prizeName");
            return (Criteria) this;
        }

        public Criteria andPrizeNameBetween(String value1, String value2) {
            addCriterion("PRIZE_NAME between", value1, value2, "prizeName");
            return (Criteria) this;
        }

        public Criteria andPrizeNameNotBetween(String value1, String value2) {
            addCriterion("PRIZE_NAME not between", value1, value2, "prizeName");
            return (Criteria) this;
        }

        public Criteria andLotteryNumberIsNull() {
            addCriterion("LOTTERY_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andLotteryNumberIsNotNull() {
            addCriterion("LOTTERY_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andLotteryNumberEqualTo(String value) {
            addCriterion("LOTTERY_NUMBER =", value, "lotteryNumber");
            return (Criteria) this;
        }

        public Criteria andLotteryNumberNotEqualTo(String value) {
            addCriterion("LOTTERY_NUMBER <>", value, "lotteryNumber");
            return (Criteria) this;
        }

        public Criteria andLotteryNumberGreaterThan(String value) {
            addCriterion("LOTTERY_NUMBER >", value, "lotteryNumber");
            return (Criteria) this;
        }

        public Criteria andLotteryNumberGreaterThanOrEqualTo(String value) {
            addCriterion("LOTTERY_NUMBER >=", value, "lotteryNumber");
            return (Criteria) this;
        }

        public Criteria andLotteryNumberLessThan(String value) {
            addCriterion("LOTTERY_NUMBER <", value, "lotteryNumber");
            return (Criteria) this;
        }

        public Criteria andLotteryNumberLessThanOrEqualTo(String value) {
            addCriterion("LOTTERY_NUMBER <=", value, "lotteryNumber");
            return (Criteria) this;
        }

        public Criteria andLotteryNumberLike(String value) {
            addCriterion("LOTTERY_NUMBER like", value, "lotteryNumber");
            return (Criteria) this;
        }

        public Criteria andLotteryNumberNotLike(String value) {
            addCriterion("LOTTERY_NUMBER not like", value, "lotteryNumber");
            return (Criteria) this;
        }

        public Criteria andLotteryNumberIn(List<String> values) {
            addCriterion("LOTTERY_NUMBER in", values, "lotteryNumber");
            return (Criteria) this;
        }

        public Criteria andLotteryNumberNotIn(List<String> values) {
            addCriterion("LOTTERY_NUMBER not in", values, "lotteryNumber");
            return (Criteria) this;
        }

        public Criteria andLotteryNumberBetween(String value1, String value2) {
            addCriterion("LOTTERY_NUMBER between", value1, value2, "lotteryNumber");
            return (Criteria) this;
        }

        public Criteria andLotteryNumberNotBetween(String value1, String value2) {
            addCriterion("LOTTERY_NUMBER not between", value1, value2, "lotteryNumber");
            return (Criteria) this;
        }

        public Criteria andSalesmanIsNull() {
            addCriterion("SALESMAN is null");
            return (Criteria) this;
        }

        public Criteria andSalesmanIsNotNull() {
            addCriterion("SALESMAN is not null");
            return (Criteria) this;
        }

        public Criteria andSalesmanEqualTo(String value) {
            addCriterion("SALESMAN =", value, "salesman");
            return (Criteria) this;
        }

        public Criteria andSalesmanNotEqualTo(String value) {
            addCriterion("SALESMAN <>", value, "salesman");
            return (Criteria) this;
        }

        public Criteria andSalesmanGreaterThan(String value) {
            addCriterion("SALESMAN >", value, "salesman");
            return (Criteria) this;
        }

        public Criteria andSalesmanGreaterThanOrEqualTo(String value) {
            addCriterion("SALESMAN >=", value, "salesman");
            return (Criteria) this;
        }

        public Criteria andSalesmanLessThan(String value) {
            addCriterion("SALESMAN <", value, "salesman");
            return (Criteria) this;
        }

        public Criteria andSalesmanLessThanOrEqualTo(String value) {
            addCriterion("SALESMAN <=", value, "salesman");
            return (Criteria) this;
        }

        public Criteria andSalesmanLike(String value) {
            addCriterion("SALESMAN like", value, "salesman");
            return (Criteria) this;
        }

        public Criteria andSalesmanNotLike(String value) {
            addCriterion("SALESMAN not like", value, "salesman");
            return (Criteria) this;
        }

        public Criteria andSalesmanIn(List<String> values) {
            addCriterion("SALESMAN in", values, "salesman");
            return (Criteria) this;
        }

        public Criteria andSalesmanNotIn(List<String> values) {
            addCriterion("SALESMAN not in", values, "salesman");
            return (Criteria) this;
        }

        public Criteria andSalesmanBetween(String value1, String value2) {
            addCriterion("SALESMAN between", value1, value2, "salesman");
            return (Criteria) this;
        }

        public Criteria andSalesmanNotBetween(String value1, String value2) {
            addCriterion("SALESMAN not between", value1, value2, "salesman");
            return (Criteria) this;
        }

        public Criteria andSalesmanPhoneIsNull() {
            addCriterion("SALESMAN_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andSalesmanPhoneIsNotNull() {
            addCriterion("SALESMAN_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andSalesmanPhoneEqualTo(String value) {
            addCriterion("SALESMAN_PHONE =", value, "salesmanPhone");
            return (Criteria) this;
        }

        public Criteria andSalesmanPhoneNotEqualTo(String value) {
            addCriterion("SALESMAN_PHONE <>", value, "salesmanPhone");
            return (Criteria) this;
        }

        public Criteria andSalesmanPhoneGreaterThan(String value) {
            addCriterion("SALESMAN_PHONE >", value, "salesmanPhone");
            return (Criteria) this;
        }

        public Criteria andSalesmanPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("SALESMAN_PHONE >=", value, "salesmanPhone");
            return (Criteria) this;
        }

        public Criteria andSalesmanPhoneLessThan(String value) {
            addCriterion("SALESMAN_PHONE <", value, "salesmanPhone");
            return (Criteria) this;
        }

        public Criteria andSalesmanPhoneLessThanOrEqualTo(String value) {
            addCriterion("SALESMAN_PHONE <=", value, "salesmanPhone");
            return (Criteria) this;
        }

        public Criteria andSalesmanPhoneLike(String value) {
            addCriterion("SALESMAN_PHONE like", value, "salesmanPhone");
            return (Criteria) this;
        }

        public Criteria andSalesmanPhoneNotLike(String value) {
            addCriterion("SALESMAN_PHONE not like", value, "salesmanPhone");
            return (Criteria) this;
        }

        public Criteria andSalesmanPhoneIn(List<String> values) {
            addCriterion("SALESMAN_PHONE in", values, "salesmanPhone");
            return (Criteria) this;
        }

        public Criteria andSalesmanPhoneNotIn(List<String> values) {
            addCriterion("SALESMAN_PHONE not in", values, "salesmanPhone");
            return (Criteria) this;
        }

        public Criteria andSalesmanPhoneBetween(String value1, String value2) {
            addCriterion("SALESMAN_PHONE between", value1, value2, "salesmanPhone");
            return (Criteria) this;
        }

        public Criteria andSalesmanPhoneNotBetween(String value1, String value2) {
            addCriterion("SALESMAN_PHONE not between", value1, value2, "salesmanPhone");
            return (Criteria) this;
        }

        public Criteria andSalesmanAgencyIsNull() {
            addCriterion("SALESMAN_AGENCY is null");
            return (Criteria) this;
        }

        public Criteria andSalesmanAgencyIsNotNull() {
            addCriterion("SALESMAN_AGENCY is not null");
            return (Criteria) this;
        }

        public Criteria andSalesmanAgencyEqualTo(String value) {
            addCriterion("SALESMAN_AGENCY =", value, "salesmanAgency");
            return (Criteria) this;
        }

        public Criteria andSalesmanAgencyNotEqualTo(String value) {
            addCriterion("SALESMAN_AGENCY <>", value, "salesmanAgency");
            return (Criteria) this;
        }

        public Criteria andSalesmanAgencyGreaterThan(String value) {
            addCriterion("SALESMAN_AGENCY >", value, "salesmanAgency");
            return (Criteria) this;
        }

        public Criteria andSalesmanAgencyGreaterThanOrEqualTo(String value) {
            addCriterion("SALESMAN_AGENCY >=", value, "salesmanAgency");
            return (Criteria) this;
        }

        public Criteria andSalesmanAgencyLessThan(String value) {
            addCriterion("SALESMAN_AGENCY <", value, "salesmanAgency");
            return (Criteria) this;
        }

        public Criteria andSalesmanAgencyLessThanOrEqualTo(String value) {
            addCriterion("SALESMAN_AGENCY <=", value, "salesmanAgency");
            return (Criteria) this;
        }

        public Criteria andSalesmanAgencyLike(String value) {
            addCriterion("SALESMAN_AGENCY like", value, "salesmanAgency");
            return (Criteria) this;
        }

        public Criteria andSalesmanAgencyNotLike(String value) {
            addCriterion("SALESMAN_AGENCY not like", value, "salesmanAgency");
            return (Criteria) this;
        }

        public Criteria andSalesmanAgencyIn(List<String> values) {
            addCriterion("SALESMAN_AGENCY in", values, "salesmanAgency");
            return (Criteria) this;
        }

        public Criteria andSalesmanAgencyNotIn(List<String> values) {
            addCriterion("SALESMAN_AGENCY not in", values, "salesmanAgency");
            return (Criteria) this;
        }

        public Criteria andSalesmanAgencyBetween(String value1, String value2) {
            addCriterion("SALESMAN_AGENCY between", value1, value2, "salesmanAgency");
            return (Criteria) this;
        }

        public Criteria andSalesmanAgencyNotBetween(String value1, String value2) {
            addCriterion("SALESMAN_AGENCY not between", value1, value2, "salesmanAgency");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("USERNAME is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("USERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("USERNAME =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("USERNAME <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("USERNAME >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("USERNAME >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("USERNAME <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("USERNAME <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("USERNAME like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("USERNAME not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("USERNAME in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("USERNAME not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("USERNAME between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("USERNAME not between", value1, value2, "username");
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