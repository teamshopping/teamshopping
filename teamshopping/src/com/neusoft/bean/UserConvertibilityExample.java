package com.neusoft.bean;

import java.util.ArrayList;
import java.util.List;

public class UserConvertibilityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserConvertibilityExample() {
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

        public Criteria andUConvertibilityIdIsNull() {
            addCriterion("u_convertibility_id is null");
            return (Criteria) this;
        }

        public Criteria andUConvertibilityIdIsNotNull() {
            addCriterion("u_convertibility_id is not null");
            return (Criteria) this;
        }

        public Criteria andUConvertibilityIdEqualTo(Integer value) {
            addCriterion("u_convertibility_id =", value, "uConvertibilityId");
            return (Criteria) this;
        }

        public Criteria andUConvertibilityIdNotEqualTo(Integer value) {
            addCriterion("u_convertibility_id <>", value, "uConvertibilityId");
            return (Criteria) this;
        }

        public Criteria andUConvertibilityIdGreaterThan(Integer value) {
            addCriterion("u_convertibility_id >", value, "uConvertibilityId");
            return (Criteria) this;
        }

        public Criteria andUConvertibilityIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("u_convertibility_id >=", value, "uConvertibilityId");
            return (Criteria) this;
        }

        public Criteria andUConvertibilityIdLessThan(Integer value) {
            addCriterion("u_convertibility_id <", value, "uConvertibilityId");
            return (Criteria) this;
        }

        public Criteria andUConvertibilityIdLessThanOrEqualTo(Integer value) {
            addCriterion("u_convertibility_id <=", value, "uConvertibilityId");
            return (Criteria) this;
        }

        public Criteria andUConvertibilityIdIn(List<Integer> values) {
            addCriterion("u_convertibility_id in", values, "uConvertibilityId");
            return (Criteria) this;
        }

        public Criteria andUConvertibilityIdNotIn(List<Integer> values) {
            addCriterion("u_convertibility_id not in", values, "uConvertibilityId");
            return (Criteria) this;
        }

        public Criteria andUConvertibilityIdBetween(Integer value1, Integer value2) {
            addCriterion("u_convertibility_id between", value1, value2, "uConvertibilityId");
            return (Criteria) this;
        }

        public Criteria andUConvertibilityIdNotBetween(Integer value1, Integer value2) {
            addCriterion("u_convertibility_id not between", value1, value2, "uConvertibilityId");
            return (Criteria) this;
        }

        public Criteria andUConvertibilityNameIsNull() {
            addCriterion("u_convertibility_name is null");
            return (Criteria) this;
        }

        public Criteria andUConvertibilityNameIsNotNull() {
            addCriterion("u_convertibility_name is not null");
            return (Criteria) this;
        }

        public Criteria andUConvertibilityNameEqualTo(String value) {
            addCriterion("u_convertibility_name =", value, "uConvertibilityName");
            return (Criteria) this;
        }

        public Criteria andUConvertibilityNameNotEqualTo(String value) {
            addCriterion("u_convertibility_name <>", value, "uConvertibilityName");
            return (Criteria) this;
        }

        public Criteria andUConvertibilityNameGreaterThan(String value) {
            addCriterion("u_convertibility_name >", value, "uConvertibilityName");
            return (Criteria) this;
        }

        public Criteria andUConvertibilityNameGreaterThanOrEqualTo(String value) {
            addCriterion("u_convertibility_name >=", value, "uConvertibilityName");
            return (Criteria) this;
        }

        public Criteria andUConvertibilityNameLessThan(String value) {
            addCriterion("u_convertibility_name <", value, "uConvertibilityName");
            return (Criteria) this;
        }

        public Criteria andUConvertibilityNameLessThanOrEqualTo(String value) {
            addCriterion("u_convertibility_name <=", value, "uConvertibilityName");
            return (Criteria) this;
        }

        public Criteria andUConvertibilityNameLike(String value) {
            addCriterion("u_convertibility_name like", value, "uConvertibilityName");
            return (Criteria) this;
        }

        public Criteria andUConvertibilityNameNotLike(String value) {
            addCriterion("u_convertibility_name not like", value, "uConvertibilityName");
            return (Criteria) this;
        }

        public Criteria andUConvertibilityNameIn(List<String> values) {
            addCriterion("u_convertibility_name in", values, "uConvertibilityName");
            return (Criteria) this;
        }

        public Criteria andUConvertibilityNameNotIn(List<String> values) {
            addCriterion("u_convertibility_name not in", values, "uConvertibilityName");
            return (Criteria) this;
        }

        public Criteria andUConvertibilityNameBetween(String value1, String value2) {
            addCriterion("u_convertibility_name between", value1, value2, "uConvertibilityName");
            return (Criteria) this;
        }

        public Criteria andUConvertibilityNameNotBetween(String value1, String value2) {
            addCriterion("u_convertibility_name not between", value1, value2, "uConvertibilityName");
            return (Criteria) this;
        }

        public Criteria andUConvertibilityEffectIsNull() {
            addCriterion("u_convertibility_effect is null");
            return (Criteria) this;
        }

        public Criteria andUConvertibilityEffectIsNotNull() {
            addCriterion("u_convertibility_effect is not null");
            return (Criteria) this;
        }

        public Criteria andUConvertibilityEffectEqualTo(String value) {
            addCriterion("u_convertibility_effect =", value, "uConvertibilityEffect");
            return (Criteria) this;
        }

        public Criteria andUConvertibilityEffectNotEqualTo(String value) {
            addCriterion("u_convertibility_effect <>", value, "uConvertibilityEffect");
            return (Criteria) this;
        }

        public Criteria andUConvertibilityEffectGreaterThan(String value) {
            addCriterion("u_convertibility_effect >", value, "uConvertibilityEffect");
            return (Criteria) this;
        }

        public Criteria andUConvertibilityEffectGreaterThanOrEqualTo(String value) {
            addCriterion("u_convertibility_effect >=", value, "uConvertibilityEffect");
            return (Criteria) this;
        }

        public Criteria andUConvertibilityEffectLessThan(String value) {
            addCriterion("u_convertibility_effect <", value, "uConvertibilityEffect");
            return (Criteria) this;
        }

        public Criteria andUConvertibilityEffectLessThanOrEqualTo(String value) {
            addCriterion("u_convertibility_effect <=", value, "uConvertibilityEffect");
            return (Criteria) this;
        }

        public Criteria andUConvertibilityEffectLike(String value) {
            addCriterion("u_convertibility_effect like", value, "uConvertibilityEffect");
            return (Criteria) this;
        }

        public Criteria andUConvertibilityEffectNotLike(String value) {
            addCriterion("u_convertibility_effect not like", value, "uConvertibilityEffect");
            return (Criteria) this;
        }

        public Criteria andUConvertibilityEffectIn(List<String> values) {
            addCriterion("u_convertibility_effect in", values, "uConvertibilityEffect");
            return (Criteria) this;
        }

        public Criteria andUConvertibilityEffectNotIn(List<String> values) {
            addCriterion("u_convertibility_effect not in", values, "uConvertibilityEffect");
            return (Criteria) this;
        }

        public Criteria andUConvertibilityEffectBetween(String value1, String value2) {
            addCriterion("u_convertibility_effect between", value1, value2, "uConvertibilityEffect");
            return (Criteria) this;
        }

        public Criteria andUConvertibilityEffectNotBetween(String value1, String value2) {
            addCriterion("u_convertibility_effect not between", value1, value2, "uConvertibilityEffect");
            return (Criteria) this;
        }

        public Criteria andUConvertibilityUidIsNull() {
            addCriterion("u_convertibility_uid is null");
            return (Criteria) this;
        }

        public Criteria andUConvertibilityUidIsNotNull() {
            addCriterion("u_convertibility_uid is not null");
            return (Criteria) this;
        }

        public Criteria andUConvertibilityUidEqualTo(Integer value) {
            addCriterion("u_convertibility_uid =", value, "uConvertibilityUid");
            return (Criteria) this;
        }

        public Criteria andUConvertibilityUidNotEqualTo(Integer value) {
            addCriterion("u_convertibility_uid <>", value, "uConvertibilityUid");
            return (Criteria) this;
        }

        public Criteria andUConvertibilityUidGreaterThan(Integer value) {
            addCriterion("u_convertibility_uid >", value, "uConvertibilityUid");
            return (Criteria) this;
        }

        public Criteria andUConvertibilityUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("u_convertibility_uid >=", value, "uConvertibilityUid");
            return (Criteria) this;
        }

        public Criteria andUConvertibilityUidLessThan(Integer value) {
            addCriterion("u_convertibility_uid <", value, "uConvertibilityUid");
            return (Criteria) this;
        }

        public Criteria andUConvertibilityUidLessThanOrEqualTo(Integer value) {
            addCriterion("u_convertibility_uid <=", value, "uConvertibilityUid");
            return (Criteria) this;
        }

        public Criteria andUConvertibilityUidIn(List<Integer> values) {
            addCriterion("u_convertibility_uid in", values, "uConvertibilityUid");
            return (Criteria) this;
        }

        public Criteria andUConvertibilityUidNotIn(List<Integer> values) {
            addCriterion("u_convertibility_uid not in", values, "uConvertibilityUid");
            return (Criteria) this;
        }

        public Criteria andUConvertibilityUidBetween(Integer value1, Integer value2) {
            addCriterion("u_convertibility_uid between", value1, value2, "uConvertibilityUid");
            return (Criteria) this;
        }

        public Criteria andUConvertibilityUidNotBetween(Integer value1, Integer value2) {
            addCriterion("u_convertibility_uid not between", value1, value2, "uConvertibilityUid");
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