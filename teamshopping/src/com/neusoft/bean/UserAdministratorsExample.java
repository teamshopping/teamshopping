package com.neusoft.bean;

import java.util.ArrayList;
import java.util.List;

public class UserAdministratorsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserAdministratorsExample() {
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

        public Criteria andUAdministratorsIsNull() {
            addCriterion("u_administrators is null");
            return (Criteria) this;
        }

        public Criteria andUAdministratorsIsNotNull() {
            addCriterion("u_administrators is not null");
            return (Criteria) this;
        }

        public Criteria andUAdministratorsEqualTo(Integer value) {
            addCriterion("u_administrators =", value, "uAdministrators");
            return (Criteria) this;
        }

        public Criteria andUAdministratorsNotEqualTo(Integer value) {
            addCriterion("u_administrators <>", value, "uAdministrators");
            return (Criteria) this;
        }

        public Criteria andUAdministratorsGreaterThan(Integer value) {
            addCriterion("u_administrators >", value, "uAdministrators");
            return (Criteria) this;
        }

        public Criteria andUAdministratorsGreaterThanOrEqualTo(Integer value) {
            addCriterion("u_administrators >=", value, "uAdministrators");
            return (Criteria) this;
        }

        public Criteria andUAdministratorsLessThan(Integer value) {
            addCriterion("u_administrators <", value, "uAdministrators");
            return (Criteria) this;
        }

        public Criteria andUAdministratorsLessThanOrEqualTo(Integer value) {
            addCriterion("u_administrators <=", value, "uAdministrators");
            return (Criteria) this;
        }

        public Criteria andUAdministratorsIn(List<Integer> values) {
            addCriterion("u_administrators in", values, "uAdministrators");
            return (Criteria) this;
        }

        public Criteria andUAdministratorsNotIn(List<Integer> values) {
            addCriterion("u_administrators not in", values, "uAdministrators");
            return (Criteria) this;
        }

        public Criteria andUAdministratorsBetween(Integer value1, Integer value2) {
            addCriterion("u_administrators between", value1, value2, "uAdministrators");
            return (Criteria) this;
        }

        public Criteria andUAdministratorsNotBetween(Integer value1, Integer value2) {
            addCriterion("u_administrators not between", value1, value2, "uAdministrators");
            return (Criteria) this;
        }

        public Criteria andUAdministratorsNameIsNull() {
            addCriterion("u_administrators_name is null");
            return (Criteria) this;
        }

        public Criteria andUAdministratorsNameIsNotNull() {
            addCriterion("u_administrators_name is not null");
            return (Criteria) this;
        }

        public Criteria andUAdministratorsNameEqualTo(String value) {
            addCriterion("u_administrators_name =", value, "uAdministratorsName");
            return (Criteria) this;
        }

        public Criteria andUAdministratorsNameNotEqualTo(String value) {
            addCriterion("u_administrators_name <>", value, "uAdministratorsName");
            return (Criteria) this;
        }

        public Criteria andUAdministratorsNameGreaterThan(String value) {
            addCriterion("u_administrators_name >", value, "uAdministratorsName");
            return (Criteria) this;
        }

        public Criteria andUAdministratorsNameGreaterThanOrEqualTo(String value) {
            addCriterion("u_administrators_name >=", value, "uAdministratorsName");
            return (Criteria) this;
        }

        public Criteria andUAdministratorsNameLessThan(String value) {
            addCriterion("u_administrators_name <", value, "uAdministratorsName");
            return (Criteria) this;
        }

        public Criteria andUAdministratorsNameLessThanOrEqualTo(String value) {
            addCriterion("u_administrators_name <=", value, "uAdministratorsName");
            return (Criteria) this;
        }

        public Criteria andUAdministratorsNameLike(String value) {
            addCriterion("u_administrators_name like", value, "uAdministratorsName");
            return (Criteria) this;
        }

        public Criteria andUAdministratorsNameNotLike(String value) {
            addCriterion("u_administrators_name not like", value, "uAdministratorsName");
            return (Criteria) this;
        }

        public Criteria andUAdministratorsNameIn(List<String> values) {
            addCriterion("u_administrators_name in", values, "uAdministratorsName");
            return (Criteria) this;
        }

        public Criteria andUAdministratorsNameNotIn(List<String> values) {
            addCriterion("u_administrators_name not in", values, "uAdministratorsName");
            return (Criteria) this;
        }

        public Criteria andUAdministratorsNameBetween(String value1, String value2) {
            addCriterion("u_administrators_name between", value1, value2, "uAdministratorsName");
            return (Criteria) this;
        }

        public Criteria andUAdministratorsNameNotBetween(String value1, String value2) {
            addCriterion("u_administrators_name not between", value1, value2, "uAdministratorsName");
            return (Criteria) this;
        }

        public Criteria andUAdministratorsPwdIsNull() {
            addCriterion("u_administrators_pwd is null");
            return (Criteria) this;
        }

        public Criteria andUAdministratorsPwdIsNotNull() {
            addCriterion("u_administrators_pwd is not null");
            return (Criteria) this;
        }

        public Criteria andUAdministratorsPwdEqualTo(String value) {
            addCriterion("u_administrators_pwd =", value, "uAdministratorsPwd");
            return (Criteria) this;
        }

        public Criteria andUAdministratorsPwdNotEqualTo(String value) {
            addCriterion("u_administrators_pwd <>", value, "uAdministratorsPwd");
            return (Criteria) this;
        }

        public Criteria andUAdministratorsPwdGreaterThan(String value) {
            addCriterion("u_administrators_pwd >", value, "uAdministratorsPwd");
            return (Criteria) this;
        }

        public Criteria andUAdministratorsPwdGreaterThanOrEqualTo(String value) {
            addCriterion("u_administrators_pwd >=", value, "uAdministratorsPwd");
            return (Criteria) this;
        }

        public Criteria andUAdministratorsPwdLessThan(String value) {
            addCriterion("u_administrators_pwd <", value, "uAdministratorsPwd");
            return (Criteria) this;
        }

        public Criteria andUAdministratorsPwdLessThanOrEqualTo(String value) {
            addCriterion("u_administrators_pwd <=", value, "uAdministratorsPwd");
            return (Criteria) this;
        }

        public Criteria andUAdministratorsPwdLike(String value) {
            addCriterion("u_administrators_pwd like", value, "uAdministratorsPwd");
            return (Criteria) this;
        }

        public Criteria andUAdministratorsPwdNotLike(String value) {
            addCriterion("u_administrators_pwd not like", value, "uAdministratorsPwd");
            return (Criteria) this;
        }

        public Criteria andUAdministratorsPwdIn(List<String> values) {
            addCriterion("u_administrators_pwd in", values, "uAdministratorsPwd");
            return (Criteria) this;
        }

        public Criteria andUAdministratorsPwdNotIn(List<String> values) {
            addCriterion("u_administrators_pwd not in", values, "uAdministratorsPwd");
            return (Criteria) this;
        }

        public Criteria andUAdministratorsPwdBetween(String value1, String value2) {
            addCriterion("u_administrators_pwd between", value1, value2, "uAdministratorsPwd");
            return (Criteria) this;
        }

        public Criteria andUAdministratorsPwdNotBetween(String value1, String value2) {
            addCriterion("u_administrators_pwd not between", value1, value2, "uAdministratorsPwd");
            return (Criteria) this;
        }

        public Criteria andUAdministratorsRealnameIsNull() {
            addCriterion("u_administrators_realname is null");
            return (Criteria) this;
        }

        public Criteria andUAdministratorsRealnameIsNotNull() {
            addCriterion("u_administrators_realname is not null");
            return (Criteria) this;
        }

        public Criteria andUAdministratorsRealnameEqualTo(String value) {
            addCriterion("u_administrators_realname =", value, "uAdministratorsRealname");
            return (Criteria) this;
        }

        public Criteria andUAdministratorsRealnameNotEqualTo(String value) {
            addCriterion("u_administrators_realname <>", value, "uAdministratorsRealname");
            return (Criteria) this;
        }

        public Criteria andUAdministratorsRealnameGreaterThan(String value) {
            addCriterion("u_administrators_realname >", value, "uAdministratorsRealname");
            return (Criteria) this;
        }

        public Criteria andUAdministratorsRealnameGreaterThanOrEqualTo(String value) {
            addCriterion("u_administrators_realname >=", value, "uAdministratorsRealname");
            return (Criteria) this;
        }

        public Criteria andUAdministratorsRealnameLessThan(String value) {
            addCriterion("u_administrators_realname <", value, "uAdministratorsRealname");
            return (Criteria) this;
        }

        public Criteria andUAdministratorsRealnameLessThanOrEqualTo(String value) {
            addCriterion("u_administrators_realname <=", value, "uAdministratorsRealname");
            return (Criteria) this;
        }

        public Criteria andUAdministratorsRealnameLike(String value) {
            addCriterion("u_administrators_realname like", value, "uAdministratorsRealname");
            return (Criteria) this;
        }

        public Criteria andUAdministratorsRealnameNotLike(String value) {
            addCriterion("u_administrators_realname not like", value, "uAdministratorsRealname");
            return (Criteria) this;
        }

        public Criteria andUAdministratorsRealnameIn(List<String> values) {
            addCriterion("u_administrators_realname in", values, "uAdministratorsRealname");
            return (Criteria) this;
        }

        public Criteria andUAdministratorsRealnameNotIn(List<String> values) {
            addCriterion("u_administrators_realname not in", values, "uAdministratorsRealname");
            return (Criteria) this;
        }

        public Criteria andUAdministratorsRealnameBetween(String value1, String value2) {
            addCriterion("u_administrators_realname between", value1, value2, "uAdministratorsRealname");
            return (Criteria) this;
        }

        public Criteria andUAdministratorsRealnameNotBetween(String value1, String value2) {
            addCriterion("u_administrators_realname not between", value1, value2, "uAdministratorsRealname");
            return (Criteria) this;
        }

        public Criteria andUAdministratorsPhoneIsNull() {
            addCriterion("u_administrators_phone is null");
            return (Criteria) this;
        }

        public Criteria andUAdministratorsPhoneIsNotNull() {
            addCriterion("u_administrators_phone is not null");
            return (Criteria) this;
        }

        public Criteria andUAdministratorsPhoneEqualTo(Integer value) {
            addCriterion("u_administrators_phone =", value, "uAdministratorsPhone");
            return (Criteria) this;
        }

        public Criteria andUAdministratorsPhoneNotEqualTo(Integer value) {
            addCriterion("u_administrators_phone <>", value, "uAdministratorsPhone");
            return (Criteria) this;
        }

        public Criteria andUAdministratorsPhoneGreaterThan(Integer value) {
            addCriterion("u_administrators_phone >", value, "uAdministratorsPhone");
            return (Criteria) this;
        }

        public Criteria andUAdministratorsPhoneGreaterThanOrEqualTo(Integer value) {
            addCriterion("u_administrators_phone >=", value, "uAdministratorsPhone");
            return (Criteria) this;
        }

        public Criteria andUAdministratorsPhoneLessThan(Integer value) {
            addCriterion("u_administrators_phone <", value, "uAdministratorsPhone");
            return (Criteria) this;
        }

        public Criteria andUAdministratorsPhoneLessThanOrEqualTo(Integer value) {
            addCriterion("u_administrators_phone <=", value, "uAdministratorsPhone");
            return (Criteria) this;
        }

        public Criteria andUAdministratorsPhoneIn(List<Integer> values) {
            addCriterion("u_administrators_phone in", values, "uAdministratorsPhone");
            return (Criteria) this;
        }

        public Criteria andUAdministratorsPhoneNotIn(List<Integer> values) {
            addCriterion("u_administrators_phone not in", values, "uAdministratorsPhone");
            return (Criteria) this;
        }

        public Criteria andUAdministratorsPhoneBetween(Integer value1, Integer value2) {
            addCriterion("u_administrators_phone between", value1, value2, "uAdministratorsPhone");
            return (Criteria) this;
        }

        public Criteria andUAdministratorsPhoneNotBetween(Integer value1, Integer value2) {
            addCriterion("u_administrators_phone not between", value1, value2, "uAdministratorsPhone");
            return (Criteria) this;
        }

        public Criteria andUAdministratorsWorkIsNull() {
            addCriterion("u_administrators_work is null");
            return (Criteria) this;
        }

        public Criteria andUAdministratorsWorkIsNotNull() {
            addCriterion("u_administrators_work is not null");
            return (Criteria) this;
        }

        public Criteria andUAdministratorsWorkEqualTo(String value) {
            addCriterion("u_administrators_work =", value, "uAdministratorsWork");
            return (Criteria) this;
        }

        public Criteria andUAdministratorsWorkNotEqualTo(String value) {
            addCriterion("u_administrators_work <>", value, "uAdministratorsWork");
            return (Criteria) this;
        }

        public Criteria andUAdministratorsWorkGreaterThan(String value) {
            addCriterion("u_administrators_work >", value, "uAdministratorsWork");
            return (Criteria) this;
        }

        public Criteria andUAdministratorsWorkGreaterThanOrEqualTo(String value) {
            addCriterion("u_administrators_work >=", value, "uAdministratorsWork");
            return (Criteria) this;
        }

        public Criteria andUAdministratorsWorkLessThan(String value) {
            addCriterion("u_administrators_work <", value, "uAdministratorsWork");
            return (Criteria) this;
        }

        public Criteria andUAdministratorsWorkLessThanOrEqualTo(String value) {
            addCriterion("u_administrators_work <=", value, "uAdministratorsWork");
            return (Criteria) this;
        }

        public Criteria andUAdministratorsWorkLike(String value) {
            addCriterion("u_administrators_work like", value, "uAdministratorsWork");
            return (Criteria) this;
        }

        public Criteria andUAdministratorsWorkNotLike(String value) {
            addCriterion("u_administrators_work not like", value, "uAdministratorsWork");
            return (Criteria) this;
        }

        public Criteria andUAdministratorsWorkIn(List<String> values) {
            addCriterion("u_administrators_work in", values, "uAdministratorsWork");
            return (Criteria) this;
        }

        public Criteria andUAdministratorsWorkNotIn(List<String> values) {
            addCriterion("u_administrators_work not in", values, "uAdministratorsWork");
            return (Criteria) this;
        }

        public Criteria andUAdministratorsWorkBetween(String value1, String value2) {
            addCriterion("u_administrators_work between", value1, value2, "uAdministratorsWork");
            return (Criteria) this;
        }

        public Criteria andUAdministratorsWorkNotBetween(String value1, String value2) {
            addCriterion("u_administrators_work not between", value1, value2, "uAdministratorsWork");
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