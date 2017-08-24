package com.iguan.entity.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HSCmwExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HSCmwExample() {
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

        public Criteria andCmwNameIsNull() {
            addCriterion("CMW_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCmwNameIsNotNull() {
            addCriterion("CMW_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCmwNameEqualTo(String value) {
            addCriterion("CMW_NAME =", value, "cmwName");
            return (Criteria) this;
        }

        public Criteria andCmwNameNotEqualTo(String value) {
            addCriterion("CMW_NAME <>", value, "cmwName");
            return (Criteria) this;
        }

        public Criteria andCmwNameGreaterThan(String value) {
            addCriterion("CMW_NAME >", value, "cmwName");
            return (Criteria) this;
        }

        public Criteria andCmwNameGreaterThanOrEqualTo(String value) {
            addCriterion("CMW_NAME >=", value, "cmwName");
            return (Criteria) this;
        }

        public Criteria andCmwNameLessThan(String value) {
            addCriterion("CMW_NAME <", value, "cmwName");
            return (Criteria) this;
        }

        public Criteria andCmwNameLessThanOrEqualTo(String value) {
            addCriterion("CMW_NAME <=", value, "cmwName");
            return (Criteria) this;
        }

        public Criteria andCmwNameLike(String value) {
            addCriterion("CMW_NAME like", value, "cmwName");
            return (Criteria) this;
        }

        public Criteria andCmwNameNotLike(String value) {
            addCriterion("CMW_NAME not like", value, "cmwName");
            return (Criteria) this;
        }

        public Criteria andCmwNameIn(List<String> values) {
            addCriterion("CMW_NAME in", values, "cmwName");
            return (Criteria) this;
        }

        public Criteria andCmwNameNotIn(List<String> values) {
            addCriterion("CMW_NAME not in", values, "cmwName");
            return (Criteria) this;
        }

        public Criteria andCmwNameBetween(String value1, String value2) {
            addCriterion("CMW_NAME between", value1, value2, "cmwName");
            return (Criteria) this;
        }

        public Criteria andCmwNameNotBetween(String value1, String value2) {
            addCriterion("CMW_NAME not between", value1, value2, "cmwName");
            return (Criteria) this;
        }

        public Criteria andCmwCodeIsNull() {
            addCriterion("CMW_CODE is null");
            return (Criteria) this;
        }

        public Criteria andCmwCodeIsNotNull() {
            addCriterion("CMW_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andCmwCodeEqualTo(String value) {
            addCriterion("CMW_CODE =", value, "cmwCode");
            return (Criteria) this;
        }

        public Criteria andCmwCodeNotEqualTo(String value) {
            addCriterion("CMW_CODE <>", value, "cmwCode");
            return (Criteria) this;
        }

        public Criteria andCmwCodeGreaterThan(String value) {
            addCriterion("CMW_CODE >", value, "cmwCode");
            return (Criteria) this;
        }

        public Criteria andCmwCodeGreaterThanOrEqualTo(String value) {
            addCriterion("CMW_CODE >=", value, "cmwCode");
            return (Criteria) this;
        }

        public Criteria andCmwCodeLessThan(String value) {
            addCriterion("CMW_CODE <", value, "cmwCode");
            return (Criteria) this;
        }

        public Criteria andCmwCodeLessThanOrEqualTo(String value) {
            addCriterion("CMW_CODE <=", value, "cmwCode");
            return (Criteria) this;
        }

        public Criteria andCmwCodeLike(String value) {
            addCriterion("CMW_CODE like", value, "cmwCode");
            return (Criteria) this;
        }

        public Criteria andCmwCodeNotLike(String value) {
            addCriterion("CMW_CODE not like", value, "cmwCode");
            return (Criteria) this;
        }

        public Criteria andCmwCodeIn(List<String> values) {
            addCriterion("CMW_CODE in", values, "cmwCode");
            return (Criteria) this;
        }

        public Criteria andCmwCodeNotIn(List<String> values) {
            addCriterion("CMW_CODE not in", values, "cmwCode");
            return (Criteria) this;
        }

        public Criteria andCmwCodeBetween(String value1, String value2) {
            addCriterion("CMW_CODE between", value1, value2, "cmwCode");
            return (Criteria) this;
        }

        public Criteria andCmwCodeNotBetween(String value1, String value2) {
            addCriterion("CMW_CODE not between", value1, value2, "cmwCode");
            return (Criteria) this;
        }

        public Criteria andCmwDetailIsNull() {
            addCriterion("CMW_DETAIL is null");
            return (Criteria) this;
        }

        public Criteria andCmwDetailIsNotNull() {
            addCriterion("CMW_DETAIL is not null");
            return (Criteria) this;
        }

        public Criteria andCmwDetailEqualTo(String value) {
            addCriterion("CMW_DETAIL =", value, "cmwDetail");
            return (Criteria) this;
        }

        public Criteria andCmwDetailNotEqualTo(String value) {
            addCriterion("CMW_DETAIL <>", value, "cmwDetail");
            return (Criteria) this;
        }

        public Criteria andCmwDetailGreaterThan(String value) {
            addCriterion("CMW_DETAIL >", value, "cmwDetail");
            return (Criteria) this;
        }

        public Criteria andCmwDetailGreaterThanOrEqualTo(String value) {
            addCriterion("CMW_DETAIL >=", value, "cmwDetail");
            return (Criteria) this;
        }

        public Criteria andCmwDetailLessThan(String value) {
            addCriterion("CMW_DETAIL <", value, "cmwDetail");
            return (Criteria) this;
        }

        public Criteria andCmwDetailLessThanOrEqualTo(String value) {
            addCriterion("CMW_DETAIL <=", value, "cmwDetail");
            return (Criteria) this;
        }

        public Criteria andCmwDetailLike(String value) {
            addCriterion("CMW_DETAIL like", value, "cmwDetail");
            return (Criteria) this;
        }

        public Criteria andCmwDetailNotLike(String value) {
            addCriterion("CMW_DETAIL not like", value, "cmwDetail");
            return (Criteria) this;
        }

        public Criteria andCmwDetailIn(List<String> values) {
            addCriterion("CMW_DETAIL in", values, "cmwDetail");
            return (Criteria) this;
        }

        public Criteria andCmwDetailNotIn(List<String> values) {
            addCriterion("CMW_DETAIL not in", values, "cmwDetail");
            return (Criteria) this;
        }

        public Criteria andCmwDetailBetween(String value1, String value2) {
            addCriterion("CMW_DETAIL between", value1, value2, "cmwDetail");
            return (Criteria) this;
        }

        public Criteria andCmwDetailNotBetween(String value1, String value2) {
            addCriterion("CMW_DETAIL not between", value1, value2, "cmwDetail");
            return (Criteria) this;
        }

        public Criteria andCmwTypeIdIsNull() {
            addCriterion("CMW_TYPE_ID is null");
            return (Criteria) this;
        }

        public Criteria andCmwTypeIdIsNotNull() {
            addCriterion("CMW_TYPE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCmwTypeIdEqualTo(Long value) {
            addCriterion("CMW_TYPE_ID =", value, "cmwTypeId");
            return (Criteria) this;
        }

        public Criteria andCmwTypeIdNotEqualTo(Long value) {
            addCriterion("CMW_TYPE_ID <>", value, "cmwTypeId");
            return (Criteria) this;
        }

        public Criteria andCmwTypeIdGreaterThan(Long value) {
            addCriterion("CMW_TYPE_ID >", value, "cmwTypeId");
            return (Criteria) this;
        }

        public Criteria andCmwTypeIdGreaterThanOrEqualTo(Long value) {
            addCriterion("CMW_TYPE_ID >=", value, "cmwTypeId");
            return (Criteria) this;
        }

        public Criteria andCmwTypeIdLessThan(Long value) {
            addCriterion("CMW_TYPE_ID <", value, "cmwTypeId");
            return (Criteria) this;
        }

        public Criteria andCmwTypeIdLessThanOrEqualTo(Long value) {
            addCriterion("CMW_TYPE_ID <=", value, "cmwTypeId");
            return (Criteria) this;
        }

        public Criteria andCmwTypeIdIn(List<Long> values) {
            addCriterion("CMW_TYPE_ID in", values, "cmwTypeId");
            return (Criteria) this;
        }

        public Criteria andCmwTypeIdNotIn(List<Long> values) {
            addCriterion("CMW_TYPE_ID not in", values, "cmwTypeId");
            return (Criteria) this;
        }

        public Criteria andCmwTypeIdBetween(Long value1, Long value2) {
            addCriterion("CMW_TYPE_ID between", value1, value2, "cmwTypeId");
            return (Criteria) this;
        }

        public Criteria andCmwTypeIdNotBetween(Long value1, Long value2) {
            addCriterion("CMW_TYPE_ID not between", value1, value2, "cmwTypeId");
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