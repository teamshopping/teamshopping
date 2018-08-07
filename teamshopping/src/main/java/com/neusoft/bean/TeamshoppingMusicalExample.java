package com.neusoft.bean;

import java.util.ArrayList;
import java.util.List;

public class TeamshoppingMusicalExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TeamshoppingMusicalExample() {
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

        public Criteria andTsMusicalIdIsNull() {
            addCriterion("ts_musical_id is null");
            return (Criteria) this;
        }

        public Criteria andTsMusicalIdIsNotNull() {
            addCriterion("ts_musical_id is not null");
            return (Criteria) this;
        }

        public Criteria andTsMusicalIdEqualTo(Integer value) {
            addCriterion("ts_musical_id =", value, "tsMusicalId");
            return (Criteria) this;
        }

        public Criteria andTsMusicalIdNotEqualTo(Integer value) {
            addCriterion("ts_musical_id <>", value, "tsMusicalId");
            return (Criteria) this;
        }

        public Criteria andTsMusicalIdGreaterThan(Integer value) {
            addCriterion("ts_musical_id >", value, "tsMusicalId");
            return (Criteria) this;
        }

        public Criteria andTsMusicalIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ts_musical_id >=", value, "tsMusicalId");
            return (Criteria) this;
        }

        public Criteria andTsMusicalIdLessThan(Integer value) {
            addCriterion("ts_musical_id <", value, "tsMusicalId");
            return (Criteria) this;
        }

        public Criteria andTsMusicalIdLessThanOrEqualTo(Integer value) {
            addCriterion("ts_musical_id <=", value, "tsMusicalId");
            return (Criteria) this;
        }

        public Criteria andTsMusicalIdIn(List<Integer> values) {
            addCriterion("ts_musical_id in", values, "tsMusicalId");
            return (Criteria) this;
        }

        public Criteria andTsMusicalIdNotIn(List<Integer> values) {
            addCriterion("ts_musical_id not in", values, "tsMusicalId");
            return (Criteria) this;
        }

        public Criteria andTsMusicalIdBetween(Integer value1, Integer value2) {
            addCriterion("ts_musical_id between", value1, value2, "tsMusicalId");
            return (Criteria) this;
        }

        public Criteria andTsMusicalIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ts_musical_id not between", value1, value2, "tsMusicalId");
            return (Criteria) this;
        }

        public Criteria andTsMusicalNameIsNull() {
            addCriterion("ts_musical_name is null");
            return (Criteria) this;
        }

        public Criteria andTsMusicalNameIsNotNull() {
            addCriterion("ts_musical_name is not null");
            return (Criteria) this;
        }

        public Criteria andTsMusicalNameEqualTo(String value) {
            addCriterion("ts_musical_name =", value, "tsMusicalName");
            return (Criteria) this;
        }

        public Criteria andTsMusicalNameNotEqualTo(String value) {
            addCriterion("ts_musical_name <>", value, "tsMusicalName");
            return (Criteria) this;
        }

        public Criteria andTsMusicalNameGreaterThan(String value) {
            addCriterion("ts_musical_name >", value, "tsMusicalName");
            return (Criteria) this;
        }

        public Criteria andTsMusicalNameGreaterThanOrEqualTo(String value) {
            addCriterion("ts_musical_name >=", value, "tsMusicalName");
            return (Criteria) this;
        }

        public Criteria andTsMusicalNameLessThan(String value) {
            addCriterion("ts_musical_name <", value, "tsMusicalName");
            return (Criteria) this;
        }

        public Criteria andTsMusicalNameLessThanOrEqualTo(String value) {
            addCriterion("ts_musical_name <=", value, "tsMusicalName");
            return (Criteria) this;
        }

        public Criteria andTsMusicalNameLike(String value) {
            addCriterion("ts_musical_name like", value, "tsMusicalName");
            return (Criteria) this;
        }

        public Criteria andTsMusicalNameNotLike(String value) {
            addCriterion("ts_musical_name not like", value, "tsMusicalName");
            return (Criteria) this;
        }

        public Criteria andTsMusicalNameIn(List<String> values) {
            addCriterion("ts_musical_name in", values, "tsMusicalName");
            return (Criteria) this;
        }

        public Criteria andTsMusicalNameNotIn(List<String> values) {
            addCriterion("ts_musical_name not in", values, "tsMusicalName");
            return (Criteria) this;
        }

        public Criteria andTsMusicalNameBetween(String value1, String value2) {
            addCriterion("ts_musical_name between", value1, value2, "tsMusicalName");
            return (Criteria) this;
        }

        public Criteria andTsMusicalNameNotBetween(String value1, String value2) {
            addCriterion("ts_musical_name not between", value1, value2, "tsMusicalName");
            return (Criteria) this;
        }

        public Criteria andTsMusicalTypeIsNull() {
            addCriterion("ts_musical_type is null");
            return (Criteria) this;
        }

        public Criteria andTsMusicalTypeIsNotNull() {
            addCriterion("ts_musical_type is not null");
            return (Criteria) this;
        }

        public Criteria andTsMusicalTypeEqualTo(String value) {
            addCriterion("ts_musical_type =", value, "tsMusicalType");
            return (Criteria) this;
        }

        public Criteria andTsMusicalTypeNotEqualTo(String value) {
            addCriterion("ts_musical_type <>", value, "tsMusicalType");
            return (Criteria) this;
        }

        public Criteria andTsMusicalTypeGreaterThan(String value) {
            addCriterion("ts_musical_type >", value, "tsMusicalType");
            return (Criteria) this;
        }

        public Criteria andTsMusicalTypeGreaterThanOrEqualTo(String value) {
            addCriterion("ts_musical_type >=", value, "tsMusicalType");
            return (Criteria) this;
        }

        public Criteria andTsMusicalTypeLessThan(String value) {
            addCriterion("ts_musical_type <", value, "tsMusicalType");
            return (Criteria) this;
        }

        public Criteria andTsMusicalTypeLessThanOrEqualTo(String value) {
            addCriterion("ts_musical_type <=", value, "tsMusicalType");
            return (Criteria) this;
        }

        public Criteria andTsMusicalTypeLike(String value) {
            addCriterion("ts_musical_type like", value, "tsMusicalType");
            return (Criteria) this;
        }

        public Criteria andTsMusicalTypeNotLike(String value) {
            addCriterion("ts_musical_type not like", value, "tsMusicalType");
            return (Criteria) this;
        }

        public Criteria andTsMusicalTypeIn(List<String> values) {
            addCriterion("ts_musical_type in", values, "tsMusicalType");
            return (Criteria) this;
        }

        public Criteria andTsMusicalTypeNotIn(List<String> values) {
            addCriterion("ts_musical_type not in", values, "tsMusicalType");
            return (Criteria) this;
        }

        public Criteria andTsMusicalTypeBetween(String value1, String value2) {
            addCriterion("ts_musical_type between", value1, value2, "tsMusicalType");
            return (Criteria) this;
        }

        public Criteria andTsMusicalTypeNotBetween(String value1, String value2) {
            addCriterion("ts_musical_type not between", value1, value2, "tsMusicalType");
            return (Criteria) this;
        }

        public Criteria andTsMusicalFunctionIsNull() {
            addCriterion("ts_musical_function is null");
            return (Criteria) this;
        }

        public Criteria andTsMusicalFunctionIsNotNull() {
            addCriterion("ts_musical_function is not null");
            return (Criteria) this;
        }

        public Criteria andTsMusicalFunctionEqualTo(String value) {
            addCriterion("ts_musical_function =", value, "tsMusicalFunction");
            return (Criteria) this;
        }

        public Criteria andTsMusicalFunctionNotEqualTo(String value) {
            addCriterion("ts_musical_function <>", value, "tsMusicalFunction");
            return (Criteria) this;
        }

        public Criteria andTsMusicalFunctionGreaterThan(String value) {
            addCriterion("ts_musical_function >", value, "tsMusicalFunction");
            return (Criteria) this;
        }

        public Criteria andTsMusicalFunctionGreaterThanOrEqualTo(String value) {
            addCriterion("ts_musical_function >=", value, "tsMusicalFunction");
            return (Criteria) this;
        }

        public Criteria andTsMusicalFunctionLessThan(String value) {
            addCriterion("ts_musical_function <", value, "tsMusicalFunction");
            return (Criteria) this;
        }

        public Criteria andTsMusicalFunctionLessThanOrEqualTo(String value) {
            addCriterion("ts_musical_function <=", value, "tsMusicalFunction");
            return (Criteria) this;
        }

        public Criteria andTsMusicalFunctionLike(String value) {
            addCriterion("ts_musical_function like", value, "tsMusicalFunction");
            return (Criteria) this;
        }

        public Criteria andTsMusicalFunctionNotLike(String value) {
            addCriterion("ts_musical_function not like", value, "tsMusicalFunction");
            return (Criteria) this;
        }

        public Criteria andTsMusicalFunctionIn(List<String> values) {
            addCriterion("ts_musical_function in", values, "tsMusicalFunction");
            return (Criteria) this;
        }

        public Criteria andTsMusicalFunctionNotIn(List<String> values) {
            addCriterion("ts_musical_function not in", values, "tsMusicalFunction");
            return (Criteria) this;
        }

        public Criteria andTsMusicalFunctionBetween(String value1, String value2) {
            addCriterion("ts_musical_function between", value1, value2, "tsMusicalFunction");
            return (Criteria) this;
        }

        public Criteria andTsMusicalFunctionNotBetween(String value1, String value2) {
            addCriterion("ts_musical_function not between", value1, value2, "tsMusicalFunction");
            return (Criteria) this;
        }

        public Criteria andTsMusicalMaterialIsNull() {
            addCriterion("ts_musical_material is null");
            return (Criteria) this;
        }

        public Criteria andTsMusicalMaterialIsNotNull() {
            addCriterion("ts_musical_material is not null");
            return (Criteria) this;
        }

        public Criteria andTsMusicalMaterialEqualTo(String value) {
            addCriterion("ts_musical_material =", value, "tsMusicalMaterial");
            return (Criteria) this;
        }

        public Criteria andTsMusicalMaterialNotEqualTo(String value) {
            addCriterion("ts_musical_material <>", value, "tsMusicalMaterial");
            return (Criteria) this;
        }

        public Criteria andTsMusicalMaterialGreaterThan(String value) {
            addCriterion("ts_musical_material >", value, "tsMusicalMaterial");
            return (Criteria) this;
        }

        public Criteria andTsMusicalMaterialGreaterThanOrEqualTo(String value) {
            addCriterion("ts_musical_material >=", value, "tsMusicalMaterial");
            return (Criteria) this;
        }

        public Criteria andTsMusicalMaterialLessThan(String value) {
            addCriterion("ts_musical_material <", value, "tsMusicalMaterial");
            return (Criteria) this;
        }

        public Criteria andTsMusicalMaterialLessThanOrEqualTo(String value) {
            addCriterion("ts_musical_material <=", value, "tsMusicalMaterial");
            return (Criteria) this;
        }

        public Criteria andTsMusicalMaterialLike(String value) {
            addCriterion("ts_musical_material like", value, "tsMusicalMaterial");
            return (Criteria) this;
        }

        public Criteria andTsMusicalMaterialNotLike(String value) {
            addCriterion("ts_musical_material not like", value, "tsMusicalMaterial");
            return (Criteria) this;
        }

        public Criteria andTsMusicalMaterialIn(List<String> values) {
            addCriterion("ts_musical_material in", values, "tsMusicalMaterial");
            return (Criteria) this;
        }

        public Criteria andTsMusicalMaterialNotIn(List<String> values) {
            addCriterion("ts_musical_material not in", values, "tsMusicalMaterial");
            return (Criteria) this;
        }

        public Criteria andTsMusicalMaterialBetween(String value1, String value2) {
            addCriterion("ts_musical_material between", value1, value2, "tsMusicalMaterial");
            return (Criteria) this;
        }

        public Criteria andTsMusicalMaterialNotBetween(String value1, String value2) {
            addCriterion("ts_musical_material not between", value1, value2, "tsMusicalMaterial");
            return (Criteria) this;
        }

        public Criteria andTsMusicalColorIsNull() {
            addCriterion("ts_musical_color is null");
            return (Criteria) this;
        }

        public Criteria andTsMusicalColorIsNotNull() {
            addCriterion("ts_musical_color is not null");
            return (Criteria) this;
        }

        public Criteria andTsMusicalColorEqualTo(String value) {
            addCriterion("ts_musical_color =", value, "tsMusicalColor");
            return (Criteria) this;
        }

        public Criteria andTsMusicalColorNotEqualTo(String value) {
            addCriterion("ts_musical_color <>", value, "tsMusicalColor");
            return (Criteria) this;
        }

        public Criteria andTsMusicalColorGreaterThan(String value) {
            addCriterion("ts_musical_color >", value, "tsMusicalColor");
            return (Criteria) this;
        }

        public Criteria andTsMusicalColorGreaterThanOrEqualTo(String value) {
            addCriterion("ts_musical_color >=", value, "tsMusicalColor");
            return (Criteria) this;
        }

        public Criteria andTsMusicalColorLessThan(String value) {
            addCriterion("ts_musical_color <", value, "tsMusicalColor");
            return (Criteria) this;
        }

        public Criteria andTsMusicalColorLessThanOrEqualTo(String value) {
            addCriterion("ts_musical_color <=", value, "tsMusicalColor");
            return (Criteria) this;
        }

        public Criteria andTsMusicalColorLike(String value) {
            addCriterion("ts_musical_color like", value, "tsMusicalColor");
            return (Criteria) this;
        }

        public Criteria andTsMusicalColorNotLike(String value) {
            addCriterion("ts_musical_color not like", value, "tsMusicalColor");
            return (Criteria) this;
        }

        public Criteria andTsMusicalColorIn(List<String> values) {
            addCriterion("ts_musical_color in", values, "tsMusicalColor");
            return (Criteria) this;
        }

        public Criteria andTsMusicalColorNotIn(List<String> values) {
            addCriterion("ts_musical_color not in", values, "tsMusicalColor");
            return (Criteria) this;
        }

        public Criteria andTsMusicalColorBetween(String value1, String value2) {
            addCriterion("ts_musical_color between", value1, value2, "tsMusicalColor");
            return (Criteria) this;
        }

        public Criteria andTsMusicalColorNotBetween(String value1, String value2) {
            addCriterion("ts_musical_color not between", value1, value2, "tsMusicalColor");
            return (Criteria) this;
        }

        public Criteria andTsMusicalStyleIsNull() {
            addCriterion("ts_musical_style is null");
            return (Criteria) this;
        }

        public Criteria andTsMusicalStyleIsNotNull() {
            addCriterion("ts_musical_style is not null");
            return (Criteria) this;
        }

        public Criteria andTsMusicalStyleEqualTo(String value) {
            addCriterion("ts_musical_style =", value, "tsMusicalStyle");
            return (Criteria) this;
        }

        public Criteria andTsMusicalStyleNotEqualTo(String value) {
            addCriterion("ts_musical_style <>", value, "tsMusicalStyle");
            return (Criteria) this;
        }

        public Criteria andTsMusicalStyleGreaterThan(String value) {
            addCriterion("ts_musical_style >", value, "tsMusicalStyle");
            return (Criteria) this;
        }

        public Criteria andTsMusicalStyleGreaterThanOrEqualTo(String value) {
            addCriterion("ts_musical_style >=", value, "tsMusicalStyle");
            return (Criteria) this;
        }

        public Criteria andTsMusicalStyleLessThan(String value) {
            addCriterion("ts_musical_style <", value, "tsMusicalStyle");
            return (Criteria) this;
        }

        public Criteria andTsMusicalStyleLessThanOrEqualTo(String value) {
            addCriterion("ts_musical_style <=", value, "tsMusicalStyle");
            return (Criteria) this;
        }

        public Criteria andTsMusicalStyleLike(String value) {
            addCriterion("ts_musical_style like", value, "tsMusicalStyle");
            return (Criteria) this;
        }

        public Criteria andTsMusicalStyleNotLike(String value) {
            addCriterion("ts_musical_style not like", value, "tsMusicalStyle");
            return (Criteria) this;
        }

        public Criteria andTsMusicalStyleIn(List<String> values) {
            addCriterion("ts_musical_style in", values, "tsMusicalStyle");
            return (Criteria) this;
        }

        public Criteria andTsMusicalStyleNotIn(List<String> values) {
            addCriterion("ts_musical_style not in", values, "tsMusicalStyle");
            return (Criteria) this;
        }

        public Criteria andTsMusicalStyleBetween(String value1, String value2) {
            addCriterion("ts_musical_style between", value1, value2, "tsMusicalStyle");
            return (Criteria) this;
        }

        public Criteria andTsMusicalStyleNotBetween(String value1, String value2) {
            addCriterion("ts_musical_style not between", value1, value2, "tsMusicalStyle");
            return (Criteria) this;
        }

        public Criteria andTsMusicalPictureIsNull() {
            addCriterion("ts_musical_picture is null");
            return (Criteria) this;
        }

        public Criteria andTsMusicalPictureIsNotNull() {
            addCriterion("ts_musical_picture is not null");
            return (Criteria) this;
        }

        public Criteria andTsMusicalPictureEqualTo(String value) {
            addCriterion("ts_musical_picture =", value, "tsMusicalPicture");
            return (Criteria) this;
        }

        public Criteria andTsMusicalPictureNotEqualTo(String value) {
            addCriterion("ts_musical_picture <>", value, "tsMusicalPicture");
            return (Criteria) this;
        }

        public Criteria andTsMusicalPictureGreaterThan(String value) {
            addCriterion("ts_musical_picture >", value, "tsMusicalPicture");
            return (Criteria) this;
        }

        public Criteria andTsMusicalPictureGreaterThanOrEqualTo(String value) {
            addCriterion("ts_musical_picture >=", value, "tsMusicalPicture");
            return (Criteria) this;
        }

        public Criteria andTsMusicalPictureLessThan(String value) {
            addCriterion("ts_musical_picture <", value, "tsMusicalPicture");
            return (Criteria) this;
        }

        public Criteria andTsMusicalPictureLessThanOrEqualTo(String value) {
            addCriterion("ts_musical_picture <=", value, "tsMusicalPicture");
            return (Criteria) this;
        }

        public Criteria andTsMusicalPictureLike(String value) {
            addCriterion("ts_musical_picture like", value, "tsMusicalPicture");
            return (Criteria) this;
        }

        public Criteria andTsMusicalPictureNotLike(String value) {
            addCriterion("ts_musical_picture not like", value, "tsMusicalPicture");
            return (Criteria) this;
        }

        public Criteria andTsMusicalPictureIn(List<String> values) {
            addCriterion("ts_musical_picture in", values, "tsMusicalPicture");
            return (Criteria) this;
        }

        public Criteria andTsMusicalPictureNotIn(List<String> values) {
            addCriterion("ts_musical_picture not in", values, "tsMusicalPicture");
            return (Criteria) this;
        }

        public Criteria andTsMusicalPictureBetween(String value1, String value2) {
            addCriterion("ts_musical_picture between", value1, value2, "tsMusicalPicture");
            return (Criteria) this;
        }

        public Criteria andTsMusicalPictureNotBetween(String value1, String value2) {
            addCriterion("ts_musical_picture not between", value1, value2, "tsMusicalPicture");
            return (Criteria) this;
        }

        public Criteria andTsMusicalNumberIsNull() {
            addCriterion("ts_musical_number is null");
            return (Criteria) this;
        }

        public Criteria andTsMusicalNumberIsNotNull() {
            addCriterion("ts_musical_number is not null");
            return (Criteria) this;
        }

        public Criteria andTsMusicalNumberEqualTo(Integer value) {
            addCriterion("ts_musical_number =", value, "tsMusicalNumber");
            return (Criteria) this;
        }

        public Criteria andTsMusicalNumberNotEqualTo(Integer value) {
            addCriterion("ts_musical_number <>", value, "tsMusicalNumber");
            return (Criteria) this;
        }

        public Criteria andTsMusicalNumberGreaterThan(Integer value) {
            addCriterion("ts_musical_number >", value, "tsMusicalNumber");
            return (Criteria) this;
        }

        public Criteria andTsMusicalNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("ts_musical_number >=", value, "tsMusicalNumber");
            return (Criteria) this;
        }

        public Criteria andTsMusicalNumberLessThan(Integer value) {
            addCriterion("ts_musical_number <", value, "tsMusicalNumber");
            return (Criteria) this;
        }

        public Criteria andTsMusicalNumberLessThanOrEqualTo(Integer value) {
            addCriterion("ts_musical_number <=", value, "tsMusicalNumber");
            return (Criteria) this;
        }

        public Criteria andTsMusicalNumberIn(List<Integer> values) {
            addCriterion("ts_musical_number in", values, "tsMusicalNumber");
            return (Criteria) this;
        }

        public Criteria andTsMusicalNumberNotIn(List<Integer> values) {
            addCriterion("ts_musical_number not in", values, "tsMusicalNumber");
            return (Criteria) this;
        }

        public Criteria andTsMusicalNumberBetween(Integer value1, Integer value2) {
            addCriterion("ts_musical_number between", value1, value2, "tsMusicalNumber");
            return (Criteria) this;
        }

        public Criteria andTsMusicalNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("ts_musical_number not between", value1, value2, "tsMusicalNumber");
            return (Criteria) this;
        }

        public Criteria andTsMusicalMoneyIsNull() {
            addCriterion("ts_musical_money is null");
            return (Criteria) this;
        }

        public Criteria andTsMusicalMoneyIsNotNull() {
            addCriterion("ts_musical_money is not null");
            return (Criteria) this;
        }

        public Criteria andTsMusicalMoneyEqualTo(Double value) {
            addCriterion("ts_musical_money =", value, "tsMusicalMoney");
            return (Criteria) this;
        }

        public Criteria andTsMusicalMoneyNotEqualTo(Double value) {
            addCriterion("ts_musical_money <>", value, "tsMusicalMoney");
            return (Criteria) this;
        }

        public Criteria andTsMusicalMoneyGreaterThan(Double value) {
            addCriterion("ts_musical_money >", value, "tsMusicalMoney");
            return (Criteria) this;
        }

        public Criteria andTsMusicalMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("ts_musical_money >=", value, "tsMusicalMoney");
            return (Criteria) this;
        }

        public Criteria andTsMusicalMoneyLessThan(Double value) {
            addCriterion("ts_musical_money <", value, "tsMusicalMoney");
            return (Criteria) this;
        }

        public Criteria andTsMusicalMoneyLessThanOrEqualTo(Double value) {
            addCriterion("ts_musical_money <=", value, "tsMusicalMoney");
            return (Criteria) this;
        }

        public Criteria andTsMusicalMoneyIn(List<Double> values) {
            addCriterion("ts_musical_money in", values, "tsMusicalMoney");
            return (Criteria) this;
        }

        public Criteria andTsMusicalMoneyNotIn(List<Double> values) {
            addCriterion("ts_musical_money not in", values, "tsMusicalMoney");
            return (Criteria) this;
        }

        public Criteria andTsMusicalMoneyBetween(Double value1, Double value2) {
            addCriterion("ts_musical_money between", value1, value2, "tsMusicalMoney");
            return (Criteria) this;
        }

        public Criteria andTsMusicalMoneyNotBetween(Double value1, Double value2) {
            addCriterion("ts_musical_money not between", value1, value2, "tsMusicalMoney");
            return (Criteria) this;
        }

        public Criteria andTsMusicalIntroduceIsNull() {
            addCriterion("ts_musical_introduce is null");
            return (Criteria) this;
        }

        public Criteria andTsMusicalIntroduceIsNotNull() {
            addCriterion("ts_musical_introduce is not null");
            return (Criteria) this;
        }

        public Criteria andTsMusicalIntroduceEqualTo(String value) {
            addCriterion("ts_musical_introduce =", value, "tsMusicalIntroduce");
            return (Criteria) this;
        }

        public Criteria andTsMusicalIntroduceNotEqualTo(String value) {
            addCriterion("ts_musical_introduce <>", value, "tsMusicalIntroduce");
            return (Criteria) this;
        }

        public Criteria andTsMusicalIntroduceGreaterThan(String value) {
            addCriterion("ts_musical_introduce >", value, "tsMusicalIntroduce");
            return (Criteria) this;
        }

        public Criteria andTsMusicalIntroduceGreaterThanOrEqualTo(String value) {
            addCriterion("ts_musical_introduce >=", value, "tsMusicalIntroduce");
            return (Criteria) this;
        }

        public Criteria andTsMusicalIntroduceLessThan(String value) {
            addCriterion("ts_musical_introduce <", value, "tsMusicalIntroduce");
            return (Criteria) this;
        }

        public Criteria andTsMusicalIntroduceLessThanOrEqualTo(String value) {
            addCriterion("ts_musical_introduce <=", value, "tsMusicalIntroduce");
            return (Criteria) this;
        }

        public Criteria andTsMusicalIntroduceLike(String value) {
            addCriterion("ts_musical_introduce like", value, "tsMusicalIntroduce");
            return (Criteria) this;
        }

        public Criteria andTsMusicalIntroduceNotLike(String value) {
            addCriterion("ts_musical_introduce not like", value, "tsMusicalIntroduce");
            return (Criteria) this;
        }

        public Criteria andTsMusicalIntroduceIn(List<String> values) {
            addCriterion("ts_musical_introduce in", values, "tsMusicalIntroduce");
            return (Criteria) this;
        }

        public Criteria andTsMusicalIntroduceNotIn(List<String> values) {
            addCriterion("ts_musical_introduce not in", values, "tsMusicalIntroduce");
            return (Criteria) this;
        }

        public Criteria andTsMusicalIntroduceBetween(String value1, String value2) {
            addCriterion("ts_musical_introduce between", value1, value2, "tsMusicalIntroduce");
            return (Criteria) this;
        }

        public Criteria andTsMusicalIntroduceNotBetween(String value1, String value2) {
            addCriterion("ts_musical_introduce not between", value1, value2, "tsMusicalIntroduce");
            return (Criteria) this;
        }

        public Criteria andTsMusicalStateIsNull() {
            addCriterion("ts_musical_state is null");
            return (Criteria) this;
        }

        public Criteria andTsMusicalStateIsNotNull() {
            addCriterion("ts_musical_state is not null");
            return (Criteria) this;
        }

        public Criteria andTsMusicalStateEqualTo(String value) {
            addCriterion("ts_musical_state =", value, "tsMusicalState");
            return (Criteria) this;
        }

        public Criteria andTsMusicalStateNotEqualTo(String value) {
            addCriterion("ts_musical_state <>", value, "tsMusicalState");
            return (Criteria) this;
        }

        public Criteria andTsMusicalStateGreaterThan(String value) {
            addCriterion("ts_musical_state >", value, "tsMusicalState");
            return (Criteria) this;
        }

        public Criteria andTsMusicalStateGreaterThanOrEqualTo(String value) {
            addCriterion("ts_musical_state >=", value, "tsMusicalState");
            return (Criteria) this;
        }

        public Criteria andTsMusicalStateLessThan(String value) {
            addCriterion("ts_musical_state <", value, "tsMusicalState");
            return (Criteria) this;
        }

        public Criteria andTsMusicalStateLessThanOrEqualTo(String value) {
            addCriterion("ts_musical_state <=", value, "tsMusicalState");
            return (Criteria) this;
        }

        public Criteria andTsMusicalStateLike(String value) {
            addCriterion("ts_musical_state like", value, "tsMusicalState");
            return (Criteria) this;
        }

        public Criteria andTsMusicalStateNotLike(String value) {
            addCriterion("ts_musical_state not like", value, "tsMusicalState");
            return (Criteria) this;
        }

        public Criteria andTsMusicalStateIn(List<String> values) {
            addCriterion("ts_musical_state in", values, "tsMusicalState");
            return (Criteria) this;
        }

        public Criteria andTsMusicalStateNotIn(List<String> values) {
            addCriterion("ts_musical_state not in", values, "tsMusicalState");
            return (Criteria) this;
        }

        public Criteria andTsMusicalStateBetween(String value1, String value2) {
            addCriterion("ts_musical_state between", value1, value2, "tsMusicalState");
            return (Criteria) this;
        }

        public Criteria andTsMusicalStateNotBetween(String value1, String value2) {
            addCriterion("ts_musical_state not between", value1, value2, "tsMusicalState");
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