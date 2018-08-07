package com.neusoft.bean;

import java.util.ArrayList;
import java.util.List;

public class UserPrizeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserPrizeExample() {
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

        public Criteria andSPrizeIdIsNull() {
            addCriterion("s_prize_id is null");
            return (Criteria) this;
        }

        public Criteria andSPrizeIdIsNotNull() {
            addCriterion("s_prize_id is not null");
            return (Criteria) this;
        }

        public Criteria andSPrizeIdEqualTo(Integer value) {
            addCriterion("s_prize_id =", value, "sPrizeId");
            return (Criteria) this;
        }

        public Criteria andSPrizeIdNotEqualTo(Integer value) {
            addCriterion("s_prize_id <>", value, "sPrizeId");
            return (Criteria) this;
        }

        public Criteria andSPrizeIdGreaterThan(Integer value) {
            addCriterion("s_prize_id >", value, "sPrizeId");
            return (Criteria) this;
        }

        public Criteria andSPrizeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("s_prize_id >=", value, "sPrizeId");
            return (Criteria) this;
        }

        public Criteria andSPrizeIdLessThan(Integer value) {
            addCriterion("s_prize_id <", value, "sPrizeId");
            return (Criteria) this;
        }

        public Criteria andSPrizeIdLessThanOrEqualTo(Integer value) {
            addCriterion("s_prize_id <=", value, "sPrizeId");
            return (Criteria) this;
        }

        public Criteria andSPrizeIdIn(List<Integer> values) {
            addCriterion("s_prize_id in", values, "sPrizeId");
            return (Criteria) this;
        }

        public Criteria andSPrizeIdNotIn(List<Integer> values) {
            addCriterion("s_prize_id not in", values, "sPrizeId");
            return (Criteria) this;
        }

        public Criteria andSPrizeIdBetween(Integer value1, Integer value2) {
            addCriterion("s_prize_id between", value1, value2, "sPrizeId");
            return (Criteria) this;
        }

        public Criteria andSPrizeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("s_prize_id not between", value1, value2, "sPrizeId");
            return (Criteria) this;
        }

        public Criteria andSPrizeNameIsNull() {
            addCriterion("s_prize_name is null");
            return (Criteria) this;
        }

        public Criteria andSPrizeNameIsNotNull() {
            addCriterion("s_prize_name is not null");
            return (Criteria) this;
        }

        public Criteria andSPrizeNameEqualTo(String value) {
            addCriterion("s_prize_name =", value, "sPrizeName");
            return (Criteria) this;
        }

        public Criteria andSPrizeNameNotEqualTo(String value) {
            addCriterion("s_prize_name <>", value, "sPrizeName");
            return (Criteria) this;
        }

        public Criteria andSPrizeNameGreaterThan(String value) {
            addCriterion("s_prize_name >", value, "sPrizeName");
            return (Criteria) this;
        }

        public Criteria andSPrizeNameGreaterThanOrEqualTo(String value) {
            addCriterion("s_prize_name >=", value, "sPrizeName");
            return (Criteria) this;
        }

        public Criteria andSPrizeNameLessThan(String value) {
            addCriterion("s_prize_name <", value, "sPrizeName");
            return (Criteria) this;
        }

        public Criteria andSPrizeNameLessThanOrEqualTo(String value) {
            addCriterion("s_prize_name <=", value, "sPrizeName");
            return (Criteria) this;
        }

        public Criteria andSPrizeNameLike(String value) {
            addCriterion("s_prize_name like", value, "sPrizeName");
            return (Criteria) this;
        }

        public Criteria andSPrizeNameNotLike(String value) {
            addCriterion("s_prize_name not like", value, "sPrizeName");
            return (Criteria) this;
        }

        public Criteria andSPrizeNameIn(List<String> values) {
            addCriterion("s_prize_name in", values, "sPrizeName");
            return (Criteria) this;
        }

        public Criteria andSPrizeNameNotIn(List<String> values) {
            addCriterion("s_prize_name not in", values, "sPrizeName");
            return (Criteria) this;
        }

        public Criteria andSPrizeNameBetween(String value1, String value2) {
            addCriterion("s_prize_name between", value1, value2, "sPrizeName");
            return (Criteria) this;
        }

        public Criteria andSPrizeNameNotBetween(String value1, String value2) {
            addCriterion("s_prize_name not between", value1, value2, "sPrizeName");
            return (Criteria) this;
        }

        public Criteria andSPrizeRemarksIsNull() {
            addCriterion("s_prize_remarks is null");
            return (Criteria) this;
        }

        public Criteria andSPrizeRemarksIsNotNull() {
            addCriterion("s_prize_remarks is not null");
            return (Criteria) this;
        }

        public Criteria andSPrizeRemarksEqualTo(String value) {
            addCriterion("s_prize_remarks =", value, "sPrizeRemarks");
            return (Criteria) this;
        }

        public Criteria andSPrizeRemarksNotEqualTo(String value) {
            addCriterion("s_prize_remarks <>", value, "sPrizeRemarks");
            return (Criteria) this;
        }

        public Criteria andSPrizeRemarksGreaterThan(String value) {
            addCriterion("s_prize_remarks >", value, "sPrizeRemarks");
            return (Criteria) this;
        }

        public Criteria andSPrizeRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("s_prize_remarks >=", value, "sPrizeRemarks");
            return (Criteria) this;
        }

        public Criteria andSPrizeRemarksLessThan(String value) {
            addCriterion("s_prize_remarks <", value, "sPrizeRemarks");
            return (Criteria) this;
        }

        public Criteria andSPrizeRemarksLessThanOrEqualTo(String value) {
            addCriterion("s_prize_remarks <=", value, "sPrizeRemarks");
            return (Criteria) this;
        }

        public Criteria andSPrizeRemarksLike(String value) {
            addCriterion("s_prize_remarks like", value, "sPrizeRemarks");
            return (Criteria) this;
        }

        public Criteria andSPrizeRemarksNotLike(String value) {
            addCriterion("s_prize_remarks not like", value, "sPrizeRemarks");
            return (Criteria) this;
        }

        public Criteria andSPrizeRemarksIn(List<String> values) {
            addCriterion("s_prize_remarks in", values, "sPrizeRemarks");
            return (Criteria) this;
        }

        public Criteria andSPrizeRemarksNotIn(List<String> values) {
            addCriterion("s_prize_remarks not in", values, "sPrizeRemarks");
            return (Criteria) this;
        }

        public Criteria andSPrizeRemarksBetween(String value1, String value2) {
            addCriterion("s_prize_remarks between", value1, value2, "sPrizeRemarks");
            return (Criteria) this;
        }

        public Criteria andSPrizeRemarksNotBetween(String value1, String value2) {
            addCriterion("s_prize_remarks not between", value1, value2, "sPrizeRemarks");
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