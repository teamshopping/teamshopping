package com.neusoft.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TeamshoppingBeautyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TeamshoppingBeautyExample() {
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

        public Criteria andTsBeautyIdIsNull() {
            addCriterion("ts_beauty_id is null");
            return (Criteria) this;
        }

        public Criteria andTsBeautyIdIsNotNull() {
            addCriterion("ts_beauty_id is not null");
            return (Criteria) this;
        }

        public Criteria andTsBeautyIdEqualTo(Integer value) {
            addCriterion("ts_beauty_id =", value, "tsBeautyId");
            return (Criteria) this;
        }

        public Criteria andTsBeautyIdNotEqualTo(Integer value) {
            addCriterion("ts_beauty_id <>", value, "tsBeautyId");
            return (Criteria) this;
        }

        public Criteria andTsBeautyIdGreaterThan(Integer value) {
            addCriterion("ts_beauty_id >", value, "tsBeautyId");
            return (Criteria) this;
        }

        public Criteria andTsBeautyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ts_beauty_id >=", value, "tsBeautyId");
            return (Criteria) this;
        }

        public Criteria andTsBeautyIdLessThan(Integer value) {
            addCriterion("ts_beauty_id <", value, "tsBeautyId");
            return (Criteria) this;
        }

        public Criteria andTsBeautyIdLessThanOrEqualTo(Integer value) {
            addCriterion("ts_beauty_id <=", value, "tsBeautyId");
            return (Criteria) this;
        }

        public Criteria andTsBeautyIdIn(List<Integer> values) {
            addCriterion("ts_beauty_id in", values, "tsBeautyId");
            return (Criteria) this;
        }

        public Criteria andTsBeautyIdNotIn(List<Integer> values) {
            addCriterion("ts_beauty_id not in", values, "tsBeautyId");
            return (Criteria) this;
        }

        public Criteria andTsBeautyIdBetween(Integer value1, Integer value2) {
            addCriterion("ts_beauty_id between", value1, value2, "tsBeautyId");
            return (Criteria) this;
        }

        public Criteria andTsBeautyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ts_beauty_id not between", value1, value2, "tsBeautyId");
            return (Criteria) this;
        }

        public Criteria andTsBeautyBrandIsNull() {
            addCriterion("ts_beauty_brand is null");
            return (Criteria) this;
        }

        public Criteria andTsBeautyBrandIsNotNull() {
            addCriterion("ts_beauty_brand is not null");
            return (Criteria) this;
        }

        public Criteria andTsBeautyBrandEqualTo(String value) {
            addCriterion("ts_beauty_brand =", value, "tsBeautyBrand");
            return (Criteria) this;
        }

        public Criteria andTsBeautyBrandNotEqualTo(String value) {
            addCriterion("ts_beauty_brand <>", value, "tsBeautyBrand");
            return (Criteria) this;
        }

        public Criteria andTsBeautyBrandGreaterThan(String value) {
            addCriterion("ts_beauty_brand >", value, "tsBeautyBrand");
            return (Criteria) this;
        }

        public Criteria andTsBeautyBrandGreaterThanOrEqualTo(String value) {
            addCriterion("ts_beauty_brand >=", value, "tsBeautyBrand");
            return (Criteria) this;
        }

        public Criteria andTsBeautyBrandLessThan(String value) {
            addCriterion("ts_beauty_brand <", value, "tsBeautyBrand");
            return (Criteria) this;
        }

        public Criteria andTsBeautyBrandLessThanOrEqualTo(String value) {
            addCriterion("ts_beauty_brand <=", value, "tsBeautyBrand");
            return (Criteria) this;
        }

        public Criteria andTsBeautyBrandLike(String value) {
            addCriterion("ts_beauty_brand like", value, "tsBeautyBrand");
            return (Criteria) this;
        }

        public Criteria andTsBeautyBrandNotLike(String value) {
            addCriterion("ts_beauty_brand not like", value, "tsBeautyBrand");
            return (Criteria) this;
        }

        public Criteria andTsBeautyBrandIn(List<String> values) {
            addCriterion("ts_beauty_brand in", values, "tsBeautyBrand");
            return (Criteria) this;
        }

        public Criteria andTsBeautyBrandNotIn(List<String> values) {
            addCriterion("ts_beauty_brand not in", values, "tsBeautyBrand");
            return (Criteria) this;
        }

        public Criteria andTsBeautyBrandBetween(String value1, String value2) {
            addCriterion("ts_beauty_brand between", value1, value2, "tsBeautyBrand");
            return (Criteria) this;
        }

        public Criteria andTsBeautyBrandNotBetween(String value1, String value2) {
            addCriterion("ts_beauty_brand not between", value1, value2, "tsBeautyBrand");
            return (Criteria) this;
        }

        public Criteria andTsBeautyTypeIsNull() {
            addCriterion("ts_beauty_type is null");
            return (Criteria) this;
        }

        public Criteria andTsBeautyTypeIsNotNull() {
            addCriterion("ts_beauty_type is not null");
            return (Criteria) this;
        }

        public Criteria andTsBeautyTypeEqualTo(String value) {
            addCriterion("ts_beauty_type =", value, "tsBeautyType");
            return (Criteria) this;
        }

        public Criteria andTsBeautyTypeNotEqualTo(String value) {
            addCriterion("ts_beauty_type <>", value, "tsBeautyType");
            return (Criteria) this;
        }

        public Criteria andTsBeautyTypeGreaterThan(String value) {
            addCriterion("ts_beauty_type >", value, "tsBeautyType");
            return (Criteria) this;
        }

        public Criteria andTsBeautyTypeGreaterThanOrEqualTo(String value) {
            addCriterion("ts_beauty_type >=", value, "tsBeautyType");
            return (Criteria) this;
        }

        public Criteria andTsBeautyTypeLessThan(String value) {
            addCriterion("ts_beauty_type <", value, "tsBeautyType");
            return (Criteria) this;
        }

        public Criteria andTsBeautyTypeLessThanOrEqualTo(String value) {
            addCriterion("ts_beauty_type <=", value, "tsBeautyType");
            return (Criteria) this;
        }

        public Criteria andTsBeautyTypeLike(String value) {
            addCriterion("ts_beauty_type like", value, "tsBeautyType");
            return (Criteria) this;
        }

        public Criteria andTsBeautyTypeNotLike(String value) {
            addCriterion("ts_beauty_type not like", value, "tsBeautyType");
            return (Criteria) this;
        }

        public Criteria andTsBeautyTypeIn(List<String> values) {
            addCriterion("ts_beauty_type in", values, "tsBeautyType");
            return (Criteria) this;
        }

        public Criteria andTsBeautyTypeNotIn(List<String> values) {
            addCriterion("ts_beauty_type not in", values, "tsBeautyType");
            return (Criteria) this;
        }

        public Criteria andTsBeautyTypeBetween(String value1, String value2) {
            addCriterion("ts_beauty_type between", value1, value2, "tsBeautyType");
            return (Criteria) this;
        }

        public Criteria andTsBeautyTypeNotBetween(String value1, String value2) {
            addCriterion("ts_beauty_type not between", value1, value2, "tsBeautyType");
            return (Criteria) this;
        }

        public Criteria andTsBeautyComponentIsNull() {
            addCriterion("ts_beauty_component is null");
            return (Criteria) this;
        }

        public Criteria andTsBeautyComponentIsNotNull() {
            addCriterion("ts_beauty_component is not null");
            return (Criteria) this;
        }

        public Criteria andTsBeautyComponentEqualTo(String value) {
            addCriterion("ts_beauty_component =", value, "tsBeautyComponent");
            return (Criteria) this;
        }

        public Criteria andTsBeautyComponentNotEqualTo(String value) {
            addCriterion("ts_beauty_component <>", value, "tsBeautyComponent");
            return (Criteria) this;
        }

        public Criteria andTsBeautyComponentGreaterThan(String value) {
            addCriterion("ts_beauty_component >", value, "tsBeautyComponent");
            return (Criteria) this;
        }

        public Criteria andTsBeautyComponentGreaterThanOrEqualTo(String value) {
            addCriterion("ts_beauty_component >=", value, "tsBeautyComponent");
            return (Criteria) this;
        }

        public Criteria andTsBeautyComponentLessThan(String value) {
            addCriterion("ts_beauty_component <", value, "tsBeautyComponent");
            return (Criteria) this;
        }

        public Criteria andTsBeautyComponentLessThanOrEqualTo(String value) {
            addCriterion("ts_beauty_component <=", value, "tsBeautyComponent");
            return (Criteria) this;
        }

        public Criteria andTsBeautyComponentLike(String value) {
            addCriterion("ts_beauty_component like", value, "tsBeautyComponent");
            return (Criteria) this;
        }

        public Criteria andTsBeautyComponentNotLike(String value) {
            addCriterion("ts_beauty_component not like", value, "tsBeautyComponent");
            return (Criteria) this;
        }

        public Criteria andTsBeautyComponentIn(List<String> values) {
            addCriterion("ts_beauty_component in", values, "tsBeautyComponent");
            return (Criteria) this;
        }

        public Criteria andTsBeautyComponentNotIn(List<String> values) {
            addCriterion("ts_beauty_component not in", values, "tsBeautyComponent");
            return (Criteria) this;
        }

        public Criteria andTsBeautyComponentBetween(String value1, String value2) {
            addCriterion("ts_beauty_component between", value1, value2, "tsBeautyComponent");
            return (Criteria) this;
        }

        public Criteria andTsBeautyComponentNotBetween(String value1, String value2) {
            addCriterion("ts_beauty_component not between", value1, value2, "tsBeautyComponent");
            return (Criteria) this;
        }

        public Criteria andTsBeautyAmountIsNull() {
            addCriterion("ts_beauty_amount is null");
            return (Criteria) this;
        }

        public Criteria andTsBeautyAmountIsNotNull() {
            addCriterion("ts_beauty_amount is not null");
            return (Criteria) this;
        }

        public Criteria andTsBeautyAmountEqualTo(Double value) {
            addCriterion("ts_beauty_amount =", value, "tsBeautyAmount");
            return (Criteria) this;
        }

        public Criteria andTsBeautyAmountNotEqualTo(Double value) {
            addCriterion("ts_beauty_amount <>", value, "tsBeautyAmount");
            return (Criteria) this;
        }

        public Criteria andTsBeautyAmountGreaterThan(Double value) {
            addCriterion("ts_beauty_amount >", value, "tsBeautyAmount");
            return (Criteria) this;
        }

        public Criteria andTsBeautyAmountGreaterThanOrEqualTo(Double value) {
            addCriterion("ts_beauty_amount >=", value, "tsBeautyAmount");
            return (Criteria) this;
        }

        public Criteria andTsBeautyAmountLessThan(Double value) {
            addCriterion("ts_beauty_amount <", value, "tsBeautyAmount");
            return (Criteria) this;
        }

        public Criteria andTsBeautyAmountLessThanOrEqualTo(Double value) {
            addCriterion("ts_beauty_amount <=", value, "tsBeautyAmount");
            return (Criteria) this;
        }

        public Criteria andTsBeautyAmountIn(List<Double> values) {
            addCriterion("ts_beauty_amount in", values, "tsBeautyAmount");
            return (Criteria) this;
        }

        public Criteria andTsBeautyAmountNotIn(List<Double> values) {
            addCriterion("ts_beauty_amount not in", values, "tsBeautyAmount");
            return (Criteria) this;
        }

        public Criteria andTsBeautyAmountBetween(Double value1, Double value2) {
            addCriterion("ts_beauty_amount between", value1, value2, "tsBeautyAmount");
            return (Criteria) this;
        }

        public Criteria andTsBeautyAmountNotBetween(Double value1, Double value2) {
            addCriterion("ts_beauty_amount not between", value1, value2, "tsBeautyAmount");
            return (Criteria) this;
        }

        public Criteria andTsBeautyDateIsNull() {
            addCriterion("ts_beauty_date is null");
            return (Criteria) this;
        }

        public Criteria andTsBeautyDateIsNotNull() {
            addCriterion("ts_beauty_date is not null");
            return (Criteria) this;
        }

        public Criteria andTsBeautyDateEqualTo(Date value) {
            addCriterionForJDBCDate("ts_beauty_date =", value, "tsBeautyDate");
            return (Criteria) this;
        }

        public Criteria andTsBeautyDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("ts_beauty_date <>", value, "tsBeautyDate");
            return (Criteria) this;
        }

        public Criteria andTsBeautyDateGreaterThan(Date value) {
            addCriterionForJDBCDate("ts_beauty_date >", value, "tsBeautyDate");
            return (Criteria) this;
        }

        public Criteria andTsBeautyDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ts_beauty_date >=", value, "tsBeautyDate");
            return (Criteria) this;
        }

        public Criteria andTsBeautyDateLessThan(Date value) {
            addCriterionForJDBCDate("ts_beauty_date <", value, "tsBeautyDate");
            return (Criteria) this;
        }

        public Criteria andTsBeautyDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ts_beauty_date <=", value, "tsBeautyDate");
            return (Criteria) this;
        }

        public Criteria andTsBeautyDateIn(List<Date> values) {
            addCriterionForJDBCDate("ts_beauty_date in", values, "tsBeautyDate");
            return (Criteria) this;
        }

        public Criteria andTsBeautyDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("ts_beauty_date not in", values, "tsBeautyDate");
            return (Criteria) this;
        }

        public Criteria andTsBeautyDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ts_beauty_date between", value1, value2, "tsBeautyDate");
            return (Criteria) this;
        }

        public Criteria andTsBeautyDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ts_beauty_date not between", value1, value2, "tsBeautyDate");
            return (Criteria) this;
        }

        public Criteria andTsBeautyEffectIsNull() {
            addCriterion("ts_beauty_effect is null");
            return (Criteria) this;
        }

        public Criteria andTsBeautyEffectIsNotNull() {
            addCriterion("ts_beauty_effect is not null");
            return (Criteria) this;
        }

        public Criteria andTsBeautyEffectEqualTo(String value) {
            addCriterion("ts_beauty_effect =", value, "tsBeautyEffect");
            return (Criteria) this;
        }

        public Criteria andTsBeautyEffectNotEqualTo(String value) {
            addCriterion("ts_beauty_effect <>", value, "tsBeautyEffect");
            return (Criteria) this;
        }

        public Criteria andTsBeautyEffectGreaterThan(String value) {
            addCriterion("ts_beauty_effect >", value, "tsBeautyEffect");
            return (Criteria) this;
        }

        public Criteria andTsBeautyEffectGreaterThanOrEqualTo(String value) {
            addCriterion("ts_beauty_effect >=", value, "tsBeautyEffect");
            return (Criteria) this;
        }

        public Criteria andTsBeautyEffectLessThan(String value) {
            addCriterion("ts_beauty_effect <", value, "tsBeautyEffect");
            return (Criteria) this;
        }

        public Criteria andTsBeautyEffectLessThanOrEqualTo(String value) {
            addCriterion("ts_beauty_effect <=", value, "tsBeautyEffect");
            return (Criteria) this;
        }

        public Criteria andTsBeautyEffectLike(String value) {
            addCriterion("ts_beauty_effect like", value, "tsBeautyEffect");
            return (Criteria) this;
        }

        public Criteria andTsBeautyEffectNotLike(String value) {
            addCriterion("ts_beauty_effect not like", value, "tsBeautyEffect");
            return (Criteria) this;
        }

        public Criteria andTsBeautyEffectIn(List<String> values) {
            addCriterion("ts_beauty_effect in", values, "tsBeautyEffect");
            return (Criteria) this;
        }

        public Criteria andTsBeautyEffectNotIn(List<String> values) {
            addCriterion("ts_beauty_effect not in", values, "tsBeautyEffect");
            return (Criteria) this;
        }

        public Criteria andTsBeautyEffectBetween(String value1, String value2) {
            addCriterion("ts_beauty_effect between", value1, value2, "tsBeautyEffect");
            return (Criteria) this;
        }

        public Criteria andTsBeautyEffectNotBetween(String value1, String value2) {
            addCriterion("ts_beauty_effect not between", value1, value2, "tsBeautyEffect");
            return (Criteria) this;
        }

        public Criteria andTsBeautyTimeIsNull() {
            addCriterion("ts_beauty_time is null");
            return (Criteria) this;
        }

        public Criteria andTsBeautyTimeIsNotNull() {
            addCriterion("ts_beauty_time is not null");
            return (Criteria) this;
        }

        public Criteria andTsBeautyTimeEqualTo(String value) {
            addCriterion("ts_beauty_time =", value, "tsBeautyTime");
            return (Criteria) this;
        }

        public Criteria andTsBeautyTimeNotEqualTo(String value) {
            addCriterion("ts_beauty_time <>", value, "tsBeautyTime");
            return (Criteria) this;
        }

        public Criteria andTsBeautyTimeGreaterThan(String value) {
            addCriterion("ts_beauty_time >", value, "tsBeautyTime");
            return (Criteria) this;
        }

        public Criteria andTsBeautyTimeGreaterThanOrEqualTo(String value) {
            addCriterion("ts_beauty_time >=", value, "tsBeautyTime");
            return (Criteria) this;
        }

        public Criteria andTsBeautyTimeLessThan(String value) {
            addCriterion("ts_beauty_time <", value, "tsBeautyTime");
            return (Criteria) this;
        }

        public Criteria andTsBeautyTimeLessThanOrEqualTo(String value) {
            addCriterion("ts_beauty_time <=", value, "tsBeautyTime");
            return (Criteria) this;
        }

        public Criteria andTsBeautyTimeLike(String value) {
            addCriterion("ts_beauty_time like", value, "tsBeautyTime");
            return (Criteria) this;
        }

        public Criteria andTsBeautyTimeNotLike(String value) {
            addCriterion("ts_beauty_time not like", value, "tsBeautyTime");
            return (Criteria) this;
        }

        public Criteria andTsBeautyTimeIn(List<String> values) {
            addCriterion("ts_beauty_time in", values, "tsBeautyTime");
            return (Criteria) this;
        }

        public Criteria andTsBeautyTimeNotIn(List<String> values) {
            addCriterion("ts_beauty_time not in", values, "tsBeautyTime");
            return (Criteria) this;
        }

        public Criteria andTsBeautyTimeBetween(String value1, String value2) {
            addCriterion("ts_beauty_time between", value1, value2, "tsBeautyTime");
            return (Criteria) this;
        }

        public Criteria andTsBeautyTimeNotBetween(String value1, String value2) {
            addCriterion("ts_beauty_time not between", value1, value2, "tsBeautyTime");
            return (Criteria) this;
        }

        public Criteria andTsBeautyPeopleIsNull() {
            addCriterion("ts_beauty_people is null");
            return (Criteria) this;
        }

        public Criteria andTsBeautyPeopleIsNotNull() {
            addCriterion("ts_beauty_people is not null");
            return (Criteria) this;
        }

        public Criteria andTsBeautyPeopleEqualTo(String value) {
            addCriterion("ts_beauty_people =", value, "tsBeautyPeople");
            return (Criteria) this;
        }

        public Criteria andTsBeautyPeopleNotEqualTo(String value) {
            addCriterion("ts_beauty_people <>", value, "tsBeautyPeople");
            return (Criteria) this;
        }

        public Criteria andTsBeautyPeopleGreaterThan(String value) {
            addCriterion("ts_beauty_people >", value, "tsBeautyPeople");
            return (Criteria) this;
        }

        public Criteria andTsBeautyPeopleGreaterThanOrEqualTo(String value) {
            addCriterion("ts_beauty_people >=", value, "tsBeautyPeople");
            return (Criteria) this;
        }

        public Criteria andTsBeautyPeopleLessThan(String value) {
            addCriterion("ts_beauty_people <", value, "tsBeautyPeople");
            return (Criteria) this;
        }

        public Criteria andTsBeautyPeopleLessThanOrEqualTo(String value) {
            addCriterion("ts_beauty_people <=", value, "tsBeautyPeople");
            return (Criteria) this;
        }

        public Criteria andTsBeautyPeopleLike(String value) {
            addCriterion("ts_beauty_people like", value, "tsBeautyPeople");
            return (Criteria) this;
        }

        public Criteria andTsBeautyPeopleNotLike(String value) {
            addCriterion("ts_beauty_people not like", value, "tsBeautyPeople");
            return (Criteria) this;
        }

        public Criteria andTsBeautyPeopleIn(List<String> values) {
            addCriterion("ts_beauty_people in", values, "tsBeautyPeople");
            return (Criteria) this;
        }

        public Criteria andTsBeautyPeopleNotIn(List<String> values) {
            addCriterion("ts_beauty_people not in", values, "tsBeautyPeople");
            return (Criteria) this;
        }

        public Criteria andTsBeautyPeopleBetween(String value1, String value2) {
            addCriterion("ts_beauty_people between", value1, value2, "tsBeautyPeople");
            return (Criteria) this;
        }

        public Criteria andTsBeautyPeopleNotBetween(String value1, String value2) {
            addCriterion("ts_beauty_people not between", value1, value2, "tsBeautyPeople");
            return (Criteria) this;
        }

        public Criteria andTsBeautyPictureIsNull() {
            addCriterion("ts_beauty_picture is null");
            return (Criteria) this;
        }

        public Criteria andTsBeautyPictureIsNotNull() {
            addCriterion("ts_beauty_picture is not null");
            return (Criteria) this;
        }

        public Criteria andTsBeautyPictureEqualTo(String value) {
            addCriterion("ts_beauty_picture =", value, "tsBeautyPicture");
            return (Criteria) this;
        }

        public Criteria andTsBeautyPictureNotEqualTo(String value) {
            addCriterion("ts_beauty_picture <>", value, "tsBeautyPicture");
            return (Criteria) this;
        }

        public Criteria andTsBeautyPictureGreaterThan(String value) {
            addCriterion("ts_beauty_picture >", value, "tsBeautyPicture");
            return (Criteria) this;
        }

        public Criteria andTsBeautyPictureGreaterThanOrEqualTo(String value) {
            addCriterion("ts_beauty_picture >=", value, "tsBeautyPicture");
            return (Criteria) this;
        }

        public Criteria andTsBeautyPictureLessThan(String value) {
            addCriterion("ts_beauty_picture <", value, "tsBeautyPicture");
            return (Criteria) this;
        }

        public Criteria andTsBeautyPictureLessThanOrEqualTo(String value) {
            addCriterion("ts_beauty_picture <=", value, "tsBeautyPicture");
            return (Criteria) this;
        }

        public Criteria andTsBeautyPictureLike(String value) {
            addCriterion("ts_beauty_picture like", value, "tsBeautyPicture");
            return (Criteria) this;
        }

        public Criteria andTsBeautyPictureNotLike(String value) {
            addCriterion("ts_beauty_picture not like", value, "tsBeautyPicture");
            return (Criteria) this;
        }

        public Criteria andTsBeautyPictureIn(List<String> values) {
            addCriterion("ts_beauty_picture in", values, "tsBeautyPicture");
            return (Criteria) this;
        }

        public Criteria andTsBeautyPictureNotIn(List<String> values) {
            addCriterion("ts_beauty_picture not in", values, "tsBeautyPicture");
            return (Criteria) this;
        }

        public Criteria andTsBeautyPictureBetween(String value1, String value2) {
            addCriterion("ts_beauty_picture between", value1, value2, "tsBeautyPicture");
            return (Criteria) this;
        }

        public Criteria andTsBeautyPictureNotBetween(String value1, String value2) {
            addCriterion("ts_beauty_picture not between", value1, value2, "tsBeautyPicture");
            return (Criteria) this;
        }

        public Criteria andTsBeautyNumberIsNull() {
            addCriterion("ts_beauty_number is null");
            return (Criteria) this;
        }

        public Criteria andTsBeautyNumberIsNotNull() {
            addCriterion("ts_beauty_number is not null");
            return (Criteria) this;
        }

        public Criteria andTsBeautyNumberEqualTo(Integer value) {
            addCriterion("ts_beauty_number =", value, "tsBeautyNumber");
            return (Criteria) this;
        }

        public Criteria andTsBeautyNumberNotEqualTo(Integer value) {
            addCriterion("ts_beauty_number <>", value, "tsBeautyNumber");
            return (Criteria) this;
        }

        public Criteria andTsBeautyNumberGreaterThan(Integer value) {
            addCriterion("ts_beauty_number >", value, "tsBeautyNumber");
            return (Criteria) this;
        }

        public Criteria andTsBeautyNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("ts_beauty_number >=", value, "tsBeautyNumber");
            return (Criteria) this;
        }

        public Criteria andTsBeautyNumberLessThan(Integer value) {
            addCriterion("ts_beauty_number <", value, "tsBeautyNumber");
            return (Criteria) this;
        }

        public Criteria andTsBeautyNumberLessThanOrEqualTo(Integer value) {
            addCriterion("ts_beauty_number <=", value, "tsBeautyNumber");
            return (Criteria) this;
        }

        public Criteria andTsBeautyNumberIn(List<Integer> values) {
            addCriterion("ts_beauty_number in", values, "tsBeautyNumber");
            return (Criteria) this;
        }

        public Criteria andTsBeautyNumberNotIn(List<Integer> values) {
            addCriterion("ts_beauty_number not in", values, "tsBeautyNumber");
            return (Criteria) this;
        }

        public Criteria andTsBeautyNumberBetween(Integer value1, Integer value2) {
            addCriterion("ts_beauty_number between", value1, value2, "tsBeautyNumber");
            return (Criteria) this;
        }

        public Criteria andTsBeautyNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("ts_beauty_number not between", value1, value2, "tsBeautyNumber");
            return (Criteria) this;
        }

        public Criteria andTsBeautyMoneyIsNull() {
            addCriterion("ts_beauty_money is null");
            return (Criteria) this;
        }

        public Criteria andTsBeautyMoneyIsNotNull() {
            addCriterion("ts_beauty_money is not null");
            return (Criteria) this;
        }

        public Criteria andTsBeautyMoneyEqualTo(Double value) {
            addCriterion("ts_beauty_money =", value, "tsBeautyMoney");
            return (Criteria) this;
        }

        public Criteria andTsBeautyMoneyNotEqualTo(Double value) {
            addCriterion("ts_beauty_money <>", value, "tsBeautyMoney");
            return (Criteria) this;
        }

        public Criteria andTsBeautyMoneyGreaterThan(Double value) {
            addCriterion("ts_beauty_money >", value, "tsBeautyMoney");
            return (Criteria) this;
        }

        public Criteria andTsBeautyMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("ts_beauty_money >=", value, "tsBeautyMoney");
            return (Criteria) this;
        }

        public Criteria andTsBeautyMoneyLessThan(Double value) {
            addCriterion("ts_beauty_money <", value, "tsBeautyMoney");
            return (Criteria) this;
        }

        public Criteria andTsBeautyMoneyLessThanOrEqualTo(Double value) {
            addCriterion("ts_beauty_money <=", value, "tsBeautyMoney");
            return (Criteria) this;
        }

        public Criteria andTsBeautyMoneyIn(List<Double> values) {
            addCriterion("ts_beauty_money in", values, "tsBeautyMoney");
            return (Criteria) this;
        }

        public Criteria andTsBeautyMoneyNotIn(List<Double> values) {
            addCriterion("ts_beauty_money not in", values, "tsBeautyMoney");
            return (Criteria) this;
        }

        public Criteria andTsBeautyMoneyBetween(Double value1, Double value2) {
            addCriterion("ts_beauty_money between", value1, value2, "tsBeautyMoney");
            return (Criteria) this;
        }

        public Criteria andTsBeautyMoneyNotBetween(Double value1, Double value2) {
            addCriterion("ts_beauty_money not between", value1, value2, "tsBeautyMoney");
            return (Criteria) this;
        }

        public Criteria andTsBeautyIntroduceIsNull() {
            addCriterion("ts_beauty_introduce is null");
            return (Criteria) this;
        }

        public Criteria andTsBeautyIntroduceIsNotNull() {
            addCriterion("ts_beauty_introduce is not null");
            return (Criteria) this;
        }

        public Criteria andTsBeautyIntroduceEqualTo(String value) {
            addCriterion("ts_beauty_introduce =", value, "tsBeautyIntroduce");
            return (Criteria) this;
        }

        public Criteria andTsBeautyIntroduceNotEqualTo(String value) {
            addCriterion("ts_beauty_introduce <>", value, "tsBeautyIntroduce");
            return (Criteria) this;
        }

        public Criteria andTsBeautyIntroduceGreaterThan(String value) {
            addCriterion("ts_beauty_introduce >", value, "tsBeautyIntroduce");
            return (Criteria) this;
        }

        public Criteria andTsBeautyIntroduceGreaterThanOrEqualTo(String value) {
            addCriterion("ts_beauty_introduce >=", value, "tsBeautyIntroduce");
            return (Criteria) this;
        }

        public Criteria andTsBeautyIntroduceLessThan(String value) {
            addCriterion("ts_beauty_introduce <", value, "tsBeautyIntroduce");
            return (Criteria) this;
        }

        public Criteria andTsBeautyIntroduceLessThanOrEqualTo(String value) {
            addCriterion("ts_beauty_introduce <=", value, "tsBeautyIntroduce");
            return (Criteria) this;
        }

        public Criteria andTsBeautyIntroduceLike(String value) {
            addCriterion("ts_beauty_introduce like", value, "tsBeautyIntroduce");
            return (Criteria) this;
        }

        public Criteria andTsBeautyIntroduceNotLike(String value) {
            addCriterion("ts_beauty_introduce not like", value, "tsBeautyIntroduce");
            return (Criteria) this;
        }

        public Criteria andTsBeautyIntroduceIn(List<String> values) {
            addCriterion("ts_beauty_introduce in", values, "tsBeautyIntroduce");
            return (Criteria) this;
        }

        public Criteria andTsBeautyIntroduceNotIn(List<String> values) {
            addCriterion("ts_beauty_introduce not in", values, "tsBeautyIntroduce");
            return (Criteria) this;
        }

        public Criteria andTsBeautyIntroduceBetween(String value1, String value2) {
            addCriterion("ts_beauty_introduce between", value1, value2, "tsBeautyIntroduce");
            return (Criteria) this;
        }

        public Criteria andTsBeautyIntroduceNotBetween(String value1, String value2) {
            addCriterion("ts_beauty_introduce not between", value1, value2, "tsBeautyIntroduce");
            return (Criteria) this;
        }

        public Criteria andTsBeautyStateIsNull() {
            addCriterion("ts_beauty_state is null");
            return (Criteria) this;
        }

        public Criteria andTsBeautyStateIsNotNull() {
            addCriterion("ts_beauty_state is not null");
            return (Criteria) this;
        }

        public Criteria andTsBeautyStateEqualTo(String value) {
            addCriterion("ts_beauty_state =", value, "tsBeautyState");
            return (Criteria) this;
        }

        public Criteria andTsBeautyStateNotEqualTo(String value) {
            addCriterion("ts_beauty_state <>", value, "tsBeautyState");
            return (Criteria) this;
        }

        public Criteria andTsBeautyStateGreaterThan(String value) {
            addCriterion("ts_beauty_state >", value, "tsBeautyState");
            return (Criteria) this;
        }

        public Criteria andTsBeautyStateGreaterThanOrEqualTo(String value) {
            addCriterion("ts_beauty_state >=", value, "tsBeautyState");
            return (Criteria) this;
        }

        public Criteria andTsBeautyStateLessThan(String value) {
            addCriterion("ts_beauty_state <", value, "tsBeautyState");
            return (Criteria) this;
        }

        public Criteria andTsBeautyStateLessThanOrEqualTo(String value) {
            addCriterion("ts_beauty_state <=", value, "tsBeautyState");
            return (Criteria) this;
        }

        public Criteria andTsBeautyStateLike(String value) {
            addCriterion("ts_beauty_state like", value, "tsBeautyState");
            return (Criteria) this;
        }

        public Criteria andTsBeautyStateNotLike(String value) {
            addCriterion("ts_beauty_state not like", value, "tsBeautyState");
            return (Criteria) this;
        }

        public Criteria andTsBeautyStateIn(List<String> values) {
            addCriterion("ts_beauty_state in", values, "tsBeautyState");
            return (Criteria) this;
        }

        public Criteria andTsBeautyStateNotIn(List<String> values) {
            addCriterion("ts_beauty_state not in", values, "tsBeautyState");
            return (Criteria) this;
        }

        public Criteria andTsBeautyStateBetween(String value1, String value2) {
            addCriterion("ts_beauty_state between", value1, value2, "tsBeautyState");
            return (Criteria) this;
        }

        public Criteria andTsBeautyStateNotBetween(String value1, String value2) {
            addCriterion("ts_beauty_state not between", value1, value2, "tsBeautyState");
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