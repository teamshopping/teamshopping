package com.neusoft.bean;

import java.util.ArrayList;
import java.util.List;

public class TeamshoppingBooksExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TeamshoppingBooksExample() {
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

        public Criteria andTsBooksIdIsNull() {
            addCriterion("ts_books_id is null");
            return (Criteria) this;
        }

        public Criteria andTsBooksIdIsNotNull() {
            addCriterion("ts_books_id is not null");
            return (Criteria) this;
        }

        public Criteria andTsBooksIdEqualTo(Integer value) {
            addCriterion("ts_books_id =", value, "tsBooksId");
            return (Criteria) this;
        }

        public Criteria andTsBooksIdNotEqualTo(Integer value) {
            addCriterion("ts_books_id <>", value, "tsBooksId");
            return (Criteria) this;
        }

        public Criteria andTsBooksIdGreaterThan(Integer value) {
            addCriterion("ts_books_id >", value, "tsBooksId");
            return (Criteria) this;
        }

        public Criteria andTsBooksIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ts_books_id >=", value, "tsBooksId");
            return (Criteria) this;
        }

        public Criteria andTsBooksIdLessThan(Integer value) {
            addCriterion("ts_books_id <", value, "tsBooksId");
            return (Criteria) this;
        }

        public Criteria andTsBooksIdLessThanOrEqualTo(Integer value) {
            addCriterion("ts_books_id <=", value, "tsBooksId");
            return (Criteria) this;
        }

        public Criteria andTsBooksIdIn(List<Integer> values) {
            addCriterion("ts_books_id in", values, "tsBooksId");
            return (Criteria) this;
        }

        public Criteria andTsBooksIdNotIn(List<Integer> values) {
            addCriterion("ts_books_id not in", values, "tsBooksId");
            return (Criteria) this;
        }

        public Criteria andTsBooksIdBetween(Integer value1, Integer value2) {
            addCriterion("ts_books_id between", value1, value2, "tsBooksId");
            return (Criteria) this;
        }

        public Criteria andTsBooksIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ts_books_id not between", value1, value2, "tsBooksId");
            return (Criteria) this;
        }

        public Criteria andTsBooksNameIsNull() {
            addCriterion("ts_books_name is null");
            return (Criteria) this;
        }

        public Criteria andTsBooksNameIsNotNull() {
            addCriterion("ts_books_name is not null");
            return (Criteria) this;
        }

        public Criteria andTsBooksNameEqualTo(String value) {
            addCriterion("ts_books_name =", value, "tsBooksName");
            return (Criteria) this;
        }

        public Criteria andTsBooksNameNotEqualTo(String value) {
            addCriterion("ts_books_name <>", value, "tsBooksName");
            return (Criteria) this;
        }

        public Criteria andTsBooksNameGreaterThan(String value) {
            addCriterion("ts_books_name >", value, "tsBooksName");
            return (Criteria) this;
        }

        public Criteria andTsBooksNameGreaterThanOrEqualTo(String value) {
            addCriterion("ts_books_name >=", value, "tsBooksName");
            return (Criteria) this;
        }

        public Criteria andTsBooksNameLessThan(String value) {
            addCriterion("ts_books_name <", value, "tsBooksName");
            return (Criteria) this;
        }

        public Criteria andTsBooksNameLessThanOrEqualTo(String value) {
            addCriterion("ts_books_name <=", value, "tsBooksName");
            return (Criteria) this;
        }

        public Criteria andTsBooksNameLike(String value) {
            addCriterion("ts_books_name like", value, "tsBooksName");
            return (Criteria) this;
        }

        public Criteria andTsBooksNameNotLike(String value) {
            addCriterion("ts_books_name not like", value, "tsBooksName");
            return (Criteria) this;
        }

        public Criteria andTsBooksNameIn(List<String> values) {
            addCriterion("ts_books_name in", values, "tsBooksName");
            return (Criteria) this;
        }

        public Criteria andTsBooksNameNotIn(List<String> values) {
            addCriterion("ts_books_name not in", values, "tsBooksName");
            return (Criteria) this;
        }

        public Criteria andTsBooksNameBetween(String value1, String value2) {
            addCriterion("ts_books_name between", value1, value2, "tsBooksName");
            return (Criteria) this;
        }

        public Criteria andTsBooksNameNotBetween(String value1, String value2) {
            addCriterion("ts_books_name not between", value1, value2, "tsBooksName");
            return (Criteria) this;
        }

        public Criteria andTsBooksTypeIsNull() {
            addCriterion("ts_books_type is null");
            return (Criteria) this;
        }

        public Criteria andTsBooksTypeIsNotNull() {
            addCriterion("ts_books_type is not null");
            return (Criteria) this;
        }

        public Criteria andTsBooksTypeEqualTo(String value) {
            addCriterion("ts_books_type =", value, "tsBooksType");
            return (Criteria) this;
        }

        public Criteria andTsBooksTypeNotEqualTo(String value) {
            addCriterion("ts_books_type <>", value, "tsBooksType");
            return (Criteria) this;
        }

        public Criteria andTsBooksTypeGreaterThan(String value) {
            addCriterion("ts_books_type >", value, "tsBooksType");
            return (Criteria) this;
        }

        public Criteria andTsBooksTypeGreaterThanOrEqualTo(String value) {
            addCriterion("ts_books_type >=", value, "tsBooksType");
            return (Criteria) this;
        }

        public Criteria andTsBooksTypeLessThan(String value) {
            addCriterion("ts_books_type <", value, "tsBooksType");
            return (Criteria) this;
        }

        public Criteria andTsBooksTypeLessThanOrEqualTo(String value) {
            addCriterion("ts_books_type <=", value, "tsBooksType");
            return (Criteria) this;
        }

        public Criteria andTsBooksTypeLike(String value) {
            addCriterion("ts_books_type like", value, "tsBooksType");
            return (Criteria) this;
        }

        public Criteria andTsBooksTypeNotLike(String value) {
            addCriterion("ts_books_type not like", value, "tsBooksType");
            return (Criteria) this;
        }

        public Criteria andTsBooksTypeIn(List<String> values) {
            addCriterion("ts_books_type in", values, "tsBooksType");
            return (Criteria) this;
        }

        public Criteria andTsBooksTypeNotIn(List<String> values) {
            addCriterion("ts_books_type not in", values, "tsBooksType");
            return (Criteria) this;
        }

        public Criteria andTsBooksTypeBetween(String value1, String value2) {
            addCriterion("ts_books_type between", value1, value2, "tsBooksType");
            return (Criteria) this;
        }

        public Criteria andTsBooksTypeNotBetween(String value1, String value2) {
            addCriterion("ts_books_type not between", value1, value2, "tsBooksType");
            return (Criteria) this;
        }

        public Criteria andTsBooksAuthorIsNull() {
            addCriterion("ts_books_author is null");
            return (Criteria) this;
        }

        public Criteria andTsBooksAuthorIsNotNull() {
            addCriterion("ts_books_author is not null");
            return (Criteria) this;
        }

        public Criteria andTsBooksAuthorEqualTo(String value) {
            addCriterion("ts_books_author =", value, "tsBooksAuthor");
            return (Criteria) this;
        }

        public Criteria andTsBooksAuthorNotEqualTo(String value) {
            addCriterion("ts_books_author <>", value, "tsBooksAuthor");
            return (Criteria) this;
        }

        public Criteria andTsBooksAuthorGreaterThan(String value) {
            addCriterion("ts_books_author >", value, "tsBooksAuthor");
            return (Criteria) this;
        }

        public Criteria andTsBooksAuthorGreaterThanOrEqualTo(String value) {
            addCriterion("ts_books_author >=", value, "tsBooksAuthor");
            return (Criteria) this;
        }

        public Criteria andTsBooksAuthorLessThan(String value) {
            addCriterion("ts_books_author <", value, "tsBooksAuthor");
            return (Criteria) this;
        }

        public Criteria andTsBooksAuthorLessThanOrEqualTo(String value) {
            addCriterion("ts_books_author <=", value, "tsBooksAuthor");
            return (Criteria) this;
        }

        public Criteria andTsBooksAuthorLike(String value) {
            addCriterion("ts_books_author like", value, "tsBooksAuthor");
            return (Criteria) this;
        }

        public Criteria andTsBooksAuthorNotLike(String value) {
            addCriterion("ts_books_author not like", value, "tsBooksAuthor");
            return (Criteria) this;
        }

        public Criteria andTsBooksAuthorIn(List<String> values) {
            addCriterion("ts_books_author in", values, "tsBooksAuthor");
            return (Criteria) this;
        }

        public Criteria andTsBooksAuthorNotIn(List<String> values) {
            addCriterion("ts_books_author not in", values, "tsBooksAuthor");
            return (Criteria) this;
        }

        public Criteria andTsBooksAuthorBetween(String value1, String value2) {
            addCriterion("ts_books_author between", value1, value2, "tsBooksAuthor");
            return (Criteria) this;
        }

        public Criteria andTsBooksAuthorNotBetween(String value1, String value2) {
            addCriterion("ts_books_author not between", value1, value2, "tsBooksAuthor");
            return (Criteria) this;
        }

        public Criteria andTsBooksPressIsNull() {
            addCriterion("ts_books_press is null");
            return (Criteria) this;
        }

        public Criteria andTsBooksPressIsNotNull() {
            addCriterion("ts_books_press is not null");
            return (Criteria) this;
        }

        public Criteria andTsBooksPressEqualTo(String value) {
            addCriterion("ts_books_press =", value, "tsBooksPress");
            return (Criteria) this;
        }

        public Criteria andTsBooksPressNotEqualTo(String value) {
            addCriterion("ts_books_press <>", value, "tsBooksPress");
            return (Criteria) this;
        }

        public Criteria andTsBooksPressGreaterThan(String value) {
            addCriterion("ts_books_press >", value, "tsBooksPress");
            return (Criteria) this;
        }

        public Criteria andTsBooksPressGreaterThanOrEqualTo(String value) {
            addCriterion("ts_books_press >=", value, "tsBooksPress");
            return (Criteria) this;
        }

        public Criteria andTsBooksPressLessThan(String value) {
            addCriterion("ts_books_press <", value, "tsBooksPress");
            return (Criteria) this;
        }

        public Criteria andTsBooksPressLessThanOrEqualTo(String value) {
            addCriterion("ts_books_press <=", value, "tsBooksPress");
            return (Criteria) this;
        }

        public Criteria andTsBooksPressLike(String value) {
            addCriterion("ts_books_press like", value, "tsBooksPress");
            return (Criteria) this;
        }

        public Criteria andTsBooksPressNotLike(String value) {
            addCriterion("ts_books_press not like", value, "tsBooksPress");
            return (Criteria) this;
        }

        public Criteria andTsBooksPressIn(List<String> values) {
            addCriterion("ts_books_press in", values, "tsBooksPress");
            return (Criteria) this;
        }

        public Criteria andTsBooksPressNotIn(List<String> values) {
            addCriterion("ts_books_press not in", values, "tsBooksPress");
            return (Criteria) this;
        }

        public Criteria andTsBooksPressBetween(String value1, String value2) {
            addCriterion("ts_books_press between", value1, value2, "tsBooksPress");
            return (Criteria) this;
        }

        public Criteria andTsBooksPressNotBetween(String value1, String value2) {
            addCriterion("ts_books_press not between", value1, value2, "tsBooksPress");
            return (Criteria) this;
        }

        public Criteria andTsBooksPictureIsNull() {
            addCriterion("ts_books_picture is null");
            return (Criteria) this;
        }

        public Criteria andTsBooksPictureIsNotNull() {
            addCriterion("ts_books_picture is not null");
            return (Criteria) this;
        }

        public Criteria andTsBooksPictureEqualTo(String value) {
            addCriterion("ts_books_picture =", value, "tsBooksPicture");
            return (Criteria) this;
        }

        public Criteria andTsBooksPictureNotEqualTo(String value) {
            addCriterion("ts_books_picture <>", value, "tsBooksPicture");
            return (Criteria) this;
        }

        public Criteria andTsBooksPictureGreaterThan(String value) {
            addCriterion("ts_books_picture >", value, "tsBooksPicture");
            return (Criteria) this;
        }

        public Criteria andTsBooksPictureGreaterThanOrEqualTo(String value) {
            addCriterion("ts_books_picture >=", value, "tsBooksPicture");
            return (Criteria) this;
        }

        public Criteria andTsBooksPictureLessThan(String value) {
            addCriterion("ts_books_picture <", value, "tsBooksPicture");
            return (Criteria) this;
        }

        public Criteria andTsBooksPictureLessThanOrEqualTo(String value) {
            addCriterion("ts_books_picture <=", value, "tsBooksPicture");
            return (Criteria) this;
        }

        public Criteria andTsBooksPictureLike(String value) {
            addCriterion("ts_books_picture like", value, "tsBooksPicture");
            return (Criteria) this;
        }

        public Criteria andTsBooksPictureNotLike(String value) {
            addCriterion("ts_books_picture not like", value, "tsBooksPicture");
            return (Criteria) this;
        }

        public Criteria andTsBooksPictureIn(List<String> values) {
            addCriterion("ts_books_picture in", values, "tsBooksPicture");
            return (Criteria) this;
        }

        public Criteria andTsBooksPictureNotIn(List<String> values) {
            addCriterion("ts_books_picture not in", values, "tsBooksPicture");
            return (Criteria) this;
        }

        public Criteria andTsBooksPictureBetween(String value1, String value2) {
            addCriterion("ts_books_picture between", value1, value2, "tsBooksPicture");
            return (Criteria) this;
        }

        public Criteria andTsBooksPictureNotBetween(String value1, String value2) {
            addCriterion("ts_books_picture not between", value1, value2, "tsBooksPicture");
            return (Criteria) this;
        }

        public Criteria andTsBooksNumberIsNull() {
            addCriterion("ts_books_number is null");
            return (Criteria) this;
        }

        public Criteria andTsBooksNumberIsNotNull() {
            addCriterion("ts_books_number is not null");
            return (Criteria) this;
        }

        public Criteria andTsBooksNumberEqualTo(Integer value) {
            addCriterion("ts_books_number =", value, "tsBooksNumber");
            return (Criteria) this;
        }

        public Criteria andTsBooksNumberNotEqualTo(Integer value) {
            addCriterion("ts_books_number <>", value, "tsBooksNumber");
            return (Criteria) this;
        }

        public Criteria andTsBooksNumberGreaterThan(Integer value) {
            addCriterion("ts_books_number >", value, "tsBooksNumber");
            return (Criteria) this;
        }

        public Criteria andTsBooksNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("ts_books_number >=", value, "tsBooksNumber");
            return (Criteria) this;
        }

        public Criteria andTsBooksNumberLessThan(Integer value) {
            addCriterion("ts_books_number <", value, "tsBooksNumber");
            return (Criteria) this;
        }

        public Criteria andTsBooksNumberLessThanOrEqualTo(Integer value) {
            addCriterion("ts_books_number <=", value, "tsBooksNumber");
            return (Criteria) this;
        }

        public Criteria andTsBooksNumberIn(List<Integer> values) {
            addCriterion("ts_books_number in", values, "tsBooksNumber");
            return (Criteria) this;
        }

        public Criteria andTsBooksNumberNotIn(List<Integer> values) {
            addCriterion("ts_books_number not in", values, "tsBooksNumber");
            return (Criteria) this;
        }

        public Criteria andTsBooksNumberBetween(Integer value1, Integer value2) {
            addCriterion("ts_books_number between", value1, value2, "tsBooksNumber");
            return (Criteria) this;
        }

        public Criteria andTsBooksNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("ts_books_number not between", value1, value2, "tsBooksNumber");
            return (Criteria) this;
        }

        public Criteria andTsBooksMoneyIsNull() {
            addCriterion("ts_books_money is null");
            return (Criteria) this;
        }

        public Criteria andTsBooksMoneyIsNotNull() {
            addCriterion("ts_books_money is not null");
            return (Criteria) this;
        }

        public Criteria andTsBooksMoneyEqualTo(Double value) {
            addCriterion("ts_books_money =", value, "tsBooksMoney");
            return (Criteria) this;
        }

        public Criteria andTsBooksMoneyNotEqualTo(Double value) {
            addCriterion("ts_books_money <>", value, "tsBooksMoney");
            return (Criteria) this;
        }

        public Criteria andTsBooksMoneyGreaterThan(Double value) {
            addCriterion("ts_books_money >", value, "tsBooksMoney");
            return (Criteria) this;
        }

        public Criteria andTsBooksMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("ts_books_money >=", value, "tsBooksMoney");
            return (Criteria) this;
        }

        public Criteria andTsBooksMoneyLessThan(Double value) {
            addCriterion("ts_books_money <", value, "tsBooksMoney");
            return (Criteria) this;
        }

        public Criteria andTsBooksMoneyLessThanOrEqualTo(Double value) {
            addCriterion("ts_books_money <=", value, "tsBooksMoney");
            return (Criteria) this;
        }

        public Criteria andTsBooksMoneyIn(List<Double> values) {
            addCriterion("ts_books_money in", values, "tsBooksMoney");
            return (Criteria) this;
        }

        public Criteria andTsBooksMoneyNotIn(List<Double> values) {
            addCriterion("ts_books_money not in", values, "tsBooksMoney");
            return (Criteria) this;
        }

        public Criteria andTsBooksMoneyBetween(Double value1, Double value2) {
            addCriterion("ts_books_money between", value1, value2, "tsBooksMoney");
            return (Criteria) this;
        }

        public Criteria andTsBooksMoneyNotBetween(Double value1, Double value2) {
            addCriterion("ts_books_money not between", value1, value2, "tsBooksMoney");
            return (Criteria) this;
        }

        public Criteria andTsBooksIntroduceIsNull() {
            addCriterion("ts_books_introduce is null");
            return (Criteria) this;
        }

        public Criteria andTsBooksIntroduceIsNotNull() {
            addCriterion("ts_books_introduce is not null");
            return (Criteria) this;
        }

        public Criteria andTsBooksIntroduceEqualTo(String value) {
            addCriterion("ts_books_introduce =", value, "tsBooksIntroduce");
            return (Criteria) this;
        }

        public Criteria andTsBooksIntroduceNotEqualTo(String value) {
            addCriterion("ts_books_introduce <>", value, "tsBooksIntroduce");
            return (Criteria) this;
        }

        public Criteria andTsBooksIntroduceGreaterThan(String value) {
            addCriterion("ts_books_introduce >", value, "tsBooksIntroduce");
            return (Criteria) this;
        }

        public Criteria andTsBooksIntroduceGreaterThanOrEqualTo(String value) {
            addCriterion("ts_books_introduce >=", value, "tsBooksIntroduce");
            return (Criteria) this;
        }

        public Criteria andTsBooksIntroduceLessThan(String value) {
            addCriterion("ts_books_introduce <", value, "tsBooksIntroduce");
            return (Criteria) this;
        }

        public Criteria andTsBooksIntroduceLessThanOrEqualTo(String value) {
            addCriterion("ts_books_introduce <=", value, "tsBooksIntroduce");
            return (Criteria) this;
        }

        public Criteria andTsBooksIntroduceLike(String value) {
            addCriterion("ts_books_introduce like", value, "tsBooksIntroduce");
            return (Criteria) this;
        }

        public Criteria andTsBooksIntroduceNotLike(String value) {
            addCriterion("ts_books_introduce not like", value, "tsBooksIntroduce");
            return (Criteria) this;
        }

        public Criteria andTsBooksIntroduceIn(List<String> values) {
            addCriterion("ts_books_introduce in", values, "tsBooksIntroduce");
            return (Criteria) this;
        }

        public Criteria andTsBooksIntroduceNotIn(List<String> values) {
            addCriterion("ts_books_introduce not in", values, "tsBooksIntroduce");
            return (Criteria) this;
        }

        public Criteria andTsBooksIntroduceBetween(String value1, String value2) {
            addCriterion("ts_books_introduce between", value1, value2, "tsBooksIntroduce");
            return (Criteria) this;
        }

        public Criteria andTsBooksIntroduceNotBetween(String value1, String value2) {
            addCriterion("ts_books_introduce not between", value1, value2, "tsBooksIntroduce");
            return (Criteria) this;
        }

        public Criteria andTsBooksStateIsNull() {
            addCriterion("ts_books_state is null");
            return (Criteria) this;
        }

        public Criteria andTsBooksStateIsNotNull() {
            addCriterion("ts_books_state is not null");
            return (Criteria) this;
        }

        public Criteria andTsBooksStateEqualTo(String value) {
            addCriterion("ts_books_state =", value, "tsBooksState");
            return (Criteria) this;
        }

        public Criteria andTsBooksStateNotEqualTo(String value) {
            addCriterion("ts_books_state <>", value, "tsBooksState");
            return (Criteria) this;
        }

        public Criteria andTsBooksStateGreaterThan(String value) {
            addCriterion("ts_books_state >", value, "tsBooksState");
            return (Criteria) this;
        }

        public Criteria andTsBooksStateGreaterThanOrEqualTo(String value) {
            addCriterion("ts_books_state >=", value, "tsBooksState");
            return (Criteria) this;
        }

        public Criteria andTsBooksStateLessThan(String value) {
            addCriterion("ts_books_state <", value, "tsBooksState");
            return (Criteria) this;
        }

        public Criteria andTsBooksStateLessThanOrEqualTo(String value) {
            addCriterion("ts_books_state <=", value, "tsBooksState");
            return (Criteria) this;
        }

        public Criteria andTsBooksStateLike(String value) {
            addCriterion("ts_books_state like", value, "tsBooksState");
            return (Criteria) this;
        }

        public Criteria andTsBooksStateNotLike(String value) {
            addCriterion("ts_books_state not like", value, "tsBooksState");
            return (Criteria) this;
        }

        public Criteria andTsBooksStateIn(List<String> values) {
            addCriterion("ts_books_state in", values, "tsBooksState");
            return (Criteria) this;
        }

        public Criteria andTsBooksStateNotIn(List<String> values) {
            addCriterion("ts_books_state not in", values, "tsBooksState");
            return (Criteria) this;
        }

        public Criteria andTsBooksStateBetween(String value1, String value2) {
            addCriterion("ts_books_state between", value1, value2, "tsBooksState");
            return (Criteria) this;
        }

        public Criteria andTsBooksStateNotBetween(String value1, String value2) {
            addCriterion("ts_books_state not between", value1, value2, "tsBooksState");
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