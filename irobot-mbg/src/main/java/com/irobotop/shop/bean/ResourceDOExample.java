package com.irobotop.shop.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ResourceDOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ResourceDOExample() {
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

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNull() {
            addCriterion("user_type is null");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNotNull() {
            addCriterion("user_type is not null");
            return (Criteria) this;
        }

        public Criteria andUserTypeEqualTo(String value) {
            addCriterion("user_type =", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotEqualTo(String value) {
            addCriterion("user_type <>", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThan(String value) {
            addCriterion("user_type >", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThanOrEqualTo(String value) {
            addCriterion("user_type >=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThan(String value) {
            addCriterion("user_type <", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThanOrEqualTo(String value) {
            addCriterion("user_type <=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLike(String value) {
            addCriterion("user_type like", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotLike(String value) {
            addCriterion("user_type not like", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeIn(List<String> values) {
            addCriterion("user_type in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotIn(List<String> values) {
            addCriterion("user_type not in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeBetween(String value1, String value2) {
            addCriterion("user_type between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotBetween(String value1, String value2) {
            addCriterion("user_type not between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andUrlIsNull() {
            addCriterion("url is null");
            return (Criteria) this;
        }

        public Criteria andUrlIsNotNull() {
            addCriterion("url is not null");
            return (Criteria) this;
        }

        public Criteria andUrlEqualTo(String value) {
            addCriterion("url =", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotEqualTo(String value) {
            addCriterion("url <>", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThan(String value) {
            addCriterion("url >", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThanOrEqualTo(String value) {
            addCriterion("url >=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThan(String value) {
            addCriterion("url <", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThanOrEqualTo(String value) {
            addCriterion("url <=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLike(String value) {
            addCriterion("url like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotLike(String value) {
            addCriterion("url not like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlIn(List<String> values) {
            addCriterion("url in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotIn(List<String> values) {
            addCriterion("url not in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlBetween(String value1, String value2) {
            addCriterion("url between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotBetween(String value1, String value2) {
            addCriterion("url not between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andOssurlIsNull() {
            addCriterion("ossurl is null");
            return (Criteria) this;
        }

        public Criteria andOssurlIsNotNull() {
            addCriterion("ossurl is not null");
            return (Criteria) this;
        }

        public Criteria andOssurlEqualTo(String value) {
            addCriterion("ossurl =", value, "ossurl");
            return (Criteria) this;
        }

        public Criteria andOssurlNotEqualTo(String value) {
            addCriterion("ossurl <>", value, "ossurl");
            return (Criteria) this;
        }

        public Criteria andOssurlGreaterThan(String value) {
            addCriterion("ossurl >", value, "ossurl");
            return (Criteria) this;
        }

        public Criteria andOssurlGreaterThanOrEqualTo(String value) {
            addCriterion("ossurl >=", value, "ossurl");
            return (Criteria) this;
        }

        public Criteria andOssurlLessThan(String value) {
            addCriterion("ossurl <", value, "ossurl");
            return (Criteria) this;
        }

        public Criteria andOssurlLessThanOrEqualTo(String value) {
            addCriterion("ossurl <=", value, "ossurl");
            return (Criteria) this;
        }

        public Criteria andOssurlLike(String value) {
            addCriterion("ossurl like", value, "ossurl");
            return (Criteria) this;
        }

        public Criteria andOssurlNotLike(String value) {
            addCriterion("ossurl not like", value, "ossurl");
            return (Criteria) this;
        }

        public Criteria andOssurlIn(List<String> values) {
            addCriterion("ossurl in", values, "ossurl");
            return (Criteria) this;
        }

        public Criteria andOssurlNotIn(List<String> values) {
            addCriterion("ossurl not in", values, "ossurl");
            return (Criteria) this;
        }

        public Criteria andOssurlBetween(String value1, String value2) {
            addCriterion("ossurl between", value1, value2, "ossurl");
            return (Criteria) this;
        }

        public Criteria andOssurlNotBetween(String value1, String value2) {
            addCriterion("ossurl not between", value1, value2, "ossurl");
            return (Criteria) this;
        }

        public Criteria andFilesizeIsNull() {
            addCriterion("filesize is null");
            return (Criteria) this;
        }

        public Criteria andFilesizeIsNotNull() {
            addCriterion("filesize is not null");
            return (Criteria) this;
        }

        public Criteria andFilesizeEqualTo(String value) {
            addCriterion("filesize =", value, "filesize");
            return (Criteria) this;
        }

        public Criteria andFilesizeNotEqualTo(String value) {
            addCriterion("filesize <>", value, "filesize");
            return (Criteria) this;
        }

        public Criteria andFilesizeGreaterThan(String value) {
            addCriterion("filesize >", value, "filesize");
            return (Criteria) this;
        }

        public Criteria andFilesizeGreaterThanOrEqualTo(String value) {
            addCriterion("filesize >=", value, "filesize");
            return (Criteria) this;
        }

        public Criteria andFilesizeLessThan(String value) {
            addCriterion("filesize <", value, "filesize");
            return (Criteria) this;
        }

        public Criteria andFilesizeLessThanOrEqualTo(String value) {
            addCriterion("filesize <=", value, "filesize");
            return (Criteria) this;
        }

        public Criteria andFilesizeLike(String value) {
            addCriterion("filesize like", value, "filesize");
            return (Criteria) this;
        }

        public Criteria andFilesizeNotLike(String value) {
            addCriterion("filesize not like", value, "filesize");
            return (Criteria) this;
        }

        public Criteria andFilesizeIn(List<String> values) {
            addCriterion("filesize in", values, "filesize");
            return (Criteria) this;
        }

        public Criteria andFilesizeNotIn(List<String> values) {
            addCriterion("filesize not in", values, "filesize");
            return (Criteria) this;
        }

        public Criteria andFilesizeBetween(String value1, String value2) {
            addCriterion("filesize between", value1, value2, "filesize");
            return (Criteria) this;
        }

        public Criteria andFilesizeNotBetween(String value1, String value2) {
            addCriterion("filesize not between", value1, value2, "filesize");
            return (Criteria) this;
        }

        public Criteria andFiletimeIsNull() {
            addCriterion("filetime is null");
            return (Criteria) this;
        }

        public Criteria andFiletimeIsNotNull() {
            addCriterion("filetime is not null");
            return (Criteria) this;
        }

        public Criteria andFiletimeEqualTo(String value) {
            addCriterion("filetime =", value, "filetime");
            return (Criteria) this;
        }

        public Criteria andFiletimeNotEqualTo(String value) {
            addCriterion("filetime <>", value, "filetime");
            return (Criteria) this;
        }

        public Criteria andFiletimeGreaterThan(String value) {
            addCriterion("filetime >", value, "filetime");
            return (Criteria) this;
        }

        public Criteria andFiletimeGreaterThanOrEqualTo(String value) {
            addCriterion("filetime >=", value, "filetime");
            return (Criteria) this;
        }

        public Criteria andFiletimeLessThan(String value) {
            addCriterion("filetime <", value, "filetime");
            return (Criteria) this;
        }

        public Criteria andFiletimeLessThanOrEqualTo(String value) {
            addCriterion("filetime <=", value, "filetime");
            return (Criteria) this;
        }

        public Criteria andFiletimeLike(String value) {
            addCriterion("filetime like", value, "filetime");
            return (Criteria) this;
        }

        public Criteria andFiletimeNotLike(String value) {
            addCriterion("filetime not like", value, "filetime");
            return (Criteria) this;
        }

        public Criteria andFiletimeIn(List<String> values) {
            addCriterion("filetime in", values, "filetime");
            return (Criteria) this;
        }

        public Criteria andFiletimeNotIn(List<String> values) {
            addCriterion("filetime not in", values, "filetime");
            return (Criteria) this;
        }

        public Criteria andFiletimeBetween(String value1, String value2) {
            addCriterion("filetime between", value1, value2, "filetime");
            return (Criteria) this;
        }

        public Criteria andFiletimeNotBetween(String value1, String value2) {
            addCriterion("filetime not between", value1, value2, "filetime");
            return (Criteria) this;
        }

        public Criteria andFilenameIsNull() {
            addCriterion("filename is null");
            return (Criteria) this;
        }

        public Criteria andFilenameIsNotNull() {
            addCriterion("filename is not null");
            return (Criteria) this;
        }

        public Criteria andFilenameEqualTo(String value) {
            addCriterion("filename =", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameNotEqualTo(String value) {
            addCriterion("filename <>", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameGreaterThan(String value) {
            addCriterion("filename >", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameGreaterThanOrEqualTo(String value) {
            addCriterion("filename >=", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameLessThan(String value) {
            addCriterion("filename <", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameLessThanOrEqualTo(String value) {
            addCriterion("filename <=", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameLike(String value) {
            addCriterion("filename like", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameNotLike(String value) {
            addCriterion("filename not like", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameIn(List<String> values) {
            addCriterion("filename in", values, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameNotIn(List<String> values) {
            addCriterion("filename not in", values, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameBetween(String value1, String value2) {
            addCriterion("filename between", value1, value2, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameNotBetween(String value1, String value2) {
            addCriterion("filename not between", value1, value2, "filename");
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

        public Criteria andShopIdEqualTo(String value) {
            addCriterion("shop_id =", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotEqualTo(String value) {
            addCriterion("shop_id <>", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdGreaterThan(String value) {
            addCriterion("shop_id >", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdGreaterThanOrEqualTo(String value) {
            addCriterion("shop_id >=", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdLessThan(String value) {
            addCriterion("shop_id <", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdLessThanOrEqualTo(String value) {
            addCriterion("shop_id <=", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdLike(String value) {
            addCriterion("shop_id like", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotLike(String value) {
            addCriterion("shop_id not like", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdIn(List<String> values) {
            addCriterion("shop_id in", values, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotIn(List<String> values) {
            addCriterion("shop_id not in", values, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdBetween(String value1, String value2) {
            addCriterion("shop_id between", value1, value2, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotBetween(String value1, String value2) {
            addCriterion("shop_id not between", value1, value2, "shopId");
            return (Criteria) this;
        }

        public Criteria andDeveloperIdIsNull() {
            addCriterion("developer_id is null");
            return (Criteria) this;
        }

        public Criteria andDeveloperIdIsNotNull() {
            addCriterion("developer_id is not null");
            return (Criteria) this;
        }

        public Criteria andDeveloperIdEqualTo(String value) {
            addCriterion("developer_id =", value, "developerId");
            return (Criteria) this;
        }

        public Criteria andDeveloperIdNotEqualTo(String value) {
            addCriterion("developer_id <>", value, "developerId");
            return (Criteria) this;
        }

        public Criteria andDeveloperIdGreaterThan(String value) {
            addCriterion("developer_id >", value, "developerId");
            return (Criteria) this;
        }

        public Criteria andDeveloperIdGreaterThanOrEqualTo(String value) {
            addCriterion("developer_id >=", value, "developerId");
            return (Criteria) this;
        }

        public Criteria andDeveloperIdLessThan(String value) {
            addCriterion("developer_id <", value, "developerId");
            return (Criteria) this;
        }

        public Criteria andDeveloperIdLessThanOrEqualTo(String value) {
            addCriterion("developer_id <=", value, "developerId");
            return (Criteria) this;
        }

        public Criteria andDeveloperIdLike(String value) {
            addCriterion("developer_id like", value, "developerId");
            return (Criteria) this;
        }

        public Criteria andDeveloperIdNotLike(String value) {
            addCriterion("developer_id not like", value, "developerId");
            return (Criteria) this;
        }

        public Criteria andDeveloperIdIn(List<String> values) {
            addCriterion("developer_id in", values, "developerId");
            return (Criteria) this;
        }

        public Criteria andDeveloperIdNotIn(List<String> values) {
            addCriterion("developer_id not in", values, "developerId");
            return (Criteria) this;
        }

        public Criteria andDeveloperIdBetween(String value1, String value2) {
            addCriterion("developer_id between", value1, value2, "developerId");
            return (Criteria) this;
        }

        public Criteria andDeveloperIdNotBetween(String value1, String value2) {
            addCriterion("developer_id not between", value1, value2, "developerId");
            return (Criteria) this;
        }

        public Criteria andCuerIsNull() {
            addCriterion("cuer is null");
            return (Criteria) this;
        }

        public Criteria andCuerIsNotNull() {
            addCriterion("cuer is not null");
            return (Criteria) this;
        }

        public Criteria andCuerEqualTo(String value) {
            addCriterion("cuer =", value, "cuer");
            return (Criteria) this;
        }

        public Criteria andCuerNotEqualTo(String value) {
            addCriterion("cuer <>", value, "cuer");
            return (Criteria) this;
        }

        public Criteria andCuerGreaterThan(String value) {
            addCriterion("cuer >", value, "cuer");
            return (Criteria) this;
        }

        public Criteria andCuerGreaterThanOrEqualTo(String value) {
            addCriterion("cuer >=", value, "cuer");
            return (Criteria) this;
        }

        public Criteria andCuerLessThan(String value) {
            addCriterion("cuer <", value, "cuer");
            return (Criteria) this;
        }

        public Criteria andCuerLessThanOrEqualTo(String value) {
            addCriterion("cuer <=", value, "cuer");
            return (Criteria) this;
        }

        public Criteria andCuerLike(String value) {
            addCriterion("cuer like", value, "cuer");
            return (Criteria) this;
        }

        public Criteria andCuerNotLike(String value) {
            addCriterion("cuer not like", value, "cuer");
            return (Criteria) this;
        }

        public Criteria andCuerIn(List<String> values) {
            addCriterion("cuer in", values, "cuer");
            return (Criteria) this;
        }

        public Criteria andCuerNotIn(List<String> values) {
            addCriterion("cuer not in", values, "cuer");
            return (Criteria) this;
        }

        public Criteria andCuerBetween(String value1, String value2) {
            addCriterion("cuer between", value1, value2, "cuer");
            return (Criteria) this;
        }

        public Criteria andCuerNotBetween(String value1, String value2) {
            addCriterion("cuer not between", value1, value2, "cuer");
            return (Criteria) this;
        }

        public Criteria andOwnerIsNull() {
            addCriterion("owner is null");
            return (Criteria) this;
        }

        public Criteria andOwnerIsNotNull() {
            addCriterion("owner is not null");
            return (Criteria) this;
        }

        public Criteria andOwnerEqualTo(String value) {
            addCriterion("owner =", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerNotEqualTo(String value) {
            addCriterion("owner <>", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerGreaterThan(String value) {
            addCriterion("owner >", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerGreaterThanOrEqualTo(String value) {
            addCriterion("owner >=", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerLessThan(String value) {
            addCriterion("owner <", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerLessThanOrEqualTo(String value) {
            addCriterion("owner <=", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerLike(String value) {
            addCriterion("owner like", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerNotLike(String value) {
            addCriterion("owner not like", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerIn(List<String> values) {
            addCriterion("owner in", values, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerNotIn(List<String> values) {
            addCriterion("owner not in", values, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerBetween(String value1, String value2) {
            addCriterion("owner between", value1, value2, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerNotBetween(String value1, String value2) {
            addCriterion("owner not between", value1, value2, "owner");
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

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andDelFlagIsNull() {
            addCriterion("del_flag is null");
            return (Criteria) this;
        }

        public Criteria andDelFlagIsNotNull() {
            addCriterion("del_flag is not null");
            return (Criteria) this;
        }

        public Criteria andDelFlagEqualTo(String value) {
            addCriterion("del_flag =", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotEqualTo(String value) {
            addCriterion("del_flag <>", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagGreaterThan(String value) {
            addCriterion("del_flag >", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagGreaterThanOrEqualTo(String value) {
            addCriterion("del_flag >=", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagLessThan(String value) {
            addCriterion("del_flag <", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagLessThanOrEqualTo(String value) {
            addCriterion("del_flag <=", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagLike(String value) {
            addCriterion("del_flag like", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotLike(String value) {
            addCriterion("del_flag not like", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagIn(List<String> values) {
            addCriterion("del_flag in", values, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotIn(List<String> values) {
            addCriterion("del_flag not in", values, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagBetween(String value1, String value2) {
            addCriterion("del_flag between", value1, value2, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotBetween(String value1, String value2) {
            addCriterion("del_flag not between", value1, value2, "delFlag");
            return (Criteria) this;
        }

        public Criteria andCuernameIsNull() {
            addCriterion("cuername is null");
            return (Criteria) this;
        }

        public Criteria andCuernameIsNotNull() {
            addCriterion("cuername is not null");
            return (Criteria) this;
        }

        public Criteria andCuernameEqualTo(String value) {
            addCriterion("cuername =", value, "cuername");
            return (Criteria) this;
        }

        public Criteria andCuernameNotEqualTo(String value) {
            addCriterion("cuername <>", value, "cuername");
            return (Criteria) this;
        }

        public Criteria andCuernameGreaterThan(String value) {
            addCriterion("cuername >", value, "cuername");
            return (Criteria) this;
        }

        public Criteria andCuernameGreaterThanOrEqualTo(String value) {
            addCriterion("cuername >=", value, "cuername");
            return (Criteria) this;
        }

        public Criteria andCuernameLessThan(String value) {
            addCriterion("cuername <", value, "cuername");
            return (Criteria) this;
        }

        public Criteria andCuernameLessThanOrEqualTo(String value) {
            addCriterion("cuername <=", value, "cuername");
            return (Criteria) this;
        }

        public Criteria andCuernameLike(String value) {
            addCriterion("cuername like", value, "cuername");
            return (Criteria) this;
        }

        public Criteria andCuernameNotLike(String value) {
            addCriterion("cuername not like", value, "cuername");
            return (Criteria) this;
        }

        public Criteria andCuernameIn(List<String> values) {
            addCriterion("cuername in", values, "cuername");
            return (Criteria) this;
        }

        public Criteria andCuernameNotIn(List<String> values) {
            addCriterion("cuername not in", values, "cuername");
            return (Criteria) this;
        }

        public Criteria andCuernameBetween(String value1, String value2) {
            addCriterion("cuername between", value1, value2, "cuername");
            return (Criteria) this;
        }

        public Criteria andCuernameNotBetween(String value1, String value2) {
            addCriterion("cuername not between", value1, value2, "cuername");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
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