package com.iguan.entity.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CHBasicInfoXltInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CHBasicInfoXltInfoExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andBasicIdIsNull() {
            addCriterion("BASIC_ID is null");
            return (Criteria) this;
        }

        public Criteria andBasicIdIsNotNull() {
            addCriterion("BASIC_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBasicIdEqualTo(Long value) {
            addCriterion("BASIC_ID =", value, "basicId");
            return (Criteria) this;
        }

        public Criteria andBasicIdNotEqualTo(Long value) {
            addCriterion("BASIC_ID <>", value, "basicId");
            return (Criteria) this;
        }

        public Criteria andBasicIdGreaterThan(Long value) {
            addCriterion("BASIC_ID >", value, "basicId");
            return (Criteria) this;
        }

        public Criteria andBasicIdGreaterThanOrEqualTo(Long value) {
            addCriterion("BASIC_ID >=", value, "basicId");
            return (Criteria) this;
        }

        public Criteria andBasicIdLessThan(Long value) {
            addCriterion("BASIC_ID <", value, "basicId");
            return (Criteria) this;
        }

        public Criteria andBasicIdLessThanOrEqualTo(Long value) {
            addCriterion("BASIC_ID <=", value, "basicId");
            return (Criteria) this;
        }

        public Criteria andBasicIdIn(List<Long> values) {
            addCriterion("BASIC_ID in", values, "basicId");
            return (Criteria) this;
        }

        public Criteria andBasicIdNotIn(List<Long> values) {
            addCriterion("BASIC_ID not in", values, "basicId");
            return (Criteria) this;
        }

        public Criteria andBasicIdBetween(Long value1, Long value2) {
            addCriterion("BASIC_ID between", value1, value2, "basicId");
            return (Criteria) this;
        }

        public Criteria andBasicIdNotBetween(Long value1, Long value2) {
            addCriterion("BASIC_ID not between", value1, value2, "basicId");
            return (Criteria) this;
        }

        public Criteria andLocIdIsNull() {
            addCriterion("LOC_ID is null");
            return (Criteria) this;
        }

        public Criteria andLocIdIsNotNull() {
            addCriterion("LOC_ID is not null");
            return (Criteria) this;
        }

        public Criteria andLocIdEqualTo(Long value) {
            addCriterion("LOC_ID =", value, "locId");
            return (Criteria) this;
        }

        public Criteria andLocIdNotEqualTo(Long value) {
            addCriterion("LOC_ID <>", value, "locId");
            return (Criteria) this;
        }

        public Criteria andLocIdGreaterThan(Long value) {
            addCriterion("LOC_ID >", value, "locId");
            return (Criteria) this;
        }

        public Criteria andLocIdGreaterThanOrEqualTo(Long value) {
            addCriterion("LOC_ID >=", value, "locId");
            return (Criteria) this;
        }

        public Criteria andLocIdLessThan(Long value) {
            addCriterion("LOC_ID <", value, "locId");
            return (Criteria) this;
        }

        public Criteria andLocIdLessThanOrEqualTo(Long value) {
            addCriterion("LOC_ID <=", value, "locId");
            return (Criteria) this;
        }

        public Criteria andLocIdIn(List<Long> values) {
            addCriterion("LOC_ID in", values, "locId");
            return (Criteria) this;
        }

        public Criteria andLocIdNotIn(List<Long> values) {
            addCriterion("LOC_ID not in", values, "locId");
            return (Criteria) this;
        }

        public Criteria andLocIdBetween(Long value1, Long value2) {
            addCriterion("LOC_ID between", value1, value2, "locId");
            return (Criteria) this;
        }

        public Criteria andLocIdNotBetween(Long value1, Long value2) {
            addCriterion("LOC_ID not between", value1, value2, "locId");
            return (Criteria) this;
        }

        public Criteria andLngElectricityIsNull() {
            addCriterion("LNG_ELECTRICITY is null");
            return (Criteria) this;
        }

        public Criteria andLngElectricityIsNotNull() {
            addCriterion("LNG_ELECTRICITY is not null");
            return (Criteria) this;
        }

        public Criteria andLngElectricityEqualTo(Integer value) {
            addCriterion("LNG_ELECTRICITY =", value, "lngElectricity");
            return (Criteria) this;
        }

        public Criteria andLngElectricityNotEqualTo(Integer value) {
            addCriterion("LNG_ELECTRICITY <>", value, "lngElectricity");
            return (Criteria) this;
        }

        public Criteria andLngElectricityGreaterThan(Integer value) {
            addCriterion("LNG_ELECTRICITY >", value, "lngElectricity");
            return (Criteria) this;
        }

        public Criteria andLngElectricityGreaterThanOrEqualTo(Integer value) {
            addCriterion("LNG_ELECTRICITY >=", value, "lngElectricity");
            return (Criteria) this;
        }

        public Criteria andLngElectricityLessThan(Integer value) {
            addCriterion("LNG_ELECTRICITY <", value, "lngElectricity");
            return (Criteria) this;
        }

        public Criteria andLngElectricityLessThanOrEqualTo(Integer value) {
            addCriterion("LNG_ELECTRICITY <=", value, "lngElectricity");
            return (Criteria) this;
        }

        public Criteria andLngElectricityIn(List<Integer> values) {
            addCriterion("LNG_ELECTRICITY in", values, "lngElectricity");
            return (Criteria) this;
        }

        public Criteria andLngElectricityNotIn(List<Integer> values) {
            addCriterion("LNG_ELECTRICITY not in", values, "lngElectricity");
            return (Criteria) this;
        }

        public Criteria andLngElectricityBetween(Integer value1, Integer value2) {
            addCriterion("LNG_ELECTRICITY between", value1, value2, "lngElectricity");
            return (Criteria) this;
        }

        public Criteria andLngElectricityNotBetween(Integer value1, Integer value2) {
            addCriterion("LNG_ELECTRICITY not between", value1, value2, "lngElectricity");
            return (Criteria) this;
        }

        public Criteria andLngSourceCodeIsNull() {
            addCriterion("LNG_SOURCE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andLngSourceCodeIsNotNull() {
            addCriterion("LNG_SOURCE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andLngSourceCodeEqualTo(String value) {
            addCriterion("LNG_SOURCE_CODE =", value, "lngSourceCode");
            return (Criteria) this;
        }

        public Criteria andLngSourceCodeNotEqualTo(String value) {
            addCriterion("LNG_SOURCE_CODE <>", value, "lngSourceCode");
            return (Criteria) this;
        }

        public Criteria andLngSourceCodeGreaterThan(String value) {
            addCriterion("LNG_SOURCE_CODE >", value, "lngSourceCode");
            return (Criteria) this;
        }

        public Criteria andLngSourceCodeGreaterThanOrEqualTo(String value) {
            addCriterion("LNG_SOURCE_CODE >=", value, "lngSourceCode");
            return (Criteria) this;
        }

        public Criteria andLngSourceCodeLessThan(String value) {
            addCriterion("LNG_SOURCE_CODE <", value, "lngSourceCode");
            return (Criteria) this;
        }

        public Criteria andLngSourceCodeLessThanOrEqualTo(String value) {
            addCriterion("LNG_SOURCE_CODE <=", value, "lngSourceCode");
            return (Criteria) this;
        }

        public Criteria andLngSourceCodeLike(String value) {
            addCriterion("LNG_SOURCE_CODE like", value, "lngSourceCode");
            return (Criteria) this;
        }

        public Criteria andLngSourceCodeNotLike(String value) {
            addCriterion("LNG_SOURCE_CODE not like", value, "lngSourceCode");
            return (Criteria) this;
        }

        public Criteria andLngSourceCodeIn(List<String> values) {
            addCriterion("LNG_SOURCE_CODE in", values, "lngSourceCode");
            return (Criteria) this;
        }

        public Criteria andLngSourceCodeNotIn(List<String> values) {
            addCriterion("LNG_SOURCE_CODE not in", values, "lngSourceCode");
            return (Criteria) this;
        }

        public Criteria andLngSourceCodeBetween(String value1, String value2) {
            addCriterion("LNG_SOURCE_CODE between", value1, value2, "lngSourceCode");
            return (Criteria) this;
        }

        public Criteria andLngSourceCodeNotBetween(String value1, String value2) {
            addCriterion("LNG_SOURCE_CODE not between", value1, value2, "lngSourceCode");
            return (Criteria) this;
        }

        public Criteria andLngTargetCodeIsNull() {
            addCriterion("LNG_TARGET_CODE is null");
            return (Criteria) this;
        }

        public Criteria andLngTargetCodeIsNotNull() {
            addCriterion("LNG_TARGET_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andLngTargetCodeEqualTo(String value) {
            addCriterion("LNG_TARGET_CODE =", value, "lngTargetCode");
            return (Criteria) this;
        }

        public Criteria andLngTargetCodeNotEqualTo(String value) {
            addCriterion("LNG_TARGET_CODE <>", value, "lngTargetCode");
            return (Criteria) this;
        }

        public Criteria andLngTargetCodeGreaterThan(String value) {
            addCriterion("LNG_TARGET_CODE >", value, "lngTargetCode");
            return (Criteria) this;
        }

        public Criteria andLngTargetCodeGreaterThanOrEqualTo(String value) {
            addCriterion("LNG_TARGET_CODE >=", value, "lngTargetCode");
            return (Criteria) this;
        }

        public Criteria andLngTargetCodeLessThan(String value) {
            addCriterion("LNG_TARGET_CODE <", value, "lngTargetCode");
            return (Criteria) this;
        }

        public Criteria andLngTargetCodeLessThanOrEqualTo(String value) {
            addCriterion("LNG_TARGET_CODE <=", value, "lngTargetCode");
            return (Criteria) this;
        }

        public Criteria andLngTargetCodeLike(String value) {
            addCriterion("LNG_TARGET_CODE like", value, "lngTargetCode");
            return (Criteria) this;
        }

        public Criteria andLngTargetCodeNotLike(String value) {
            addCriterion("LNG_TARGET_CODE not like", value, "lngTargetCode");
            return (Criteria) this;
        }

        public Criteria andLngTargetCodeIn(List<String> values) {
            addCriterion("LNG_TARGET_CODE in", values, "lngTargetCode");
            return (Criteria) this;
        }

        public Criteria andLngTargetCodeNotIn(List<String> values) {
            addCriterion("LNG_TARGET_CODE not in", values, "lngTargetCode");
            return (Criteria) this;
        }

        public Criteria andLngTargetCodeBetween(String value1, String value2) {
            addCriterion("LNG_TARGET_CODE between", value1, value2, "lngTargetCode");
            return (Criteria) this;
        }

        public Criteria andLngTargetCodeNotBetween(String value1, String value2) {
            addCriterion("LNG_TARGET_CODE not between", value1, value2, "lngTargetCode");
            return (Criteria) this;
        }

        public Criteria andXltSourceContextIsNull() {
            addCriterion("XLT_SOURCE_CONTEXT is null");
            return (Criteria) this;
        }

        public Criteria andXltSourceContextIsNotNull() {
            addCriterion("XLT_SOURCE_CONTEXT is not null");
            return (Criteria) this;
        }

        public Criteria andXltSourceContextEqualTo(String value) {
            addCriterion("XLT_SOURCE_CONTEXT =", value, "xltSourceContext");
            return (Criteria) this;
        }

        public Criteria andXltSourceContextNotEqualTo(String value) {
            addCriterion("XLT_SOURCE_CONTEXT <>", value, "xltSourceContext");
            return (Criteria) this;
        }

        public Criteria andXltSourceContextGreaterThan(String value) {
            addCriterion("XLT_SOURCE_CONTEXT >", value, "xltSourceContext");
            return (Criteria) this;
        }

        public Criteria andXltSourceContextGreaterThanOrEqualTo(String value) {
            addCriterion("XLT_SOURCE_CONTEXT >=", value, "xltSourceContext");
            return (Criteria) this;
        }

        public Criteria andXltSourceContextLessThan(String value) {
            addCriterion("XLT_SOURCE_CONTEXT <", value, "xltSourceContext");
            return (Criteria) this;
        }

        public Criteria andXltSourceContextLessThanOrEqualTo(String value) {
            addCriterion("XLT_SOURCE_CONTEXT <=", value, "xltSourceContext");
            return (Criteria) this;
        }

        public Criteria andXltSourceContextLike(String value) {
            addCriterion("XLT_SOURCE_CONTEXT like", value, "xltSourceContext");
            return (Criteria) this;
        }

        public Criteria andXltSourceContextNotLike(String value) {
            addCriterion("XLT_SOURCE_CONTEXT not like", value, "xltSourceContext");
            return (Criteria) this;
        }

        public Criteria andXltSourceContextIn(List<String> values) {
            addCriterion("XLT_SOURCE_CONTEXT in", values, "xltSourceContext");
            return (Criteria) this;
        }

        public Criteria andXltSourceContextNotIn(List<String> values) {
            addCriterion("XLT_SOURCE_CONTEXT not in", values, "xltSourceContext");
            return (Criteria) this;
        }

        public Criteria andXltSourceContextBetween(String value1, String value2) {
            addCriterion("XLT_SOURCE_CONTEXT between", value1, value2, "xltSourceContext");
            return (Criteria) this;
        }

        public Criteria andXltSourceContextNotBetween(String value1, String value2) {
            addCriterion("XLT_SOURCE_CONTEXT not between", value1, value2, "xltSourceContext");
            return (Criteria) this;
        }

        public Criteria andXltTargetContextIsNull() {
            addCriterion("XLT_TARGET_CONTEXT is null");
            return (Criteria) this;
        }

        public Criteria andXltTargetContextIsNotNull() {
            addCriterion("XLT_TARGET_CONTEXT is not null");
            return (Criteria) this;
        }

        public Criteria andXltTargetContextEqualTo(String value) {
            addCriterion("XLT_TARGET_CONTEXT =", value, "xltTargetContext");
            return (Criteria) this;
        }

        public Criteria andXltTargetContextNotEqualTo(String value) {
            addCriterion("XLT_TARGET_CONTEXT <>", value, "xltTargetContext");
            return (Criteria) this;
        }

        public Criteria andXltTargetContextGreaterThan(String value) {
            addCriterion("XLT_TARGET_CONTEXT >", value, "xltTargetContext");
            return (Criteria) this;
        }

        public Criteria andXltTargetContextGreaterThanOrEqualTo(String value) {
            addCriterion("XLT_TARGET_CONTEXT >=", value, "xltTargetContext");
            return (Criteria) this;
        }

        public Criteria andXltTargetContextLessThan(String value) {
            addCriterion("XLT_TARGET_CONTEXT <", value, "xltTargetContext");
            return (Criteria) this;
        }

        public Criteria andXltTargetContextLessThanOrEqualTo(String value) {
            addCriterion("XLT_TARGET_CONTEXT <=", value, "xltTargetContext");
            return (Criteria) this;
        }

        public Criteria andXltTargetContextLike(String value) {
            addCriterion("XLT_TARGET_CONTEXT like", value, "xltTargetContext");
            return (Criteria) this;
        }

        public Criteria andXltTargetContextNotLike(String value) {
            addCriterion("XLT_TARGET_CONTEXT not like", value, "xltTargetContext");
            return (Criteria) this;
        }

        public Criteria andXltTargetContextIn(List<String> values) {
            addCriterion("XLT_TARGET_CONTEXT in", values, "xltTargetContext");
            return (Criteria) this;
        }

        public Criteria andXltTargetContextNotIn(List<String> values) {
            addCriterion("XLT_TARGET_CONTEXT not in", values, "xltTargetContext");
            return (Criteria) this;
        }

        public Criteria andXltTargetContextBetween(String value1, String value2) {
            addCriterion("XLT_TARGET_CONTEXT between", value1, value2, "xltTargetContext");
            return (Criteria) this;
        }

        public Criteria andXltTargetContextNotBetween(String value1, String value2) {
            addCriterion("XLT_TARGET_CONTEXT not between", value1, value2, "xltTargetContext");
            return (Criteria) this;
        }

        public Criteria andXltCmwAsrCodeIsNull() {
            addCriterion("XLT_CMW_ASR_CODE is null");
            return (Criteria) this;
        }

        public Criteria andXltCmwAsrCodeIsNotNull() {
            addCriterion("XLT_CMW_ASR_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andXltCmwAsrCodeEqualTo(String value) {
            addCriterion("XLT_CMW_ASR_CODE =", value, "xltCmwAsrCode");
            return (Criteria) this;
        }

        public Criteria andXltCmwAsrCodeNotEqualTo(String value) {
            addCriterion("XLT_CMW_ASR_CODE <>", value, "xltCmwAsrCode");
            return (Criteria) this;
        }

        public Criteria andXltCmwAsrCodeGreaterThan(String value) {
            addCriterion("XLT_CMW_ASR_CODE >", value, "xltCmwAsrCode");
            return (Criteria) this;
        }

        public Criteria andXltCmwAsrCodeGreaterThanOrEqualTo(String value) {
            addCriterion("XLT_CMW_ASR_CODE >=", value, "xltCmwAsrCode");
            return (Criteria) this;
        }

        public Criteria andXltCmwAsrCodeLessThan(String value) {
            addCriterion("XLT_CMW_ASR_CODE <", value, "xltCmwAsrCode");
            return (Criteria) this;
        }

        public Criteria andXltCmwAsrCodeLessThanOrEqualTo(String value) {
            addCriterion("XLT_CMW_ASR_CODE <=", value, "xltCmwAsrCode");
            return (Criteria) this;
        }

        public Criteria andXltCmwAsrCodeLike(String value) {
            addCriterion("XLT_CMW_ASR_CODE like", value, "xltCmwAsrCode");
            return (Criteria) this;
        }

        public Criteria andXltCmwAsrCodeNotLike(String value) {
            addCriterion("XLT_CMW_ASR_CODE not like", value, "xltCmwAsrCode");
            return (Criteria) this;
        }

        public Criteria andXltCmwAsrCodeIn(List<String> values) {
            addCriterion("XLT_CMW_ASR_CODE in", values, "xltCmwAsrCode");
            return (Criteria) this;
        }

        public Criteria andXltCmwAsrCodeNotIn(List<String> values) {
            addCriterion("XLT_CMW_ASR_CODE not in", values, "xltCmwAsrCode");
            return (Criteria) this;
        }

        public Criteria andXltCmwAsrCodeBetween(String value1, String value2) {
            addCriterion("XLT_CMW_ASR_CODE between", value1, value2, "xltCmwAsrCode");
            return (Criteria) this;
        }

        public Criteria andXltCmwAsrCodeNotBetween(String value1, String value2) {
            addCriterion("XLT_CMW_ASR_CODE not between", value1, value2, "xltCmwAsrCode");
            return (Criteria) this;
        }

        public Criteria andXltCmwCodeIsNull() {
            addCriterion("XLT_CMW_CODE is null");
            return (Criteria) this;
        }

        public Criteria andXltCmwCodeIsNotNull() {
            addCriterion("XLT_CMW_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andXltCmwCodeEqualTo(String value) {
            addCriterion("XLT_CMW_CODE =", value, "xltCmwCode");
            return (Criteria) this;
        }

        public Criteria andXltCmwCodeNotEqualTo(String value) {
            addCriterion("XLT_CMW_CODE <>", value, "xltCmwCode");
            return (Criteria) this;
        }

        public Criteria andXltCmwCodeGreaterThan(String value) {
            addCriterion("XLT_CMW_CODE >", value, "xltCmwCode");
            return (Criteria) this;
        }

        public Criteria andXltCmwCodeGreaterThanOrEqualTo(String value) {
            addCriterion("XLT_CMW_CODE >=", value, "xltCmwCode");
            return (Criteria) this;
        }

        public Criteria andXltCmwCodeLessThan(String value) {
            addCriterion("XLT_CMW_CODE <", value, "xltCmwCode");
            return (Criteria) this;
        }

        public Criteria andXltCmwCodeLessThanOrEqualTo(String value) {
            addCriterion("XLT_CMW_CODE <=", value, "xltCmwCode");
            return (Criteria) this;
        }

        public Criteria andXltCmwCodeLike(String value) {
            addCriterion("XLT_CMW_CODE like", value, "xltCmwCode");
            return (Criteria) this;
        }

        public Criteria andXltCmwCodeNotLike(String value) {
            addCriterion("XLT_CMW_CODE not like", value, "xltCmwCode");
            return (Criteria) this;
        }

        public Criteria andXltCmwCodeIn(List<String> values) {
            addCriterion("XLT_CMW_CODE in", values, "xltCmwCode");
            return (Criteria) this;
        }

        public Criteria andXltCmwCodeNotIn(List<String> values) {
            addCriterion("XLT_CMW_CODE not in", values, "xltCmwCode");
            return (Criteria) this;
        }

        public Criteria andXltCmwCodeBetween(String value1, String value2) {
            addCriterion("XLT_CMW_CODE between", value1, value2, "xltCmwCode");
            return (Criteria) this;
        }

        public Criteria andXltCmwCodeNotBetween(String value1, String value2) {
            addCriterion("XLT_CMW_CODE not between", value1, value2, "xltCmwCode");
            return (Criteria) this;
        }

        public Criteria andXltCmwTtsCodeIsNull() {
            addCriterion("XLT_CMW_TTS_CODE is null");
            return (Criteria) this;
        }

        public Criteria andXltCmwTtsCodeIsNotNull() {
            addCriterion("XLT_CMW_TTS_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andXltCmwTtsCodeEqualTo(String value) {
            addCriterion("XLT_CMW_TTS_CODE =", value, "xltCmwTtsCode");
            return (Criteria) this;
        }

        public Criteria andXltCmwTtsCodeNotEqualTo(String value) {
            addCriterion("XLT_CMW_TTS_CODE <>", value, "xltCmwTtsCode");
            return (Criteria) this;
        }

        public Criteria andXltCmwTtsCodeGreaterThan(String value) {
            addCriterion("XLT_CMW_TTS_CODE >", value, "xltCmwTtsCode");
            return (Criteria) this;
        }

        public Criteria andXltCmwTtsCodeGreaterThanOrEqualTo(String value) {
            addCriterion("XLT_CMW_TTS_CODE >=", value, "xltCmwTtsCode");
            return (Criteria) this;
        }

        public Criteria andXltCmwTtsCodeLessThan(String value) {
            addCriterion("XLT_CMW_TTS_CODE <", value, "xltCmwTtsCode");
            return (Criteria) this;
        }

        public Criteria andXltCmwTtsCodeLessThanOrEqualTo(String value) {
            addCriterion("XLT_CMW_TTS_CODE <=", value, "xltCmwTtsCode");
            return (Criteria) this;
        }

        public Criteria andXltCmwTtsCodeLike(String value) {
            addCriterion("XLT_CMW_TTS_CODE like", value, "xltCmwTtsCode");
            return (Criteria) this;
        }

        public Criteria andXltCmwTtsCodeNotLike(String value) {
            addCriterion("XLT_CMW_TTS_CODE not like", value, "xltCmwTtsCode");
            return (Criteria) this;
        }

        public Criteria andXltCmwTtsCodeIn(List<String> values) {
            addCriterion("XLT_CMW_TTS_CODE in", values, "xltCmwTtsCode");
            return (Criteria) this;
        }

        public Criteria andXltCmwTtsCodeNotIn(List<String> values) {
            addCriterion("XLT_CMW_TTS_CODE not in", values, "xltCmwTtsCode");
            return (Criteria) this;
        }

        public Criteria andXltCmwTtsCodeBetween(String value1, String value2) {
            addCriterion("XLT_CMW_TTS_CODE between", value1, value2, "xltCmwTtsCode");
            return (Criteria) this;
        }

        public Criteria andXltCmwTtsCodeNotBetween(String value1, String value2) {
            addCriterion("XLT_CMW_TTS_CODE not between", value1, value2, "xltCmwTtsCode");
            return (Criteria) this;
        }

        public Criteria andXltIdentificationTimeIsNull() {
            addCriterion("XLT_IDENTIFICATION_TIME is null");
            return (Criteria) this;
        }

        public Criteria andXltIdentificationTimeIsNotNull() {
            addCriterion("XLT_IDENTIFICATION_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andXltIdentificationTimeEqualTo(Long value) {
            addCriterion("XLT_IDENTIFICATION_TIME =", value, "xltIdentificationTime");
            return (Criteria) this;
        }

        public Criteria andXltIdentificationTimeNotEqualTo(Long value) {
            addCriterion("XLT_IDENTIFICATION_TIME <>", value, "xltIdentificationTime");
            return (Criteria) this;
        }

        public Criteria andXltIdentificationTimeGreaterThan(Long value) {
            addCriterion("XLT_IDENTIFICATION_TIME >", value, "xltIdentificationTime");
            return (Criteria) this;
        }

        public Criteria andXltIdentificationTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("XLT_IDENTIFICATION_TIME >=", value, "xltIdentificationTime");
            return (Criteria) this;
        }

        public Criteria andXltIdentificationTimeLessThan(Long value) {
            addCriterion("XLT_IDENTIFICATION_TIME <", value, "xltIdentificationTime");
            return (Criteria) this;
        }

        public Criteria andXltIdentificationTimeLessThanOrEqualTo(Long value) {
            addCriterion("XLT_IDENTIFICATION_TIME <=", value, "xltIdentificationTime");
            return (Criteria) this;
        }

        public Criteria andXltIdentificationTimeIn(List<Long> values) {
            addCriterion("XLT_IDENTIFICATION_TIME in", values, "xltIdentificationTime");
            return (Criteria) this;
        }

        public Criteria andXltIdentificationTimeNotIn(List<Long> values) {
            addCriterion("XLT_IDENTIFICATION_TIME not in", values, "xltIdentificationTime");
            return (Criteria) this;
        }

        public Criteria andXltIdentificationTimeBetween(Long value1, Long value2) {
            addCriterion("XLT_IDENTIFICATION_TIME between", value1, value2, "xltIdentificationTime");
            return (Criteria) this;
        }

        public Criteria andXltIdentificationTimeNotBetween(Long value1, Long value2) {
            addCriterion("XLT_IDENTIFICATION_TIME not between", value1, value2, "xltIdentificationTime");
            return (Criteria) this;
        }

        public Criteria andXltTranslateTimeIsNull() {
            addCriterion("XLT_TRANSLATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andXltTranslateTimeIsNotNull() {
            addCriterion("XLT_TRANSLATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andXltTranslateTimeEqualTo(Long value) {
            addCriterion("XLT_TRANSLATE_TIME =", value, "xltTranslateTime");
            return (Criteria) this;
        }

        public Criteria andXltTranslateTimeNotEqualTo(Long value) {
            addCriterion("XLT_TRANSLATE_TIME <>", value, "xltTranslateTime");
            return (Criteria) this;
        }

        public Criteria andXltTranslateTimeGreaterThan(Long value) {
            addCriterion("XLT_TRANSLATE_TIME >", value, "xltTranslateTime");
            return (Criteria) this;
        }

        public Criteria andXltTranslateTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("XLT_TRANSLATE_TIME >=", value, "xltTranslateTime");
            return (Criteria) this;
        }

        public Criteria andXltTranslateTimeLessThan(Long value) {
            addCriterion("XLT_TRANSLATE_TIME <", value, "xltTranslateTime");
            return (Criteria) this;
        }

        public Criteria andXltTranslateTimeLessThanOrEqualTo(Long value) {
            addCriterion("XLT_TRANSLATE_TIME <=", value, "xltTranslateTime");
            return (Criteria) this;
        }

        public Criteria andXltTranslateTimeIn(List<Long> values) {
            addCriterion("XLT_TRANSLATE_TIME in", values, "xltTranslateTime");
            return (Criteria) this;
        }

        public Criteria andXltTranslateTimeNotIn(List<Long> values) {
            addCriterion("XLT_TRANSLATE_TIME not in", values, "xltTranslateTime");
            return (Criteria) this;
        }

        public Criteria andXltTranslateTimeBetween(Long value1, Long value2) {
            addCriterion("XLT_TRANSLATE_TIME between", value1, value2, "xltTranslateTime");
            return (Criteria) this;
        }

        public Criteria andXltTranslateTimeNotBetween(Long value1, Long value2) {
            addCriterion("XLT_TRANSLATE_TIME not between", value1, value2, "xltTranslateTime");
            return (Criteria) this;
        }

        public Criteria andXltSynthesisTimeIsNull() {
            addCriterion("XLT_SYNTHESIS_TIME is null");
            return (Criteria) this;
        }

        public Criteria andXltSynthesisTimeIsNotNull() {
            addCriterion("XLT_SYNTHESIS_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andXltSynthesisTimeEqualTo(Long value) {
            addCriterion("XLT_SYNTHESIS_TIME =", value, "xltSynthesisTime");
            return (Criteria) this;
        }

        public Criteria andXltSynthesisTimeNotEqualTo(Long value) {
            addCriterion("XLT_SYNTHESIS_TIME <>", value, "xltSynthesisTime");
            return (Criteria) this;
        }

        public Criteria andXltSynthesisTimeGreaterThan(Long value) {
            addCriterion("XLT_SYNTHESIS_TIME >", value, "xltSynthesisTime");
            return (Criteria) this;
        }

        public Criteria andXltSynthesisTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("XLT_SYNTHESIS_TIME >=", value, "xltSynthesisTime");
            return (Criteria) this;
        }

        public Criteria andXltSynthesisTimeLessThan(Long value) {
            addCriterion("XLT_SYNTHESIS_TIME <", value, "xltSynthesisTime");
            return (Criteria) this;
        }

        public Criteria andXltSynthesisTimeLessThanOrEqualTo(Long value) {
            addCriterion("XLT_SYNTHESIS_TIME <=", value, "xltSynthesisTime");
            return (Criteria) this;
        }

        public Criteria andXltSynthesisTimeIn(List<Long> values) {
            addCriterion("XLT_SYNTHESIS_TIME in", values, "xltSynthesisTime");
            return (Criteria) this;
        }

        public Criteria andXltSynthesisTimeNotIn(List<Long> values) {
            addCriterion("XLT_SYNTHESIS_TIME not in", values, "xltSynthesisTime");
            return (Criteria) this;
        }

        public Criteria andXltSynthesisTimeBetween(Long value1, Long value2) {
            addCriterion("XLT_SYNTHESIS_TIME between", value1, value2, "xltSynthesisTime");
            return (Criteria) this;
        }

        public Criteria andXltSynthesisTimeNotBetween(Long value1, Long value2) {
            addCriterion("XLT_SYNTHESIS_TIME not between", value1, value2, "xltSynthesisTime");
            return (Criteria) this;
        }

        public Criteria andUploadTimeIsNull() {
            addCriterion("UPLOAD_TIME is null");
            return (Criteria) this;
        }

        public Criteria andUploadTimeIsNotNull() {
            addCriterion("UPLOAD_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andUploadTimeEqualTo(Date value) {
            addCriterion("UPLOAD_TIME =", value, "uploadTime");
            return (Criteria) this;
        }

        public Criteria andUploadTimeNotEqualTo(Date value) {
            addCriterion("UPLOAD_TIME <>", value, "uploadTime");
            return (Criteria) this;
        }

        public Criteria andUploadTimeGreaterThan(Date value) {
            addCriterion("UPLOAD_TIME >", value, "uploadTime");
            return (Criteria) this;
        }

        public Criteria andUploadTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("UPLOAD_TIME >=", value, "uploadTime");
            return (Criteria) this;
        }

        public Criteria andUploadTimeLessThan(Date value) {
            addCriterion("UPLOAD_TIME <", value, "uploadTime");
            return (Criteria) this;
        }

        public Criteria andUploadTimeLessThanOrEqualTo(Date value) {
            addCriterion("UPLOAD_TIME <=", value, "uploadTime");
            return (Criteria) this;
        }

        public Criteria andUploadTimeIn(List<Date> values) {
            addCriterion("UPLOAD_TIME in", values, "uploadTime");
            return (Criteria) this;
        }

        public Criteria andUploadTimeNotIn(List<Date> values) {
            addCriterion("UPLOAD_TIME not in", values, "uploadTime");
            return (Criteria) this;
        }

        public Criteria andUploadTimeBetween(Date value1, Date value2) {
            addCriterion("UPLOAD_TIME between", value1, value2, "uploadTime");
            return (Criteria) this;
        }

        public Criteria andUploadTimeNotBetween(Date value1, Date value2) {
            addCriterion("UPLOAD_TIME not between", value1, value2, "uploadTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME not between", value1, value2, "createTime");
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