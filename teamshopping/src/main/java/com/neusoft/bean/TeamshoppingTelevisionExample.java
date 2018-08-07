package com.neusoft.bean;

import java.util.ArrayList;
import java.util.List;

public class TeamshoppingTelevisionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TeamshoppingTelevisionExample() {
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

        public Criteria andTsTvIdIsNull() {
            addCriterion("ts_tv_id is null");
            return (Criteria) this;
        }

        public Criteria andTsTvIdIsNotNull() {
            addCriterion("ts_tv_id is not null");
            return (Criteria) this;
        }

        public Criteria andTsTvIdEqualTo(Integer value) {
            addCriterion("ts_tv_id =", value, "tsTvId");
            return (Criteria) this;
        }

        public Criteria andTsTvIdNotEqualTo(Integer value) {
            addCriterion("ts_tv_id <>", value, "tsTvId");
            return (Criteria) this;
        }

        public Criteria andTsTvIdGreaterThan(Integer value) {
            addCriterion("ts_tv_id >", value, "tsTvId");
            return (Criteria) this;
        }

        public Criteria andTsTvIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ts_tv_id >=", value, "tsTvId");
            return (Criteria) this;
        }

        public Criteria andTsTvIdLessThan(Integer value) {
            addCriterion("ts_tv_id <", value, "tsTvId");
            return (Criteria) this;
        }

        public Criteria andTsTvIdLessThanOrEqualTo(Integer value) {
            addCriterion("ts_tv_id <=", value, "tsTvId");
            return (Criteria) this;
        }

        public Criteria andTsTvIdIn(List<Integer> values) {
            addCriterion("ts_tv_id in", values, "tsTvId");
            return (Criteria) this;
        }

        public Criteria andTsTvIdNotIn(List<Integer> values) {
            addCriterion("ts_tv_id not in", values, "tsTvId");
            return (Criteria) this;
        }

        public Criteria andTsTvIdBetween(Integer value1, Integer value2) {
            addCriterion("ts_tv_id between", value1, value2, "tsTvId");
            return (Criteria) this;
        }

        public Criteria andTsTvIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ts_tv_id not between", value1, value2, "tsTvId");
            return (Criteria) this;
        }

        public Criteria andTsTvBrandIsNull() {
            addCriterion("ts_tv_brand is null");
            return (Criteria) this;
        }

        public Criteria andTsTvBrandIsNotNull() {
            addCriterion("ts_tv_brand is not null");
            return (Criteria) this;
        }

        public Criteria andTsTvBrandEqualTo(String value) {
            addCriterion("ts_tv_brand =", value, "tsTvBrand");
            return (Criteria) this;
        }

        public Criteria andTsTvBrandNotEqualTo(String value) {
            addCriterion("ts_tv_brand <>", value, "tsTvBrand");
            return (Criteria) this;
        }

        public Criteria andTsTvBrandGreaterThan(String value) {
            addCriterion("ts_tv_brand >", value, "tsTvBrand");
            return (Criteria) this;
        }

        public Criteria andTsTvBrandGreaterThanOrEqualTo(String value) {
            addCriterion("ts_tv_brand >=", value, "tsTvBrand");
            return (Criteria) this;
        }

        public Criteria andTsTvBrandLessThan(String value) {
            addCriterion("ts_tv_brand <", value, "tsTvBrand");
            return (Criteria) this;
        }

        public Criteria andTsTvBrandLessThanOrEqualTo(String value) {
            addCriterion("ts_tv_brand <=", value, "tsTvBrand");
            return (Criteria) this;
        }

        public Criteria andTsTvBrandLike(String value) {
            addCriterion("ts_tv_brand like", value, "tsTvBrand");
            return (Criteria) this;
        }

        public Criteria andTsTvBrandNotLike(String value) {
            addCriterion("ts_tv_brand not like", value, "tsTvBrand");
            return (Criteria) this;
        }

        public Criteria andTsTvBrandIn(List<String> values) {
            addCriterion("ts_tv_brand in", values, "tsTvBrand");
            return (Criteria) this;
        }

        public Criteria andTsTvBrandNotIn(List<String> values) {
            addCriterion("ts_tv_brand not in", values, "tsTvBrand");
            return (Criteria) this;
        }

        public Criteria andTsTvBrandBetween(String value1, String value2) {
            addCriterion("ts_tv_brand between", value1, value2, "tsTvBrand");
            return (Criteria) this;
        }

        public Criteria andTsTvBrandNotBetween(String value1, String value2) {
            addCriterion("ts_tv_brand not between", value1, value2, "tsTvBrand");
            return (Criteria) this;
        }

        public Criteria andTsTvModelIsNull() {
            addCriterion("ts_tv_model is null");
            return (Criteria) this;
        }

        public Criteria andTsTvModelIsNotNull() {
            addCriterion("ts_tv_model is not null");
            return (Criteria) this;
        }

        public Criteria andTsTvModelEqualTo(String value) {
            addCriterion("ts_tv_model =", value, "tsTvModel");
            return (Criteria) this;
        }

        public Criteria andTsTvModelNotEqualTo(String value) {
            addCriterion("ts_tv_model <>", value, "tsTvModel");
            return (Criteria) this;
        }

        public Criteria andTsTvModelGreaterThan(String value) {
            addCriterion("ts_tv_model >", value, "tsTvModel");
            return (Criteria) this;
        }

        public Criteria andTsTvModelGreaterThanOrEqualTo(String value) {
            addCriterion("ts_tv_model >=", value, "tsTvModel");
            return (Criteria) this;
        }

        public Criteria andTsTvModelLessThan(String value) {
            addCriterion("ts_tv_model <", value, "tsTvModel");
            return (Criteria) this;
        }

        public Criteria andTsTvModelLessThanOrEqualTo(String value) {
            addCriterion("ts_tv_model <=", value, "tsTvModel");
            return (Criteria) this;
        }

        public Criteria andTsTvModelLike(String value) {
            addCriterion("ts_tv_model like", value, "tsTvModel");
            return (Criteria) this;
        }

        public Criteria andTsTvModelNotLike(String value) {
            addCriterion("ts_tv_model not like", value, "tsTvModel");
            return (Criteria) this;
        }

        public Criteria andTsTvModelIn(List<String> values) {
            addCriterion("ts_tv_model in", values, "tsTvModel");
            return (Criteria) this;
        }

        public Criteria andTsTvModelNotIn(List<String> values) {
            addCriterion("ts_tv_model not in", values, "tsTvModel");
            return (Criteria) this;
        }

        public Criteria andTsTvModelBetween(String value1, String value2) {
            addCriterion("ts_tv_model between", value1, value2, "tsTvModel");
            return (Criteria) this;
        }

        public Criteria andTsTvModelNotBetween(String value1, String value2) {
            addCriterion("ts_tv_model not between", value1, value2, "tsTvModel");
            return (Criteria) this;
        }

        public Criteria andTsTvTypeIsNull() {
            addCriterion("ts_tv_type is null");
            return (Criteria) this;
        }

        public Criteria andTsTvTypeIsNotNull() {
            addCriterion("ts_tv_type is not null");
            return (Criteria) this;
        }

        public Criteria andTsTvTypeEqualTo(String value) {
            addCriterion("ts_tv_type =", value, "tsTvType");
            return (Criteria) this;
        }

        public Criteria andTsTvTypeNotEqualTo(String value) {
            addCriterion("ts_tv_type <>", value, "tsTvType");
            return (Criteria) this;
        }

        public Criteria andTsTvTypeGreaterThan(String value) {
            addCriterion("ts_tv_type >", value, "tsTvType");
            return (Criteria) this;
        }

        public Criteria andTsTvTypeGreaterThanOrEqualTo(String value) {
            addCriterion("ts_tv_type >=", value, "tsTvType");
            return (Criteria) this;
        }

        public Criteria andTsTvTypeLessThan(String value) {
            addCriterion("ts_tv_type <", value, "tsTvType");
            return (Criteria) this;
        }

        public Criteria andTsTvTypeLessThanOrEqualTo(String value) {
            addCriterion("ts_tv_type <=", value, "tsTvType");
            return (Criteria) this;
        }

        public Criteria andTsTvTypeLike(String value) {
            addCriterion("ts_tv_type like", value, "tsTvType");
            return (Criteria) this;
        }

        public Criteria andTsTvTypeNotLike(String value) {
            addCriterion("ts_tv_type not like", value, "tsTvType");
            return (Criteria) this;
        }

        public Criteria andTsTvTypeIn(List<String> values) {
            addCriterion("ts_tv_type in", values, "tsTvType");
            return (Criteria) this;
        }

        public Criteria andTsTvTypeNotIn(List<String> values) {
            addCriterion("ts_tv_type not in", values, "tsTvType");
            return (Criteria) this;
        }

        public Criteria andTsTvTypeBetween(String value1, String value2) {
            addCriterion("ts_tv_type between", value1, value2, "tsTvType");
            return (Criteria) this;
        }

        public Criteria andTsTvTypeNotBetween(String value1, String value2) {
            addCriterion("ts_tv_type not between", value1, value2, "tsTvType");
            return (Criteria) this;
        }

        public Criteria andTsTvSizeIsNull() {
            addCriterion("ts_tv_size is null");
            return (Criteria) this;
        }

        public Criteria andTsTvSizeIsNotNull() {
            addCriterion("ts_tv_size is not null");
            return (Criteria) this;
        }

        public Criteria andTsTvSizeEqualTo(String value) {
            addCriterion("ts_tv_size =", value, "tsTvSize");
            return (Criteria) this;
        }

        public Criteria andTsTvSizeNotEqualTo(String value) {
            addCriterion("ts_tv_size <>", value, "tsTvSize");
            return (Criteria) this;
        }

        public Criteria andTsTvSizeGreaterThan(String value) {
            addCriterion("ts_tv_size >", value, "tsTvSize");
            return (Criteria) this;
        }

        public Criteria andTsTvSizeGreaterThanOrEqualTo(String value) {
            addCriterion("ts_tv_size >=", value, "tsTvSize");
            return (Criteria) this;
        }

        public Criteria andTsTvSizeLessThan(String value) {
            addCriterion("ts_tv_size <", value, "tsTvSize");
            return (Criteria) this;
        }

        public Criteria andTsTvSizeLessThanOrEqualTo(String value) {
            addCriterion("ts_tv_size <=", value, "tsTvSize");
            return (Criteria) this;
        }

        public Criteria andTsTvSizeLike(String value) {
            addCriterion("ts_tv_size like", value, "tsTvSize");
            return (Criteria) this;
        }

        public Criteria andTsTvSizeNotLike(String value) {
            addCriterion("ts_tv_size not like", value, "tsTvSize");
            return (Criteria) this;
        }

        public Criteria andTsTvSizeIn(List<String> values) {
            addCriterion("ts_tv_size in", values, "tsTvSize");
            return (Criteria) this;
        }

        public Criteria andTsTvSizeNotIn(List<String> values) {
            addCriterion("ts_tv_size not in", values, "tsTvSize");
            return (Criteria) this;
        }

        public Criteria andTsTvSizeBetween(String value1, String value2) {
            addCriterion("ts_tv_size between", value1, value2, "tsTvSize");
            return (Criteria) this;
        }

        public Criteria andTsTvSizeNotBetween(String value1, String value2) {
            addCriterion("ts_tv_size not between", value1, value2, "tsTvSize");
            return (Criteria) this;
        }

        public Criteria andTsTvColorIsNull() {
            addCriterion("ts_tv_color is null");
            return (Criteria) this;
        }

        public Criteria andTsTvColorIsNotNull() {
            addCriterion("ts_tv_color is not null");
            return (Criteria) this;
        }

        public Criteria andTsTvColorEqualTo(String value) {
            addCriterion("ts_tv_color =", value, "tsTvColor");
            return (Criteria) this;
        }

        public Criteria andTsTvColorNotEqualTo(String value) {
            addCriterion("ts_tv_color <>", value, "tsTvColor");
            return (Criteria) this;
        }

        public Criteria andTsTvColorGreaterThan(String value) {
            addCriterion("ts_tv_color >", value, "tsTvColor");
            return (Criteria) this;
        }

        public Criteria andTsTvColorGreaterThanOrEqualTo(String value) {
            addCriterion("ts_tv_color >=", value, "tsTvColor");
            return (Criteria) this;
        }

        public Criteria andTsTvColorLessThan(String value) {
            addCriterion("ts_tv_color <", value, "tsTvColor");
            return (Criteria) this;
        }

        public Criteria andTsTvColorLessThanOrEqualTo(String value) {
            addCriterion("ts_tv_color <=", value, "tsTvColor");
            return (Criteria) this;
        }

        public Criteria andTsTvColorLike(String value) {
            addCriterion("ts_tv_color like", value, "tsTvColor");
            return (Criteria) this;
        }

        public Criteria andTsTvColorNotLike(String value) {
            addCriterion("ts_tv_color not like", value, "tsTvColor");
            return (Criteria) this;
        }

        public Criteria andTsTvColorIn(List<String> values) {
            addCriterion("ts_tv_color in", values, "tsTvColor");
            return (Criteria) this;
        }

        public Criteria andTsTvColorNotIn(List<String> values) {
            addCriterion("ts_tv_color not in", values, "tsTvColor");
            return (Criteria) this;
        }

        public Criteria andTsTvColorBetween(String value1, String value2) {
            addCriterion("ts_tv_color between", value1, value2, "tsTvColor");
            return (Criteria) this;
        }

        public Criteria andTsTvColorNotBetween(String value1, String value2) {
            addCriterion("ts_tv_color not between", value1, value2, "tsTvColor");
            return (Criteria) this;
        }

        public Criteria andTsTvKernelIsNull() {
            addCriterion("ts_tv_kernel is null");
            return (Criteria) this;
        }

        public Criteria andTsTvKernelIsNotNull() {
            addCriterion("ts_tv_kernel is not null");
            return (Criteria) this;
        }

        public Criteria andTsTvKernelEqualTo(String value) {
            addCriterion("ts_tv_kernel =", value, "tsTvKernel");
            return (Criteria) this;
        }

        public Criteria andTsTvKernelNotEqualTo(String value) {
            addCriterion("ts_tv_kernel <>", value, "tsTvKernel");
            return (Criteria) this;
        }

        public Criteria andTsTvKernelGreaterThan(String value) {
            addCriterion("ts_tv_kernel >", value, "tsTvKernel");
            return (Criteria) this;
        }

        public Criteria andTsTvKernelGreaterThanOrEqualTo(String value) {
            addCriterion("ts_tv_kernel >=", value, "tsTvKernel");
            return (Criteria) this;
        }

        public Criteria andTsTvKernelLessThan(String value) {
            addCriterion("ts_tv_kernel <", value, "tsTvKernel");
            return (Criteria) this;
        }

        public Criteria andTsTvKernelLessThanOrEqualTo(String value) {
            addCriterion("ts_tv_kernel <=", value, "tsTvKernel");
            return (Criteria) this;
        }

        public Criteria andTsTvKernelLike(String value) {
            addCriterion("ts_tv_kernel like", value, "tsTvKernel");
            return (Criteria) this;
        }

        public Criteria andTsTvKernelNotLike(String value) {
            addCriterion("ts_tv_kernel not like", value, "tsTvKernel");
            return (Criteria) this;
        }

        public Criteria andTsTvKernelIn(List<String> values) {
            addCriterion("ts_tv_kernel in", values, "tsTvKernel");
            return (Criteria) this;
        }

        public Criteria andTsTvKernelNotIn(List<String> values) {
            addCriterion("ts_tv_kernel not in", values, "tsTvKernel");
            return (Criteria) this;
        }

        public Criteria andTsTvKernelBetween(String value1, String value2) {
            addCriterion("ts_tv_kernel between", value1, value2, "tsTvKernel");
            return (Criteria) this;
        }

        public Criteria andTsTvKernelNotBetween(String value1, String value2) {
            addCriterion("ts_tv_kernel not between", value1, value2, "tsTvKernel");
            return (Criteria) this;
        }

        public Criteria andTsTvAudioIsNull() {
            addCriterion("ts_tv_audio is null");
            return (Criteria) this;
        }

        public Criteria andTsTvAudioIsNotNull() {
            addCriterion("ts_tv_audio is not null");
            return (Criteria) this;
        }

        public Criteria andTsTvAudioEqualTo(String value) {
            addCriterion("ts_tv_audio =", value, "tsTvAudio");
            return (Criteria) this;
        }

        public Criteria andTsTvAudioNotEqualTo(String value) {
            addCriterion("ts_tv_audio <>", value, "tsTvAudio");
            return (Criteria) this;
        }

        public Criteria andTsTvAudioGreaterThan(String value) {
            addCriterion("ts_tv_audio >", value, "tsTvAudio");
            return (Criteria) this;
        }

        public Criteria andTsTvAudioGreaterThanOrEqualTo(String value) {
            addCriterion("ts_tv_audio >=", value, "tsTvAudio");
            return (Criteria) this;
        }

        public Criteria andTsTvAudioLessThan(String value) {
            addCriterion("ts_tv_audio <", value, "tsTvAudio");
            return (Criteria) this;
        }

        public Criteria andTsTvAudioLessThanOrEqualTo(String value) {
            addCriterion("ts_tv_audio <=", value, "tsTvAudio");
            return (Criteria) this;
        }

        public Criteria andTsTvAudioLike(String value) {
            addCriterion("ts_tv_audio like", value, "tsTvAudio");
            return (Criteria) this;
        }

        public Criteria andTsTvAudioNotLike(String value) {
            addCriterion("ts_tv_audio not like", value, "tsTvAudio");
            return (Criteria) this;
        }

        public Criteria andTsTvAudioIn(List<String> values) {
            addCriterion("ts_tv_audio in", values, "tsTvAudio");
            return (Criteria) this;
        }

        public Criteria andTsTvAudioNotIn(List<String> values) {
            addCriterion("ts_tv_audio not in", values, "tsTvAudio");
            return (Criteria) this;
        }

        public Criteria andTsTvAudioBetween(String value1, String value2) {
            addCriterion("ts_tv_audio between", value1, value2, "tsTvAudio");
            return (Criteria) this;
        }

        public Criteria andTsTvAudioNotBetween(String value1, String value2) {
            addCriterion("ts_tv_audio not between", value1, value2, "tsTvAudio");
            return (Criteria) this;
        }

        public Criteria andTsTvMemoryIsNull() {
            addCriterion("ts_tv_memory is null");
            return (Criteria) this;
        }

        public Criteria andTsTvMemoryIsNotNull() {
            addCriterion("ts_tv_memory is not null");
            return (Criteria) this;
        }

        public Criteria andTsTvMemoryEqualTo(String value) {
            addCriterion("ts_tv_memory =", value, "tsTvMemory");
            return (Criteria) this;
        }

        public Criteria andTsTvMemoryNotEqualTo(String value) {
            addCriterion("ts_tv_memory <>", value, "tsTvMemory");
            return (Criteria) this;
        }

        public Criteria andTsTvMemoryGreaterThan(String value) {
            addCriterion("ts_tv_memory >", value, "tsTvMemory");
            return (Criteria) this;
        }

        public Criteria andTsTvMemoryGreaterThanOrEqualTo(String value) {
            addCriterion("ts_tv_memory >=", value, "tsTvMemory");
            return (Criteria) this;
        }

        public Criteria andTsTvMemoryLessThan(String value) {
            addCriterion("ts_tv_memory <", value, "tsTvMemory");
            return (Criteria) this;
        }

        public Criteria andTsTvMemoryLessThanOrEqualTo(String value) {
            addCriterion("ts_tv_memory <=", value, "tsTvMemory");
            return (Criteria) this;
        }

        public Criteria andTsTvMemoryLike(String value) {
            addCriterion("ts_tv_memory like", value, "tsTvMemory");
            return (Criteria) this;
        }

        public Criteria andTsTvMemoryNotLike(String value) {
            addCriterion("ts_tv_memory not like", value, "tsTvMemory");
            return (Criteria) this;
        }

        public Criteria andTsTvMemoryIn(List<String> values) {
            addCriterion("ts_tv_memory in", values, "tsTvMemory");
            return (Criteria) this;
        }

        public Criteria andTsTvMemoryNotIn(List<String> values) {
            addCriterion("ts_tv_memory not in", values, "tsTvMemory");
            return (Criteria) this;
        }

        public Criteria andTsTvMemoryBetween(String value1, String value2) {
            addCriterion("ts_tv_memory between", value1, value2, "tsTvMemory");
            return (Criteria) this;
        }

        public Criteria andTsTvMemoryNotBetween(String value1, String value2) {
            addCriterion("ts_tv_memory not between", value1, value2, "tsTvMemory");
            return (Criteria) this;
        }

        public Criteria andTsTvGuaranteeIsNull() {
            addCriterion("ts_tv_guarantee is null");
            return (Criteria) this;
        }

        public Criteria andTsTvGuaranteeIsNotNull() {
            addCriterion("ts_tv_guarantee is not null");
            return (Criteria) this;
        }

        public Criteria andTsTvGuaranteeEqualTo(String value) {
            addCriterion("ts_tv_guarantee =", value, "tsTvGuarantee");
            return (Criteria) this;
        }

        public Criteria andTsTvGuaranteeNotEqualTo(String value) {
            addCriterion("ts_tv_guarantee <>", value, "tsTvGuarantee");
            return (Criteria) this;
        }

        public Criteria andTsTvGuaranteeGreaterThan(String value) {
            addCriterion("ts_tv_guarantee >", value, "tsTvGuarantee");
            return (Criteria) this;
        }

        public Criteria andTsTvGuaranteeGreaterThanOrEqualTo(String value) {
            addCriterion("ts_tv_guarantee >=", value, "tsTvGuarantee");
            return (Criteria) this;
        }

        public Criteria andTsTvGuaranteeLessThan(String value) {
            addCriterion("ts_tv_guarantee <", value, "tsTvGuarantee");
            return (Criteria) this;
        }

        public Criteria andTsTvGuaranteeLessThanOrEqualTo(String value) {
            addCriterion("ts_tv_guarantee <=", value, "tsTvGuarantee");
            return (Criteria) this;
        }

        public Criteria andTsTvGuaranteeLike(String value) {
            addCriterion("ts_tv_guarantee like", value, "tsTvGuarantee");
            return (Criteria) this;
        }

        public Criteria andTsTvGuaranteeNotLike(String value) {
            addCriterion("ts_tv_guarantee not like", value, "tsTvGuarantee");
            return (Criteria) this;
        }

        public Criteria andTsTvGuaranteeIn(List<String> values) {
            addCriterion("ts_tv_guarantee in", values, "tsTvGuarantee");
            return (Criteria) this;
        }

        public Criteria andTsTvGuaranteeNotIn(List<String> values) {
            addCriterion("ts_tv_guarantee not in", values, "tsTvGuarantee");
            return (Criteria) this;
        }

        public Criteria andTsTvGuaranteeBetween(String value1, String value2) {
            addCriterion("ts_tv_guarantee between", value1, value2, "tsTvGuarantee");
            return (Criteria) this;
        }

        public Criteria andTsTvGuaranteeNotBetween(String value1, String value2) {
            addCriterion("ts_tv_guarantee not between", value1, value2, "tsTvGuarantee");
            return (Criteria) this;
        }

        public Criteria andTsTvSystemIsNull() {
            addCriterion("ts_tv_system is null");
            return (Criteria) this;
        }

        public Criteria andTsTvSystemIsNotNull() {
            addCriterion("ts_tv_system is not null");
            return (Criteria) this;
        }

        public Criteria andTsTvSystemEqualTo(String value) {
            addCriterion("ts_tv_system =", value, "tsTvSystem");
            return (Criteria) this;
        }

        public Criteria andTsTvSystemNotEqualTo(String value) {
            addCriterion("ts_tv_system <>", value, "tsTvSystem");
            return (Criteria) this;
        }

        public Criteria andTsTvSystemGreaterThan(String value) {
            addCriterion("ts_tv_system >", value, "tsTvSystem");
            return (Criteria) this;
        }

        public Criteria andTsTvSystemGreaterThanOrEqualTo(String value) {
            addCriterion("ts_tv_system >=", value, "tsTvSystem");
            return (Criteria) this;
        }

        public Criteria andTsTvSystemLessThan(String value) {
            addCriterion("ts_tv_system <", value, "tsTvSystem");
            return (Criteria) this;
        }

        public Criteria andTsTvSystemLessThanOrEqualTo(String value) {
            addCriterion("ts_tv_system <=", value, "tsTvSystem");
            return (Criteria) this;
        }

        public Criteria andTsTvSystemLike(String value) {
            addCriterion("ts_tv_system like", value, "tsTvSystem");
            return (Criteria) this;
        }

        public Criteria andTsTvSystemNotLike(String value) {
            addCriterion("ts_tv_system not like", value, "tsTvSystem");
            return (Criteria) this;
        }

        public Criteria andTsTvSystemIn(List<String> values) {
            addCriterion("ts_tv_system in", values, "tsTvSystem");
            return (Criteria) this;
        }

        public Criteria andTsTvSystemNotIn(List<String> values) {
            addCriterion("ts_tv_system not in", values, "tsTvSystem");
            return (Criteria) this;
        }

        public Criteria andTsTvSystemBetween(String value1, String value2) {
            addCriterion("ts_tv_system between", value1, value2, "tsTvSystem");
            return (Criteria) this;
        }

        public Criteria andTsTvSystemNotBetween(String value1, String value2) {
            addCriterion("ts_tv_system not between", value1, value2, "tsTvSystem");
            return (Criteria) this;
        }

        public Criteria andTsTvPictureIsNull() {
            addCriterion("ts_tv_picture is null");
            return (Criteria) this;
        }

        public Criteria andTsTvPictureIsNotNull() {
            addCriterion("ts_tv_picture is not null");
            return (Criteria) this;
        }

        public Criteria andTsTvPictureEqualTo(String value) {
            addCriterion("ts_tv_picture =", value, "tsTvPicture");
            return (Criteria) this;
        }

        public Criteria andTsTvPictureNotEqualTo(String value) {
            addCriterion("ts_tv_picture <>", value, "tsTvPicture");
            return (Criteria) this;
        }

        public Criteria andTsTvPictureGreaterThan(String value) {
            addCriterion("ts_tv_picture >", value, "tsTvPicture");
            return (Criteria) this;
        }

        public Criteria andTsTvPictureGreaterThanOrEqualTo(String value) {
            addCriterion("ts_tv_picture >=", value, "tsTvPicture");
            return (Criteria) this;
        }

        public Criteria andTsTvPictureLessThan(String value) {
            addCriterion("ts_tv_picture <", value, "tsTvPicture");
            return (Criteria) this;
        }

        public Criteria andTsTvPictureLessThanOrEqualTo(String value) {
            addCriterion("ts_tv_picture <=", value, "tsTvPicture");
            return (Criteria) this;
        }

        public Criteria andTsTvPictureLike(String value) {
            addCriterion("ts_tv_picture like", value, "tsTvPicture");
            return (Criteria) this;
        }

        public Criteria andTsTvPictureNotLike(String value) {
            addCriterion("ts_tv_picture not like", value, "tsTvPicture");
            return (Criteria) this;
        }

        public Criteria andTsTvPictureIn(List<String> values) {
            addCriterion("ts_tv_picture in", values, "tsTvPicture");
            return (Criteria) this;
        }

        public Criteria andTsTvPictureNotIn(List<String> values) {
            addCriterion("ts_tv_picture not in", values, "tsTvPicture");
            return (Criteria) this;
        }

        public Criteria andTsTvPictureBetween(String value1, String value2) {
            addCriterion("ts_tv_picture between", value1, value2, "tsTvPicture");
            return (Criteria) this;
        }

        public Criteria andTsTvPictureNotBetween(String value1, String value2) {
            addCriterion("ts_tv_picture not between", value1, value2, "tsTvPicture");
            return (Criteria) this;
        }

        public Criteria andTsTvNumberIsNull() {
            addCriterion("ts_tv_number is null");
            return (Criteria) this;
        }

        public Criteria andTsTvNumberIsNotNull() {
            addCriterion("ts_tv_number is not null");
            return (Criteria) this;
        }

        public Criteria andTsTvNumberEqualTo(Integer value) {
            addCriterion("ts_tv_number =", value, "tsTvNumber");
            return (Criteria) this;
        }

        public Criteria andTsTvNumberNotEqualTo(Integer value) {
            addCriterion("ts_tv_number <>", value, "tsTvNumber");
            return (Criteria) this;
        }

        public Criteria andTsTvNumberGreaterThan(Integer value) {
            addCriterion("ts_tv_number >", value, "tsTvNumber");
            return (Criteria) this;
        }

        public Criteria andTsTvNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("ts_tv_number >=", value, "tsTvNumber");
            return (Criteria) this;
        }

        public Criteria andTsTvNumberLessThan(Integer value) {
            addCriterion("ts_tv_number <", value, "tsTvNumber");
            return (Criteria) this;
        }

        public Criteria andTsTvNumberLessThanOrEqualTo(Integer value) {
            addCriterion("ts_tv_number <=", value, "tsTvNumber");
            return (Criteria) this;
        }

        public Criteria andTsTvNumberIn(List<Integer> values) {
            addCriterion("ts_tv_number in", values, "tsTvNumber");
            return (Criteria) this;
        }

        public Criteria andTsTvNumberNotIn(List<Integer> values) {
            addCriterion("ts_tv_number not in", values, "tsTvNumber");
            return (Criteria) this;
        }

        public Criteria andTsTvNumberBetween(Integer value1, Integer value2) {
            addCriterion("ts_tv_number between", value1, value2, "tsTvNumber");
            return (Criteria) this;
        }

        public Criteria andTsTvNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("ts_tv_number not between", value1, value2, "tsTvNumber");
            return (Criteria) this;
        }

        public Criteria andTsTvMoneyIsNull() {
            addCriterion("ts_tv_money is null");
            return (Criteria) this;
        }

        public Criteria andTsTvMoneyIsNotNull() {
            addCriterion("ts_tv_money is not null");
            return (Criteria) this;
        }

        public Criteria andTsTvMoneyEqualTo(Double value) {
            addCriterion("ts_tv_money =", value, "tsTvMoney");
            return (Criteria) this;
        }

        public Criteria andTsTvMoneyNotEqualTo(Double value) {
            addCriterion("ts_tv_money <>", value, "tsTvMoney");
            return (Criteria) this;
        }

        public Criteria andTsTvMoneyGreaterThan(Double value) {
            addCriterion("ts_tv_money >", value, "tsTvMoney");
            return (Criteria) this;
        }

        public Criteria andTsTvMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("ts_tv_money >=", value, "tsTvMoney");
            return (Criteria) this;
        }

        public Criteria andTsTvMoneyLessThan(Double value) {
            addCriterion("ts_tv_money <", value, "tsTvMoney");
            return (Criteria) this;
        }

        public Criteria andTsTvMoneyLessThanOrEqualTo(Double value) {
            addCriterion("ts_tv_money <=", value, "tsTvMoney");
            return (Criteria) this;
        }

        public Criteria andTsTvMoneyIn(List<Double> values) {
            addCriterion("ts_tv_money in", values, "tsTvMoney");
            return (Criteria) this;
        }

        public Criteria andTsTvMoneyNotIn(List<Double> values) {
            addCriterion("ts_tv_money not in", values, "tsTvMoney");
            return (Criteria) this;
        }

        public Criteria andTsTvMoneyBetween(Double value1, Double value2) {
            addCriterion("ts_tv_money between", value1, value2, "tsTvMoney");
            return (Criteria) this;
        }

        public Criteria andTsTvMoneyNotBetween(Double value1, Double value2) {
            addCriterion("ts_tv_money not between", value1, value2, "tsTvMoney");
            return (Criteria) this;
        }

        public Criteria andTsTvIntroduceIsNull() {
            addCriterion("ts_tv_introduce is null");
            return (Criteria) this;
        }

        public Criteria andTsTvIntroduceIsNotNull() {
            addCriterion("ts_tv_introduce is not null");
            return (Criteria) this;
        }

        public Criteria andTsTvIntroduceEqualTo(String value) {
            addCriterion("ts_tv_introduce =", value, "tsTvIntroduce");
            return (Criteria) this;
        }

        public Criteria andTsTvIntroduceNotEqualTo(String value) {
            addCriterion("ts_tv_introduce <>", value, "tsTvIntroduce");
            return (Criteria) this;
        }

        public Criteria andTsTvIntroduceGreaterThan(String value) {
            addCriterion("ts_tv_introduce >", value, "tsTvIntroduce");
            return (Criteria) this;
        }

        public Criteria andTsTvIntroduceGreaterThanOrEqualTo(String value) {
            addCriterion("ts_tv_introduce >=", value, "tsTvIntroduce");
            return (Criteria) this;
        }

        public Criteria andTsTvIntroduceLessThan(String value) {
            addCriterion("ts_tv_introduce <", value, "tsTvIntroduce");
            return (Criteria) this;
        }

        public Criteria andTsTvIntroduceLessThanOrEqualTo(String value) {
            addCriterion("ts_tv_introduce <=", value, "tsTvIntroduce");
            return (Criteria) this;
        }

        public Criteria andTsTvIntroduceLike(String value) {
            addCriterion("ts_tv_introduce like", value, "tsTvIntroduce");
            return (Criteria) this;
        }

        public Criteria andTsTvIntroduceNotLike(String value) {
            addCriterion("ts_tv_introduce not like", value, "tsTvIntroduce");
            return (Criteria) this;
        }

        public Criteria andTsTvIntroduceIn(List<String> values) {
            addCriterion("ts_tv_introduce in", values, "tsTvIntroduce");
            return (Criteria) this;
        }

        public Criteria andTsTvIntroduceNotIn(List<String> values) {
            addCriterion("ts_tv_introduce not in", values, "tsTvIntroduce");
            return (Criteria) this;
        }

        public Criteria andTsTvIntroduceBetween(String value1, String value2) {
            addCriterion("ts_tv_introduce between", value1, value2, "tsTvIntroduce");
            return (Criteria) this;
        }

        public Criteria andTsTvIntroduceNotBetween(String value1, String value2) {
            addCriterion("ts_tv_introduce not between", value1, value2, "tsTvIntroduce");
            return (Criteria) this;
        }

        public Criteria andTsTvStateIsNull() {
            addCriterion("ts_tv_state is null");
            return (Criteria) this;
        }

        public Criteria andTsTvStateIsNotNull() {
            addCriterion("ts_tv_state is not null");
            return (Criteria) this;
        }

        public Criteria andTsTvStateEqualTo(String value) {
            addCriterion("ts_tv_state =", value, "tsTvState");
            return (Criteria) this;
        }

        public Criteria andTsTvStateNotEqualTo(String value) {
            addCriterion("ts_tv_state <>", value, "tsTvState");
            return (Criteria) this;
        }

        public Criteria andTsTvStateGreaterThan(String value) {
            addCriterion("ts_tv_state >", value, "tsTvState");
            return (Criteria) this;
        }

        public Criteria andTsTvStateGreaterThanOrEqualTo(String value) {
            addCriterion("ts_tv_state >=", value, "tsTvState");
            return (Criteria) this;
        }

        public Criteria andTsTvStateLessThan(String value) {
            addCriterion("ts_tv_state <", value, "tsTvState");
            return (Criteria) this;
        }

        public Criteria andTsTvStateLessThanOrEqualTo(String value) {
            addCriterion("ts_tv_state <=", value, "tsTvState");
            return (Criteria) this;
        }

        public Criteria andTsTvStateLike(String value) {
            addCriterion("ts_tv_state like", value, "tsTvState");
            return (Criteria) this;
        }

        public Criteria andTsTvStateNotLike(String value) {
            addCriterion("ts_tv_state not like", value, "tsTvState");
            return (Criteria) this;
        }

        public Criteria andTsTvStateIn(List<String> values) {
            addCriterion("ts_tv_state in", values, "tsTvState");
            return (Criteria) this;
        }

        public Criteria andTsTvStateNotIn(List<String> values) {
            addCriterion("ts_tv_state not in", values, "tsTvState");
            return (Criteria) this;
        }

        public Criteria andTsTvStateBetween(String value1, String value2) {
            addCriterion("ts_tv_state between", value1, value2, "tsTvState");
            return (Criteria) this;
        }

        public Criteria andTsTvStateNotBetween(String value1, String value2) {
            addCriterion("ts_tv_state not between", value1, value2, "tsTvState");
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