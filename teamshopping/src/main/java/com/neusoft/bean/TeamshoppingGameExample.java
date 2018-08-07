package com.neusoft.bean;

import java.util.ArrayList;
import java.util.List;

public class TeamshoppingGameExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TeamshoppingGameExample() {
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

        public Criteria andTsGameIdIsNull() {
            addCriterion("ts_game_id is null");
            return (Criteria) this;
        }

        public Criteria andTsGameIdIsNotNull() {
            addCriterion("ts_game_id is not null");
            return (Criteria) this;
        }

        public Criteria andTsGameIdEqualTo(Integer value) {
            addCriterion("ts_game_id =", value, "tsGameId");
            return (Criteria) this;
        }

        public Criteria andTsGameIdNotEqualTo(Integer value) {
            addCriterion("ts_game_id <>", value, "tsGameId");
            return (Criteria) this;
        }

        public Criteria andTsGameIdGreaterThan(Integer value) {
            addCriterion("ts_game_id >", value, "tsGameId");
            return (Criteria) this;
        }

        public Criteria andTsGameIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ts_game_id >=", value, "tsGameId");
            return (Criteria) this;
        }

        public Criteria andTsGameIdLessThan(Integer value) {
            addCriterion("ts_game_id <", value, "tsGameId");
            return (Criteria) this;
        }

        public Criteria andTsGameIdLessThanOrEqualTo(Integer value) {
            addCriterion("ts_game_id <=", value, "tsGameId");
            return (Criteria) this;
        }

        public Criteria andTsGameIdIn(List<Integer> values) {
            addCriterion("ts_game_id in", values, "tsGameId");
            return (Criteria) this;
        }

        public Criteria andTsGameIdNotIn(List<Integer> values) {
            addCriterion("ts_game_id not in", values, "tsGameId");
            return (Criteria) this;
        }

        public Criteria andTsGameIdBetween(Integer value1, Integer value2) {
            addCriterion("ts_game_id between", value1, value2, "tsGameId");
            return (Criteria) this;
        }

        public Criteria andTsGameIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ts_game_id not between", value1, value2, "tsGameId");
            return (Criteria) this;
        }

        public Criteria andTsGameNameIsNull() {
            addCriterion("ts_game_name is null");
            return (Criteria) this;
        }

        public Criteria andTsGameNameIsNotNull() {
            addCriterion("ts_game_name is not null");
            return (Criteria) this;
        }

        public Criteria andTsGameNameEqualTo(String value) {
            addCriterion("ts_game_name =", value, "tsGameName");
            return (Criteria) this;
        }

        public Criteria andTsGameNameNotEqualTo(String value) {
            addCriterion("ts_game_name <>", value, "tsGameName");
            return (Criteria) this;
        }

        public Criteria andTsGameNameGreaterThan(String value) {
            addCriterion("ts_game_name >", value, "tsGameName");
            return (Criteria) this;
        }

        public Criteria andTsGameNameGreaterThanOrEqualTo(String value) {
            addCriterion("ts_game_name >=", value, "tsGameName");
            return (Criteria) this;
        }

        public Criteria andTsGameNameLessThan(String value) {
            addCriterion("ts_game_name <", value, "tsGameName");
            return (Criteria) this;
        }

        public Criteria andTsGameNameLessThanOrEqualTo(String value) {
            addCriterion("ts_game_name <=", value, "tsGameName");
            return (Criteria) this;
        }

        public Criteria andTsGameNameLike(String value) {
            addCriterion("ts_game_name like", value, "tsGameName");
            return (Criteria) this;
        }

        public Criteria andTsGameNameNotLike(String value) {
            addCriterion("ts_game_name not like", value, "tsGameName");
            return (Criteria) this;
        }

        public Criteria andTsGameNameIn(List<String> values) {
            addCriterion("ts_game_name in", values, "tsGameName");
            return (Criteria) this;
        }

        public Criteria andTsGameNameNotIn(List<String> values) {
            addCriterion("ts_game_name not in", values, "tsGameName");
            return (Criteria) this;
        }

        public Criteria andTsGameNameBetween(String value1, String value2) {
            addCriterion("ts_game_name between", value1, value2, "tsGameName");
            return (Criteria) this;
        }

        public Criteria andTsGameNameNotBetween(String value1, String value2) {
            addCriterion("ts_game_name not between", value1, value2, "tsGameName");
            return (Criteria) this;
        }

        public Criteria andTsGameTypeIsNull() {
            addCriterion("ts_game_type is null");
            return (Criteria) this;
        }

        public Criteria andTsGameTypeIsNotNull() {
            addCriterion("ts_game_type is not null");
            return (Criteria) this;
        }

        public Criteria andTsGameTypeEqualTo(String value) {
            addCriterion("ts_game_type =", value, "tsGameType");
            return (Criteria) this;
        }

        public Criteria andTsGameTypeNotEqualTo(String value) {
            addCriterion("ts_game_type <>", value, "tsGameType");
            return (Criteria) this;
        }

        public Criteria andTsGameTypeGreaterThan(String value) {
            addCriterion("ts_game_type >", value, "tsGameType");
            return (Criteria) this;
        }

        public Criteria andTsGameTypeGreaterThanOrEqualTo(String value) {
            addCriterion("ts_game_type >=", value, "tsGameType");
            return (Criteria) this;
        }

        public Criteria andTsGameTypeLessThan(String value) {
            addCriterion("ts_game_type <", value, "tsGameType");
            return (Criteria) this;
        }

        public Criteria andTsGameTypeLessThanOrEqualTo(String value) {
            addCriterion("ts_game_type <=", value, "tsGameType");
            return (Criteria) this;
        }

        public Criteria andTsGameTypeLike(String value) {
            addCriterion("ts_game_type like", value, "tsGameType");
            return (Criteria) this;
        }

        public Criteria andTsGameTypeNotLike(String value) {
            addCriterion("ts_game_type not like", value, "tsGameType");
            return (Criteria) this;
        }

        public Criteria andTsGameTypeIn(List<String> values) {
            addCriterion("ts_game_type in", values, "tsGameType");
            return (Criteria) this;
        }

        public Criteria andTsGameTypeNotIn(List<String> values) {
            addCriterion("ts_game_type not in", values, "tsGameType");
            return (Criteria) this;
        }

        public Criteria andTsGameTypeBetween(String value1, String value2) {
            addCriterion("ts_game_type between", value1, value2, "tsGameType");
            return (Criteria) this;
        }

        public Criteria andTsGameTypeNotBetween(String value1, String value2) {
            addCriterion("ts_game_type not between", value1, value2, "tsGameType");
            return (Criteria) this;
        }

        public Criteria andTsGameEditionIsNull() {
            addCriterion("ts_game_edition is null");
            return (Criteria) this;
        }

        public Criteria andTsGameEditionIsNotNull() {
            addCriterion("ts_game_edition is not null");
            return (Criteria) this;
        }

        public Criteria andTsGameEditionEqualTo(String value) {
            addCriterion("ts_game_edition =", value, "tsGameEdition");
            return (Criteria) this;
        }

        public Criteria andTsGameEditionNotEqualTo(String value) {
            addCriterion("ts_game_edition <>", value, "tsGameEdition");
            return (Criteria) this;
        }

        public Criteria andTsGameEditionGreaterThan(String value) {
            addCriterion("ts_game_edition >", value, "tsGameEdition");
            return (Criteria) this;
        }

        public Criteria andTsGameEditionGreaterThanOrEqualTo(String value) {
            addCriterion("ts_game_edition >=", value, "tsGameEdition");
            return (Criteria) this;
        }

        public Criteria andTsGameEditionLessThan(String value) {
            addCriterion("ts_game_edition <", value, "tsGameEdition");
            return (Criteria) this;
        }

        public Criteria andTsGameEditionLessThanOrEqualTo(String value) {
            addCriterion("ts_game_edition <=", value, "tsGameEdition");
            return (Criteria) this;
        }

        public Criteria andTsGameEditionLike(String value) {
            addCriterion("ts_game_edition like", value, "tsGameEdition");
            return (Criteria) this;
        }

        public Criteria andTsGameEditionNotLike(String value) {
            addCriterion("ts_game_edition not like", value, "tsGameEdition");
            return (Criteria) this;
        }

        public Criteria andTsGameEditionIn(List<String> values) {
            addCriterion("ts_game_edition in", values, "tsGameEdition");
            return (Criteria) this;
        }

        public Criteria andTsGameEditionNotIn(List<String> values) {
            addCriterion("ts_game_edition not in", values, "tsGameEdition");
            return (Criteria) this;
        }

        public Criteria andTsGameEditionBetween(String value1, String value2) {
            addCriterion("ts_game_edition between", value1, value2, "tsGameEdition");
            return (Criteria) this;
        }

        public Criteria andTsGameEditionNotBetween(String value1, String value2) {
            addCriterion("ts_game_edition not between", value1, value2, "tsGameEdition");
            return (Criteria) this;
        }

        public Criteria andTsGameCompanyIsNull() {
            addCriterion("ts_game_company is null");
            return (Criteria) this;
        }

        public Criteria andTsGameCompanyIsNotNull() {
            addCriterion("ts_game_company is not null");
            return (Criteria) this;
        }

        public Criteria andTsGameCompanyEqualTo(String value) {
            addCriterion("ts_game_company =", value, "tsGameCompany");
            return (Criteria) this;
        }

        public Criteria andTsGameCompanyNotEqualTo(String value) {
            addCriterion("ts_game_company <>", value, "tsGameCompany");
            return (Criteria) this;
        }

        public Criteria andTsGameCompanyGreaterThan(String value) {
            addCriterion("ts_game_company >", value, "tsGameCompany");
            return (Criteria) this;
        }

        public Criteria andTsGameCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("ts_game_company >=", value, "tsGameCompany");
            return (Criteria) this;
        }

        public Criteria andTsGameCompanyLessThan(String value) {
            addCriterion("ts_game_company <", value, "tsGameCompany");
            return (Criteria) this;
        }

        public Criteria andTsGameCompanyLessThanOrEqualTo(String value) {
            addCriterion("ts_game_company <=", value, "tsGameCompany");
            return (Criteria) this;
        }

        public Criteria andTsGameCompanyLike(String value) {
            addCriterion("ts_game_company like", value, "tsGameCompany");
            return (Criteria) this;
        }

        public Criteria andTsGameCompanyNotLike(String value) {
            addCriterion("ts_game_company not like", value, "tsGameCompany");
            return (Criteria) this;
        }

        public Criteria andTsGameCompanyIn(List<String> values) {
            addCriterion("ts_game_company in", values, "tsGameCompany");
            return (Criteria) this;
        }

        public Criteria andTsGameCompanyNotIn(List<String> values) {
            addCriterion("ts_game_company not in", values, "tsGameCompany");
            return (Criteria) this;
        }

        public Criteria andTsGameCompanyBetween(String value1, String value2) {
            addCriterion("ts_game_company between", value1, value2, "tsGameCompany");
            return (Criteria) this;
        }

        public Criteria andTsGameCompanyNotBetween(String value1, String value2) {
            addCriterion("ts_game_company not between", value1, value2, "tsGameCompany");
            return (Criteria) this;
        }

        public Criteria andTsGameCodeIsNull() {
            addCriterion("ts_game_code is null");
            return (Criteria) this;
        }

        public Criteria andTsGameCodeIsNotNull() {
            addCriterion("ts_game_code is not null");
            return (Criteria) this;
        }

        public Criteria andTsGameCodeEqualTo(String value) {
            addCriterion("ts_game_code =", value, "tsGameCode");
            return (Criteria) this;
        }

        public Criteria andTsGameCodeNotEqualTo(String value) {
            addCriterion("ts_game_code <>", value, "tsGameCode");
            return (Criteria) this;
        }

        public Criteria andTsGameCodeGreaterThan(String value) {
            addCriterion("ts_game_code >", value, "tsGameCode");
            return (Criteria) this;
        }

        public Criteria andTsGameCodeGreaterThanOrEqualTo(String value) {
            addCriterion("ts_game_code >=", value, "tsGameCode");
            return (Criteria) this;
        }

        public Criteria andTsGameCodeLessThan(String value) {
            addCriterion("ts_game_code <", value, "tsGameCode");
            return (Criteria) this;
        }

        public Criteria andTsGameCodeLessThanOrEqualTo(String value) {
            addCriterion("ts_game_code <=", value, "tsGameCode");
            return (Criteria) this;
        }

        public Criteria andTsGameCodeLike(String value) {
            addCriterion("ts_game_code like", value, "tsGameCode");
            return (Criteria) this;
        }

        public Criteria andTsGameCodeNotLike(String value) {
            addCriterion("ts_game_code not like", value, "tsGameCode");
            return (Criteria) this;
        }

        public Criteria andTsGameCodeIn(List<String> values) {
            addCriterion("ts_game_code in", values, "tsGameCode");
            return (Criteria) this;
        }

        public Criteria andTsGameCodeNotIn(List<String> values) {
            addCriterion("ts_game_code not in", values, "tsGameCode");
            return (Criteria) this;
        }

        public Criteria andTsGameCodeBetween(String value1, String value2) {
            addCriterion("ts_game_code between", value1, value2, "tsGameCode");
            return (Criteria) this;
        }

        public Criteria andTsGameCodeNotBetween(String value1, String value2) {
            addCriterion("ts_game_code not between", value1, value2, "tsGameCode");
            return (Criteria) this;
        }

        public Criteria andTsGameCurrencyIsNull() {
            addCriterion("ts_game_currency is null");
            return (Criteria) this;
        }

        public Criteria andTsGameCurrencyIsNotNull() {
            addCriterion("ts_game_currency is not null");
            return (Criteria) this;
        }

        public Criteria andTsGameCurrencyEqualTo(Integer value) {
            addCriterion("ts_game_currency =", value, "tsGameCurrency");
            return (Criteria) this;
        }

        public Criteria andTsGameCurrencyNotEqualTo(Integer value) {
            addCriterion("ts_game_currency <>", value, "tsGameCurrency");
            return (Criteria) this;
        }

        public Criteria andTsGameCurrencyGreaterThan(Integer value) {
            addCriterion("ts_game_currency >", value, "tsGameCurrency");
            return (Criteria) this;
        }

        public Criteria andTsGameCurrencyGreaterThanOrEqualTo(Integer value) {
            addCriterion("ts_game_currency >=", value, "tsGameCurrency");
            return (Criteria) this;
        }

        public Criteria andTsGameCurrencyLessThan(Integer value) {
            addCriterion("ts_game_currency <", value, "tsGameCurrency");
            return (Criteria) this;
        }

        public Criteria andTsGameCurrencyLessThanOrEqualTo(Integer value) {
            addCriterion("ts_game_currency <=", value, "tsGameCurrency");
            return (Criteria) this;
        }

        public Criteria andTsGameCurrencyIn(List<Integer> values) {
            addCriterion("ts_game_currency in", values, "tsGameCurrency");
            return (Criteria) this;
        }

        public Criteria andTsGameCurrencyNotIn(List<Integer> values) {
            addCriterion("ts_game_currency not in", values, "tsGameCurrency");
            return (Criteria) this;
        }

        public Criteria andTsGameCurrencyBetween(Integer value1, Integer value2) {
            addCriterion("ts_game_currency between", value1, value2, "tsGameCurrency");
            return (Criteria) this;
        }

        public Criteria andTsGameCurrencyNotBetween(Integer value1, Integer value2) {
            addCriterion("ts_game_currency not between", value1, value2, "tsGameCurrency");
            return (Criteria) this;
        }

        public Criteria andTsGamePictureIsNull() {
            addCriterion("ts_game_picture is null");
            return (Criteria) this;
        }

        public Criteria andTsGamePictureIsNotNull() {
            addCriterion("ts_game_picture is not null");
            return (Criteria) this;
        }

        public Criteria andTsGamePictureEqualTo(String value) {
            addCriterion("ts_game_picture =", value, "tsGamePicture");
            return (Criteria) this;
        }

        public Criteria andTsGamePictureNotEqualTo(String value) {
            addCriterion("ts_game_picture <>", value, "tsGamePicture");
            return (Criteria) this;
        }

        public Criteria andTsGamePictureGreaterThan(String value) {
            addCriterion("ts_game_picture >", value, "tsGamePicture");
            return (Criteria) this;
        }

        public Criteria andTsGamePictureGreaterThanOrEqualTo(String value) {
            addCriterion("ts_game_picture >=", value, "tsGamePicture");
            return (Criteria) this;
        }

        public Criteria andTsGamePictureLessThan(String value) {
            addCriterion("ts_game_picture <", value, "tsGamePicture");
            return (Criteria) this;
        }

        public Criteria andTsGamePictureLessThanOrEqualTo(String value) {
            addCriterion("ts_game_picture <=", value, "tsGamePicture");
            return (Criteria) this;
        }

        public Criteria andTsGamePictureLike(String value) {
            addCriterion("ts_game_picture like", value, "tsGamePicture");
            return (Criteria) this;
        }

        public Criteria andTsGamePictureNotLike(String value) {
            addCriterion("ts_game_picture not like", value, "tsGamePicture");
            return (Criteria) this;
        }

        public Criteria andTsGamePictureIn(List<String> values) {
            addCriterion("ts_game_picture in", values, "tsGamePicture");
            return (Criteria) this;
        }

        public Criteria andTsGamePictureNotIn(List<String> values) {
            addCriterion("ts_game_picture not in", values, "tsGamePicture");
            return (Criteria) this;
        }

        public Criteria andTsGamePictureBetween(String value1, String value2) {
            addCriterion("ts_game_picture between", value1, value2, "tsGamePicture");
            return (Criteria) this;
        }

        public Criteria andTsGamePictureNotBetween(String value1, String value2) {
            addCriterion("ts_game_picture not between", value1, value2, "tsGamePicture");
            return (Criteria) this;
        }

        public Criteria andTsGameNumberIsNull() {
            addCriterion("ts_game_number is null");
            return (Criteria) this;
        }

        public Criteria andTsGameNumberIsNotNull() {
            addCriterion("ts_game_number is not null");
            return (Criteria) this;
        }

        public Criteria andTsGameNumberEqualTo(Integer value) {
            addCriterion("ts_game_number =", value, "tsGameNumber");
            return (Criteria) this;
        }

        public Criteria andTsGameNumberNotEqualTo(Integer value) {
            addCriterion("ts_game_number <>", value, "tsGameNumber");
            return (Criteria) this;
        }

        public Criteria andTsGameNumberGreaterThan(Integer value) {
            addCriterion("ts_game_number >", value, "tsGameNumber");
            return (Criteria) this;
        }

        public Criteria andTsGameNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("ts_game_number >=", value, "tsGameNumber");
            return (Criteria) this;
        }

        public Criteria andTsGameNumberLessThan(Integer value) {
            addCriterion("ts_game_number <", value, "tsGameNumber");
            return (Criteria) this;
        }

        public Criteria andTsGameNumberLessThanOrEqualTo(Integer value) {
            addCriterion("ts_game_number <=", value, "tsGameNumber");
            return (Criteria) this;
        }

        public Criteria andTsGameNumberIn(List<Integer> values) {
            addCriterion("ts_game_number in", values, "tsGameNumber");
            return (Criteria) this;
        }

        public Criteria andTsGameNumberNotIn(List<Integer> values) {
            addCriterion("ts_game_number not in", values, "tsGameNumber");
            return (Criteria) this;
        }

        public Criteria andTsGameNumberBetween(Integer value1, Integer value2) {
            addCriterion("ts_game_number between", value1, value2, "tsGameNumber");
            return (Criteria) this;
        }

        public Criteria andTsGameNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("ts_game_number not between", value1, value2, "tsGameNumber");
            return (Criteria) this;
        }

        public Criteria andTsGameMoneyIsNull() {
            addCriterion("ts_game_money is null");
            return (Criteria) this;
        }

        public Criteria andTsGameMoneyIsNotNull() {
            addCriterion("ts_game_money is not null");
            return (Criteria) this;
        }

        public Criteria andTsGameMoneyEqualTo(Double value) {
            addCriterion("ts_game_money =", value, "tsGameMoney");
            return (Criteria) this;
        }

        public Criteria andTsGameMoneyNotEqualTo(Double value) {
            addCriterion("ts_game_money <>", value, "tsGameMoney");
            return (Criteria) this;
        }

        public Criteria andTsGameMoneyGreaterThan(Double value) {
            addCriterion("ts_game_money >", value, "tsGameMoney");
            return (Criteria) this;
        }

        public Criteria andTsGameMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("ts_game_money >=", value, "tsGameMoney");
            return (Criteria) this;
        }

        public Criteria andTsGameMoneyLessThan(Double value) {
            addCriterion("ts_game_money <", value, "tsGameMoney");
            return (Criteria) this;
        }

        public Criteria andTsGameMoneyLessThanOrEqualTo(Double value) {
            addCriterion("ts_game_money <=", value, "tsGameMoney");
            return (Criteria) this;
        }

        public Criteria andTsGameMoneyIn(List<Double> values) {
            addCriterion("ts_game_money in", values, "tsGameMoney");
            return (Criteria) this;
        }

        public Criteria andTsGameMoneyNotIn(List<Double> values) {
            addCriterion("ts_game_money not in", values, "tsGameMoney");
            return (Criteria) this;
        }

        public Criteria andTsGameMoneyBetween(Double value1, Double value2) {
            addCriterion("ts_game_money between", value1, value2, "tsGameMoney");
            return (Criteria) this;
        }

        public Criteria andTsGameMoneyNotBetween(Double value1, Double value2) {
            addCriterion("ts_game_money not between", value1, value2, "tsGameMoney");
            return (Criteria) this;
        }

        public Criteria andTsGameIntroduceIsNull() {
            addCriterion("ts_game_introduce is null");
            return (Criteria) this;
        }

        public Criteria andTsGameIntroduceIsNotNull() {
            addCriterion("ts_game_introduce is not null");
            return (Criteria) this;
        }

        public Criteria andTsGameIntroduceEqualTo(String value) {
            addCriterion("ts_game_introduce =", value, "tsGameIntroduce");
            return (Criteria) this;
        }

        public Criteria andTsGameIntroduceNotEqualTo(String value) {
            addCriterion("ts_game_introduce <>", value, "tsGameIntroduce");
            return (Criteria) this;
        }

        public Criteria andTsGameIntroduceGreaterThan(String value) {
            addCriterion("ts_game_introduce >", value, "tsGameIntroduce");
            return (Criteria) this;
        }

        public Criteria andTsGameIntroduceGreaterThanOrEqualTo(String value) {
            addCriterion("ts_game_introduce >=", value, "tsGameIntroduce");
            return (Criteria) this;
        }

        public Criteria andTsGameIntroduceLessThan(String value) {
            addCriterion("ts_game_introduce <", value, "tsGameIntroduce");
            return (Criteria) this;
        }

        public Criteria andTsGameIntroduceLessThanOrEqualTo(String value) {
            addCriterion("ts_game_introduce <=", value, "tsGameIntroduce");
            return (Criteria) this;
        }

        public Criteria andTsGameIntroduceLike(String value) {
            addCriterion("ts_game_introduce like", value, "tsGameIntroduce");
            return (Criteria) this;
        }

        public Criteria andTsGameIntroduceNotLike(String value) {
            addCriterion("ts_game_introduce not like", value, "tsGameIntroduce");
            return (Criteria) this;
        }

        public Criteria andTsGameIntroduceIn(List<String> values) {
            addCriterion("ts_game_introduce in", values, "tsGameIntroduce");
            return (Criteria) this;
        }

        public Criteria andTsGameIntroduceNotIn(List<String> values) {
            addCriterion("ts_game_introduce not in", values, "tsGameIntroduce");
            return (Criteria) this;
        }

        public Criteria andTsGameIntroduceBetween(String value1, String value2) {
            addCriterion("ts_game_introduce between", value1, value2, "tsGameIntroduce");
            return (Criteria) this;
        }

        public Criteria andTsGameIntroduceNotBetween(String value1, String value2) {
            addCriterion("ts_game_introduce not between", value1, value2, "tsGameIntroduce");
            return (Criteria) this;
        }

        public Criteria andTsGameStateIsNull() {
            addCriterion("ts_game_state is null");
            return (Criteria) this;
        }

        public Criteria andTsGameStateIsNotNull() {
            addCriterion("ts_game_state is not null");
            return (Criteria) this;
        }

        public Criteria andTsGameStateEqualTo(String value) {
            addCriterion("ts_game_state =", value, "tsGameState");
            return (Criteria) this;
        }

        public Criteria andTsGameStateNotEqualTo(String value) {
            addCriterion("ts_game_state <>", value, "tsGameState");
            return (Criteria) this;
        }

        public Criteria andTsGameStateGreaterThan(String value) {
            addCriterion("ts_game_state >", value, "tsGameState");
            return (Criteria) this;
        }

        public Criteria andTsGameStateGreaterThanOrEqualTo(String value) {
            addCriterion("ts_game_state >=", value, "tsGameState");
            return (Criteria) this;
        }

        public Criteria andTsGameStateLessThan(String value) {
            addCriterion("ts_game_state <", value, "tsGameState");
            return (Criteria) this;
        }

        public Criteria andTsGameStateLessThanOrEqualTo(String value) {
            addCriterion("ts_game_state <=", value, "tsGameState");
            return (Criteria) this;
        }

        public Criteria andTsGameStateLike(String value) {
            addCriterion("ts_game_state like", value, "tsGameState");
            return (Criteria) this;
        }

        public Criteria andTsGameStateNotLike(String value) {
            addCriterion("ts_game_state not like", value, "tsGameState");
            return (Criteria) this;
        }

        public Criteria andTsGameStateIn(List<String> values) {
            addCriterion("ts_game_state in", values, "tsGameState");
            return (Criteria) this;
        }

        public Criteria andTsGameStateNotIn(List<String> values) {
            addCriterion("ts_game_state not in", values, "tsGameState");
            return (Criteria) this;
        }

        public Criteria andTsGameStateBetween(String value1, String value2) {
            addCriterion("ts_game_state between", value1, value2, "tsGameState");
            return (Criteria) this;
        }

        public Criteria andTsGameStateNotBetween(String value1, String value2) {
            addCriterion("ts_game_state not between", value1, value2, "tsGameState");
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