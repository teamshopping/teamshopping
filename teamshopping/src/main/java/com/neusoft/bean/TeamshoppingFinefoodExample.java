package com.neusoft.bean;

import java.util.ArrayList;
import java.util.List;

public class TeamshoppingFinefoodExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TeamshoppingFinefoodExample() {
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

        public Criteria andTsFinefoodIdIsNull() {
            addCriterion("ts_finefood_id is null");
            return (Criteria) this;
        }

        public Criteria andTsFinefoodIdIsNotNull() {
            addCriterion("ts_finefood_id is not null");
            return (Criteria) this;
        }

        public Criteria andTsFinefoodIdEqualTo(Integer value) {
            addCriterion("ts_finefood_id =", value, "tsFinefoodId");
            return (Criteria) this;
        }

        public Criteria andTsFinefoodIdNotEqualTo(Integer value) {
            addCriterion("ts_finefood_id <>", value, "tsFinefoodId");
            return (Criteria) this;
        }

        public Criteria andTsFinefoodIdGreaterThan(Integer value) {
            addCriterion("ts_finefood_id >", value, "tsFinefoodId");
            return (Criteria) this;
        }

        public Criteria andTsFinefoodIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ts_finefood_id >=", value, "tsFinefoodId");
            return (Criteria) this;
        }

        public Criteria andTsFinefoodIdLessThan(Integer value) {
            addCriterion("ts_finefood_id <", value, "tsFinefoodId");
            return (Criteria) this;
        }

        public Criteria andTsFinefoodIdLessThanOrEqualTo(Integer value) {
            addCriterion("ts_finefood_id <=", value, "tsFinefoodId");
            return (Criteria) this;
        }

        public Criteria andTsFinefoodIdIn(List<Integer> values) {
            addCriterion("ts_finefood_id in", values, "tsFinefoodId");
            return (Criteria) this;
        }

        public Criteria andTsFinefoodIdNotIn(List<Integer> values) {
            addCriterion("ts_finefood_id not in", values, "tsFinefoodId");
            return (Criteria) this;
        }

        public Criteria andTsFinefoodIdBetween(Integer value1, Integer value2) {
            addCriterion("ts_finefood_id between", value1, value2, "tsFinefoodId");
            return (Criteria) this;
        }

        public Criteria andTsFinefoodIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ts_finefood_id not between", value1, value2, "tsFinefoodId");
            return (Criteria) this;
        }

        public Criteria andTsFinefoodNameIsNull() {
            addCriterion("ts_finefood_name is null");
            return (Criteria) this;
        }

        public Criteria andTsFinefoodNameIsNotNull() {
            addCriterion("ts_finefood_name is not null");
            return (Criteria) this;
        }

        public Criteria andTsFinefoodNameEqualTo(String value) {
            addCriterion("ts_finefood_name =", value, "tsFinefoodName");
            return (Criteria) this;
        }

        public Criteria andTsFinefoodNameNotEqualTo(String value) {
            addCriterion("ts_finefood_name <>", value, "tsFinefoodName");
            return (Criteria) this;
        }

        public Criteria andTsFinefoodNameGreaterThan(String value) {
            addCriterion("ts_finefood_name >", value, "tsFinefoodName");
            return (Criteria) this;
        }

        public Criteria andTsFinefoodNameGreaterThanOrEqualTo(String value) {
            addCriterion("ts_finefood_name >=", value, "tsFinefoodName");
            return (Criteria) this;
        }

        public Criteria andTsFinefoodNameLessThan(String value) {
            addCriterion("ts_finefood_name <", value, "tsFinefoodName");
            return (Criteria) this;
        }

        public Criteria andTsFinefoodNameLessThanOrEqualTo(String value) {
            addCriterion("ts_finefood_name <=", value, "tsFinefoodName");
            return (Criteria) this;
        }

        public Criteria andTsFinefoodNameLike(String value) {
            addCriterion("ts_finefood_name like", value, "tsFinefoodName");
            return (Criteria) this;
        }

        public Criteria andTsFinefoodNameNotLike(String value) {
            addCriterion("ts_finefood_name not like", value, "tsFinefoodName");
            return (Criteria) this;
        }

        public Criteria andTsFinefoodNameIn(List<String> values) {
            addCriterion("ts_finefood_name in", values, "tsFinefoodName");
            return (Criteria) this;
        }

        public Criteria andTsFinefoodNameNotIn(List<String> values) {
            addCriterion("ts_finefood_name not in", values, "tsFinefoodName");
            return (Criteria) this;
        }

        public Criteria andTsFinefoodNameBetween(String value1, String value2) {
            addCriterion("ts_finefood_name between", value1, value2, "tsFinefoodName");
            return (Criteria) this;
        }

        public Criteria andTsFinefoodNameNotBetween(String value1, String value2) {
            addCriterion("ts_finefood_name not between", value1, value2, "tsFinefoodName");
            return (Criteria) this;
        }

        public Criteria andTsFinefoodSellerIsNull() {
            addCriterion("ts_finefood_seller is null");
            return (Criteria) this;
        }

        public Criteria andTsFinefoodSellerIsNotNull() {
            addCriterion("ts_finefood_seller is not null");
            return (Criteria) this;
        }

        public Criteria andTsFinefoodSellerEqualTo(String value) {
            addCriterion("ts_finefood_seller =", value, "tsFinefoodSeller");
            return (Criteria) this;
        }

        public Criteria andTsFinefoodSellerNotEqualTo(String value) {
            addCriterion("ts_finefood_seller <>", value, "tsFinefoodSeller");
            return (Criteria) this;
        }

        public Criteria andTsFinefoodSellerGreaterThan(String value) {
            addCriterion("ts_finefood_seller >", value, "tsFinefoodSeller");
            return (Criteria) this;
        }

        public Criteria andTsFinefoodSellerGreaterThanOrEqualTo(String value) {
            addCriterion("ts_finefood_seller >=", value, "tsFinefoodSeller");
            return (Criteria) this;
        }

        public Criteria andTsFinefoodSellerLessThan(String value) {
            addCriterion("ts_finefood_seller <", value, "tsFinefoodSeller");
            return (Criteria) this;
        }

        public Criteria andTsFinefoodSellerLessThanOrEqualTo(String value) {
            addCriterion("ts_finefood_seller <=", value, "tsFinefoodSeller");
            return (Criteria) this;
        }

        public Criteria andTsFinefoodSellerLike(String value) {
            addCriterion("ts_finefood_seller like", value, "tsFinefoodSeller");
            return (Criteria) this;
        }

        public Criteria andTsFinefoodSellerNotLike(String value) {
            addCriterion("ts_finefood_seller not like", value, "tsFinefoodSeller");
            return (Criteria) this;
        }

        public Criteria andTsFinefoodSellerIn(List<String> values) {
            addCriterion("ts_finefood_seller in", values, "tsFinefoodSeller");
            return (Criteria) this;
        }

        public Criteria andTsFinefoodSellerNotIn(List<String> values) {
            addCriterion("ts_finefood_seller not in", values, "tsFinefoodSeller");
            return (Criteria) this;
        }

        public Criteria andTsFinefoodSellerBetween(String value1, String value2) {
            addCriterion("ts_finefood_seller between", value1, value2, "tsFinefoodSeller");
            return (Criteria) this;
        }

        public Criteria andTsFinefoodSellerNotBetween(String value1, String value2) {
            addCriterion("ts_finefood_seller not between", value1, value2, "tsFinefoodSeller");
            return (Criteria) this;
        }

        public Criteria andTsFinefoodMaterialIsNull() {
            addCriterion("ts_finefood_material is null");
            return (Criteria) this;
        }

        public Criteria andTsFinefoodMaterialIsNotNull() {
            addCriterion("ts_finefood_material is not null");
            return (Criteria) this;
        }

        public Criteria andTsFinefoodMaterialEqualTo(String value) {
            addCriterion("ts_finefood_material =", value, "tsFinefoodMaterial");
            return (Criteria) this;
        }

        public Criteria andTsFinefoodMaterialNotEqualTo(String value) {
            addCriterion("ts_finefood_material <>", value, "tsFinefoodMaterial");
            return (Criteria) this;
        }

        public Criteria andTsFinefoodMaterialGreaterThan(String value) {
            addCriterion("ts_finefood_material >", value, "tsFinefoodMaterial");
            return (Criteria) this;
        }

        public Criteria andTsFinefoodMaterialGreaterThanOrEqualTo(String value) {
            addCriterion("ts_finefood_material >=", value, "tsFinefoodMaterial");
            return (Criteria) this;
        }

        public Criteria andTsFinefoodMaterialLessThan(String value) {
            addCriterion("ts_finefood_material <", value, "tsFinefoodMaterial");
            return (Criteria) this;
        }

        public Criteria andTsFinefoodMaterialLessThanOrEqualTo(String value) {
            addCriterion("ts_finefood_material <=", value, "tsFinefoodMaterial");
            return (Criteria) this;
        }

        public Criteria andTsFinefoodMaterialLike(String value) {
            addCriterion("ts_finefood_material like", value, "tsFinefoodMaterial");
            return (Criteria) this;
        }

        public Criteria andTsFinefoodMaterialNotLike(String value) {
            addCriterion("ts_finefood_material not like", value, "tsFinefoodMaterial");
            return (Criteria) this;
        }

        public Criteria andTsFinefoodMaterialIn(List<String> values) {
            addCriterion("ts_finefood_material in", values, "tsFinefoodMaterial");
            return (Criteria) this;
        }

        public Criteria andTsFinefoodMaterialNotIn(List<String> values) {
            addCriterion("ts_finefood_material not in", values, "tsFinefoodMaterial");
            return (Criteria) this;
        }

        public Criteria andTsFinefoodMaterialBetween(String value1, String value2) {
            addCriterion("ts_finefood_material between", value1, value2, "tsFinefoodMaterial");
            return (Criteria) this;
        }

        public Criteria andTsFinefoodMaterialNotBetween(String value1, String value2) {
            addCriterion("ts_finefood_material not between", value1, value2, "tsFinefoodMaterial");
            return (Criteria) this;
        }

        public Criteria andTsFinefoodWeightIsNull() {
            addCriterion("ts_finefood_weight is null");
            return (Criteria) this;
        }

        public Criteria andTsFinefoodWeightIsNotNull() {
            addCriterion("ts_finefood_weight is not null");
            return (Criteria) this;
        }

        public Criteria andTsFinefoodWeightEqualTo(String value) {
            addCriterion("ts_finefood_weight =", value, "tsFinefoodWeight");
            return (Criteria) this;
        }

        public Criteria andTsFinefoodWeightNotEqualTo(String value) {
            addCriterion("ts_finefood_weight <>", value, "tsFinefoodWeight");
            return (Criteria) this;
        }

        public Criteria andTsFinefoodWeightGreaterThan(String value) {
            addCriterion("ts_finefood_weight >", value, "tsFinefoodWeight");
            return (Criteria) this;
        }

        public Criteria andTsFinefoodWeightGreaterThanOrEqualTo(String value) {
            addCriterion("ts_finefood_weight >=", value, "tsFinefoodWeight");
            return (Criteria) this;
        }

        public Criteria andTsFinefoodWeightLessThan(String value) {
            addCriterion("ts_finefood_weight <", value, "tsFinefoodWeight");
            return (Criteria) this;
        }

        public Criteria andTsFinefoodWeightLessThanOrEqualTo(String value) {
            addCriterion("ts_finefood_weight <=", value, "tsFinefoodWeight");
            return (Criteria) this;
        }

        public Criteria andTsFinefoodWeightLike(String value) {
            addCriterion("ts_finefood_weight like", value, "tsFinefoodWeight");
            return (Criteria) this;
        }

        public Criteria andTsFinefoodWeightNotLike(String value) {
            addCriterion("ts_finefood_weight not like", value, "tsFinefoodWeight");
            return (Criteria) this;
        }

        public Criteria andTsFinefoodWeightIn(List<String> values) {
            addCriterion("ts_finefood_weight in", values, "tsFinefoodWeight");
            return (Criteria) this;
        }

        public Criteria andTsFinefoodWeightNotIn(List<String> values) {
            addCriterion("ts_finefood_weight not in", values, "tsFinefoodWeight");
            return (Criteria) this;
        }

        public Criteria andTsFinefoodWeightBetween(String value1, String value2) {
            addCriterion("ts_finefood_weight between", value1, value2, "tsFinefoodWeight");
            return (Criteria) this;
        }

        public Criteria andTsFinefoodWeightNotBetween(String value1, String value2) {
            addCriterion("ts_finefood_weight not between", value1, value2, "tsFinefoodWeight");
            return (Criteria) this;
        }

        public Criteria andTsFinefoodFlavorIsNull() {
            addCriterion("ts_finefood_flavor is null");
            return (Criteria) this;
        }

        public Criteria andTsFinefoodFlavorIsNotNull() {
            addCriterion("ts_finefood_flavor is not null");
            return (Criteria) this;
        }

        public Criteria andTsFinefoodFlavorEqualTo(String value) {
            addCriterion("ts_finefood_flavor =", value, "tsFinefoodFlavor");
            return (Criteria) this;
        }

        public Criteria andTsFinefoodFlavorNotEqualTo(String value) {
            addCriterion("ts_finefood_flavor <>", value, "tsFinefoodFlavor");
            return (Criteria) this;
        }

        public Criteria andTsFinefoodFlavorGreaterThan(String value) {
            addCriterion("ts_finefood_flavor >", value, "tsFinefoodFlavor");
            return (Criteria) this;
        }

        public Criteria andTsFinefoodFlavorGreaterThanOrEqualTo(String value) {
            addCriterion("ts_finefood_flavor >=", value, "tsFinefoodFlavor");
            return (Criteria) this;
        }

        public Criteria andTsFinefoodFlavorLessThan(String value) {
            addCriterion("ts_finefood_flavor <", value, "tsFinefoodFlavor");
            return (Criteria) this;
        }

        public Criteria andTsFinefoodFlavorLessThanOrEqualTo(String value) {
            addCriterion("ts_finefood_flavor <=", value, "tsFinefoodFlavor");
            return (Criteria) this;
        }

        public Criteria andTsFinefoodFlavorLike(String value) {
            addCriterion("ts_finefood_flavor like", value, "tsFinefoodFlavor");
            return (Criteria) this;
        }

        public Criteria andTsFinefoodFlavorNotLike(String value) {
            addCriterion("ts_finefood_flavor not like", value, "tsFinefoodFlavor");
            return (Criteria) this;
        }

        public Criteria andTsFinefoodFlavorIn(List<String> values) {
            addCriterion("ts_finefood_flavor in", values, "tsFinefoodFlavor");
            return (Criteria) this;
        }

        public Criteria andTsFinefoodFlavorNotIn(List<String> values) {
            addCriterion("ts_finefood_flavor not in", values, "tsFinefoodFlavor");
            return (Criteria) this;
        }

        public Criteria andTsFinefoodFlavorBetween(String value1, String value2) {
            addCriterion("ts_finefood_flavor between", value1, value2, "tsFinefoodFlavor");
            return (Criteria) this;
        }

        public Criteria andTsFinefoodFlavorNotBetween(String value1, String value2) {
            addCriterion("ts_finefood_flavor not between", value1, value2, "tsFinefoodFlavor");
            return (Criteria) this;
        }

        public Criteria andTsFinefoodPictureIsNull() {
            addCriterion("ts_finefood_picture is null");
            return (Criteria) this;
        }

        public Criteria andTsFinefoodPictureIsNotNull() {
            addCriterion("ts_finefood_picture is not null");
            return (Criteria) this;
        }

        public Criteria andTsFinefoodPictureEqualTo(String value) {
            addCriterion("ts_finefood_picture =", value, "tsFinefoodPicture");
            return (Criteria) this;
        }

        public Criteria andTsFinefoodPictureNotEqualTo(String value) {
            addCriterion("ts_finefood_picture <>", value, "tsFinefoodPicture");
            return (Criteria) this;
        }

        public Criteria andTsFinefoodPictureGreaterThan(String value) {
            addCriterion("ts_finefood_picture >", value, "tsFinefoodPicture");
            return (Criteria) this;
        }

        public Criteria andTsFinefoodPictureGreaterThanOrEqualTo(String value) {
            addCriterion("ts_finefood_picture >=", value, "tsFinefoodPicture");
            return (Criteria) this;
        }

        public Criteria andTsFinefoodPictureLessThan(String value) {
            addCriterion("ts_finefood_picture <", value, "tsFinefoodPicture");
            return (Criteria) this;
        }

        public Criteria andTsFinefoodPictureLessThanOrEqualTo(String value) {
            addCriterion("ts_finefood_picture <=", value, "tsFinefoodPicture");
            return (Criteria) this;
        }

        public Criteria andTsFinefoodPictureLike(String value) {
            addCriterion("ts_finefood_picture like", value, "tsFinefoodPicture");
            return (Criteria) this;
        }

        public Criteria andTsFinefoodPictureNotLike(String value) {
            addCriterion("ts_finefood_picture not like", value, "tsFinefoodPicture");
            return (Criteria) this;
        }

        public Criteria andTsFinefoodPictureIn(List<String> values) {
            addCriterion("ts_finefood_picture in", values, "tsFinefoodPicture");
            return (Criteria) this;
        }

        public Criteria andTsFinefoodPictureNotIn(List<String> values) {
            addCriterion("ts_finefood_picture not in", values, "tsFinefoodPicture");
            return (Criteria) this;
        }

        public Criteria andTsFinefoodPictureBetween(String value1, String value2) {
            addCriterion("ts_finefood_picture between", value1, value2, "tsFinefoodPicture");
            return (Criteria) this;
        }

        public Criteria andTsFinefoodPictureNotBetween(String value1, String value2) {
            addCriterion("ts_finefood_picture not between", value1, value2, "tsFinefoodPicture");
            return (Criteria) this;
        }

        public Criteria andTsFinefoodNumberIsNull() {
            addCriterion("ts_finefood_number is null");
            return (Criteria) this;
        }

        public Criteria andTsFinefoodNumberIsNotNull() {
            addCriterion("ts_finefood_number is not null");
            return (Criteria) this;
        }

        public Criteria andTsFinefoodNumberEqualTo(Integer value) {
            addCriterion("ts_finefood_number =", value, "tsFinefoodNumber");
            return (Criteria) this;
        }

        public Criteria andTsFinefoodNumberNotEqualTo(Integer value) {
            addCriterion("ts_finefood_number <>", value, "tsFinefoodNumber");
            return (Criteria) this;
        }

        public Criteria andTsFinefoodNumberGreaterThan(Integer value) {
            addCriterion("ts_finefood_number >", value, "tsFinefoodNumber");
            return (Criteria) this;
        }

        public Criteria andTsFinefoodNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("ts_finefood_number >=", value, "tsFinefoodNumber");
            return (Criteria) this;
        }

        public Criteria andTsFinefoodNumberLessThan(Integer value) {
            addCriterion("ts_finefood_number <", value, "tsFinefoodNumber");
            return (Criteria) this;
        }

        public Criteria andTsFinefoodNumberLessThanOrEqualTo(Integer value) {
            addCriterion("ts_finefood_number <=", value, "tsFinefoodNumber");
            return (Criteria) this;
        }

        public Criteria andTsFinefoodNumberIn(List<Integer> values) {
            addCriterion("ts_finefood_number in", values, "tsFinefoodNumber");
            return (Criteria) this;
        }

        public Criteria andTsFinefoodNumberNotIn(List<Integer> values) {
            addCriterion("ts_finefood_number not in", values, "tsFinefoodNumber");
            return (Criteria) this;
        }

        public Criteria andTsFinefoodNumberBetween(Integer value1, Integer value2) {
            addCriterion("ts_finefood_number between", value1, value2, "tsFinefoodNumber");
            return (Criteria) this;
        }

        public Criteria andTsFinefoodNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("ts_finefood_number not between", value1, value2, "tsFinefoodNumber");
            return (Criteria) this;
        }

        public Criteria andTsFinefoodMoneyIsNull() {
            addCriterion("ts_finefood_money is null");
            return (Criteria) this;
        }

        public Criteria andTsFinefoodMoneyIsNotNull() {
            addCriterion("ts_finefood_money is not null");
            return (Criteria) this;
        }

        public Criteria andTsFinefoodMoneyEqualTo(Double value) {
            addCriterion("ts_finefood_money =", value, "tsFinefoodMoney");
            return (Criteria) this;
        }

        public Criteria andTsFinefoodMoneyNotEqualTo(Double value) {
            addCriterion("ts_finefood_money <>", value, "tsFinefoodMoney");
            return (Criteria) this;
        }

        public Criteria andTsFinefoodMoneyGreaterThan(Double value) {
            addCriterion("ts_finefood_money >", value, "tsFinefoodMoney");
            return (Criteria) this;
        }

        public Criteria andTsFinefoodMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("ts_finefood_money >=", value, "tsFinefoodMoney");
            return (Criteria) this;
        }

        public Criteria andTsFinefoodMoneyLessThan(Double value) {
            addCriterion("ts_finefood_money <", value, "tsFinefoodMoney");
            return (Criteria) this;
        }

        public Criteria andTsFinefoodMoneyLessThanOrEqualTo(Double value) {
            addCriterion("ts_finefood_money <=", value, "tsFinefoodMoney");
            return (Criteria) this;
        }

        public Criteria andTsFinefoodMoneyIn(List<Double> values) {
            addCriterion("ts_finefood_money in", values, "tsFinefoodMoney");
            return (Criteria) this;
        }

        public Criteria andTsFinefoodMoneyNotIn(List<Double> values) {
            addCriterion("ts_finefood_money not in", values, "tsFinefoodMoney");
            return (Criteria) this;
        }

        public Criteria andTsFinefoodMoneyBetween(Double value1, Double value2) {
            addCriterion("ts_finefood_money between", value1, value2, "tsFinefoodMoney");
            return (Criteria) this;
        }

        public Criteria andTsFinefoodMoneyNotBetween(Double value1, Double value2) {
            addCriterion("ts_finefood_money not between", value1, value2, "tsFinefoodMoney");
            return (Criteria) this;
        }

        public Criteria andTsFinefoodIntroduceIsNull() {
            addCriterion("ts_finefood_introduce is null");
            return (Criteria) this;
        }

        public Criteria andTsFinefoodIntroduceIsNotNull() {
            addCriterion("ts_finefood_introduce is not null");
            return (Criteria) this;
        }

        public Criteria andTsFinefoodIntroduceEqualTo(String value) {
            addCriterion("ts_finefood_introduce =", value, "tsFinefoodIntroduce");
            return (Criteria) this;
        }

        public Criteria andTsFinefoodIntroduceNotEqualTo(String value) {
            addCriterion("ts_finefood_introduce <>", value, "tsFinefoodIntroduce");
            return (Criteria) this;
        }

        public Criteria andTsFinefoodIntroduceGreaterThan(String value) {
            addCriterion("ts_finefood_introduce >", value, "tsFinefoodIntroduce");
            return (Criteria) this;
        }

        public Criteria andTsFinefoodIntroduceGreaterThanOrEqualTo(String value) {
            addCriterion("ts_finefood_introduce >=", value, "tsFinefoodIntroduce");
            return (Criteria) this;
        }

        public Criteria andTsFinefoodIntroduceLessThan(String value) {
            addCriterion("ts_finefood_introduce <", value, "tsFinefoodIntroduce");
            return (Criteria) this;
        }

        public Criteria andTsFinefoodIntroduceLessThanOrEqualTo(String value) {
            addCriterion("ts_finefood_introduce <=", value, "tsFinefoodIntroduce");
            return (Criteria) this;
        }

        public Criteria andTsFinefoodIntroduceLike(String value) {
            addCriterion("ts_finefood_introduce like", value, "tsFinefoodIntroduce");
            return (Criteria) this;
        }

        public Criteria andTsFinefoodIntroduceNotLike(String value) {
            addCriterion("ts_finefood_introduce not like", value, "tsFinefoodIntroduce");
            return (Criteria) this;
        }

        public Criteria andTsFinefoodIntroduceIn(List<String> values) {
            addCriterion("ts_finefood_introduce in", values, "tsFinefoodIntroduce");
            return (Criteria) this;
        }

        public Criteria andTsFinefoodIntroduceNotIn(List<String> values) {
            addCriterion("ts_finefood_introduce not in", values, "tsFinefoodIntroduce");
            return (Criteria) this;
        }

        public Criteria andTsFinefoodIntroduceBetween(String value1, String value2) {
            addCriterion("ts_finefood_introduce between", value1, value2, "tsFinefoodIntroduce");
            return (Criteria) this;
        }

        public Criteria andTsFinefoodIntroduceNotBetween(String value1, String value2) {
            addCriterion("ts_finefood_introduce not between", value1, value2, "tsFinefoodIntroduce");
            return (Criteria) this;
        }

        public Criteria andTsFinefoodStateIsNull() {
            addCriterion("ts_finefood_state is null");
            return (Criteria) this;
        }

        public Criteria andTsFinefoodStateIsNotNull() {
            addCriterion("ts_finefood_state is not null");
            return (Criteria) this;
        }

        public Criteria andTsFinefoodStateEqualTo(String value) {
            addCriterion("ts_finefood_state =", value, "tsFinefoodState");
            return (Criteria) this;
        }

        public Criteria andTsFinefoodStateNotEqualTo(String value) {
            addCriterion("ts_finefood_state <>", value, "tsFinefoodState");
            return (Criteria) this;
        }

        public Criteria andTsFinefoodStateGreaterThan(String value) {
            addCriterion("ts_finefood_state >", value, "tsFinefoodState");
            return (Criteria) this;
        }

        public Criteria andTsFinefoodStateGreaterThanOrEqualTo(String value) {
            addCriterion("ts_finefood_state >=", value, "tsFinefoodState");
            return (Criteria) this;
        }

        public Criteria andTsFinefoodStateLessThan(String value) {
            addCriterion("ts_finefood_state <", value, "tsFinefoodState");
            return (Criteria) this;
        }

        public Criteria andTsFinefoodStateLessThanOrEqualTo(String value) {
            addCriterion("ts_finefood_state <=", value, "tsFinefoodState");
            return (Criteria) this;
        }

        public Criteria andTsFinefoodStateLike(String value) {
            addCriterion("ts_finefood_state like", value, "tsFinefoodState");
            return (Criteria) this;
        }

        public Criteria andTsFinefoodStateNotLike(String value) {
            addCriterion("ts_finefood_state not like", value, "tsFinefoodState");
            return (Criteria) this;
        }

        public Criteria andTsFinefoodStateIn(List<String> values) {
            addCriterion("ts_finefood_state in", values, "tsFinefoodState");
            return (Criteria) this;
        }

        public Criteria andTsFinefoodStateNotIn(List<String> values) {
            addCriterion("ts_finefood_state not in", values, "tsFinefoodState");
            return (Criteria) this;
        }

        public Criteria andTsFinefoodStateBetween(String value1, String value2) {
            addCriterion("ts_finefood_state between", value1, value2, "tsFinefoodState");
            return (Criteria) this;
        }

        public Criteria andTsFinefoodStateNotBetween(String value1, String value2) {
            addCriterion("ts_finefood_state not between", value1, value2, "tsFinefoodState");
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