package com.iguan.entity.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HSRomExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HSRomExample() {
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

        public Criteria andApiIdIsNull() {
            addCriterion("API_ID is null");
            return (Criteria) this;
        }

        public Criteria andApiIdIsNotNull() {
            addCriterion("API_ID is not null");
            return (Criteria) this;
        }

        public Criteria andApiIdEqualTo(Long value) {
            addCriterion("API_ID =", value, "apiId");
            return (Criteria) this;
        }

        public Criteria andApiIdNotEqualTo(Long value) {
            addCriterion("API_ID <>", value, "apiId");
            return (Criteria) this;
        }

        public Criteria andApiIdGreaterThan(Long value) {
            addCriterion("API_ID >", value, "apiId");
            return (Criteria) this;
        }

        public Criteria andApiIdGreaterThanOrEqualTo(Long value) {
            addCriterion("API_ID >=", value, "apiId");
            return (Criteria) this;
        }

        public Criteria andApiIdLessThan(Long value) {
            addCriterion("API_ID <", value, "apiId");
            return (Criteria) this;
        }

        public Criteria andApiIdLessThanOrEqualTo(Long value) {
            addCriterion("API_ID <=", value, "apiId");
            return (Criteria) this;
        }

        public Criteria andApiIdIn(List<Long> values) {
            addCriterion("API_ID in", values, "apiId");
            return (Criteria) this;
        }

        public Criteria andApiIdNotIn(List<Long> values) {
            addCriterion("API_ID not in", values, "apiId");
            return (Criteria) this;
        }

        public Criteria andApiIdBetween(Long value1, Long value2) {
            addCriterion("API_ID between", value1, value2, "apiId");
            return (Criteria) this;
        }

        public Criteria andApiIdNotBetween(Long value1, Long value2) {
            addCriterion("API_ID not between", value1, value2, "apiId");
            return (Criteria) this;
        }

        public Criteria andRomNameIsNull() {
            addCriterion("ROM_NAME is null");
            return (Criteria) this;
        }

        public Criteria andRomNameIsNotNull() {
            addCriterion("ROM_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andRomNameEqualTo(String value) {
            addCriterion("ROM_NAME =", value, "romName");
            return (Criteria) this;
        }

        public Criteria andRomNameNotEqualTo(String value) {
            addCriterion("ROM_NAME <>", value, "romName");
            return (Criteria) this;
        }

        public Criteria andRomNameGreaterThan(String value) {
            addCriterion("ROM_NAME >", value, "romName");
            return (Criteria) this;
        }

        public Criteria andRomNameGreaterThanOrEqualTo(String value) {
            addCriterion("ROM_NAME >=", value, "romName");
            return (Criteria) this;
        }

        public Criteria andRomNameLessThan(String value) {
            addCriterion("ROM_NAME <", value, "romName");
            return (Criteria) this;
        }

        public Criteria andRomNameLessThanOrEqualTo(String value) {
            addCriterion("ROM_NAME <=", value, "romName");
            return (Criteria) this;
        }

        public Criteria andRomNameLike(String value) {
            addCriterion("ROM_NAME like", value, "romName");
            return (Criteria) this;
        }

        public Criteria andRomNameNotLike(String value) {
            addCriterion("ROM_NAME not like", value, "romName");
            return (Criteria) this;
        }

        public Criteria andRomNameIn(List<String> values) {
            addCriterion("ROM_NAME in", values, "romName");
            return (Criteria) this;
        }

        public Criteria andRomNameNotIn(List<String> values) {
            addCriterion("ROM_NAME not in", values, "romName");
            return (Criteria) this;
        }

        public Criteria andRomNameBetween(String value1, String value2) {
            addCriterion("ROM_NAME between", value1, value2, "romName");
            return (Criteria) this;
        }

        public Criteria andRomNameNotBetween(String value1, String value2) {
            addCriterion("ROM_NAME not between", value1, value2, "romName");
            return (Criteria) this;
        }

        public Criteria andRomCodeIsNull() {
            addCriterion("ROM_CODE is null");
            return (Criteria) this;
        }

        public Criteria andRomCodeIsNotNull() {
            addCriterion("ROM_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andRomCodeEqualTo(String value) {
            addCriterion("ROM_CODE =", value, "romCode");
            return (Criteria) this;
        }

        public Criteria andRomCodeNotEqualTo(String value) {
            addCriterion("ROM_CODE <>", value, "romCode");
            return (Criteria) this;
        }

        public Criteria andRomCodeGreaterThan(String value) {
            addCriterion("ROM_CODE >", value, "romCode");
            return (Criteria) this;
        }

        public Criteria andRomCodeGreaterThanOrEqualTo(String value) {
            addCriterion("ROM_CODE >=", value, "romCode");
            return (Criteria) this;
        }

        public Criteria andRomCodeLessThan(String value) {
            addCriterion("ROM_CODE <", value, "romCode");
            return (Criteria) this;
        }

        public Criteria andRomCodeLessThanOrEqualTo(String value) {
            addCriterion("ROM_CODE <=", value, "romCode");
            return (Criteria) this;
        }

        public Criteria andRomCodeLike(String value) {
            addCriterion("ROM_CODE like", value, "romCode");
            return (Criteria) this;
        }

        public Criteria andRomCodeNotLike(String value) {
            addCriterion("ROM_CODE not like", value, "romCode");
            return (Criteria) this;
        }

        public Criteria andRomCodeIn(List<String> values) {
            addCriterion("ROM_CODE in", values, "romCode");
            return (Criteria) this;
        }

        public Criteria andRomCodeNotIn(List<String> values) {
            addCriterion("ROM_CODE not in", values, "romCode");
            return (Criteria) this;
        }

        public Criteria andRomCodeBetween(String value1, String value2) {
            addCriterion("ROM_CODE between", value1, value2, "romCode");
            return (Criteria) this;
        }

        public Criteria andRomCodeNotBetween(String value1, String value2) {
            addCriterion("ROM_CODE not between", value1, value2, "romCode");
            return (Criteria) this;
        }

        public Criteria andRomTypeIdIsNull() {
            addCriterion("ROM_TYPE_ID is null");
            return (Criteria) this;
        }

        public Criteria andRomTypeIdIsNotNull() {
            addCriterion("ROM_TYPE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRomTypeIdEqualTo(Long value) {
            addCriterion("ROM_TYPE_ID =", value, "romTypeId");
            return (Criteria) this;
        }

        public Criteria andRomTypeIdNotEqualTo(Long value) {
            addCriterion("ROM_TYPE_ID <>", value, "romTypeId");
            return (Criteria) this;
        }

        public Criteria andRomTypeIdGreaterThan(Long value) {
            addCriterion("ROM_TYPE_ID >", value, "romTypeId");
            return (Criteria) this;
        }

        public Criteria andRomTypeIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ROM_TYPE_ID >=", value, "romTypeId");
            return (Criteria) this;
        }

        public Criteria andRomTypeIdLessThan(Long value) {
            addCriterion("ROM_TYPE_ID <", value, "romTypeId");
            return (Criteria) this;
        }

        public Criteria andRomTypeIdLessThanOrEqualTo(Long value) {
            addCriterion("ROM_TYPE_ID <=", value, "romTypeId");
            return (Criteria) this;
        }

        public Criteria andRomTypeIdIn(List<Long> values) {
            addCriterion("ROM_TYPE_ID in", values, "romTypeId");
            return (Criteria) this;
        }

        public Criteria andRomTypeIdNotIn(List<Long> values) {
            addCriterion("ROM_TYPE_ID not in", values, "romTypeId");
            return (Criteria) this;
        }

        public Criteria andRomTypeIdBetween(Long value1, Long value2) {
            addCriterion("ROM_TYPE_ID between", value1, value2, "romTypeId");
            return (Criteria) this;
        }

        public Criteria andRomTypeIdNotBetween(Long value1, Long value2) {
            addCriterion("ROM_TYPE_ID not between", value1, value2, "romTypeId");
            return (Criteria) this;
        }

        public Criteria andRomServiceCodeIsNull() {
            addCriterion("ROM_SERVICE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andRomServiceCodeIsNotNull() {
            addCriterion("ROM_SERVICE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andRomServiceCodeEqualTo(Long value) {
            addCriterion("ROM_SERVICE_CODE =", value, "romServiceCode");
            return (Criteria) this;
        }

        public Criteria andRomServiceCodeNotEqualTo(Long value) {
            addCriterion("ROM_SERVICE_CODE <>", value, "romServiceCode");
            return (Criteria) this;
        }

        public Criteria andRomServiceCodeGreaterThan(Long value) {
            addCriterion("ROM_SERVICE_CODE >", value, "romServiceCode");
            return (Criteria) this;
        }

        public Criteria andRomServiceCodeGreaterThanOrEqualTo(Long value) {
            addCriterion("ROM_SERVICE_CODE >=", value, "romServiceCode");
            return (Criteria) this;
        }

        public Criteria andRomServiceCodeLessThan(Long value) {
            addCriterion("ROM_SERVICE_CODE <", value, "romServiceCode");
            return (Criteria) this;
        }

        public Criteria andRomServiceCodeLessThanOrEqualTo(Long value) {
            addCriterion("ROM_SERVICE_CODE <=", value, "romServiceCode");
            return (Criteria) this;
        }

        public Criteria andRomServiceCodeIn(List<Long> values) {
            addCriterion("ROM_SERVICE_CODE in", values, "romServiceCode");
            return (Criteria) this;
        }

        public Criteria andRomServiceCodeNotIn(List<Long> values) {
            addCriterion("ROM_SERVICE_CODE not in", values, "romServiceCode");
            return (Criteria) this;
        }

        public Criteria andRomServiceCodeBetween(Long value1, Long value2) {
            addCriterion("ROM_SERVICE_CODE between", value1, value2, "romServiceCode");
            return (Criteria) this;
        }

        public Criteria andRomServiceCodeNotBetween(Long value1, Long value2) {
            addCriterion("ROM_SERVICE_CODE not between", value1, value2, "romServiceCode");
            return (Criteria) this;
        }

        public Criteria andRomUploadUrlIsNull() {
            addCriterion("ROM_UPLOAD_URL is null");
            return (Criteria) this;
        }

        public Criteria andRomUploadUrlIsNotNull() {
            addCriterion("ROM_UPLOAD_URL is not null");
            return (Criteria) this;
        }

        public Criteria andRomUploadUrlEqualTo(String value) {
            addCriterion("ROM_UPLOAD_URL =", value, "romUploadUrl");
            return (Criteria) this;
        }

        public Criteria andRomUploadUrlNotEqualTo(String value) {
            addCriterion("ROM_UPLOAD_URL <>", value, "romUploadUrl");
            return (Criteria) this;
        }

        public Criteria andRomUploadUrlGreaterThan(String value) {
            addCriterion("ROM_UPLOAD_URL >", value, "romUploadUrl");
            return (Criteria) this;
        }

        public Criteria andRomUploadUrlGreaterThanOrEqualTo(String value) {
            addCriterion("ROM_UPLOAD_URL >=", value, "romUploadUrl");
            return (Criteria) this;
        }

        public Criteria andRomUploadUrlLessThan(String value) {
            addCriterion("ROM_UPLOAD_URL <", value, "romUploadUrl");
            return (Criteria) this;
        }

        public Criteria andRomUploadUrlLessThanOrEqualTo(String value) {
            addCriterion("ROM_UPLOAD_URL <=", value, "romUploadUrl");
            return (Criteria) this;
        }

        public Criteria andRomUploadUrlLike(String value) {
            addCriterion("ROM_UPLOAD_URL like", value, "romUploadUrl");
            return (Criteria) this;
        }

        public Criteria andRomUploadUrlNotLike(String value) {
            addCriterion("ROM_UPLOAD_URL not like", value, "romUploadUrl");
            return (Criteria) this;
        }

        public Criteria andRomUploadUrlIn(List<String> values) {
            addCriterion("ROM_UPLOAD_URL in", values, "romUploadUrl");
            return (Criteria) this;
        }

        public Criteria andRomUploadUrlNotIn(List<String> values) {
            addCriterion("ROM_UPLOAD_URL not in", values, "romUploadUrl");
            return (Criteria) this;
        }

        public Criteria andRomUploadUrlBetween(String value1, String value2) {
            addCriterion("ROM_UPLOAD_URL between", value1, value2, "romUploadUrl");
            return (Criteria) this;
        }

        public Criteria andRomUploadUrlNotBetween(String value1, String value2) {
            addCriterion("ROM_UPLOAD_URL not between", value1, value2, "romUploadUrl");
            return (Criteria) this;
        }

        public Criteria andRomReleaseDatetimeIsNull() {
            addCriterion("ROM_RELEASE_DATETIME is null");
            return (Criteria) this;
        }

        public Criteria andRomReleaseDatetimeIsNotNull() {
            addCriterion("ROM_RELEASE_DATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andRomReleaseDatetimeEqualTo(Date value) {
            addCriterion("ROM_RELEASE_DATETIME =", value, "romReleaseDatetime");
            return (Criteria) this;
        }

        public Criteria andRomReleaseDatetimeNotEqualTo(Date value) {
            addCriterion("ROM_RELEASE_DATETIME <>", value, "romReleaseDatetime");
            return (Criteria) this;
        }

        public Criteria andRomReleaseDatetimeGreaterThan(Date value) {
            addCriterion("ROM_RELEASE_DATETIME >", value, "romReleaseDatetime");
            return (Criteria) this;
        }

        public Criteria andRomReleaseDatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ROM_RELEASE_DATETIME >=", value, "romReleaseDatetime");
            return (Criteria) this;
        }

        public Criteria andRomReleaseDatetimeLessThan(Date value) {
            addCriterion("ROM_RELEASE_DATETIME <", value, "romReleaseDatetime");
            return (Criteria) this;
        }

        public Criteria andRomReleaseDatetimeLessThanOrEqualTo(Date value) {
            addCriterion("ROM_RELEASE_DATETIME <=", value, "romReleaseDatetime");
            return (Criteria) this;
        }

        public Criteria andRomReleaseDatetimeIn(List<Date> values) {
            addCriterion("ROM_RELEASE_DATETIME in", values, "romReleaseDatetime");
            return (Criteria) this;
        }

        public Criteria andRomReleaseDatetimeNotIn(List<Date> values) {
            addCriterion("ROM_RELEASE_DATETIME not in", values, "romReleaseDatetime");
            return (Criteria) this;
        }

        public Criteria andRomReleaseDatetimeBetween(Date value1, Date value2) {
            addCriterion("ROM_RELEASE_DATETIME between", value1, value2, "romReleaseDatetime");
            return (Criteria) this;
        }

        public Criteria andRomReleaseDatetimeNotBetween(Date value1, Date value2) {
            addCriterion("ROM_RELEASE_DATETIME not between", value1, value2, "romReleaseDatetime");
            return (Criteria) this;
        }

        public Criteria andRomReleaseDetailIsNull() {
            addCriterion("ROM_RELEASE_DETAIL is null");
            return (Criteria) this;
        }

        public Criteria andRomReleaseDetailIsNotNull() {
            addCriterion("ROM_RELEASE_DETAIL is not null");
            return (Criteria) this;
        }

        public Criteria andRomReleaseDetailEqualTo(String value) {
            addCriterion("ROM_RELEASE_DETAIL =", value, "romReleaseDetail");
            return (Criteria) this;
        }

        public Criteria andRomReleaseDetailNotEqualTo(String value) {
            addCriterion("ROM_RELEASE_DETAIL <>", value, "romReleaseDetail");
            return (Criteria) this;
        }

        public Criteria andRomReleaseDetailGreaterThan(String value) {
            addCriterion("ROM_RELEASE_DETAIL >", value, "romReleaseDetail");
            return (Criteria) this;
        }

        public Criteria andRomReleaseDetailGreaterThanOrEqualTo(String value) {
            addCriterion("ROM_RELEASE_DETAIL >=", value, "romReleaseDetail");
            return (Criteria) this;
        }

        public Criteria andRomReleaseDetailLessThan(String value) {
            addCriterion("ROM_RELEASE_DETAIL <", value, "romReleaseDetail");
            return (Criteria) this;
        }

        public Criteria andRomReleaseDetailLessThanOrEqualTo(String value) {
            addCriterion("ROM_RELEASE_DETAIL <=", value, "romReleaseDetail");
            return (Criteria) this;
        }

        public Criteria andRomReleaseDetailLike(String value) {
            addCriterion("ROM_RELEASE_DETAIL like", value, "romReleaseDetail");
            return (Criteria) this;
        }

        public Criteria andRomReleaseDetailNotLike(String value) {
            addCriterion("ROM_RELEASE_DETAIL not like", value, "romReleaseDetail");
            return (Criteria) this;
        }

        public Criteria andRomReleaseDetailIn(List<String> values) {
            addCriterion("ROM_RELEASE_DETAIL in", values, "romReleaseDetail");
            return (Criteria) this;
        }

        public Criteria andRomReleaseDetailNotIn(List<String> values) {
            addCriterion("ROM_RELEASE_DETAIL not in", values, "romReleaseDetail");
            return (Criteria) this;
        }

        public Criteria andRomReleaseDetailBetween(String value1, String value2) {
            addCriterion("ROM_RELEASE_DETAIL between", value1, value2, "romReleaseDetail");
            return (Criteria) this;
        }

        public Criteria andRomReleaseDetailNotBetween(String value1, String value2) {
            addCriterion("ROM_RELEASE_DETAIL not between", value1, value2, "romReleaseDetail");
            return (Criteria) this;
        }

        public Criteria andRomReleaseDetailUrlIsNull() {
            addCriterion("ROM_RELEASE_DETAIL_URL is null");
            return (Criteria) this;
        }

        public Criteria andRomReleaseDetailUrlIsNotNull() {
            addCriterion("ROM_RELEASE_DETAIL_URL is not null");
            return (Criteria) this;
        }

        public Criteria andRomReleaseDetailUrlEqualTo(String value) {
            addCriterion("ROM_RELEASE_DETAIL_URL =", value, "romReleaseDetailUrl");
            return (Criteria) this;
        }

        public Criteria andRomReleaseDetailUrlNotEqualTo(String value) {
            addCriterion("ROM_RELEASE_DETAIL_URL <>", value, "romReleaseDetailUrl");
            return (Criteria) this;
        }

        public Criteria andRomReleaseDetailUrlGreaterThan(String value) {
            addCriterion("ROM_RELEASE_DETAIL_URL >", value, "romReleaseDetailUrl");
            return (Criteria) this;
        }

        public Criteria andRomReleaseDetailUrlGreaterThanOrEqualTo(String value) {
            addCriterion("ROM_RELEASE_DETAIL_URL >=", value, "romReleaseDetailUrl");
            return (Criteria) this;
        }

        public Criteria andRomReleaseDetailUrlLessThan(String value) {
            addCriterion("ROM_RELEASE_DETAIL_URL <", value, "romReleaseDetailUrl");
            return (Criteria) this;
        }

        public Criteria andRomReleaseDetailUrlLessThanOrEqualTo(String value) {
            addCriterion("ROM_RELEASE_DETAIL_URL <=", value, "romReleaseDetailUrl");
            return (Criteria) this;
        }

        public Criteria andRomReleaseDetailUrlLike(String value) {
            addCriterion("ROM_RELEASE_DETAIL_URL like", value, "romReleaseDetailUrl");
            return (Criteria) this;
        }

        public Criteria andRomReleaseDetailUrlNotLike(String value) {
            addCriterion("ROM_RELEASE_DETAIL_URL not like", value, "romReleaseDetailUrl");
            return (Criteria) this;
        }

        public Criteria andRomReleaseDetailUrlIn(List<String> values) {
            addCriterion("ROM_RELEASE_DETAIL_URL in", values, "romReleaseDetailUrl");
            return (Criteria) this;
        }

        public Criteria andRomReleaseDetailUrlNotIn(List<String> values) {
            addCriterion("ROM_RELEASE_DETAIL_URL not in", values, "romReleaseDetailUrl");
            return (Criteria) this;
        }

        public Criteria andRomReleaseDetailUrlBetween(String value1, String value2) {
            addCriterion("ROM_RELEASE_DETAIL_URL between", value1, value2, "romReleaseDetailUrl");
            return (Criteria) this;
        }

        public Criteria andRomReleaseDetailUrlNotBetween(String value1, String value2) {
            addCriterion("ROM_RELEASE_DETAIL_URL not between", value1, value2, "romReleaseDetailUrl");
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