package com.iguan.entity.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SettingCmwLngExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SettingCmwLngExample() {
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

        public Criteria andCmwIdIsNull() {
            addCriterion("CMW_ID is null");
            return (Criteria) this;
        }

        public Criteria andCmwIdIsNotNull() {
            addCriterion("CMW_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCmwIdEqualTo(Long value) {
            addCriterion("CMW_ID =", value, "cmwId");
            return (Criteria) this;
        }

        public Criteria andCmwIdNotEqualTo(Long value) {
            addCriterion("CMW_ID <>", value, "cmwId");
            return (Criteria) this;
        }

        public Criteria andCmwIdGreaterThan(Long value) {
            addCriterion("CMW_ID >", value, "cmwId");
            return (Criteria) this;
        }

        public Criteria andCmwIdGreaterThanOrEqualTo(Long value) {
            addCriterion("CMW_ID >=", value, "cmwId");
            return (Criteria) this;
        }

        public Criteria andCmwIdLessThan(Long value) {
            addCriterion("CMW_ID <", value, "cmwId");
            return (Criteria) this;
        }

        public Criteria andCmwIdLessThanOrEqualTo(Long value) {
            addCriterion("CMW_ID <=", value, "cmwId");
            return (Criteria) this;
        }

        public Criteria andCmwIdIn(List<Long> values) {
            addCriterion("CMW_ID in", values, "cmwId");
            return (Criteria) this;
        }

        public Criteria andCmwIdNotIn(List<Long> values) {
            addCriterion("CMW_ID not in", values, "cmwId");
            return (Criteria) this;
        }

        public Criteria andCmwIdBetween(Long value1, Long value2) {
            addCriterion("CMW_ID between", value1, value2, "cmwId");
            return (Criteria) this;
        }

        public Criteria andCmwIdNotBetween(Long value1, Long value2) {
            addCriterion("CMW_ID not between", value1, value2, "cmwId");
            return (Criteria) this;
        }

        public Criteria andLngTypeIdIsNull() {
            addCriterion("LNG_TYPE_ID is null");
            return (Criteria) this;
        }

        public Criteria andLngTypeIdIsNotNull() {
            addCriterion("LNG_TYPE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andLngTypeIdEqualTo(Long value) {
            addCriterion("LNG_TYPE_ID =", value, "lngTypeId");
            return (Criteria) this;
        }

        public Criteria andLngTypeIdNotEqualTo(Long value) {
            addCriterion("LNG_TYPE_ID <>", value, "lngTypeId");
            return (Criteria) this;
        }

        public Criteria andLngTypeIdGreaterThan(Long value) {
            addCriterion("LNG_TYPE_ID >", value, "lngTypeId");
            return (Criteria) this;
        }

        public Criteria andLngTypeIdGreaterThanOrEqualTo(Long value) {
            addCriterion("LNG_TYPE_ID >=", value, "lngTypeId");
            return (Criteria) this;
        }

        public Criteria andLngTypeIdLessThan(Long value) {
            addCriterion("LNG_TYPE_ID <", value, "lngTypeId");
            return (Criteria) this;
        }

        public Criteria andLngTypeIdLessThanOrEqualTo(Long value) {
            addCriterion("LNG_TYPE_ID <=", value, "lngTypeId");
            return (Criteria) this;
        }

        public Criteria andLngTypeIdIn(List<Long> values) {
            addCriterion("LNG_TYPE_ID in", values, "lngTypeId");
            return (Criteria) this;
        }

        public Criteria andLngTypeIdNotIn(List<Long> values) {
            addCriterion("LNG_TYPE_ID not in", values, "lngTypeId");
            return (Criteria) this;
        }

        public Criteria andLngTypeIdBetween(Long value1, Long value2) {
            addCriterion("LNG_TYPE_ID between", value1, value2, "lngTypeId");
            return (Criteria) this;
        }

        public Criteria andLngTypeIdNotBetween(Long value1, Long value2) {
            addCriterion("LNG_TYPE_ID not between", value1, value2, "lngTypeId");
            return (Criteria) this;
        }

        public Criteria andLngStateIsNull() {
            addCriterion("LNG_STATE is null");
            return (Criteria) this;
        }

        public Criteria andLngStateIsNotNull() {
            addCriterion("LNG_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andLngStateEqualTo(Integer value) {
            addCriterion("LNG_STATE =", value, "lngState");
            return (Criteria) this;
        }

        public Criteria andLngStateNotEqualTo(Integer value) {
            addCriterion("LNG_STATE <>", value, "lngState");
            return (Criteria) this;
        }

        public Criteria andLngStateGreaterThan(Integer value) {
            addCriterion("LNG_STATE >", value, "lngState");
            return (Criteria) this;
        }

        public Criteria andLngStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("LNG_STATE >=", value, "lngState");
            return (Criteria) this;
        }

        public Criteria andLngStateLessThan(Integer value) {
            addCriterion("LNG_STATE <", value, "lngState");
            return (Criteria) this;
        }

        public Criteria andLngStateLessThanOrEqualTo(Integer value) {
            addCriterion("LNG_STATE <=", value, "lngState");
            return (Criteria) this;
        }

        public Criteria andLngStateIn(List<Integer> values) {
            addCriterion("LNG_STATE in", values, "lngState");
            return (Criteria) this;
        }

        public Criteria andLngStateNotIn(List<Integer> values) {
            addCriterion("LNG_STATE not in", values, "lngState");
            return (Criteria) this;
        }

        public Criteria andLngStateBetween(Integer value1, Integer value2) {
            addCriterion("LNG_STATE between", value1, value2, "lngState");
            return (Criteria) this;
        }

        public Criteria andLngStateNotBetween(Integer value1, Integer value2) {
            addCriterion("LNG_STATE not between", value1, value2, "lngState");
            return (Criteria) this;
        }

        public Criteria andLngStartIsNull() {
            addCriterion("LNG_START is null");
            return (Criteria) this;
        }

        public Criteria andLngStartIsNotNull() {
            addCriterion("LNG_START is not null");
            return (Criteria) this;
        }

        public Criteria andLngStartEqualTo(Integer value) {
            addCriterion("LNG_START =", value, "lngStart");
            return (Criteria) this;
        }

        public Criteria andLngStartNotEqualTo(Integer value) {
            addCriterion("LNG_START <>", value, "lngStart");
            return (Criteria) this;
        }

        public Criteria andLngStartGreaterThan(Integer value) {
            addCriterion("LNG_START >", value, "lngStart");
            return (Criteria) this;
        }

        public Criteria andLngStartGreaterThanOrEqualTo(Integer value) {
            addCriterion("LNG_START >=", value, "lngStart");
            return (Criteria) this;
        }

        public Criteria andLngStartLessThan(Integer value) {
            addCriterion("LNG_START <", value, "lngStart");
            return (Criteria) this;
        }

        public Criteria andLngStartLessThanOrEqualTo(Integer value) {
            addCriterion("LNG_START <=", value, "lngStart");
            return (Criteria) this;
        }

        public Criteria andLngStartIn(List<Integer> values) {
            addCriterion("LNG_START in", values, "lngStart");
            return (Criteria) this;
        }

        public Criteria andLngStartNotIn(List<Integer> values) {
            addCriterion("LNG_START not in", values, "lngStart");
            return (Criteria) this;
        }

        public Criteria andLngStartBetween(Integer value1, Integer value2) {
            addCriterion("LNG_START between", value1, value2, "lngStart");
            return (Criteria) this;
        }

        public Criteria andLngStartNotBetween(Integer value1, Integer value2) {
            addCriterion("LNG_START not between", value1, value2, "lngStart");
            return (Criteria) this;
        }

        public Criteria andLngKeyIsNull() {
            addCriterion("LNG_KEY is null");
            return (Criteria) this;
        }

        public Criteria andLngKeyIsNotNull() {
            addCriterion("LNG_KEY is not null");
            return (Criteria) this;
        }

        public Criteria andLngKeyEqualTo(String value) {
            addCriterion("LNG_KEY =", value, "lngKey");
            return (Criteria) this;
        }

        public Criteria andLngKeyNotEqualTo(String value) {
            addCriterion("LNG_KEY <>", value, "lngKey");
            return (Criteria) this;
        }

        public Criteria andLngKeyGreaterThan(String value) {
            addCriterion("LNG_KEY >", value, "lngKey");
            return (Criteria) this;
        }

        public Criteria andLngKeyGreaterThanOrEqualTo(String value) {
            addCriterion("LNG_KEY >=", value, "lngKey");
            return (Criteria) this;
        }

        public Criteria andLngKeyLessThan(String value) {
            addCriterion("LNG_KEY <", value, "lngKey");
            return (Criteria) this;
        }

        public Criteria andLngKeyLessThanOrEqualTo(String value) {
            addCriterion("LNG_KEY <=", value, "lngKey");
            return (Criteria) this;
        }

        public Criteria andLngKeyLike(String value) {
            addCriterion("LNG_KEY like", value, "lngKey");
            return (Criteria) this;
        }

        public Criteria andLngKeyNotLike(String value) {
            addCriterion("LNG_KEY not like", value, "lngKey");
            return (Criteria) this;
        }

        public Criteria andLngKeyIn(List<String> values) {
            addCriterion("LNG_KEY in", values, "lngKey");
            return (Criteria) this;
        }

        public Criteria andLngKeyNotIn(List<String> values) {
            addCriterion("LNG_KEY not in", values, "lngKey");
            return (Criteria) this;
        }

        public Criteria andLngKeyBetween(String value1, String value2) {
            addCriterion("LNG_KEY between", value1, value2, "lngKey");
            return (Criteria) this;
        }

        public Criteria andLngKeyNotBetween(String value1, String value2) {
            addCriterion("LNG_KEY not between", value1, value2, "lngKey");
            return (Criteria) this;
        }

        public Criteria andLngValueIsNull() {
            addCriterion("LNG_VALUE is null");
            return (Criteria) this;
        }

        public Criteria andLngValueIsNotNull() {
            addCriterion("LNG_VALUE is not null");
            return (Criteria) this;
        }

        public Criteria andLngValueEqualTo(String value) {
            addCriterion("LNG_VALUE =", value, "lngValue");
            return (Criteria) this;
        }

        public Criteria andLngValueNotEqualTo(String value) {
            addCriterion("LNG_VALUE <>", value, "lngValue");
            return (Criteria) this;
        }

        public Criteria andLngValueGreaterThan(String value) {
            addCriterion("LNG_VALUE >", value, "lngValue");
            return (Criteria) this;
        }

        public Criteria andLngValueGreaterThanOrEqualTo(String value) {
            addCriterion("LNG_VALUE >=", value, "lngValue");
            return (Criteria) this;
        }

        public Criteria andLngValueLessThan(String value) {
            addCriterion("LNG_VALUE <", value, "lngValue");
            return (Criteria) this;
        }

        public Criteria andLngValueLessThanOrEqualTo(String value) {
            addCriterion("LNG_VALUE <=", value, "lngValue");
            return (Criteria) this;
        }

        public Criteria andLngValueLike(String value) {
            addCriterion("LNG_VALUE like", value, "lngValue");
            return (Criteria) this;
        }

        public Criteria andLngValueNotLike(String value) {
            addCriterion("LNG_VALUE not like", value, "lngValue");
            return (Criteria) this;
        }

        public Criteria andLngValueIn(List<String> values) {
            addCriterion("LNG_VALUE in", values, "lngValue");
            return (Criteria) this;
        }

        public Criteria andLngValueNotIn(List<String> values) {
            addCriterion("LNG_VALUE not in", values, "lngValue");
            return (Criteria) this;
        }

        public Criteria andLngValueBetween(String value1, String value2) {
            addCriterion("LNG_VALUE between", value1, value2, "lngValue");
            return (Criteria) this;
        }

        public Criteria andLngValueNotBetween(String value1, String value2) {
            addCriterion("LNG_VALUE not between", value1, value2, "lngValue");
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