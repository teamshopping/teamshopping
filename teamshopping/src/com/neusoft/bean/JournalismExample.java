package com.neusoft.bean;

import java.util.ArrayList;
import java.util.List;

public class JournalismExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public JournalismExample() {
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

        public Criteria andJournalismIdIsNull() {
            addCriterion("journalism_id is null");
            return (Criteria) this;
        }

        public Criteria andJournalismIdIsNotNull() {
            addCriterion("journalism_id is not null");
            return (Criteria) this;
        }

        public Criteria andJournalismIdEqualTo(Integer value) {
            addCriterion("journalism_id =", value, "journalismId");
            return (Criteria) this;
        }

        public Criteria andJournalismIdNotEqualTo(Integer value) {
            addCriterion("journalism_id <>", value, "journalismId");
            return (Criteria) this;
        }

        public Criteria andJournalismIdGreaterThan(Integer value) {
            addCriterion("journalism_id >", value, "journalismId");
            return (Criteria) this;
        }

        public Criteria andJournalismIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("journalism_id >=", value, "journalismId");
            return (Criteria) this;
        }

        public Criteria andJournalismIdLessThan(Integer value) {
            addCriterion("journalism_id <", value, "journalismId");
            return (Criteria) this;
        }

        public Criteria andJournalismIdLessThanOrEqualTo(Integer value) {
            addCriterion("journalism_id <=", value, "journalismId");
            return (Criteria) this;
        }

        public Criteria andJournalismIdIn(List<Integer> values) {
            addCriterion("journalism_id in", values, "journalismId");
            return (Criteria) this;
        }

        public Criteria andJournalismIdNotIn(List<Integer> values) {
            addCriterion("journalism_id not in", values, "journalismId");
            return (Criteria) this;
        }

        public Criteria andJournalismIdBetween(Integer value1, Integer value2) {
            addCriterion("journalism_id between", value1, value2, "journalismId");
            return (Criteria) this;
        }

        public Criteria andJournalismIdNotBetween(Integer value1, Integer value2) {
            addCriterion("journalism_id not between", value1, value2, "journalismId");
            return (Criteria) this;
        }

        public Criteria andJournalismTitleIsNull() {
            addCriterion("journalism_title is null");
            return (Criteria) this;
        }

        public Criteria andJournalismTitleIsNotNull() {
            addCriterion("journalism_title is not null");
            return (Criteria) this;
        }

        public Criteria andJournalismTitleEqualTo(String value) {
            addCriterion("journalism_title =", value, "journalismTitle");
            return (Criteria) this;
        }

        public Criteria andJournalismTitleNotEqualTo(String value) {
            addCriterion("journalism_title <>", value, "journalismTitle");
            return (Criteria) this;
        }

        public Criteria andJournalismTitleGreaterThan(String value) {
            addCriterion("journalism_title >", value, "journalismTitle");
            return (Criteria) this;
        }

        public Criteria andJournalismTitleGreaterThanOrEqualTo(String value) {
            addCriterion("journalism_title >=", value, "journalismTitle");
            return (Criteria) this;
        }

        public Criteria andJournalismTitleLessThan(String value) {
            addCriterion("journalism_title <", value, "journalismTitle");
            return (Criteria) this;
        }

        public Criteria andJournalismTitleLessThanOrEqualTo(String value) {
            addCriterion("journalism_title <=", value, "journalismTitle");
            return (Criteria) this;
        }

        public Criteria andJournalismTitleLike(String value) {
            addCriterion("journalism_title like", value, "journalismTitle");
            return (Criteria) this;
        }

        public Criteria andJournalismTitleNotLike(String value) {
            addCriterion("journalism_title not like", value, "journalismTitle");
            return (Criteria) this;
        }

        public Criteria andJournalismTitleIn(List<String> values) {
            addCriterion("journalism_title in", values, "journalismTitle");
            return (Criteria) this;
        }

        public Criteria andJournalismTitleNotIn(List<String> values) {
            addCriterion("journalism_title not in", values, "journalismTitle");
            return (Criteria) this;
        }

        public Criteria andJournalismTitleBetween(String value1, String value2) {
            addCriterion("journalism_title between", value1, value2, "journalismTitle");
            return (Criteria) this;
        }

        public Criteria andJournalismTitleNotBetween(String value1, String value2) {
            addCriterion("journalism_title not between", value1, value2, "journalismTitle");
            return (Criteria) this;
        }

        public Criteria andJournalismArticleIsNull() {
            addCriterion("journalism_article is null");
            return (Criteria) this;
        }

        public Criteria andJournalismArticleIsNotNull() {
            addCriterion("journalism_article is not null");
            return (Criteria) this;
        }

        public Criteria andJournalismArticleEqualTo(String value) {
            addCriterion("journalism_article =", value, "journalismArticle");
            return (Criteria) this;
        }

        public Criteria andJournalismArticleNotEqualTo(String value) {
            addCriterion("journalism_article <>", value, "journalismArticle");
            return (Criteria) this;
        }

        public Criteria andJournalismArticleGreaterThan(String value) {
            addCriterion("journalism_article >", value, "journalismArticle");
            return (Criteria) this;
        }

        public Criteria andJournalismArticleGreaterThanOrEqualTo(String value) {
            addCriterion("journalism_article >=", value, "journalismArticle");
            return (Criteria) this;
        }

        public Criteria andJournalismArticleLessThan(String value) {
            addCriterion("journalism_article <", value, "journalismArticle");
            return (Criteria) this;
        }

        public Criteria andJournalismArticleLessThanOrEqualTo(String value) {
            addCriterion("journalism_article <=", value, "journalismArticle");
            return (Criteria) this;
        }

        public Criteria andJournalismArticleLike(String value) {
            addCriterion("journalism_article like", value, "journalismArticle");
            return (Criteria) this;
        }

        public Criteria andJournalismArticleNotLike(String value) {
            addCriterion("journalism_article not like", value, "journalismArticle");
            return (Criteria) this;
        }

        public Criteria andJournalismArticleIn(List<String> values) {
            addCriterion("journalism_article in", values, "journalismArticle");
            return (Criteria) this;
        }

        public Criteria andJournalismArticleNotIn(List<String> values) {
            addCriterion("journalism_article not in", values, "journalismArticle");
            return (Criteria) this;
        }

        public Criteria andJournalismArticleBetween(String value1, String value2) {
            addCriterion("journalism_article between", value1, value2, "journalismArticle");
            return (Criteria) this;
        }

        public Criteria andJournalismArticleNotBetween(String value1, String value2) {
            addCriterion("journalism_article not between", value1, value2, "journalismArticle");
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