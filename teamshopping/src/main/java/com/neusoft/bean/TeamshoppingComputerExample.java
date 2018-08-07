package com.neusoft.bean;

import java.util.ArrayList;
import java.util.List;

public class TeamshoppingComputerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TeamshoppingComputerExample() {
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

        public Criteria andTsComputerIdIsNull() {
            addCriterion("ts_computer_id is null");
            return (Criteria) this;
        }

        public Criteria andTsComputerIdIsNotNull() {
            addCriterion("ts_computer_id is not null");
            return (Criteria) this;
        }

        public Criteria andTsComputerIdEqualTo(Integer value) {
            addCriterion("ts_computer_id =", value, "tsComputerId");
            return (Criteria) this;
        }

        public Criteria andTsComputerIdNotEqualTo(Integer value) {
            addCriterion("ts_computer_id <>", value, "tsComputerId");
            return (Criteria) this;
        }

        public Criteria andTsComputerIdGreaterThan(Integer value) {
            addCriterion("ts_computer_id >", value, "tsComputerId");
            return (Criteria) this;
        }

        public Criteria andTsComputerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ts_computer_id >=", value, "tsComputerId");
            return (Criteria) this;
        }

        public Criteria andTsComputerIdLessThan(Integer value) {
            addCriterion("ts_computer_id <", value, "tsComputerId");
            return (Criteria) this;
        }

        public Criteria andTsComputerIdLessThanOrEqualTo(Integer value) {
            addCriterion("ts_computer_id <=", value, "tsComputerId");
            return (Criteria) this;
        }

        public Criteria andTsComputerIdIn(List<Integer> values) {
            addCriterion("ts_computer_id in", values, "tsComputerId");
            return (Criteria) this;
        }

        public Criteria andTsComputerIdNotIn(List<Integer> values) {
            addCriterion("ts_computer_id not in", values, "tsComputerId");
            return (Criteria) this;
        }

        public Criteria andTsComputerIdBetween(Integer value1, Integer value2) {
            addCriterion("ts_computer_id between", value1, value2, "tsComputerId");
            return (Criteria) this;
        }

        public Criteria andTsComputerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ts_computer_id not between", value1, value2, "tsComputerId");
            return (Criteria) this;
        }

        public Criteria andTsComputerBrandIsNull() {
            addCriterion("ts_computer_brand is null");
            return (Criteria) this;
        }

        public Criteria andTsComputerBrandIsNotNull() {
            addCriterion("ts_computer_brand is not null");
            return (Criteria) this;
        }

        public Criteria andTsComputerBrandEqualTo(String value) {
            addCriterion("ts_computer_brand =", value, "tsComputerBrand");
            return (Criteria) this;
        }

        public Criteria andTsComputerBrandNotEqualTo(String value) {
            addCriterion("ts_computer_brand <>", value, "tsComputerBrand");
            return (Criteria) this;
        }

        public Criteria andTsComputerBrandGreaterThan(String value) {
            addCriterion("ts_computer_brand >", value, "tsComputerBrand");
            return (Criteria) this;
        }

        public Criteria andTsComputerBrandGreaterThanOrEqualTo(String value) {
            addCriterion("ts_computer_brand >=", value, "tsComputerBrand");
            return (Criteria) this;
        }

        public Criteria andTsComputerBrandLessThan(String value) {
            addCriterion("ts_computer_brand <", value, "tsComputerBrand");
            return (Criteria) this;
        }

        public Criteria andTsComputerBrandLessThanOrEqualTo(String value) {
            addCriterion("ts_computer_brand <=", value, "tsComputerBrand");
            return (Criteria) this;
        }

        public Criteria andTsComputerBrandLike(String value) {
            addCriterion("ts_computer_brand like", value, "tsComputerBrand");
            return (Criteria) this;
        }

        public Criteria andTsComputerBrandNotLike(String value) {
            addCriterion("ts_computer_brand not like", value, "tsComputerBrand");
            return (Criteria) this;
        }

        public Criteria andTsComputerBrandIn(List<String> values) {
            addCriterion("ts_computer_brand in", values, "tsComputerBrand");
            return (Criteria) this;
        }

        public Criteria andTsComputerBrandNotIn(List<String> values) {
            addCriterion("ts_computer_brand not in", values, "tsComputerBrand");
            return (Criteria) this;
        }

        public Criteria andTsComputerBrandBetween(String value1, String value2) {
            addCriterion("ts_computer_brand between", value1, value2, "tsComputerBrand");
            return (Criteria) this;
        }

        public Criteria andTsComputerBrandNotBetween(String value1, String value2) {
            addCriterion("ts_computer_brand not between", value1, value2, "tsComputerBrand");
            return (Criteria) this;
        }

        public Criteria andTsComputerModelIsNull() {
            addCriterion("ts_computer_model is null");
            return (Criteria) this;
        }

        public Criteria andTsComputerModelIsNotNull() {
            addCriterion("ts_computer_model is not null");
            return (Criteria) this;
        }

        public Criteria andTsComputerModelEqualTo(String value) {
            addCriterion("ts_computer_model =", value, "tsComputerModel");
            return (Criteria) this;
        }

        public Criteria andTsComputerModelNotEqualTo(String value) {
            addCriterion("ts_computer_model <>", value, "tsComputerModel");
            return (Criteria) this;
        }

        public Criteria andTsComputerModelGreaterThan(String value) {
            addCriterion("ts_computer_model >", value, "tsComputerModel");
            return (Criteria) this;
        }

        public Criteria andTsComputerModelGreaterThanOrEqualTo(String value) {
            addCriterion("ts_computer_model >=", value, "tsComputerModel");
            return (Criteria) this;
        }

        public Criteria andTsComputerModelLessThan(String value) {
            addCriterion("ts_computer_model <", value, "tsComputerModel");
            return (Criteria) this;
        }

        public Criteria andTsComputerModelLessThanOrEqualTo(String value) {
            addCriterion("ts_computer_model <=", value, "tsComputerModel");
            return (Criteria) this;
        }

        public Criteria andTsComputerModelLike(String value) {
            addCriterion("ts_computer_model like", value, "tsComputerModel");
            return (Criteria) this;
        }

        public Criteria andTsComputerModelNotLike(String value) {
            addCriterion("ts_computer_model not like", value, "tsComputerModel");
            return (Criteria) this;
        }

        public Criteria andTsComputerModelIn(List<String> values) {
            addCriterion("ts_computer_model in", values, "tsComputerModel");
            return (Criteria) this;
        }

        public Criteria andTsComputerModelNotIn(List<String> values) {
            addCriterion("ts_computer_model not in", values, "tsComputerModel");
            return (Criteria) this;
        }

        public Criteria andTsComputerModelBetween(String value1, String value2) {
            addCriterion("ts_computer_model between", value1, value2, "tsComputerModel");
            return (Criteria) this;
        }

        public Criteria andTsComputerModelNotBetween(String value1, String value2) {
            addCriterion("ts_computer_model not between", value1, value2, "tsComputerModel");
            return (Criteria) this;
        }

        public Criteria andTsComputerTypeIsNull() {
            addCriterion("ts_computer_type is null");
            return (Criteria) this;
        }

        public Criteria andTsComputerTypeIsNotNull() {
            addCriterion("ts_computer_type is not null");
            return (Criteria) this;
        }

        public Criteria andTsComputerTypeEqualTo(String value) {
            addCriterion("ts_computer_type =", value, "tsComputerType");
            return (Criteria) this;
        }

        public Criteria andTsComputerTypeNotEqualTo(String value) {
            addCriterion("ts_computer_type <>", value, "tsComputerType");
            return (Criteria) this;
        }

        public Criteria andTsComputerTypeGreaterThan(String value) {
            addCriterion("ts_computer_type >", value, "tsComputerType");
            return (Criteria) this;
        }

        public Criteria andTsComputerTypeGreaterThanOrEqualTo(String value) {
            addCriterion("ts_computer_type >=", value, "tsComputerType");
            return (Criteria) this;
        }

        public Criteria andTsComputerTypeLessThan(String value) {
            addCriterion("ts_computer_type <", value, "tsComputerType");
            return (Criteria) this;
        }

        public Criteria andTsComputerTypeLessThanOrEqualTo(String value) {
            addCriterion("ts_computer_type <=", value, "tsComputerType");
            return (Criteria) this;
        }

        public Criteria andTsComputerTypeLike(String value) {
            addCriterion("ts_computer_type like", value, "tsComputerType");
            return (Criteria) this;
        }

        public Criteria andTsComputerTypeNotLike(String value) {
            addCriterion("ts_computer_type not like", value, "tsComputerType");
            return (Criteria) this;
        }

        public Criteria andTsComputerTypeIn(List<String> values) {
            addCriterion("ts_computer_type in", values, "tsComputerType");
            return (Criteria) this;
        }

        public Criteria andTsComputerTypeNotIn(List<String> values) {
            addCriterion("ts_computer_type not in", values, "tsComputerType");
            return (Criteria) this;
        }

        public Criteria andTsComputerTypeBetween(String value1, String value2) {
            addCriterion("ts_computer_type between", value1, value2, "tsComputerType");
            return (Criteria) this;
        }

        public Criteria andTsComputerTypeNotBetween(String value1, String value2) {
            addCriterion("ts_computer_type not between", value1, value2, "tsComputerType");
            return (Criteria) this;
        }

        public Criteria andTsComputerSizeIsNull() {
            addCriterion("ts_computer_size is null");
            return (Criteria) this;
        }

        public Criteria andTsComputerSizeIsNotNull() {
            addCriterion("ts_computer_size is not null");
            return (Criteria) this;
        }

        public Criteria andTsComputerSizeEqualTo(String value) {
            addCriterion("ts_computer_size =", value, "tsComputerSize");
            return (Criteria) this;
        }

        public Criteria andTsComputerSizeNotEqualTo(String value) {
            addCriterion("ts_computer_size <>", value, "tsComputerSize");
            return (Criteria) this;
        }

        public Criteria andTsComputerSizeGreaterThan(String value) {
            addCriterion("ts_computer_size >", value, "tsComputerSize");
            return (Criteria) this;
        }

        public Criteria andTsComputerSizeGreaterThanOrEqualTo(String value) {
            addCriterion("ts_computer_size >=", value, "tsComputerSize");
            return (Criteria) this;
        }

        public Criteria andTsComputerSizeLessThan(String value) {
            addCriterion("ts_computer_size <", value, "tsComputerSize");
            return (Criteria) this;
        }

        public Criteria andTsComputerSizeLessThanOrEqualTo(String value) {
            addCriterion("ts_computer_size <=", value, "tsComputerSize");
            return (Criteria) this;
        }

        public Criteria andTsComputerSizeLike(String value) {
            addCriterion("ts_computer_size like", value, "tsComputerSize");
            return (Criteria) this;
        }

        public Criteria andTsComputerSizeNotLike(String value) {
            addCriterion("ts_computer_size not like", value, "tsComputerSize");
            return (Criteria) this;
        }

        public Criteria andTsComputerSizeIn(List<String> values) {
            addCriterion("ts_computer_size in", values, "tsComputerSize");
            return (Criteria) this;
        }

        public Criteria andTsComputerSizeNotIn(List<String> values) {
            addCriterion("ts_computer_size not in", values, "tsComputerSize");
            return (Criteria) this;
        }

        public Criteria andTsComputerSizeBetween(String value1, String value2) {
            addCriterion("ts_computer_size between", value1, value2, "tsComputerSize");
            return (Criteria) this;
        }

        public Criteria andTsComputerSizeNotBetween(String value1, String value2) {
            addCriterion("ts_computer_size not between", value1, value2, "tsComputerSize");
            return (Criteria) this;
        }

        public Criteria andTsComputerColorIsNull() {
            addCriterion("ts_computer_color is null");
            return (Criteria) this;
        }

        public Criteria andTsComputerColorIsNotNull() {
            addCriterion("ts_computer_color is not null");
            return (Criteria) this;
        }

        public Criteria andTsComputerColorEqualTo(String value) {
            addCriterion("ts_computer_color =", value, "tsComputerColor");
            return (Criteria) this;
        }

        public Criteria andTsComputerColorNotEqualTo(String value) {
            addCriterion("ts_computer_color <>", value, "tsComputerColor");
            return (Criteria) this;
        }

        public Criteria andTsComputerColorGreaterThan(String value) {
            addCriterion("ts_computer_color >", value, "tsComputerColor");
            return (Criteria) this;
        }

        public Criteria andTsComputerColorGreaterThanOrEqualTo(String value) {
            addCriterion("ts_computer_color >=", value, "tsComputerColor");
            return (Criteria) this;
        }

        public Criteria andTsComputerColorLessThan(String value) {
            addCriterion("ts_computer_color <", value, "tsComputerColor");
            return (Criteria) this;
        }

        public Criteria andTsComputerColorLessThanOrEqualTo(String value) {
            addCriterion("ts_computer_color <=", value, "tsComputerColor");
            return (Criteria) this;
        }

        public Criteria andTsComputerColorLike(String value) {
            addCriterion("ts_computer_color like", value, "tsComputerColor");
            return (Criteria) this;
        }

        public Criteria andTsComputerColorNotLike(String value) {
            addCriterion("ts_computer_color not like", value, "tsComputerColor");
            return (Criteria) this;
        }

        public Criteria andTsComputerColorIn(List<String> values) {
            addCriterion("ts_computer_color in", values, "tsComputerColor");
            return (Criteria) this;
        }

        public Criteria andTsComputerColorNotIn(List<String> values) {
            addCriterion("ts_computer_color not in", values, "tsComputerColor");
            return (Criteria) this;
        }

        public Criteria andTsComputerColorBetween(String value1, String value2) {
            addCriterion("ts_computer_color between", value1, value2, "tsComputerColor");
            return (Criteria) this;
        }

        public Criteria andTsComputerColorNotBetween(String value1, String value2) {
            addCriterion("ts_computer_color not between", value1, value2, "tsComputerColor");
            return (Criteria) this;
        }

        public Criteria andTsComputerKernelIsNull() {
            addCriterion("ts_computer_kernel is null");
            return (Criteria) this;
        }

        public Criteria andTsComputerKernelIsNotNull() {
            addCriterion("ts_computer_kernel is not null");
            return (Criteria) this;
        }

        public Criteria andTsComputerKernelEqualTo(String value) {
            addCriterion("ts_computer_kernel =", value, "tsComputerKernel");
            return (Criteria) this;
        }

        public Criteria andTsComputerKernelNotEqualTo(String value) {
            addCriterion("ts_computer_kernel <>", value, "tsComputerKernel");
            return (Criteria) this;
        }

        public Criteria andTsComputerKernelGreaterThan(String value) {
            addCriterion("ts_computer_kernel >", value, "tsComputerKernel");
            return (Criteria) this;
        }

        public Criteria andTsComputerKernelGreaterThanOrEqualTo(String value) {
            addCriterion("ts_computer_kernel >=", value, "tsComputerKernel");
            return (Criteria) this;
        }

        public Criteria andTsComputerKernelLessThan(String value) {
            addCriterion("ts_computer_kernel <", value, "tsComputerKernel");
            return (Criteria) this;
        }

        public Criteria andTsComputerKernelLessThanOrEqualTo(String value) {
            addCriterion("ts_computer_kernel <=", value, "tsComputerKernel");
            return (Criteria) this;
        }

        public Criteria andTsComputerKernelLike(String value) {
            addCriterion("ts_computer_kernel like", value, "tsComputerKernel");
            return (Criteria) this;
        }

        public Criteria andTsComputerKernelNotLike(String value) {
            addCriterion("ts_computer_kernel not like", value, "tsComputerKernel");
            return (Criteria) this;
        }

        public Criteria andTsComputerKernelIn(List<String> values) {
            addCriterion("ts_computer_kernel in", values, "tsComputerKernel");
            return (Criteria) this;
        }

        public Criteria andTsComputerKernelNotIn(List<String> values) {
            addCriterion("ts_computer_kernel not in", values, "tsComputerKernel");
            return (Criteria) this;
        }

        public Criteria andTsComputerKernelBetween(String value1, String value2) {
            addCriterion("ts_computer_kernel between", value1, value2, "tsComputerKernel");
            return (Criteria) this;
        }

        public Criteria andTsComputerKernelNotBetween(String value1, String value2) {
            addCriterion("ts_computer_kernel not between", value1, value2, "tsComputerKernel");
            return (Criteria) this;
        }

        public Criteria andTsComputerAudioIsNull() {
            addCriterion("ts_computer_audio is null");
            return (Criteria) this;
        }

        public Criteria andTsComputerAudioIsNotNull() {
            addCriterion("ts_computer_audio is not null");
            return (Criteria) this;
        }

        public Criteria andTsComputerAudioEqualTo(String value) {
            addCriterion("ts_computer_audio =", value, "tsComputerAudio");
            return (Criteria) this;
        }

        public Criteria andTsComputerAudioNotEqualTo(String value) {
            addCriterion("ts_computer_audio <>", value, "tsComputerAudio");
            return (Criteria) this;
        }

        public Criteria andTsComputerAudioGreaterThan(String value) {
            addCriterion("ts_computer_audio >", value, "tsComputerAudio");
            return (Criteria) this;
        }

        public Criteria andTsComputerAudioGreaterThanOrEqualTo(String value) {
            addCriterion("ts_computer_audio >=", value, "tsComputerAudio");
            return (Criteria) this;
        }

        public Criteria andTsComputerAudioLessThan(String value) {
            addCriterion("ts_computer_audio <", value, "tsComputerAudio");
            return (Criteria) this;
        }

        public Criteria andTsComputerAudioLessThanOrEqualTo(String value) {
            addCriterion("ts_computer_audio <=", value, "tsComputerAudio");
            return (Criteria) this;
        }

        public Criteria andTsComputerAudioLike(String value) {
            addCriterion("ts_computer_audio like", value, "tsComputerAudio");
            return (Criteria) this;
        }

        public Criteria andTsComputerAudioNotLike(String value) {
            addCriterion("ts_computer_audio not like", value, "tsComputerAudio");
            return (Criteria) this;
        }

        public Criteria andTsComputerAudioIn(List<String> values) {
            addCriterion("ts_computer_audio in", values, "tsComputerAudio");
            return (Criteria) this;
        }

        public Criteria andTsComputerAudioNotIn(List<String> values) {
            addCriterion("ts_computer_audio not in", values, "tsComputerAudio");
            return (Criteria) this;
        }

        public Criteria andTsComputerAudioBetween(String value1, String value2) {
            addCriterion("ts_computer_audio between", value1, value2, "tsComputerAudio");
            return (Criteria) this;
        }

        public Criteria andTsComputerAudioNotBetween(String value1, String value2) {
            addCriterion("ts_computer_audio not between", value1, value2, "tsComputerAudio");
            return (Criteria) this;
        }

        public Criteria andTsComputerVideocardIsNull() {
            addCriterion("ts_computer_videocard is null");
            return (Criteria) this;
        }

        public Criteria andTsComputerVideocardIsNotNull() {
            addCriterion("ts_computer_videocard is not null");
            return (Criteria) this;
        }

        public Criteria andTsComputerVideocardEqualTo(String value) {
            addCriterion("ts_computer_videocard =", value, "tsComputerVideocard");
            return (Criteria) this;
        }

        public Criteria andTsComputerVideocardNotEqualTo(String value) {
            addCriterion("ts_computer_videocard <>", value, "tsComputerVideocard");
            return (Criteria) this;
        }

        public Criteria andTsComputerVideocardGreaterThan(String value) {
            addCriterion("ts_computer_videocard >", value, "tsComputerVideocard");
            return (Criteria) this;
        }

        public Criteria andTsComputerVideocardGreaterThanOrEqualTo(String value) {
            addCriterion("ts_computer_videocard >=", value, "tsComputerVideocard");
            return (Criteria) this;
        }

        public Criteria andTsComputerVideocardLessThan(String value) {
            addCriterion("ts_computer_videocard <", value, "tsComputerVideocard");
            return (Criteria) this;
        }

        public Criteria andTsComputerVideocardLessThanOrEqualTo(String value) {
            addCriterion("ts_computer_videocard <=", value, "tsComputerVideocard");
            return (Criteria) this;
        }

        public Criteria andTsComputerVideocardLike(String value) {
            addCriterion("ts_computer_videocard like", value, "tsComputerVideocard");
            return (Criteria) this;
        }

        public Criteria andTsComputerVideocardNotLike(String value) {
            addCriterion("ts_computer_videocard not like", value, "tsComputerVideocard");
            return (Criteria) this;
        }

        public Criteria andTsComputerVideocardIn(List<String> values) {
            addCriterion("ts_computer_videocard in", values, "tsComputerVideocard");
            return (Criteria) this;
        }

        public Criteria andTsComputerVideocardNotIn(List<String> values) {
            addCriterion("ts_computer_videocard not in", values, "tsComputerVideocard");
            return (Criteria) this;
        }

        public Criteria andTsComputerVideocardBetween(String value1, String value2) {
            addCriterion("ts_computer_videocard between", value1, value2, "tsComputerVideocard");
            return (Criteria) this;
        }

        public Criteria andTsComputerVideocardNotBetween(String value1, String value2) {
            addCriterion("ts_computer_videocard not between", value1, value2, "tsComputerVideocard");
            return (Criteria) this;
        }

        public Criteria andTsComputerMemoryIsNull() {
            addCriterion("ts_computer_memory is null");
            return (Criteria) this;
        }

        public Criteria andTsComputerMemoryIsNotNull() {
            addCriterion("ts_computer_memory is not null");
            return (Criteria) this;
        }

        public Criteria andTsComputerMemoryEqualTo(String value) {
            addCriterion("ts_computer_memory =", value, "tsComputerMemory");
            return (Criteria) this;
        }

        public Criteria andTsComputerMemoryNotEqualTo(String value) {
            addCriterion("ts_computer_memory <>", value, "tsComputerMemory");
            return (Criteria) this;
        }

        public Criteria andTsComputerMemoryGreaterThan(String value) {
            addCriterion("ts_computer_memory >", value, "tsComputerMemory");
            return (Criteria) this;
        }

        public Criteria andTsComputerMemoryGreaterThanOrEqualTo(String value) {
            addCriterion("ts_computer_memory >=", value, "tsComputerMemory");
            return (Criteria) this;
        }

        public Criteria andTsComputerMemoryLessThan(String value) {
            addCriterion("ts_computer_memory <", value, "tsComputerMemory");
            return (Criteria) this;
        }

        public Criteria andTsComputerMemoryLessThanOrEqualTo(String value) {
            addCriterion("ts_computer_memory <=", value, "tsComputerMemory");
            return (Criteria) this;
        }

        public Criteria andTsComputerMemoryLike(String value) {
            addCriterion("ts_computer_memory like", value, "tsComputerMemory");
            return (Criteria) this;
        }

        public Criteria andTsComputerMemoryNotLike(String value) {
            addCriterion("ts_computer_memory not like", value, "tsComputerMemory");
            return (Criteria) this;
        }

        public Criteria andTsComputerMemoryIn(List<String> values) {
            addCriterion("ts_computer_memory in", values, "tsComputerMemory");
            return (Criteria) this;
        }

        public Criteria andTsComputerMemoryNotIn(List<String> values) {
            addCriterion("ts_computer_memory not in", values, "tsComputerMemory");
            return (Criteria) this;
        }

        public Criteria andTsComputerMemoryBetween(String value1, String value2) {
            addCriterion("ts_computer_memory between", value1, value2, "tsComputerMemory");
            return (Criteria) this;
        }

        public Criteria andTsComputerMemoryNotBetween(String value1, String value2) {
            addCriterion("ts_computer_memory not between", value1, value2, "tsComputerMemory");
            return (Criteria) this;
        }

        public Criteria andTsComputerPixelIsNull() {
            addCriterion("ts_computer_pixel is null");
            return (Criteria) this;
        }

        public Criteria andTsComputerPixelIsNotNull() {
            addCriterion("ts_computer_pixel is not null");
            return (Criteria) this;
        }

        public Criteria andTsComputerPixelEqualTo(String value) {
            addCriterion("ts_computer_pixel =", value, "tsComputerPixel");
            return (Criteria) this;
        }

        public Criteria andTsComputerPixelNotEqualTo(String value) {
            addCriterion("ts_computer_pixel <>", value, "tsComputerPixel");
            return (Criteria) this;
        }

        public Criteria andTsComputerPixelGreaterThan(String value) {
            addCriterion("ts_computer_pixel >", value, "tsComputerPixel");
            return (Criteria) this;
        }

        public Criteria andTsComputerPixelGreaterThanOrEqualTo(String value) {
            addCriterion("ts_computer_pixel >=", value, "tsComputerPixel");
            return (Criteria) this;
        }

        public Criteria andTsComputerPixelLessThan(String value) {
            addCriterion("ts_computer_pixel <", value, "tsComputerPixel");
            return (Criteria) this;
        }

        public Criteria andTsComputerPixelLessThanOrEqualTo(String value) {
            addCriterion("ts_computer_pixel <=", value, "tsComputerPixel");
            return (Criteria) this;
        }

        public Criteria andTsComputerPixelLike(String value) {
            addCriterion("ts_computer_pixel like", value, "tsComputerPixel");
            return (Criteria) this;
        }

        public Criteria andTsComputerPixelNotLike(String value) {
            addCriterion("ts_computer_pixel not like", value, "tsComputerPixel");
            return (Criteria) this;
        }

        public Criteria andTsComputerPixelIn(List<String> values) {
            addCriterion("ts_computer_pixel in", values, "tsComputerPixel");
            return (Criteria) this;
        }

        public Criteria andTsComputerPixelNotIn(List<String> values) {
            addCriterion("ts_computer_pixel not in", values, "tsComputerPixel");
            return (Criteria) this;
        }

        public Criteria andTsComputerPixelBetween(String value1, String value2) {
            addCriterion("ts_computer_pixel between", value1, value2, "tsComputerPixel");
            return (Criteria) this;
        }

        public Criteria andTsComputerPixelNotBetween(String value1, String value2) {
            addCriterion("ts_computer_pixel not between", value1, value2, "tsComputerPixel");
            return (Criteria) this;
        }

        public Criteria andTsComputerGuaranteeIsNull() {
            addCriterion("ts_computer_guarantee is null");
            return (Criteria) this;
        }

        public Criteria andTsComputerGuaranteeIsNotNull() {
            addCriterion("ts_computer_guarantee is not null");
            return (Criteria) this;
        }

        public Criteria andTsComputerGuaranteeEqualTo(String value) {
            addCriterion("ts_computer_guarantee =", value, "tsComputerGuarantee");
            return (Criteria) this;
        }

        public Criteria andTsComputerGuaranteeNotEqualTo(String value) {
            addCriterion("ts_computer_guarantee <>", value, "tsComputerGuarantee");
            return (Criteria) this;
        }

        public Criteria andTsComputerGuaranteeGreaterThan(String value) {
            addCriterion("ts_computer_guarantee >", value, "tsComputerGuarantee");
            return (Criteria) this;
        }

        public Criteria andTsComputerGuaranteeGreaterThanOrEqualTo(String value) {
            addCriterion("ts_computer_guarantee >=", value, "tsComputerGuarantee");
            return (Criteria) this;
        }

        public Criteria andTsComputerGuaranteeLessThan(String value) {
            addCriterion("ts_computer_guarantee <", value, "tsComputerGuarantee");
            return (Criteria) this;
        }

        public Criteria andTsComputerGuaranteeLessThanOrEqualTo(String value) {
            addCriterion("ts_computer_guarantee <=", value, "tsComputerGuarantee");
            return (Criteria) this;
        }

        public Criteria andTsComputerGuaranteeLike(String value) {
            addCriterion("ts_computer_guarantee like", value, "tsComputerGuarantee");
            return (Criteria) this;
        }

        public Criteria andTsComputerGuaranteeNotLike(String value) {
            addCriterion("ts_computer_guarantee not like", value, "tsComputerGuarantee");
            return (Criteria) this;
        }

        public Criteria andTsComputerGuaranteeIn(List<String> values) {
            addCriterion("ts_computer_guarantee in", values, "tsComputerGuarantee");
            return (Criteria) this;
        }

        public Criteria andTsComputerGuaranteeNotIn(List<String> values) {
            addCriterion("ts_computer_guarantee not in", values, "tsComputerGuarantee");
            return (Criteria) this;
        }

        public Criteria andTsComputerGuaranteeBetween(String value1, String value2) {
            addCriterion("ts_computer_guarantee between", value1, value2, "tsComputerGuarantee");
            return (Criteria) this;
        }

        public Criteria andTsComputerGuaranteeNotBetween(String value1, String value2) {
            addCriterion("ts_computer_guarantee not between", value1, value2, "tsComputerGuarantee");
            return (Criteria) this;
        }

        public Criteria andTsComputerSystemIsNull() {
            addCriterion("ts_computer_system is null");
            return (Criteria) this;
        }

        public Criteria andTsComputerSystemIsNotNull() {
            addCriterion("ts_computer_system is not null");
            return (Criteria) this;
        }

        public Criteria andTsComputerSystemEqualTo(String value) {
            addCriterion("ts_computer_system =", value, "tsComputerSystem");
            return (Criteria) this;
        }

        public Criteria andTsComputerSystemNotEqualTo(String value) {
            addCriterion("ts_computer_system <>", value, "tsComputerSystem");
            return (Criteria) this;
        }

        public Criteria andTsComputerSystemGreaterThan(String value) {
            addCriterion("ts_computer_system >", value, "tsComputerSystem");
            return (Criteria) this;
        }

        public Criteria andTsComputerSystemGreaterThanOrEqualTo(String value) {
            addCriterion("ts_computer_system >=", value, "tsComputerSystem");
            return (Criteria) this;
        }

        public Criteria andTsComputerSystemLessThan(String value) {
            addCriterion("ts_computer_system <", value, "tsComputerSystem");
            return (Criteria) this;
        }

        public Criteria andTsComputerSystemLessThanOrEqualTo(String value) {
            addCriterion("ts_computer_system <=", value, "tsComputerSystem");
            return (Criteria) this;
        }

        public Criteria andTsComputerSystemLike(String value) {
            addCriterion("ts_computer_system like", value, "tsComputerSystem");
            return (Criteria) this;
        }

        public Criteria andTsComputerSystemNotLike(String value) {
            addCriterion("ts_computer_system not like", value, "tsComputerSystem");
            return (Criteria) this;
        }

        public Criteria andTsComputerSystemIn(List<String> values) {
            addCriterion("ts_computer_system in", values, "tsComputerSystem");
            return (Criteria) this;
        }

        public Criteria andTsComputerSystemNotIn(List<String> values) {
            addCriterion("ts_computer_system not in", values, "tsComputerSystem");
            return (Criteria) this;
        }

        public Criteria andTsComputerSystemBetween(String value1, String value2) {
            addCriterion("ts_computer_system between", value1, value2, "tsComputerSystem");
            return (Criteria) this;
        }

        public Criteria andTsComputerSystemNotBetween(String value1, String value2) {
            addCriterion("ts_computer_system not between", value1, value2, "tsComputerSystem");
            return (Criteria) this;
        }

        public Criteria andTsComputerPictureIsNull() {
            addCriterion("ts_computer_picture is null");
            return (Criteria) this;
        }

        public Criteria andTsComputerPictureIsNotNull() {
            addCriterion("ts_computer_picture is not null");
            return (Criteria) this;
        }

        public Criteria andTsComputerPictureEqualTo(String value) {
            addCriterion("ts_computer_picture =", value, "tsComputerPicture");
            return (Criteria) this;
        }

        public Criteria andTsComputerPictureNotEqualTo(String value) {
            addCriterion("ts_computer_picture <>", value, "tsComputerPicture");
            return (Criteria) this;
        }

        public Criteria andTsComputerPictureGreaterThan(String value) {
            addCriterion("ts_computer_picture >", value, "tsComputerPicture");
            return (Criteria) this;
        }

        public Criteria andTsComputerPictureGreaterThanOrEqualTo(String value) {
            addCriterion("ts_computer_picture >=", value, "tsComputerPicture");
            return (Criteria) this;
        }

        public Criteria andTsComputerPictureLessThan(String value) {
            addCriterion("ts_computer_picture <", value, "tsComputerPicture");
            return (Criteria) this;
        }

        public Criteria andTsComputerPictureLessThanOrEqualTo(String value) {
            addCriterion("ts_computer_picture <=", value, "tsComputerPicture");
            return (Criteria) this;
        }

        public Criteria andTsComputerPictureLike(String value) {
            addCriterion("ts_computer_picture like", value, "tsComputerPicture");
            return (Criteria) this;
        }

        public Criteria andTsComputerPictureNotLike(String value) {
            addCriterion("ts_computer_picture not like", value, "tsComputerPicture");
            return (Criteria) this;
        }

        public Criteria andTsComputerPictureIn(List<String> values) {
            addCriterion("ts_computer_picture in", values, "tsComputerPicture");
            return (Criteria) this;
        }

        public Criteria andTsComputerPictureNotIn(List<String> values) {
            addCriterion("ts_computer_picture not in", values, "tsComputerPicture");
            return (Criteria) this;
        }

        public Criteria andTsComputerPictureBetween(String value1, String value2) {
            addCriterion("ts_computer_picture between", value1, value2, "tsComputerPicture");
            return (Criteria) this;
        }

        public Criteria andTsComputerPictureNotBetween(String value1, String value2) {
            addCriterion("ts_computer_picture not between", value1, value2, "tsComputerPicture");
            return (Criteria) this;
        }

        public Criteria andTsComputerNumberIsNull() {
            addCriterion("ts_computer_number is null");
            return (Criteria) this;
        }

        public Criteria andTsComputerNumberIsNotNull() {
            addCriterion("ts_computer_number is not null");
            return (Criteria) this;
        }

        public Criteria andTsComputerNumberEqualTo(Integer value) {
            addCriterion("ts_computer_number =", value, "tsComputerNumber");
            return (Criteria) this;
        }

        public Criteria andTsComputerNumberNotEqualTo(Integer value) {
            addCriterion("ts_computer_number <>", value, "tsComputerNumber");
            return (Criteria) this;
        }

        public Criteria andTsComputerNumberGreaterThan(Integer value) {
            addCriterion("ts_computer_number >", value, "tsComputerNumber");
            return (Criteria) this;
        }

        public Criteria andTsComputerNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("ts_computer_number >=", value, "tsComputerNumber");
            return (Criteria) this;
        }

        public Criteria andTsComputerNumberLessThan(Integer value) {
            addCriterion("ts_computer_number <", value, "tsComputerNumber");
            return (Criteria) this;
        }

        public Criteria andTsComputerNumberLessThanOrEqualTo(Integer value) {
            addCriterion("ts_computer_number <=", value, "tsComputerNumber");
            return (Criteria) this;
        }

        public Criteria andTsComputerNumberIn(List<Integer> values) {
            addCriterion("ts_computer_number in", values, "tsComputerNumber");
            return (Criteria) this;
        }

        public Criteria andTsComputerNumberNotIn(List<Integer> values) {
            addCriterion("ts_computer_number not in", values, "tsComputerNumber");
            return (Criteria) this;
        }

        public Criteria andTsComputerNumberBetween(Integer value1, Integer value2) {
            addCriterion("ts_computer_number between", value1, value2, "tsComputerNumber");
            return (Criteria) this;
        }

        public Criteria andTsComputerNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("ts_computer_number not between", value1, value2, "tsComputerNumber");
            return (Criteria) this;
        }

        public Criteria andTsComputerMoneyIsNull() {
            addCriterion("ts_computer_money is null");
            return (Criteria) this;
        }

        public Criteria andTsComputerMoneyIsNotNull() {
            addCriterion("ts_computer_money is not null");
            return (Criteria) this;
        }

        public Criteria andTsComputerMoneyEqualTo(Double value) {
            addCriterion("ts_computer_money =", value, "tsComputerMoney");
            return (Criteria) this;
        }

        public Criteria andTsComputerMoneyNotEqualTo(Double value) {
            addCriterion("ts_computer_money <>", value, "tsComputerMoney");
            return (Criteria) this;
        }

        public Criteria andTsComputerMoneyGreaterThan(Double value) {
            addCriterion("ts_computer_money >", value, "tsComputerMoney");
            return (Criteria) this;
        }

        public Criteria andTsComputerMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("ts_computer_money >=", value, "tsComputerMoney");
            return (Criteria) this;
        }

        public Criteria andTsComputerMoneyLessThan(Double value) {
            addCriterion("ts_computer_money <", value, "tsComputerMoney");
            return (Criteria) this;
        }

        public Criteria andTsComputerMoneyLessThanOrEqualTo(Double value) {
            addCriterion("ts_computer_money <=", value, "tsComputerMoney");
            return (Criteria) this;
        }

        public Criteria andTsComputerMoneyIn(List<Double> values) {
            addCriterion("ts_computer_money in", values, "tsComputerMoney");
            return (Criteria) this;
        }

        public Criteria andTsComputerMoneyNotIn(List<Double> values) {
            addCriterion("ts_computer_money not in", values, "tsComputerMoney");
            return (Criteria) this;
        }

        public Criteria andTsComputerMoneyBetween(Double value1, Double value2) {
            addCriterion("ts_computer_money between", value1, value2, "tsComputerMoney");
            return (Criteria) this;
        }

        public Criteria andTsComputerMoneyNotBetween(Double value1, Double value2) {
            addCriterion("ts_computer_money not between", value1, value2, "tsComputerMoney");
            return (Criteria) this;
        }

        public Criteria andTsComputerIntroduceIsNull() {
            addCriterion("ts_computer_introduce is null");
            return (Criteria) this;
        }

        public Criteria andTsComputerIntroduceIsNotNull() {
            addCriterion("ts_computer_introduce is not null");
            return (Criteria) this;
        }

        public Criteria andTsComputerIntroduceEqualTo(String value) {
            addCriterion("ts_computer_introduce =", value, "tsComputerIntroduce");
            return (Criteria) this;
        }

        public Criteria andTsComputerIntroduceNotEqualTo(String value) {
            addCriterion("ts_computer_introduce <>", value, "tsComputerIntroduce");
            return (Criteria) this;
        }

        public Criteria andTsComputerIntroduceGreaterThan(String value) {
            addCriterion("ts_computer_introduce >", value, "tsComputerIntroduce");
            return (Criteria) this;
        }

        public Criteria andTsComputerIntroduceGreaterThanOrEqualTo(String value) {
            addCriterion("ts_computer_introduce >=", value, "tsComputerIntroduce");
            return (Criteria) this;
        }

        public Criteria andTsComputerIntroduceLessThan(String value) {
            addCriterion("ts_computer_introduce <", value, "tsComputerIntroduce");
            return (Criteria) this;
        }

        public Criteria andTsComputerIntroduceLessThanOrEqualTo(String value) {
            addCriterion("ts_computer_introduce <=", value, "tsComputerIntroduce");
            return (Criteria) this;
        }

        public Criteria andTsComputerIntroduceLike(String value) {
            addCriterion("ts_computer_introduce like", value, "tsComputerIntroduce");
            return (Criteria) this;
        }

        public Criteria andTsComputerIntroduceNotLike(String value) {
            addCriterion("ts_computer_introduce not like", value, "tsComputerIntroduce");
            return (Criteria) this;
        }

        public Criteria andTsComputerIntroduceIn(List<String> values) {
            addCriterion("ts_computer_introduce in", values, "tsComputerIntroduce");
            return (Criteria) this;
        }

        public Criteria andTsComputerIntroduceNotIn(List<String> values) {
            addCriterion("ts_computer_introduce not in", values, "tsComputerIntroduce");
            return (Criteria) this;
        }

        public Criteria andTsComputerIntroduceBetween(String value1, String value2) {
            addCriterion("ts_computer_introduce between", value1, value2, "tsComputerIntroduce");
            return (Criteria) this;
        }

        public Criteria andTsComputerIntroduceNotBetween(String value1, String value2) {
            addCriterion("ts_computer_introduce not between", value1, value2, "tsComputerIntroduce");
            return (Criteria) this;
        }

        public Criteria andTsComputerStateIsNull() {
            addCriterion("ts_computer_state is null");
            return (Criteria) this;
        }

        public Criteria andTsComputerStateIsNotNull() {
            addCriterion("ts_computer_state is not null");
            return (Criteria) this;
        }

        public Criteria andTsComputerStateEqualTo(String value) {
            addCriterion("ts_computer_state =", value, "tsComputerState");
            return (Criteria) this;
        }

        public Criteria andTsComputerStateNotEqualTo(String value) {
            addCriterion("ts_computer_state <>", value, "tsComputerState");
            return (Criteria) this;
        }

        public Criteria andTsComputerStateGreaterThan(String value) {
            addCriterion("ts_computer_state >", value, "tsComputerState");
            return (Criteria) this;
        }

        public Criteria andTsComputerStateGreaterThanOrEqualTo(String value) {
            addCriterion("ts_computer_state >=", value, "tsComputerState");
            return (Criteria) this;
        }

        public Criteria andTsComputerStateLessThan(String value) {
            addCriterion("ts_computer_state <", value, "tsComputerState");
            return (Criteria) this;
        }

        public Criteria andTsComputerStateLessThanOrEqualTo(String value) {
            addCriterion("ts_computer_state <=", value, "tsComputerState");
            return (Criteria) this;
        }

        public Criteria andTsComputerStateLike(String value) {
            addCriterion("ts_computer_state like", value, "tsComputerState");
            return (Criteria) this;
        }

        public Criteria andTsComputerStateNotLike(String value) {
            addCriterion("ts_computer_state not like", value, "tsComputerState");
            return (Criteria) this;
        }

        public Criteria andTsComputerStateIn(List<String> values) {
            addCriterion("ts_computer_state in", values, "tsComputerState");
            return (Criteria) this;
        }

        public Criteria andTsComputerStateNotIn(List<String> values) {
            addCriterion("ts_computer_state not in", values, "tsComputerState");
            return (Criteria) this;
        }

        public Criteria andTsComputerStateBetween(String value1, String value2) {
            addCriterion("ts_computer_state between", value1, value2, "tsComputerState");
            return (Criteria) this;
        }

        public Criteria andTsComputerStateNotBetween(String value1, String value2) {
            addCriterion("ts_computer_state not between", value1, value2, "tsComputerState");
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