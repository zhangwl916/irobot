package com.irobotop.equipment.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MapPoiDetailsDOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MapPoiDetailsDOExample() {
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

        public Criteria andTaskIdIsNull() {
            addCriterion("task_id is null");
            return (Criteria) this;
        }

        public Criteria andTaskIdIsNotNull() {
            addCriterion("task_id is not null");
            return (Criteria) this;
        }

        public Criteria andTaskIdEqualTo(Integer value) {
            addCriterion("task_id =", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotEqualTo(Integer value) {
            addCriterion("task_id <>", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdGreaterThan(Integer value) {
            addCriterion("task_id >", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("task_id >=", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLessThan(Integer value) {
            addCriterion("task_id <", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLessThanOrEqualTo(Integer value) {
            addCriterion("task_id <=", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdIn(List<Integer> values) {
            addCriterion("task_id in", values, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotIn(List<Integer> values) {
            addCriterion("task_id not in", values, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdBetween(Integer value1, Integer value2) {
            addCriterion("task_id between", value1, value2, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotBetween(Integer value1, Integer value2) {
            addCriterion("task_id not between", value1, value2, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskTypeIsNull() {
            addCriterion("task_type is null");
            return (Criteria) this;
        }

        public Criteria andTaskTypeIsNotNull() {
            addCriterion("task_type is not null");
            return (Criteria) this;
        }

        public Criteria andTaskTypeEqualTo(String value) {
            addCriterion("task_type =", value, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeNotEqualTo(String value) {
            addCriterion("task_type <>", value, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeGreaterThan(String value) {
            addCriterion("task_type >", value, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeGreaterThanOrEqualTo(String value) {
            addCriterion("task_type >=", value, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeLessThan(String value) {
            addCriterion("task_type <", value, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeLessThanOrEqualTo(String value) {
            addCriterion("task_type <=", value, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeLike(String value) {
            addCriterion("task_type like", value, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeNotLike(String value) {
            addCriterion("task_type not like", value, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeIn(List<String> values) {
            addCriterion("task_type in", values, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeNotIn(List<String> values) {
            addCriterion("task_type not in", values, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeBetween(String value1, String value2) {
            addCriterion("task_type between", value1, value2, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeNotBetween(String value1, String value2) {
            addCriterion("task_type not between", value1, value2, "taskType");
            return (Criteria) this;
        }

        public Criteria andMapIdIsNull() {
            addCriterion("map_id is null");
            return (Criteria) this;
        }

        public Criteria andMapIdIsNotNull() {
            addCriterion("map_id is not null");
            return (Criteria) this;
        }

        public Criteria andMapIdEqualTo(String value) {
            addCriterion("map_id =", value, "mapId");
            return (Criteria) this;
        }

        public Criteria andMapIdNotEqualTo(String value) {
            addCriterion("map_id <>", value, "mapId");
            return (Criteria) this;
        }

        public Criteria andMapIdGreaterThan(String value) {
            addCriterion("map_id >", value, "mapId");
            return (Criteria) this;
        }

        public Criteria andMapIdGreaterThanOrEqualTo(String value) {
            addCriterion("map_id >=", value, "mapId");
            return (Criteria) this;
        }

        public Criteria andMapIdLessThan(String value) {
            addCriterion("map_id <", value, "mapId");
            return (Criteria) this;
        }

        public Criteria andMapIdLessThanOrEqualTo(String value) {
            addCriterion("map_id <=", value, "mapId");
            return (Criteria) this;
        }

        public Criteria andMapIdLike(String value) {
            addCriterion("map_id like", value, "mapId");
            return (Criteria) this;
        }

        public Criteria andMapIdNotLike(String value) {
            addCriterion("map_id not like", value, "mapId");
            return (Criteria) this;
        }

        public Criteria andMapIdIn(List<String> values) {
            addCriterion("map_id in", values, "mapId");
            return (Criteria) this;
        }

        public Criteria andMapIdNotIn(List<String> values) {
            addCriterion("map_id not in", values, "mapId");
            return (Criteria) this;
        }

        public Criteria andMapIdBetween(String value1, String value2) {
            addCriterion("map_id between", value1, value2, "mapId");
            return (Criteria) this;
        }

        public Criteria andMapIdNotBetween(String value1, String value2) {
            addCriterion("map_id not between", value1, value2, "mapId");
            return (Criteria) this;
        }

        public Criteria andPoiIdIsNull() {
            addCriterion("poi_id is null");
            return (Criteria) this;
        }

        public Criteria andPoiIdIsNotNull() {
            addCriterion("poi_id is not null");
            return (Criteria) this;
        }

        public Criteria andPoiIdEqualTo(Integer value) {
            addCriterion("poi_id =", value, "poiId");
            return (Criteria) this;
        }

        public Criteria andPoiIdNotEqualTo(Integer value) {
            addCriterion("poi_id <>", value, "poiId");
            return (Criteria) this;
        }

        public Criteria andPoiIdGreaterThan(Integer value) {
            addCriterion("poi_id >", value, "poiId");
            return (Criteria) this;
        }

        public Criteria andPoiIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("poi_id >=", value, "poiId");
            return (Criteria) this;
        }

        public Criteria andPoiIdLessThan(Integer value) {
            addCriterion("poi_id <", value, "poiId");
            return (Criteria) this;
        }

        public Criteria andPoiIdLessThanOrEqualTo(Integer value) {
            addCriterion("poi_id <=", value, "poiId");
            return (Criteria) this;
        }

        public Criteria andPoiIdIn(List<Integer> values) {
            addCriterion("poi_id in", values, "poiId");
            return (Criteria) this;
        }

        public Criteria andPoiIdNotIn(List<Integer> values) {
            addCriterion("poi_id not in", values, "poiId");
            return (Criteria) this;
        }

        public Criteria andPoiIdBetween(Integer value1, Integer value2) {
            addCriterion("poi_id between", value1, value2, "poiId");
            return (Criteria) this;
        }

        public Criteria andPoiIdNotBetween(Integer value1, Integer value2) {
            addCriterion("poi_id not between", value1, value2, "poiId");
            return (Criteria) this;
        }

        public Criteria andPoiNameIsNull() {
            addCriterion("poi_name is null");
            return (Criteria) this;
        }

        public Criteria andPoiNameIsNotNull() {
            addCriterion("poi_name is not null");
            return (Criteria) this;
        }

        public Criteria andPoiNameEqualTo(String value) {
            addCriterion("poi_name =", value, "poiName");
            return (Criteria) this;
        }

        public Criteria andPoiNameNotEqualTo(String value) {
            addCriterion("poi_name <>", value, "poiName");
            return (Criteria) this;
        }

        public Criteria andPoiNameGreaterThan(String value) {
            addCriterion("poi_name >", value, "poiName");
            return (Criteria) this;
        }

        public Criteria andPoiNameGreaterThanOrEqualTo(String value) {
            addCriterion("poi_name >=", value, "poiName");
            return (Criteria) this;
        }

        public Criteria andPoiNameLessThan(String value) {
            addCriterion("poi_name <", value, "poiName");
            return (Criteria) this;
        }

        public Criteria andPoiNameLessThanOrEqualTo(String value) {
            addCriterion("poi_name <=", value, "poiName");
            return (Criteria) this;
        }

        public Criteria andPoiNameLike(String value) {
            addCriterion("poi_name like", value, "poiName");
            return (Criteria) this;
        }

        public Criteria andPoiNameNotLike(String value) {
            addCriterion("poi_name not like", value, "poiName");
            return (Criteria) this;
        }

        public Criteria andPoiNameIn(List<String> values) {
            addCriterion("poi_name in", values, "poiName");
            return (Criteria) this;
        }

        public Criteria andPoiNameNotIn(List<String> values) {
            addCriterion("poi_name not in", values, "poiName");
            return (Criteria) this;
        }

        public Criteria andPoiNameBetween(String value1, String value2) {
            addCriterion("poi_name between", value1, value2, "poiName");
            return (Criteria) this;
        }

        public Criteria andPoiNameNotBetween(String value1, String value2) {
            addCriterion("poi_name not between", value1, value2, "poiName");
            return (Criteria) this;
        }

        public Criteria andVoiceIsNull() {
            addCriterion("voice is null");
            return (Criteria) this;
        }

        public Criteria andVoiceIsNotNull() {
            addCriterion("voice is not null");
            return (Criteria) this;
        }

        public Criteria andVoiceEqualTo(String value) {
            addCriterion("voice =", value, "voice");
            return (Criteria) this;
        }

        public Criteria andVoiceNotEqualTo(String value) {
            addCriterion("voice <>", value, "voice");
            return (Criteria) this;
        }

        public Criteria andVoiceGreaterThan(String value) {
            addCriterion("voice >", value, "voice");
            return (Criteria) this;
        }

        public Criteria andVoiceGreaterThanOrEqualTo(String value) {
            addCriterion("voice >=", value, "voice");
            return (Criteria) this;
        }

        public Criteria andVoiceLessThan(String value) {
            addCriterion("voice <", value, "voice");
            return (Criteria) this;
        }

        public Criteria andVoiceLessThanOrEqualTo(String value) {
            addCriterion("voice <=", value, "voice");
            return (Criteria) this;
        }

        public Criteria andVoiceLike(String value) {
            addCriterion("voice like", value, "voice");
            return (Criteria) this;
        }

        public Criteria andVoiceNotLike(String value) {
            addCriterion("voice not like", value, "voice");
            return (Criteria) this;
        }

        public Criteria andVoiceIn(List<String> values) {
            addCriterion("voice in", values, "voice");
            return (Criteria) this;
        }

        public Criteria andVoiceNotIn(List<String> values) {
            addCriterion("voice not in", values, "voice");
            return (Criteria) this;
        }

        public Criteria andVoiceBetween(String value1, String value2) {
            addCriterion("voice between", value1, value2, "voice");
            return (Criteria) this;
        }

        public Criteria andVoiceNotBetween(String value1, String value2) {
            addCriterion("voice not between", value1, value2, "voice");
            return (Criteria) this;
        }

        public Criteria andEmojiIsNull() {
            addCriterion("emoji is null");
            return (Criteria) this;
        }

        public Criteria andEmojiIsNotNull() {
            addCriterion("emoji is not null");
            return (Criteria) this;
        }

        public Criteria andEmojiEqualTo(String value) {
            addCriterion("emoji =", value, "emoji");
            return (Criteria) this;
        }

        public Criteria andEmojiNotEqualTo(String value) {
            addCriterion("emoji <>", value, "emoji");
            return (Criteria) this;
        }

        public Criteria andEmojiGreaterThan(String value) {
            addCriterion("emoji >", value, "emoji");
            return (Criteria) this;
        }

        public Criteria andEmojiGreaterThanOrEqualTo(String value) {
            addCriterion("emoji >=", value, "emoji");
            return (Criteria) this;
        }

        public Criteria andEmojiLessThan(String value) {
            addCriterion("emoji <", value, "emoji");
            return (Criteria) this;
        }

        public Criteria andEmojiLessThanOrEqualTo(String value) {
            addCriterion("emoji <=", value, "emoji");
            return (Criteria) this;
        }

        public Criteria andEmojiLike(String value) {
            addCriterion("emoji like", value, "emoji");
            return (Criteria) this;
        }

        public Criteria andEmojiNotLike(String value) {
            addCriterion("emoji not like", value, "emoji");
            return (Criteria) this;
        }

        public Criteria andEmojiIn(List<String> values) {
            addCriterion("emoji in", values, "emoji");
            return (Criteria) this;
        }

        public Criteria andEmojiNotIn(List<String> values) {
            addCriterion("emoji not in", values, "emoji");
            return (Criteria) this;
        }

        public Criteria andEmojiBetween(String value1, String value2) {
            addCriterion("emoji between", value1, value2, "emoji");
            return (Criteria) this;
        }

        public Criteria andEmojiNotBetween(String value1, String value2) {
            addCriterion("emoji not between", value1, value2, "emoji");
            return (Criteria) this;
        }

        public Criteria andEmojiTypeIsNull() {
            addCriterion("emoji_type is null");
            return (Criteria) this;
        }

        public Criteria andEmojiTypeIsNotNull() {
            addCriterion("emoji_type is not null");
            return (Criteria) this;
        }

        public Criteria andEmojiTypeEqualTo(String value) {
            addCriterion("emoji_type =", value, "emojiType");
            return (Criteria) this;
        }

        public Criteria andEmojiTypeNotEqualTo(String value) {
            addCriterion("emoji_type <>", value, "emojiType");
            return (Criteria) this;
        }

        public Criteria andEmojiTypeGreaterThan(String value) {
            addCriterion("emoji_type >", value, "emojiType");
            return (Criteria) this;
        }

        public Criteria andEmojiTypeGreaterThanOrEqualTo(String value) {
            addCriterion("emoji_type >=", value, "emojiType");
            return (Criteria) this;
        }

        public Criteria andEmojiTypeLessThan(String value) {
            addCriterion("emoji_type <", value, "emojiType");
            return (Criteria) this;
        }

        public Criteria andEmojiTypeLessThanOrEqualTo(String value) {
            addCriterion("emoji_type <=", value, "emojiType");
            return (Criteria) this;
        }

        public Criteria andEmojiTypeLike(String value) {
            addCriterion("emoji_type like", value, "emojiType");
            return (Criteria) this;
        }

        public Criteria andEmojiTypeNotLike(String value) {
            addCriterion("emoji_type not like", value, "emojiType");
            return (Criteria) this;
        }

        public Criteria andEmojiTypeIn(List<String> values) {
            addCriterion("emoji_type in", values, "emojiType");
            return (Criteria) this;
        }

        public Criteria andEmojiTypeNotIn(List<String> values) {
            addCriterion("emoji_type not in", values, "emojiType");
            return (Criteria) this;
        }

        public Criteria andEmojiTypeBetween(String value1, String value2) {
            addCriterion("emoji_type between", value1, value2, "emojiType");
            return (Criteria) this;
        }

        public Criteria andEmojiTypeNotBetween(String value1, String value2) {
            addCriterion("emoji_type not between", value1, value2, "emojiType");
            return (Criteria) this;
        }

        public Criteria andResourceIdIsNull() {
            addCriterion("resource_id is null");
            return (Criteria) this;
        }

        public Criteria andResourceIdIsNotNull() {
            addCriterion("resource_id is not null");
            return (Criteria) this;
        }

        public Criteria andResourceIdEqualTo(String value) {
            addCriterion("resource_id =", value, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdNotEqualTo(String value) {
            addCriterion("resource_id <>", value, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdGreaterThan(String value) {
            addCriterion("resource_id >", value, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdGreaterThanOrEqualTo(String value) {
            addCriterion("resource_id >=", value, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdLessThan(String value) {
            addCriterion("resource_id <", value, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdLessThanOrEqualTo(String value) {
            addCriterion("resource_id <=", value, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdLike(String value) {
            addCriterion("resource_id like", value, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdNotLike(String value) {
            addCriterion("resource_id not like", value, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdIn(List<String> values) {
            addCriterion("resource_id in", values, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdNotIn(List<String> values) {
            addCriterion("resource_id not in", values, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdBetween(String value1, String value2) {
            addCriterion("resource_id between", value1, value2, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdNotBetween(String value1, String value2) {
            addCriterion("resource_id not between", value1, value2, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceNameIsNull() {
            addCriterion("resource_name is null");
            return (Criteria) this;
        }

        public Criteria andResourceNameIsNotNull() {
            addCriterion("resource_name is not null");
            return (Criteria) this;
        }

        public Criteria andResourceNameEqualTo(String value) {
            addCriterion("resource_name =", value, "resourceName");
            return (Criteria) this;
        }

        public Criteria andResourceNameNotEqualTo(String value) {
            addCriterion("resource_name <>", value, "resourceName");
            return (Criteria) this;
        }

        public Criteria andResourceNameGreaterThan(String value) {
            addCriterion("resource_name >", value, "resourceName");
            return (Criteria) this;
        }

        public Criteria andResourceNameGreaterThanOrEqualTo(String value) {
            addCriterion("resource_name >=", value, "resourceName");
            return (Criteria) this;
        }

        public Criteria andResourceNameLessThan(String value) {
            addCriterion("resource_name <", value, "resourceName");
            return (Criteria) this;
        }

        public Criteria andResourceNameLessThanOrEqualTo(String value) {
            addCriterion("resource_name <=", value, "resourceName");
            return (Criteria) this;
        }

        public Criteria andResourceNameLike(String value) {
            addCriterion("resource_name like", value, "resourceName");
            return (Criteria) this;
        }

        public Criteria andResourceNameNotLike(String value) {
            addCriterion("resource_name not like", value, "resourceName");
            return (Criteria) this;
        }

        public Criteria andResourceNameIn(List<String> values) {
            addCriterion("resource_name in", values, "resourceName");
            return (Criteria) this;
        }

        public Criteria andResourceNameNotIn(List<String> values) {
            addCriterion("resource_name not in", values, "resourceName");
            return (Criteria) this;
        }

        public Criteria andResourceNameBetween(String value1, String value2) {
            addCriterion("resource_name between", value1, value2, "resourceName");
            return (Criteria) this;
        }

        public Criteria andResourceNameNotBetween(String value1, String value2) {
            addCriterion("resource_name not between", value1, value2, "resourceName");
            return (Criteria) this;
        }

        public Criteria andResourceTypeIsNull() {
            addCriterion("resource_type is null");
            return (Criteria) this;
        }

        public Criteria andResourceTypeIsNotNull() {
            addCriterion("resource_type is not null");
            return (Criteria) this;
        }

        public Criteria andResourceTypeEqualTo(String value) {
            addCriterion("resource_type =", value, "resourceType");
            return (Criteria) this;
        }

        public Criteria andResourceTypeNotEqualTo(String value) {
            addCriterion("resource_type <>", value, "resourceType");
            return (Criteria) this;
        }

        public Criteria andResourceTypeGreaterThan(String value) {
            addCriterion("resource_type >", value, "resourceType");
            return (Criteria) this;
        }

        public Criteria andResourceTypeGreaterThanOrEqualTo(String value) {
            addCriterion("resource_type >=", value, "resourceType");
            return (Criteria) this;
        }

        public Criteria andResourceTypeLessThan(String value) {
            addCriterion("resource_type <", value, "resourceType");
            return (Criteria) this;
        }

        public Criteria andResourceTypeLessThanOrEqualTo(String value) {
            addCriterion("resource_type <=", value, "resourceType");
            return (Criteria) this;
        }

        public Criteria andResourceTypeLike(String value) {
            addCriterion("resource_type like", value, "resourceType");
            return (Criteria) this;
        }

        public Criteria andResourceTypeNotLike(String value) {
            addCriterion("resource_type not like", value, "resourceType");
            return (Criteria) this;
        }

        public Criteria andResourceTypeIn(List<String> values) {
            addCriterion("resource_type in", values, "resourceType");
            return (Criteria) this;
        }

        public Criteria andResourceTypeNotIn(List<String> values) {
            addCriterion("resource_type not in", values, "resourceType");
            return (Criteria) this;
        }

        public Criteria andResourceTypeBetween(String value1, String value2) {
            addCriterion("resource_type between", value1, value2, "resourceType");
            return (Criteria) this;
        }

        public Criteria andResourceTypeNotBetween(String value1, String value2) {
            addCriterion("resource_type not between", value1, value2, "resourceType");
            return (Criteria) this;
        }

        public Criteria andDelayTimeIsNull() {
            addCriterion("delay_time is null");
            return (Criteria) this;
        }

        public Criteria andDelayTimeIsNotNull() {
            addCriterion("delay_time is not null");
            return (Criteria) this;
        }

        public Criteria andDelayTimeEqualTo(String value) {
            addCriterion("delay_time =", value, "delayTime");
            return (Criteria) this;
        }

        public Criteria andDelayTimeNotEqualTo(String value) {
            addCriterion("delay_time <>", value, "delayTime");
            return (Criteria) this;
        }

        public Criteria andDelayTimeGreaterThan(String value) {
            addCriterion("delay_time >", value, "delayTime");
            return (Criteria) this;
        }

        public Criteria andDelayTimeGreaterThanOrEqualTo(String value) {
            addCriterion("delay_time >=", value, "delayTime");
            return (Criteria) this;
        }

        public Criteria andDelayTimeLessThan(String value) {
            addCriterion("delay_time <", value, "delayTime");
            return (Criteria) this;
        }

        public Criteria andDelayTimeLessThanOrEqualTo(String value) {
            addCriterion("delay_time <=", value, "delayTime");
            return (Criteria) this;
        }

        public Criteria andDelayTimeLike(String value) {
            addCriterion("delay_time like", value, "delayTime");
            return (Criteria) this;
        }

        public Criteria andDelayTimeNotLike(String value) {
            addCriterion("delay_time not like", value, "delayTime");
            return (Criteria) this;
        }

        public Criteria andDelayTimeIn(List<String> values) {
            addCriterion("delay_time in", values, "delayTime");
            return (Criteria) this;
        }

        public Criteria andDelayTimeNotIn(List<String> values) {
            addCriterion("delay_time not in", values, "delayTime");
            return (Criteria) this;
        }

        public Criteria andDelayTimeBetween(String value1, String value2) {
            addCriterion("delay_time between", value1, value2, "delayTime");
            return (Criteria) this;
        }

        public Criteria andDelayTimeNotBetween(String value1, String value2) {
            addCriterion("delay_time not between", value1, value2, "delayTime");
            return (Criteria) this;
        }

        public Criteria andPriorityIsNull() {
            addCriterion("priority is null");
            return (Criteria) this;
        }

        public Criteria andPriorityIsNotNull() {
            addCriterion("priority is not null");
            return (Criteria) this;
        }

        public Criteria andPriorityEqualTo(Integer value) {
            addCriterion("priority =", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotEqualTo(Integer value) {
            addCriterion("priority <>", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityGreaterThan(Integer value) {
            addCriterion("priority >", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityGreaterThanOrEqualTo(Integer value) {
            addCriterion("priority >=", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityLessThan(Integer value) {
            addCriterion("priority <", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityLessThanOrEqualTo(Integer value) {
            addCriterion("priority <=", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityIn(List<Integer> values) {
            addCriterion("priority in", values, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotIn(List<Integer> values) {
            addCriterion("priority not in", values, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityBetween(Integer value1, Integer value2) {
            addCriterion("priority between", value1, value2, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotBetween(Integer value1, Integer value2) {
            addCriterion("priority not between", value1, value2, "priority");
            return (Criteria) this;
        }

        public Criteria andTakePoiIdIsNull() {
            addCriterion("take_poi_id is null");
            return (Criteria) this;
        }

        public Criteria andTakePoiIdIsNotNull() {
            addCriterion("take_poi_id is not null");
            return (Criteria) this;
        }

        public Criteria andTakePoiIdEqualTo(Integer value) {
            addCriterion("take_poi_id =", value, "takePoiId");
            return (Criteria) this;
        }

        public Criteria andTakePoiIdNotEqualTo(Integer value) {
            addCriterion("take_poi_id <>", value, "takePoiId");
            return (Criteria) this;
        }

        public Criteria andTakePoiIdGreaterThan(Integer value) {
            addCriterion("take_poi_id >", value, "takePoiId");
            return (Criteria) this;
        }

        public Criteria andTakePoiIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("take_poi_id >=", value, "takePoiId");
            return (Criteria) this;
        }

        public Criteria andTakePoiIdLessThan(Integer value) {
            addCriterion("take_poi_id <", value, "takePoiId");
            return (Criteria) this;
        }

        public Criteria andTakePoiIdLessThanOrEqualTo(Integer value) {
            addCriterion("take_poi_id <=", value, "takePoiId");
            return (Criteria) this;
        }

        public Criteria andTakePoiIdIn(List<Integer> values) {
            addCriterion("take_poi_id in", values, "takePoiId");
            return (Criteria) this;
        }

        public Criteria andTakePoiIdNotIn(List<Integer> values) {
            addCriterion("take_poi_id not in", values, "takePoiId");
            return (Criteria) this;
        }

        public Criteria andTakePoiIdBetween(Integer value1, Integer value2) {
            addCriterion("take_poi_id between", value1, value2, "takePoiId");
            return (Criteria) this;
        }

        public Criteria andTakePoiIdNotBetween(Integer value1, Integer value2) {
            addCriterion("take_poi_id not between", value1, value2, "takePoiId");
            return (Criteria) this;
        }

        public Criteria andTakePoiNameIsNull() {
            addCriterion("take_poi_name is null");
            return (Criteria) this;
        }

        public Criteria andTakePoiNameIsNotNull() {
            addCriterion("take_poi_name is not null");
            return (Criteria) this;
        }

        public Criteria andTakePoiNameEqualTo(String value) {
            addCriterion("take_poi_name =", value, "takePoiName");
            return (Criteria) this;
        }

        public Criteria andTakePoiNameNotEqualTo(String value) {
            addCriterion("take_poi_name <>", value, "takePoiName");
            return (Criteria) this;
        }

        public Criteria andTakePoiNameGreaterThan(String value) {
            addCriterion("take_poi_name >", value, "takePoiName");
            return (Criteria) this;
        }

        public Criteria andTakePoiNameGreaterThanOrEqualTo(String value) {
            addCriterion("take_poi_name >=", value, "takePoiName");
            return (Criteria) this;
        }

        public Criteria andTakePoiNameLessThan(String value) {
            addCriterion("take_poi_name <", value, "takePoiName");
            return (Criteria) this;
        }

        public Criteria andTakePoiNameLessThanOrEqualTo(String value) {
            addCriterion("take_poi_name <=", value, "takePoiName");
            return (Criteria) this;
        }

        public Criteria andTakePoiNameLike(String value) {
            addCriterion("take_poi_name like", value, "takePoiName");
            return (Criteria) this;
        }

        public Criteria andTakePoiNameNotLike(String value) {
            addCriterion("take_poi_name not like", value, "takePoiName");
            return (Criteria) this;
        }

        public Criteria andTakePoiNameIn(List<String> values) {
            addCriterion("take_poi_name in", values, "takePoiName");
            return (Criteria) this;
        }

        public Criteria andTakePoiNameNotIn(List<String> values) {
            addCriterion("take_poi_name not in", values, "takePoiName");
            return (Criteria) this;
        }

        public Criteria andTakePoiNameBetween(String value1, String value2) {
            addCriterion("take_poi_name between", value1, value2, "takePoiName");
            return (Criteria) this;
        }

        public Criteria andTakePoiNameNotBetween(String value1, String value2) {
            addCriterion("take_poi_name not between", value1, value2, "takePoiName");
            return (Criteria) this;
        }

        public Criteria andDeliveryPoiIdIsNull() {
            addCriterion("delivery_poi_id is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryPoiIdIsNotNull() {
            addCriterion("delivery_poi_id is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryPoiIdEqualTo(Integer value) {
            addCriterion("delivery_poi_id =", value, "deliveryPoiId");
            return (Criteria) this;
        }

        public Criteria andDeliveryPoiIdNotEqualTo(Integer value) {
            addCriterion("delivery_poi_id <>", value, "deliveryPoiId");
            return (Criteria) this;
        }

        public Criteria andDeliveryPoiIdGreaterThan(Integer value) {
            addCriterion("delivery_poi_id >", value, "deliveryPoiId");
            return (Criteria) this;
        }

        public Criteria andDeliveryPoiIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("delivery_poi_id >=", value, "deliveryPoiId");
            return (Criteria) this;
        }

        public Criteria andDeliveryPoiIdLessThan(Integer value) {
            addCriterion("delivery_poi_id <", value, "deliveryPoiId");
            return (Criteria) this;
        }

        public Criteria andDeliveryPoiIdLessThanOrEqualTo(Integer value) {
            addCriterion("delivery_poi_id <=", value, "deliveryPoiId");
            return (Criteria) this;
        }

        public Criteria andDeliveryPoiIdIn(List<Integer> values) {
            addCriterion("delivery_poi_id in", values, "deliveryPoiId");
            return (Criteria) this;
        }

        public Criteria andDeliveryPoiIdNotIn(List<Integer> values) {
            addCriterion("delivery_poi_id not in", values, "deliveryPoiId");
            return (Criteria) this;
        }

        public Criteria andDeliveryPoiIdBetween(Integer value1, Integer value2) {
            addCriterion("delivery_poi_id between", value1, value2, "deliveryPoiId");
            return (Criteria) this;
        }

        public Criteria andDeliveryPoiIdNotBetween(Integer value1, Integer value2) {
            addCriterion("delivery_poi_id not between", value1, value2, "deliveryPoiId");
            return (Criteria) this;
        }

        public Criteria andDeliveryPoiNameIsNull() {
            addCriterion("delivery_poi_name is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryPoiNameIsNotNull() {
            addCriterion("delivery_poi_name is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryPoiNameEqualTo(String value) {
            addCriterion("delivery_poi_name =", value, "deliveryPoiName");
            return (Criteria) this;
        }

        public Criteria andDeliveryPoiNameNotEqualTo(String value) {
            addCriterion("delivery_poi_name <>", value, "deliveryPoiName");
            return (Criteria) this;
        }

        public Criteria andDeliveryPoiNameGreaterThan(String value) {
            addCriterion("delivery_poi_name >", value, "deliveryPoiName");
            return (Criteria) this;
        }

        public Criteria andDeliveryPoiNameGreaterThanOrEqualTo(String value) {
            addCriterion("delivery_poi_name >=", value, "deliveryPoiName");
            return (Criteria) this;
        }

        public Criteria andDeliveryPoiNameLessThan(String value) {
            addCriterion("delivery_poi_name <", value, "deliveryPoiName");
            return (Criteria) this;
        }

        public Criteria andDeliveryPoiNameLessThanOrEqualTo(String value) {
            addCriterion("delivery_poi_name <=", value, "deliveryPoiName");
            return (Criteria) this;
        }

        public Criteria andDeliveryPoiNameLike(String value) {
            addCriterion("delivery_poi_name like", value, "deliveryPoiName");
            return (Criteria) this;
        }

        public Criteria andDeliveryPoiNameNotLike(String value) {
            addCriterion("delivery_poi_name not like", value, "deliveryPoiName");
            return (Criteria) this;
        }

        public Criteria andDeliveryPoiNameIn(List<String> values) {
            addCriterion("delivery_poi_name in", values, "deliveryPoiName");
            return (Criteria) this;
        }

        public Criteria andDeliveryPoiNameNotIn(List<String> values) {
            addCriterion("delivery_poi_name not in", values, "deliveryPoiName");
            return (Criteria) this;
        }

        public Criteria andDeliveryPoiNameBetween(String value1, String value2) {
            addCriterion("delivery_poi_name between", value1, value2, "deliveryPoiName");
            return (Criteria) this;
        }

        public Criteria andDeliveryPoiNameNotBetween(String value1, String value2) {
            addCriterion("delivery_poi_name not between", value1, value2, "deliveryPoiName");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameIsNull() {
            addCriterion("create_user_name is null");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameIsNotNull() {
            addCriterion("create_user_name is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameEqualTo(String value) {
            addCriterion("create_user_name =", value, "createUserName");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameNotEqualTo(String value) {
            addCriterion("create_user_name <>", value, "createUserName");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameGreaterThan(String value) {
            addCriterion("create_user_name >", value, "createUserName");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("create_user_name >=", value, "createUserName");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameLessThan(String value) {
            addCriterion("create_user_name <", value, "createUserName");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameLessThanOrEqualTo(String value) {
            addCriterion("create_user_name <=", value, "createUserName");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameLike(String value) {
            addCriterion("create_user_name like", value, "createUserName");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameNotLike(String value) {
            addCriterion("create_user_name not like", value, "createUserName");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameIn(List<String> values) {
            addCriterion("create_user_name in", values, "createUserName");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameNotIn(List<String> values) {
            addCriterion("create_user_name not in", values, "createUserName");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameBetween(String value1, String value2) {
            addCriterion("create_user_name between", value1, value2, "createUserName");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameNotBetween(String value1, String value2) {
            addCriterion("create_user_name not between", value1, value2, "createUserName");
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

        public Criteria andUpdateUserNameIsNull() {
            addCriterion("update_user_name is null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNameIsNotNull() {
            addCriterion("update_user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNameEqualTo(String value) {
            addCriterion("update_user_name =", value, "updateUserName");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNameNotEqualTo(String value) {
            addCriterion("update_user_name <>", value, "updateUserName");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNameGreaterThan(String value) {
            addCriterion("update_user_name >", value, "updateUserName");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("update_user_name >=", value, "updateUserName");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNameLessThan(String value) {
            addCriterion("update_user_name <", value, "updateUserName");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNameLessThanOrEqualTo(String value) {
            addCriterion("update_user_name <=", value, "updateUserName");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNameLike(String value) {
            addCriterion("update_user_name like", value, "updateUserName");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNameNotLike(String value) {
            addCriterion("update_user_name not like", value, "updateUserName");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNameIn(List<String> values) {
            addCriterion("update_user_name in", values, "updateUserName");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNameNotIn(List<String> values) {
            addCriterion("update_user_name not in", values, "updateUserName");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNameBetween(String value1, String value2) {
            addCriterion("update_user_name between", value1, value2, "updateUserName");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNameNotBetween(String value1, String value2) {
            addCriterion("update_user_name not between", value1, value2, "updateUserName");
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

        public Criteria andIsLocationNavigationIsNull() {
            addCriterion("is_location_navigation is null");
            return (Criteria) this;
        }

        public Criteria andIsLocationNavigationIsNotNull() {
            addCriterion("is_location_navigation is not null");
            return (Criteria) this;
        }

        public Criteria andIsLocationNavigationEqualTo(String value) {
            addCriterion("is_location_navigation =", value, "isLocationNavigation");
            return (Criteria) this;
        }

        public Criteria andIsLocationNavigationNotEqualTo(String value) {
            addCriterion("is_location_navigation <>", value, "isLocationNavigation");
            return (Criteria) this;
        }

        public Criteria andIsLocationNavigationGreaterThan(String value) {
            addCriterion("is_location_navigation >", value, "isLocationNavigation");
            return (Criteria) this;
        }

        public Criteria andIsLocationNavigationGreaterThanOrEqualTo(String value) {
            addCriterion("is_location_navigation >=", value, "isLocationNavigation");
            return (Criteria) this;
        }

        public Criteria andIsLocationNavigationLessThan(String value) {
            addCriterion("is_location_navigation <", value, "isLocationNavigation");
            return (Criteria) this;
        }

        public Criteria andIsLocationNavigationLessThanOrEqualTo(String value) {
            addCriterion("is_location_navigation <=", value, "isLocationNavigation");
            return (Criteria) this;
        }

        public Criteria andIsLocationNavigationLike(String value) {
            addCriterion("is_location_navigation like", value, "isLocationNavigation");
            return (Criteria) this;
        }

        public Criteria andIsLocationNavigationNotLike(String value) {
            addCriterion("is_location_navigation not like", value, "isLocationNavigation");
            return (Criteria) this;
        }

        public Criteria andIsLocationNavigationIn(List<String> values) {
            addCriterion("is_location_navigation in", values, "isLocationNavigation");
            return (Criteria) this;
        }

        public Criteria andIsLocationNavigationNotIn(List<String> values) {
            addCriterion("is_location_navigation not in", values, "isLocationNavigation");
            return (Criteria) this;
        }

        public Criteria andIsLocationNavigationBetween(String value1, String value2) {
            addCriterion("is_location_navigation between", value1, value2, "isLocationNavigation");
            return (Criteria) this;
        }

        public Criteria andIsLocationNavigationNotBetween(String value1, String value2) {
            addCriterion("is_location_navigation not between", value1, value2, "isLocationNavigation");
            return (Criteria) this;
        }

        public Criteria andSignlestatusIsNull() {
            addCriterion("signlestatus is null");
            return (Criteria) this;
        }

        public Criteria andSignlestatusIsNotNull() {
            addCriterion("signlestatus is not null");
            return (Criteria) this;
        }

        public Criteria andSignlestatusEqualTo(String value) {
            addCriterion("signlestatus =", value, "signlestatus");
            return (Criteria) this;
        }

        public Criteria andSignlestatusNotEqualTo(String value) {
            addCriterion("signlestatus <>", value, "signlestatus");
            return (Criteria) this;
        }

        public Criteria andSignlestatusGreaterThan(String value) {
            addCriterion("signlestatus >", value, "signlestatus");
            return (Criteria) this;
        }

        public Criteria andSignlestatusGreaterThanOrEqualTo(String value) {
            addCriterion("signlestatus >=", value, "signlestatus");
            return (Criteria) this;
        }

        public Criteria andSignlestatusLessThan(String value) {
            addCriterion("signlestatus <", value, "signlestatus");
            return (Criteria) this;
        }

        public Criteria andSignlestatusLessThanOrEqualTo(String value) {
            addCriterion("signlestatus <=", value, "signlestatus");
            return (Criteria) this;
        }

        public Criteria andSignlestatusLike(String value) {
            addCriterion("signlestatus like", value, "signlestatus");
            return (Criteria) this;
        }

        public Criteria andSignlestatusNotLike(String value) {
            addCriterion("signlestatus not like", value, "signlestatus");
            return (Criteria) this;
        }

        public Criteria andSignlestatusIn(List<String> values) {
            addCriterion("signlestatus in", values, "signlestatus");
            return (Criteria) this;
        }

        public Criteria andSignlestatusNotIn(List<String> values) {
            addCriterion("signlestatus not in", values, "signlestatus");
            return (Criteria) this;
        }

        public Criteria andSignlestatusBetween(String value1, String value2) {
            addCriterion("signlestatus between", value1, value2, "signlestatus");
            return (Criteria) this;
        }

        public Criteria andSignlestatusNotBetween(String value1, String value2) {
            addCriterion("signlestatus not between", value1, value2, "signlestatus");
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