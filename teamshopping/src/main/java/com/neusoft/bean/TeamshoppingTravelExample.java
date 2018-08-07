package com.neusoft.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TeamshoppingTravelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TeamshoppingTravelExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andTsTravelIdIsNull() {
            addCriterion("ts_travel_id is null");
            return (Criteria) this;
        }

        public Criteria andTsTravelIdIsNotNull() {
            addCriterion("ts_travel_id is not null");
            return (Criteria) this;
        }

        public Criteria andTsTravelIdEqualTo(Integer value) {
            addCriterion("ts_travel_id =", value, "tsTravelId");
            return (Criteria) this;
        }

        public Criteria andTsTravelIdNotEqualTo(Integer value) {
            addCriterion("ts_travel_id <>", value, "tsTravelId");
            return (Criteria) this;
        }

        public Criteria andTsTravelIdGreaterThan(Integer value) {
            addCriterion("ts_travel_id >", value, "tsTravelId");
            return (Criteria) this;
        }

        public Criteria andTsTravelIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ts_travel_id >=", value, "tsTravelId");
            return (Criteria) this;
        }

        public Criteria andTsTravelIdLessThan(Integer value) {
            addCriterion("ts_travel_id <", value, "tsTravelId");
            return (Criteria) this;
        }

        public Criteria andTsTravelIdLessThanOrEqualTo(Integer value) {
            addCriterion("ts_travel_id <=", value, "tsTravelId");
            return (Criteria) this;
        }

        public Criteria andTsTravelIdIn(List<Integer> values) {
            addCriterion("ts_travel_id in", values, "tsTravelId");
            return (Criteria) this;
        }

        public Criteria andTsTravelIdNotIn(List<Integer> values) {
            addCriterion("ts_travel_id not in", values, "tsTravelId");
            return (Criteria) this;
        }

        public Criteria andTsTravelIdBetween(Integer value1, Integer value2) {
            addCriterion("ts_travel_id between", value1, value2, "tsTravelId");
            return (Criteria) this;
        }

        public Criteria andTsTravelIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ts_travel_id not between", value1, value2, "tsTravelId");
            return (Criteria) this;
        }

        public Criteria andTsTravelTeamnameIsNull() {
            addCriterion("ts_travel_teamname is null");
            return (Criteria) this;
        }

        public Criteria andTsTravelTeamnameIsNotNull() {
            addCriterion("ts_travel_teamname is not null");
            return (Criteria) this;
        }

        public Criteria andTsTravelTeamnameEqualTo(String value) {
            addCriterion("ts_travel_teamname =", value, "tsTravelTeamname");
            return (Criteria) this;
        }

        public Criteria andTsTravelTeamnameNotEqualTo(String value) {
            addCriterion("ts_travel_teamname <>", value, "tsTravelTeamname");
            return (Criteria) this;
        }

        public Criteria andTsTravelTeamnameGreaterThan(String value) {
            addCriterion("ts_travel_teamname >", value, "tsTravelTeamname");
            return (Criteria) this;
        }

        public Criteria andTsTravelTeamnameGreaterThanOrEqualTo(String value) {
            addCriterion("ts_travel_teamname >=", value, "tsTravelTeamname");
            return (Criteria) this;
        }

        public Criteria andTsTravelTeamnameLessThan(String value) {
            addCriterion("ts_travel_teamname <", value, "tsTravelTeamname");
            return (Criteria) this;
        }

        public Criteria andTsTravelTeamnameLessThanOrEqualTo(String value) {
            addCriterion("ts_travel_teamname <=", value, "tsTravelTeamname");
            return (Criteria) this;
        }

        public Criteria andTsTravelTeamnameLike(String value) {
            addCriterion("ts_travel_teamname like", value, "tsTravelTeamname");
            return (Criteria) this;
        }

        public Criteria andTsTravelTeamnameNotLike(String value) {
            addCriterion("ts_travel_teamname not like", value, "tsTravelTeamname");
            return (Criteria) this;
        }

        public Criteria andTsTravelTeamnameIn(List<String> values) {
            addCriterion("ts_travel_teamname in", values, "tsTravelTeamname");
            return (Criteria) this;
        }

        public Criteria andTsTravelTeamnameNotIn(List<String> values) {
            addCriterion("ts_travel_teamname not in", values, "tsTravelTeamname");
            return (Criteria) this;
        }

        public Criteria andTsTravelTeamnameBetween(String value1, String value2) {
            addCriterion("ts_travel_teamname between", value1, value2, "tsTravelTeamname");
            return (Criteria) this;
        }

        public Criteria andTsTravelTeamnameNotBetween(String value1, String value2) {
            addCriterion("ts_travel_teamname not between", value1, value2, "tsTravelTeamname");
            return (Criteria) this;
        }

        public Criteria andTsTravelGuideIsNull() {
            addCriterion("ts_travel_guide is null");
            return (Criteria) this;
        }

        public Criteria andTsTravelGuideIsNotNull() {
            addCriterion("ts_travel_guide is not null");
            return (Criteria) this;
        }

        public Criteria andTsTravelGuideEqualTo(String value) {
            addCriterion("ts_travel_guide =", value, "tsTravelGuide");
            return (Criteria) this;
        }

        public Criteria andTsTravelGuideNotEqualTo(String value) {
            addCriterion("ts_travel_guide <>", value, "tsTravelGuide");
            return (Criteria) this;
        }

        public Criteria andTsTravelGuideGreaterThan(String value) {
            addCriterion("ts_travel_guide >", value, "tsTravelGuide");
            return (Criteria) this;
        }

        public Criteria andTsTravelGuideGreaterThanOrEqualTo(String value) {
            addCriterion("ts_travel_guide >=", value, "tsTravelGuide");
            return (Criteria) this;
        }

        public Criteria andTsTravelGuideLessThan(String value) {
            addCriterion("ts_travel_guide <", value, "tsTravelGuide");
            return (Criteria) this;
        }

        public Criteria andTsTravelGuideLessThanOrEqualTo(String value) {
            addCriterion("ts_travel_guide <=", value, "tsTravelGuide");
            return (Criteria) this;
        }

        public Criteria andTsTravelGuideLike(String value) {
            addCriterion("ts_travel_guide like", value, "tsTravelGuide");
            return (Criteria) this;
        }

        public Criteria andTsTravelGuideNotLike(String value) {
            addCriterion("ts_travel_guide not like", value, "tsTravelGuide");
            return (Criteria) this;
        }

        public Criteria andTsTravelGuideIn(List<String> values) {
            addCriterion("ts_travel_guide in", values, "tsTravelGuide");
            return (Criteria) this;
        }

        public Criteria andTsTravelGuideNotIn(List<String> values) {
            addCriterion("ts_travel_guide not in", values, "tsTravelGuide");
            return (Criteria) this;
        }

        public Criteria andTsTravelGuideBetween(String value1, String value2) {
            addCriterion("ts_travel_guide between", value1, value2, "tsTravelGuide");
            return (Criteria) this;
        }

        public Criteria andTsTravelGuideNotBetween(String value1, String value2) {
            addCriterion("ts_travel_guide not between", value1, value2, "tsTravelGuide");
            return (Criteria) this;
        }

        public Criteria andTsTravelStyleIsNull() {
            addCriterion("ts_travel_style is null");
            return (Criteria) this;
        }

        public Criteria andTsTravelStyleIsNotNull() {
            addCriterion("ts_travel_style is not null");
            return (Criteria) this;
        }

        public Criteria andTsTravelStyleEqualTo(String value) {
            addCriterion("ts_travel_style =", value, "tsTravelStyle");
            return (Criteria) this;
        }

        public Criteria andTsTravelStyleNotEqualTo(String value) {
            addCriterion("ts_travel_style <>", value, "tsTravelStyle");
            return (Criteria) this;
        }

        public Criteria andTsTravelStyleGreaterThan(String value) {
            addCriterion("ts_travel_style >", value, "tsTravelStyle");
            return (Criteria) this;
        }

        public Criteria andTsTravelStyleGreaterThanOrEqualTo(String value) {
            addCriterion("ts_travel_style >=", value, "tsTravelStyle");
            return (Criteria) this;
        }

        public Criteria andTsTravelStyleLessThan(String value) {
            addCriterion("ts_travel_style <", value, "tsTravelStyle");
            return (Criteria) this;
        }

        public Criteria andTsTravelStyleLessThanOrEqualTo(String value) {
            addCriterion("ts_travel_style <=", value, "tsTravelStyle");
            return (Criteria) this;
        }

        public Criteria andTsTravelStyleLike(String value) {
            addCriterion("ts_travel_style like", value, "tsTravelStyle");
            return (Criteria) this;
        }

        public Criteria andTsTravelStyleNotLike(String value) {
            addCriterion("ts_travel_style not like", value, "tsTravelStyle");
            return (Criteria) this;
        }

        public Criteria andTsTravelStyleIn(List<String> values) {
            addCriterion("ts_travel_style in", values, "tsTravelStyle");
            return (Criteria) this;
        }

        public Criteria andTsTravelStyleNotIn(List<String> values) {
            addCriterion("ts_travel_style not in", values, "tsTravelStyle");
            return (Criteria) this;
        }

        public Criteria andTsTravelStyleBetween(String value1, String value2) {
            addCriterion("ts_travel_style between", value1, value2, "tsTravelStyle");
            return (Criteria) this;
        }

        public Criteria andTsTravelStyleNotBetween(String value1, String value2) {
            addCriterion("ts_travel_style not between", value1, value2, "tsTravelStyle");
            return (Criteria) this;
        }

        public Criteria andTsTravelDestinationIsNull() {
            addCriterion("ts_travel_destination is null");
            return (Criteria) this;
        }

        public Criteria andTsTravelDestinationIsNotNull() {
            addCriterion("ts_travel_destination is not null");
            return (Criteria) this;
        }

        public Criteria andTsTravelDestinationEqualTo(String value) {
            addCriterion("ts_travel_destination =", value, "tsTravelDestination");
            return (Criteria) this;
        }

        public Criteria andTsTravelDestinationNotEqualTo(String value) {
            addCriterion("ts_travel_destination <>", value, "tsTravelDestination");
            return (Criteria) this;
        }

        public Criteria andTsTravelDestinationGreaterThan(String value) {
            addCriterion("ts_travel_destination >", value, "tsTravelDestination");
            return (Criteria) this;
        }

        public Criteria andTsTravelDestinationGreaterThanOrEqualTo(String value) {
            addCriterion("ts_travel_destination >=", value, "tsTravelDestination");
            return (Criteria) this;
        }

        public Criteria andTsTravelDestinationLessThan(String value) {
            addCriterion("ts_travel_destination <", value, "tsTravelDestination");
            return (Criteria) this;
        }

        public Criteria andTsTravelDestinationLessThanOrEqualTo(String value) {
            addCriterion("ts_travel_destination <=", value, "tsTravelDestination");
            return (Criteria) this;
        }

        public Criteria andTsTravelDestinationLike(String value) {
            addCriterion("ts_travel_destination like", value, "tsTravelDestination");
            return (Criteria) this;
        }

        public Criteria andTsTravelDestinationNotLike(String value) {
            addCriterion("ts_travel_destination not like", value, "tsTravelDestination");
            return (Criteria) this;
        }

        public Criteria andTsTravelDestinationIn(List<String> values) {
            addCriterion("ts_travel_destination in", values, "tsTravelDestination");
            return (Criteria) this;
        }

        public Criteria andTsTravelDestinationNotIn(List<String> values) {
            addCriterion("ts_travel_destination not in", values, "tsTravelDestination");
            return (Criteria) this;
        }

        public Criteria andTsTravelDestinationBetween(String value1, String value2) {
            addCriterion("ts_travel_destination between", value1, value2, "tsTravelDestination");
            return (Criteria) this;
        }

        public Criteria andTsTravelDestinationNotBetween(String value1, String value2) {
            addCriterion("ts_travel_destination not between", value1, value2, "tsTravelDestination");
            return (Criteria) this;
        }

        public Criteria andTsTravelGolandIsNull() {
            addCriterion("ts_travel_goland is null");
            return (Criteria) this;
        }

        public Criteria andTsTravelGolandIsNotNull() {
            addCriterion("ts_travel_goland is not null");
            return (Criteria) this;
        }

        public Criteria andTsTravelGolandEqualTo(String value) {
            addCriterion("ts_travel_goland =", value, "tsTravelGoland");
            return (Criteria) this;
        }

        public Criteria andTsTravelGolandNotEqualTo(String value) {
            addCriterion("ts_travel_goland <>", value, "tsTravelGoland");
            return (Criteria) this;
        }

        public Criteria andTsTravelGolandGreaterThan(String value) {
            addCriterion("ts_travel_goland >", value, "tsTravelGoland");
            return (Criteria) this;
        }

        public Criteria andTsTravelGolandGreaterThanOrEqualTo(String value) {
            addCriterion("ts_travel_goland >=", value, "tsTravelGoland");
            return (Criteria) this;
        }

        public Criteria andTsTravelGolandLessThan(String value) {
            addCriterion("ts_travel_goland <", value, "tsTravelGoland");
            return (Criteria) this;
        }

        public Criteria andTsTravelGolandLessThanOrEqualTo(String value) {
            addCriterion("ts_travel_goland <=", value, "tsTravelGoland");
            return (Criteria) this;
        }

        public Criteria andTsTravelGolandLike(String value) {
            addCriterion("ts_travel_goland like", value, "tsTravelGoland");
            return (Criteria) this;
        }

        public Criteria andTsTravelGolandNotLike(String value) {
            addCriterion("ts_travel_goland not like", value, "tsTravelGoland");
            return (Criteria) this;
        }

        public Criteria andTsTravelGolandIn(List<String> values) {
            addCriterion("ts_travel_goland in", values, "tsTravelGoland");
            return (Criteria) this;
        }

        public Criteria andTsTravelGolandNotIn(List<String> values) {
            addCriterion("ts_travel_goland not in", values, "tsTravelGoland");
            return (Criteria) this;
        }

        public Criteria andTsTravelGolandBetween(String value1, String value2) {
            addCriterion("ts_travel_goland between", value1, value2, "tsTravelGoland");
            return (Criteria) this;
        }

        public Criteria andTsTravelGolandNotBetween(String value1, String value2) {
            addCriterion("ts_travel_goland not between", value1, value2, "tsTravelGoland");
            return (Criteria) this;
        }

        public Criteria andTsTravelGotimeIsNull() {
            addCriterion("ts_travel_gotime is null");
            return (Criteria) this;
        }

        public Criteria andTsTravelGotimeIsNotNull() {
            addCriterion("ts_travel_gotime is not null");
            return (Criteria) this;
        }

        public Criteria andTsTravelGotimeEqualTo(Date value) {
            addCriterionForJDBCDate("ts_travel_gotime =", value, "tsTravelGotime");
            return (Criteria) this;
        }

        public Criteria andTsTravelGotimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("ts_travel_gotime <>", value, "tsTravelGotime");
            return (Criteria) this;
        }

        public Criteria andTsTravelGotimeGreaterThan(Date value) {
            addCriterionForJDBCDate("ts_travel_gotime >", value, "tsTravelGotime");
            return (Criteria) this;
        }

        public Criteria andTsTravelGotimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ts_travel_gotime >=", value, "tsTravelGotime");
            return (Criteria) this;
        }

        public Criteria andTsTravelGotimeLessThan(Date value) {
            addCriterionForJDBCDate("ts_travel_gotime <", value, "tsTravelGotime");
            return (Criteria) this;
        }

        public Criteria andTsTravelGotimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ts_travel_gotime <=", value, "tsTravelGotime");
            return (Criteria) this;
        }

        public Criteria andTsTravelGotimeIn(List<Date> values) {
            addCriterionForJDBCDate("ts_travel_gotime in", values, "tsTravelGotime");
            return (Criteria) this;
        }

        public Criteria andTsTravelGotimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("ts_travel_gotime not in", values, "tsTravelGotime");
            return (Criteria) this;
        }

        public Criteria andTsTravelGotimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ts_travel_gotime between", value1, value2, "tsTravelGotime");
            return (Criteria) this;
        }

        public Criteria andTsTravelGotimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ts_travel_gotime not between", value1, value2, "tsTravelGotime");
            return (Criteria) this;
        }

        public Criteria andTsTravelPlaytimeIsNull() {
            addCriterion("ts_travel_playtime is null");
            return (Criteria) this;
        }

        public Criteria andTsTravelPlaytimeIsNotNull() {
            addCriterion("ts_travel_playtime is not null");
            return (Criteria) this;
        }

        public Criteria andTsTravelPlaytimeEqualTo(Integer value) {
            addCriterion("ts_travel_playtime =", value, "tsTravelPlaytime");
            return (Criteria) this;
        }

        public Criteria andTsTravelPlaytimeNotEqualTo(Integer value) {
            addCriterion("ts_travel_playtime <>", value, "tsTravelPlaytime");
            return (Criteria) this;
        }

        public Criteria andTsTravelPlaytimeGreaterThan(Integer value) {
            addCriterion("ts_travel_playtime >", value, "tsTravelPlaytime");
            return (Criteria) this;
        }

        public Criteria andTsTravelPlaytimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("ts_travel_playtime >=", value, "tsTravelPlaytime");
            return (Criteria) this;
        }

        public Criteria andTsTravelPlaytimeLessThan(Integer value) {
            addCriterion("ts_travel_playtime <", value, "tsTravelPlaytime");
            return (Criteria) this;
        }

        public Criteria andTsTravelPlaytimeLessThanOrEqualTo(Integer value) {
            addCriterion("ts_travel_playtime <=", value, "tsTravelPlaytime");
            return (Criteria) this;
        }

        public Criteria andTsTravelPlaytimeIn(List<Integer> values) {
            addCriterion("ts_travel_playtime in", values, "tsTravelPlaytime");
            return (Criteria) this;
        }

        public Criteria andTsTravelPlaytimeNotIn(List<Integer> values) {
            addCriterion("ts_travel_playtime not in", values, "tsTravelPlaytime");
            return (Criteria) this;
        }

        public Criteria andTsTravelPlaytimeBetween(Integer value1, Integer value2) {
            addCriterion("ts_travel_playtime between", value1, value2, "tsTravelPlaytime");
            return (Criteria) this;
        }

        public Criteria andTsTravelPlaytimeNotBetween(Integer value1, Integer value2) {
            addCriterion("ts_travel_playtime not between", value1, value2, "tsTravelPlaytime");
            return (Criteria) this;
        }

        public Criteria andTsTravelRouteIsNull() {
            addCriterion("ts_travel_route is null");
            return (Criteria) this;
        }

        public Criteria andTsTravelRouteIsNotNull() {
            addCriterion("ts_travel_route is not null");
            return (Criteria) this;
        }

        public Criteria andTsTravelRouteEqualTo(String value) {
            addCriterion("ts_travel_route =", value, "tsTravelRoute");
            return (Criteria) this;
        }

        public Criteria andTsTravelRouteNotEqualTo(String value) {
            addCriterion("ts_travel_route <>", value, "tsTravelRoute");
            return (Criteria) this;
        }

        public Criteria andTsTravelRouteGreaterThan(String value) {
            addCriterion("ts_travel_route >", value, "tsTravelRoute");
            return (Criteria) this;
        }

        public Criteria andTsTravelRouteGreaterThanOrEqualTo(String value) {
            addCriterion("ts_travel_route >=", value, "tsTravelRoute");
            return (Criteria) this;
        }

        public Criteria andTsTravelRouteLessThan(String value) {
            addCriterion("ts_travel_route <", value, "tsTravelRoute");
            return (Criteria) this;
        }

        public Criteria andTsTravelRouteLessThanOrEqualTo(String value) {
            addCriterion("ts_travel_route <=", value, "tsTravelRoute");
            return (Criteria) this;
        }

        public Criteria andTsTravelRouteLike(String value) {
            addCriterion("ts_travel_route like", value, "tsTravelRoute");
            return (Criteria) this;
        }

        public Criteria andTsTravelRouteNotLike(String value) {
            addCriterion("ts_travel_route not like", value, "tsTravelRoute");
            return (Criteria) this;
        }

        public Criteria andTsTravelRouteIn(List<String> values) {
            addCriterion("ts_travel_route in", values, "tsTravelRoute");
            return (Criteria) this;
        }

        public Criteria andTsTravelRouteNotIn(List<String> values) {
            addCriterion("ts_travel_route not in", values, "tsTravelRoute");
            return (Criteria) this;
        }

        public Criteria andTsTravelRouteBetween(String value1, String value2) {
            addCriterion("ts_travel_route between", value1, value2, "tsTravelRoute");
            return (Criteria) this;
        }

        public Criteria andTsTravelRouteNotBetween(String value1, String value2) {
            addCriterion("ts_travel_route not between", value1, value2, "tsTravelRoute");
            return (Criteria) this;
        }

        public Criteria andTsTravelPictureIsNull() {
            addCriterion("ts_travel_picture is null");
            return (Criteria) this;
        }

        public Criteria andTsTravelPictureIsNotNull() {
            addCriterion("ts_travel_picture is not null");
            return (Criteria) this;
        }

        public Criteria andTsTravelPictureEqualTo(String value) {
            addCriterion("ts_travel_picture =", value, "tsTravelPicture");
            return (Criteria) this;
        }

        public Criteria andTsTravelPictureNotEqualTo(String value) {
            addCriterion("ts_travel_picture <>", value, "tsTravelPicture");
            return (Criteria) this;
        }

        public Criteria andTsTravelPictureGreaterThan(String value) {
            addCriterion("ts_travel_picture >", value, "tsTravelPicture");
            return (Criteria) this;
        }

        public Criteria andTsTravelPictureGreaterThanOrEqualTo(String value) {
            addCriterion("ts_travel_picture >=", value, "tsTravelPicture");
            return (Criteria) this;
        }

        public Criteria andTsTravelPictureLessThan(String value) {
            addCriterion("ts_travel_picture <", value, "tsTravelPicture");
            return (Criteria) this;
        }

        public Criteria andTsTravelPictureLessThanOrEqualTo(String value) {
            addCriterion("ts_travel_picture <=", value, "tsTravelPicture");
            return (Criteria) this;
        }

        public Criteria andTsTravelPictureLike(String value) {
            addCriterion("ts_travel_picture like", value, "tsTravelPicture");
            return (Criteria) this;
        }

        public Criteria andTsTravelPictureNotLike(String value) {
            addCriterion("ts_travel_picture not like", value, "tsTravelPicture");
            return (Criteria) this;
        }

        public Criteria andTsTravelPictureIn(List<String> values) {
            addCriterion("ts_travel_picture in", values, "tsTravelPicture");
            return (Criteria) this;
        }

        public Criteria andTsTravelPictureNotIn(List<String> values) {
            addCriterion("ts_travel_picture not in", values, "tsTravelPicture");
            return (Criteria) this;
        }

        public Criteria andTsTravelPictureBetween(String value1, String value2) {
            addCriterion("ts_travel_picture between", value1, value2, "tsTravelPicture");
            return (Criteria) this;
        }

        public Criteria andTsTravelPictureNotBetween(String value1, String value2) {
            addCriterion("ts_travel_picture not between", value1, value2, "tsTravelPicture");
            return (Criteria) this;
        }

        public Criteria andTsTravelNumberIsNull() {
            addCriterion("ts_travel_number is null");
            return (Criteria) this;
        }

        public Criteria andTsTravelNumberIsNotNull() {
            addCriterion("ts_travel_number is not null");
            return (Criteria) this;
        }

        public Criteria andTsTravelNumberEqualTo(Integer value) {
            addCriterion("ts_travel_number =", value, "tsTravelNumber");
            return (Criteria) this;
        }

        public Criteria andTsTravelNumberNotEqualTo(Integer value) {
            addCriterion("ts_travel_number <>", value, "tsTravelNumber");
            return (Criteria) this;
        }

        public Criteria andTsTravelNumberGreaterThan(Integer value) {
            addCriterion("ts_travel_number >", value, "tsTravelNumber");
            return (Criteria) this;
        }

        public Criteria andTsTravelNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("ts_travel_number >=", value, "tsTravelNumber");
            return (Criteria) this;
        }

        public Criteria andTsTravelNumberLessThan(Integer value) {
            addCriterion("ts_travel_number <", value, "tsTravelNumber");
            return (Criteria) this;
        }

        public Criteria andTsTravelNumberLessThanOrEqualTo(Integer value) {
            addCriterion("ts_travel_number <=", value, "tsTravelNumber");
            return (Criteria) this;
        }

        public Criteria andTsTravelNumberIn(List<Integer> values) {
            addCriterion("ts_travel_number in", values, "tsTravelNumber");
            return (Criteria) this;
        }

        public Criteria andTsTravelNumberNotIn(List<Integer> values) {
            addCriterion("ts_travel_number not in", values, "tsTravelNumber");
            return (Criteria) this;
        }

        public Criteria andTsTravelNumberBetween(Integer value1, Integer value2) {
            addCriterion("ts_travel_number between", value1, value2, "tsTravelNumber");
            return (Criteria) this;
        }

        public Criteria andTsTravelNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("ts_travel_number not between", value1, value2, "tsTravelNumber");
            return (Criteria) this;
        }

        public Criteria andTsTravelMoneyIsNull() {
            addCriterion("ts_travel_money is null");
            return (Criteria) this;
        }

        public Criteria andTsTravelMoneyIsNotNull() {
            addCriterion("ts_travel_money is not null");
            return (Criteria) this;
        }

        public Criteria andTsTravelMoneyEqualTo(Double value) {
            addCriterion("ts_travel_money =", value, "tsTravelMoney");
            return (Criteria) this;
        }

        public Criteria andTsTravelMoneyNotEqualTo(Double value) {
            addCriterion("ts_travel_money <>", value, "tsTravelMoney");
            return (Criteria) this;
        }

        public Criteria andTsTravelMoneyGreaterThan(Double value) {
            addCriterion("ts_travel_money >", value, "tsTravelMoney");
            return (Criteria) this;
        }

        public Criteria andTsTravelMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("ts_travel_money >=", value, "tsTravelMoney");
            return (Criteria) this;
        }

        public Criteria andTsTravelMoneyLessThan(Double value) {
            addCriterion("ts_travel_money <", value, "tsTravelMoney");
            return (Criteria) this;
        }

        public Criteria andTsTravelMoneyLessThanOrEqualTo(Double value) {
            addCriterion("ts_travel_money <=", value, "tsTravelMoney");
            return (Criteria) this;
        }

        public Criteria andTsTravelMoneyIn(List<Double> values) {
            addCriterion("ts_travel_money in", values, "tsTravelMoney");
            return (Criteria) this;
        }

        public Criteria andTsTravelMoneyNotIn(List<Double> values) {
            addCriterion("ts_travel_money not in", values, "tsTravelMoney");
            return (Criteria) this;
        }

        public Criteria andTsTravelMoneyBetween(Double value1, Double value2) {
            addCriterion("ts_travel_money between", value1, value2, "tsTravelMoney");
            return (Criteria) this;
        }

        public Criteria andTsTravelMoneyNotBetween(Double value1, Double value2) {
            addCriterion("ts_travel_money not between", value1, value2, "tsTravelMoney");
            return (Criteria) this;
        }

        public Criteria andTsTravelIntroduceIsNull() {
            addCriterion("ts_travel_introduce is null");
            return (Criteria) this;
        }

        public Criteria andTsTravelIntroduceIsNotNull() {
            addCriterion("ts_travel_introduce is not null");
            return (Criteria) this;
        }

        public Criteria andTsTravelIntroduceEqualTo(String value) {
            addCriterion("ts_travel_introduce =", value, "tsTravelIntroduce");
            return (Criteria) this;
        }

        public Criteria andTsTravelIntroduceNotEqualTo(String value) {
            addCriterion("ts_travel_introduce <>", value, "tsTravelIntroduce");
            return (Criteria) this;
        }

        public Criteria andTsTravelIntroduceGreaterThan(String value) {
            addCriterion("ts_travel_introduce >", value, "tsTravelIntroduce");
            return (Criteria) this;
        }

        public Criteria andTsTravelIntroduceGreaterThanOrEqualTo(String value) {
            addCriterion("ts_travel_introduce >=", value, "tsTravelIntroduce");
            return (Criteria) this;
        }

        public Criteria andTsTravelIntroduceLessThan(String value) {
            addCriterion("ts_travel_introduce <", value, "tsTravelIntroduce");
            return (Criteria) this;
        }

        public Criteria andTsTravelIntroduceLessThanOrEqualTo(String value) {
            addCriterion("ts_travel_introduce <=", value, "tsTravelIntroduce");
            return (Criteria) this;
        }

        public Criteria andTsTravelIntroduceLike(String value) {
            addCriterion("ts_travel_introduce like", value, "tsTravelIntroduce");
            return (Criteria) this;
        }

        public Criteria andTsTravelIntroduceNotLike(String value) {
            addCriterion("ts_travel_introduce not like", value, "tsTravelIntroduce");
            return (Criteria) this;
        }

        public Criteria andTsTravelIntroduceIn(List<String> values) {
            addCriterion("ts_travel_introduce in", values, "tsTravelIntroduce");
            return (Criteria) this;
        }

        public Criteria andTsTravelIntroduceNotIn(List<String> values) {
            addCriterion("ts_travel_introduce not in", values, "tsTravelIntroduce");
            return (Criteria) this;
        }

        public Criteria andTsTravelIntroduceBetween(String value1, String value2) {
            addCriterion("ts_travel_introduce between", value1, value2, "tsTravelIntroduce");
            return (Criteria) this;
        }

        public Criteria andTsTravelIntroduceNotBetween(String value1, String value2) {
            addCriterion("ts_travel_introduce not between", value1, value2, "tsTravelIntroduce");
            return (Criteria) this;
        }

        public Criteria andTsTravelStateIsNull() {
            addCriterion("ts_travel_state is null");
            return (Criteria) this;
        }

        public Criteria andTsTravelStateIsNotNull() {
            addCriterion("ts_travel_state is not null");
            return (Criteria) this;
        }

        public Criteria andTsTravelStateEqualTo(String value) {
            addCriterion("ts_travel_state =", value, "tsTravelState");
            return (Criteria) this;
        }

        public Criteria andTsTravelStateNotEqualTo(String value) {
            addCriterion("ts_travel_state <>", value, "tsTravelState");
            return (Criteria) this;
        }

        public Criteria andTsTravelStateGreaterThan(String value) {
            addCriterion("ts_travel_state >", value, "tsTravelState");
            return (Criteria) this;
        }

        public Criteria andTsTravelStateGreaterThanOrEqualTo(String value) {
            addCriterion("ts_travel_state >=", value, "tsTravelState");
            return (Criteria) this;
        }

        public Criteria andTsTravelStateLessThan(String value) {
            addCriterion("ts_travel_state <", value, "tsTravelState");
            return (Criteria) this;
        }

        public Criteria andTsTravelStateLessThanOrEqualTo(String value) {
            addCriterion("ts_travel_state <=", value, "tsTravelState");
            return (Criteria) this;
        }

        public Criteria andTsTravelStateLike(String value) {
            addCriterion("ts_travel_state like", value, "tsTravelState");
            return (Criteria) this;
        }

        public Criteria andTsTravelStateNotLike(String value) {
            addCriterion("ts_travel_state not like", value, "tsTravelState");
            return (Criteria) this;
        }

        public Criteria andTsTravelStateIn(List<String> values) {
            addCriterion("ts_travel_state in", values, "tsTravelState");
            return (Criteria) this;
        }

        public Criteria andTsTravelStateNotIn(List<String> values) {
            addCriterion("ts_travel_state not in", values, "tsTravelState");
            return (Criteria) this;
        }

        public Criteria andTsTravelStateBetween(String value1, String value2) {
            addCriterion("ts_travel_state between", value1, value2, "tsTravelState");
            return (Criteria) this;
        }

        public Criteria andTsTravelStateNotBetween(String value1, String value2) {
            addCriterion("ts_travel_state not between", value1, value2, "tsTravelState");
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