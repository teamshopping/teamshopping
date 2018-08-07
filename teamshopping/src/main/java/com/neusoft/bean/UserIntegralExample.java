package com.neusoft.bean;

import java.util.ArrayList;
import java.util.List;

public class UserIntegralExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserIntegralExample() {
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

        public Criteria andUIntegralIdIsNull() {
            addCriterion("u_integral_id is null");
            return (Criteria) this;
        }

        public Criteria andUIntegralIdIsNotNull() {
            addCriterion("u_integral_id is not null");
            return (Criteria) this;
        }

        public Criteria andUIntegralIdEqualTo(Integer value) {
            addCriterion("u_integral_id =", value, "uIntegralId");
            return (Criteria) this;
        }

        public Criteria andUIntegralIdNotEqualTo(Integer value) {
            addCriterion("u_integral_id <>", value, "uIntegralId");
            return (Criteria) this;
        }

        public Criteria andUIntegralIdGreaterThan(Integer value) {
            addCriterion("u_integral_id >", value, "uIntegralId");
            return (Criteria) this;
        }

        public Criteria andUIntegralIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("u_integral_id >=", value, "uIntegralId");
            return (Criteria) this;
        }

        public Criteria andUIntegralIdLessThan(Integer value) {
            addCriterion("u_integral_id <", value, "uIntegralId");
            return (Criteria) this;
        }

        public Criteria andUIntegralIdLessThanOrEqualTo(Integer value) {
            addCriterion("u_integral_id <=", value, "uIntegralId");
            return (Criteria) this;
        }

        public Criteria andUIntegralIdIn(List<Integer> values) {
            addCriterion("u_integral_id in", values, "uIntegralId");
            return (Criteria) this;
        }

        public Criteria andUIntegralIdNotIn(List<Integer> values) {
            addCriterion("u_integral_id not in", values, "uIntegralId");
            return (Criteria) this;
        }

        public Criteria andUIntegralIdBetween(Integer value1, Integer value2) {
            addCriterion("u_integral_id between", value1, value2, "uIntegralId");
            return (Criteria) this;
        }

        public Criteria andUIntegralIdNotBetween(Integer value1, Integer value2) {
            addCriterion("u_integral_id not between", value1, value2, "uIntegralId");
            return (Criteria) this;
        }

        public Criteria andUIntegralNameIsNull() {
            addCriterion("u_integral_name is null");
            return (Criteria) this;
        }

        public Criteria andUIntegralNameIsNotNull() {
            addCriterion("u_integral_name is not null");
            return (Criteria) this;
        }

        public Criteria andUIntegralNameEqualTo(String value) {
            addCriterion("u_integral_name =", value, "uIntegralName");
            return (Criteria) this;
        }

        public Criteria andUIntegralNameNotEqualTo(String value) {
            addCriterion("u_integral_name <>", value, "uIntegralName");
            return (Criteria) this;
        }

        public Criteria andUIntegralNameGreaterThan(String value) {
            addCriterion("u_integral_name >", value, "uIntegralName");
            return (Criteria) this;
        }

        public Criteria andUIntegralNameGreaterThanOrEqualTo(String value) {
            addCriterion("u_integral_name >=", value, "uIntegralName");
            return (Criteria) this;
        }

        public Criteria andUIntegralNameLessThan(String value) {
            addCriterion("u_integral_name <", value, "uIntegralName");
            return (Criteria) this;
        }

        public Criteria andUIntegralNameLessThanOrEqualTo(String value) {
            addCriterion("u_integral_name <=", value, "uIntegralName");
            return (Criteria) this;
        }

        public Criteria andUIntegralNameLike(String value) {
            addCriterion("u_integral_name like", value, "uIntegralName");
            return (Criteria) this;
        }

        public Criteria andUIntegralNameNotLike(String value) {
            addCriterion("u_integral_name not like", value, "uIntegralName");
            return (Criteria) this;
        }

        public Criteria andUIntegralNameIn(List<String> values) {
            addCriterion("u_integral_name in", values, "uIntegralName");
            return (Criteria) this;
        }

        public Criteria andUIntegralNameNotIn(List<String> values) {
            addCriterion("u_integral_name not in", values, "uIntegralName");
            return (Criteria) this;
        }

        public Criteria andUIntegralNameBetween(String value1, String value2) {
            addCriterion("u_integral_name between", value1, value2, "uIntegralName");
            return (Criteria) this;
        }

        public Criteria andUIntegralNameNotBetween(String value1, String value2) {
            addCriterion("u_integral_name not between", value1, value2, "uIntegralName");
            return (Criteria) this;
        }

        public Criteria andUIntegralNumberIsNull() {
            addCriterion("u_integral_number is null");
            return (Criteria) this;
        }

        public Criteria andUIntegralNumberIsNotNull() {
            addCriterion("u_integral_number is not null");
            return (Criteria) this;
        }

        public Criteria andUIntegralNumberEqualTo(Integer value) {
            addCriterion("u_integral_number =", value, "uIntegralNumber");
            return (Criteria) this;
        }

        public Criteria andUIntegralNumberNotEqualTo(Integer value) {
            addCriterion("u_integral_number <>", value, "uIntegralNumber");
            return (Criteria) this;
        }

        public Criteria andUIntegralNumberGreaterThan(Integer value) {
            addCriterion("u_integral_number >", value, "uIntegralNumber");
            return (Criteria) this;
        }

        public Criteria andUIntegralNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("u_integral_number >=", value, "uIntegralNumber");
            return (Criteria) this;
        }

        public Criteria andUIntegralNumberLessThan(Integer value) {
            addCriterion("u_integral_number <", value, "uIntegralNumber");
            return (Criteria) this;
        }

        public Criteria andUIntegralNumberLessThanOrEqualTo(Integer value) {
            addCriterion("u_integral_number <=", value, "uIntegralNumber");
            return (Criteria) this;
        }

        public Criteria andUIntegralNumberIn(List<Integer> values) {
            addCriterion("u_integral_number in", values, "uIntegralNumber");
            return (Criteria) this;
        }

        public Criteria andUIntegralNumberNotIn(List<Integer> values) {
            addCriterion("u_integral_number not in", values, "uIntegralNumber");
            return (Criteria) this;
        }

        public Criteria andUIntegralNumberBetween(Integer value1, Integer value2) {
            addCriterion("u_integral_number between", value1, value2, "uIntegralNumber");
            return (Criteria) this;
        }

        public Criteria andUIntegralNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("u_integral_number not between", value1, value2, "uIntegralNumber");
            return (Criteria) this;
        }

        public Criteria andUIntegralStateIsNull() {
            addCriterion("u_integral_state is null");
            return (Criteria) this;
        }

        public Criteria andUIntegralStateIsNotNull() {
            addCriterion("u_integral_state is not null");
            return (Criteria) this;
        }

        public Criteria andUIntegralStateEqualTo(String value) {
            addCriterion("u_integral_state =", value, "uIntegralState");
            return (Criteria) this;
        }

        public Criteria andUIntegralStateNotEqualTo(String value) {
            addCriterion("u_integral_state <>", value, "uIntegralState");
            return (Criteria) this;
        }

        public Criteria andUIntegralStateGreaterThan(String value) {
            addCriterion("u_integral_state >", value, "uIntegralState");
            return (Criteria) this;
        }

        public Criteria andUIntegralStateGreaterThanOrEqualTo(String value) {
            addCriterion("u_integral_state >=", value, "uIntegralState");
            return (Criteria) this;
        }

        public Criteria andUIntegralStateLessThan(String value) {
            addCriterion("u_integral_state <", value, "uIntegralState");
            return (Criteria) this;
        }

        public Criteria andUIntegralStateLessThanOrEqualTo(String value) {
            addCriterion("u_integral_state <=", value, "uIntegralState");
            return (Criteria) this;
        }

        public Criteria andUIntegralStateLike(String value) {
            addCriterion("u_integral_state like", value, "uIntegralState");
            return (Criteria) this;
        }

        public Criteria andUIntegralStateNotLike(String value) {
            addCriterion("u_integral_state not like", value, "uIntegralState");
            return (Criteria) this;
        }

        public Criteria andUIntegralStateIn(List<String> values) {
            addCriterion("u_integral_state in", values, "uIntegralState");
            return (Criteria) this;
        }

        public Criteria andUIntegralStateNotIn(List<String> values) {
            addCriterion("u_integral_state not in", values, "uIntegralState");
            return (Criteria) this;
        }

        public Criteria andUIntegralStateBetween(String value1, String value2) {
            addCriterion("u_integral_state between", value1, value2, "uIntegralState");
            return (Criteria) this;
        }

        public Criteria andUIntegralStateNotBetween(String value1, String value2) {
            addCriterion("u_integral_state not between", value1, value2, "uIntegralState");
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