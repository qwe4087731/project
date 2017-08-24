package com.iguan.entity.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SettingCmwPushExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SettingCmwPushExample() {
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

        public Criteria andPushNameIsNull() {
            addCriterion("PUSH_NAME is null");
            return (Criteria) this;
        }

        public Criteria andPushNameIsNotNull() {
            addCriterion("PUSH_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andPushNameEqualTo(String value) {
            addCriterion("PUSH_NAME =", value, "pushName");
            return (Criteria) this;
        }

        public Criteria andPushNameNotEqualTo(String value) {
            addCriterion("PUSH_NAME <>", value, "pushName");
            return (Criteria) this;
        }

        public Criteria andPushNameGreaterThan(String value) {
            addCriterion("PUSH_NAME >", value, "pushName");
            return (Criteria) this;
        }

        public Criteria andPushNameGreaterThanOrEqualTo(String value) {
            addCriterion("PUSH_NAME >=", value, "pushName");
            return (Criteria) this;
        }

        public Criteria andPushNameLessThan(String value) {
            addCriterion("PUSH_NAME <", value, "pushName");
            return (Criteria) this;
        }

        public Criteria andPushNameLessThanOrEqualTo(String value) {
            addCriterion("PUSH_NAME <=", value, "pushName");
            return (Criteria) this;
        }

        public Criteria andPushNameLike(String value) {
            addCriterion("PUSH_NAME like", value, "pushName");
            return (Criteria) this;
        }

        public Criteria andPushNameNotLike(String value) {
            addCriterion("PUSH_NAME not like", value, "pushName");
            return (Criteria) this;
        }

        public Criteria andPushNameIn(List<String> values) {
            addCriterion("PUSH_NAME in", values, "pushName");
            return (Criteria) this;
        }

        public Criteria andPushNameNotIn(List<String> values) {
            addCriterion("PUSH_NAME not in", values, "pushName");
            return (Criteria) this;
        }

        public Criteria andPushNameBetween(String value1, String value2) {
            addCriterion("PUSH_NAME between", value1, value2, "pushName");
            return (Criteria) this;
        }

        public Criteria andPushNameNotBetween(String value1, String value2) {
            addCriterion("PUSH_NAME not between", value1, value2, "pushName");
            return (Criteria) this;
        }

        public Criteria andPushDetailIsNull() {
            addCriterion("PUSH_DETAIL is null");
            return (Criteria) this;
        }

        public Criteria andPushDetailIsNotNull() {
            addCriterion("PUSH_DETAIL is not null");
            return (Criteria) this;
        }

        public Criteria andPushDetailEqualTo(String value) {
            addCriterion("PUSH_DETAIL =", value, "pushDetail");
            return (Criteria) this;
        }

        public Criteria andPushDetailNotEqualTo(String value) {
            addCriterion("PUSH_DETAIL <>", value, "pushDetail");
            return (Criteria) this;
        }

        public Criteria andPushDetailGreaterThan(String value) {
            addCriterion("PUSH_DETAIL >", value, "pushDetail");
            return (Criteria) this;
        }

        public Criteria andPushDetailGreaterThanOrEqualTo(String value) {
            addCriterion("PUSH_DETAIL >=", value, "pushDetail");
            return (Criteria) this;
        }

        public Criteria andPushDetailLessThan(String value) {
            addCriterion("PUSH_DETAIL <", value, "pushDetail");
            return (Criteria) this;
        }

        public Criteria andPushDetailLessThanOrEqualTo(String value) {
            addCriterion("PUSH_DETAIL <=", value, "pushDetail");
            return (Criteria) this;
        }

        public Criteria andPushDetailLike(String value) {
            addCriterion("PUSH_DETAIL like", value, "pushDetail");
            return (Criteria) this;
        }

        public Criteria andPushDetailNotLike(String value) {
            addCriterion("PUSH_DETAIL not like", value, "pushDetail");
            return (Criteria) this;
        }

        public Criteria andPushDetailIn(List<String> values) {
            addCriterion("PUSH_DETAIL in", values, "pushDetail");
            return (Criteria) this;
        }

        public Criteria andPushDetailNotIn(List<String> values) {
            addCriterion("PUSH_DETAIL not in", values, "pushDetail");
            return (Criteria) this;
        }

        public Criteria andPushDetailBetween(String value1, String value2) {
            addCriterion("PUSH_DETAIL between", value1, value2, "pushDetail");
            return (Criteria) this;
        }

        public Criteria andPushDetailNotBetween(String value1, String value2) {
            addCriterion("PUSH_DETAIL not between", value1, value2, "pushDetail");
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