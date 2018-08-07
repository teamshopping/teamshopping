package com.neusoft.bean;

import java.util.ArrayList;
import java.util.List;

public class TeamshoppingPhoneExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TeamshoppingPhoneExample() {
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

        public Criteria andTsPhoneIdIsNull() {
            addCriterion("ts_phone_id is null");
            return (Criteria) this;
        }

        public Criteria andTsPhoneIdIsNotNull() {
            addCriterion("ts_phone_id is not null");
            return (Criteria) this;
        }

        public Criteria andTsPhoneIdEqualTo(Integer value) {
            addCriterion("ts_phone_id =", value, "tsPhoneId");
            return (Criteria) this;
        }

        public Criteria andTsPhoneIdNotEqualTo(Integer value) {
            addCriterion("ts_phone_id <>", value, "tsPhoneId");
            return (Criteria) this;
        }

        public Criteria andTsPhoneIdGreaterThan(Integer value) {
            addCriterion("ts_phone_id >", value, "tsPhoneId");
            return (Criteria) this;
        }

        public Criteria andTsPhoneIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ts_phone_id >=", value, "tsPhoneId");
            return (Criteria) this;
        }

        public Criteria andTsPhoneIdLessThan(Integer value) {
            addCriterion("ts_phone_id <", value, "tsPhoneId");
            return (Criteria) this;
        }

        public Criteria andTsPhoneIdLessThanOrEqualTo(Integer value) {
            addCriterion("ts_phone_id <=", value, "tsPhoneId");
            return (Criteria) this;
        }

        public Criteria andTsPhoneIdIn(List<Integer> values) {
            addCriterion("ts_phone_id in", values, "tsPhoneId");
            return (Criteria) this;
        }

        public Criteria andTsPhoneIdNotIn(List<Integer> values) {
            addCriterion("ts_phone_id not in", values, "tsPhoneId");
            return (Criteria) this;
        }

        public Criteria andTsPhoneIdBetween(Integer value1, Integer value2) {
            addCriterion("ts_phone_id between", value1, value2, "tsPhoneId");
            return (Criteria) this;
        }

        public Criteria andTsPhoneIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ts_phone_id not between", value1, value2, "tsPhoneId");
            return (Criteria) this;
        }

        public Criteria andTsPhoneBrandIsNull() {
            addCriterion("ts_phone_brand is null");
            return (Criteria) this;
        }

        public Criteria andTsPhoneBrandIsNotNull() {
            addCriterion("ts_phone_brand is not null");
            return (Criteria) this;
        }

        public Criteria andTsPhoneBrandEqualTo(String value) {
            addCriterion("ts_phone_brand =", value, "tsPhoneBrand");
            return (Criteria) this;
        }

        public Criteria andTsPhoneBrandNotEqualTo(String value) {
            addCriterion("ts_phone_brand <>", value, "tsPhoneBrand");
            return (Criteria) this;
        }

        public Criteria andTsPhoneBrandGreaterThan(String value) {
            addCriterion("ts_phone_brand >", value, "tsPhoneBrand");
            return (Criteria) this;
        }

        public Criteria andTsPhoneBrandGreaterThanOrEqualTo(String value) {
            addCriterion("ts_phone_brand >=", value, "tsPhoneBrand");
            return (Criteria) this;
        }

        public Criteria andTsPhoneBrandLessThan(String value) {
            addCriterion("ts_phone_brand <", value, "tsPhoneBrand");
            return (Criteria) this;
        }

        public Criteria andTsPhoneBrandLessThanOrEqualTo(String value) {
            addCriterion("ts_phone_brand <=", value, "tsPhoneBrand");
            return (Criteria) this;
        }

        public Criteria andTsPhoneBrandLike(String value) {
            addCriterion("ts_phone_brand like", value, "tsPhoneBrand");
            return (Criteria) this;
        }

        public Criteria andTsPhoneBrandNotLike(String value) {
            addCriterion("ts_phone_brand not like", value, "tsPhoneBrand");
            return (Criteria) this;
        }

        public Criteria andTsPhoneBrandIn(List<String> values) {
            addCriterion("ts_phone_brand in", values, "tsPhoneBrand");
            return (Criteria) this;
        }

        public Criteria andTsPhoneBrandNotIn(List<String> values) {
            addCriterion("ts_phone_brand not in", values, "tsPhoneBrand");
            return (Criteria) this;
        }

        public Criteria andTsPhoneBrandBetween(String value1, String value2) {
            addCriterion("ts_phone_brand between", value1, value2, "tsPhoneBrand");
            return (Criteria) this;
        }

        public Criteria andTsPhoneBrandNotBetween(String value1, String value2) {
            addCriterion("ts_phone_brand not between", value1, value2, "tsPhoneBrand");
            return (Criteria) this;
        }

        public Criteria andTsPhoneModelIsNull() {
            addCriterion("ts_phone_model is null");
            return (Criteria) this;
        }

        public Criteria andTsPhoneModelIsNotNull() {
            addCriterion("ts_phone_model is not null");
            return (Criteria) this;
        }

        public Criteria andTsPhoneModelEqualTo(String value) {
            addCriterion("ts_phone_model =", value, "tsPhoneModel");
            return (Criteria) this;
        }

        public Criteria andTsPhoneModelNotEqualTo(String value) {
            addCriterion("ts_phone_model <>", value, "tsPhoneModel");
            return (Criteria) this;
        }

        public Criteria andTsPhoneModelGreaterThan(String value) {
            addCriterion("ts_phone_model >", value, "tsPhoneModel");
            return (Criteria) this;
        }

        public Criteria andTsPhoneModelGreaterThanOrEqualTo(String value) {
            addCriterion("ts_phone_model >=", value, "tsPhoneModel");
            return (Criteria) this;
        }

        public Criteria andTsPhoneModelLessThan(String value) {
            addCriterion("ts_phone_model <", value, "tsPhoneModel");
            return (Criteria) this;
        }

        public Criteria andTsPhoneModelLessThanOrEqualTo(String value) {
            addCriterion("ts_phone_model <=", value, "tsPhoneModel");
            return (Criteria) this;
        }

        public Criteria andTsPhoneModelLike(String value) {
            addCriterion("ts_phone_model like", value, "tsPhoneModel");
            return (Criteria) this;
        }

        public Criteria andTsPhoneModelNotLike(String value) {
            addCriterion("ts_phone_model not like", value, "tsPhoneModel");
            return (Criteria) this;
        }

        public Criteria andTsPhoneModelIn(List<String> values) {
            addCriterion("ts_phone_model in", values, "tsPhoneModel");
            return (Criteria) this;
        }

        public Criteria andTsPhoneModelNotIn(List<String> values) {
            addCriterion("ts_phone_model not in", values, "tsPhoneModel");
            return (Criteria) this;
        }

        public Criteria andTsPhoneModelBetween(String value1, String value2) {
            addCriterion("ts_phone_model between", value1, value2, "tsPhoneModel");
            return (Criteria) this;
        }

        public Criteria andTsPhoneModelNotBetween(String value1, String value2) {
            addCriterion("ts_phone_model not between", value1, value2, "tsPhoneModel");
            return (Criteria) this;
        }

        public Criteria andTsPhoneTypeIsNull() {
            addCriterion("ts_phone_type is null");
            return (Criteria) this;
        }

        public Criteria andTsPhoneTypeIsNotNull() {
            addCriterion("ts_phone_type is not null");
            return (Criteria) this;
        }

        public Criteria andTsPhoneTypeEqualTo(String value) {
            addCriterion("ts_phone_type =", value, "tsPhoneType");
            return (Criteria) this;
        }

        public Criteria andTsPhoneTypeNotEqualTo(String value) {
            addCriterion("ts_phone_type <>", value, "tsPhoneType");
            return (Criteria) this;
        }

        public Criteria andTsPhoneTypeGreaterThan(String value) {
            addCriterion("ts_phone_type >", value, "tsPhoneType");
            return (Criteria) this;
        }

        public Criteria andTsPhoneTypeGreaterThanOrEqualTo(String value) {
            addCriterion("ts_phone_type >=", value, "tsPhoneType");
            return (Criteria) this;
        }

        public Criteria andTsPhoneTypeLessThan(String value) {
            addCriterion("ts_phone_type <", value, "tsPhoneType");
            return (Criteria) this;
        }

        public Criteria andTsPhoneTypeLessThanOrEqualTo(String value) {
            addCriterion("ts_phone_type <=", value, "tsPhoneType");
            return (Criteria) this;
        }

        public Criteria andTsPhoneTypeLike(String value) {
            addCriterion("ts_phone_type like", value, "tsPhoneType");
            return (Criteria) this;
        }

        public Criteria andTsPhoneTypeNotLike(String value) {
            addCriterion("ts_phone_type not like", value, "tsPhoneType");
            return (Criteria) this;
        }

        public Criteria andTsPhoneTypeIn(List<String> values) {
            addCriterion("ts_phone_type in", values, "tsPhoneType");
            return (Criteria) this;
        }

        public Criteria andTsPhoneTypeNotIn(List<String> values) {
            addCriterion("ts_phone_type not in", values, "tsPhoneType");
            return (Criteria) this;
        }

        public Criteria andTsPhoneTypeBetween(String value1, String value2) {
            addCriterion("ts_phone_type between", value1, value2, "tsPhoneType");
            return (Criteria) this;
        }

        public Criteria andTsPhoneTypeNotBetween(String value1, String value2) {
            addCriterion("ts_phone_type not between", value1, value2, "tsPhoneType");
            return (Criteria) this;
        }

        public Criteria andTsPhoneSizeIsNull() {
            addCriterion("ts_phone_size is null");
            return (Criteria) this;
        }

        public Criteria andTsPhoneSizeIsNotNull() {
            addCriterion("ts_phone_size is not null");
            return (Criteria) this;
        }

        public Criteria andTsPhoneSizeEqualTo(String value) {
            addCriterion("ts_phone_size =", value, "tsPhoneSize");
            return (Criteria) this;
        }

        public Criteria andTsPhoneSizeNotEqualTo(String value) {
            addCriterion("ts_phone_size <>", value, "tsPhoneSize");
            return (Criteria) this;
        }

        public Criteria andTsPhoneSizeGreaterThan(String value) {
            addCriterion("ts_phone_size >", value, "tsPhoneSize");
            return (Criteria) this;
        }

        public Criteria andTsPhoneSizeGreaterThanOrEqualTo(String value) {
            addCriterion("ts_phone_size >=", value, "tsPhoneSize");
            return (Criteria) this;
        }

        public Criteria andTsPhoneSizeLessThan(String value) {
            addCriterion("ts_phone_size <", value, "tsPhoneSize");
            return (Criteria) this;
        }

        public Criteria andTsPhoneSizeLessThanOrEqualTo(String value) {
            addCriterion("ts_phone_size <=", value, "tsPhoneSize");
            return (Criteria) this;
        }

        public Criteria andTsPhoneSizeLike(String value) {
            addCriterion("ts_phone_size like", value, "tsPhoneSize");
            return (Criteria) this;
        }

        public Criteria andTsPhoneSizeNotLike(String value) {
            addCriterion("ts_phone_size not like", value, "tsPhoneSize");
            return (Criteria) this;
        }

        public Criteria andTsPhoneSizeIn(List<String> values) {
            addCriterion("ts_phone_size in", values, "tsPhoneSize");
            return (Criteria) this;
        }

        public Criteria andTsPhoneSizeNotIn(List<String> values) {
            addCriterion("ts_phone_size not in", values, "tsPhoneSize");
            return (Criteria) this;
        }

        public Criteria andTsPhoneSizeBetween(String value1, String value2) {
            addCriterion("ts_phone_size between", value1, value2, "tsPhoneSize");
            return (Criteria) this;
        }

        public Criteria andTsPhoneSizeNotBetween(String value1, String value2) {
            addCriterion("ts_phone_size not between", value1, value2, "tsPhoneSize");
            return (Criteria) this;
        }

        public Criteria andTsPhoneColorIsNull() {
            addCriterion("ts_phone_color is null");
            return (Criteria) this;
        }

        public Criteria andTsPhoneColorIsNotNull() {
            addCriterion("ts_phone_color is not null");
            return (Criteria) this;
        }

        public Criteria andTsPhoneColorEqualTo(String value) {
            addCriterion("ts_phone_color =", value, "tsPhoneColor");
            return (Criteria) this;
        }

        public Criteria andTsPhoneColorNotEqualTo(String value) {
            addCriterion("ts_phone_color <>", value, "tsPhoneColor");
            return (Criteria) this;
        }

        public Criteria andTsPhoneColorGreaterThan(String value) {
            addCriterion("ts_phone_color >", value, "tsPhoneColor");
            return (Criteria) this;
        }

        public Criteria andTsPhoneColorGreaterThanOrEqualTo(String value) {
            addCriterion("ts_phone_color >=", value, "tsPhoneColor");
            return (Criteria) this;
        }

        public Criteria andTsPhoneColorLessThan(String value) {
            addCriterion("ts_phone_color <", value, "tsPhoneColor");
            return (Criteria) this;
        }

        public Criteria andTsPhoneColorLessThanOrEqualTo(String value) {
            addCriterion("ts_phone_color <=", value, "tsPhoneColor");
            return (Criteria) this;
        }

        public Criteria andTsPhoneColorLike(String value) {
            addCriterion("ts_phone_color like", value, "tsPhoneColor");
            return (Criteria) this;
        }

        public Criteria andTsPhoneColorNotLike(String value) {
            addCriterion("ts_phone_color not like", value, "tsPhoneColor");
            return (Criteria) this;
        }

        public Criteria andTsPhoneColorIn(List<String> values) {
            addCriterion("ts_phone_color in", values, "tsPhoneColor");
            return (Criteria) this;
        }

        public Criteria andTsPhoneColorNotIn(List<String> values) {
            addCriterion("ts_phone_color not in", values, "tsPhoneColor");
            return (Criteria) this;
        }

        public Criteria andTsPhoneColorBetween(String value1, String value2) {
            addCriterion("ts_phone_color between", value1, value2, "tsPhoneColor");
            return (Criteria) this;
        }

        public Criteria andTsPhoneColorNotBetween(String value1, String value2) {
            addCriterion("ts_phone_color not between", value1, value2, "tsPhoneColor");
            return (Criteria) this;
        }

        public Criteria andTsPhoneKernelIsNull() {
            addCriterion("ts_phone_kernel is null");
            return (Criteria) this;
        }

        public Criteria andTsPhoneKernelIsNotNull() {
            addCriterion("ts_phone_kernel is not null");
            return (Criteria) this;
        }

        public Criteria andTsPhoneKernelEqualTo(String value) {
            addCriterion("ts_phone_kernel =", value, "tsPhoneKernel");
            return (Criteria) this;
        }

        public Criteria andTsPhoneKernelNotEqualTo(String value) {
            addCriterion("ts_phone_kernel <>", value, "tsPhoneKernel");
            return (Criteria) this;
        }

        public Criteria andTsPhoneKernelGreaterThan(String value) {
            addCriterion("ts_phone_kernel >", value, "tsPhoneKernel");
            return (Criteria) this;
        }

        public Criteria andTsPhoneKernelGreaterThanOrEqualTo(String value) {
            addCriterion("ts_phone_kernel >=", value, "tsPhoneKernel");
            return (Criteria) this;
        }

        public Criteria andTsPhoneKernelLessThan(String value) {
            addCriterion("ts_phone_kernel <", value, "tsPhoneKernel");
            return (Criteria) this;
        }

        public Criteria andTsPhoneKernelLessThanOrEqualTo(String value) {
            addCriterion("ts_phone_kernel <=", value, "tsPhoneKernel");
            return (Criteria) this;
        }

        public Criteria andTsPhoneKernelLike(String value) {
            addCriterion("ts_phone_kernel like", value, "tsPhoneKernel");
            return (Criteria) this;
        }

        public Criteria andTsPhoneKernelNotLike(String value) {
            addCriterion("ts_phone_kernel not like", value, "tsPhoneKernel");
            return (Criteria) this;
        }

        public Criteria andTsPhoneKernelIn(List<String> values) {
            addCriterion("ts_phone_kernel in", values, "tsPhoneKernel");
            return (Criteria) this;
        }

        public Criteria andTsPhoneKernelNotIn(List<String> values) {
            addCriterion("ts_phone_kernel not in", values, "tsPhoneKernel");
            return (Criteria) this;
        }

        public Criteria andTsPhoneKernelBetween(String value1, String value2) {
            addCriterion("ts_phone_kernel between", value1, value2, "tsPhoneKernel");
            return (Criteria) this;
        }

        public Criteria andTsPhoneKernelNotBetween(String value1, String value2) {
            addCriterion("ts_phone_kernel not between", value1, value2, "tsPhoneKernel");
            return (Criteria) this;
        }

        public Criteria andTsPhoneAudioIsNull() {
            addCriterion("ts_phone_audio is null");
            return (Criteria) this;
        }

        public Criteria andTsPhoneAudioIsNotNull() {
            addCriterion("ts_phone_audio is not null");
            return (Criteria) this;
        }

        public Criteria andTsPhoneAudioEqualTo(String value) {
            addCriterion("ts_phone_audio =", value, "tsPhoneAudio");
            return (Criteria) this;
        }

        public Criteria andTsPhoneAudioNotEqualTo(String value) {
            addCriterion("ts_phone_audio <>", value, "tsPhoneAudio");
            return (Criteria) this;
        }

        public Criteria andTsPhoneAudioGreaterThan(String value) {
            addCriterion("ts_phone_audio >", value, "tsPhoneAudio");
            return (Criteria) this;
        }

        public Criteria andTsPhoneAudioGreaterThanOrEqualTo(String value) {
            addCriterion("ts_phone_audio >=", value, "tsPhoneAudio");
            return (Criteria) this;
        }

        public Criteria andTsPhoneAudioLessThan(String value) {
            addCriterion("ts_phone_audio <", value, "tsPhoneAudio");
            return (Criteria) this;
        }

        public Criteria andTsPhoneAudioLessThanOrEqualTo(String value) {
            addCriterion("ts_phone_audio <=", value, "tsPhoneAudio");
            return (Criteria) this;
        }

        public Criteria andTsPhoneAudioLike(String value) {
            addCriterion("ts_phone_audio like", value, "tsPhoneAudio");
            return (Criteria) this;
        }

        public Criteria andTsPhoneAudioNotLike(String value) {
            addCriterion("ts_phone_audio not like", value, "tsPhoneAudio");
            return (Criteria) this;
        }

        public Criteria andTsPhoneAudioIn(List<String> values) {
            addCriterion("ts_phone_audio in", values, "tsPhoneAudio");
            return (Criteria) this;
        }

        public Criteria andTsPhoneAudioNotIn(List<String> values) {
            addCriterion("ts_phone_audio not in", values, "tsPhoneAudio");
            return (Criteria) this;
        }

        public Criteria andTsPhoneAudioBetween(String value1, String value2) {
            addCriterion("ts_phone_audio between", value1, value2, "tsPhoneAudio");
            return (Criteria) this;
        }

        public Criteria andTsPhoneAudioNotBetween(String value1, String value2) {
            addCriterion("ts_phone_audio not between", value1, value2, "tsPhoneAudio");
            return (Criteria) this;
        }

        public Criteria andTsPhoneMemoryIsNull() {
            addCriterion("ts_phone_memory is null");
            return (Criteria) this;
        }

        public Criteria andTsPhoneMemoryIsNotNull() {
            addCriterion("ts_phone_memory is not null");
            return (Criteria) this;
        }

        public Criteria andTsPhoneMemoryEqualTo(String value) {
            addCriterion("ts_phone_memory =", value, "tsPhoneMemory");
            return (Criteria) this;
        }

        public Criteria andTsPhoneMemoryNotEqualTo(String value) {
            addCriterion("ts_phone_memory <>", value, "tsPhoneMemory");
            return (Criteria) this;
        }

        public Criteria andTsPhoneMemoryGreaterThan(String value) {
            addCriterion("ts_phone_memory >", value, "tsPhoneMemory");
            return (Criteria) this;
        }

        public Criteria andTsPhoneMemoryGreaterThanOrEqualTo(String value) {
            addCriterion("ts_phone_memory >=", value, "tsPhoneMemory");
            return (Criteria) this;
        }

        public Criteria andTsPhoneMemoryLessThan(String value) {
            addCriterion("ts_phone_memory <", value, "tsPhoneMemory");
            return (Criteria) this;
        }

        public Criteria andTsPhoneMemoryLessThanOrEqualTo(String value) {
            addCriterion("ts_phone_memory <=", value, "tsPhoneMemory");
            return (Criteria) this;
        }

        public Criteria andTsPhoneMemoryLike(String value) {
            addCriterion("ts_phone_memory like", value, "tsPhoneMemory");
            return (Criteria) this;
        }

        public Criteria andTsPhoneMemoryNotLike(String value) {
            addCriterion("ts_phone_memory not like", value, "tsPhoneMemory");
            return (Criteria) this;
        }

        public Criteria andTsPhoneMemoryIn(List<String> values) {
            addCriterion("ts_phone_memory in", values, "tsPhoneMemory");
            return (Criteria) this;
        }

        public Criteria andTsPhoneMemoryNotIn(List<String> values) {
            addCriterion("ts_phone_memory not in", values, "tsPhoneMemory");
            return (Criteria) this;
        }

        public Criteria andTsPhoneMemoryBetween(String value1, String value2) {
            addCriterion("ts_phone_memory between", value1, value2, "tsPhoneMemory");
            return (Criteria) this;
        }

        public Criteria andTsPhoneMemoryNotBetween(String value1, String value2) {
            addCriterion("ts_phone_memory not between", value1, value2, "tsPhoneMemory");
            return (Criteria) this;
        }

        public Criteria andTsPhonePixelIsNull() {
            addCriterion("ts_phone_pixel is null");
            return (Criteria) this;
        }

        public Criteria andTsPhonePixelIsNotNull() {
            addCriterion("ts_phone_pixel is not null");
            return (Criteria) this;
        }

        public Criteria andTsPhonePixelEqualTo(String value) {
            addCriterion("ts_phone_pixel =", value, "tsPhonePixel");
            return (Criteria) this;
        }

        public Criteria andTsPhonePixelNotEqualTo(String value) {
            addCriterion("ts_phone_pixel <>", value, "tsPhonePixel");
            return (Criteria) this;
        }

        public Criteria andTsPhonePixelGreaterThan(String value) {
            addCriterion("ts_phone_pixel >", value, "tsPhonePixel");
            return (Criteria) this;
        }

        public Criteria andTsPhonePixelGreaterThanOrEqualTo(String value) {
            addCriterion("ts_phone_pixel >=", value, "tsPhonePixel");
            return (Criteria) this;
        }

        public Criteria andTsPhonePixelLessThan(String value) {
            addCriterion("ts_phone_pixel <", value, "tsPhonePixel");
            return (Criteria) this;
        }

        public Criteria andTsPhonePixelLessThanOrEqualTo(String value) {
            addCriterion("ts_phone_pixel <=", value, "tsPhonePixel");
            return (Criteria) this;
        }

        public Criteria andTsPhonePixelLike(String value) {
            addCriterion("ts_phone_pixel like", value, "tsPhonePixel");
            return (Criteria) this;
        }

        public Criteria andTsPhonePixelNotLike(String value) {
            addCriterion("ts_phone_pixel not like", value, "tsPhonePixel");
            return (Criteria) this;
        }

        public Criteria andTsPhonePixelIn(List<String> values) {
            addCriterion("ts_phone_pixel in", values, "tsPhonePixel");
            return (Criteria) this;
        }

        public Criteria andTsPhonePixelNotIn(List<String> values) {
            addCriterion("ts_phone_pixel not in", values, "tsPhonePixel");
            return (Criteria) this;
        }

        public Criteria andTsPhonePixelBetween(String value1, String value2) {
            addCriterion("ts_phone_pixel between", value1, value2, "tsPhonePixel");
            return (Criteria) this;
        }

        public Criteria andTsPhonePixelNotBetween(String value1, String value2) {
            addCriterion("ts_phone_pixel not between", value1, value2, "tsPhonePixel");
            return (Criteria) this;
        }

        public Criteria andTsPhoneGuaranteeIsNull() {
            addCriterion("ts_phone_guarantee is null");
            return (Criteria) this;
        }

        public Criteria andTsPhoneGuaranteeIsNotNull() {
            addCriterion("ts_phone_guarantee is not null");
            return (Criteria) this;
        }

        public Criteria andTsPhoneGuaranteeEqualTo(String value) {
            addCriterion("ts_phone_guarantee =", value, "tsPhoneGuarantee");
            return (Criteria) this;
        }

        public Criteria andTsPhoneGuaranteeNotEqualTo(String value) {
            addCriterion("ts_phone_guarantee <>", value, "tsPhoneGuarantee");
            return (Criteria) this;
        }

        public Criteria andTsPhoneGuaranteeGreaterThan(String value) {
            addCriterion("ts_phone_guarantee >", value, "tsPhoneGuarantee");
            return (Criteria) this;
        }

        public Criteria andTsPhoneGuaranteeGreaterThanOrEqualTo(String value) {
            addCriterion("ts_phone_guarantee >=", value, "tsPhoneGuarantee");
            return (Criteria) this;
        }

        public Criteria andTsPhoneGuaranteeLessThan(String value) {
            addCriterion("ts_phone_guarantee <", value, "tsPhoneGuarantee");
            return (Criteria) this;
        }

        public Criteria andTsPhoneGuaranteeLessThanOrEqualTo(String value) {
            addCriterion("ts_phone_guarantee <=", value, "tsPhoneGuarantee");
            return (Criteria) this;
        }

        public Criteria andTsPhoneGuaranteeLike(String value) {
            addCriterion("ts_phone_guarantee like", value, "tsPhoneGuarantee");
            return (Criteria) this;
        }

        public Criteria andTsPhoneGuaranteeNotLike(String value) {
            addCriterion("ts_phone_guarantee not like", value, "tsPhoneGuarantee");
            return (Criteria) this;
        }

        public Criteria andTsPhoneGuaranteeIn(List<String> values) {
            addCriterion("ts_phone_guarantee in", values, "tsPhoneGuarantee");
            return (Criteria) this;
        }

        public Criteria andTsPhoneGuaranteeNotIn(List<String> values) {
            addCriterion("ts_phone_guarantee not in", values, "tsPhoneGuarantee");
            return (Criteria) this;
        }

        public Criteria andTsPhoneGuaranteeBetween(String value1, String value2) {
            addCriterion("ts_phone_guarantee between", value1, value2, "tsPhoneGuarantee");
            return (Criteria) this;
        }

        public Criteria andTsPhoneGuaranteeNotBetween(String value1, String value2) {
            addCriterion("ts_phone_guarantee not between", value1, value2, "tsPhoneGuarantee");
            return (Criteria) this;
        }

        public Criteria andTsPhoneSystemIsNull() {
            addCriterion("ts_phone_system is null");
            return (Criteria) this;
        }

        public Criteria andTsPhoneSystemIsNotNull() {
            addCriterion("ts_phone_system is not null");
            return (Criteria) this;
        }

        public Criteria andTsPhoneSystemEqualTo(String value) {
            addCriterion("ts_phone_system =", value, "tsPhoneSystem");
            return (Criteria) this;
        }

        public Criteria andTsPhoneSystemNotEqualTo(String value) {
            addCriterion("ts_phone_system <>", value, "tsPhoneSystem");
            return (Criteria) this;
        }

        public Criteria andTsPhoneSystemGreaterThan(String value) {
            addCriterion("ts_phone_system >", value, "tsPhoneSystem");
            return (Criteria) this;
        }

        public Criteria andTsPhoneSystemGreaterThanOrEqualTo(String value) {
            addCriterion("ts_phone_system >=", value, "tsPhoneSystem");
            return (Criteria) this;
        }

        public Criteria andTsPhoneSystemLessThan(String value) {
            addCriterion("ts_phone_system <", value, "tsPhoneSystem");
            return (Criteria) this;
        }

        public Criteria andTsPhoneSystemLessThanOrEqualTo(String value) {
            addCriterion("ts_phone_system <=", value, "tsPhoneSystem");
            return (Criteria) this;
        }

        public Criteria andTsPhoneSystemLike(String value) {
            addCriterion("ts_phone_system like", value, "tsPhoneSystem");
            return (Criteria) this;
        }

        public Criteria andTsPhoneSystemNotLike(String value) {
            addCriterion("ts_phone_system not like", value, "tsPhoneSystem");
            return (Criteria) this;
        }

        public Criteria andTsPhoneSystemIn(List<String> values) {
            addCriterion("ts_phone_system in", values, "tsPhoneSystem");
            return (Criteria) this;
        }

        public Criteria andTsPhoneSystemNotIn(List<String> values) {
            addCriterion("ts_phone_system not in", values, "tsPhoneSystem");
            return (Criteria) this;
        }

        public Criteria andTsPhoneSystemBetween(String value1, String value2) {
            addCriterion("ts_phone_system between", value1, value2, "tsPhoneSystem");
            return (Criteria) this;
        }

        public Criteria andTsPhoneSystemNotBetween(String value1, String value2) {
            addCriterion("ts_phone_system not between", value1, value2, "tsPhoneSystem");
            return (Criteria) this;
        }

        public Criteria andTsPhonePictureIsNull() {
            addCriterion("ts_phone_picture is null");
            return (Criteria) this;
        }

        public Criteria andTsPhonePictureIsNotNull() {
            addCriterion("ts_phone_picture is not null");
            return (Criteria) this;
        }

        public Criteria andTsPhonePictureEqualTo(String value) {
            addCriterion("ts_phone_picture =", value, "tsPhonePicture");
            return (Criteria) this;
        }

        public Criteria andTsPhonePictureNotEqualTo(String value) {
            addCriterion("ts_phone_picture <>", value, "tsPhonePicture");
            return (Criteria) this;
        }

        public Criteria andTsPhonePictureGreaterThan(String value) {
            addCriterion("ts_phone_picture >", value, "tsPhonePicture");
            return (Criteria) this;
        }

        public Criteria andTsPhonePictureGreaterThanOrEqualTo(String value) {
            addCriterion("ts_phone_picture >=", value, "tsPhonePicture");
            return (Criteria) this;
        }

        public Criteria andTsPhonePictureLessThan(String value) {
            addCriterion("ts_phone_picture <", value, "tsPhonePicture");
            return (Criteria) this;
        }

        public Criteria andTsPhonePictureLessThanOrEqualTo(String value) {
            addCriterion("ts_phone_picture <=", value, "tsPhonePicture");
            return (Criteria) this;
        }

        public Criteria andTsPhonePictureLike(String value) {
            addCriterion("ts_phone_picture like", value, "tsPhonePicture");
            return (Criteria) this;
        }

        public Criteria andTsPhonePictureNotLike(String value) {
            addCriterion("ts_phone_picture not like", value, "tsPhonePicture");
            return (Criteria) this;
        }

        public Criteria andTsPhonePictureIn(List<String> values) {
            addCriterion("ts_phone_picture in", values, "tsPhonePicture");
            return (Criteria) this;
        }

        public Criteria andTsPhonePictureNotIn(List<String> values) {
            addCriterion("ts_phone_picture not in", values, "tsPhonePicture");
            return (Criteria) this;
        }

        public Criteria andTsPhonePictureBetween(String value1, String value2) {
            addCriterion("ts_phone_picture between", value1, value2, "tsPhonePicture");
            return (Criteria) this;
        }

        public Criteria andTsPhonePictureNotBetween(String value1, String value2) {
            addCriterion("ts_phone_picture not between", value1, value2, "tsPhonePicture");
            return (Criteria) this;
        }

        public Criteria andTsPhoneNumberIsNull() {
            addCriterion("ts_phone_number is null");
            return (Criteria) this;
        }

        public Criteria andTsPhoneNumberIsNotNull() {
            addCriterion("ts_phone_number is not null");
            return (Criteria) this;
        }

        public Criteria andTsPhoneNumberEqualTo(Integer value) {
            addCriterion("ts_phone_number =", value, "tsPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andTsPhoneNumberNotEqualTo(Integer value) {
            addCriterion("ts_phone_number <>", value, "tsPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andTsPhoneNumberGreaterThan(Integer value) {
            addCriterion("ts_phone_number >", value, "tsPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andTsPhoneNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("ts_phone_number >=", value, "tsPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andTsPhoneNumberLessThan(Integer value) {
            addCriterion("ts_phone_number <", value, "tsPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andTsPhoneNumberLessThanOrEqualTo(Integer value) {
            addCriterion("ts_phone_number <=", value, "tsPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andTsPhoneNumberIn(List<Integer> values) {
            addCriterion("ts_phone_number in", values, "tsPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andTsPhoneNumberNotIn(List<Integer> values) {
            addCriterion("ts_phone_number not in", values, "tsPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andTsPhoneNumberBetween(Integer value1, Integer value2) {
            addCriterion("ts_phone_number between", value1, value2, "tsPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andTsPhoneNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("ts_phone_number not between", value1, value2, "tsPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andTsPhoneMoneyIsNull() {
            addCriterion("ts_phone_money is null");
            return (Criteria) this;
        }

        public Criteria andTsPhoneMoneyIsNotNull() {
            addCriterion("ts_phone_money is not null");
            return (Criteria) this;
        }

        public Criteria andTsPhoneMoneyEqualTo(Double value) {
            addCriterion("ts_phone_money =", value, "tsPhoneMoney");
            return (Criteria) this;
        }

        public Criteria andTsPhoneMoneyNotEqualTo(Double value) {
            addCriterion("ts_phone_money <>", value, "tsPhoneMoney");
            return (Criteria) this;
        }

        public Criteria andTsPhoneMoneyGreaterThan(Double value) {
            addCriterion("ts_phone_money >", value, "tsPhoneMoney");
            return (Criteria) this;
        }

        public Criteria andTsPhoneMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("ts_phone_money >=", value, "tsPhoneMoney");
            return (Criteria) this;
        }

        public Criteria andTsPhoneMoneyLessThan(Double value) {
            addCriterion("ts_phone_money <", value, "tsPhoneMoney");
            return (Criteria) this;
        }

        public Criteria andTsPhoneMoneyLessThanOrEqualTo(Double value) {
            addCriterion("ts_phone_money <=", value, "tsPhoneMoney");
            return (Criteria) this;
        }

        public Criteria andTsPhoneMoneyIn(List<Double> values) {
            addCriterion("ts_phone_money in", values, "tsPhoneMoney");
            return (Criteria) this;
        }

        public Criteria andTsPhoneMoneyNotIn(List<Double> values) {
            addCriterion("ts_phone_money not in", values, "tsPhoneMoney");
            return (Criteria) this;
        }

        public Criteria andTsPhoneMoneyBetween(Double value1, Double value2) {
            addCriterion("ts_phone_money between", value1, value2, "tsPhoneMoney");
            return (Criteria) this;
        }

        public Criteria andTsPhoneMoneyNotBetween(Double value1, Double value2) {
            addCriterion("ts_phone_money not between", value1, value2, "tsPhoneMoney");
            return (Criteria) this;
        }

        public Criteria andTsPhoneIntroduceIsNull() {
            addCriterion("ts_phone_introduce is null");
            return (Criteria) this;
        }

        public Criteria andTsPhoneIntroduceIsNotNull() {
            addCriterion("ts_phone_introduce is not null");
            return (Criteria) this;
        }

        public Criteria andTsPhoneIntroduceEqualTo(String value) {
            addCriterion("ts_phone_introduce =", value, "tsPhoneIntroduce");
            return (Criteria) this;
        }

        public Criteria andTsPhoneIntroduceNotEqualTo(String value) {
            addCriterion("ts_phone_introduce <>", value, "tsPhoneIntroduce");
            return (Criteria) this;
        }

        public Criteria andTsPhoneIntroduceGreaterThan(String value) {
            addCriterion("ts_phone_introduce >", value, "tsPhoneIntroduce");
            return (Criteria) this;
        }

        public Criteria andTsPhoneIntroduceGreaterThanOrEqualTo(String value) {
            addCriterion("ts_phone_introduce >=", value, "tsPhoneIntroduce");
            return (Criteria) this;
        }

        public Criteria andTsPhoneIntroduceLessThan(String value) {
            addCriterion("ts_phone_introduce <", value, "tsPhoneIntroduce");
            return (Criteria) this;
        }

        public Criteria andTsPhoneIntroduceLessThanOrEqualTo(String value) {
            addCriterion("ts_phone_introduce <=", value, "tsPhoneIntroduce");
            return (Criteria) this;
        }

        public Criteria andTsPhoneIntroduceLike(String value) {
            addCriterion("ts_phone_introduce like", value, "tsPhoneIntroduce");
            return (Criteria) this;
        }

        public Criteria andTsPhoneIntroduceNotLike(String value) {
            addCriterion("ts_phone_introduce not like", value, "tsPhoneIntroduce");
            return (Criteria) this;
        }

        public Criteria andTsPhoneIntroduceIn(List<String> values) {
            addCriterion("ts_phone_introduce in", values, "tsPhoneIntroduce");
            return (Criteria) this;
        }

        public Criteria andTsPhoneIntroduceNotIn(List<String> values) {
            addCriterion("ts_phone_introduce not in", values, "tsPhoneIntroduce");
            return (Criteria) this;
        }

        public Criteria andTsPhoneIntroduceBetween(String value1, String value2) {
            addCriterion("ts_phone_introduce between", value1, value2, "tsPhoneIntroduce");
            return (Criteria) this;
        }

        public Criteria andTsPhoneIntroduceNotBetween(String value1, String value2) {
            addCriterion("ts_phone_introduce not between", value1, value2, "tsPhoneIntroduce");
            return (Criteria) this;
        }

        public Criteria andTsPhoneStateIsNull() {
            addCriterion("ts_phone_state is null");
            return (Criteria) this;
        }

        public Criteria andTsPhoneStateIsNotNull() {
            addCriterion("ts_phone_state is not null");
            return (Criteria) this;
        }

        public Criteria andTsPhoneStateEqualTo(String value) {
            addCriterion("ts_phone_state =", value, "tsPhoneState");
            return (Criteria) this;
        }

        public Criteria andTsPhoneStateNotEqualTo(String value) {
            addCriterion("ts_phone_state <>", value, "tsPhoneState");
            return (Criteria) this;
        }

        public Criteria andTsPhoneStateGreaterThan(String value) {
            addCriterion("ts_phone_state >", value, "tsPhoneState");
            return (Criteria) this;
        }

        public Criteria andTsPhoneStateGreaterThanOrEqualTo(String value) {
            addCriterion("ts_phone_state >=", value, "tsPhoneState");
            return (Criteria) this;
        }

        public Criteria andTsPhoneStateLessThan(String value) {
            addCriterion("ts_phone_state <", value, "tsPhoneState");
            return (Criteria) this;
        }

        public Criteria andTsPhoneStateLessThanOrEqualTo(String value) {
            addCriterion("ts_phone_state <=", value, "tsPhoneState");
            return (Criteria) this;
        }

        public Criteria andTsPhoneStateLike(String value) {
            addCriterion("ts_phone_state like", value, "tsPhoneState");
            return (Criteria) this;
        }

        public Criteria andTsPhoneStateNotLike(String value) {
            addCriterion("ts_phone_state not like", value, "tsPhoneState");
            return (Criteria) this;
        }

        public Criteria andTsPhoneStateIn(List<String> values) {
            addCriterion("ts_phone_state in", values, "tsPhoneState");
            return (Criteria) this;
        }

        public Criteria andTsPhoneStateNotIn(List<String> values) {
            addCriterion("ts_phone_state not in", values, "tsPhoneState");
            return (Criteria) this;
        }

        public Criteria andTsPhoneStateBetween(String value1, String value2) {
            addCriterion("ts_phone_state between", value1, value2, "tsPhoneState");
            return (Criteria) this;
        }

        public Criteria andTsPhoneStateNotBetween(String value1, String value2) {
            addCriterion("ts_phone_state not between", value1, value2, "tsPhoneState");
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