package com.neusoft.bean;

import java.util.ArrayList;
import java.util.List;

public class TeamshoppingGlassesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TeamshoppingGlassesExample() {
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

        public Criteria andTsGlassesIdIsNull() {
            addCriterion("ts_glasses_id is null");
            return (Criteria) this;
        }

        public Criteria andTsGlassesIdIsNotNull() {
            addCriterion("ts_glasses_id is not null");
            return (Criteria) this;
        }

        public Criteria andTsGlassesIdEqualTo(Integer value) {
            addCriterion("ts_glasses_id =", value, "tsGlassesId");
            return (Criteria) this;
        }

        public Criteria andTsGlassesIdNotEqualTo(Integer value) {
            addCriterion("ts_glasses_id <>", value, "tsGlassesId");
            return (Criteria) this;
        }

        public Criteria andTsGlassesIdGreaterThan(Integer value) {
            addCriterion("ts_glasses_id >", value, "tsGlassesId");
            return (Criteria) this;
        }

        public Criteria andTsGlassesIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ts_glasses_id >=", value, "tsGlassesId");
            return (Criteria) this;
        }

        public Criteria andTsGlassesIdLessThan(Integer value) {
            addCriterion("ts_glasses_id <", value, "tsGlassesId");
            return (Criteria) this;
        }

        public Criteria andTsGlassesIdLessThanOrEqualTo(Integer value) {
            addCriterion("ts_glasses_id <=", value, "tsGlassesId");
            return (Criteria) this;
        }

        public Criteria andTsGlassesIdIn(List<Integer> values) {
            addCriterion("ts_glasses_id in", values, "tsGlassesId");
            return (Criteria) this;
        }

        public Criteria andTsGlassesIdNotIn(List<Integer> values) {
            addCriterion("ts_glasses_id not in", values, "tsGlassesId");
            return (Criteria) this;
        }

        public Criteria andTsGlassesIdBetween(Integer value1, Integer value2) {
            addCriterion("ts_glasses_id between", value1, value2, "tsGlassesId");
            return (Criteria) this;
        }

        public Criteria andTsGlassesIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ts_glasses_id not between", value1, value2, "tsGlassesId");
            return (Criteria) this;
        }

        public Criteria andTsGlassesBrandIsNull() {
            addCriterion("ts_glasses_brand is null");
            return (Criteria) this;
        }

        public Criteria andTsGlassesBrandIsNotNull() {
            addCriterion("ts_glasses_brand is not null");
            return (Criteria) this;
        }

        public Criteria andTsGlassesBrandEqualTo(String value) {
            addCriterion("ts_glasses_brand =", value, "tsGlassesBrand");
            return (Criteria) this;
        }

        public Criteria andTsGlassesBrandNotEqualTo(String value) {
            addCriterion("ts_glasses_brand <>", value, "tsGlassesBrand");
            return (Criteria) this;
        }

        public Criteria andTsGlassesBrandGreaterThan(String value) {
            addCriterion("ts_glasses_brand >", value, "tsGlassesBrand");
            return (Criteria) this;
        }

        public Criteria andTsGlassesBrandGreaterThanOrEqualTo(String value) {
            addCriterion("ts_glasses_brand >=", value, "tsGlassesBrand");
            return (Criteria) this;
        }

        public Criteria andTsGlassesBrandLessThan(String value) {
            addCriterion("ts_glasses_brand <", value, "tsGlassesBrand");
            return (Criteria) this;
        }

        public Criteria andTsGlassesBrandLessThanOrEqualTo(String value) {
            addCriterion("ts_glasses_brand <=", value, "tsGlassesBrand");
            return (Criteria) this;
        }

        public Criteria andTsGlassesBrandLike(String value) {
            addCriterion("ts_glasses_brand like", value, "tsGlassesBrand");
            return (Criteria) this;
        }

        public Criteria andTsGlassesBrandNotLike(String value) {
            addCriterion("ts_glasses_brand not like", value, "tsGlassesBrand");
            return (Criteria) this;
        }

        public Criteria andTsGlassesBrandIn(List<String> values) {
            addCriterion("ts_glasses_brand in", values, "tsGlassesBrand");
            return (Criteria) this;
        }

        public Criteria andTsGlassesBrandNotIn(List<String> values) {
            addCriterion("ts_glasses_brand not in", values, "tsGlassesBrand");
            return (Criteria) this;
        }

        public Criteria andTsGlassesBrandBetween(String value1, String value2) {
            addCriterion("ts_glasses_brand between", value1, value2, "tsGlassesBrand");
            return (Criteria) this;
        }

        public Criteria andTsGlassesBrandNotBetween(String value1, String value2) {
            addCriterion("ts_glasses_brand not between", value1, value2, "tsGlassesBrand");
            return (Criteria) this;
        }

        public Criteria andTsGlassesTypeIsNull() {
            addCriterion("ts_glasses_type is null");
            return (Criteria) this;
        }

        public Criteria andTsGlassesTypeIsNotNull() {
            addCriterion("ts_glasses_type is not null");
            return (Criteria) this;
        }

        public Criteria andTsGlassesTypeEqualTo(String value) {
            addCriterion("ts_glasses_type =", value, "tsGlassesType");
            return (Criteria) this;
        }

        public Criteria andTsGlassesTypeNotEqualTo(String value) {
            addCriterion("ts_glasses_type <>", value, "tsGlassesType");
            return (Criteria) this;
        }

        public Criteria andTsGlassesTypeGreaterThan(String value) {
            addCriterion("ts_glasses_type >", value, "tsGlassesType");
            return (Criteria) this;
        }

        public Criteria andTsGlassesTypeGreaterThanOrEqualTo(String value) {
            addCriterion("ts_glasses_type >=", value, "tsGlassesType");
            return (Criteria) this;
        }

        public Criteria andTsGlassesTypeLessThan(String value) {
            addCriterion("ts_glasses_type <", value, "tsGlassesType");
            return (Criteria) this;
        }

        public Criteria andTsGlassesTypeLessThanOrEqualTo(String value) {
            addCriterion("ts_glasses_type <=", value, "tsGlassesType");
            return (Criteria) this;
        }

        public Criteria andTsGlassesTypeLike(String value) {
            addCriterion("ts_glasses_type like", value, "tsGlassesType");
            return (Criteria) this;
        }

        public Criteria andTsGlassesTypeNotLike(String value) {
            addCriterion("ts_glasses_type not like", value, "tsGlassesType");
            return (Criteria) this;
        }

        public Criteria andTsGlassesTypeIn(List<String> values) {
            addCriterion("ts_glasses_type in", values, "tsGlassesType");
            return (Criteria) this;
        }

        public Criteria andTsGlassesTypeNotIn(List<String> values) {
            addCriterion("ts_glasses_type not in", values, "tsGlassesType");
            return (Criteria) this;
        }

        public Criteria andTsGlassesTypeBetween(String value1, String value2) {
            addCriterion("ts_glasses_type between", value1, value2, "tsGlassesType");
            return (Criteria) this;
        }

        public Criteria andTsGlassesTypeNotBetween(String value1, String value2) {
            addCriterion("ts_glasses_type not between", value1, value2, "tsGlassesType");
            return (Criteria) this;
        }

        public Criteria andTsGlassesStyleIsNull() {
            addCriterion("ts_glasses_style is null");
            return (Criteria) this;
        }

        public Criteria andTsGlassesStyleIsNotNull() {
            addCriterion("ts_glasses_style is not null");
            return (Criteria) this;
        }

        public Criteria andTsGlassesStyleEqualTo(String value) {
            addCriterion("ts_glasses_style =", value, "tsGlassesStyle");
            return (Criteria) this;
        }

        public Criteria andTsGlassesStyleNotEqualTo(String value) {
            addCriterion("ts_glasses_style <>", value, "tsGlassesStyle");
            return (Criteria) this;
        }

        public Criteria andTsGlassesStyleGreaterThan(String value) {
            addCriterion("ts_glasses_style >", value, "tsGlassesStyle");
            return (Criteria) this;
        }

        public Criteria andTsGlassesStyleGreaterThanOrEqualTo(String value) {
            addCriterion("ts_glasses_style >=", value, "tsGlassesStyle");
            return (Criteria) this;
        }

        public Criteria andTsGlassesStyleLessThan(String value) {
            addCriterion("ts_glasses_style <", value, "tsGlassesStyle");
            return (Criteria) this;
        }

        public Criteria andTsGlassesStyleLessThanOrEqualTo(String value) {
            addCriterion("ts_glasses_style <=", value, "tsGlassesStyle");
            return (Criteria) this;
        }

        public Criteria andTsGlassesStyleLike(String value) {
            addCriterion("ts_glasses_style like", value, "tsGlassesStyle");
            return (Criteria) this;
        }

        public Criteria andTsGlassesStyleNotLike(String value) {
            addCriterion("ts_glasses_style not like", value, "tsGlassesStyle");
            return (Criteria) this;
        }

        public Criteria andTsGlassesStyleIn(List<String> values) {
            addCriterion("ts_glasses_style in", values, "tsGlassesStyle");
            return (Criteria) this;
        }

        public Criteria andTsGlassesStyleNotIn(List<String> values) {
            addCriterion("ts_glasses_style not in", values, "tsGlassesStyle");
            return (Criteria) this;
        }

        public Criteria andTsGlassesStyleBetween(String value1, String value2) {
            addCriterion("ts_glasses_style between", value1, value2, "tsGlassesStyle");
            return (Criteria) this;
        }

        public Criteria andTsGlassesStyleNotBetween(String value1, String value2) {
            addCriterion("ts_glasses_style not between", value1, value2, "tsGlassesStyle");
            return (Criteria) this;
        }

        public Criteria andTsGlassesSizeIsNull() {
            addCriterion("ts_glasses_size is null");
            return (Criteria) this;
        }

        public Criteria andTsGlassesSizeIsNotNull() {
            addCriterion("ts_glasses_size is not null");
            return (Criteria) this;
        }

        public Criteria andTsGlassesSizeEqualTo(String value) {
            addCriterion("ts_glasses_size =", value, "tsGlassesSize");
            return (Criteria) this;
        }

        public Criteria andTsGlassesSizeNotEqualTo(String value) {
            addCriterion("ts_glasses_size <>", value, "tsGlassesSize");
            return (Criteria) this;
        }

        public Criteria andTsGlassesSizeGreaterThan(String value) {
            addCriterion("ts_glasses_size >", value, "tsGlassesSize");
            return (Criteria) this;
        }

        public Criteria andTsGlassesSizeGreaterThanOrEqualTo(String value) {
            addCriterion("ts_glasses_size >=", value, "tsGlassesSize");
            return (Criteria) this;
        }

        public Criteria andTsGlassesSizeLessThan(String value) {
            addCriterion("ts_glasses_size <", value, "tsGlassesSize");
            return (Criteria) this;
        }

        public Criteria andTsGlassesSizeLessThanOrEqualTo(String value) {
            addCriterion("ts_glasses_size <=", value, "tsGlassesSize");
            return (Criteria) this;
        }

        public Criteria andTsGlassesSizeLike(String value) {
            addCriterion("ts_glasses_size like", value, "tsGlassesSize");
            return (Criteria) this;
        }

        public Criteria andTsGlassesSizeNotLike(String value) {
            addCriterion("ts_glasses_size not like", value, "tsGlassesSize");
            return (Criteria) this;
        }

        public Criteria andTsGlassesSizeIn(List<String> values) {
            addCriterion("ts_glasses_size in", values, "tsGlassesSize");
            return (Criteria) this;
        }

        public Criteria andTsGlassesSizeNotIn(List<String> values) {
            addCriterion("ts_glasses_size not in", values, "tsGlassesSize");
            return (Criteria) this;
        }

        public Criteria andTsGlassesSizeBetween(String value1, String value2) {
            addCriterion("ts_glasses_size between", value1, value2, "tsGlassesSize");
            return (Criteria) this;
        }

        public Criteria andTsGlassesSizeNotBetween(String value1, String value2) {
            addCriterion("ts_glasses_size not between", value1, value2, "tsGlassesSize");
            return (Criteria) this;
        }

        public Criteria andTsGlassesColorIsNull() {
            addCriterion("ts_glasses_color is null");
            return (Criteria) this;
        }

        public Criteria andTsGlassesColorIsNotNull() {
            addCriterion("ts_glasses_color is not null");
            return (Criteria) this;
        }

        public Criteria andTsGlassesColorEqualTo(String value) {
            addCriterion("ts_glasses_color =", value, "tsGlassesColor");
            return (Criteria) this;
        }

        public Criteria andTsGlassesColorNotEqualTo(String value) {
            addCriterion("ts_glasses_color <>", value, "tsGlassesColor");
            return (Criteria) this;
        }

        public Criteria andTsGlassesColorGreaterThan(String value) {
            addCriterion("ts_glasses_color >", value, "tsGlassesColor");
            return (Criteria) this;
        }

        public Criteria andTsGlassesColorGreaterThanOrEqualTo(String value) {
            addCriterion("ts_glasses_color >=", value, "tsGlassesColor");
            return (Criteria) this;
        }

        public Criteria andTsGlassesColorLessThan(String value) {
            addCriterion("ts_glasses_color <", value, "tsGlassesColor");
            return (Criteria) this;
        }

        public Criteria andTsGlassesColorLessThanOrEqualTo(String value) {
            addCriterion("ts_glasses_color <=", value, "tsGlassesColor");
            return (Criteria) this;
        }

        public Criteria andTsGlassesColorLike(String value) {
            addCriterion("ts_glasses_color like", value, "tsGlassesColor");
            return (Criteria) this;
        }

        public Criteria andTsGlassesColorNotLike(String value) {
            addCriterion("ts_glasses_color not like", value, "tsGlassesColor");
            return (Criteria) this;
        }

        public Criteria andTsGlassesColorIn(List<String> values) {
            addCriterion("ts_glasses_color in", values, "tsGlassesColor");
            return (Criteria) this;
        }

        public Criteria andTsGlassesColorNotIn(List<String> values) {
            addCriterion("ts_glasses_color not in", values, "tsGlassesColor");
            return (Criteria) this;
        }

        public Criteria andTsGlassesColorBetween(String value1, String value2) {
            addCriterion("ts_glasses_color between", value1, value2, "tsGlassesColor");
            return (Criteria) this;
        }

        public Criteria andTsGlassesColorNotBetween(String value1, String value2) {
            addCriterion("ts_glasses_color not between", value1, value2, "tsGlassesColor");
            return (Criteria) this;
        }

        public Criteria andTsGlassesFramematerialIsNull() {
            addCriterion("ts_glasses_framematerial is null");
            return (Criteria) this;
        }

        public Criteria andTsGlassesFramematerialIsNotNull() {
            addCriterion("ts_glasses_framematerial is not null");
            return (Criteria) this;
        }

        public Criteria andTsGlassesFramematerialEqualTo(String value) {
            addCriterion("ts_glasses_framematerial =", value, "tsGlassesFramematerial");
            return (Criteria) this;
        }

        public Criteria andTsGlassesFramematerialNotEqualTo(String value) {
            addCriterion("ts_glasses_framematerial <>", value, "tsGlassesFramematerial");
            return (Criteria) this;
        }

        public Criteria andTsGlassesFramematerialGreaterThan(String value) {
            addCriterion("ts_glasses_framematerial >", value, "tsGlassesFramematerial");
            return (Criteria) this;
        }

        public Criteria andTsGlassesFramematerialGreaterThanOrEqualTo(String value) {
            addCriterion("ts_glasses_framematerial >=", value, "tsGlassesFramematerial");
            return (Criteria) this;
        }

        public Criteria andTsGlassesFramematerialLessThan(String value) {
            addCriterion("ts_glasses_framematerial <", value, "tsGlassesFramematerial");
            return (Criteria) this;
        }

        public Criteria andTsGlassesFramematerialLessThanOrEqualTo(String value) {
            addCriterion("ts_glasses_framematerial <=", value, "tsGlassesFramematerial");
            return (Criteria) this;
        }

        public Criteria andTsGlassesFramematerialLike(String value) {
            addCriterion("ts_glasses_framematerial like", value, "tsGlassesFramematerial");
            return (Criteria) this;
        }

        public Criteria andTsGlassesFramematerialNotLike(String value) {
            addCriterion("ts_glasses_framematerial not like", value, "tsGlassesFramematerial");
            return (Criteria) this;
        }

        public Criteria andTsGlassesFramematerialIn(List<String> values) {
            addCriterion("ts_glasses_framematerial in", values, "tsGlassesFramematerial");
            return (Criteria) this;
        }

        public Criteria andTsGlassesFramematerialNotIn(List<String> values) {
            addCriterion("ts_glasses_framematerial not in", values, "tsGlassesFramematerial");
            return (Criteria) this;
        }

        public Criteria andTsGlassesFramematerialBetween(String value1, String value2) {
            addCriterion("ts_glasses_framematerial between", value1, value2, "tsGlassesFramematerial");
            return (Criteria) this;
        }

        public Criteria andTsGlassesFramematerialNotBetween(String value1, String value2) {
            addCriterion("ts_glasses_framematerial not between", value1, value2, "tsGlassesFramematerial");
            return (Criteria) this;
        }

        public Criteria andTsGlassesLensmaterialIsNull() {
            addCriterion("ts_glasses_lensmaterial is null");
            return (Criteria) this;
        }

        public Criteria andTsGlassesLensmaterialIsNotNull() {
            addCriterion("ts_glasses_lensmaterial is not null");
            return (Criteria) this;
        }

        public Criteria andTsGlassesLensmaterialEqualTo(String value) {
            addCriterion("ts_glasses_lensmaterial =", value, "tsGlassesLensmaterial");
            return (Criteria) this;
        }

        public Criteria andTsGlassesLensmaterialNotEqualTo(String value) {
            addCriterion("ts_glasses_lensmaterial <>", value, "tsGlassesLensmaterial");
            return (Criteria) this;
        }

        public Criteria andTsGlassesLensmaterialGreaterThan(String value) {
            addCriterion("ts_glasses_lensmaterial >", value, "tsGlassesLensmaterial");
            return (Criteria) this;
        }

        public Criteria andTsGlassesLensmaterialGreaterThanOrEqualTo(String value) {
            addCriterion("ts_glasses_lensmaterial >=", value, "tsGlassesLensmaterial");
            return (Criteria) this;
        }

        public Criteria andTsGlassesLensmaterialLessThan(String value) {
            addCriterion("ts_glasses_lensmaterial <", value, "tsGlassesLensmaterial");
            return (Criteria) this;
        }

        public Criteria andTsGlassesLensmaterialLessThanOrEqualTo(String value) {
            addCriterion("ts_glasses_lensmaterial <=", value, "tsGlassesLensmaterial");
            return (Criteria) this;
        }

        public Criteria andTsGlassesLensmaterialLike(String value) {
            addCriterion("ts_glasses_lensmaterial like", value, "tsGlassesLensmaterial");
            return (Criteria) this;
        }

        public Criteria andTsGlassesLensmaterialNotLike(String value) {
            addCriterion("ts_glasses_lensmaterial not like", value, "tsGlassesLensmaterial");
            return (Criteria) this;
        }

        public Criteria andTsGlassesLensmaterialIn(List<String> values) {
            addCriterion("ts_glasses_lensmaterial in", values, "tsGlassesLensmaterial");
            return (Criteria) this;
        }

        public Criteria andTsGlassesLensmaterialNotIn(List<String> values) {
            addCriterion("ts_glasses_lensmaterial not in", values, "tsGlassesLensmaterial");
            return (Criteria) this;
        }

        public Criteria andTsGlassesLensmaterialBetween(String value1, String value2) {
            addCriterion("ts_glasses_lensmaterial between", value1, value2, "tsGlassesLensmaterial");
            return (Criteria) this;
        }

        public Criteria andTsGlassesLensmaterialNotBetween(String value1, String value2) {
            addCriterion("ts_glasses_lensmaterial not between", value1, value2, "tsGlassesLensmaterial");
            return (Criteria) this;
        }

        public Criteria andTsGlassesPictureIsNull() {
            addCriterion("ts_glasses_picture is null");
            return (Criteria) this;
        }

        public Criteria andTsGlassesPictureIsNotNull() {
            addCriterion("ts_glasses_picture is not null");
            return (Criteria) this;
        }

        public Criteria andTsGlassesPictureEqualTo(String value) {
            addCriterion("ts_glasses_picture =", value, "tsGlassesPicture");
            return (Criteria) this;
        }

        public Criteria andTsGlassesPictureNotEqualTo(String value) {
            addCriterion("ts_glasses_picture <>", value, "tsGlassesPicture");
            return (Criteria) this;
        }

        public Criteria andTsGlassesPictureGreaterThan(String value) {
            addCriterion("ts_glasses_picture >", value, "tsGlassesPicture");
            return (Criteria) this;
        }

        public Criteria andTsGlassesPictureGreaterThanOrEqualTo(String value) {
            addCriterion("ts_glasses_picture >=", value, "tsGlassesPicture");
            return (Criteria) this;
        }

        public Criteria andTsGlassesPictureLessThan(String value) {
            addCriterion("ts_glasses_picture <", value, "tsGlassesPicture");
            return (Criteria) this;
        }

        public Criteria andTsGlassesPictureLessThanOrEqualTo(String value) {
            addCriterion("ts_glasses_picture <=", value, "tsGlassesPicture");
            return (Criteria) this;
        }

        public Criteria andTsGlassesPictureLike(String value) {
            addCriterion("ts_glasses_picture like", value, "tsGlassesPicture");
            return (Criteria) this;
        }

        public Criteria andTsGlassesPictureNotLike(String value) {
            addCriterion("ts_glasses_picture not like", value, "tsGlassesPicture");
            return (Criteria) this;
        }

        public Criteria andTsGlassesPictureIn(List<String> values) {
            addCriterion("ts_glasses_picture in", values, "tsGlassesPicture");
            return (Criteria) this;
        }

        public Criteria andTsGlassesPictureNotIn(List<String> values) {
            addCriterion("ts_glasses_picture not in", values, "tsGlassesPicture");
            return (Criteria) this;
        }

        public Criteria andTsGlassesPictureBetween(String value1, String value2) {
            addCriterion("ts_glasses_picture between", value1, value2, "tsGlassesPicture");
            return (Criteria) this;
        }

        public Criteria andTsGlassesPictureNotBetween(String value1, String value2) {
            addCriterion("ts_glasses_picture not between", value1, value2, "tsGlassesPicture");
            return (Criteria) this;
        }

        public Criteria andTsGlassesNumberIsNull() {
            addCriterion("ts_glasses_number is null");
            return (Criteria) this;
        }

        public Criteria andTsGlassesNumberIsNotNull() {
            addCriterion("ts_glasses_number is not null");
            return (Criteria) this;
        }

        public Criteria andTsGlassesNumberEqualTo(Integer value) {
            addCriterion("ts_glasses_number =", value, "tsGlassesNumber");
            return (Criteria) this;
        }

        public Criteria andTsGlassesNumberNotEqualTo(Integer value) {
            addCriterion("ts_glasses_number <>", value, "tsGlassesNumber");
            return (Criteria) this;
        }

        public Criteria andTsGlassesNumberGreaterThan(Integer value) {
            addCriterion("ts_glasses_number >", value, "tsGlassesNumber");
            return (Criteria) this;
        }

        public Criteria andTsGlassesNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("ts_glasses_number >=", value, "tsGlassesNumber");
            return (Criteria) this;
        }

        public Criteria andTsGlassesNumberLessThan(Integer value) {
            addCriterion("ts_glasses_number <", value, "tsGlassesNumber");
            return (Criteria) this;
        }

        public Criteria andTsGlassesNumberLessThanOrEqualTo(Integer value) {
            addCriterion("ts_glasses_number <=", value, "tsGlassesNumber");
            return (Criteria) this;
        }

        public Criteria andTsGlassesNumberIn(List<Integer> values) {
            addCriterion("ts_glasses_number in", values, "tsGlassesNumber");
            return (Criteria) this;
        }

        public Criteria andTsGlassesNumberNotIn(List<Integer> values) {
            addCriterion("ts_glasses_number not in", values, "tsGlassesNumber");
            return (Criteria) this;
        }

        public Criteria andTsGlassesNumberBetween(Integer value1, Integer value2) {
            addCriterion("ts_glasses_number between", value1, value2, "tsGlassesNumber");
            return (Criteria) this;
        }

        public Criteria andTsGlassesNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("ts_glasses_number not between", value1, value2, "tsGlassesNumber");
            return (Criteria) this;
        }

        public Criteria andTsGlassesMoneyIsNull() {
            addCriterion("ts_glasses_money is null");
            return (Criteria) this;
        }

        public Criteria andTsGlassesMoneyIsNotNull() {
            addCriterion("ts_glasses_money is not null");
            return (Criteria) this;
        }

        public Criteria andTsGlassesMoneyEqualTo(Double value) {
            addCriterion("ts_glasses_money =", value, "tsGlassesMoney");
            return (Criteria) this;
        }

        public Criteria andTsGlassesMoneyNotEqualTo(Double value) {
            addCriterion("ts_glasses_money <>", value, "tsGlassesMoney");
            return (Criteria) this;
        }

        public Criteria andTsGlassesMoneyGreaterThan(Double value) {
            addCriterion("ts_glasses_money >", value, "tsGlassesMoney");
            return (Criteria) this;
        }

        public Criteria andTsGlassesMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("ts_glasses_money >=", value, "tsGlassesMoney");
            return (Criteria) this;
        }

        public Criteria andTsGlassesMoneyLessThan(Double value) {
            addCriterion("ts_glasses_money <", value, "tsGlassesMoney");
            return (Criteria) this;
        }

        public Criteria andTsGlassesMoneyLessThanOrEqualTo(Double value) {
            addCriterion("ts_glasses_money <=", value, "tsGlassesMoney");
            return (Criteria) this;
        }

        public Criteria andTsGlassesMoneyIn(List<Double> values) {
            addCriterion("ts_glasses_money in", values, "tsGlassesMoney");
            return (Criteria) this;
        }

        public Criteria andTsGlassesMoneyNotIn(List<Double> values) {
            addCriterion("ts_glasses_money not in", values, "tsGlassesMoney");
            return (Criteria) this;
        }

        public Criteria andTsGlassesMoneyBetween(Double value1, Double value2) {
            addCriterion("ts_glasses_money between", value1, value2, "tsGlassesMoney");
            return (Criteria) this;
        }

        public Criteria andTsGlassesMoneyNotBetween(Double value1, Double value2) {
            addCriterion("ts_glasses_money not between", value1, value2, "tsGlassesMoney");
            return (Criteria) this;
        }

        public Criteria andTsGlassesIntroduceIsNull() {
            addCriterion("ts_glasses_introduce is null");
            return (Criteria) this;
        }

        public Criteria andTsGlassesIntroduceIsNotNull() {
            addCriterion("ts_glasses_introduce is not null");
            return (Criteria) this;
        }

        public Criteria andTsGlassesIntroduceEqualTo(String value) {
            addCriterion("ts_glasses_introduce =", value, "tsGlassesIntroduce");
            return (Criteria) this;
        }

        public Criteria andTsGlassesIntroduceNotEqualTo(String value) {
            addCriterion("ts_glasses_introduce <>", value, "tsGlassesIntroduce");
            return (Criteria) this;
        }

        public Criteria andTsGlassesIntroduceGreaterThan(String value) {
            addCriterion("ts_glasses_introduce >", value, "tsGlassesIntroduce");
            return (Criteria) this;
        }

        public Criteria andTsGlassesIntroduceGreaterThanOrEqualTo(String value) {
            addCriterion("ts_glasses_introduce >=", value, "tsGlassesIntroduce");
            return (Criteria) this;
        }

        public Criteria andTsGlassesIntroduceLessThan(String value) {
            addCriterion("ts_glasses_introduce <", value, "tsGlassesIntroduce");
            return (Criteria) this;
        }

        public Criteria andTsGlassesIntroduceLessThanOrEqualTo(String value) {
            addCriterion("ts_glasses_introduce <=", value, "tsGlassesIntroduce");
            return (Criteria) this;
        }

        public Criteria andTsGlassesIntroduceLike(String value) {
            addCriterion("ts_glasses_introduce like", value, "tsGlassesIntroduce");
            return (Criteria) this;
        }

        public Criteria andTsGlassesIntroduceNotLike(String value) {
            addCriterion("ts_glasses_introduce not like", value, "tsGlassesIntroduce");
            return (Criteria) this;
        }

        public Criteria andTsGlassesIntroduceIn(List<String> values) {
            addCriterion("ts_glasses_introduce in", values, "tsGlassesIntroduce");
            return (Criteria) this;
        }

        public Criteria andTsGlassesIntroduceNotIn(List<String> values) {
            addCriterion("ts_glasses_introduce not in", values, "tsGlassesIntroduce");
            return (Criteria) this;
        }

        public Criteria andTsGlassesIntroduceBetween(String value1, String value2) {
            addCriterion("ts_glasses_introduce between", value1, value2, "tsGlassesIntroduce");
            return (Criteria) this;
        }

        public Criteria andTsGlassesIntroduceNotBetween(String value1, String value2) {
            addCriterion("ts_glasses_introduce not between", value1, value2, "tsGlassesIntroduce");
            return (Criteria) this;
        }

        public Criteria andTsGlassesStateIsNull() {
            addCriterion("ts_glasses_state is null");
            return (Criteria) this;
        }

        public Criteria andTsGlassesStateIsNotNull() {
            addCriterion("ts_glasses_state is not null");
            return (Criteria) this;
        }

        public Criteria andTsGlassesStateEqualTo(String value) {
            addCriterion("ts_glasses_state =", value, "tsGlassesState");
            return (Criteria) this;
        }

        public Criteria andTsGlassesStateNotEqualTo(String value) {
            addCriterion("ts_glasses_state <>", value, "tsGlassesState");
            return (Criteria) this;
        }

        public Criteria andTsGlassesStateGreaterThan(String value) {
            addCriterion("ts_glasses_state >", value, "tsGlassesState");
            return (Criteria) this;
        }

        public Criteria andTsGlassesStateGreaterThanOrEqualTo(String value) {
            addCriterion("ts_glasses_state >=", value, "tsGlassesState");
            return (Criteria) this;
        }

        public Criteria andTsGlassesStateLessThan(String value) {
            addCriterion("ts_glasses_state <", value, "tsGlassesState");
            return (Criteria) this;
        }

        public Criteria andTsGlassesStateLessThanOrEqualTo(String value) {
            addCriterion("ts_glasses_state <=", value, "tsGlassesState");
            return (Criteria) this;
        }

        public Criteria andTsGlassesStateLike(String value) {
            addCriterion("ts_glasses_state like", value, "tsGlassesState");
            return (Criteria) this;
        }

        public Criteria andTsGlassesStateNotLike(String value) {
            addCriterion("ts_glasses_state not like", value, "tsGlassesState");
            return (Criteria) this;
        }

        public Criteria andTsGlassesStateIn(List<String> values) {
            addCriterion("ts_glasses_state in", values, "tsGlassesState");
            return (Criteria) this;
        }

        public Criteria andTsGlassesStateNotIn(List<String> values) {
            addCriterion("ts_glasses_state not in", values, "tsGlassesState");
            return (Criteria) this;
        }

        public Criteria andTsGlassesStateBetween(String value1, String value2) {
            addCriterion("ts_glasses_state between", value1, value2, "tsGlassesState");
            return (Criteria) this;
        }

        public Criteria andTsGlassesStateNotBetween(String value1, String value2) {
            addCriterion("ts_glasses_state not between", value1, value2, "tsGlassesState");
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