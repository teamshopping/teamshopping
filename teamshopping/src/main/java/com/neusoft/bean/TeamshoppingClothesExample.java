package com.neusoft.bean;

import java.util.ArrayList;
import java.util.List;

public class TeamshoppingClothesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TeamshoppingClothesExample() {
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

        public Criteria andTsClothesIdIsNull() {
            addCriterion("ts_clothes_id is null");
            return (Criteria) this;
        }

        public Criteria andTsClothesIdIsNotNull() {
            addCriterion("ts_clothes_id is not null");
            return (Criteria) this;
        }

        public Criteria andTsClothesIdEqualTo(Integer value) {
            addCriterion("ts_clothes_id =", value, "tsClothesId");
            return (Criteria) this;
        }

        public Criteria andTsClothesIdNotEqualTo(Integer value) {
            addCriterion("ts_clothes_id <>", value, "tsClothesId");
            return (Criteria) this;
        }

        public Criteria andTsClothesIdGreaterThan(Integer value) {
            addCriterion("ts_clothes_id >", value, "tsClothesId");
            return (Criteria) this;
        }

        public Criteria andTsClothesIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ts_clothes_id >=", value, "tsClothesId");
            return (Criteria) this;
        }

        public Criteria andTsClothesIdLessThan(Integer value) {
            addCriterion("ts_clothes_id <", value, "tsClothesId");
            return (Criteria) this;
        }

        public Criteria andTsClothesIdLessThanOrEqualTo(Integer value) {
            addCriterion("ts_clothes_id <=", value, "tsClothesId");
            return (Criteria) this;
        }

        public Criteria andTsClothesIdIn(List<Integer> values) {
            addCriterion("ts_clothes_id in", values, "tsClothesId");
            return (Criteria) this;
        }

        public Criteria andTsClothesIdNotIn(List<Integer> values) {
            addCriterion("ts_clothes_id not in", values, "tsClothesId");
            return (Criteria) this;
        }

        public Criteria andTsClothesIdBetween(Integer value1, Integer value2) {
            addCriterion("ts_clothes_id between", value1, value2, "tsClothesId");
            return (Criteria) this;
        }

        public Criteria andTsClothesIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ts_clothes_id not between", value1, value2, "tsClothesId");
            return (Criteria) this;
        }

        public Criteria andTsClothesBrandIsNull() {
            addCriterion("ts_clothes_brand is null");
            return (Criteria) this;
        }

        public Criteria andTsClothesBrandIsNotNull() {
            addCriterion("ts_clothes_brand is not null");
            return (Criteria) this;
        }

        public Criteria andTsClothesBrandEqualTo(String value) {
            addCriterion("ts_clothes_brand =", value, "tsClothesBrand");
            return (Criteria) this;
        }

        public Criteria andTsClothesBrandNotEqualTo(String value) {
            addCriterion("ts_clothes_brand <>", value, "tsClothesBrand");
            return (Criteria) this;
        }

        public Criteria andTsClothesBrandGreaterThan(String value) {
            addCriterion("ts_clothes_brand >", value, "tsClothesBrand");
            return (Criteria) this;
        }

        public Criteria andTsClothesBrandGreaterThanOrEqualTo(String value) {
            addCriterion("ts_clothes_brand >=", value, "tsClothesBrand");
            return (Criteria) this;
        }

        public Criteria andTsClothesBrandLessThan(String value) {
            addCriterion("ts_clothes_brand <", value, "tsClothesBrand");
            return (Criteria) this;
        }

        public Criteria andTsClothesBrandLessThanOrEqualTo(String value) {
            addCriterion("ts_clothes_brand <=", value, "tsClothesBrand");
            return (Criteria) this;
        }

        public Criteria andTsClothesBrandLike(String value) {
            addCriterion("ts_clothes_brand like", value, "tsClothesBrand");
            return (Criteria) this;
        }

        public Criteria andTsClothesBrandNotLike(String value) {
            addCriterion("ts_clothes_brand not like", value, "tsClothesBrand");
            return (Criteria) this;
        }

        public Criteria andTsClothesBrandIn(List<String> values) {
            addCriterion("ts_clothes_brand in", values, "tsClothesBrand");
            return (Criteria) this;
        }

        public Criteria andTsClothesBrandNotIn(List<String> values) {
            addCriterion("ts_clothes_brand not in", values, "tsClothesBrand");
            return (Criteria) this;
        }

        public Criteria andTsClothesBrandBetween(String value1, String value2) {
            addCriterion("ts_clothes_brand between", value1, value2, "tsClothesBrand");
            return (Criteria) this;
        }

        public Criteria andTsClothesBrandNotBetween(String value1, String value2) {
            addCriterion("ts_clothes_brand not between", value1, value2, "tsClothesBrand");
            return (Criteria) this;
        }

        public Criteria andTsClothesTypeIsNull() {
            addCriterion("ts_clothes_type is null");
            return (Criteria) this;
        }

        public Criteria andTsClothesTypeIsNotNull() {
            addCriterion("ts_clothes_type is not null");
            return (Criteria) this;
        }

        public Criteria andTsClothesTypeEqualTo(String value) {
            addCriterion("ts_clothes_type =", value, "tsClothesType");
            return (Criteria) this;
        }

        public Criteria andTsClothesTypeNotEqualTo(String value) {
            addCriterion("ts_clothes_type <>", value, "tsClothesType");
            return (Criteria) this;
        }

        public Criteria andTsClothesTypeGreaterThan(String value) {
            addCriterion("ts_clothes_type >", value, "tsClothesType");
            return (Criteria) this;
        }

        public Criteria andTsClothesTypeGreaterThanOrEqualTo(String value) {
            addCriterion("ts_clothes_type >=", value, "tsClothesType");
            return (Criteria) this;
        }

        public Criteria andTsClothesTypeLessThan(String value) {
            addCriterion("ts_clothes_type <", value, "tsClothesType");
            return (Criteria) this;
        }

        public Criteria andTsClothesTypeLessThanOrEqualTo(String value) {
            addCriterion("ts_clothes_type <=", value, "tsClothesType");
            return (Criteria) this;
        }

        public Criteria andTsClothesTypeLike(String value) {
            addCriterion("ts_clothes_type like", value, "tsClothesType");
            return (Criteria) this;
        }

        public Criteria andTsClothesTypeNotLike(String value) {
            addCriterion("ts_clothes_type not like", value, "tsClothesType");
            return (Criteria) this;
        }

        public Criteria andTsClothesTypeIn(List<String> values) {
            addCriterion("ts_clothes_type in", values, "tsClothesType");
            return (Criteria) this;
        }

        public Criteria andTsClothesTypeNotIn(List<String> values) {
            addCriterion("ts_clothes_type not in", values, "tsClothesType");
            return (Criteria) this;
        }

        public Criteria andTsClothesTypeBetween(String value1, String value2) {
            addCriterion("ts_clothes_type between", value1, value2, "tsClothesType");
            return (Criteria) this;
        }

        public Criteria andTsClothesTypeNotBetween(String value1, String value2) {
            addCriterion("ts_clothes_type not between", value1, value2, "tsClothesType");
            return (Criteria) this;
        }

        public Criteria andTsClothesStyleIsNull() {
            addCriterion("ts_clothes_style is null");
            return (Criteria) this;
        }

        public Criteria andTsClothesStyleIsNotNull() {
            addCriterion("ts_clothes_style is not null");
            return (Criteria) this;
        }

        public Criteria andTsClothesStyleEqualTo(String value) {
            addCriterion("ts_clothes_style =", value, "tsClothesStyle");
            return (Criteria) this;
        }

        public Criteria andTsClothesStyleNotEqualTo(String value) {
            addCriterion("ts_clothes_style <>", value, "tsClothesStyle");
            return (Criteria) this;
        }

        public Criteria andTsClothesStyleGreaterThan(String value) {
            addCriterion("ts_clothes_style >", value, "tsClothesStyle");
            return (Criteria) this;
        }

        public Criteria andTsClothesStyleGreaterThanOrEqualTo(String value) {
            addCriterion("ts_clothes_style >=", value, "tsClothesStyle");
            return (Criteria) this;
        }

        public Criteria andTsClothesStyleLessThan(String value) {
            addCriterion("ts_clothes_style <", value, "tsClothesStyle");
            return (Criteria) this;
        }

        public Criteria andTsClothesStyleLessThanOrEqualTo(String value) {
            addCriterion("ts_clothes_style <=", value, "tsClothesStyle");
            return (Criteria) this;
        }

        public Criteria andTsClothesStyleLike(String value) {
            addCriterion("ts_clothes_style like", value, "tsClothesStyle");
            return (Criteria) this;
        }

        public Criteria andTsClothesStyleNotLike(String value) {
            addCriterion("ts_clothes_style not like", value, "tsClothesStyle");
            return (Criteria) this;
        }

        public Criteria andTsClothesStyleIn(List<String> values) {
            addCriterion("ts_clothes_style in", values, "tsClothesStyle");
            return (Criteria) this;
        }

        public Criteria andTsClothesStyleNotIn(List<String> values) {
            addCriterion("ts_clothes_style not in", values, "tsClothesStyle");
            return (Criteria) this;
        }

        public Criteria andTsClothesStyleBetween(String value1, String value2) {
            addCriterion("ts_clothes_style between", value1, value2, "tsClothesStyle");
            return (Criteria) this;
        }

        public Criteria andTsClothesStyleNotBetween(String value1, String value2) {
            addCriterion("ts_clothes_style not between", value1, value2, "tsClothesStyle");
            return (Criteria) this;
        }

        public Criteria andTsClothesSizeIsNull() {
            addCriterion("ts_clothes_size is null");
            return (Criteria) this;
        }

        public Criteria andTsClothesSizeIsNotNull() {
            addCriterion("ts_clothes_size is not null");
            return (Criteria) this;
        }

        public Criteria andTsClothesSizeEqualTo(String value) {
            addCriterion("ts_clothes_size =", value, "tsClothesSize");
            return (Criteria) this;
        }

        public Criteria andTsClothesSizeNotEqualTo(String value) {
            addCriterion("ts_clothes_size <>", value, "tsClothesSize");
            return (Criteria) this;
        }

        public Criteria andTsClothesSizeGreaterThan(String value) {
            addCriterion("ts_clothes_size >", value, "tsClothesSize");
            return (Criteria) this;
        }

        public Criteria andTsClothesSizeGreaterThanOrEqualTo(String value) {
            addCriterion("ts_clothes_size >=", value, "tsClothesSize");
            return (Criteria) this;
        }

        public Criteria andTsClothesSizeLessThan(String value) {
            addCriterion("ts_clothes_size <", value, "tsClothesSize");
            return (Criteria) this;
        }

        public Criteria andTsClothesSizeLessThanOrEqualTo(String value) {
            addCriterion("ts_clothes_size <=", value, "tsClothesSize");
            return (Criteria) this;
        }

        public Criteria andTsClothesSizeLike(String value) {
            addCriterion("ts_clothes_size like", value, "tsClothesSize");
            return (Criteria) this;
        }

        public Criteria andTsClothesSizeNotLike(String value) {
            addCriterion("ts_clothes_size not like", value, "tsClothesSize");
            return (Criteria) this;
        }

        public Criteria andTsClothesSizeIn(List<String> values) {
            addCriterion("ts_clothes_size in", values, "tsClothesSize");
            return (Criteria) this;
        }

        public Criteria andTsClothesSizeNotIn(List<String> values) {
            addCriterion("ts_clothes_size not in", values, "tsClothesSize");
            return (Criteria) this;
        }

        public Criteria andTsClothesSizeBetween(String value1, String value2) {
            addCriterion("ts_clothes_size between", value1, value2, "tsClothesSize");
            return (Criteria) this;
        }

        public Criteria andTsClothesSizeNotBetween(String value1, String value2) {
            addCriterion("ts_clothes_size not between", value1, value2, "tsClothesSize");
            return (Criteria) this;
        }

        public Criteria andTsClothesColorIsNull() {
            addCriterion("ts_clothes_color is null");
            return (Criteria) this;
        }

        public Criteria andTsClothesColorIsNotNull() {
            addCriterion("ts_clothes_color is not null");
            return (Criteria) this;
        }

        public Criteria andTsClothesColorEqualTo(String value) {
            addCriterion("ts_clothes_color =", value, "tsClothesColor");
            return (Criteria) this;
        }

        public Criteria andTsClothesColorNotEqualTo(String value) {
            addCriterion("ts_clothes_color <>", value, "tsClothesColor");
            return (Criteria) this;
        }

        public Criteria andTsClothesColorGreaterThan(String value) {
            addCriterion("ts_clothes_color >", value, "tsClothesColor");
            return (Criteria) this;
        }

        public Criteria andTsClothesColorGreaterThanOrEqualTo(String value) {
            addCriterion("ts_clothes_color >=", value, "tsClothesColor");
            return (Criteria) this;
        }

        public Criteria andTsClothesColorLessThan(String value) {
            addCriterion("ts_clothes_color <", value, "tsClothesColor");
            return (Criteria) this;
        }

        public Criteria andTsClothesColorLessThanOrEqualTo(String value) {
            addCriterion("ts_clothes_color <=", value, "tsClothesColor");
            return (Criteria) this;
        }

        public Criteria andTsClothesColorLike(String value) {
            addCriterion("ts_clothes_color like", value, "tsClothesColor");
            return (Criteria) this;
        }

        public Criteria andTsClothesColorNotLike(String value) {
            addCriterion("ts_clothes_color not like", value, "tsClothesColor");
            return (Criteria) this;
        }

        public Criteria andTsClothesColorIn(List<String> values) {
            addCriterion("ts_clothes_color in", values, "tsClothesColor");
            return (Criteria) this;
        }

        public Criteria andTsClothesColorNotIn(List<String> values) {
            addCriterion("ts_clothes_color not in", values, "tsClothesColor");
            return (Criteria) this;
        }

        public Criteria andTsClothesColorBetween(String value1, String value2) {
            addCriterion("ts_clothes_color between", value1, value2, "tsClothesColor");
            return (Criteria) this;
        }

        public Criteria andTsClothesColorNotBetween(String value1, String value2) {
            addCriterion("ts_clothes_color not between", value1, value2, "tsClothesColor");
            return (Criteria) this;
        }

        public Criteria andTsClothesClothIsNull() {
            addCriterion("ts_clothes_cloth is null");
            return (Criteria) this;
        }

        public Criteria andTsClothesClothIsNotNull() {
            addCriterion("ts_clothes_cloth is not null");
            return (Criteria) this;
        }

        public Criteria andTsClothesClothEqualTo(String value) {
            addCriterion("ts_clothes_cloth =", value, "tsClothesCloth");
            return (Criteria) this;
        }

        public Criteria andTsClothesClothNotEqualTo(String value) {
            addCriterion("ts_clothes_cloth <>", value, "tsClothesCloth");
            return (Criteria) this;
        }

        public Criteria andTsClothesClothGreaterThan(String value) {
            addCriterion("ts_clothes_cloth >", value, "tsClothesCloth");
            return (Criteria) this;
        }

        public Criteria andTsClothesClothGreaterThanOrEqualTo(String value) {
            addCriterion("ts_clothes_cloth >=", value, "tsClothesCloth");
            return (Criteria) this;
        }

        public Criteria andTsClothesClothLessThan(String value) {
            addCriterion("ts_clothes_cloth <", value, "tsClothesCloth");
            return (Criteria) this;
        }

        public Criteria andTsClothesClothLessThanOrEqualTo(String value) {
            addCriterion("ts_clothes_cloth <=", value, "tsClothesCloth");
            return (Criteria) this;
        }

        public Criteria andTsClothesClothLike(String value) {
            addCriterion("ts_clothes_cloth like", value, "tsClothesCloth");
            return (Criteria) this;
        }

        public Criteria andTsClothesClothNotLike(String value) {
            addCriterion("ts_clothes_cloth not like", value, "tsClothesCloth");
            return (Criteria) this;
        }

        public Criteria andTsClothesClothIn(List<String> values) {
            addCriterion("ts_clothes_cloth in", values, "tsClothesCloth");
            return (Criteria) this;
        }

        public Criteria andTsClothesClothNotIn(List<String> values) {
            addCriterion("ts_clothes_cloth not in", values, "tsClothesCloth");
            return (Criteria) this;
        }

        public Criteria andTsClothesClothBetween(String value1, String value2) {
            addCriterion("ts_clothes_cloth between", value1, value2, "tsClothesCloth");
            return (Criteria) this;
        }

        public Criteria andTsClothesClothNotBetween(String value1, String value2) {
            addCriterion("ts_clothes_cloth not between", value1, value2, "tsClothesCloth");
            return (Criteria) this;
        }

        public Criteria andTsClothesTimeIsNull() {
            addCriterion("ts_clothes_time is null");
            return (Criteria) this;
        }

        public Criteria andTsClothesTimeIsNotNull() {
            addCriterion("ts_clothes_time is not null");
            return (Criteria) this;
        }

        public Criteria andTsClothesTimeEqualTo(String value) {
            addCriterion("ts_clothes_time =", value, "tsClothesTime");
            return (Criteria) this;
        }

        public Criteria andTsClothesTimeNotEqualTo(String value) {
            addCriterion("ts_clothes_time <>", value, "tsClothesTime");
            return (Criteria) this;
        }

        public Criteria andTsClothesTimeGreaterThan(String value) {
            addCriterion("ts_clothes_time >", value, "tsClothesTime");
            return (Criteria) this;
        }

        public Criteria andTsClothesTimeGreaterThanOrEqualTo(String value) {
            addCriterion("ts_clothes_time >=", value, "tsClothesTime");
            return (Criteria) this;
        }

        public Criteria andTsClothesTimeLessThan(String value) {
            addCriterion("ts_clothes_time <", value, "tsClothesTime");
            return (Criteria) this;
        }

        public Criteria andTsClothesTimeLessThanOrEqualTo(String value) {
            addCriterion("ts_clothes_time <=", value, "tsClothesTime");
            return (Criteria) this;
        }

        public Criteria andTsClothesTimeLike(String value) {
            addCriterion("ts_clothes_time like", value, "tsClothesTime");
            return (Criteria) this;
        }

        public Criteria andTsClothesTimeNotLike(String value) {
            addCriterion("ts_clothes_time not like", value, "tsClothesTime");
            return (Criteria) this;
        }

        public Criteria andTsClothesTimeIn(List<String> values) {
            addCriterion("ts_clothes_time in", values, "tsClothesTime");
            return (Criteria) this;
        }

        public Criteria andTsClothesTimeNotIn(List<String> values) {
            addCriterion("ts_clothes_time not in", values, "tsClothesTime");
            return (Criteria) this;
        }

        public Criteria andTsClothesTimeBetween(String value1, String value2) {
            addCriterion("ts_clothes_time between", value1, value2, "tsClothesTime");
            return (Criteria) this;
        }

        public Criteria andTsClothesTimeNotBetween(String value1, String value2) {
            addCriterion("ts_clothes_time not between", value1, value2, "tsClothesTime");
            return (Criteria) this;
        }

        public Criteria andTsClothesPeopleIsNull() {
            addCriterion("ts_clothes_people is null");
            return (Criteria) this;
        }

        public Criteria andTsClothesPeopleIsNotNull() {
            addCriterion("ts_clothes_people is not null");
            return (Criteria) this;
        }

        public Criteria andTsClothesPeopleEqualTo(String value) {
            addCriterion("ts_clothes_people =", value, "tsClothesPeople");
            return (Criteria) this;
        }

        public Criteria andTsClothesPeopleNotEqualTo(String value) {
            addCriterion("ts_clothes_people <>", value, "tsClothesPeople");
            return (Criteria) this;
        }

        public Criteria andTsClothesPeopleGreaterThan(String value) {
            addCriterion("ts_clothes_people >", value, "tsClothesPeople");
            return (Criteria) this;
        }

        public Criteria andTsClothesPeopleGreaterThanOrEqualTo(String value) {
            addCriterion("ts_clothes_people >=", value, "tsClothesPeople");
            return (Criteria) this;
        }

        public Criteria andTsClothesPeopleLessThan(String value) {
            addCriterion("ts_clothes_people <", value, "tsClothesPeople");
            return (Criteria) this;
        }

        public Criteria andTsClothesPeopleLessThanOrEqualTo(String value) {
            addCriterion("ts_clothes_people <=", value, "tsClothesPeople");
            return (Criteria) this;
        }

        public Criteria andTsClothesPeopleLike(String value) {
            addCriterion("ts_clothes_people like", value, "tsClothesPeople");
            return (Criteria) this;
        }

        public Criteria andTsClothesPeopleNotLike(String value) {
            addCriterion("ts_clothes_people not like", value, "tsClothesPeople");
            return (Criteria) this;
        }

        public Criteria andTsClothesPeopleIn(List<String> values) {
            addCriterion("ts_clothes_people in", values, "tsClothesPeople");
            return (Criteria) this;
        }

        public Criteria andTsClothesPeopleNotIn(List<String> values) {
            addCriterion("ts_clothes_people not in", values, "tsClothesPeople");
            return (Criteria) this;
        }

        public Criteria andTsClothesPeopleBetween(String value1, String value2) {
            addCriterion("ts_clothes_people between", value1, value2, "tsClothesPeople");
            return (Criteria) this;
        }

        public Criteria andTsClothesPeopleNotBetween(String value1, String value2) {
            addCriterion("ts_clothes_people not between", value1, value2, "tsClothesPeople");
            return (Criteria) this;
        }

        public Criteria andTsClothesPictureIsNull() {
            addCriterion("ts_clothes_picture is null");
            return (Criteria) this;
        }

        public Criteria andTsClothesPictureIsNotNull() {
            addCriterion("ts_clothes_picture is not null");
            return (Criteria) this;
        }

        public Criteria andTsClothesPictureEqualTo(String value) {
            addCriterion("ts_clothes_picture =", value, "tsClothesPicture");
            return (Criteria) this;
        }

        public Criteria andTsClothesPictureNotEqualTo(String value) {
            addCriterion("ts_clothes_picture <>", value, "tsClothesPicture");
            return (Criteria) this;
        }

        public Criteria andTsClothesPictureGreaterThan(String value) {
            addCriterion("ts_clothes_picture >", value, "tsClothesPicture");
            return (Criteria) this;
        }

        public Criteria andTsClothesPictureGreaterThanOrEqualTo(String value) {
            addCriterion("ts_clothes_picture >=", value, "tsClothesPicture");
            return (Criteria) this;
        }

        public Criteria andTsClothesPictureLessThan(String value) {
            addCriterion("ts_clothes_picture <", value, "tsClothesPicture");
            return (Criteria) this;
        }

        public Criteria andTsClothesPictureLessThanOrEqualTo(String value) {
            addCriterion("ts_clothes_picture <=", value, "tsClothesPicture");
            return (Criteria) this;
        }

        public Criteria andTsClothesPictureLike(String value) {
            addCriterion("ts_clothes_picture like", value, "tsClothesPicture");
            return (Criteria) this;
        }

        public Criteria andTsClothesPictureNotLike(String value) {
            addCriterion("ts_clothes_picture not like", value, "tsClothesPicture");
            return (Criteria) this;
        }

        public Criteria andTsClothesPictureIn(List<String> values) {
            addCriterion("ts_clothes_picture in", values, "tsClothesPicture");
            return (Criteria) this;
        }

        public Criteria andTsClothesPictureNotIn(List<String> values) {
            addCriterion("ts_clothes_picture not in", values, "tsClothesPicture");
            return (Criteria) this;
        }

        public Criteria andTsClothesPictureBetween(String value1, String value2) {
            addCriterion("ts_clothes_picture between", value1, value2, "tsClothesPicture");
            return (Criteria) this;
        }

        public Criteria andTsClothesPictureNotBetween(String value1, String value2) {
            addCriterion("ts_clothes_picture not between", value1, value2, "tsClothesPicture");
            return (Criteria) this;
        }

        public Criteria andTsClothesNumberIsNull() {
            addCriterion("ts_clothes_number is null");
            return (Criteria) this;
        }

        public Criteria andTsClothesNumberIsNotNull() {
            addCriterion("ts_clothes_number is not null");
            return (Criteria) this;
        }

        public Criteria andTsClothesNumberEqualTo(Integer value) {
            addCriterion("ts_clothes_number =", value, "tsClothesNumber");
            return (Criteria) this;
        }

        public Criteria andTsClothesNumberNotEqualTo(Integer value) {
            addCriterion("ts_clothes_number <>", value, "tsClothesNumber");
            return (Criteria) this;
        }

        public Criteria andTsClothesNumberGreaterThan(Integer value) {
            addCriterion("ts_clothes_number >", value, "tsClothesNumber");
            return (Criteria) this;
        }

        public Criteria andTsClothesNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("ts_clothes_number >=", value, "tsClothesNumber");
            return (Criteria) this;
        }

        public Criteria andTsClothesNumberLessThan(Integer value) {
            addCriterion("ts_clothes_number <", value, "tsClothesNumber");
            return (Criteria) this;
        }

        public Criteria andTsClothesNumberLessThanOrEqualTo(Integer value) {
            addCriterion("ts_clothes_number <=", value, "tsClothesNumber");
            return (Criteria) this;
        }

        public Criteria andTsClothesNumberIn(List<Integer> values) {
            addCriterion("ts_clothes_number in", values, "tsClothesNumber");
            return (Criteria) this;
        }

        public Criteria andTsClothesNumberNotIn(List<Integer> values) {
            addCriterion("ts_clothes_number not in", values, "tsClothesNumber");
            return (Criteria) this;
        }

        public Criteria andTsClothesNumberBetween(Integer value1, Integer value2) {
            addCriterion("ts_clothes_number between", value1, value2, "tsClothesNumber");
            return (Criteria) this;
        }

        public Criteria andTsClothesNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("ts_clothes_number not between", value1, value2, "tsClothesNumber");
            return (Criteria) this;
        }

        public Criteria andTsClothesMoneyIsNull() {
            addCriterion("ts_clothes_money is null");
            return (Criteria) this;
        }

        public Criteria andTsClothesMoneyIsNotNull() {
            addCriterion("ts_clothes_money is not null");
            return (Criteria) this;
        }

        public Criteria andTsClothesMoneyEqualTo(Double value) {
            addCriterion("ts_clothes_money =", value, "tsClothesMoney");
            return (Criteria) this;
        }

        public Criteria andTsClothesMoneyNotEqualTo(Double value) {
            addCriterion("ts_clothes_money <>", value, "tsClothesMoney");
            return (Criteria) this;
        }

        public Criteria andTsClothesMoneyGreaterThan(Double value) {
            addCriterion("ts_clothes_money >", value, "tsClothesMoney");
            return (Criteria) this;
        }

        public Criteria andTsClothesMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("ts_clothes_money >=", value, "tsClothesMoney");
            return (Criteria) this;
        }

        public Criteria andTsClothesMoneyLessThan(Double value) {
            addCriterion("ts_clothes_money <", value, "tsClothesMoney");
            return (Criteria) this;
        }

        public Criteria andTsClothesMoneyLessThanOrEqualTo(Double value) {
            addCriterion("ts_clothes_money <=", value, "tsClothesMoney");
            return (Criteria) this;
        }

        public Criteria andTsClothesMoneyIn(List<Double> values) {
            addCriterion("ts_clothes_money in", values, "tsClothesMoney");
            return (Criteria) this;
        }

        public Criteria andTsClothesMoneyNotIn(List<Double> values) {
            addCriterion("ts_clothes_money not in", values, "tsClothesMoney");
            return (Criteria) this;
        }

        public Criteria andTsClothesMoneyBetween(Double value1, Double value2) {
            addCriterion("ts_clothes_money between", value1, value2, "tsClothesMoney");
            return (Criteria) this;
        }

        public Criteria andTsClothesMoneyNotBetween(Double value1, Double value2) {
            addCriterion("ts_clothes_money not between", value1, value2, "tsClothesMoney");
            return (Criteria) this;
        }

        public Criteria andTsClothesIntroduceIsNull() {
            addCriterion("ts_clothes_introduce is null");
            return (Criteria) this;
        }

        public Criteria andTsClothesIntroduceIsNotNull() {
            addCriterion("ts_clothes_introduce is not null");
            return (Criteria) this;
        }

        public Criteria andTsClothesIntroduceEqualTo(String value) {
            addCriterion("ts_clothes_introduce =", value, "tsClothesIntroduce");
            return (Criteria) this;
        }

        public Criteria andTsClothesIntroduceNotEqualTo(String value) {
            addCriterion("ts_clothes_introduce <>", value, "tsClothesIntroduce");
            return (Criteria) this;
        }

        public Criteria andTsClothesIntroduceGreaterThan(String value) {
            addCriterion("ts_clothes_introduce >", value, "tsClothesIntroduce");
            return (Criteria) this;
        }

        public Criteria andTsClothesIntroduceGreaterThanOrEqualTo(String value) {
            addCriterion("ts_clothes_introduce >=", value, "tsClothesIntroduce");
            return (Criteria) this;
        }

        public Criteria andTsClothesIntroduceLessThan(String value) {
            addCriterion("ts_clothes_introduce <", value, "tsClothesIntroduce");
            return (Criteria) this;
        }

        public Criteria andTsClothesIntroduceLessThanOrEqualTo(String value) {
            addCriterion("ts_clothes_introduce <=", value, "tsClothesIntroduce");
            return (Criteria) this;
        }

        public Criteria andTsClothesIntroduceLike(String value) {
            addCriterion("ts_clothes_introduce like", value, "tsClothesIntroduce");
            return (Criteria) this;
        }

        public Criteria andTsClothesIntroduceNotLike(String value) {
            addCriterion("ts_clothes_introduce not like", value, "tsClothesIntroduce");
            return (Criteria) this;
        }

        public Criteria andTsClothesIntroduceIn(List<String> values) {
            addCriterion("ts_clothes_introduce in", values, "tsClothesIntroduce");
            return (Criteria) this;
        }

        public Criteria andTsClothesIntroduceNotIn(List<String> values) {
            addCriterion("ts_clothes_introduce not in", values, "tsClothesIntroduce");
            return (Criteria) this;
        }

        public Criteria andTsClothesIntroduceBetween(String value1, String value2) {
            addCriterion("ts_clothes_introduce between", value1, value2, "tsClothesIntroduce");
            return (Criteria) this;
        }

        public Criteria andTsClothesIntroduceNotBetween(String value1, String value2) {
            addCriterion("ts_clothes_introduce not between", value1, value2, "tsClothesIntroduce");
            return (Criteria) this;
        }

        public Criteria andTsClothesStateIsNull() {
            addCriterion("ts_clothes_state is null");
            return (Criteria) this;
        }

        public Criteria andTsClothesStateIsNotNull() {
            addCriterion("ts_clothes_state is not null");
            return (Criteria) this;
        }

        public Criteria andTsClothesStateEqualTo(String value) {
            addCriterion("ts_clothes_state =", value, "tsClothesState");
            return (Criteria) this;
        }

        public Criteria andTsClothesStateNotEqualTo(String value) {
            addCriterion("ts_clothes_state <>", value, "tsClothesState");
            return (Criteria) this;
        }

        public Criteria andTsClothesStateGreaterThan(String value) {
            addCriterion("ts_clothes_state >", value, "tsClothesState");
            return (Criteria) this;
        }

        public Criteria andTsClothesStateGreaterThanOrEqualTo(String value) {
            addCriterion("ts_clothes_state >=", value, "tsClothesState");
            return (Criteria) this;
        }

        public Criteria andTsClothesStateLessThan(String value) {
            addCriterion("ts_clothes_state <", value, "tsClothesState");
            return (Criteria) this;
        }

        public Criteria andTsClothesStateLessThanOrEqualTo(String value) {
            addCriterion("ts_clothes_state <=", value, "tsClothesState");
            return (Criteria) this;
        }

        public Criteria andTsClothesStateLike(String value) {
            addCriterion("ts_clothes_state like", value, "tsClothesState");
            return (Criteria) this;
        }

        public Criteria andTsClothesStateNotLike(String value) {
            addCriterion("ts_clothes_state not like", value, "tsClothesState");
            return (Criteria) this;
        }

        public Criteria andTsClothesStateIn(List<String> values) {
            addCriterion("ts_clothes_state in", values, "tsClothesState");
            return (Criteria) this;
        }

        public Criteria andTsClothesStateNotIn(List<String> values) {
            addCriterion("ts_clothes_state not in", values, "tsClothesState");
            return (Criteria) this;
        }

        public Criteria andTsClothesStateBetween(String value1, String value2) {
            addCriterion("ts_clothes_state between", value1, value2, "tsClothesState");
            return (Criteria) this;
        }

        public Criteria andTsClothesStateNotBetween(String value1, String value2) {
            addCriterion("ts_clothes_state not between", value1, value2, "tsClothesState");
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