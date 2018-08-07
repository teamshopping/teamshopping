package com.neusoft.bean;

import java.util.ArrayList;
import java.util.List;

public class HelpExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HelpExample() {
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

        public Criteria andHelpIdIsNull() {
            addCriterion("help_id is null");
            return (Criteria) this;
        }

        public Criteria andHelpIdIsNotNull() {
            addCriterion("help_id is not null");
            return (Criteria) this;
        }

        public Criteria andHelpIdEqualTo(Integer value) {
            addCriterion("help_id =", value, "helpId");
            return (Criteria) this;
        }

        public Criteria andHelpIdNotEqualTo(Integer value) {
            addCriterion("help_id <>", value, "helpId");
            return (Criteria) this;
        }

        public Criteria andHelpIdGreaterThan(Integer value) {
            addCriterion("help_id >", value, "helpId");
            return (Criteria) this;
        }

        public Criteria andHelpIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("help_id >=", value, "helpId");
            return (Criteria) this;
        }

        public Criteria andHelpIdLessThan(Integer value) {
            addCriterion("help_id <", value, "helpId");
            return (Criteria) this;
        }

        public Criteria andHelpIdLessThanOrEqualTo(Integer value) {
            addCriterion("help_id <=", value, "helpId");
            return (Criteria) this;
        }

        public Criteria andHelpIdIn(List<Integer> values) {
            addCriterion("help_id in", values, "helpId");
            return (Criteria) this;
        }

        public Criteria andHelpIdNotIn(List<Integer> values) {
            addCriterion("help_id not in", values, "helpId");
            return (Criteria) this;
        }

        public Criteria andHelpIdBetween(Integer value1, Integer value2) {
            addCriterion("help_id between", value1, value2, "helpId");
            return (Criteria) this;
        }

        public Criteria andHelpIdNotBetween(Integer value1, Integer value2) {
            addCriterion("help_id not between", value1, value2, "helpId");
            return (Criteria) this;
        }

        public Criteria andHelpStepIsNull() {
            addCriterion("help_step is null");
            return (Criteria) this;
        }

        public Criteria andHelpStepIsNotNull() {
            addCriterion("help_step is not null");
            return (Criteria) this;
        }

        public Criteria andHelpStepEqualTo(String value) {
            addCriterion("help_step =", value, "helpStep");
            return (Criteria) this;
        }

        public Criteria andHelpStepNotEqualTo(String value) {
            addCriterion("help_step <>", value, "helpStep");
            return (Criteria) this;
        }

        public Criteria andHelpStepGreaterThan(String value) {
            addCriterion("help_step >", value, "helpStep");
            return (Criteria) this;
        }

        public Criteria andHelpStepGreaterThanOrEqualTo(String value) {
            addCriterion("help_step >=", value, "helpStep");
            return (Criteria) this;
        }

        public Criteria andHelpStepLessThan(String value) {
            addCriterion("help_step <", value, "helpStep");
            return (Criteria) this;
        }

        public Criteria andHelpStepLessThanOrEqualTo(String value) {
            addCriterion("help_step <=", value, "helpStep");
            return (Criteria) this;
        }

        public Criteria andHelpStepLike(String value) {
            addCriterion("help_step like", value, "helpStep");
            return (Criteria) this;
        }

        public Criteria andHelpStepNotLike(String value) {
            addCriterion("help_step not like", value, "helpStep");
            return (Criteria) this;
        }

        public Criteria andHelpStepIn(List<String> values) {
            addCriterion("help_step in", values, "helpStep");
            return (Criteria) this;
        }

        public Criteria andHelpStepNotIn(List<String> values) {
            addCriterion("help_step not in", values, "helpStep");
            return (Criteria) this;
        }

        public Criteria andHelpStepBetween(String value1, String value2) {
            addCriterion("help_step between", value1, value2, "helpStep");
            return (Criteria) this;
        }

        public Criteria andHelpStepNotBetween(String value1, String value2) {
            addCriterion("help_step not between", value1, value2, "helpStep");
            return (Criteria) this;
        }

        public Criteria andHelpContentIsNull() {
            addCriterion("help_content is null");
            return (Criteria) this;
        }

        public Criteria andHelpContentIsNotNull() {
            addCriterion("help_content is not null");
            return (Criteria) this;
        }

        public Criteria andHelpContentEqualTo(String value) {
            addCriterion("help_content =", value, "helpContent");
            return (Criteria) this;
        }

        public Criteria andHelpContentNotEqualTo(String value) {
            addCriterion("help_content <>", value, "helpContent");
            return (Criteria) this;
        }

        public Criteria andHelpContentGreaterThan(String value) {
            addCriterion("help_content >", value, "helpContent");
            return (Criteria) this;
        }

        public Criteria andHelpContentGreaterThanOrEqualTo(String value) {
            addCriterion("help_content >=", value, "helpContent");
            return (Criteria) this;
        }

        public Criteria andHelpContentLessThan(String value) {
            addCriterion("help_content <", value, "helpContent");
            return (Criteria) this;
        }

        public Criteria andHelpContentLessThanOrEqualTo(String value) {
            addCriterion("help_content <=", value, "helpContent");
            return (Criteria) this;
        }

        public Criteria andHelpContentLike(String value) {
            addCriterion("help_content like", value, "helpContent");
            return (Criteria) this;
        }

        public Criteria andHelpContentNotLike(String value) {
            addCriterion("help_content not like", value, "helpContent");
            return (Criteria) this;
        }

        public Criteria andHelpContentIn(List<String> values) {
            addCriterion("help_content in", values, "helpContent");
            return (Criteria) this;
        }

        public Criteria andHelpContentNotIn(List<String> values) {
            addCriterion("help_content not in", values, "helpContent");
            return (Criteria) this;
        }

        public Criteria andHelpContentBetween(String value1, String value2) {
            addCriterion("help_content between", value1, value2, "helpContent");
            return (Criteria) this;
        }

        public Criteria andHelpContentNotBetween(String value1, String value2) {
            addCriterion("help_content not between", value1, value2, "helpContent");
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