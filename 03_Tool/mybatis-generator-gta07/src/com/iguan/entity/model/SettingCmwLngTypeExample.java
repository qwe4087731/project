package com.iguan.entity.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SettingCmwLngTypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SettingCmwLngTypeExample() {
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

        public Criteria andLngTypeNameIsNull() {
            addCriterion("LNG_TYPE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andLngTypeNameIsNotNull() {
            addCriterion("LNG_TYPE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andLngTypeNameEqualTo(String value) {
            addCriterion("LNG_TYPE_NAME =", value, "lngTypeName");
            return (Criteria) this;
        }

        public Criteria andLngTypeNameNotEqualTo(String value) {
            addCriterion("LNG_TYPE_NAME <>", value, "lngTypeName");
            return (Criteria) this;
        }

        public Criteria andLngTypeNameGreaterThan(String value) {
            addCriterion("LNG_TYPE_NAME >", value, "lngTypeName");
            return (Criteria) this;
        }

        public Criteria andLngTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("LNG_TYPE_NAME >=", value, "lngTypeName");
            return (Criteria) this;
        }

        public Criteria andLngTypeNameLessThan(String value) {
            addCriterion("LNG_TYPE_NAME <", value, "lngTypeName");
            return (Criteria) this;
        }

        public Criteria andLngTypeNameLessThanOrEqualTo(String value) {
            addCriterion("LNG_TYPE_NAME <=", value, "lngTypeName");
            return (Criteria) this;
        }

        public Criteria andLngTypeNameLike(String value) {
            addCriterion("LNG_TYPE_NAME like", value, "lngTypeName");
            return (Criteria) this;
        }

        public Criteria andLngTypeNameNotLike(String value) {
            addCriterion("LNG_TYPE_NAME not like", value, "lngTypeName");
            return (Criteria) this;
        }

        public Criteria andLngTypeNameIn(List<String> values) {
            addCriterion("LNG_TYPE_NAME in", values, "lngTypeName");
            return (Criteria) this;
        }

        public Criteria andLngTypeNameNotIn(List<String> values) {
            addCriterion("LNG_TYPE_NAME not in", values, "lngTypeName");
            return (Criteria) this;
        }

        public Criteria andLngTypeNameBetween(String value1, String value2) {
            addCriterion("LNG_TYPE_NAME between", value1, value2, "lngTypeName");
            return (Criteria) this;
        }

        public Criteria andLngTypeNameNotBetween(String value1, String value2) {
            addCriterion("LNG_TYPE_NAME not between", value1, value2, "lngTypeName");
            return (Criteria) this;
        }

        public Criteria andLngTypeCodeIsNull() {
            addCriterion("LNG_TYPE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andLngTypeCodeIsNotNull() {
            addCriterion("LNG_TYPE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andLngTypeCodeEqualTo(String value) {
            addCriterion("LNG_TYPE_CODE =", value, "lngTypeCode");
            return (Criteria) this;
        }

        public Criteria andLngTypeCodeNotEqualTo(String value) {
            addCriterion("LNG_TYPE_CODE <>", value, "lngTypeCode");
            return (Criteria) this;
        }

        public Criteria andLngTypeCodeGreaterThan(String value) {
            addCriterion("LNG_TYPE_CODE >", value, "lngTypeCode");
            return (Criteria) this;
        }

        public Criteria andLngTypeCodeGreaterThanOrEqualTo(String value) {
            addCriterion("LNG_TYPE_CODE >=", value, "lngTypeCode");
            return (Criteria) this;
        }

        public Criteria andLngTypeCodeLessThan(String value) {
            addCriterion("LNG_TYPE_CODE <", value, "lngTypeCode");
            return (Criteria) this;
        }

        public Criteria andLngTypeCodeLessThanOrEqualTo(String value) {
            addCriterion("LNG_TYPE_CODE <=", value, "lngTypeCode");
            return (Criteria) this;
        }

        public Criteria andLngTypeCodeLike(String value) {
            addCriterion("LNG_TYPE_CODE like", value, "lngTypeCode");
            return (Criteria) this;
        }

        public Criteria andLngTypeCodeNotLike(String value) {
            addCriterion("LNG_TYPE_CODE not like", value, "lngTypeCode");
            return (Criteria) this;
        }

        public Criteria andLngTypeCodeIn(List<String> values) {
            addCriterion("LNG_TYPE_CODE in", values, "lngTypeCode");
            return (Criteria) this;
        }

        public Criteria andLngTypeCodeNotIn(List<String> values) {
            addCriterion("LNG_TYPE_CODE not in", values, "lngTypeCode");
            return (Criteria) this;
        }

        public Criteria andLngTypeCodeBetween(String value1, String value2) {
            addCriterion("LNG_TYPE_CODE between", value1, value2, "lngTypeCode");
            return (Criteria) this;
        }

        public Criteria andLngTypeCodeNotBetween(String value1, String value2) {
            addCriterion("LNG_TYPE_CODE not between", value1, value2, "lngTypeCode");
            return (Criteria) this;
        }

        public Criteria andLngTypeDetailIsNull() {
            addCriterion("LNG_TYPE_DETAIL is null");
            return (Criteria) this;
        }

        public Criteria andLngTypeDetailIsNotNull() {
            addCriterion("LNG_TYPE_DETAIL is not null");
            return (Criteria) this;
        }

        public Criteria andLngTypeDetailEqualTo(String value) {
            addCriterion("LNG_TYPE_DETAIL =", value, "lngTypeDetail");
            return (Criteria) this;
        }

        public Criteria andLngTypeDetailNotEqualTo(String value) {
            addCriterion("LNG_TYPE_DETAIL <>", value, "lngTypeDetail");
            return (Criteria) this;
        }

        public Criteria andLngTypeDetailGreaterThan(String value) {
            addCriterion("LNG_TYPE_DETAIL >", value, "lngTypeDetail");
            return (Criteria) this;
        }

        public Criteria andLngTypeDetailGreaterThanOrEqualTo(String value) {
            addCriterion("LNG_TYPE_DETAIL >=", value, "lngTypeDetail");
            return (Criteria) this;
        }

        public Criteria andLngTypeDetailLessThan(String value) {
            addCriterion("LNG_TYPE_DETAIL <", value, "lngTypeDetail");
            return (Criteria) this;
        }

        public Criteria andLngTypeDetailLessThanOrEqualTo(String value) {
            addCriterion("LNG_TYPE_DETAIL <=", value, "lngTypeDetail");
            return (Criteria) this;
        }

        public Criteria andLngTypeDetailLike(String value) {
            addCriterion("LNG_TYPE_DETAIL like", value, "lngTypeDetail");
            return (Criteria) this;
        }

        public Criteria andLngTypeDetailNotLike(String value) {
            addCriterion("LNG_TYPE_DETAIL not like", value, "lngTypeDetail");
            return (Criteria) this;
        }

        public Criteria andLngTypeDetailIn(List<String> values) {
            addCriterion("LNG_TYPE_DETAIL in", values, "lngTypeDetail");
            return (Criteria) this;
        }

        public Criteria andLngTypeDetailNotIn(List<String> values) {
            addCriterion("LNG_TYPE_DETAIL not in", values, "lngTypeDetail");
            return (Criteria) this;
        }

        public Criteria andLngTypeDetailBetween(String value1, String value2) {
            addCriterion("LNG_TYPE_DETAIL between", value1, value2, "lngTypeDetail");
            return (Criteria) this;
        }

        public Criteria andLngTypeDetailNotBetween(String value1, String value2) {
            addCriterion("LNG_TYPE_DETAIL not between", value1, value2, "lngTypeDetail");
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