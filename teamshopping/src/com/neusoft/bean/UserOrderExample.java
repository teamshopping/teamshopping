package com.neusoft.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class UserOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserOrderExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andUOrderIdIsNull() {
            addCriterion("u_order_id is null");
            return (Criteria) this;
        }

        public Criteria andUOrderIdIsNotNull() {
            addCriterion("u_order_id is not null");
            return (Criteria) this;
        }

        public Criteria andUOrderIdEqualTo(Integer value) {
            addCriterion("u_order_id =", value, "uOrderId");
            return (Criteria) this;
        }

        public Criteria andUOrderIdNotEqualTo(Integer value) {
            addCriterion("u_order_id <>", value, "uOrderId");
            return (Criteria) this;
        }

        public Criteria andUOrderIdGreaterThan(Integer value) {
            addCriterion("u_order_id >", value, "uOrderId");
            return (Criteria) this;
        }

        public Criteria andUOrderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("u_order_id >=", value, "uOrderId");
            return (Criteria) this;
        }

        public Criteria andUOrderIdLessThan(Integer value) {
            addCriterion("u_order_id <", value, "uOrderId");
            return (Criteria) this;
        }

        public Criteria andUOrderIdLessThanOrEqualTo(Integer value) {
            addCriterion("u_order_id <=", value, "uOrderId");
            return (Criteria) this;
        }

        public Criteria andUOrderIdIn(List<Integer> values) {
            addCriterion("u_order_id in", values, "uOrderId");
            return (Criteria) this;
        }

        public Criteria andUOrderIdNotIn(List<Integer> values) {
            addCriterion("u_order_id not in", values, "uOrderId");
            return (Criteria) this;
        }

        public Criteria andUOrderIdBetween(Integer value1, Integer value2) {
            addCriterion("u_order_id between", value1, value2, "uOrderId");
            return (Criteria) this;
        }

        public Criteria andUOrderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("u_order_id not between", value1, value2, "uOrderId");
            return (Criteria) this;
        }

        public Criteria andUOrderNumberIsNull() {
            addCriterion("u_order_number is null");
            return (Criteria) this;
        }

        public Criteria andUOrderNumberIsNotNull() {
            addCriterion("u_order_number is not null");
            return (Criteria) this;
        }

        public Criteria andUOrderNumberEqualTo(String value) {
            addCriterion("u_order_number =", value, "uOrderNumber");
            return (Criteria) this;
        }

        public Criteria andUOrderNumberNotEqualTo(String value) {
            addCriterion("u_order_number <>", value, "uOrderNumber");
            return (Criteria) this;
        }

        public Criteria andUOrderNumberGreaterThan(String value) {
            addCriterion("u_order_number >", value, "uOrderNumber");
            return (Criteria) this;
        }

        public Criteria andUOrderNumberGreaterThanOrEqualTo(String value) {
            addCriterion("u_order_number >=", value, "uOrderNumber");
            return (Criteria) this;
        }

        public Criteria andUOrderNumberLessThan(String value) {
            addCriterion("u_order_number <", value, "uOrderNumber");
            return (Criteria) this;
        }

        public Criteria andUOrderNumberLessThanOrEqualTo(String value) {
            addCriterion("u_order_number <=", value, "uOrderNumber");
            return (Criteria) this;
        }

        public Criteria andUOrderNumberLike(String value) {
            addCriterion("u_order_number like", value, "uOrderNumber");
            return (Criteria) this;
        }

        public Criteria andUOrderNumberNotLike(String value) {
            addCriterion("u_order_number not like", value, "uOrderNumber");
            return (Criteria) this;
        }

        public Criteria andUOrderNumberIn(List<String> values) {
            addCriterion("u_order_number in", values, "uOrderNumber");
            return (Criteria) this;
        }

        public Criteria andUOrderNumberNotIn(List<String> values) {
            addCriterion("u_order_number not in", values, "uOrderNumber");
            return (Criteria) this;
        }

        public Criteria andUOrderNumberBetween(String value1, String value2) {
            addCriterion("u_order_number between", value1, value2, "uOrderNumber");
            return (Criteria) this;
        }

        public Criteria andUOrderNumberNotBetween(String value1, String value2) {
            addCriterion("u_order_number not between", value1, value2, "uOrderNumber");
            return (Criteria) this;
        }

        public Criteria andUOrderTimeIsNull() {
            addCriterion("u_order_time is null");
            return (Criteria) this;
        }

        public Criteria andUOrderTimeIsNotNull() {
            addCriterion("u_order_time is not null");
            return (Criteria) this;
        }

        public Criteria andUOrderTimeEqualTo(Date value) {
            addCriterionForJDBCDate("u_order_time =", value, "uOrderTime");
            return (Criteria) this;
        }

        public Criteria andUOrderTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("u_order_time <>", value, "uOrderTime");
            return (Criteria) this;
        }

        public Criteria andUOrderTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("u_order_time >", value, "uOrderTime");
            return (Criteria) this;
        }

        public Criteria andUOrderTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("u_order_time >=", value, "uOrderTime");
            return (Criteria) this;
        }

        public Criteria andUOrderTimeLessThan(Date value) {
            addCriterionForJDBCDate("u_order_time <", value, "uOrderTime");
            return (Criteria) this;
        }

        public Criteria andUOrderTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("u_order_time <=", value, "uOrderTime");
            return (Criteria) this;
        }

        public Criteria andUOrderTimeIn(List<Date> values) {
            addCriterionForJDBCDate("u_order_time in", values, "uOrderTime");
            return (Criteria) this;
        }

        public Criteria andUOrderTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("u_order_time not in", values, "uOrderTime");
            return (Criteria) this;
        }

        public Criteria andUOrderTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("u_order_time between", value1, value2, "uOrderTime");
            return (Criteria) this;
        }

        public Criteria andUOrderTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("u_order_time not between", value1, value2, "uOrderTime");
            return (Criteria) this;
        }

        public Criteria andUOrderModeIsNull() {
            addCriterion("u_order_mode is null");
            return (Criteria) this;
        }

        public Criteria andUOrderModeIsNotNull() {
            addCriterion("u_order_mode is not null");
            return (Criteria) this;
        }

        public Criteria andUOrderModeEqualTo(String value) {
            addCriterion("u_order_mode =", value, "uOrderMode");
            return (Criteria) this;
        }

        public Criteria andUOrderModeNotEqualTo(String value) {
            addCriterion("u_order_mode <>", value, "uOrderMode");
            return (Criteria) this;
        }

        public Criteria andUOrderModeGreaterThan(String value) {
            addCriterion("u_order_mode >", value, "uOrderMode");
            return (Criteria) this;
        }

        public Criteria andUOrderModeGreaterThanOrEqualTo(String value) {
            addCriterion("u_order_mode >=", value, "uOrderMode");
            return (Criteria) this;
        }

        public Criteria andUOrderModeLessThan(String value) {
            addCriterion("u_order_mode <", value, "uOrderMode");
            return (Criteria) this;
        }

        public Criteria andUOrderModeLessThanOrEqualTo(String value) {
            addCriterion("u_order_mode <=", value, "uOrderMode");
            return (Criteria) this;
        }

        public Criteria andUOrderModeLike(String value) {
            addCriterion("u_order_mode like", value, "uOrderMode");
            return (Criteria) this;
        }

        public Criteria andUOrderModeNotLike(String value) {
            addCriterion("u_order_mode not like", value, "uOrderMode");
            return (Criteria) this;
        }

        public Criteria andUOrderModeIn(List<String> values) {
            addCriterion("u_order_mode in", values, "uOrderMode");
            return (Criteria) this;
        }

        public Criteria andUOrderModeNotIn(List<String> values) {
            addCriterion("u_order_mode not in", values, "uOrderMode");
            return (Criteria) this;
        }

        public Criteria andUOrderModeBetween(String value1, String value2) {
            addCriterion("u_order_mode between", value1, value2, "uOrderMode");
            return (Criteria) this;
        }

        public Criteria andUOrderModeNotBetween(String value1, String value2) {
            addCriterion("u_order_mode not between", value1, value2, "uOrderMode");
            return (Criteria) this;
        }

        public Criteria andUOrderBusinessIsNull() {
            addCriterion("u_order_business is null");
            return (Criteria) this;
        }

        public Criteria andUOrderBusinessIsNotNull() {
            addCriterion("u_order_business is not null");
            return (Criteria) this;
        }

        public Criteria andUOrderBusinessEqualTo(String value) {
            addCriterion("u_order_business =", value, "uOrderBusiness");
            return (Criteria) this;
        }

        public Criteria andUOrderBusinessNotEqualTo(String value) {
            addCriterion("u_order_business <>", value, "uOrderBusiness");
            return (Criteria) this;
        }

        public Criteria andUOrderBusinessGreaterThan(String value) {
            addCriterion("u_order_business >", value, "uOrderBusiness");
            return (Criteria) this;
        }

        public Criteria andUOrderBusinessGreaterThanOrEqualTo(String value) {
            addCriterion("u_order_business >=", value, "uOrderBusiness");
            return (Criteria) this;
        }

        public Criteria andUOrderBusinessLessThan(String value) {
            addCriterion("u_order_business <", value, "uOrderBusiness");
            return (Criteria) this;
        }

        public Criteria andUOrderBusinessLessThanOrEqualTo(String value) {
            addCriterion("u_order_business <=", value, "uOrderBusiness");
            return (Criteria) this;
        }

        public Criteria andUOrderBusinessLike(String value) {
            addCriterion("u_order_business like", value, "uOrderBusiness");
            return (Criteria) this;
        }

        public Criteria andUOrderBusinessNotLike(String value) {
            addCriterion("u_order_business not like", value, "uOrderBusiness");
            return (Criteria) this;
        }

        public Criteria andUOrderBusinessIn(List<String> values) {
            addCriterion("u_order_business in", values, "uOrderBusiness");
            return (Criteria) this;
        }

        public Criteria andUOrderBusinessNotIn(List<String> values) {
            addCriterion("u_order_business not in", values, "uOrderBusiness");
            return (Criteria) this;
        }

        public Criteria andUOrderBusinessBetween(String value1, String value2) {
            addCriterion("u_order_business between", value1, value2, "uOrderBusiness");
            return (Criteria) this;
        }

        public Criteria andUOrderBusinessNotBetween(String value1, String value2) {
            addCriterion("u_order_business not between", value1, value2, "uOrderBusiness");
            return (Criteria) this;
        }

        public Criteria andUOrderMemberIsNull() {
            addCriterion("u_order_member is null");
            return (Criteria) this;
        }

        public Criteria andUOrderMemberIsNotNull() {
            addCriterion("u_order_member is not null");
            return (Criteria) this;
        }

        public Criteria andUOrderMemberEqualTo(String value) {
            addCriterion("u_order_member =", value, "uOrderMember");
            return (Criteria) this;
        }

        public Criteria andUOrderMemberNotEqualTo(String value) {
            addCriterion("u_order_member <>", value, "uOrderMember");
            return (Criteria) this;
        }

        public Criteria andUOrderMemberGreaterThan(String value) {
            addCriterion("u_order_member >", value, "uOrderMember");
            return (Criteria) this;
        }

        public Criteria andUOrderMemberGreaterThanOrEqualTo(String value) {
            addCriterion("u_order_member >=", value, "uOrderMember");
            return (Criteria) this;
        }

        public Criteria andUOrderMemberLessThan(String value) {
            addCriterion("u_order_member <", value, "uOrderMember");
            return (Criteria) this;
        }

        public Criteria andUOrderMemberLessThanOrEqualTo(String value) {
            addCriterion("u_order_member <=", value, "uOrderMember");
            return (Criteria) this;
        }

        public Criteria andUOrderMemberLike(String value) {
            addCriterion("u_order_member like", value, "uOrderMember");
            return (Criteria) this;
        }

        public Criteria andUOrderMemberNotLike(String value) {
            addCriterion("u_order_member not like", value, "uOrderMember");
            return (Criteria) this;
        }

        public Criteria andUOrderMemberIn(List<String> values) {
            addCriterion("u_order_member in", values, "uOrderMember");
            return (Criteria) this;
        }

        public Criteria andUOrderMemberNotIn(List<String> values) {
            addCriterion("u_order_member not in", values, "uOrderMember");
            return (Criteria) this;
        }

        public Criteria andUOrderMemberBetween(String value1, String value2) {
            addCriterion("u_order_member between", value1, value2, "uOrderMember");
            return (Criteria) this;
        }

        public Criteria andUOrderMemberNotBetween(String value1, String value2) {
            addCriterion("u_order_member not between", value1, value2, "uOrderMember");
            return (Criteria) this;
        }

        public Criteria andUOrderBusinessnameIsNull() {
            addCriterion("u_order_businessname is null");
            return (Criteria) this;
        }

        public Criteria andUOrderBusinessnameIsNotNull() {
            addCriterion("u_order_businessname is not null");
            return (Criteria) this;
        }

        public Criteria andUOrderBusinessnameEqualTo(String value) {
            addCriterion("u_order_businessname =", value, "uOrderBusinessname");
            return (Criteria) this;
        }

        public Criteria andUOrderBusinessnameNotEqualTo(String value) {
            addCriterion("u_order_businessname <>", value, "uOrderBusinessname");
            return (Criteria) this;
        }

        public Criteria andUOrderBusinessnameGreaterThan(String value) {
            addCriterion("u_order_businessname >", value, "uOrderBusinessname");
            return (Criteria) this;
        }

        public Criteria andUOrderBusinessnameGreaterThanOrEqualTo(String value) {
            addCriterion("u_order_businessname >=", value, "uOrderBusinessname");
            return (Criteria) this;
        }

        public Criteria andUOrderBusinessnameLessThan(String value) {
            addCriterion("u_order_businessname <", value, "uOrderBusinessname");
            return (Criteria) this;
        }

        public Criteria andUOrderBusinessnameLessThanOrEqualTo(String value) {
            addCriterion("u_order_businessname <=", value, "uOrderBusinessname");
            return (Criteria) this;
        }

        public Criteria andUOrderBusinessnameLike(String value) {
            addCriterion("u_order_businessname like", value, "uOrderBusinessname");
            return (Criteria) this;
        }

        public Criteria andUOrderBusinessnameNotLike(String value) {
            addCriterion("u_order_businessname not like", value, "uOrderBusinessname");
            return (Criteria) this;
        }

        public Criteria andUOrderBusinessnameIn(List<String> values) {
            addCriterion("u_order_businessname in", values, "uOrderBusinessname");
            return (Criteria) this;
        }

        public Criteria andUOrderBusinessnameNotIn(List<String> values) {
            addCriterion("u_order_businessname not in", values, "uOrderBusinessname");
            return (Criteria) this;
        }

        public Criteria andUOrderBusinessnameBetween(String value1, String value2) {
            addCriterion("u_order_businessname between", value1, value2, "uOrderBusinessname");
            return (Criteria) this;
        }

        public Criteria andUOrderBusinessnameNotBetween(String value1, String value2) {
            addCriterion("u_order_businessname not between", value1, value2, "uOrderBusinessname");
            return (Criteria) this;
        }

        public Criteria andUOrderPriceIsNull() {
            addCriterion("u_order_price is null");
            return (Criteria) this;
        }

        public Criteria andUOrderPriceIsNotNull() {
            addCriterion("u_order_price is not null");
            return (Criteria) this;
        }

        public Criteria andUOrderPriceEqualTo(Double value) {
            addCriterion("u_order_price =", value, "uOrderPrice");
            return (Criteria) this;
        }

        public Criteria andUOrderPriceNotEqualTo(Double value) {
            addCriterion("u_order_price <>", value, "uOrderPrice");
            return (Criteria) this;
        }

        public Criteria andUOrderPriceGreaterThan(Double value) {
            addCriterion("u_order_price >", value, "uOrderPrice");
            return (Criteria) this;
        }

        public Criteria andUOrderPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("u_order_price >=", value, "uOrderPrice");
            return (Criteria) this;
        }

        public Criteria andUOrderPriceLessThan(Double value) {
            addCriterion("u_order_price <", value, "uOrderPrice");
            return (Criteria) this;
        }

        public Criteria andUOrderPriceLessThanOrEqualTo(Double value) {
            addCriterion("u_order_price <=", value, "uOrderPrice");
            return (Criteria) this;
        }

        public Criteria andUOrderPriceIn(List<Double> values) {
            addCriterion("u_order_price in", values, "uOrderPrice");
            return (Criteria) this;
        }

        public Criteria andUOrderPriceNotIn(List<Double> values) {
            addCriterion("u_order_price not in", values, "uOrderPrice");
            return (Criteria) this;
        }

        public Criteria andUOrderPriceBetween(Double value1, Double value2) {
            addCriterion("u_order_price between", value1, value2, "uOrderPrice");
            return (Criteria) this;
        }

        public Criteria andUOrderPriceNotBetween(Double value1, Double value2) {
            addCriterion("u_order_price not between", value1, value2, "uOrderPrice");
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