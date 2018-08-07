package com.neusoft.bean;

import java.util.ArrayList;
import java.util.List;

public class UserMemberExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserMemberExample() {
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

        public Criteria andUMemberIdIsNull() {
            addCriterion("u_member_id is null");
            return (Criteria) this;
        }

        public Criteria andUMemberIdIsNotNull() {
            addCriterion("u_member_id is not null");
            return (Criteria) this;
        }

        public Criteria andUMemberIdEqualTo(Integer value) {
            addCriterion("u_member_id =", value, "uMemberId");
            return (Criteria) this;
        }

        public Criteria andUMemberIdNotEqualTo(Integer value) {
            addCriterion("u_member_id <>", value, "uMemberId");
            return (Criteria) this;
        }

        public Criteria andUMemberIdGreaterThan(Integer value) {
            addCriterion("u_member_id >", value, "uMemberId");
            return (Criteria) this;
        }

        public Criteria andUMemberIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("u_member_id >=", value, "uMemberId");
            return (Criteria) this;
        }

        public Criteria andUMemberIdLessThan(Integer value) {
            addCriterion("u_member_id <", value, "uMemberId");
            return (Criteria) this;
        }

        public Criteria andUMemberIdLessThanOrEqualTo(Integer value) {
            addCriterion("u_member_id <=", value, "uMemberId");
            return (Criteria) this;
        }

        public Criteria andUMemberIdIn(List<Integer> values) {
            addCriterion("u_member_id in", values, "uMemberId");
            return (Criteria) this;
        }

        public Criteria andUMemberIdNotIn(List<Integer> values) {
            addCriterion("u_member_id not in", values, "uMemberId");
            return (Criteria) this;
        }

        public Criteria andUMemberIdBetween(Integer value1, Integer value2) {
            addCriterion("u_member_id between", value1, value2, "uMemberId");
            return (Criteria) this;
        }

        public Criteria andUMemberIdNotBetween(Integer value1, Integer value2) {
            addCriterion("u_member_id not between", value1, value2, "uMemberId");
            return (Criteria) this;
        }

        public Criteria andUMemberNameIsNull() {
            addCriterion("u_member_name is null");
            return (Criteria) this;
        }

        public Criteria andUMemberNameIsNotNull() {
            addCriterion("u_member_name is not null");
            return (Criteria) this;
        }

        public Criteria andUMemberNameEqualTo(String value) {
            addCriterion("u_member_name =", value, "uMemberName");
            return (Criteria) this;
        }

        public Criteria andUMemberNameNotEqualTo(String value) {
            addCriterion("u_member_name <>", value, "uMemberName");
            return (Criteria) this;
        }

        public Criteria andUMemberNameGreaterThan(String value) {
            addCriterion("u_member_name >", value, "uMemberName");
            return (Criteria) this;
        }

        public Criteria andUMemberNameGreaterThanOrEqualTo(String value) {
            addCriterion("u_member_name >=", value, "uMemberName");
            return (Criteria) this;
        }

        public Criteria andUMemberNameLessThan(String value) {
            addCriterion("u_member_name <", value, "uMemberName");
            return (Criteria) this;
        }

        public Criteria andUMemberNameLessThanOrEqualTo(String value) {
            addCriterion("u_member_name <=", value, "uMemberName");
            return (Criteria) this;
        }

        public Criteria andUMemberNameLike(String value) {
            addCriterion("u_member_name like", value, "uMemberName");
            return (Criteria) this;
        }

        public Criteria andUMemberNameNotLike(String value) {
            addCriterion("u_member_name not like", value, "uMemberName");
            return (Criteria) this;
        }

        public Criteria andUMemberNameIn(List<String> values) {
            addCriterion("u_member_name in", values, "uMemberName");
            return (Criteria) this;
        }

        public Criteria andUMemberNameNotIn(List<String> values) {
            addCriterion("u_member_name not in", values, "uMemberName");
            return (Criteria) this;
        }

        public Criteria andUMemberNameBetween(String value1, String value2) {
            addCriterion("u_member_name between", value1, value2, "uMemberName");
            return (Criteria) this;
        }

        public Criteria andUMemberNameNotBetween(String value1, String value2) {
            addCriterion("u_member_name not between", value1, value2, "uMemberName");
            return (Criteria) this;
        }

        public Criteria andUMemberPwdIsNull() {
            addCriterion("u_member_pwd is null");
            return (Criteria) this;
        }

        public Criteria andUMemberPwdIsNotNull() {
            addCriterion("u_member_pwd is not null");
            return (Criteria) this;
        }

        public Criteria andUMemberPwdEqualTo(String value) {
            addCriterion("u_member_pwd =", value, "uMemberPwd");
            return (Criteria) this;
        }

        public Criteria andUMemberPwdNotEqualTo(String value) {
            addCriterion("u_member_pwd <>", value, "uMemberPwd");
            return (Criteria) this;
        }

        public Criteria andUMemberPwdGreaterThan(String value) {
            addCriterion("u_member_pwd >", value, "uMemberPwd");
            return (Criteria) this;
        }

        public Criteria andUMemberPwdGreaterThanOrEqualTo(String value) {
            addCriterion("u_member_pwd >=", value, "uMemberPwd");
            return (Criteria) this;
        }

        public Criteria andUMemberPwdLessThan(String value) {
            addCriterion("u_member_pwd <", value, "uMemberPwd");
            return (Criteria) this;
        }

        public Criteria andUMemberPwdLessThanOrEqualTo(String value) {
            addCriterion("u_member_pwd <=", value, "uMemberPwd");
            return (Criteria) this;
        }

        public Criteria andUMemberPwdLike(String value) {
            addCriterion("u_member_pwd like", value, "uMemberPwd");
            return (Criteria) this;
        }

        public Criteria andUMemberPwdNotLike(String value) {
            addCriterion("u_member_pwd not like", value, "uMemberPwd");
            return (Criteria) this;
        }

        public Criteria andUMemberPwdIn(List<String> values) {
            addCriterion("u_member_pwd in", values, "uMemberPwd");
            return (Criteria) this;
        }

        public Criteria andUMemberPwdNotIn(List<String> values) {
            addCriterion("u_member_pwd not in", values, "uMemberPwd");
            return (Criteria) this;
        }

        public Criteria andUMemberPwdBetween(String value1, String value2) {
            addCriterion("u_member_pwd between", value1, value2, "uMemberPwd");
            return (Criteria) this;
        }

        public Criteria andUMemberPwdNotBetween(String value1, String value2) {
            addCriterion("u_member_pwd not between", value1, value2, "uMemberPwd");
            return (Criteria) this;
        }

        public Criteria andUMemberRealeIsNull() {
            addCriterion("u_member_reale is null");
            return (Criteria) this;
        }

        public Criteria andUMemberRealeIsNotNull() {
            addCriterion("u_member_reale is not null");
            return (Criteria) this;
        }

        public Criteria andUMemberRealeEqualTo(String value) {
            addCriterion("u_member_reale =", value, "uMemberReale");
            return (Criteria) this;
        }

        public Criteria andUMemberRealeNotEqualTo(String value) {
            addCriterion("u_member_reale <>", value, "uMemberReale");
            return (Criteria) this;
        }

        public Criteria andUMemberRealeGreaterThan(String value) {
            addCriterion("u_member_reale >", value, "uMemberReale");
            return (Criteria) this;
        }

        public Criteria andUMemberRealeGreaterThanOrEqualTo(String value) {
            addCriterion("u_member_reale >=", value, "uMemberReale");
            return (Criteria) this;
        }

        public Criteria andUMemberRealeLessThan(String value) {
            addCriterion("u_member_reale <", value, "uMemberReale");
            return (Criteria) this;
        }

        public Criteria andUMemberRealeLessThanOrEqualTo(String value) {
            addCriterion("u_member_reale <=", value, "uMemberReale");
            return (Criteria) this;
        }

        public Criteria andUMemberRealeLike(String value) {
            addCriterion("u_member_reale like", value, "uMemberReale");
            return (Criteria) this;
        }

        public Criteria andUMemberRealeNotLike(String value) {
            addCriterion("u_member_reale not like", value, "uMemberReale");
            return (Criteria) this;
        }

        public Criteria andUMemberRealeIn(List<String> values) {
            addCriterion("u_member_reale in", values, "uMemberReale");
            return (Criteria) this;
        }

        public Criteria andUMemberRealeNotIn(List<String> values) {
            addCriterion("u_member_reale not in", values, "uMemberReale");
            return (Criteria) this;
        }

        public Criteria andUMemberRealeBetween(String value1, String value2) {
            addCriterion("u_member_reale between", value1, value2, "uMemberReale");
            return (Criteria) this;
        }

        public Criteria andUMemberRealeNotBetween(String value1, String value2) {
            addCriterion("u_member_reale not between", value1, value2, "uMemberReale");
            return (Criteria) this;
        }

        public Criteria andUMemberSexIsNull() {
            addCriterion("u_member_sex is null");
            return (Criteria) this;
        }

        public Criteria andUMemberSexIsNotNull() {
            addCriterion("u_member_sex is not null");
            return (Criteria) this;
        }

        public Criteria andUMemberSexEqualTo(Boolean value) {
            addCriterion("u_member_sex =", value, "uMemberSex");
            return (Criteria) this;
        }

        public Criteria andUMemberSexNotEqualTo(Boolean value) {
            addCriterion("u_member_sex <>", value, "uMemberSex");
            return (Criteria) this;
        }

        public Criteria andUMemberSexGreaterThan(Boolean value) {
            addCriterion("u_member_sex >", value, "uMemberSex");
            return (Criteria) this;
        }

        public Criteria andUMemberSexGreaterThanOrEqualTo(Boolean value) {
            addCriterion("u_member_sex >=", value, "uMemberSex");
            return (Criteria) this;
        }

        public Criteria andUMemberSexLessThan(Boolean value) {
            addCriterion("u_member_sex <", value, "uMemberSex");
            return (Criteria) this;
        }

        public Criteria andUMemberSexLessThanOrEqualTo(Boolean value) {
            addCriterion("u_member_sex <=", value, "uMemberSex");
            return (Criteria) this;
        }

        public Criteria andUMemberSexIn(List<Boolean> values) {
            addCriterion("u_member_sex in", values, "uMemberSex");
            return (Criteria) this;
        }

        public Criteria andUMemberSexNotIn(List<Boolean> values) {
            addCriterion("u_member_sex not in", values, "uMemberSex");
            return (Criteria) this;
        }

        public Criteria andUMemberSexBetween(Boolean value1, Boolean value2) {
            addCriterion("u_member_sex between", value1, value2, "uMemberSex");
            return (Criteria) this;
        }

        public Criteria andUMemberSexNotBetween(Boolean value1, Boolean value2) {
            addCriterion("u_member_sex not between", value1, value2, "uMemberSex");
            return (Criteria) this;
        }

        public Criteria andUMemberPhoneIsNull() {
            addCriterion("u_member_phone is null");
            return (Criteria) this;
        }

        public Criteria andUMemberPhoneIsNotNull() {
            addCriterion("u_member_phone is not null");
            return (Criteria) this;
        }

        public Criteria andUMemberPhoneEqualTo(Integer value) {
            addCriterion("u_member_phone =", value, "uMemberPhone");
            return (Criteria) this;
        }

        public Criteria andUMemberPhoneNotEqualTo(Integer value) {
            addCriterion("u_member_phone <>", value, "uMemberPhone");
            return (Criteria) this;
        }

        public Criteria andUMemberPhoneGreaterThan(Integer value) {
            addCriterion("u_member_phone >", value, "uMemberPhone");
            return (Criteria) this;
        }

        public Criteria andUMemberPhoneGreaterThanOrEqualTo(Integer value) {
            addCriterion("u_member_phone >=", value, "uMemberPhone");
            return (Criteria) this;
        }

        public Criteria andUMemberPhoneLessThan(Integer value) {
            addCriterion("u_member_phone <", value, "uMemberPhone");
            return (Criteria) this;
        }

        public Criteria andUMemberPhoneLessThanOrEqualTo(Integer value) {
            addCriterion("u_member_phone <=", value, "uMemberPhone");
            return (Criteria) this;
        }

        public Criteria andUMemberPhoneIn(List<Integer> values) {
            addCriterion("u_member_phone in", values, "uMemberPhone");
            return (Criteria) this;
        }

        public Criteria andUMemberPhoneNotIn(List<Integer> values) {
            addCriterion("u_member_phone not in", values, "uMemberPhone");
            return (Criteria) this;
        }

        public Criteria andUMemberPhoneBetween(Integer value1, Integer value2) {
            addCriterion("u_member_phone between", value1, value2, "uMemberPhone");
            return (Criteria) this;
        }

        public Criteria andUMemberPhoneNotBetween(Integer value1, Integer value2) {
            addCriterion("u_member_phone not between", value1, value2, "uMemberPhone");
            return (Criteria) this;
        }

        public Criteria andUMemberEmailIsNull() {
            addCriterion("u_member_email is null");
            return (Criteria) this;
        }

        public Criteria andUMemberEmailIsNotNull() {
            addCriterion("u_member_email is not null");
            return (Criteria) this;
        }

        public Criteria andUMemberEmailEqualTo(String value) {
            addCriterion("u_member_email =", value, "uMemberEmail");
            return (Criteria) this;
        }

        public Criteria andUMemberEmailNotEqualTo(String value) {
            addCriterion("u_member_email <>", value, "uMemberEmail");
            return (Criteria) this;
        }

        public Criteria andUMemberEmailGreaterThan(String value) {
            addCriterion("u_member_email >", value, "uMemberEmail");
            return (Criteria) this;
        }

        public Criteria andUMemberEmailGreaterThanOrEqualTo(String value) {
            addCriterion("u_member_email >=", value, "uMemberEmail");
            return (Criteria) this;
        }

        public Criteria andUMemberEmailLessThan(String value) {
            addCriterion("u_member_email <", value, "uMemberEmail");
            return (Criteria) this;
        }

        public Criteria andUMemberEmailLessThanOrEqualTo(String value) {
            addCriterion("u_member_email <=", value, "uMemberEmail");
            return (Criteria) this;
        }

        public Criteria andUMemberEmailLike(String value) {
            addCriterion("u_member_email like", value, "uMemberEmail");
            return (Criteria) this;
        }

        public Criteria andUMemberEmailNotLike(String value) {
            addCriterion("u_member_email not like", value, "uMemberEmail");
            return (Criteria) this;
        }

        public Criteria andUMemberEmailIn(List<String> values) {
            addCriterion("u_member_email in", values, "uMemberEmail");
            return (Criteria) this;
        }

        public Criteria andUMemberEmailNotIn(List<String> values) {
            addCriterion("u_member_email not in", values, "uMemberEmail");
            return (Criteria) this;
        }

        public Criteria andUMemberEmailBetween(String value1, String value2) {
            addCriterion("u_member_email between", value1, value2, "uMemberEmail");
            return (Criteria) this;
        }

        public Criteria andUMemberEmailNotBetween(String value1, String value2) {
            addCriterion("u_member_email not between", value1, value2, "uMemberEmail");
            return (Criteria) this;
        }

        public Criteria andUMemberIntegralIsNull() {
            addCriterion("u_member_integral is null");
            return (Criteria) this;
        }

        public Criteria andUMemberIntegralIsNotNull() {
            addCriterion("u_member_integral is not null");
            return (Criteria) this;
        }

        public Criteria andUMemberIntegralEqualTo(Integer value) {
            addCriterion("u_member_integral =", value, "uMemberIntegral");
            return (Criteria) this;
        }

        public Criteria andUMemberIntegralNotEqualTo(Integer value) {
            addCriterion("u_member_integral <>", value, "uMemberIntegral");
            return (Criteria) this;
        }

        public Criteria andUMemberIntegralGreaterThan(Integer value) {
            addCriterion("u_member_integral >", value, "uMemberIntegral");
            return (Criteria) this;
        }

        public Criteria andUMemberIntegralGreaterThanOrEqualTo(Integer value) {
            addCriterion("u_member_integral >=", value, "uMemberIntegral");
            return (Criteria) this;
        }

        public Criteria andUMemberIntegralLessThan(Integer value) {
            addCriterion("u_member_integral <", value, "uMemberIntegral");
            return (Criteria) this;
        }

        public Criteria andUMemberIntegralLessThanOrEqualTo(Integer value) {
            addCriterion("u_member_integral <=", value, "uMemberIntegral");
            return (Criteria) this;
        }

        public Criteria andUMemberIntegralIn(List<Integer> values) {
            addCriterion("u_member_integral in", values, "uMemberIntegral");
            return (Criteria) this;
        }

        public Criteria andUMemberIntegralNotIn(List<Integer> values) {
            addCriterion("u_member_integral not in", values, "uMemberIntegral");
            return (Criteria) this;
        }

        public Criteria andUMemberIntegralBetween(Integer value1, Integer value2) {
            addCriterion("u_member_integral between", value1, value2, "uMemberIntegral");
            return (Criteria) this;
        }

        public Criteria andUMemberIntegralNotBetween(Integer value1, Integer value2) {
            addCriterion("u_member_integral not between", value1, value2, "uMemberIntegral");
            return (Criteria) this;
        }

        public Criteria andUMemberPidIsNull() {
            addCriterion("u_member_pid is null");
            return (Criteria) this;
        }

        public Criteria andUMemberPidIsNotNull() {
            addCriterion("u_member_pid is not null");
            return (Criteria) this;
        }

        public Criteria andUMemberPidEqualTo(Integer value) {
            addCriterion("u_member_pid =", value, "uMemberPid");
            return (Criteria) this;
        }

        public Criteria andUMemberPidNotEqualTo(Integer value) {
            addCriterion("u_member_pid <>", value, "uMemberPid");
            return (Criteria) this;
        }

        public Criteria andUMemberPidGreaterThan(Integer value) {
            addCriterion("u_member_pid >", value, "uMemberPid");
            return (Criteria) this;
        }

        public Criteria andUMemberPidGreaterThanOrEqualTo(Integer value) {
            addCriterion("u_member_pid >=", value, "uMemberPid");
            return (Criteria) this;
        }

        public Criteria andUMemberPidLessThan(Integer value) {
            addCriterion("u_member_pid <", value, "uMemberPid");
            return (Criteria) this;
        }

        public Criteria andUMemberPidLessThanOrEqualTo(Integer value) {
            addCriterion("u_member_pid <=", value, "uMemberPid");
            return (Criteria) this;
        }

        public Criteria andUMemberPidIn(List<Integer> values) {
            addCriterion("u_member_pid in", values, "uMemberPid");
            return (Criteria) this;
        }

        public Criteria andUMemberPidNotIn(List<Integer> values) {
            addCriterion("u_member_pid not in", values, "uMemberPid");
            return (Criteria) this;
        }

        public Criteria andUMemberPidBetween(Integer value1, Integer value2) {
            addCriterion("u_member_pid between", value1, value2, "uMemberPid");
            return (Criteria) this;
        }

        public Criteria andUMemberPidNotBetween(Integer value1, Integer value2) {
            addCriterion("u_member_pid not between", value1, value2, "uMemberPid");
            return (Criteria) this;
        }

        public Criteria andUMemberCidIsNull() {
            addCriterion("u_member_cid is null");
            return (Criteria) this;
        }

        public Criteria andUMemberCidIsNotNull() {
            addCriterion("u_member_cid is not null");
            return (Criteria) this;
        }

        public Criteria andUMemberCidEqualTo(Integer value) {
            addCriterion("u_member_cid =", value, "uMemberCid");
            return (Criteria) this;
        }

        public Criteria andUMemberCidNotEqualTo(Integer value) {
            addCriterion("u_member_cid <>", value, "uMemberCid");
            return (Criteria) this;
        }

        public Criteria andUMemberCidGreaterThan(Integer value) {
            addCriterion("u_member_cid >", value, "uMemberCid");
            return (Criteria) this;
        }

        public Criteria andUMemberCidGreaterThanOrEqualTo(Integer value) {
            addCriterion("u_member_cid >=", value, "uMemberCid");
            return (Criteria) this;
        }

        public Criteria andUMemberCidLessThan(Integer value) {
            addCriterion("u_member_cid <", value, "uMemberCid");
            return (Criteria) this;
        }

        public Criteria andUMemberCidLessThanOrEqualTo(Integer value) {
            addCriterion("u_member_cid <=", value, "uMemberCid");
            return (Criteria) this;
        }

        public Criteria andUMemberCidIn(List<Integer> values) {
            addCriterion("u_member_cid in", values, "uMemberCid");
            return (Criteria) this;
        }

        public Criteria andUMemberCidNotIn(List<Integer> values) {
            addCriterion("u_member_cid not in", values, "uMemberCid");
            return (Criteria) this;
        }

        public Criteria andUMemberCidBetween(Integer value1, Integer value2) {
            addCriterion("u_member_cid between", value1, value2, "uMemberCid");
            return (Criteria) this;
        }

        public Criteria andUMemberCidNotBetween(Integer value1, Integer value2) {
            addCriterion("u_member_cid not between", value1, value2, "uMemberCid");
            return (Criteria) this;
        }

        public Criteria andUMemberAidIsNull() {
            addCriterion("u_member_aid is null");
            return (Criteria) this;
        }

        public Criteria andUMemberAidIsNotNull() {
            addCriterion("u_member_aid is not null");
            return (Criteria) this;
        }

        public Criteria andUMemberAidEqualTo(Integer value) {
            addCriterion("u_member_aid =", value, "uMemberAid");
            return (Criteria) this;
        }

        public Criteria andUMemberAidNotEqualTo(Integer value) {
            addCriterion("u_member_aid <>", value, "uMemberAid");
            return (Criteria) this;
        }

        public Criteria andUMemberAidGreaterThan(Integer value) {
            addCriterion("u_member_aid >", value, "uMemberAid");
            return (Criteria) this;
        }

        public Criteria andUMemberAidGreaterThanOrEqualTo(Integer value) {
            addCriterion("u_member_aid >=", value, "uMemberAid");
            return (Criteria) this;
        }

        public Criteria andUMemberAidLessThan(Integer value) {
            addCriterion("u_member_aid <", value, "uMemberAid");
            return (Criteria) this;
        }

        public Criteria andUMemberAidLessThanOrEqualTo(Integer value) {
            addCriterion("u_member_aid <=", value, "uMemberAid");
            return (Criteria) this;
        }

        public Criteria andUMemberAidIn(List<Integer> values) {
            addCriterion("u_member_aid in", values, "uMemberAid");
            return (Criteria) this;
        }

        public Criteria andUMemberAidNotIn(List<Integer> values) {
            addCriterion("u_member_aid not in", values, "uMemberAid");
            return (Criteria) this;
        }

        public Criteria andUMemberAidBetween(Integer value1, Integer value2) {
            addCriterion("u_member_aid between", value1, value2, "uMemberAid");
            return (Criteria) this;
        }

        public Criteria andUMemberAidNotBetween(Integer value1, Integer value2) {
            addCriterion("u_member_aid not between", value1, value2, "uMemberAid");
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