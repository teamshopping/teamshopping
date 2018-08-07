package com.neusoft.bean;

import java.util.ArrayList;
import java.util.List;

public class TeamshoppingFreshExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TeamshoppingFreshExample() {
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

        public Criteria andTsFreshIdIsNull() {
            addCriterion("ts_fresh_id is null");
            return (Criteria) this;
        }

        public Criteria andTsFreshIdIsNotNull() {
            addCriterion("ts_fresh_id is not null");
            return (Criteria) this;
        }

        public Criteria andTsFreshIdEqualTo(Integer value) {
            addCriterion("ts_fresh_id =", value, "tsFreshId");
            return (Criteria) this;
        }

        public Criteria andTsFreshIdNotEqualTo(Integer value) {
            addCriterion("ts_fresh_id <>", value, "tsFreshId");
            return (Criteria) this;
        }

        public Criteria andTsFreshIdGreaterThan(Integer value) {
            addCriterion("ts_fresh_id >", value, "tsFreshId");
            return (Criteria) this;
        }

        public Criteria andTsFreshIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ts_fresh_id >=", value, "tsFreshId");
            return (Criteria) this;
        }

        public Criteria andTsFreshIdLessThan(Integer value) {
            addCriterion("ts_fresh_id <", value, "tsFreshId");
            return (Criteria) this;
        }

        public Criteria andTsFreshIdLessThanOrEqualTo(Integer value) {
            addCriterion("ts_fresh_id <=", value, "tsFreshId");
            return (Criteria) this;
        }

        public Criteria andTsFreshIdIn(List<Integer> values) {
            addCriterion("ts_fresh_id in", values, "tsFreshId");
            return (Criteria) this;
        }

        public Criteria andTsFreshIdNotIn(List<Integer> values) {
            addCriterion("ts_fresh_id not in", values, "tsFreshId");
            return (Criteria) this;
        }

        public Criteria andTsFreshIdBetween(Integer value1, Integer value2) {
            addCriterion("ts_fresh_id between", value1, value2, "tsFreshId");
            return (Criteria) this;
        }

        public Criteria andTsFreshIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ts_fresh_id not between", value1, value2, "tsFreshId");
            return (Criteria) this;
        }

        public Criteria andTsFreshNameIsNull() {
            addCriterion("ts_fresh_name is null");
            return (Criteria) this;
        }

        public Criteria andTsFreshNameIsNotNull() {
            addCriterion("ts_fresh_name is not null");
            return (Criteria) this;
        }

        public Criteria andTsFreshNameEqualTo(String value) {
            addCriterion("ts_fresh_name =", value, "tsFreshName");
            return (Criteria) this;
        }

        public Criteria andTsFreshNameNotEqualTo(String value) {
            addCriterion("ts_fresh_name <>", value, "tsFreshName");
            return (Criteria) this;
        }

        public Criteria andTsFreshNameGreaterThan(String value) {
            addCriterion("ts_fresh_name >", value, "tsFreshName");
            return (Criteria) this;
        }

        public Criteria andTsFreshNameGreaterThanOrEqualTo(String value) {
            addCriterion("ts_fresh_name >=", value, "tsFreshName");
            return (Criteria) this;
        }

        public Criteria andTsFreshNameLessThan(String value) {
            addCriterion("ts_fresh_name <", value, "tsFreshName");
            return (Criteria) this;
        }

        public Criteria andTsFreshNameLessThanOrEqualTo(String value) {
            addCriterion("ts_fresh_name <=", value, "tsFreshName");
            return (Criteria) this;
        }

        public Criteria andTsFreshNameLike(String value) {
            addCriterion("ts_fresh_name like", value, "tsFreshName");
            return (Criteria) this;
        }

        public Criteria andTsFreshNameNotLike(String value) {
            addCriterion("ts_fresh_name not like", value, "tsFreshName");
            return (Criteria) this;
        }

        public Criteria andTsFreshNameIn(List<String> values) {
            addCriterion("ts_fresh_name in", values, "tsFreshName");
            return (Criteria) this;
        }

        public Criteria andTsFreshNameNotIn(List<String> values) {
            addCriterion("ts_fresh_name not in", values, "tsFreshName");
            return (Criteria) this;
        }

        public Criteria andTsFreshNameBetween(String value1, String value2) {
            addCriterion("ts_fresh_name between", value1, value2, "tsFreshName");
            return (Criteria) this;
        }

        public Criteria andTsFreshNameNotBetween(String value1, String value2) {
            addCriterion("ts_fresh_name not between", value1, value2, "tsFreshName");
            return (Criteria) this;
        }

        public Criteria andTsFreshBrandIsNull() {
            addCriterion("ts_fresh_brand is null");
            return (Criteria) this;
        }

        public Criteria andTsFreshBrandIsNotNull() {
            addCriterion("ts_fresh_brand is not null");
            return (Criteria) this;
        }

        public Criteria andTsFreshBrandEqualTo(String value) {
            addCriterion("ts_fresh_brand =", value, "tsFreshBrand");
            return (Criteria) this;
        }

        public Criteria andTsFreshBrandNotEqualTo(String value) {
            addCriterion("ts_fresh_brand <>", value, "tsFreshBrand");
            return (Criteria) this;
        }

        public Criteria andTsFreshBrandGreaterThan(String value) {
            addCriterion("ts_fresh_brand >", value, "tsFreshBrand");
            return (Criteria) this;
        }

        public Criteria andTsFreshBrandGreaterThanOrEqualTo(String value) {
            addCriterion("ts_fresh_brand >=", value, "tsFreshBrand");
            return (Criteria) this;
        }

        public Criteria andTsFreshBrandLessThan(String value) {
            addCriterion("ts_fresh_brand <", value, "tsFreshBrand");
            return (Criteria) this;
        }

        public Criteria andTsFreshBrandLessThanOrEqualTo(String value) {
            addCriterion("ts_fresh_brand <=", value, "tsFreshBrand");
            return (Criteria) this;
        }

        public Criteria andTsFreshBrandLike(String value) {
            addCriterion("ts_fresh_brand like", value, "tsFreshBrand");
            return (Criteria) this;
        }

        public Criteria andTsFreshBrandNotLike(String value) {
            addCriterion("ts_fresh_brand not like", value, "tsFreshBrand");
            return (Criteria) this;
        }

        public Criteria andTsFreshBrandIn(List<String> values) {
            addCriterion("ts_fresh_brand in", values, "tsFreshBrand");
            return (Criteria) this;
        }

        public Criteria andTsFreshBrandNotIn(List<String> values) {
            addCriterion("ts_fresh_brand not in", values, "tsFreshBrand");
            return (Criteria) this;
        }

        public Criteria andTsFreshBrandBetween(String value1, String value2) {
            addCriterion("ts_fresh_brand between", value1, value2, "tsFreshBrand");
            return (Criteria) this;
        }

        public Criteria andTsFreshBrandNotBetween(String value1, String value2) {
            addCriterion("ts_fresh_brand not between", value1, value2, "tsFreshBrand");
            return (Criteria) this;
        }

        public Criteria andTsFreshAmountIsNull() {
            addCriterion("ts_fresh_amount is null");
            return (Criteria) this;
        }

        public Criteria andTsFreshAmountIsNotNull() {
            addCriterion("ts_fresh_amount is not null");
            return (Criteria) this;
        }

        public Criteria andTsFreshAmountEqualTo(String value) {
            addCriterion("ts_fresh_amount =", value, "tsFreshAmount");
            return (Criteria) this;
        }

        public Criteria andTsFreshAmountNotEqualTo(String value) {
            addCriterion("ts_fresh_amount <>", value, "tsFreshAmount");
            return (Criteria) this;
        }

        public Criteria andTsFreshAmountGreaterThan(String value) {
            addCriterion("ts_fresh_amount >", value, "tsFreshAmount");
            return (Criteria) this;
        }

        public Criteria andTsFreshAmountGreaterThanOrEqualTo(String value) {
            addCriterion("ts_fresh_amount >=", value, "tsFreshAmount");
            return (Criteria) this;
        }

        public Criteria andTsFreshAmountLessThan(String value) {
            addCriterion("ts_fresh_amount <", value, "tsFreshAmount");
            return (Criteria) this;
        }

        public Criteria andTsFreshAmountLessThanOrEqualTo(String value) {
            addCriterion("ts_fresh_amount <=", value, "tsFreshAmount");
            return (Criteria) this;
        }

        public Criteria andTsFreshAmountLike(String value) {
            addCriterion("ts_fresh_amount like", value, "tsFreshAmount");
            return (Criteria) this;
        }

        public Criteria andTsFreshAmountNotLike(String value) {
            addCriterion("ts_fresh_amount not like", value, "tsFreshAmount");
            return (Criteria) this;
        }

        public Criteria andTsFreshAmountIn(List<String> values) {
            addCriterion("ts_fresh_amount in", values, "tsFreshAmount");
            return (Criteria) this;
        }

        public Criteria andTsFreshAmountNotIn(List<String> values) {
            addCriterion("ts_fresh_amount not in", values, "tsFreshAmount");
            return (Criteria) this;
        }

        public Criteria andTsFreshAmountBetween(String value1, String value2) {
            addCriterion("ts_fresh_amount between", value1, value2, "tsFreshAmount");
            return (Criteria) this;
        }

        public Criteria andTsFreshAmountNotBetween(String value1, String value2) {
            addCriterion("ts_fresh_amount not between", value1, value2, "tsFreshAmount");
            return (Criteria) this;
        }

        public Criteria andTsFreshPictureIsNull() {
            addCriterion("ts_fresh_picture is null");
            return (Criteria) this;
        }

        public Criteria andTsFreshPictureIsNotNull() {
            addCriterion("ts_fresh_picture is not null");
            return (Criteria) this;
        }

        public Criteria andTsFreshPictureEqualTo(String value) {
            addCriterion("ts_fresh_picture =", value, "tsFreshPicture");
            return (Criteria) this;
        }

        public Criteria andTsFreshPictureNotEqualTo(String value) {
            addCriterion("ts_fresh_picture <>", value, "tsFreshPicture");
            return (Criteria) this;
        }

        public Criteria andTsFreshPictureGreaterThan(String value) {
            addCriterion("ts_fresh_picture >", value, "tsFreshPicture");
            return (Criteria) this;
        }

        public Criteria andTsFreshPictureGreaterThanOrEqualTo(String value) {
            addCriterion("ts_fresh_picture >=", value, "tsFreshPicture");
            return (Criteria) this;
        }

        public Criteria andTsFreshPictureLessThan(String value) {
            addCriterion("ts_fresh_picture <", value, "tsFreshPicture");
            return (Criteria) this;
        }

        public Criteria andTsFreshPictureLessThanOrEqualTo(String value) {
            addCriterion("ts_fresh_picture <=", value, "tsFreshPicture");
            return (Criteria) this;
        }

        public Criteria andTsFreshPictureLike(String value) {
            addCriterion("ts_fresh_picture like", value, "tsFreshPicture");
            return (Criteria) this;
        }

        public Criteria andTsFreshPictureNotLike(String value) {
            addCriterion("ts_fresh_picture not like", value, "tsFreshPicture");
            return (Criteria) this;
        }

        public Criteria andTsFreshPictureIn(List<String> values) {
            addCriterion("ts_fresh_picture in", values, "tsFreshPicture");
            return (Criteria) this;
        }

        public Criteria andTsFreshPictureNotIn(List<String> values) {
            addCriterion("ts_fresh_picture not in", values, "tsFreshPicture");
            return (Criteria) this;
        }

        public Criteria andTsFreshPictureBetween(String value1, String value2) {
            addCriterion("ts_fresh_picture between", value1, value2, "tsFreshPicture");
            return (Criteria) this;
        }

        public Criteria andTsFreshPictureNotBetween(String value1, String value2) {
            addCriterion("ts_fresh_picture not between", value1, value2, "tsFreshPicture");
            return (Criteria) this;
        }

        public Criteria andTsFreshLandIsNull() {
            addCriterion("ts_fresh_land is null");
            return (Criteria) this;
        }

        public Criteria andTsFreshLandIsNotNull() {
            addCriterion("ts_fresh_land is not null");
            return (Criteria) this;
        }

        public Criteria andTsFreshLandEqualTo(String value) {
            addCriterion("ts_fresh_land =", value, "tsFreshLand");
            return (Criteria) this;
        }

        public Criteria andTsFreshLandNotEqualTo(String value) {
            addCriterion("ts_fresh_land <>", value, "tsFreshLand");
            return (Criteria) this;
        }

        public Criteria andTsFreshLandGreaterThan(String value) {
            addCriterion("ts_fresh_land >", value, "tsFreshLand");
            return (Criteria) this;
        }

        public Criteria andTsFreshLandGreaterThanOrEqualTo(String value) {
            addCriterion("ts_fresh_land >=", value, "tsFreshLand");
            return (Criteria) this;
        }

        public Criteria andTsFreshLandLessThan(String value) {
            addCriterion("ts_fresh_land <", value, "tsFreshLand");
            return (Criteria) this;
        }

        public Criteria andTsFreshLandLessThanOrEqualTo(String value) {
            addCriterion("ts_fresh_land <=", value, "tsFreshLand");
            return (Criteria) this;
        }

        public Criteria andTsFreshLandLike(String value) {
            addCriterion("ts_fresh_land like", value, "tsFreshLand");
            return (Criteria) this;
        }

        public Criteria andTsFreshLandNotLike(String value) {
            addCriterion("ts_fresh_land not like", value, "tsFreshLand");
            return (Criteria) this;
        }

        public Criteria andTsFreshLandIn(List<String> values) {
            addCriterion("ts_fresh_land in", values, "tsFreshLand");
            return (Criteria) this;
        }

        public Criteria andTsFreshLandNotIn(List<String> values) {
            addCriterion("ts_fresh_land not in", values, "tsFreshLand");
            return (Criteria) this;
        }

        public Criteria andTsFreshLandBetween(String value1, String value2) {
            addCriterion("ts_fresh_land between", value1, value2, "tsFreshLand");
            return (Criteria) this;
        }

        public Criteria andTsFreshLandNotBetween(String value1, String value2) {
            addCriterion("ts_fresh_land not between", value1, value2, "tsFreshLand");
            return (Criteria) this;
        }

        public Criteria andTsFreshTimeIsNull() {
            addCriterion("ts_fresh_time is null");
            return (Criteria) this;
        }

        public Criteria andTsFreshTimeIsNotNull() {
            addCriterion("ts_fresh_time is not null");
            return (Criteria) this;
        }

        public Criteria andTsFreshTimeEqualTo(String value) {
            addCriterion("ts_fresh_time =", value, "tsFreshTime");
            return (Criteria) this;
        }

        public Criteria andTsFreshTimeNotEqualTo(String value) {
            addCriterion("ts_fresh_time <>", value, "tsFreshTime");
            return (Criteria) this;
        }

        public Criteria andTsFreshTimeGreaterThan(String value) {
            addCriterion("ts_fresh_time >", value, "tsFreshTime");
            return (Criteria) this;
        }

        public Criteria andTsFreshTimeGreaterThanOrEqualTo(String value) {
            addCriterion("ts_fresh_time >=", value, "tsFreshTime");
            return (Criteria) this;
        }

        public Criteria andTsFreshTimeLessThan(String value) {
            addCriterion("ts_fresh_time <", value, "tsFreshTime");
            return (Criteria) this;
        }

        public Criteria andTsFreshTimeLessThanOrEqualTo(String value) {
            addCriterion("ts_fresh_time <=", value, "tsFreshTime");
            return (Criteria) this;
        }

        public Criteria andTsFreshTimeLike(String value) {
            addCriterion("ts_fresh_time like", value, "tsFreshTime");
            return (Criteria) this;
        }

        public Criteria andTsFreshTimeNotLike(String value) {
            addCriterion("ts_fresh_time not like", value, "tsFreshTime");
            return (Criteria) this;
        }

        public Criteria andTsFreshTimeIn(List<String> values) {
            addCriterion("ts_fresh_time in", values, "tsFreshTime");
            return (Criteria) this;
        }

        public Criteria andTsFreshTimeNotIn(List<String> values) {
            addCriterion("ts_fresh_time not in", values, "tsFreshTime");
            return (Criteria) this;
        }

        public Criteria andTsFreshTimeBetween(String value1, String value2) {
            addCriterion("ts_fresh_time between", value1, value2, "tsFreshTime");
            return (Criteria) this;
        }

        public Criteria andTsFreshTimeNotBetween(String value1, String value2) {
            addCriterion("ts_fresh_time not between", value1, value2, "tsFreshTime");
            return (Criteria) this;
        }

        public Criteria andTsFreshModeIsNull() {
            addCriterion("ts_fresh_mode is null");
            return (Criteria) this;
        }

        public Criteria andTsFreshModeIsNotNull() {
            addCriterion("ts_fresh_mode is not null");
            return (Criteria) this;
        }

        public Criteria andTsFreshModeEqualTo(String value) {
            addCriterion("ts_fresh_mode =", value, "tsFreshMode");
            return (Criteria) this;
        }

        public Criteria andTsFreshModeNotEqualTo(String value) {
            addCriterion("ts_fresh_mode <>", value, "tsFreshMode");
            return (Criteria) this;
        }

        public Criteria andTsFreshModeGreaterThan(String value) {
            addCriterion("ts_fresh_mode >", value, "tsFreshMode");
            return (Criteria) this;
        }

        public Criteria andTsFreshModeGreaterThanOrEqualTo(String value) {
            addCriterion("ts_fresh_mode >=", value, "tsFreshMode");
            return (Criteria) this;
        }

        public Criteria andTsFreshModeLessThan(String value) {
            addCriterion("ts_fresh_mode <", value, "tsFreshMode");
            return (Criteria) this;
        }

        public Criteria andTsFreshModeLessThanOrEqualTo(String value) {
            addCriterion("ts_fresh_mode <=", value, "tsFreshMode");
            return (Criteria) this;
        }

        public Criteria andTsFreshModeLike(String value) {
            addCriterion("ts_fresh_mode like", value, "tsFreshMode");
            return (Criteria) this;
        }

        public Criteria andTsFreshModeNotLike(String value) {
            addCriterion("ts_fresh_mode not like", value, "tsFreshMode");
            return (Criteria) this;
        }

        public Criteria andTsFreshModeIn(List<String> values) {
            addCriterion("ts_fresh_mode in", values, "tsFreshMode");
            return (Criteria) this;
        }

        public Criteria andTsFreshModeNotIn(List<String> values) {
            addCriterion("ts_fresh_mode not in", values, "tsFreshMode");
            return (Criteria) this;
        }

        public Criteria andTsFreshModeBetween(String value1, String value2) {
            addCriterion("ts_fresh_mode between", value1, value2, "tsFreshMode");
            return (Criteria) this;
        }

        public Criteria andTsFreshModeNotBetween(String value1, String value2) {
            addCriterion("ts_fresh_mode not between", value1, value2, "tsFreshMode");
            return (Criteria) this;
        }

        public Criteria andTsFreshNumberIsNull() {
            addCriterion("ts_fresh_number is null");
            return (Criteria) this;
        }

        public Criteria andTsFreshNumberIsNotNull() {
            addCriterion("ts_fresh_number is not null");
            return (Criteria) this;
        }

        public Criteria andTsFreshNumberEqualTo(Integer value) {
            addCriterion("ts_fresh_number =", value, "tsFreshNumber");
            return (Criteria) this;
        }

        public Criteria andTsFreshNumberNotEqualTo(Integer value) {
            addCriterion("ts_fresh_number <>", value, "tsFreshNumber");
            return (Criteria) this;
        }

        public Criteria andTsFreshNumberGreaterThan(Integer value) {
            addCriterion("ts_fresh_number >", value, "tsFreshNumber");
            return (Criteria) this;
        }

        public Criteria andTsFreshNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("ts_fresh_number >=", value, "tsFreshNumber");
            return (Criteria) this;
        }

        public Criteria andTsFreshNumberLessThan(Integer value) {
            addCriterion("ts_fresh_number <", value, "tsFreshNumber");
            return (Criteria) this;
        }

        public Criteria andTsFreshNumberLessThanOrEqualTo(Integer value) {
            addCriterion("ts_fresh_number <=", value, "tsFreshNumber");
            return (Criteria) this;
        }

        public Criteria andTsFreshNumberIn(List<Integer> values) {
            addCriterion("ts_fresh_number in", values, "tsFreshNumber");
            return (Criteria) this;
        }

        public Criteria andTsFreshNumberNotIn(List<Integer> values) {
            addCriterion("ts_fresh_number not in", values, "tsFreshNumber");
            return (Criteria) this;
        }

        public Criteria andTsFreshNumberBetween(Integer value1, Integer value2) {
            addCriterion("ts_fresh_number between", value1, value2, "tsFreshNumber");
            return (Criteria) this;
        }

        public Criteria andTsFreshNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("ts_fresh_number not between", value1, value2, "tsFreshNumber");
            return (Criteria) this;
        }

        public Criteria andTsFreshMoneyIsNull() {
            addCriterion("ts_fresh_money is null");
            return (Criteria) this;
        }

        public Criteria andTsFreshMoneyIsNotNull() {
            addCriterion("ts_fresh_money is not null");
            return (Criteria) this;
        }

        public Criteria andTsFreshMoneyEqualTo(Double value) {
            addCriterion("ts_fresh_money =", value, "tsFreshMoney");
            return (Criteria) this;
        }

        public Criteria andTsFreshMoneyNotEqualTo(Double value) {
            addCriterion("ts_fresh_money <>", value, "tsFreshMoney");
            return (Criteria) this;
        }

        public Criteria andTsFreshMoneyGreaterThan(Double value) {
            addCriterion("ts_fresh_money >", value, "tsFreshMoney");
            return (Criteria) this;
        }

        public Criteria andTsFreshMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("ts_fresh_money >=", value, "tsFreshMoney");
            return (Criteria) this;
        }

        public Criteria andTsFreshMoneyLessThan(Double value) {
            addCriterion("ts_fresh_money <", value, "tsFreshMoney");
            return (Criteria) this;
        }

        public Criteria andTsFreshMoneyLessThanOrEqualTo(Double value) {
            addCriterion("ts_fresh_money <=", value, "tsFreshMoney");
            return (Criteria) this;
        }

        public Criteria andTsFreshMoneyIn(List<Double> values) {
            addCriterion("ts_fresh_money in", values, "tsFreshMoney");
            return (Criteria) this;
        }

        public Criteria andTsFreshMoneyNotIn(List<Double> values) {
            addCriterion("ts_fresh_money not in", values, "tsFreshMoney");
            return (Criteria) this;
        }

        public Criteria andTsFreshMoneyBetween(Double value1, Double value2) {
            addCriterion("ts_fresh_money between", value1, value2, "tsFreshMoney");
            return (Criteria) this;
        }

        public Criteria andTsFreshMoneyNotBetween(Double value1, Double value2) {
            addCriterion("ts_fresh_money not between", value1, value2, "tsFreshMoney");
            return (Criteria) this;
        }

        public Criteria andTsFreshIntroduceIsNull() {
            addCriterion("ts_fresh_introduce is null");
            return (Criteria) this;
        }

        public Criteria andTsFreshIntroduceIsNotNull() {
            addCriterion("ts_fresh_introduce is not null");
            return (Criteria) this;
        }

        public Criteria andTsFreshIntroduceEqualTo(String value) {
            addCriterion("ts_fresh_introduce =", value, "tsFreshIntroduce");
            return (Criteria) this;
        }

        public Criteria andTsFreshIntroduceNotEqualTo(String value) {
            addCriterion("ts_fresh_introduce <>", value, "tsFreshIntroduce");
            return (Criteria) this;
        }

        public Criteria andTsFreshIntroduceGreaterThan(String value) {
            addCriterion("ts_fresh_introduce >", value, "tsFreshIntroduce");
            return (Criteria) this;
        }

        public Criteria andTsFreshIntroduceGreaterThanOrEqualTo(String value) {
            addCriterion("ts_fresh_introduce >=", value, "tsFreshIntroduce");
            return (Criteria) this;
        }

        public Criteria andTsFreshIntroduceLessThan(String value) {
            addCriterion("ts_fresh_introduce <", value, "tsFreshIntroduce");
            return (Criteria) this;
        }

        public Criteria andTsFreshIntroduceLessThanOrEqualTo(String value) {
            addCriterion("ts_fresh_introduce <=", value, "tsFreshIntroduce");
            return (Criteria) this;
        }

        public Criteria andTsFreshIntroduceLike(String value) {
            addCriterion("ts_fresh_introduce like", value, "tsFreshIntroduce");
            return (Criteria) this;
        }

        public Criteria andTsFreshIntroduceNotLike(String value) {
            addCriterion("ts_fresh_introduce not like", value, "tsFreshIntroduce");
            return (Criteria) this;
        }

        public Criteria andTsFreshIntroduceIn(List<String> values) {
            addCriterion("ts_fresh_introduce in", values, "tsFreshIntroduce");
            return (Criteria) this;
        }

        public Criteria andTsFreshIntroduceNotIn(List<String> values) {
            addCriterion("ts_fresh_introduce not in", values, "tsFreshIntroduce");
            return (Criteria) this;
        }

        public Criteria andTsFreshIntroduceBetween(String value1, String value2) {
            addCriterion("ts_fresh_introduce between", value1, value2, "tsFreshIntroduce");
            return (Criteria) this;
        }

        public Criteria andTsFreshIntroduceNotBetween(String value1, String value2) {
            addCriterion("ts_fresh_introduce not between", value1, value2, "tsFreshIntroduce");
            return (Criteria) this;
        }

        public Criteria andTsFreshStateIsNull() {
            addCriterion("ts_fresh_state is null");
            return (Criteria) this;
        }

        public Criteria andTsFreshStateIsNotNull() {
            addCriterion("ts_fresh_state is not null");
            return (Criteria) this;
        }

        public Criteria andTsFreshStateEqualTo(String value) {
            addCriterion("ts_fresh_state =", value, "tsFreshState");
            return (Criteria) this;
        }

        public Criteria andTsFreshStateNotEqualTo(String value) {
            addCriterion("ts_fresh_state <>", value, "tsFreshState");
            return (Criteria) this;
        }

        public Criteria andTsFreshStateGreaterThan(String value) {
            addCriterion("ts_fresh_state >", value, "tsFreshState");
            return (Criteria) this;
        }

        public Criteria andTsFreshStateGreaterThanOrEqualTo(String value) {
            addCriterion("ts_fresh_state >=", value, "tsFreshState");
            return (Criteria) this;
        }

        public Criteria andTsFreshStateLessThan(String value) {
            addCriterion("ts_fresh_state <", value, "tsFreshState");
            return (Criteria) this;
        }

        public Criteria andTsFreshStateLessThanOrEqualTo(String value) {
            addCriterion("ts_fresh_state <=", value, "tsFreshState");
            return (Criteria) this;
        }

        public Criteria andTsFreshStateLike(String value) {
            addCriterion("ts_fresh_state like", value, "tsFreshState");
            return (Criteria) this;
        }

        public Criteria andTsFreshStateNotLike(String value) {
            addCriterion("ts_fresh_state not like", value, "tsFreshState");
            return (Criteria) this;
        }

        public Criteria andTsFreshStateIn(List<String> values) {
            addCriterion("ts_fresh_state in", values, "tsFreshState");
            return (Criteria) this;
        }

        public Criteria andTsFreshStateNotIn(List<String> values) {
            addCriterion("ts_fresh_state not in", values, "tsFreshState");
            return (Criteria) this;
        }

        public Criteria andTsFreshStateBetween(String value1, String value2) {
            addCriterion("ts_fresh_state between", value1, value2, "tsFreshState");
            return (Criteria) this;
        }

        public Criteria andTsFreshStateNotBetween(String value1, String value2) {
            addCriterion("ts_fresh_state not between", value1, value2, "tsFreshState");
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