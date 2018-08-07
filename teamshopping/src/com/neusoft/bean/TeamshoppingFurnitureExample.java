package com.neusoft.bean;

import java.util.ArrayList;
import java.util.List;

public class TeamshoppingFurnitureExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TeamshoppingFurnitureExample() {
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

        public Criteria andTsFurnitureIdIsNull() {
            addCriterion("ts_furniture_id is null");
            return (Criteria) this;
        }

        public Criteria andTsFurnitureIdIsNotNull() {
            addCriterion("ts_furniture_id is not null");
            return (Criteria) this;
        }

        public Criteria andTsFurnitureIdEqualTo(Integer value) {
            addCriterion("ts_furniture_id =", value, "tsFurnitureId");
            return (Criteria) this;
        }

        public Criteria andTsFurnitureIdNotEqualTo(Integer value) {
            addCriterion("ts_furniture_id <>", value, "tsFurnitureId");
            return (Criteria) this;
        }

        public Criteria andTsFurnitureIdGreaterThan(Integer value) {
            addCriterion("ts_furniture_id >", value, "tsFurnitureId");
            return (Criteria) this;
        }

        public Criteria andTsFurnitureIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ts_furniture_id >=", value, "tsFurnitureId");
            return (Criteria) this;
        }

        public Criteria andTsFurnitureIdLessThan(Integer value) {
            addCriterion("ts_furniture_id <", value, "tsFurnitureId");
            return (Criteria) this;
        }

        public Criteria andTsFurnitureIdLessThanOrEqualTo(Integer value) {
            addCriterion("ts_furniture_id <=", value, "tsFurnitureId");
            return (Criteria) this;
        }

        public Criteria andTsFurnitureIdIn(List<Integer> values) {
            addCriterion("ts_furniture_id in", values, "tsFurnitureId");
            return (Criteria) this;
        }

        public Criteria andTsFurnitureIdNotIn(List<Integer> values) {
            addCriterion("ts_furniture_id not in", values, "tsFurnitureId");
            return (Criteria) this;
        }

        public Criteria andTsFurnitureIdBetween(Integer value1, Integer value2) {
            addCriterion("ts_furniture_id between", value1, value2, "tsFurnitureId");
            return (Criteria) this;
        }

        public Criteria andTsFurnitureIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ts_furniture_id not between", value1, value2, "tsFurnitureId");
            return (Criteria) this;
        }

        public Criteria andTsFurnitureTypeIsNull() {
            addCriterion("ts_furniture_type is null");
            return (Criteria) this;
        }

        public Criteria andTsFurnitureTypeIsNotNull() {
            addCriterion("ts_furniture_type is not null");
            return (Criteria) this;
        }

        public Criteria andTsFurnitureTypeEqualTo(String value) {
            addCriterion("ts_furniture_type =", value, "tsFurnitureType");
            return (Criteria) this;
        }

        public Criteria andTsFurnitureTypeNotEqualTo(String value) {
            addCriterion("ts_furniture_type <>", value, "tsFurnitureType");
            return (Criteria) this;
        }

        public Criteria andTsFurnitureTypeGreaterThan(String value) {
            addCriterion("ts_furniture_type >", value, "tsFurnitureType");
            return (Criteria) this;
        }

        public Criteria andTsFurnitureTypeGreaterThanOrEqualTo(String value) {
            addCriterion("ts_furniture_type >=", value, "tsFurnitureType");
            return (Criteria) this;
        }

        public Criteria andTsFurnitureTypeLessThan(String value) {
            addCriterion("ts_furniture_type <", value, "tsFurnitureType");
            return (Criteria) this;
        }

        public Criteria andTsFurnitureTypeLessThanOrEqualTo(String value) {
            addCriterion("ts_furniture_type <=", value, "tsFurnitureType");
            return (Criteria) this;
        }

        public Criteria andTsFurnitureTypeLike(String value) {
            addCriterion("ts_furniture_type like", value, "tsFurnitureType");
            return (Criteria) this;
        }

        public Criteria andTsFurnitureTypeNotLike(String value) {
            addCriterion("ts_furniture_type not like", value, "tsFurnitureType");
            return (Criteria) this;
        }

        public Criteria andTsFurnitureTypeIn(List<String> values) {
            addCriterion("ts_furniture_type in", values, "tsFurnitureType");
            return (Criteria) this;
        }

        public Criteria andTsFurnitureTypeNotIn(List<String> values) {
            addCriterion("ts_furniture_type not in", values, "tsFurnitureType");
            return (Criteria) this;
        }

        public Criteria andTsFurnitureTypeBetween(String value1, String value2) {
            addCriterion("ts_furniture_type between", value1, value2, "tsFurnitureType");
            return (Criteria) this;
        }

        public Criteria andTsFurnitureTypeNotBetween(String value1, String value2) {
            addCriterion("ts_furniture_type not between", value1, value2, "tsFurnitureType");
            return (Criteria) this;
        }

        public Criteria andTsFurnitureStyleIsNull() {
            addCriterion("ts_furniture_style is null");
            return (Criteria) this;
        }

        public Criteria andTsFurnitureStyleIsNotNull() {
            addCriterion("ts_furniture_style is not null");
            return (Criteria) this;
        }

        public Criteria andTsFurnitureStyleEqualTo(String value) {
            addCriterion("ts_furniture_style =", value, "tsFurnitureStyle");
            return (Criteria) this;
        }

        public Criteria andTsFurnitureStyleNotEqualTo(String value) {
            addCriterion("ts_furniture_style <>", value, "tsFurnitureStyle");
            return (Criteria) this;
        }

        public Criteria andTsFurnitureStyleGreaterThan(String value) {
            addCriterion("ts_furniture_style >", value, "tsFurnitureStyle");
            return (Criteria) this;
        }

        public Criteria andTsFurnitureStyleGreaterThanOrEqualTo(String value) {
            addCriterion("ts_furniture_style >=", value, "tsFurnitureStyle");
            return (Criteria) this;
        }

        public Criteria andTsFurnitureStyleLessThan(String value) {
            addCriterion("ts_furniture_style <", value, "tsFurnitureStyle");
            return (Criteria) this;
        }

        public Criteria andTsFurnitureStyleLessThanOrEqualTo(String value) {
            addCriterion("ts_furniture_style <=", value, "tsFurnitureStyle");
            return (Criteria) this;
        }

        public Criteria andTsFurnitureStyleLike(String value) {
            addCriterion("ts_furniture_style like", value, "tsFurnitureStyle");
            return (Criteria) this;
        }

        public Criteria andTsFurnitureStyleNotLike(String value) {
            addCriterion("ts_furniture_style not like", value, "tsFurnitureStyle");
            return (Criteria) this;
        }

        public Criteria andTsFurnitureStyleIn(List<String> values) {
            addCriterion("ts_furniture_style in", values, "tsFurnitureStyle");
            return (Criteria) this;
        }

        public Criteria andTsFurnitureStyleNotIn(List<String> values) {
            addCriterion("ts_furniture_style not in", values, "tsFurnitureStyle");
            return (Criteria) this;
        }

        public Criteria andTsFurnitureStyleBetween(String value1, String value2) {
            addCriterion("ts_furniture_style between", value1, value2, "tsFurnitureStyle");
            return (Criteria) this;
        }

        public Criteria andTsFurnitureStyleNotBetween(String value1, String value2) {
            addCriterion("ts_furniture_style not between", value1, value2, "tsFurnitureStyle");
            return (Criteria) this;
        }

        public Criteria andTsFurnitureSizeIsNull() {
            addCriterion("ts_furniture_size is null");
            return (Criteria) this;
        }

        public Criteria andTsFurnitureSizeIsNotNull() {
            addCriterion("ts_furniture_size is not null");
            return (Criteria) this;
        }

        public Criteria andTsFurnitureSizeEqualTo(String value) {
            addCriterion("ts_furniture_size =", value, "tsFurnitureSize");
            return (Criteria) this;
        }

        public Criteria andTsFurnitureSizeNotEqualTo(String value) {
            addCriterion("ts_furniture_size <>", value, "tsFurnitureSize");
            return (Criteria) this;
        }

        public Criteria andTsFurnitureSizeGreaterThan(String value) {
            addCriterion("ts_furniture_size >", value, "tsFurnitureSize");
            return (Criteria) this;
        }

        public Criteria andTsFurnitureSizeGreaterThanOrEqualTo(String value) {
            addCriterion("ts_furniture_size >=", value, "tsFurnitureSize");
            return (Criteria) this;
        }

        public Criteria andTsFurnitureSizeLessThan(String value) {
            addCriterion("ts_furniture_size <", value, "tsFurnitureSize");
            return (Criteria) this;
        }

        public Criteria andTsFurnitureSizeLessThanOrEqualTo(String value) {
            addCriterion("ts_furniture_size <=", value, "tsFurnitureSize");
            return (Criteria) this;
        }

        public Criteria andTsFurnitureSizeLike(String value) {
            addCriterion("ts_furniture_size like", value, "tsFurnitureSize");
            return (Criteria) this;
        }

        public Criteria andTsFurnitureSizeNotLike(String value) {
            addCriterion("ts_furniture_size not like", value, "tsFurnitureSize");
            return (Criteria) this;
        }

        public Criteria andTsFurnitureSizeIn(List<String> values) {
            addCriterion("ts_furniture_size in", values, "tsFurnitureSize");
            return (Criteria) this;
        }

        public Criteria andTsFurnitureSizeNotIn(List<String> values) {
            addCriterion("ts_furniture_size not in", values, "tsFurnitureSize");
            return (Criteria) this;
        }

        public Criteria andTsFurnitureSizeBetween(String value1, String value2) {
            addCriterion("ts_furniture_size between", value1, value2, "tsFurnitureSize");
            return (Criteria) this;
        }

        public Criteria andTsFurnitureSizeNotBetween(String value1, String value2) {
            addCriterion("ts_furniture_size not between", value1, value2, "tsFurnitureSize");
            return (Criteria) this;
        }

        public Criteria andTsFurnitureColorIsNull() {
            addCriterion("ts_furniture_color is null");
            return (Criteria) this;
        }

        public Criteria andTsFurnitureColorIsNotNull() {
            addCriterion("ts_furniture_color is not null");
            return (Criteria) this;
        }

        public Criteria andTsFurnitureColorEqualTo(String value) {
            addCriterion("ts_furniture_color =", value, "tsFurnitureColor");
            return (Criteria) this;
        }

        public Criteria andTsFurnitureColorNotEqualTo(String value) {
            addCriterion("ts_furniture_color <>", value, "tsFurnitureColor");
            return (Criteria) this;
        }

        public Criteria andTsFurnitureColorGreaterThan(String value) {
            addCriterion("ts_furniture_color >", value, "tsFurnitureColor");
            return (Criteria) this;
        }

        public Criteria andTsFurnitureColorGreaterThanOrEqualTo(String value) {
            addCriterion("ts_furniture_color >=", value, "tsFurnitureColor");
            return (Criteria) this;
        }

        public Criteria andTsFurnitureColorLessThan(String value) {
            addCriterion("ts_furniture_color <", value, "tsFurnitureColor");
            return (Criteria) this;
        }

        public Criteria andTsFurnitureColorLessThanOrEqualTo(String value) {
            addCriterion("ts_furniture_color <=", value, "tsFurnitureColor");
            return (Criteria) this;
        }

        public Criteria andTsFurnitureColorLike(String value) {
            addCriterion("ts_furniture_color like", value, "tsFurnitureColor");
            return (Criteria) this;
        }

        public Criteria andTsFurnitureColorNotLike(String value) {
            addCriterion("ts_furniture_color not like", value, "tsFurnitureColor");
            return (Criteria) this;
        }

        public Criteria andTsFurnitureColorIn(List<String> values) {
            addCriterion("ts_furniture_color in", values, "tsFurnitureColor");
            return (Criteria) this;
        }

        public Criteria andTsFurnitureColorNotIn(List<String> values) {
            addCriterion("ts_furniture_color not in", values, "tsFurnitureColor");
            return (Criteria) this;
        }

        public Criteria andTsFurnitureColorBetween(String value1, String value2) {
            addCriterion("ts_furniture_color between", value1, value2, "tsFurnitureColor");
            return (Criteria) this;
        }

        public Criteria andTsFurnitureColorNotBetween(String value1, String value2) {
            addCriterion("ts_furniture_color not between", value1, value2, "tsFurnitureColor");
            return (Criteria) this;
        }

        public Criteria andTsFurnitureMaterialIsNull() {
            addCriterion("ts_furniture_material is null");
            return (Criteria) this;
        }

        public Criteria andTsFurnitureMaterialIsNotNull() {
            addCriterion("ts_furniture_material is not null");
            return (Criteria) this;
        }

        public Criteria andTsFurnitureMaterialEqualTo(String value) {
            addCriterion("ts_furniture_material =", value, "tsFurnitureMaterial");
            return (Criteria) this;
        }

        public Criteria andTsFurnitureMaterialNotEqualTo(String value) {
            addCriterion("ts_furniture_material <>", value, "tsFurnitureMaterial");
            return (Criteria) this;
        }

        public Criteria andTsFurnitureMaterialGreaterThan(String value) {
            addCriterion("ts_furniture_material >", value, "tsFurnitureMaterial");
            return (Criteria) this;
        }

        public Criteria andTsFurnitureMaterialGreaterThanOrEqualTo(String value) {
            addCriterion("ts_furniture_material >=", value, "tsFurnitureMaterial");
            return (Criteria) this;
        }

        public Criteria andTsFurnitureMaterialLessThan(String value) {
            addCriterion("ts_furniture_material <", value, "tsFurnitureMaterial");
            return (Criteria) this;
        }

        public Criteria andTsFurnitureMaterialLessThanOrEqualTo(String value) {
            addCriterion("ts_furniture_material <=", value, "tsFurnitureMaterial");
            return (Criteria) this;
        }

        public Criteria andTsFurnitureMaterialLike(String value) {
            addCriterion("ts_furniture_material like", value, "tsFurnitureMaterial");
            return (Criteria) this;
        }

        public Criteria andTsFurnitureMaterialNotLike(String value) {
            addCriterion("ts_furniture_material not like", value, "tsFurnitureMaterial");
            return (Criteria) this;
        }

        public Criteria andTsFurnitureMaterialIn(List<String> values) {
            addCriterion("ts_furniture_material in", values, "tsFurnitureMaterial");
            return (Criteria) this;
        }

        public Criteria andTsFurnitureMaterialNotIn(List<String> values) {
            addCriterion("ts_furniture_material not in", values, "tsFurnitureMaterial");
            return (Criteria) this;
        }

        public Criteria andTsFurnitureMaterialBetween(String value1, String value2) {
            addCriterion("ts_furniture_material between", value1, value2, "tsFurnitureMaterial");
            return (Criteria) this;
        }

        public Criteria andTsFurnitureMaterialNotBetween(String value1, String value2) {
            addCriterion("ts_furniture_material not between", value1, value2, "tsFurnitureMaterial");
            return (Criteria) this;
        }

        public Criteria andTsFurnitureLandIsNull() {
            addCriterion("ts_furniture_land is null");
            return (Criteria) this;
        }

        public Criteria andTsFurnitureLandIsNotNull() {
            addCriterion("ts_furniture_land is not null");
            return (Criteria) this;
        }

        public Criteria andTsFurnitureLandEqualTo(String value) {
            addCriterion("ts_furniture_land =", value, "tsFurnitureLand");
            return (Criteria) this;
        }

        public Criteria andTsFurnitureLandNotEqualTo(String value) {
            addCriterion("ts_furniture_land <>", value, "tsFurnitureLand");
            return (Criteria) this;
        }

        public Criteria andTsFurnitureLandGreaterThan(String value) {
            addCriterion("ts_furniture_land >", value, "tsFurnitureLand");
            return (Criteria) this;
        }

        public Criteria andTsFurnitureLandGreaterThanOrEqualTo(String value) {
            addCriterion("ts_furniture_land >=", value, "tsFurnitureLand");
            return (Criteria) this;
        }

        public Criteria andTsFurnitureLandLessThan(String value) {
            addCriterion("ts_furniture_land <", value, "tsFurnitureLand");
            return (Criteria) this;
        }

        public Criteria andTsFurnitureLandLessThanOrEqualTo(String value) {
            addCriterion("ts_furniture_land <=", value, "tsFurnitureLand");
            return (Criteria) this;
        }

        public Criteria andTsFurnitureLandLike(String value) {
            addCriterion("ts_furniture_land like", value, "tsFurnitureLand");
            return (Criteria) this;
        }

        public Criteria andTsFurnitureLandNotLike(String value) {
            addCriterion("ts_furniture_land not like", value, "tsFurnitureLand");
            return (Criteria) this;
        }

        public Criteria andTsFurnitureLandIn(List<String> values) {
            addCriterion("ts_furniture_land in", values, "tsFurnitureLand");
            return (Criteria) this;
        }

        public Criteria andTsFurnitureLandNotIn(List<String> values) {
            addCriterion("ts_furniture_land not in", values, "tsFurnitureLand");
            return (Criteria) this;
        }

        public Criteria andTsFurnitureLandBetween(String value1, String value2) {
            addCriterion("ts_furniture_land between", value1, value2, "tsFurnitureLand");
            return (Criteria) this;
        }

        public Criteria andTsFurnitureLandNotBetween(String value1, String value2) {
            addCriterion("ts_furniture_land not between", value1, value2, "tsFurnitureLand");
            return (Criteria) this;
        }

        public Criteria andTsFurnitureCapacityIsNull() {
            addCriterion("ts_furniture_capacity is null");
            return (Criteria) this;
        }

        public Criteria andTsFurnitureCapacityIsNotNull() {
            addCriterion("ts_furniture_capacity is not null");
            return (Criteria) this;
        }

        public Criteria andTsFurnitureCapacityEqualTo(String value) {
            addCriterion("ts_furniture_capacity =", value, "tsFurnitureCapacity");
            return (Criteria) this;
        }

        public Criteria andTsFurnitureCapacityNotEqualTo(String value) {
            addCriterion("ts_furniture_capacity <>", value, "tsFurnitureCapacity");
            return (Criteria) this;
        }

        public Criteria andTsFurnitureCapacityGreaterThan(String value) {
            addCriterion("ts_furniture_capacity >", value, "tsFurnitureCapacity");
            return (Criteria) this;
        }

        public Criteria andTsFurnitureCapacityGreaterThanOrEqualTo(String value) {
            addCriterion("ts_furniture_capacity >=", value, "tsFurnitureCapacity");
            return (Criteria) this;
        }

        public Criteria andTsFurnitureCapacityLessThan(String value) {
            addCriterion("ts_furniture_capacity <", value, "tsFurnitureCapacity");
            return (Criteria) this;
        }

        public Criteria andTsFurnitureCapacityLessThanOrEqualTo(String value) {
            addCriterion("ts_furniture_capacity <=", value, "tsFurnitureCapacity");
            return (Criteria) this;
        }

        public Criteria andTsFurnitureCapacityLike(String value) {
            addCriterion("ts_furniture_capacity like", value, "tsFurnitureCapacity");
            return (Criteria) this;
        }

        public Criteria andTsFurnitureCapacityNotLike(String value) {
            addCriterion("ts_furniture_capacity not like", value, "tsFurnitureCapacity");
            return (Criteria) this;
        }

        public Criteria andTsFurnitureCapacityIn(List<String> values) {
            addCriterion("ts_furniture_capacity in", values, "tsFurnitureCapacity");
            return (Criteria) this;
        }

        public Criteria andTsFurnitureCapacityNotIn(List<String> values) {
            addCriterion("ts_furniture_capacity not in", values, "tsFurnitureCapacity");
            return (Criteria) this;
        }

        public Criteria andTsFurnitureCapacityBetween(String value1, String value2) {
            addCriterion("ts_furniture_capacity between", value1, value2, "tsFurnitureCapacity");
            return (Criteria) this;
        }

        public Criteria andTsFurnitureCapacityNotBetween(String value1, String value2) {
            addCriterion("ts_furniture_capacity not between", value1, value2, "tsFurnitureCapacity");
            return (Criteria) this;
        }

        public Criteria andTsFurniturePictureIsNull() {
            addCriterion("ts_furniture_picture is null");
            return (Criteria) this;
        }

        public Criteria andTsFurniturePictureIsNotNull() {
            addCriterion("ts_furniture_picture is not null");
            return (Criteria) this;
        }

        public Criteria andTsFurniturePictureEqualTo(String value) {
            addCriterion("ts_furniture_picture =", value, "tsFurniturePicture");
            return (Criteria) this;
        }

        public Criteria andTsFurniturePictureNotEqualTo(String value) {
            addCriterion("ts_furniture_picture <>", value, "tsFurniturePicture");
            return (Criteria) this;
        }

        public Criteria andTsFurniturePictureGreaterThan(String value) {
            addCriterion("ts_furniture_picture >", value, "tsFurniturePicture");
            return (Criteria) this;
        }

        public Criteria andTsFurniturePictureGreaterThanOrEqualTo(String value) {
            addCriterion("ts_furniture_picture >=", value, "tsFurniturePicture");
            return (Criteria) this;
        }

        public Criteria andTsFurniturePictureLessThan(String value) {
            addCriterion("ts_furniture_picture <", value, "tsFurniturePicture");
            return (Criteria) this;
        }

        public Criteria andTsFurniturePictureLessThanOrEqualTo(String value) {
            addCriterion("ts_furniture_picture <=", value, "tsFurniturePicture");
            return (Criteria) this;
        }

        public Criteria andTsFurniturePictureLike(String value) {
            addCriterion("ts_furniture_picture like", value, "tsFurniturePicture");
            return (Criteria) this;
        }

        public Criteria andTsFurniturePictureNotLike(String value) {
            addCriterion("ts_furniture_picture not like", value, "tsFurniturePicture");
            return (Criteria) this;
        }

        public Criteria andTsFurniturePictureIn(List<String> values) {
            addCriterion("ts_furniture_picture in", values, "tsFurniturePicture");
            return (Criteria) this;
        }

        public Criteria andTsFurniturePictureNotIn(List<String> values) {
            addCriterion("ts_furniture_picture not in", values, "tsFurniturePicture");
            return (Criteria) this;
        }

        public Criteria andTsFurniturePictureBetween(String value1, String value2) {
            addCriterion("ts_furniture_picture between", value1, value2, "tsFurniturePicture");
            return (Criteria) this;
        }

        public Criteria andTsFurniturePictureNotBetween(String value1, String value2) {
            addCriterion("ts_furniture_picture not between", value1, value2, "tsFurniturePicture");
            return (Criteria) this;
        }

        public Criteria andTsFurnitureNumberIsNull() {
            addCriterion("ts_furniture_number is null");
            return (Criteria) this;
        }

        public Criteria andTsFurnitureNumberIsNotNull() {
            addCriterion("ts_furniture_number is not null");
            return (Criteria) this;
        }

        public Criteria andTsFurnitureNumberEqualTo(Integer value) {
            addCriterion("ts_furniture_number =", value, "tsFurnitureNumber");
            return (Criteria) this;
        }

        public Criteria andTsFurnitureNumberNotEqualTo(Integer value) {
            addCriterion("ts_furniture_number <>", value, "tsFurnitureNumber");
            return (Criteria) this;
        }

        public Criteria andTsFurnitureNumberGreaterThan(Integer value) {
            addCriterion("ts_furniture_number >", value, "tsFurnitureNumber");
            return (Criteria) this;
        }

        public Criteria andTsFurnitureNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("ts_furniture_number >=", value, "tsFurnitureNumber");
            return (Criteria) this;
        }

        public Criteria andTsFurnitureNumberLessThan(Integer value) {
            addCriterion("ts_furniture_number <", value, "tsFurnitureNumber");
            return (Criteria) this;
        }

        public Criteria andTsFurnitureNumberLessThanOrEqualTo(Integer value) {
            addCriterion("ts_furniture_number <=", value, "tsFurnitureNumber");
            return (Criteria) this;
        }

        public Criteria andTsFurnitureNumberIn(List<Integer> values) {
            addCriterion("ts_furniture_number in", values, "tsFurnitureNumber");
            return (Criteria) this;
        }

        public Criteria andTsFurnitureNumberNotIn(List<Integer> values) {
            addCriterion("ts_furniture_number not in", values, "tsFurnitureNumber");
            return (Criteria) this;
        }

        public Criteria andTsFurnitureNumberBetween(Integer value1, Integer value2) {
            addCriterion("ts_furniture_number between", value1, value2, "tsFurnitureNumber");
            return (Criteria) this;
        }

        public Criteria andTsFurnitureNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("ts_furniture_number not between", value1, value2, "tsFurnitureNumber");
            return (Criteria) this;
        }

        public Criteria andTsFurnitureMoneyIsNull() {
            addCriterion("ts_furniture_money is null");
            return (Criteria) this;
        }

        public Criteria andTsFurnitureMoneyIsNotNull() {
            addCriterion("ts_furniture_money is not null");
            return (Criteria) this;
        }

        public Criteria andTsFurnitureMoneyEqualTo(Double value) {
            addCriterion("ts_furniture_money =", value, "tsFurnitureMoney");
            return (Criteria) this;
        }

        public Criteria andTsFurnitureMoneyNotEqualTo(Double value) {
            addCriterion("ts_furniture_money <>", value, "tsFurnitureMoney");
            return (Criteria) this;
        }

        public Criteria andTsFurnitureMoneyGreaterThan(Double value) {
            addCriterion("ts_furniture_money >", value, "tsFurnitureMoney");
            return (Criteria) this;
        }

        public Criteria andTsFurnitureMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("ts_furniture_money >=", value, "tsFurnitureMoney");
            return (Criteria) this;
        }

        public Criteria andTsFurnitureMoneyLessThan(Double value) {
            addCriterion("ts_furniture_money <", value, "tsFurnitureMoney");
            return (Criteria) this;
        }

        public Criteria andTsFurnitureMoneyLessThanOrEqualTo(Double value) {
            addCriterion("ts_furniture_money <=", value, "tsFurnitureMoney");
            return (Criteria) this;
        }

        public Criteria andTsFurnitureMoneyIn(List<Double> values) {
            addCriterion("ts_furniture_money in", values, "tsFurnitureMoney");
            return (Criteria) this;
        }

        public Criteria andTsFurnitureMoneyNotIn(List<Double> values) {
            addCriterion("ts_furniture_money not in", values, "tsFurnitureMoney");
            return (Criteria) this;
        }

        public Criteria andTsFurnitureMoneyBetween(Double value1, Double value2) {
            addCriterion("ts_furniture_money between", value1, value2, "tsFurnitureMoney");
            return (Criteria) this;
        }

        public Criteria andTsFurnitureMoneyNotBetween(Double value1, Double value2) {
            addCriterion("ts_furniture_money not between", value1, value2, "tsFurnitureMoney");
            return (Criteria) this;
        }

        public Criteria andTsFurnitureIntroduceIsNull() {
            addCriterion("ts_furniture_introduce is null");
            return (Criteria) this;
        }

        public Criteria andTsFurnitureIntroduceIsNotNull() {
            addCriterion("ts_furniture_introduce is not null");
            return (Criteria) this;
        }

        public Criteria andTsFurnitureIntroduceEqualTo(String value) {
            addCriterion("ts_furniture_introduce =", value, "tsFurnitureIntroduce");
            return (Criteria) this;
        }

        public Criteria andTsFurnitureIntroduceNotEqualTo(String value) {
            addCriterion("ts_furniture_introduce <>", value, "tsFurnitureIntroduce");
            return (Criteria) this;
        }

        public Criteria andTsFurnitureIntroduceGreaterThan(String value) {
            addCriterion("ts_furniture_introduce >", value, "tsFurnitureIntroduce");
            return (Criteria) this;
        }

        public Criteria andTsFurnitureIntroduceGreaterThanOrEqualTo(String value) {
            addCriterion("ts_furniture_introduce >=", value, "tsFurnitureIntroduce");
            return (Criteria) this;
        }

        public Criteria andTsFurnitureIntroduceLessThan(String value) {
            addCriterion("ts_furniture_introduce <", value, "tsFurnitureIntroduce");
            return (Criteria) this;
        }

        public Criteria andTsFurnitureIntroduceLessThanOrEqualTo(String value) {
            addCriterion("ts_furniture_introduce <=", value, "tsFurnitureIntroduce");
            return (Criteria) this;
        }

        public Criteria andTsFurnitureIntroduceLike(String value) {
            addCriterion("ts_furniture_introduce like", value, "tsFurnitureIntroduce");
            return (Criteria) this;
        }

        public Criteria andTsFurnitureIntroduceNotLike(String value) {
            addCriterion("ts_furniture_introduce not like", value, "tsFurnitureIntroduce");
            return (Criteria) this;
        }

        public Criteria andTsFurnitureIntroduceIn(List<String> values) {
            addCriterion("ts_furniture_introduce in", values, "tsFurnitureIntroduce");
            return (Criteria) this;
        }

        public Criteria andTsFurnitureIntroduceNotIn(List<String> values) {
            addCriterion("ts_furniture_introduce not in", values, "tsFurnitureIntroduce");
            return (Criteria) this;
        }

        public Criteria andTsFurnitureIntroduceBetween(String value1, String value2) {
            addCriterion("ts_furniture_introduce between", value1, value2, "tsFurnitureIntroduce");
            return (Criteria) this;
        }

        public Criteria andTsFurnitureIntroduceNotBetween(String value1, String value2) {
            addCriterion("ts_furniture_introduce not between", value1, value2, "tsFurnitureIntroduce");
            return (Criteria) this;
        }

        public Criteria andTsFurnitureStateIsNull() {
            addCriterion("ts_furniture_state is null");
            return (Criteria) this;
        }

        public Criteria andTsFurnitureStateIsNotNull() {
            addCriterion("ts_furniture_state is not null");
            return (Criteria) this;
        }

        public Criteria andTsFurnitureStateEqualTo(String value) {
            addCriterion("ts_furniture_state =", value, "tsFurnitureState");
            return (Criteria) this;
        }

        public Criteria andTsFurnitureStateNotEqualTo(String value) {
            addCriterion("ts_furniture_state <>", value, "tsFurnitureState");
            return (Criteria) this;
        }

        public Criteria andTsFurnitureStateGreaterThan(String value) {
            addCriterion("ts_furniture_state >", value, "tsFurnitureState");
            return (Criteria) this;
        }

        public Criteria andTsFurnitureStateGreaterThanOrEqualTo(String value) {
            addCriterion("ts_furniture_state >=", value, "tsFurnitureState");
            return (Criteria) this;
        }

        public Criteria andTsFurnitureStateLessThan(String value) {
            addCriterion("ts_furniture_state <", value, "tsFurnitureState");
            return (Criteria) this;
        }

        public Criteria andTsFurnitureStateLessThanOrEqualTo(String value) {
            addCriterion("ts_furniture_state <=", value, "tsFurnitureState");
            return (Criteria) this;
        }

        public Criteria andTsFurnitureStateLike(String value) {
            addCriterion("ts_furniture_state like", value, "tsFurnitureState");
            return (Criteria) this;
        }

        public Criteria andTsFurnitureStateNotLike(String value) {
            addCriterion("ts_furniture_state not like", value, "tsFurnitureState");
            return (Criteria) this;
        }

        public Criteria andTsFurnitureStateIn(List<String> values) {
            addCriterion("ts_furniture_state in", values, "tsFurnitureState");
            return (Criteria) this;
        }

        public Criteria andTsFurnitureStateNotIn(List<String> values) {
            addCriterion("ts_furniture_state not in", values, "tsFurnitureState");
            return (Criteria) this;
        }

        public Criteria andTsFurnitureStateBetween(String value1, String value2) {
            addCriterion("ts_furniture_state between", value1, value2, "tsFurnitureState");
            return (Criteria) this;
        }

        public Criteria andTsFurnitureStateNotBetween(String value1, String value2) {
            addCriterion("ts_furniture_state not between", value1, value2, "tsFurnitureState");
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