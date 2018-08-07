package com.neusoft.bean;

import java.util.ArrayList;
import java.util.List;

public class WorknumberExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WorknumberExample() {
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

        public Criteria andWorknumberIdIsNull() {
            addCriterion("worknumber_id is null");
            return (Criteria) this;
        }

        public Criteria andWorknumberIdIsNotNull() {
            addCriterion("worknumber_id is not null");
            return (Criteria) this;
        }

        public Criteria andWorknumberIdEqualTo(Integer value) {
            addCriterion("worknumber_id =", value, "worknumberId");
            return (Criteria) this;
        }

        public Criteria andWorknumberIdNotEqualTo(Integer value) {
            addCriterion("worknumber_id <>", value, "worknumberId");
            return (Criteria) this;
        }

        public Criteria andWorknumberIdGreaterThan(Integer value) {
            addCriterion("worknumber_id >", value, "worknumberId");
            return (Criteria) this;
        }

        public Criteria andWorknumberIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("worknumber_id >=", value, "worknumberId");
            return (Criteria) this;
        }

        public Criteria andWorknumberIdLessThan(Integer value) {
            addCriterion("worknumber_id <", value, "worknumberId");
            return (Criteria) this;
        }

        public Criteria andWorknumberIdLessThanOrEqualTo(Integer value) {
            addCriterion("worknumber_id <=", value, "worknumberId");
            return (Criteria) this;
        }

        public Criteria andWorknumberIdIn(List<Integer> values) {
            addCriterion("worknumber_id in", values, "worknumberId");
            return (Criteria) this;
        }

        public Criteria andWorknumberIdNotIn(List<Integer> values) {
            addCriterion("worknumber_id not in", values, "worknumberId");
            return (Criteria) this;
        }

        public Criteria andWorknumberIdBetween(Integer value1, Integer value2) {
            addCriterion("worknumber_id between", value1, value2, "worknumberId");
            return (Criteria) this;
        }

        public Criteria andWorknumberIdNotBetween(Integer value1, Integer value2) {
            addCriterion("worknumber_id not between", value1, value2, "worknumberId");
            return (Criteria) this;
        }

        public Criteria andWorknumberNumberIsNull() {
            addCriterion("worknumber_number is null");
            return (Criteria) this;
        }

        public Criteria andWorknumberNumberIsNotNull() {
            addCriterion("worknumber_number is not null");
            return (Criteria) this;
        }

        public Criteria andWorknumberNumberEqualTo(String value) {
            addCriterion("worknumber_number =", value, "worknumberNumber");
            return (Criteria) this;
        }

        public Criteria andWorknumberNumberNotEqualTo(String value) {
            addCriterion("worknumber_number <>", value, "worknumberNumber");
            return (Criteria) this;
        }

        public Criteria andWorknumberNumberGreaterThan(String value) {
            addCriterion("worknumber_number >", value, "worknumberNumber");
            return (Criteria) this;
        }

        public Criteria andWorknumberNumberGreaterThanOrEqualTo(String value) {
            addCriterion("worknumber_number >=", value, "worknumberNumber");
            return (Criteria) this;
        }

        public Criteria andWorknumberNumberLessThan(String value) {
            addCriterion("worknumber_number <", value, "worknumberNumber");
            return (Criteria) this;
        }

        public Criteria andWorknumberNumberLessThanOrEqualTo(String value) {
            addCriterion("worknumber_number <=", value, "worknumberNumber");
            return (Criteria) this;
        }

        public Criteria andWorknumberNumberLike(String value) {
            addCriterion("worknumber_number like", value, "worknumberNumber");
            return (Criteria) this;
        }

        public Criteria andWorknumberNumberNotLike(String value) {
            addCriterion("worknumber_number not like", value, "worknumberNumber");
            return (Criteria) this;
        }

        public Criteria andWorknumberNumberIn(List<String> values) {
            addCriterion("worknumber_number in", values, "worknumberNumber");
            return (Criteria) this;
        }

        public Criteria andWorknumberNumberNotIn(List<String> values) {
            addCriterion("worknumber_number not in", values, "worknumberNumber");
            return (Criteria) this;
        }

        public Criteria andWorknumberNumberBetween(String value1, String value2) {
            addCriterion("worknumber_number between", value1, value2, "worknumberNumber");
            return (Criteria) this;
        }

        public Criteria andWorknumberNumberNotBetween(String value1, String value2) {
            addCriterion("worknumber_number not between", value1, value2, "worknumberNumber");
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