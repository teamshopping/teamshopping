package com.neusoft.bean;

import java.util.ArrayList;
import java.util.List;

public class TeamshoppingTrousersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TeamshoppingTrousersExample() {
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

        public Criteria andTsTrousersIdIsNull() {
            addCriterion("ts_trousers_id is null");
            return (Criteria) this;
        }

        public Criteria andTsTrousersIdIsNotNull() {
            addCriterion("ts_trousers_id is not null");
            return (Criteria) this;
        }

        public Criteria andTsTrousersIdEqualTo(Integer value) {
            addCriterion("ts_trousers_id =", value, "tsTrousersId");
            return (Criteria) this;
        }

        public Criteria andTsTrousersIdNotEqualTo(Integer value) {
            addCriterion("ts_trousers_id <>", value, "tsTrousersId");
            return (Criteria) this;
        }

        public Criteria andTsTrousersIdGreaterThan(Integer value) {
            addCriterion("ts_trousers_id >", value, "tsTrousersId");
            return (Criteria) this;
        }

        public Criteria andTsTrousersIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ts_trousers_id >=", value, "tsTrousersId");
            return (Criteria) this;
        }

        public Criteria andTsTrousersIdLessThan(Integer value) {
            addCriterion("ts_trousers_id <", value, "tsTrousersId");
            return (Criteria) this;
        }

        public Criteria andTsTrousersIdLessThanOrEqualTo(Integer value) {
            addCriterion("ts_trousers_id <=", value, "tsTrousersId");
            return (Criteria) this;
        }

        public Criteria andTsTrousersIdIn(List<Integer> values) {
            addCriterion("ts_trousers_id in", values, "tsTrousersId");
            return (Criteria) this;
        }

        public Criteria andTsTrousersIdNotIn(List<Integer> values) {
            addCriterion("ts_trousers_id not in", values, "tsTrousersId");
            return (Criteria) this;
        }

        public Criteria andTsTrousersIdBetween(Integer value1, Integer value2) {
            addCriterion("ts_trousers_id between", value1, value2, "tsTrousersId");
            return (Criteria) this;
        }

        public Criteria andTsTrousersIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ts_trousers_id not between", value1, value2, "tsTrousersId");
            return (Criteria) this;
        }

        public Criteria andTsTrousersBrandIsNull() {
            addCriterion("ts_trousers_brand is null");
            return (Criteria) this;
        }

        public Criteria andTsTrousersBrandIsNotNull() {
            addCriterion("ts_trousers_brand is not null");
            return (Criteria) this;
        }

        public Criteria andTsTrousersBrandEqualTo(String value) {
            addCriterion("ts_trousers_brand =", value, "tsTrousersBrand");
            return (Criteria) this;
        }

        public Criteria andTsTrousersBrandNotEqualTo(String value) {
            addCriterion("ts_trousers_brand <>", value, "tsTrousersBrand");
            return (Criteria) this;
        }

        public Criteria andTsTrousersBrandGreaterThan(String value) {
            addCriterion("ts_trousers_brand >", value, "tsTrousersBrand");
            return (Criteria) this;
        }

        public Criteria andTsTrousersBrandGreaterThanOrEqualTo(String value) {
            addCriterion("ts_trousers_brand >=", value, "tsTrousersBrand");
            return (Criteria) this;
        }

        public Criteria andTsTrousersBrandLessThan(String value) {
            addCriterion("ts_trousers_brand <", value, "tsTrousersBrand");
            return (Criteria) this;
        }

        public Criteria andTsTrousersBrandLessThanOrEqualTo(String value) {
            addCriterion("ts_trousers_brand <=", value, "tsTrousersBrand");
            return (Criteria) this;
        }

        public Criteria andTsTrousersBrandLike(String value) {
            addCriterion("ts_trousers_brand like", value, "tsTrousersBrand");
            return (Criteria) this;
        }

        public Criteria andTsTrousersBrandNotLike(String value) {
            addCriterion("ts_trousers_brand not like", value, "tsTrousersBrand");
            return (Criteria) this;
        }

        public Criteria andTsTrousersBrandIn(List<String> values) {
            addCriterion("ts_trousers_brand in", values, "tsTrousersBrand");
            return (Criteria) this;
        }

        public Criteria andTsTrousersBrandNotIn(List<String> values) {
            addCriterion("ts_trousers_brand not in", values, "tsTrousersBrand");
            return (Criteria) this;
        }

        public Criteria andTsTrousersBrandBetween(String value1, String value2) {
            addCriterion("ts_trousers_brand between", value1, value2, "tsTrousersBrand");
            return (Criteria) this;
        }

        public Criteria andTsTrousersBrandNotBetween(String value1, String value2) {
            addCriterion("ts_trousers_brand not between", value1, value2, "tsTrousersBrand");
            return (Criteria) this;
        }

        public Criteria andTsTrousersTypeIsNull() {
            addCriterion("ts_trousers_type is null");
            return (Criteria) this;
        }

        public Criteria andTsTrousersTypeIsNotNull() {
            addCriterion("ts_trousers_type is not null");
            return (Criteria) this;
        }

        public Criteria andTsTrousersTypeEqualTo(String value) {
            addCriterion("ts_trousers_type =", value, "tsTrousersType");
            return (Criteria) this;
        }

        public Criteria andTsTrousersTypeNotEqualTo(String value) {
            addCriterion("ts_trousers_type <>", value, "tsTrousersType");
            return (Criteria) this;
        }

        public Criteria andTsTrousersTypeGreaterThan(String value) {
            addCriterion("ts_trousers_type >", value, "tsTrousersType");
            return (Criteria) this;
        }

        public Criteria andTsTrousersTypeGreaterThanOrEqualTo(String value) {
            addCriterion("ts_trousers_type >=", value, "tsTrousersType");
            return (Criteria) this;
        }

        public Criteria andTsTrousersTypeLessThan(String value) {
            addCriterion("ts_trousers_type <", value, "tsTrousersType");
            return (Criteria) this;
        }

        public Criteria andTsTrousersTypeLessThanOrEqualTo(String value) {
            addCriterion("ts_trousers_type <=", value, "tsTrousersType");
            return (Criteria) this;
        }

        public Criteria andTsTrousersTypeLike(String value) {
            addCriterion("ts_trousers_type like", value, "tsTrousersType");
            return (Criteria) this;
        }

        public Criteria andTsTrousersTypeNotLike(String value) {
            addCriterion("ts_trousers_type not like", value, "tsTrousersType");
            return (Criteria) this;
        }

        public Criteria andTsTrousersTypeIn(List<String> values) {
            addCriterion("ts_trousers_type in", values, "tsTrousersType");
            return (Criteria) this;
        }

        public Criteria andTsTrousersTypeNotIn(List<String> values) {
            addCriterion("ts_trousers_type not in", values, "tsTrousersType");
            return (Criteria) this;
        }

        public Criteria andTsTrousersTypeBetween(String value1, String value2) {
            addCriterion("ts_trousers_type between", value1, value2, "tsTrousersType");
            return (Criteria) this;
        }

        public Criteria andTsTrousersTypeNotBetween(String value1, String value2) {
            addCriterion("ts_trousers_type not between", value1, value2, "tsTrousersType");
            return (Criteria) this;
        }

        public Criteria andTsTrousersStyleIsNull() {
            addCriterion("ts_trousers_style is null");
            return (Criteria) this;
        }

        public Criteria andTsTrousersStyleIsNotNull() {
            addCriterion("ts_trousers_style is not null");
            return (Criteria) this;
        }

        public Criteria andTsTrousersStyleEqualTo(String value) {
            addCriterion("ts_trousers_style =", value, "tsTrousersStyle");
            return (Criteria) this;
        }

        public Criteria andTsTrousersStyleNotEqualTo(String value) {
            addCriterion("ts_trousers_style <>", value, "tsTrousersStyle");
            return (Criteria) this;
        }

        public Criteria andTsTrousersStyleGreaterThan(String value) {
            addCriterion("ts_trousers_style >", value, "tsTrousersStyle");
            return (Criteria) this;
        }

        public Criteria andTsTrousersStyleGreaterThanOrEqualTo(String value) {
            addCriterion("ts_trousers_style >=", value, "tsTrousersStyle");
            return (Criteria) this;
        }

        public Criteria andTsTrousersStyleLessThan(String value) {
            addCriterion("ts_trousers_style <", value, "tsTrousersStyle");
            return (Criteria) this;
        }

        public Criteria andTsTrousersStyleLessThanOrEqualTo(String value) {
            addCriterion("ts_trousers_style <=", value, "tsTrousersStyle");
            return (Criteria) this;
        }

        public Criteria andTsTrousersStyleLike(String value) {
            addCriterion("ts_trousers_style like", value, "tsTrousersStyle");
            return (Criteria) this;
        }

        public Criteria andTsTrousersStyleNotLike(String value) {
            addCriterion("ts_trousers_style not like", value, "tsTrousersStyle");
            return (Criteria) this;
        }

        public Criteria andTsTrousersStyleIn(List<String> values) {
            addCriterion("ts_trousers_style in", values, "tsTrousersStyle");
            return (Criteria) this;
        }

        public Criteria andTsTrousersStyleNotIn(List<String> values) {
            addCriterion("ts_trousers_style not in", values, "tsTrousersStyle");
            return (Criteria) this;
        }

        public Criteria andTsTrousersStyleBetween(String value1, String value2) {
            addCriterion("ts_trousers_style between", value1, value2, "tsTrousersStyle");
            return (Criteria) this;
        }

        public Criteria andTsTrousersStyleNotBetween(String value1, String value2) {
            addCriterion("ts_trousers_style not between", value1, value2, "tsTrousersStyle");
            return (Criteria) this;
        }

        public Criteria andTsTrousersSizeIsNull() {
            addCriterion("ts_trousers_size is null");
            return (Criteria) this;
        }

        public Criteria andTsTrousersSizeIsNotNull() {
            addCriterion("ts_trousers_size is not null");
            return (Criteria) this;
        }

        public Criteria andTsTrousersSizeEqualTo(String value) {
            addCriterion("ts_trousers_size =", value, "tsTrousersSize");
            return (Criteria) this;
        }

        public Criteria andTsTrousersSizeNotEqualTo(String value) {
            addCriterion("ts_trousers_size <>", value, "tsTrousersSize");
            return (Criteria) this;
        }

        public Criteria andTsTrousersSizeGreaterThan(String value) {
            addCriterion("ts_trousers_size >", value, "tsTrousersSize");
            return (Criteria) this;
        }

        public Criteria andTsTrousersSizeGreaterThanOrEqualTo(String value) {
            addCriterion("ts_trousers_size >=", value, "tsTrousersSize");
            return (Criteria) this;
        }

        public Criteria andTsTrousersSizeLessThan(String value) {
            addCriterion("ts_trousers_size <", value, "tsTrousersSize");
            return (Criteria) this;
        }

        public Criteria andTsTrousersSizeLessThanOrEqualTo(String value) {
            addCriterion("ts_trousers_size <=", value, "tsTrousersSize");
            return (Criteria) this;
        }

        public Criteria andTsTrousersSizeLike(String value) {
            addCriterion("ts_trousers_size like", value, "tsTrousersSize");
            return (Criteria) this;
        }

        public Criteria andTsTrousersSizeNotLike(String value) {
            addCriterion("ts_trousers_size not like", value, "tsTrousersSize");
            return (Criteria) this;
        }

        public Criteria andTsTrousersSizeIn(List<String> values) {
            addCriterion("ts_trousers_size in", values, "tsTrousersSize");
            return (Criteria) this;
        }

        public Criteria andTsTrousersSizeNotIn(List<String> values) {
            addCriterion("ts_trousers_size not in", values, "tsTrousersSize");
            return (Criteria) this;
        }

        public Criteria andTsTrousersSizeBetween(String value1, String value2) {
            addCriterion("ts_trousers_size between", value1, value2, "tsTrousersSize");
            return (Criteria) this;
        }

        public Criteria andTsTrousersSizeNotBetween(String value1, String value2) {
            addCriterion("ts_trousers_size not between", value1, value2, "tsTrousersSize");
            return (Criteria) this;
        }

        public Criteria andTsTrousersColorIsNull() {
            addCriterion("ts_trousers_color is null");
            return (Criteria) this;
        }

        public Criteria andTsTrousersColorIsNotNull() {
            addCriterion("ts_trousers_color is not null");
            return (Criteria) this;
        }

        public Criteria andTsTrousersColorEqualTo(String value) {
            addCriterion("ts_trousers_color =", value, "tsTrousersColor");
            return (Criteria) this;
        }

        public Criteria andTsTrousersColorNotEqualTo(String value) {
            addCriterion("ts_trousers_color <>", value, "tsTrousersColor");
            return (Criteria) this;
        }

        public Criteria andTsTrousersColorGreaterThan(String value) {
            addCriterion("ts_trousers_color >", value, "tsTrousersColor");
            return (Criteria) this;
        }

        public Criteria andTsTrousersColorGreaterThanOrEqualTo(String value) {
            addCriterion("ts_trousers_color >=", value, "tsTrousersColor");
            return (Criteria) this;
        }

        public Criteria andTsTrousersColorLessThan(String value) {
            addCriterion("ts_trousers_color <", value, "tsTrousersColor");
            return (Criteria) this;
        }

        public Criteria andTsTrousersColorLessThanOrEqualTo(String value) {
            addCriterion("ts_trousers_color <=", value, "tsTrousersColor");
            return (Criteria) this;
        }

        public Criteria andTsTrousersColorLike(String value) {
            addCriterion("ts_trousers_color like", value, "tsTrousersColor");
            return (Criteria) this;
        }

        public Criteria andTsTrousersColorNotLike(String value) {
            addCriterion("ts_trousers_color not like", value, "tsTrousersColor");
            return (Criteria) this;
        }

        public Criteria andTsTrousersColorIn(List<String> values) {
            addCriterion("ts_trousers_color in", values, "tsTrousersColor");
            return (Criteria) this;
        }

        public Criteria andTsTrousersColorNotIn(List<String> values) {
            addCriterion("ts_trousers_color not in", values, "tsTrousersColor");
            return (Criteria) this;
        }

        public Criteria andTsTrousersColorBetween(String value1, String value2) {
            addCriterion("ts_trousers_color between", value1, value2, "tsTrousersColor");
            return (Criteria) this;
        }

        public Criteria andTsTrousersColorNotBetween(String value1, String value2) {
            addCriterion("ts_trousers_color not between", value1, value2, "tsTrousersColor");
            return (Criteria) this;
        }

        public Criteria andTsTrousersClothIsNull() {
            addCriterion("ts_trousers_cloth is null");
            return (Criteria) this;
        }

        public Criteria andTsTrousersClothIsNotNull() {
            addCriterion("ts_trousers_cloth is not null");
            return (Criteria) this;
        }

        public Criteria andTsTrousersClothEqualTo(String value) {
            addCriterion("ts_trousers_cloth =", value, "tsTrousersCloth");
            return (Criteria) this;
        }

        public Criteria andTsTrousersClothNotEqualTo(String value) {
            addCriterion("ts_trousers_cloth <>", value, "tsTrousersCloth");
            return (Criteria) this;
        }

        public Criteria andTsTrousersClothGreaterThan(String value) {
            addCriterion("ts_trousers_cloth >", value, "tsTrousersCloth");
            return (Criteria) this;
        }

        public Criteria andTsTrousersClothGreaterThanOrEqualTo(String value) {
            addCriterion("ts_trousers_cloth >=", value, "tsTrousersCloth");
            return (Criteria) this;
        }

        public Criteria andTsTrousersClothLessThan(String value) {
            addCriterion("ts_trousers_cloth <", value, "tsTrousersCloth");
            return (Criteria) this;
        }

        public Criteria andTsTrousersClothLessThanOrEqualTo(String value) {
            addCriterion("ts_trousers_cloth <=", value, "tsTrousersCloth");
            return (Criteria) this;
        }

        public Criteria andTsTrousersClothLike(String value) {
            addCriterion("ts_trousers_cloth like", value, "tsTrousersCloth");
            return (Criteria) this;
        }

        public Criteria andTsTrousersClothNotLike(String value) {
            addCriterion("ts_trousers_cloth not like", value, "tsTrousersCloth");
            return (Criteria) this;
        }

        public Criteria andTsTrousersClothIn(List<String> values) {
            addCriterion("ts_trousers_cloth in", values, "tsTrousersCloth");
            return (Criteria) this;
        }

        public Criteria andTsTrousersClothNotIn(List<String> values) {
            addCriterion("ts_trousers_cloth not in", values, "tsTrousersCloth");
            return (Criteria) this;
        }

        public Criteria andTsTrousersClothBetween(String value1, String value2) {
            addCriterion("ts_trousers_cloth between", value1, value2, "tsTrousersCloth");
            return (Criteria) this;
        }

        public Criteria andTsTrousersClothNotBetween(String value1, String value2) {
            addCriterion("ts_trousers_cloth not between", value1, value2, "tsTrousersCloth");
            return (Criteria) this;
        }

        public Criteria andTsTrousersPeopleIsNull() {
            addCriterion("ts_trousers_people is null");
            return (Criteria) this;
        }

        public Criteria andTsTrousersPeopleIsNotNull() {
            addCriterion("ts_trousers_people is not null");
            return (Criteria) this;
        }

        public Criteria andTsTrousersPeopleEqualTo(String value) {
            addCriterion("ts_trousers_people =", value, "tsTrousersPeople");
            return (Criteria) this;
        }

        public Criteria andTsTrousersPeopleNotEqualTo(String value) {
            addCriterion("ts_trousers_people <>", value, "tsTrousersPeople");
            return (Criteria) this;
        }

        public Criteria andTsTrousersPeopleGreaterThan(String value) {
            addCriterion("ts_trousers_people >", value, "tsTrousersPeople");
            return (Criteria) this;
        }

        public Criteria andTsTrousersPeopleGreaterThanOrEqualTo(String value) {
            addCriterion("ts_trousers_people >=", value, "tsTrousersPeople");
            return (Criteria) this;
        }

        public Criteria andTsTrousersPeopleLessThan(String value) {
            addCriterion("ts_trousers_people <", value, "tsTrousersPeople");
            return (Criteria) this;
        }

        public Criteria andTsTrousersPeopleLessThanOrEqualTo(String value) {
            addCriterion("ts_trousers_people <=", value, "tsTrousersPeople");
            return (Criteria) this;
        }

        public Criteria andTsTrousersPeopleLike(String value) {
            addCriterion("ts_trousers_people like", value, "tsTrousersPeople");
            return (Criteria) this;
        }

        public Criteria andTsTrousersPeopleNotLike(String value) {
            addCriterion("ts_trousers_people not like", value, "tsTrousersPeople");
            return (Criteria) this;
        }

        public Criteria andTsTrousersPeopleIn(List<String> values) {
            addCriterion("ts_trousers_people in", values, "tsTrousersPeople");
            return (Criteria) this;
        }

        public Criteria andTsTrousersPeopleNotIn(List<String> values) {
            addCriterion("ts_trousers_people not in", values, "tsTrousersPeople");
            return (Criteria) this;
        }

        public Criteria andTsTrousersPeopleBetween(String value1, String value2) {
            addCriterion("ts_trousers_people between", value1, value2, "tsTrousersPeople");
            return (Criteria) this;
        }

        public Criteria andTsTrousersPeopleNotBetween(String value1, String value2) {
            addCriterion("ts_trousers_people not between", value1, value2, "tsTrousersPeople");
            return (Criteria) this;
        }

        public Criteria andTsTrousersPictureIsNull() {
            addCriterion("ts_trousers_picture is null");
            return (Criteria) this;
        }

        public Criteria andTsTrousersPictureIsNotNull() {
            addCriterion("ts_trousers_picture is not null");
            return (Criteria) this;
        }

        public Criteria andTsTrousersPictureEqualTo(String value) {
            addCriterion("ts_trousers_picture =", value, "tsTrousersPicture");
            return (Criteria) this;
        }

        public Criteria andTsTrousersPictureNotEqualTo(String value) {
            addCriterion("ts_trousers_picture <>", value, "tsTrousersPicture");
            return (Criteria) this;
        }

        public Criteria andTsTrousersPictureGreaterThan(String value) {
            addCriterion("ts_trousers_picture >", value, "tsTrousersPicture");
            return (Criteria) this;
        }

        public Criteria andTsTrousersPictureGreaterThanOrEqualTo(String value) {
            addCriterion("ts_trousers_picture >=", value, "tsTrousersPicture");
            return (Criteria) this;
        }

        public Criteria andTsTrousersPictureLessThan(String value) {
            addCriterion("ts_trousers_picture <", value, "tsTrousersPicture");
            return (Criteria) this;
        }

        public Criteria andTsTrousersPictureLessThanOrEqualTo(String value) {
            addCriterion("ts_trousers_picture <=", value, "tsTrousersPicture");
            return (Criteria) this;
        }

        public Criteria andTsTrousersPictureLike(String value) {
            addCriterion("ts_trousers_picture like", value, "tsTrousersPicture");
            return (Criteria) this;
        }

        public Criteria andTsTrousersPictureNotLike(String value) {
            addCriterion("ts_trousers_picture not like", value, "tsTrousersPicture");
            return (Criteria) this;
        }

        public Criteria andTsTrousersPictureIn(List<String> values) {
            addCriterion("ts_trousers_picture in", values, "tsTrousersPicture");
            return (Criteria) this;
        }

        public Criteria andTsTrousersPictureNotIn(List<String> values) {
            addCriterion("ts_trousers_picture not in", values, "tsTrousersPicture");
            return (Criteria) this;
        }

        public Criteria andTsTrousersPictureBetween(String value1, String value2) {
            addCriterion("ts_trousers_picture between", value1, value2, "tsTrousersPicture");
            return (Criteria) this;
        }

        public Criteria andTsTrousersPictureNotBetween(String value1, String value2) {
            addCriterion("ts_trousers_picture not between", value1, value2, "tsTrousersPicture");
            return (Criteria) this;
        }

        public Criteria andTsTrousersNumberIsNull() {
            addCriterion("ts_trousers_number is null");
            return (Criteria) this;
        }

        public Criteria andTsTrousersNumberIsNotNull() {
            addCriterion("ts_trousers_number is not null");
            return (Criteria) this;
        }

        public Criteria andTsTrousersNumberEqualTo(Integer value) {
            addCriterion("ts_trousers_number =", value, "tsTrousersNumber");
            return (Criteria) this;
        }

        public Criteria andTsTrousersNumberNotEqualTo(Integer value) {
            addCriterion("ts_trousers_number <>", value, "tsTrousersNumber");
            return (Criteria) this;
        }

        public Criteria andTsTrousersNumberGreaterThan(Integer value) {
            addCriterion("ts_trousers_number >", value, "tsTrousersNumber");
            return (Criteria) this;
        }

        public Criteria andTsTrousersNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("ts_trousers_number >=", value, "tsTrousersNumber");
            return (Criteria) this;
        }

        public Criteria andTsTrousersNumberLessThan(Integer value) {
            addCriterion("ts_trousers_number <", value, "tsTrousersNumber");
            return (Criteria) this;
        }

        public Criteria andTsTrousersNumberLessThanOrEqualTo(Integer value) {
            addCriterion("ts_trousers_number <=", value, "tsTrousersNumber");
            return (Criteria) this;
        }

        public Criteria andTsTrousersNumberIn(List<Integer> values) {
            addCriterion("ts_trousers_number in", values, "tsTrousersNumber");
            return (Criteria) this;
        }

        public Criteria andTsTrousersNumberNotIn(List<Integer> values) {
            addCriterion("ts_trousers_number not in", values, "tsTrousersNumber");
            return (Criteria) this;
        }

        public Criteria andTsTrousersNumberBetween(Integer value1, Integer value2) {
            addCriterion("ts_trousers_number between", value1, value2, "tsTrousersNumber");
            return (Criteria) this;
        }

        public Criteria andTsTrousersNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("ts_trousers_number not between", value1, value2, "tsTrousersNumber");
            return (Criteria) this;
        }

        public Criteria andTsTrousersMoneyIsNull() {
            addCriterion("ts_trousers_money is null");
            return (Criteria) this;
        }

        public Criteria andTsTrousersMoneyIsNotNull() {
            addCriterion("ts_trousers_money is not null");
            return (Criteria) this;
        }

        public Criteria andTsTrousersMoneyEqualTo(Double value) {
            addCriterion("ts_trousers_money =", value, "tsTrousersMoney");
            return (Criteria) this;
        }

        public Criteria andTsTrousersMoneyNotEqualTo(Double value) {
            addCriterion("ts_trousers_money <>", value, "tsTrousersMoney");
            return (Criteria) this;
        }

        public Criteria andTsTrousersMoneyGreaterThan(Double value) {
            addCriterion("ts_trousers_money >", value, "tsTrousersMoney");
            return (Criteria) this;
        }

        public Criteria andTsTrousersMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("ts_trousers_money >=", value, "tsTrousersMoney");
            return (Criteria) this;
        }

        public Criteria andTsTrousersMoneyLessThan(Double value) {
            addCriterion("ts_trousers_money <", value, "tsTrousersMoney");
            return (Criteria) this;
        }

        public Criteria andTsTrousersMoneyLessThanOrEqualTo(Double value) {
            addCriterion("ts_trousers_money <=", value, "tsTrousersMoney");
            return (Criteria) this;
        }

        public Criteria andTsTrousersMoneyIn(List<Double> values) {
            addCriterion("ts_trousers_money in", values, "tsTrousersMoney");
            return (Criteria) this;
        }

        public Criteria andTsTrousersMoneyNotIn(List<Double> values) {
            addCriterion("ts_trousers_money not in", values, "tsTrousersMoney");
            return (Criteria) this;
        }

        public Criteria andTsTrousersMoneyBetween(Double value1, Double value2) {
            addCriterion("ts_trousers_money between", value1, value2, "tsTrousersMoney");
            return (Criteria) this;
        }

        public Criteria andTsTrousersMoneyNotBetween(Double value1, Double value2) {
            addCriterion("ts_trousers_money not between", value1, value2, "tsTrousersMoney");
            return (Criteria) this;
        }

        public Criteria andTsTrousersIntroduceIsNull() {
            addCriterion("ts_trousers_introduce is null");
            return (Criteria) this;
        }

        public Criteria andTsTrousersIntroduceIsNotNull() {
            addCriterion("ts_trousers_introduce is not null");
            return (Criteria) this;
        }

        public Criteria andTsTrousersIntroduceEqualTo(String value) {
            addCriterion("ts_trousers_introduce =", value, "tsTrousersIntroduce");
            return (Criteria) this;
        }

        public Criteria andTsTrousersIntroduceNotEqualTo(String value) {
            addCriterion("ts_trousers_introduce <>", value, "tsTrousersIntroduce");
            return (Criteria) this;
        }

        public Criteria andTsTrousersIntroduceGreaterThan(String value) {
            addCriterion("ts_trousers_introduce >", value, "tsTrousersIntroduce");
            return (Criteria) this;
        }

        public Criteria andTsTrousersIntroduceGreaterThanOrEqualTo(String value) {
            addCriterion("ts_trousers_introduce >=", value, "tsTrousersIntroduce");
            return (Criteria) this;
        }

        public Criteria andTsTrousersIntroduceLessThan(String value) {
            addCriterion("ts_trousers_introduce <", value, "tsTrousersIntroduce");
            return (Criteria) this;
        }

        public Criteria andTsTrousersIntroduceLessThanOrEqualTo(String value) {
            addCriterion("ts_trousers_introduce <=", value, "tsTrousersIntroduce");
            return (Criteria) this;
        }

        public Criteria andTsTrousersIntroduceLike(String value) {
            addCriterion("ts_trousers_introduce like", value, "tsTrousersIntroduce");
            return (Criteria) this;
        }

        public Criteria andTsTrousersIntroduceNotLike(String value) {
            addCriterion("ts_trousers_introduce not like", value, "tsTrousersIntroduce");
            return (Criteria) this;
        }

        public Criteria andTsTrousersIntroduceIn(List<String> values) {
            addCriterion("ts_trousers_introduce in", values, "tsTrousersIntroduce");
            return (Criteria) this;
        }

        public Criteria andTsTrousersIntroduceNotIn(List<String> values) {
            addCriterion("ts_trousers_introduce not in", values, "tsTrousersIntroduce");
            return (Criteria) this;
        }

        public Criteria andTsTrousersIntroduceBetween(String value1, String value2) {
            addCriterion("ts_trousers_introduce between", value1, value2, "tsTrousersIntroduce");
            return (Criteria) this;
        }

        public Criteria andTsTrousersIntroduceNotBetween(String value1, String value2) {
            addCriterion("ts_trousers_introduce not between", value1, value2, "tsTrousersIntroduce");
            return (Criteria) this;
        }

        public Criteria andTsTrousersStateIsNull() {
            addCriterion("ts_trousers_state is null");
            return (Criteria) this;
        }

        public Criteria andTsTrousersStateIsNotNull() {
            addCriterion("ts_trousers_state is not null");
            return (Criteria) this;
        }

        public Criteria andTsTrousersStateEqualTo(String value) {
            addCriterion("ts_trousers_state =", value, "tsTrousersState");
            return (Criteria) this;
        }

        public Criteria andTsTrousersStateNotEqualTo(String value) {
            addCriterion("ts_trousers_state <>", value, "tsTrousersState");
            return (Criteria) this;
        }

        public Criteria andTsTrousersStateGreaterThan(String value) {
            addCriterion("ts_trousers_state >", value, "tsTrousersState");
            return (Criteria) this;
        }

        public Criteria andTsTrousersStateGreaterThanOrEqualTo(String value) {
            addCriterion("ts_trousers_state >=", value, "tsTrousersState");
            return (Criteria) this;
        }

        public Criteria andTsTrousersStateLessThan(String value) {
            addCriterion("ts_trousers_state <", value, "tsTrousersState");
            return (Criteria) this;
        }

        public Criteria andTsTrousersStateLessThanOrEqualTo(String value) {
            addCriterion("ts_trousers_state <=", value, "tsTrousersState");
            return (Criteria) this;
        }

        public Criteria andTsTrousersStateLike(String value) {
            addCriterion("ts_trousers_state like", value, "tsTrousersState");
            return (Criteria) this;
        }

        public Criteria andTsTrousersStateNotLike(String value) {
            addCriterion("ts_trousers_state not like", value, "tsTrousersState");
            return (Criteria) this;
        }

        public Criteria andTsTrousersStateIn(List<String> values) {
            addCriterion("ts_trousers_state in", values, "tsTrousersState");
            return (Criteria) this;
        }

        public Criteria andTsTrousersStateNotIn(List<String> values) {
            addCriterion("ts_trousers_state not in", values, "tsTrousersState");
            return (Criteria) this;
        }

        public Criteria andTsTrousersStateBetween(String value1, String value2) {
            addCriterion("ts_trousers_state between", value1, value2, "tsTrousersState");
            return (Criteria) this;
        }

        public Criteria andTsTrousersStateNotBetween(String value1, String value2) {
            addCriterion("ts_trousers_state not between", value1, value2, "tsTrousersState");
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