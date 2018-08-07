package com.neusoft.bean;

import java.util.ArrayList;
import java.util.List;

public class TeamshoppingCarExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TeamshoppingCarExample() {
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

        public Criteria andTsCarIdIsNull() {
            addCriterion("ts_car_id is null");
            return (Criteria) this;
        }

        public Criteria andTsCarIdIsNotNull() {
            addCriterion("ts_car_id is not null");
            return (Criteria) this;
        }

        public Criteria andTsCarIdEqualTo(Integer value) {
            addCriterion("ts_car_id =", value, "tsCarId");
            return (Criteria) this;
        }

        public Criteria andTsCarIdNotEqualTo(Integer value) {
            addCriterion("ts_car_id <>", value, "tsCarId");
            return (Criteria) this;
        }

        public Criteria andTsCarIdGreaterThan(Integer value) {
            addCriterion("ts_car_id >", value, "tsCarId");
            return (Criteria) this;
        }

        public Criteria andTsCarIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ts_car_id >=", value, "tsCarId");
            return (Criteria) this;
        }

        public Criteria andTsCarIdLessThan(Integer value) {
            addCriterion("ts_car_id <", value, "tsCarId");
            return (Criteria) this;
        }

        public Criteria andTsCarIdLessThanOrEqualTo(Integer value) {
            addCriterion("ts_car_id <=", value, "tsCarId");
            return (Criteria) this;
        }

        public Criteria andTsCarIdIn(List<Integer> values) {
            addCriterion("ts_car_id in", values, "tsCarId");
            return (Criteria) this;
        }

        public Criteria andTsCarIdNotIn(List<Integer> values) {
            addCriterion("ts_car_id not in", values, "tsCarId");
            return (Criteria) this;
        }

        public Criteria andTsCarIdBetween(Integer value1, Integer value2) {
            addCriterion("ts_car_id between", value1, value2, "tsCarId");
            return (Criteria) this;
        }

        public Criteria andTsCarIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ts_car_id not between", value1, value2, "tsCarId");
            return (Criteria) this;
        }

        public Criteria andTsCarBrandIsNull() {
            addCriterion("ts_car_brand is null");
            return (Criteria) this;
        }

        public Criteria andTsCarBrandIsNotNull() {
            addCriterion("ts_car_brand is not null");
            return (Criteria) this;
        }

        public Criteria andTsCarBrandEqualTo(String value) {
            addCriterion("ts_car_brand =", value, "tsCarBrand");
            return (Criteria) this;
        }

        public Criteria andTsCarBrandNotEqualTo(String value) {
            addCriterion("ts_car_brand <>", value, "tsCarBrand");
            return (Criteria) this;
        }

        public Criteria andTsCarBrandGreaterThan(String value) {
            addCriterion("ts_car_brand >", value, "tsCarBrand");
            return (Criteria) this;
        }

        public Criteria andTsCarBrandGreaterThanOrEqualTo(String value) {
            addCriterion("ts_car_brand >=", value, "tsCarBrand");
            return (Criteria) this;
        }

        public Criteria andTsCarBrandLessThan(String value) {
            addCriterion("ts_car_brand <", value, "tsCarBrand");
            return (Criteria) this;
        }

        public Criteria andTsCarBrandLessThanOrEqualTo(String value) {
            addCriterion("ts_car_brand <=", value, "tsCarBrand");
            return (Criteria) this;
        }

        public Criteria andTsCarBrandLike(String value) {
            addCriterion("ts_car_brand like", value, "tsCarBrand");
            return (Criteria) this;
        }

        public Criteria andTsCarBrandNotLike(String value) {
            addCriterion("ts_car_brand not like", value, "tsCarBrand");
            return (Criteria) this;
        }

        public Criteria andTsCarBrandIn(List<String> values) {
            addCriterion("ts_car_brand in", values, "tsCarBrand");
            return (Criteria) this;
        }

        public Criteria andTsCarBrandNotIn(List<String> values) {
            addCriterion("ts_car_brand not in", values, "tsCarBrand");
            return (Criteria) this;
        }

        public Criteria andTsCarBrandBetween(String value1, String value2) {
            addCriterion("ts_car_brand between", value1, value2, "tsCarBrand");
            return (Criteria) this;
        }

        public Criteria andTsCarBrandNotBetween(String value1, String value2) {
            addCriterion("ts_car_brand not between", value1, value2, "tsCarBrand");
            return (Criteria) this;
        }

        public Criteria andTsCarTypeIsNull() {
            addCriterion("ts_car_type is null");
            return (Criteria) this;
        }

        public Criteria andTsCarTypeIsNotNull() {
            addCriterion("ts_car_type is not null");
            return (Criteria) this;
        }

        public Criteria andTsCarTypeEqualTo(String value) {
            addCriterion("ts_car_type =", value, "tsCarType");
            return (Criteria) this;
        }

        public Criteria andTsCarTypeNotEqualTo(String value) {
            addCriterion("ts_car_type <>", value, "tsCarType");
            return (Criteria) this;
        }

        public Criteria andTsCarTypeGreaterThan(String value) {
            addCriterion("ts_car_type >", value, "tsCarType");
            return (Criteria) this;
        }

        public Criteria andTsCarTypeGreaterThanOrEqualTo(String value) {
            addCriterion("ts_car_type >=", value, "tsCarType");
            return (Criteria) this;
        }

        public Criteria andTsCarTypeLessThan(String value) {
            addCriterion("ts_car_type <", value, "tsCarType");
            return (Criteria) this;
        }

        public Criteria andTsCarTypeLessThanOrEqualTo(String value) {
            addCriterion("ts_car_type <=", value, "tsCarType");
            return (Criteria) this;
        }

        public Criteria andTsCarTypeLike(String value) {
            addCriterion("ts_car_type like", value, "tsCarType");
            return (Criteria) this;
        }

        public Criteria andTsCarTypeNotLike(String value) {
            addCriterion("ts_car_type not like", value, "tsCarType");
            return (Criteria) this;
        }

        public Criteria andTsCarTypeIn(List<String> values) {
            addCriterion("ts_car_type in", values, "tsCarType");
            return (Criteria) this;
        }

        public Criteria andTsCarTypeNotIn(List<String> values) {
            addCriterion("ts_car_type not in", values, "tsCarType");
            return (Criteria) this;
        }

        public Criteria andTsCarTypeBetween(String value1, String value2) {
            addCriterion("ts_car_type between", value1, value2, "tsCarType");
            return (Criteria) this;
        }

        public Criteria andTsCarTypeNotBetween(String value1, String value2) {
            addCriterion("ts_car_type not between", value1, value2, "tsCarType");
            return (Criteria) this;
        }

        public Criteria andTsCarEditionIsNull() {
            addCriterion("ts_car_edition is null");
            return (Criteria) this;
        }

        public Criteria andTsCarEditionIsNotNull() {
            addCriterion("ts_car_edition is not null");
            return (Criteria) this;
        }

        public Criteria andTsCarEditionEqualTo(String value) {
            addCriterion("ts_car_edition =", value, "tsCarEdition");
            return (Criteria) this;
        }

        public Criteria andTsCarEditionNotEqualTo(String value) {
            addCriterion("ts_car_edition <>", value, "tsCarEdition");
            return (Criteria) this;
        }

        public Criteria andTsCarEditionGreaterThan(String value) {
            addCriterion("ts_car_edition >", value, "tsCarEdition");
            return (Criteria) this;
        }

        public Criteria andTsCarEditionGreaterThanOrEqualTo(String value) {
            addCriterion("ts_car_edition >=", value, "tsCarEdition");
            return (Criteria) this;
        }

        public Criteria andTsCarEditionLessThan(String value) {
            addCriterion("ts_car_edition <", value, "tsCarEdition");
            return (Criteria) this;
        }

        public Criteria andTsCarEditionLessThanOrEqualTo(String value) {
            addCriterion("ts_car_edition <=", value, "tsCarEdition");
            return (Criteria) this;
        }

        public Criteria andTsCarEditionLike(String value) {
            addCriterion("ts_car_edition like", value, "tsCarEdition");
            return (Criteria) this;
        }

        public Criteria andTsCarEditionNotLike(String value) {
            addCriterion("ts_car_edition not like", value, "tsCarEdition");
            return (Criteria) this;
        }

        public Criteria andTsCarEditionIn(List<String> values) {
            addCriterion("ts_car_edition in", values, "tsCarEdition");
            return (Criteria) this;
        }

        public Criteria andTsCarEditionNotIn(List<String> values) {
            addCriterion("ts_car_edition not in", values, "tsCarEdition");
            return (Criteria) this;
        }

        public Criteria andTsCarEditionBetween(String value1, String value2) {
            addCriterion("ts_car_edition between", value1, value2, "tsCarEdition");
            return (Criteria) this;
        }

        public Criteria andTsCarEditionNotBetween(String value1, String value2) {
            addCriterion("ts_car_edition not between", value1, value2, "tsCarEdition");
            return (Criteria) this;
        }

        public Criteria andTsCarLevelIsNull() {
            addCriterion("ts_car_level is null");
            return (Criteria) this;
        }

        public Criteria andTsCarLevelIsNotNull() {
            addCriterion("ts_car_level is not null");
            return (Criteria) this;
        }

        public Criteria andTsCarLevelEqualTo(String value) {
            addCriterion("ts_car_level =", value, "tsCarLevel");
            return (Criteria) this;
        }

        public Criteria andTsCarLevelNotEqualTo(String value) {
            addCriterion("ts_car_level <>", value, "tsCarLevel");
            return (Criteria) this;
        }

        public Criteria andTsCarLevelGreaterThan(String value) {
            addCriterion("ts_car_level >", value, "tsCarLevel");
            return (Criteria) this;
        }

        public Criteria andTsCarLevelGreaterThanOrEqualTo(String value) {
            addCriterion("ts_car_level >=", value, "tsCarLevel");
            return (Criteria) this;
        }

        public Criteria andTsCarLevelLessThan(String value) {
            addCriterion("ts_car_level <", value, "tsCarLevel");
            return (Criteria) this;
        }

        public Criteria andTsCarLevelLessThanOrEqualTo(String value) {
            addCriterion("ts_car_level <=", value, "tsCarLevel");
            return (Criteria) this;
        }

        public Criteria andTsCarLevelLike(String value) {
            addCriterion("ts_car_level like", value, "tsCarLevel");
            return (Criteria) this;
        }

        public Criteria andTsCarLevelNotLike(String value) {
            addCriterion("ts_car_level not like", value, "tsCarLevel");
            return (Criteria) this;
        }

        public Criteria andTsCarLevelIn(List<String> values) {
            addCriterion("ts_car_level in", values, "tsCarLevel");
            return (Criteria) this;
        }

        public Criteria andTsCarLevelNotIn(List<String> values) {
            addCriterion("ts_car_level not in", values, "tsCarLevel");
            return (Criteria) this;
        }

        public Criteria andTsCarLevelBetween(String value1, String value2) {
            addCriterion("ts_car_level between", value1, value2, "tsCarLevel");
            return (Criteria) this;
        }

        public Criteria andTsCarLevelNotBetween(String value1, String value2) {
            addCriterion("ts_car_level not between", value1, value2, "tsCarLevel");
            return (Criteria) this;
        }

        public Criteria andTsCarColorIsNull() {
            addCriterion("ts_car_color is null");
            return (Criteria) this;
        }

        public Criteria andTsCarColorIsNotNull() {
            addCriterion("ts_car_color is not null");
            return (Criteria) this;
        }

        public Criteria andTsCarColorEqualTo(String value) {
            addCriterion("ts_car_color =", value, "tsCarColor");
            return (Criteria) this;
        }

        public Criteria andTsCarColorNotEqualTo(String value) {
            addCriterion("ts_car_color <>", value, "tsCarColor");
            return (Criteria) this;
        }

        public Criteria andTsCarColorGreaterThan(String value) {
            addCriterion("ts_car_color >", value, "tsCarColor");
            return (Criteria) this;
        }

        public Criteria andTsCarColorGreaterThanOrEqualTo(String value) {
            addCriterion("ts_car_color >=", value, "tsCarColor");
            return (Criteria) this;
        }

        public Criteria andTsCarColorLessThan(String value) {
            addCriterion("ts_car_color <", value, "tsCarColor");
            return (Criteria) this;
        }

        public Criteria andTsCarColorLessThanOrEqualTo(String value) {
            addCriterion("ts_car_color <=", value, "tsCarColor");
            return (Criteria) this;
        }

        public Criteria andTsCarColorLike(String value) {
            addCriterion("ts_car_color like", value, "tsCarColor");
            return (Criteria) this;
        }

        public Criteria andTsCarColorNotLike(String value) {
            addCriterion("ts_car_color not like", value, "tsCarColor");
            return (Criteria) this;
        }

        public Criteria andTsCarColorIn(List<String> values) {
            addCriterion("ts_car_color in", values, "tsCarColor");
            return (Criteria) this;
        }

        public Criteria andTsCarColorNotIn(List<String> values) {
            addCriterion("ts_car_color not in", values, "tsCarColor");
            return (Criteria) this;
        }

        public Criteria andTsCarColorBetween(String value1, String value2) {
            addCriterion("ts_car_color between", value1, value2, "tsCarColor");
            return (Criteria) this;
        }

        public Criteria andTsCarColorNotBetween(String value1, String value2) {
            addCriterion("ts_car_color not between", value1, value2, "tsCarColor");
            return (Criteria) this;
        }

        public Criteria andTsCarLandIsNull() {
            addCriterion("ts_car_land is null");
            return (Criteria) this;
        }

        public Criteria andTsCarLandIsNotNull() {
            addCriterion("ts_car_land is not null");
            return (Criteria) this;
        }

        public Criteria andTsCarLandEqualTo(String value) {
            addCriterion("ts_car_land =", value, "tsCarLand");
            return (Criteria) this;
        }

        public Criteria andTsCarLandNotEqualTo(String value) {
            addCriterion("ts_car_land <>", value, "tsCarLand");
            return (Criteria) this;
        }

        public Criteria andTsCarLandGreaterThan(String value) {
            addCriterion("ts_car_land >", value, "tsCarLand");
            return (Criteria) this;
        }

        public Criteria andTsCarLandGreaterThanOrEqualTo(String value) {
            addCriterion("ts_car_land >=", value, "tsCarLand");
            return (Criteria) this;
        }

        public Criteria andTsCarLandLessThan(String value) {
            addCriterion("ts_car_land <", value, "tsCarLand");
            return (Criteria) this;
        }

        public Criteria andTsCarLandLessThanOrEqualTo(String value) {
            addCriterion("ts_car_land <=", value, "tsCarLand");
            return (Criteria) this;
        }

        public Criteria andTsCarLandLike(String value) {
            addCriterion("ts_car_land like", value, "tsCarLand");
            return (Criteria) this;
        }

        public Criteria andTsCarLandNotLike(String value) {
            addCriterion("ts_car_land not like", value, "tsCarLand");
            return (Criteria) this;
        }

        public Criteria andTsCarLandIn(List<String> values) {
            addCriterion("ts_car_land in", values, "tsCarLand");
            return (Criteria) this;
        }

        public Criteria andTsCarLandNotIn(List<String> values) {
            addCriterion("ts_car_land not in", values, "tsCarLand");
            return (Criteria) this;
        }

        public Criteria andTsCarLandBetween(String value1, String value2) {
            addCriterion("ts_car_land between", value1, value2, "tsCarLand");
            return (Criteria) this;
        }

        public Criteria andTsCarLandNotBetween(String value1, String value2) {
            addCriterion("ts_car_land not between", value1, value2, "tsCarLand");
            return (Criteria) this;
        }

        public Criteria andTsCarDisplacementIsNull() {
            addCriterion("ts_car_displacement is null");
            return (Criteria) this;
        }

        public Criteria andTsCarDisplacementIsNotNull() {
            addCriterion("ts_car_displacement is not null");
            return (Criteria) this;
        }

        public Criteria andTsCarDisplacementEqualTo(String value) {
            addCriterion("ts_car_displacement =", value, "tsCarDisplacement");
            return (Criteria) this;
        }

        public Criteria andTsCarDisplacementNotEqualTo(String value) {
            addCriterion("ts_car_displacement <>", value, "tsCarDisplacement");
            return (Criteria) this;
        }

        public Criteria andTsCarDisplacementGreaterThan(String value) {
            addCriterion("ts_car_displacement >", value, "tsCarDisplacement");
            return (Criteria) this;
        }

        public Criteria andTsCarDisplacementGreaterThanOrEqualTo(String value) {
            addCriterion("ts_car_displacement >=", value, "tsCarDisplacement");
            return (Criteria) this;
        }

        public Criteria andTsCarDisplacementLessThan(String value) {
            addCriterion("ts_car_displacement <", value, "tsCarDisplacement");
            return (Criteria) this;
        }

        public Criteria andTsCarDisplacementLessThanOrEqualTo(String value) {
            addCriterion("ts_car_displacement <=", value, "tsCarDisplacement");
            return (Criteria) this;
        }

        public Criteria andTsCarDisplacementLike(String value) {
            addCriterion("ts_car_displacement like", value, "tsCarDisplacement");
            return (Criteria) this;
        }

        public Criteria andTsCarDisplacementNotLike(String value) {
            addCriterion("ts_car_displacement not like", value, "tsCarDisplacement");
            return (Criteria) this;
        }

        public Criteria andTsCarDisplacementIn(List<String> values) {
            addCriterion("ts_car_displacement in", values, "tsCarDisplacement");
            return (Criteria) this;
        }

        public Criteria andTsCarDisplacementNotIn(List<String> values) {
            addCriterion("ts_car_displacement not in", values, "tsCarDisplacement");
            return (Criteria) this;
        }

        public Criteria andTsCarDisplacementBetween(String value1, String value2) {
            addCriterion("ts_car_displacement between", value1, value2, "tsCarDisplacement");
            return (Criteria) this;
        }

        public Criteria andTsCarDisplacementNotBetween(String value1, String value2) {
            addCriterion("ts_car_displacement not between", value1, value2, "tsCarDisplacement");
            return (Criteria) this;
        }

        public Criteria andTsCarPowerIsNull() {
            addCriterion("ts_car_power is null");
            return (Criteria) this;
        }

        public Criteria andTsCarPowerIsNotNull() {
            addCriterion("ts_car_power is not null");
            return (Criteria) this;
        }

        public Criteria andTsCarPowerEqualTo(String value) {
            addCriterion("ts_car_power =", value, "tsCarPower");
            return (Criteria) this;
        }

        public Criteria andTsCarPowerNotEqualTo(String value) {
            addCriterion("ts_car_power <>", value, "tsCarPower");
            return (Criteria) this;
        }

        public Criteria andTsCarPowerGreaterThan(String value) {
            addCriterion("ts_car_power >", value, "tsCarPower");
            return (Criteria) this;
        }

        public Criteria andTsCarPowerGreaterThanOrEqualTo(String value) {
            addCriterion("ts_car_power >=", value, "tsCarPower");
            return (Criteria) this;
        }

        public Criteria andTsCarPowerLessThan(String value) {
            addCriterion("ts_car_power <", value, "tsCarPower");
            return (Criteria) this;
        }

        public Criteria andTsCarPowerLessThanOrEqualTo(String value) {
            addCriterion("ts_car_power <=", value, "tsCarPower");
            return (Criteria) this;
        }

        public Criteria andTsCarPowerLike(String value) {
            addCriterion("ts_car_power like", value, "tsCarPower");
            return (Criteria) this;
        }

        public Criteria andTsCarPowerNotLike(String value) {
            addCriterion("ts_car_power not like", value, "tsCarPower");
            return (Criteria) this;
        }

        public Criteria andTsCarPowerIn(List<String> values) {
            addCriterion("ts_car_power in", values, "tsCarPower");
            return (Criteria) this;
        }

        public Criteria andTsCarPowerNotIn(List<String> values) {
            addCriterion("ts_car_power not in", values, "tsCarPower");
            return (Criteria) this;
        }

        public Criteria andTsCarPowerBetween(String value1, String value2) {
            addCriterion("ts_car_power between", value1, value2, "tsCarPower");
            return (Criteria) this;
        }

        public Criteria andTsCarPowerNotBetween(String value1, String value2) {
            addCriterion("ts_car_power not between", value1, value2, "tsCarPower");
            return (Criteria) this;
        }

        public Criteria andTsCarInletIsNull() {
            addCriterion("ts_car_inlet is null");
            return (Criteria) this;
        }

        public Criteria andTsCarInletIsNotNull() {
            addCriterion("ts_car_inlet is not null");
            return (Criteria) this;
        }

        public Criteria andTsCarInletEqualTo(String value) {
            addCriterion("ts_car_inlet =", value, "tsCarInlet");
            return (Criteria) this;
        }

        public Criteria andTsCarInletNotEqualTo(String value) {
            addCriterion("ts_car_inlet <>", value, "tsCarInlet");
            return (Criteria) this;
        }

        public Criteria andTsCarInletGreaterThan(String value) {
            addCriterion("ts_car_inlet >", value, "tsCarInlet");
            return (Criteria) this;
        }

        public Criteria andTsCarInletGreaterThanOrEqualTo(String value) {
            addCriterion("ts_car_inlet >=", value, "tsCarInlet");
            return (Criteria) this;
        }

        public Criteria andTsCarInletLessThan(String value) {
            addCriterion("ts_car_inlet <", value, "tsCarInlet");
            return (Criteria) this;
        }

        public Criteria andTsCarInletLessThanOrEqualTo(String value) {
            addCriterion("ts_car_inlet <=", value, "tsCarInlet");
            return (Criteria) this;
        }

        public Criteria andTsCarInletLike(String value) {
            addCriterion("ts_car_inlet like", value, "tsCarInlet");
            return (Criteria) this;
        }

        public Criteria andTsCarInletNotLike(String value) {
            addCriterion("ts_car_inlet not like", value, "tsCarInlet");
            return (Criteria) this;
        }

        public Criteria andTsCarInletIn(List<String> values) {
            addCriterion("ts_car_inlet in", values, "tsCarInlet");
            return (Criteria) this;
        }

        public Criteria andTsCarInletNotIn(List<String> values) {
            addCriterion("ts_car_inlet not in", values, "tsCarInlet");
            return (Criteria) this;
        }

        public Criteria andTsCarInletBetween(String value1, String value2) {
            addCriterion("ts_car_inlet between", value1, value2, "tsCarInlet");
            return (Criteria) this;
        }

        public Criteria andTsCarInletNotBetween(String value1, String value2) {
            addCriterion("ts_car_inlet not between", value1, value2, "tsCarInlet");
            return (Criteria) this;
        }

        public Criteria andTsCarGearboxIsNull() {
            addCriterion("ts_car_gearbox is null");
            return (Criteria) this;
        }

        public Criteria andTsCarGearboxIsNotNull() {
            addCriterion("ts_car_gearbox is not null");
            return (Criteria) this;
        }

        public Criteria andTsCarGearboxEqualTo(String value) {
            addCriterion("ts_car_gearbox =", value, "tsCarGearbox");
            return (Criteria) this;
        }

        public Criteria andTsCarGearboxNotEqualTo(String value) {
            addCriterion("ts_car_gearbox <>", value, "tsCarGearbox");
            return (Criteria) this;
        }

        public Criteria andTsCarGearboxGreaterThan(String value) {
            addCriterion("ts_car_gearbox >", value, "tsCarGearbox");
            return (Criteria) this;
        }

        public Criteria andTsCarGearboxGreaterThanOrEqualTo(String value) {
            addCriterion("ts_car_gearbox >=", value, "tsCarGearbox");
            return (Criteria) this;
        }

        public Criteria andTsCarGearboxLessThan(String value) {
            addCriterion("ts_car_gearbox <", value, "tsCarGearbox");
            return (Criteria) this;
        }

        public Criteria andTsCarGearboxLessThanOrEqualTo(String value) {
            addCriterion("ts_car_gearbox <=", value, "tsCarGearbox");
            return (Criteria) this;
        }

        public Criteria andTsCarGearboxLike(String value) {
            addCriterion("ts_car_gearbox like", value, "tsCarGearbox");
            return (Criteria) this;
        }

        public Criteria andTsCarGearboxNotLike(String value) {
            addCriterion("ts_car_gearbox not like", value, "tsCarGearbox");
            return (Criteria) this;
        }

        public Criteria andTsCarGearboxIn(List<String> values) {
            addCriterion("ts_car_gearbox in", values, "tsCarGearbox");
            return (Criteria) this;
        }

        public Criteria andTsCarGearboxNotIn(List<String> values) {
            addCriterion("ts_car_gearbox not in", values, "tsCarGearbox");
            return (Criteria) this;
        }

        public Criteria andTsCarGearboxBetween(String value1, String value2) {
            addCriterion("ts_car_gearbox between", value1, value2, "tsCarGearbox");
            return (Criteria) this;
        }

        public Criteria andTsCarGearboxNotBetween(String value1, String value2) {
            addCriterion("ts_car_gearbox not between", value1, value2, "tsCarGearbox");
            return (Criteria) this;
        }

        public Criteria andTsCarSeatIsNull() {
            addCriterion("ts_car_seat is null");
            return (Criteria) this;
        }

        public Criteria andTsCarSeatIsNotNull() {
            addCriterion("ts_car_seat is not null");
            return (Criteria) this;
        }

        public Criteria andTsCarSeatEqualTo(Integer value) {
            addCriterion("ts_car_seat =", value, "tsCarSeat");
            return (Criteria) this;
        }

        public Criteria andTsCarSeatNotEqualTo(Integer value) {
            addCriterion("ts_car_seat <>", value, "tsCarSeat");
            return (Criteria) this;
        }

        public Criteria andTsCarSeatGreaterThan(Integer value) {
            addCriterion("ts_car_seat >", value, "tsCarSeat");
            return (Criteria) this;
        }

        public Criteria andTsCarSeatGreaterThanOrEqualTo(Integer value) {
            addCriterion("ts_car_seat >=", value, "tsCarSeat");
            return (Criteria) this;
        }

        public Criteria andTsCarSeatLessThan(Integer value) {
            addCriterion("ts_car_seat <", value, "tsCarSeat");
            return (Criteria) this;
        }

        public Criteria andTsCarSeatLessThanOrEqualTo(Integer value) {
            addCriterion("ts_car_seat <=", value, "tsCarSeat");
            return (Criteria) this;
        }

        public Criteria andTsCarSeatIn(List<Integer> values) {
            addCriterion("ts_car_seat in", values, "tsCarSeat");
            return (Criteria) this;
        }

        public Criteria andTsCarSeatNotIn(List<Integer> values) {
            addCriterion("ts_car_seat not in", values, "tsCarSeat");
            return (Criteria) this;
        }

        public Criteria andTsCarSeatBetween(Integer value1, Integer value2) {
            addCriterion("ts_car_seat between", value1, value2, "tsCarSeat");
            return (Criteria) this;
        }

        public Criteria andTsCarSeatNotBetween(Integer value1, Integer value2) {
            addCriterion("ts_car_seat not between", value1, value2, "tsCarSeat");
            return (Criteria) this;
        }

        public Criteria andTsCarPictureIsNull() {
            addCriterion("ts_car_picture is null");
            return (Criteria) this;
        }

        public Criteria andTsCarPictureIsNotNull() {
            addCriterion("ts_car_picture is not null");
            return (Criteria) this;
        }

        public Criteria andTsCarPictureEqualTo(String value) {
            addCriterion("ts_car_picture =", value, "tsCarPicture");
            return (Criteria) this;
        }

        public Criteria andTsCarPictureNotEqualTo(String value) {
            addCriterion("ts_car_picture <>", value, "tsCarPicture");
            return (Criteria) this;
        }

        public Criteria andTsCarPictureGreaterThan(String value) {
            addCriterion("ts_car_picture >", value, "tsCarPicture");
            return (Criteria) this;
        }

        public Criteria andTsCarPictureGreaterThanOrEqualTo(String value) {
            addCriterion("ts_car_picture >=", value, "tsCarPicture");
            return (Criteria) this;
        }

        public Criteria andTsCarPictureLessThan(String value) {
            addCriterion("ts_car_picture <", value, "tsCarPicture");
            return (Criteria) this;
        }

        public Criteria andTsCarPictureLessThanOrEqualTo(String value) {
            addCriterion("ts_car_picture <=", value, "tsCarPicture");
            return (Criteria) this;
        }

        public Criteria andTsCarPictureLike(String value) {
            addCriterion("ts_car_picture like", value, "tsCarPicture");
            return (Criteria) this;
        }

        public Criteria andTsCarPictureNotLike(String value) {
            addCriterion("ts_car_picture not like", value, "tsCarPicture");
            return (Criteria) this;
        }

        public Criteria andTsCarPictureIn(List<String> values) {
            addCriterion("ts_car_picture in", values, "tsCarPicture");
            return (Criteria) this;
        }

        public Criteria andTsCarPictureNotIn(List<String> values) {
            addCriterion("ts_car_picture not in", values, "tsCarPicture");
            return (Criteria) this;
        }

        public Criteria andTsCarPictureBetween(String value1, String value2) {
            addCriterion("ts_car_picture between", value1, value2, "tsCarPicture");
            return (Criteria) this;
        }

        public Criteria andTsCarPictureNotBetween(String value1, String value2) {
            addCriterion("ts_car_picture not between", value1, value2, "tsCarPicture");
            return (Criteria) this;
        }

        public Criteria andTsCarNumberIsNull() {
            addCriterion("ts_car_number is null");
            return (Criteria) this;
        }

        public Criteria andTsCarNumberIsNotNull() {
            addCriterion("ts_car_number is not null");
            return (Criteria) this;
        }

        public Criteria andTsCarNumberEqualTo(Integer value) {
            addCriterion("ts_car_number =", value, "tsCarNumber");
            return (Criteria) this;
        }

        public Criteria andTsCarNumberNotEqualTo(Integer value) {
            addCriterion("ts_car_number <>", value, "tsCarNumber");
            return (Criteria) this;
        }

        public Criteria andTsCarNumberGreaterThan(Integer value) {
            addCriterion("ts_car_number >", value, "tsCarNumber");
            return (Criteria) this;
        }

        public Criteria andTsCarNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("ts_car_number >=", value, "tsCarNumber");
            return (Criteria) this;
        }

        public Criteria andTsCarNumberLessThan(Integer value) {
            addCriterion("ts_car_number <", value, "tsCarNumber");
            return (Criteria) this;
        }

        public Criteria andTsCarNumberLessThanOrEqualTo(Integer value) {
            addCriterion("ts_car_number <=", value, "tsCarNumber");
            return (Criteria) this;
        }

        public Criteria andTsCarNumberIn(List<Integer> values) {
            addCriterion("ts_car_number in", values, "tsCarNumber");
            return (Criteria) this;
        }

        public Criteria andTsCarNumberNotIn(List<Integer> values) {
            addCriterion("ts_car_number not in", values, "tsCarNumber");
            return (Criteria) this;
        }

        public Criteria andTsCarNumberBetween(Integer value1, Integer value2) {
            addCriterion("ts_car_number between", value1, value2, "tsCarNumber");
            return (Criteria) this;
        }

        public Criteria andTsCarNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("ts_car_number not between", value1, value2, "tsCarNumber");
            return (Criteria) this;
        }

        public Criteria andTsCarMoneyIsNull() {
            addCriterion("ts_car_money is null");
            return (Criteria) this;
        }

        public Criteria andTsCarMoneyIsNotNull() {
            addCriterion("ts_car_money is not null");
            return (Criteria) this;
        }

        public Criteria andTsCarMoneyEqualTo(Double value) {
            addCriterion("ts_car_money =", value, "tsCarMoney");
            return (Criteria) this;
        }

        public Criteria andTsCarMoneyNotEqualTo(Double value) {
            addCriterion("ts_car_money <>", value, "tsCarMoney");
            return (Criteria) this;
        }

        public Criteria andTsCarMoneyGreaterThan(Double value) {
            addCriterion("ts_car_money >", value, "tsCarMoney");
            return (Criteria) this;
        }

        public Criteria andTsCarMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("ts_car_money >=", value, "tsCarMoney");
            return (Criteria) this;
        }

        public Criteria andTsCarMoneyLessThan(Double value) {
            addCriterion("ts_car_money <", value, "tsCarMoney");
            return (Criteria) this;
        }

        public Criteria andTsCarMoneyLessThanOrEqualTo(Double value) {
            addCriterion("ts_car_money <=", value, "tsCarMoney");
            return (Criteria) this;
        }

        public Criteria andTsCarMoneyIn(List<Double> values) {
            addCriterion("ts_car_money in", values, "tsCarMoney");
            return (Criteria) this;
        }

        public Criteria andTsCarMoneyNotIn(List<Double> values) {
            addCriterion("ts_car_money not in", values, "tsCarMoney");
            return (Criteria) this;
        }

        public Criteria andTsCarMoneyBetween(Double value1, Double value2) {
            addCriterion("ts_car_money between", value1, value2, "tsCarMoney");
            return (Criteria) this;
        }

        public Criteria andTsCarMoneyNotBetween(Double value1, Double value2) {
            addCriterion("ts_car_money not between", value1, value2, "tsCarMoney");
            return (Criteria) this;
        }

        public Criteria andTsCarIntroduceIsNull() {
            addCriterion("ts_car_introduce is null");
            return (Criteria) this;
        }

        public Criteria andTsCarIntroduceIsNotNull() {
            addCriterion("ts_car_introduce is not null");
            return (Criteria) this;
        }

        public Criteria andTsCarIntroduceEqualTo(String value) {
            addCriterion("ts_car_introduce =", value, "tsCarIntroduce");
            return (Criteria) this;
        }

        public Criteria andTsCarIntroduceNotEqualTo(String value) {
            addCriterion("ts_car_introduce <>", value, "tsCarIntroduce");
            return (Criteria) this;
        }

        public Criteria andTsCarIntroduceGreaterThan(String value) {
            addCriterion("ts_car_introduce >", value, "tsCarIntroduce");
            return (Criteria) this;
        }

        public Criteria andTsCarIntroduceGreaterThanOrEqualTo(String value) {
            addCriterion("ts_car_introduce >=", value, "tsCarIntroduce");
            return (Criteria) this;
        }

        public Criteria andTsCarIntroduceLessThan(String value) {
            addCriterion("ts_car_introduce <", value, "tsCarIntroduce");
            return (Criteria) this;
        }

        public Criteria andTsCarIntroduceLessThanOrEqualTo(String value) {
            addCriterion("ts_car_introduce <=", value, "tsCarIntroduce");
            return (Criteria) this;
        }

        public Criteria andTsCarIntroduceLike(String value) {
            addCriterion("ts_car_introduce like", value, "tsCarIntroduce");
            return (Criteria) this;
        }

        public Criteria andTsCarIntroduceNotLike(String value) {
            addCriterion("ts_car_introduce not like", value, "tsCarIntroduce");
            return (Criteria) this;
        }

        public Criteria andTsCarIntroduceIn(List<String> values) {
            addCriterion("ts_car_introduce in", values, "tsCarIntroduce");
            return (Criteria) this;
        }

        public Criteria andTsCarIntroduceNotIn(List<String> values) {
            addCriterion("ts_car_introduce not in", values, "tsCarIntroduce");
            return (Criteria) this;
        }

        public Criteria andTsCarIntroduceBetween(String value1, String value2) {
            addCriterion("ts_car_introduce between", value1, value2, "tsCarIntroduce");
            return (Criteria) this;
        }

        public Criteria andTsCarIntroduceNotBetween(String value1, String value2) {
            addCriterion("ts_car_introduce not between", value1, value2, "tsCarIntroduce");
            return (Criteria) this;
        }

        public Criteria andTsCarStateIsNull() {
            addCriterion("ts_car_state is null");
            return (Criteria) this;
        }

        public Criteria andTsCarStateIsNotNull() {
            addCriterion("ts_car_state is not null");
            return (Criteria) this;
        }

        public Criteria andTsCarStateEqualTo(String value) {
            addCriterion("ts_car_state =", value, "tsCarState");
            return (Criteria) this;
        }

        public Criteria andTsCarStateNotEqualTo(String value) {
            addCriterion("ts_car_state <>", value, "tsCarState");
            return (Criteria) this;
        }

        public Criteria andTsCarStateGreaterThan(String value) {
            addCriterion("ts_car_state >", value, "tsCarState");
            return (Criteria) this;
        }

        public Criteria andTsCarStateGreaterThanOrEqualTo(String value) {
            addCriterion("ts_car_state >=", value, "tsCarState");
            return (Criteria) this;
        }

        public Criteria andTsCarStateLessThan(String value) {
            addCriterion("ts_car_state <", value, "tsCarState");
            return (Criteria) this;
        }

        public Criteria andTsCarStateLessThanOrEqualTo(String value) {
            addCriterion("ts_car_state <=", value, "tsCarState");
            return (Criteria) this;
        }

        public Criteria andTsCarStateLike(String value) {
            addCriterion("ts_car_state like", value, "tsCarState");
            return (Criteria) this;
        }

        public Criteria andTsCarStateNotLike(String value) {
            addCriterion("ts_car_state not like", value, "tsCarState");
            return (Criteria) this;
        }

        public Criteria andTsCarStateIn(List<String> values) {
            addCriterion("ts_car_state in", values, "tsCarState");
            return (Criteria) this;
        }

        public Criteria andTsCarStateNotIn(List<String> values) {
            addCriterion("ts_car_state not in", values, "tsCarState");
            return (Criteria) this;
        }

        public Criteria andTsCarStateBetween(String value1, String value2) {
            addCriterion("ts_car_state between", value1, value2, "tsCarState");
            return (Criteria) this;
        }

        public Criteria andTsCarStateNotBetween(String value1, String value2) {
            addCriterion("ts_car_state not between", value1, value2, "tsCarState");
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