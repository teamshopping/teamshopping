package com.neusoft.bean;

import java.util.ArrayList;
import java.util.List;

public class UserAddressExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserAddressExample() {
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

        public Criteria andUAddressIdIsNull() {
            addCriterion("u_address_id is null");
            return (Criteria) this;
        }

        public Criteria andUAddressIdIsNotNull() {
            addCriterion("u_address_id is not null");
            return (Criteria) this;
        }

        public Criteria andUAddressIdEqualTo(Integer value) {
            addCriterion("u_address_id =", value, "uAddressId");
            return (Criteria) this;
        }

        public Criteria andUAddressIdNotEqualTo(Integer value) {
            addCriterion("u_address_id <>", value, "uAddressId");
            return (Criteria) this;
        }

        public Criteria andUAddressIdGreaterThan(Integer value) {
            addCriterion("u_address_id >", value, "uAddressId");
            return (Criteria) this;
        }

        public Criteria andUAddressIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("u_address_id >=", value, "uAddressId");
            return (Criteria) this;
        }

        public Criteria andUAddressIdLessThan(Integer value) {
            addCriterion("u_address_id <", value, "uAddressId");
            return (Criteria) this;
        }

        public Criteria andUAddressIdLessThanOrEqualTo(Integer value) {
            addCriterion("u_address_id <=", value, "uAddressId");
            return (Criteria) this;
        }

        public Criteria andUAddressIdIn(List<Integer> values) {
            addCriterion("u_address_id in", values, "uAddressId");
            return (Criteria) this;
        }

        public Criteria andUAddressIdNotIn(List<Integer> values) {
            addCriterion("u_address_id not in", values, "uAddressId");
            return (Criteria) this;
        }

        public Criteria andUAddressIdBetween(Integer value1, Integer value2) {
            addCriterion("u_address_id between", value1, value2, "uAddressId");
            return (Criteria) this;
        }

        public Criteria andUAddressIdNotBetween(Integer value1, Integer value2) {
            addCriterion("u_address_id not between", value1, value2, "uAddressId");
            return (Criteria) this;
        }

        public Criteria andUAddressProvinceIsNull() {
            addCriterion("u_address_province is null");
            return (Criteria) this;
        }

        public Criteria andUAddressProvinceIsNotNull() {
            addCriterion("u_address_province is not null");
            return (Criteria) this;
        }

        public Criteria andUAddressProvinceEqualTo(String value) {
            addCriterion("u_address_province =", value, "uAddressProvince");
            return (Criteria) this;
        }

        public Criteria andUAddressProvinceNotEqualTo(String value) {
            addCriterion("u_address_province <>", value, "uAddressProvince");
            return (Criteria) this;
        }

        public Criteria andUAddressProvinceGreaterThan(String value) {
            addCriterion("u_address_province >", value, "uAddressProvince");
            return (Criteria) this;
        }

        public Criteria andUAddressProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("u_address_province >=", value, "uAddressProvince");
            return (Criteria) this;
        }

        public Criteria andUAddressProvinceLessThan(String value) {
            addCriterion("u_address_province <", value, "uAddressProvince");
            return (Criteria) this;
        }

        public Criteria andUAddressProvinceLessThanOrEqualTo(String value) {
            addCriterion("u_address_province <=", value, "uAddressProvince");
            return (Criteria) this;
        }

        public Criteria andUAddressProvinceLike(String value) {
            addCriterion("u_address_province like", value, "uAddressProvince");
            return (Criteria) this;
        }

        public Criteria andUAddressProvinceNotLike(String value) {
            addCriterion("u_address_province not like", value, "uAddressProvince");
            return (Criteria) this;
        }

        public Criteria andUAddressProvinceIn(List<String> values) {
            addCriterion("u_address_province in", values, "uAddressProvince");
            return (Criteria) this;
        }

        public Criteria andUAddressProvinceNotIn(List<String> values) {
            addCriterion("u_address_province not in", values, "uAddressProvince");
            return (Criteria) this;
        }

        public Criteria andUAddressProvinceBetween(String value1, String value2) {
            addCriterion("u_address_province between", value1, value2, "uAddressProvince");
            return (Criteria) this;
        }

        public Criteria andUAddressProvinceNotBetween(String value1, String value2) {
            addCriterion("u_address_province not between", value1, value2, "uAddressProvince");
            return (Criteria) this;
        }

        public Criteria andUAddressCityIsNull() {
            addCriterion("u_address_city is null");
            return (Criteria) this;
        }

        public Criteria andUAddressCityIsNotNull() {
            addCriterion("u_address_city is not null");
            return (Criteria) this;
        }

        public Criteria andUAddressCityEqualTo(String value) {
            addCriterion("u_address_city =", value, "uAddressCity");
            return (Criteria) this;
        }

        public Criteria andUAddressCityNotEqualTo(String value) {
            addCriterion("u_address_city <>", value, "uAddressCity");
            return (Criteria) this;
        }

        public Criteria andUAddressCityGreaterThan(String value) {
            addCriterion("u_address_city >", value, "uAddressCity");
            return (Criteria) this;
        }

        public Criteria andUAddressCityGreaterThanOrEqualTo(String value) {
            addCriterion("u_address_city >=", value, "uAddressCity");
            return (Criteria) this;
        }

        public Criteria andUAddressCityLessThan(String value) {
            addCriterion("u_address_city <", value, "uAddressCity");
            return (Criteria) this;
        }

        public Criteria andUAddressCityLessThanOrEqualTo(String value) {
            addCriterion("u_address_city <=", value, "uAddressCity");
            return (Criteria) this;
        }

        public Criteria andUAddressCityLike(String value) {
            addCriterion("u_address_city like", value, "uAddressCity");
            return (Criteria) this;
        }

        public Criteria andUAddressCityNotLike(String value) {
            addCriterion("u_address_city not like", value, "uAddressCity");
            return (Criteria) this;
        }

        public Criteria andUAddressCityIn(List<String> values) {
            addCriterion("u_address_city in", values, "uAddressCity");
            return (Criteria) this;
        }

        public Criteria andUAddressCityNotIn(List<String> values) {
            addCriterion("u_address_city not in", values, "uAddressCity");
            return (Criteria) this;
        }

        public Criteria andUAddressCityBetween(String value1, String value2) {
            addCriterion("u_address_city between", value1, value2, "uAddressCity");
            return (Criteria) this;
        }

        public Criteria andUAddressCityNotBetween(String value1, String value2) {
            addCriterion("u_address_city not between", value1, value2, "uAddressCity");
            return (Criteria) this;
        }

        public Criteria andUAddressAreaIsNull() {
            addCriterion("u_address_area is null");
            return (Criteria) this;
        }

        public Criteria andUAddressAreaIsNotNull() {
            addCriterion("u_address_area is not null");
            return (Criteria) this;
        }

        public Criteria andUAddressAreaEqualTo(String value) {
            addCriterion("u_address_area =", value, "uAddressArea");
            return (Criteria) this;
        }

        public Criteria andUAddressAreaNotEqualTo(String value) {
            addCriterion("u_address_area <>", value, "uAddressArea");
            return (Criteria) this;
        }

        public Criteria andUAddressAreaGreaterThan(String value) {
            addCriterion("u_address_area >", value, "uAddressArea");
            return (Criteria) this;
        }

        public Criteria andUAddressAreaGreaterThanOrEqualTo(String value) {
            addCriterion("u_address_area >=", value, "uAddressArea");
            return (Criteria) this;
        }

        public Criteria andUAddressAreaLessThan(String value) {
            addCriterion("u_address_area <", value, "uAddressArea");
            return (Criteria) this;
        }

        public Criteria andUAddressAreaLessThanOrEqualTo(String value) {
            addCriterion("u_address_area <=", value, "uAddressArea");
            return (Criteria) this;
        }

        public Criteria andUAddressAreaLike(String value) {
            addCriterion("u_address_area like", value, "uAddressArea");
            return (Criteria) this;
        }

        public Criteria andUAddressAreaNotLike(String value) {
            addCriterion("u_address_area not like", value, "uAddressArea");
            return (Criteria) this;
        }

        public Criteria andUAddressAreaIn(List<String> values) {
            addCriterion("u_address_area in", values, "uAddressArea");
            return (Criteria) this;
        }

        public Criteria andUAddressAreaNotIn(List<String> values) {
            addCriterion("u_address_area not in", values, "uAddressArea");
            return (Criteria) this;
        }

        public Criteria andUAddressAreaBetween(String value1, String value2) {
            addCriterion("u_address_area between", value1, value2, "uAddressArea");
            return (Criteria) this;
        }

        public Criteria andUAddressAreaNotBetween(String value1, String value2) {
            addCriterion("u_address_area not between", value1, value2, "uAddressArea");
            return (Criteria) this;
        }

        public Criteria andUAddressDetailedIsNull() {
            addCriterion("u_address_detailed is null");
            return (Criteria) this;
        }

        public Criteria andUAddressDetailedIsNotNull() {
            addCriterion("u_address_detailed is not null");
            return (Criteria) this;
        }

        public Criteria andUAddressDetailedEqualTo(String value) {
            addCriterion("u_address_detailed =", value, "uAddressDetailed");
            return (Criteria) this;
        }

        public Criteria andUAddressDetailedNotEqualTo(String value) {
            addCriterion("u_address_detailed <>", value, "uAddressDetailed");
            return (Criteria) this;
        }

        public Criteria andUAddressDetailedGreaterThan(String value) {
            addCriterion("u_address_detailed >", value, "uAddressDetailed");
            return (Criteria) this;
        }

        public Criteria andUAddressDetailedGreaterThanOrEqualTo(String value) {
            addCriterion("u_address_detailed >=", value, "uAddressDetailed");
            return (Criteria) this;
        }

        public Criteria andUAddressDetailedLessThan(String value) {
            addCriterion("u_address_detailed <", value, "uAddressDetailed");
            return (Criteria) this;
        }

        public Criteria andUAddressDetailedLessThanOrEqualTo(String value) {
            addCriterion("u_address_detailed <=", value, "uAddressDetailed");
            return (Criteria) this;
        }

        public Criteria andUAddressDetailedLike(String value) {
            addCriterion("u_address_detailed like", value, "uAddressDetailed");
            return (Criteria) this;
        }

        public Criteria andUAddressDetailedNotLike(String value) {
            addCriterion("u_address_detailed not like", value, "uAddressDetailed");
            return (Criteria) this;
        }

        public Criteria andUAddressDetailedIn(List<String> values) {
            addCriterion("u_address_detailed in", values, "uAddressDetailed");
            return (Criteria) this;
        }

        public Criteria andUAddressDetailedNotIn(List<String> values) {
            addCriterion("u_address_detailed not in", values, "uAddressDetailed");
            return (Criteria) this;
        }

        public Criteria andUAddressDetailedBetween(String value1, String value2) {
            addCriterion("u_address_detailed between", value1, value2, "uAddressDetailed");
            return (Criteria) this;
        }

        public Criteria andUAddressDetailedNotBetween(String value1, String value2) {
            addCriterion("u_address_detailed not between", value1, value2, "uAddressDetailed");
            return (Criteria) this;
        }

        public Criteria andUAddressMidIsNull() {
            addCriterion("u_address_mid is null");
            return (Criteria) this;
        }

        public Criteria andUAddressMidIsNotNull() {
            addCriterion("u_address_mid is not null");
            return (Criteria) this;
        }

        public Criteria andUAddressMidEqualTo(Integer value) {
            addCriterion("u_address_mid =", value, "uAddressMid");
            return (Criteria) this;
        }

        public Criteria andUAddressMidNotEqualTo(Integer value) {
            addCriterion("u_address_mid <>", value, "uAddressMid");
            return (Criteria) this;
        }

        public Criteria andUAddressMidGreaterThan(Integer value) {
            addCriterion("u_address_mid >", value, "uAddressMid");
            return (Criteria) this;
        }

        public Criteria andUAddressMidGreaterThanOrEqualTo(Integer value) {
            addCriterion("u_address_mid >=", value, "uAddressMid");
            return (Criteria) this;
        }

        public Criteria andUAddressMidLessThan(Integer value) {
            addCriterion("u_address_mid <", value, "uAddressMid");
            return (Criteria) this;
        }

        public Criteria andUAddressMidLessThanOrEqualTo(Integer value) {
            addCriterion("u_address_mid <=", value, "uAddressMid");
            return (Criteria) this;
        }

        public Criteria andUAddressMidIn(List<Integer> values) {
            addCriterion("u_address_mid in", values, "uAddressMid");
            return (Criteria) this;
        }

        public Criteria andUAddressMidNotIn(List<Integer> values) {
            addCriterion("u_address_mid not in", values, "uAddressMid");
            return (Criteria) this;
        }

        public Criteria andUAddressMidBetween(Integer value1, Integer value2) {
            addCriterion("u_address_mid between", value1, value2, "uAddressMid");
            return (Criteria) this;
        }

        public Criteria andUAddressMidNotBetween(Integer value1, Integer value2) {
            addCriterion("u_address_mid not between", value1, value2, "uAddressMid");
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