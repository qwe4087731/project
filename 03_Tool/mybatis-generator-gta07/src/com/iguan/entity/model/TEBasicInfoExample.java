package com.iguan.entity.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TEBasicInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TEBasicInfoExample() {
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

        public Criteria andBasicSnIsNull() {
            addCriterion("BASIC_SN is null");
            return (Criteria) this;
        }

        public Criteria andBasicSnIsNotNull() {
            addCriterion("BASIC_SN is not null");
            return (Criteria) this;
        }

        public Criteria andBasicSnEqualTo(String value) {
            addCriterion("BASIC_SN =", value, "basicSn");
            return (Criteria) this;
        }

        public Criteria andBasicSnNotEqualTo(String value) {
            addCriterion("BASIC_SN <>", value, "basicSn");
            return (Criteria) this;
        }

        public Criteria andBasicSnGreaterThan(String value) {
            addCriterion("BASIC_SN >", value, "basicSn");
            return (Criteria) this;
        }

        public Criteria andBasicSnGreaterThanOrEqualTo(String value) {
            addCriterion("BASIC_SN >=", value, "basicSn");
            return (Criteria) this;
        }

        public Criteria andBasicSnLessThan(String value) {
            addCriterion("BASIC_SN <", value, "basicSn");
            return (Criteria) this;
        }

        public Criteria andBasicSnLessThanOrEqualTo(String value) {
            addCriterion("BASIC_SN <=", value, "basicSn");
            return (Criteria) this;
        }

        public Criteria andBasicSnLike(String value) {
            addCriterion("BASIC_SN like", value, "basicSn");
            return (Criteria) this;
        }

        public Criteria andBasicSnNotLike(String value) {
            addCriterion("BASIC_SN not like", value, "basicSn");
            return (Criteria) this;
        }

        public Criteria andBasicSnIn(List<String> values) {
            addCriterion("BASIC_SN in", values, "basicSn");
            return (Criteria) this;
        }

        public Criteria andBasicSnNotIn(List<String> values) {
            addCriterion("BASIC_SN not in", values, "basicSn");
            return (Criteria) this;
        }

        public Criteria andBasicSnBetween(String value1, String value2) {
            addCriterion("BASIC_SN between", value1, value2, "basicSn");
            return (Criteria) this;
        }

        public Criteria andBasicSnNotBetween(String value1, String value2) {
            addCriterion("BASIC_SN not between", value1, value2, "basicSn");
            return (Criteria) this;
        }

        public Criteria andBasicModelIsNull() {
            addCriterion("BASIC_MODEL is null");
            return (Criteria) this;
        }

        public Criteria andBasicModelIsNotNull() {
            addCriterion("BASIC_MODEL is not null");
            return (Criteria) this;
        }

        public Criteria andBasicModelEqualTo(String value) {
            addCriterion("BASIC_MODEL =", value, "basicModel");
            return (Criteria) this;
        }

        public Criteria andBasicModelNotEqualTo(String value) {
            addCriterion("BASIC_MODEL <>", value, "basicModel");
            return (Criteria) this;
        }

        public Criteria andBasicModelGreaterThan(String value) {
            addCriterion("BASIC_MODEL >", value, "basicModel");
            return (Criteria) this;
        }

        public Criteria andBasicModelGreaterThanOrEqualTo(String value) {
            addCriterion("BASIC_MODEL >=", value, "basicModel");
            return (Criteria) this;
        }

        public Criteria andBasicModelLessThan(String value) {
            addCriterion("BASIC_MODEL <", value, "basicModel");
            return (Criteria) this;
        }

        public Criteria andBasicModelLessThanOrEqualTo(String value) {
            addCriterion("BASIC_MODEL <=", value, "basicModel");
            return (Criteria) this;
        }

        public Criteria andBasicModelLike(String value) {
            addCriterion("BASIC_MODEL like", value, "basicModel");
            return (Criteria) this;
        }

        public Criteria andBasicModelNotLike(String value) {
            addCriterion("BASIC_MODEL not like", value, "basicModel");
            return (Criteria) this;
        }

        public Criteria andBasicModelIn(List<String> values) {
            addCriterion("BASIC_MODEL in", values, "basicModel");
            return (Criteria) this;
        }

        public Criteria andBasicModelNotIn(List<String> values) {
            addCriterion("BASIC_MODEL not in", values, "basicModel");
            return (Criteria) this;
        }

        public Criteria andBasicModelBetween(String value1, String value2) {
            addCriterion("BASIC_MODEL between", value1, value2, "basicModel");
            return (Criteria) this;
        }

        public Criteria andBasicModelNotBetween(String value1, String value2) {
            addCriterion("BASIC_MODEL not between", value1, value2, "basicModel");
            return (Criteria) this;
        }

        public Criteria andBasicWifiMacIsNull() {
            addCriterion("BASIC_WIFI_MAC is null");
            return (Criteria) this;
        }

        public Criteria andBasicWifiMacIsNotNull() {
            addCriterion("BASIC_WIFI_MAC is not null");
            return (Criteria) this;
        }

        public Criteria andBasicWifiMacEqualTo(String value) {
            addCriterion("BASIC_WIFI_MAC =", value, "basicWifiMac");
            return (Criteria) this;
        }

        public Criteria andBasicWifiMacNotEqualTo(String value) {
            addCriterion("BASIC_WIFI_MAC <>", value, "basicWifiMac");
            return (Criteria) this;
        }

        public Criteria andBasicWifiMacGreaterThan(String value) {
            addCriterion("BASIC_WIFI_MAC >", value, "basicWifiMac");
            return (Criteria) this;
        }

        public Criteria andBasicWifiMacGreaterThanOrEqualTo(String value) {
            addCriterion("BASIC_WIFI_MAC >=", value, "basicWifiMac");
            return (Criteria) this;
        }

        public Criteria andBasicWifiMacLessThan(String value) {
            addCriterion("BASIC_WIFI_MAC <", value, "basicWifiMac");
            return (Criteria) this;
        }

        public Criteria andBasicWifiMacLessThanOrEqualTo(String value) {
            addCriterion("BASIC_WIFI_MAC <=", value, "basicWifiMac");
            return (Criteria) this;
        }

        public Criteria andBasicWifiMacLike(String value) {
            addCriterion("BASIC_WIFI_MAC like", value, "basicWifiMac");
            return (Criteria) this;
        }

        public Criteria andBasicWifiMacNotLike(String value) {
            addCriterion("BASIC_WIFI_MAC not like", value, "basicWifiMac");
            return (Criteria) this;
        }

        public Criteria andBasicWifiMacIn(List<String> values) {
            addCriterion("BASIC_WIFI_MAC in", values, "basicWifiMac");
            return (Criteria) this;
        }

        public Criteria andBasicWifiMacNotIn(List<String> values) {
            addCriterion("BASIC_WIFI_MAC not in", values, "basicWifiMac");
            return (Criteria) this;
        }

        public Criteria andBasicWifiMacBetween(String value1, String value2) {
            addCriterion("BASIC_WIFI_MAC between", value1, value2, "basicWifiMac");
            return (Criteria) this;
        }

        public Criteria andBasicWifiMacNotBetween(String value1, String value2) {
            addCriterion("BASIC_WIFI_MAC not between", value1, value2, "basicWifiMac");
            return (Criteria) this;
        }

        public Criteria andBasicBleMacIsNull() {
            addCriterion("BASIC_BLE_MAC is null");
            return (Criteria) this;
        }

        public Criteria andBasicBleMacIsNotNull() {
            addCriterion("BASIC_BLE_MAC is not null");
            return (Criteria) this;
        }

        public Criteria andBasicBleMacEqualTo(String value) {
            addCriterion("BASIC_BLE_MAC =", value, "basicBleMac");
            return (Criteria) this;
        }

        public Criteria andBasicBleMacNotEqualTo(String value) {
            addCriterion("BASIC_BLE_MAC <>", value, "basicBleMac");
            return (Criteria) this;
        }

        public Criteria andBasicBleMacGreaterThan(String value) {
            addCriterion("BASIC_BLE_MAC >", value, "basicBleMac");
            return (Criteria) this;
        }

        public Criteria andBasicBleMacGreaterThanOrEqualTo(String value) {
            addCriterion("BASIC_BLE_MAC >=", value, "basicBleMac");
            return (Criteria) this;
        }

        public Criteria andBasicBleMacLessThan(String value) {
            addCriterion("BASIC_BLE_MAC <", value, "basicBleMac");
            return (Criteria) this;
        }

        public Criteria andBasicBleMacLessThanOrEqualTo(String value) {
            addCriterion("BASIC_BLE_MAC <=", value, "basicBleMac");
            return (Criteria) this;
        }

        public Criteria andBasicBleMacLike(String value) {
            addCriterion("BASIC_BLE_MAC like", value, "basicBleMac");
            return (Criteria) this;
        }

        public Criteria andBasicBleMacNotLike(String value) {
            addCriterion("BASIC_BLE_MAC not like", value, "basicBleMac");
            return (Criteria) this;
        }

        public Criteria andBasicBleMacIn(List<String> values) {
            addCriterion("BASIC_BLE_MAC in", values, "basicBleMac");
            return (Criteria) this;
        }

        public Criteria andBasicBleMacNotIn(List<String> values) {
            addCriterion("BASIC_BLE_MAC not in", values, "basicBleMac");
            return (Criteria) this;
        }

        public Criteria andBasicBleMacBetween(String value1, String value2) {
            addCriterion("BASIC_BLE_MAC between", value1, value2, "basicBleMac");
            return (Criteria) this;
        }

        public Criteria andBasicBleMacNotBetween(String value1, String value2) {
            addCriterion("BASIC_BLE_MAC not between", value1, value2, "basicBleMac");
            return (Criteria) this;
        }

        public Criteria andBasicActivationTimeIsNull() {
            addCriterion("BASIC_ACTIVATION_TIME is null");
            return (Criteria) this;
        }

        public Criteria andBasicActivationTimeIsNotNull() {
            addCriterion("BASIC_ACTIVATION_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andBasicActivationTimeEqualTo(Date value) {
            addCriterion("BASIC_ACTIVATION_TIME =", value, "basicActivationTime");
            return (Criteria) this;
        }

        public Criteria andBasicActivationTimeNotEqualTo(Date value) {
            addCriterion("BASIC_ACTIVATION_TIME <>", value, "basicActivationTime");
            return (Criteria) this;
        }

        public Criteria andBasicActivationTimeGreaterThan(Date value) {
            addCriterion("BASIC_ACTIVATION_TIME >", value, "basicActivationTime");
            return (Criteria) this;
        }

        public Criteria andBasicActivationTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("BASIC_ACTIVATION_TIME >=", value, "basicActivationTime");
            return (Criteria) this;
        }

        public Criteria andBasicActivationTimeLessThan(Date value) {
            addCriterion("BASIC_ACTIVATION_TIME <", value, "basicActivationTime");
            return (Criteria) this;
        }

        public Criteria andBasicActivationTimeLessThanOrEqualTo(Date value) {
            addCriterion("BASIC_ACTIVATION_TIME <=", value, "basicActivationTime");
            return (Criteria) this;
        }

        public Criteria andBasicActivationTimeIn(List<Date> values) {
            addCriterion("BASIC_ACTIVATION_TIME in", values, "basicActivationTime");
            return (Criteria) this;
        }

        public Criteria andBasicActivationTimeNotIn(List<Date> values) {
            addCriterion("BASIC_ACTIVATION_TIME not in", values, "basicActivationTime");
            return (Criteria) this;
        }

        public Criteria andBasicActivationTimeBetween(Date value1, Date value2) {
            addCriterion("BASIC_ACTIVATION_TIME between", value1, value2, "basicActivationTime");
            return (Criteria) this;
        }

        public Criteria andBasicActivationTimeNotBetween(Date value1, Date value2) {
            addCriterion("BASIC_ACTIVATION_TIME not between", value1, value2, "basicActivationTime");
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