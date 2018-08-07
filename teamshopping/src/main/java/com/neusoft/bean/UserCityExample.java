package com.neusoft.bean;

import java.util.ArrayList;
import java.util.List;

public class UserCityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserCityExample() {
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

        public Criteria andUCityIdIsNull() {
            addCriterion("u_city_id is null");
            return (Criteria) this;
        }

        public Criteria andUCityIdIsNotNull() {
            addCriterion("u_city_id is not null");
            return (Criteria) this;
        }

        public Criteria andUCityIdEqualTo(Integer value) {
            addCriterion("u_city_id =", value, "uCityId");
            return (Criteria) this;
        }

        public Criteria andUCityIdNotEqualTo(Integer value) {
            addCriterion("u_city_id <>", value, "uCityId");
            return (Criteria) this;
        }

        public Criteria andUCityIdGreaterThan(Integer value) {
            addCriterion("u_city_id >", value, "uCityId");
            return (Criteria) this;
        }

        public Criteria andUCityIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("u_city_id >=", value, "uCityId");
            return (Criteria) this;
        }

        public Criteria andUCityIdLessThan(Integer value) {
            addCriterion("u_city_id <", value, "uCityId");
            return (Criteria) this;
        }

        public Criteria andUCityIdLessThanOrEqualTo(Integer value) {
            addCriterion("u_city_id <=", value, "uCityId");
            return (Criteria) this;
        }

        public Criteria andUCityIdIn(List<Integer> values) {
            addCriterion("u_city_id in", values, "uCityId");
            return (Criteria) this;
        }

        public Criteria andUCityIdNotIn(List<Integer> values) {
            addCriterion("u_city_id not in", values, "uCityId");
            return (Criteria) this;
        }

        public Criteria andUCityIdBetween(Integer value1, Integer value2) {
            addCriterion("u_city_id between", value1, value2, "uCityId");
            return (Criteria) this;
        }

        public Criteria andUCityIdNotBetween(Integer value1, Integer value2) {
            addCriterion("u_city_id not between", value1, value2, "uCityId");
            return (Criteria) this;
        }

        public Criteria andUCityNameIsNull() {
            addCriterion("u_city_name is null");
            return (Criteria) this;
        }

        public Criteria andUCityNameIsNotNull() {
            addCriterion("u_city_name is not null");
            return (Criteria) this;
        }

        public Criteria andUCityNameEqualTo(String value) {
            addCriterion("u_city_name =", value, "uCityName");
            return (Criteria) this;
        }

        public Criteria andUCityNameNotEqualTo(String value) {
            addCriterion("u_city_name <>", value, "uCityName");
            return (Criteria) this;
        }

        public Criteria andUCityNameGreaterThan(String value) {
            addCriterion("u_city_name >", value, "uCityName");
            return (Criteria) this;
        }

        public Criteria andUCityNameGreaterThanOrEqualTo(String value) {
            addCriterion("u_city_name >=", value, "uCityName");
            return (Criteria) this;
        }

        public Criteria andUCityNameLessThan(String value) {
            addCriterion("u_city_name <", value, "uCityName");
            return (Criteria) this;
        }

        public Criteria andUCityNameLessThanOrEqualTo(String value) {
            addCriterion("u_city_name <=", value, "uCityName");
            return (Criteria) this;
        }

        public Criteria andUCityNameLike(String value) {
            addCriterion("u_city_name like", value, "uCityName");
            return (Criteria) this;
        }

        public Criteria andUCityNameNotLike(String value) {
            addCriterion("u_city_name not like", value, "uCityName");
            return (Criteria) this;
        }

        public Criteria andUCityNameIn(List<String> values) {
            addCriterion("u_city_name in", values, "uCityName");
            return (Criteria) this;
        }

        public Criteria andUCityNameNotIn(List<String> values) {
            addCriterion("u_city_name not in", values, "uCityName");
            return (Criteria) this;
        }

        public Criteria andUCityNameBetween(String value1, String value2) {
            addCriterion("u_city_name between", value1, value2, "uCityName");
            return (Criteria) this;
        }

        public Criteria andUCityNameNotBetween(String value1, String value2) {
            addCriterion("u_city_name not between", value1, value2, "uCityName");
            return (Criteria) this;
        }

        public Criteria andUCityPidIsNull() {
            addCriterion("u_city_pid is null");
            return (Criteria) this;
        }

        public Criteria andUCityPidIsNotNull() {
            addCriterion("u_city_pid is not null");
            return (Criteria) this;
        }

        public Criteria andUCityPidEqualTo(Integer value) {
            addCriterion("u_city_pid =", value, "uCityPid");
            return (Criteria) this;
        }

        public Criteria andUCityPidNotEqualTo(Integer value) {
            addCriterion("u_city_pid <>", value, "uCityPid");
            return (Criteria) this;
        }

        public Criteria andUCityPidGreaterThan(Integer value) {
            addCriterion("u_city_pid >", value, "uCityPid");
            return (Criteria) this;
        }

        public Criteria andUCityPidGreaterThanOrEqualTo(Integer value) {
            addCriterion("u_city_pid >=", value, "uCityPid");
            return (Criteria) this;
        }

        public Criteria andUCityPidLessThan(Integer value) {
            addCriterion("u_city_pid <", value, "uCityPid");
            return (Criteria) this;
        }

        public Criteria andUCityPidLessThanOrEqualTo(Integer value) {
            addCriterion("u_city_pid <=", value, "uCityPid");
            return (Criteria) this;
        }

        public Criteria andUCityPidIn(List<Integer> values) {
            addCriterion("u_city_pid in", values, "uCityPid");
            return (Criteria) this;
        }

        public Criteria andUCityPidNotIn(List<Integer> values) {
            addCriterion("u_city_pid not in", values, "uCityPid");
            return (Criteria) this;
        }

        public Criteria andUCityPidBetween(Integer value1, Integer value2) {
            addCriterion("u_city_pid between", value1, value2, "uCityPid");
            return (Criteria) this;
        }

        public Criteria andUCityPidNotBetween(Integer value1, Integer value2) {
            addCriterion("u_city_pid not between", value1, value2, "uCityPid");
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