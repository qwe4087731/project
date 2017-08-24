package com.iguan.entity.model;

import java.util.Date;

public class SettingCmwLngType {
    private Long id;

    private String lngTypeName;

    private String lngTypeCode;

    private String lngTypeDetail;

    private Date createTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLngTypeName() {
        return lngTypeName;
    }

    public void setLngTypeName(String lngTypeName) {
        this.lngTypeName = lngTypeName == null ? null : lngTypeName.trim();
    }

    public String getLngTypeCode() {
        return lngTypeCode;
    }

    public void setLngTypeCode(String lngTypeCode) {
        this.lngTypeCode = lngTypeCode == null ? null : lngTypeCode.trim();
    }

    public String getLngTypeDetail() {
        return lngTypeDetail;
    }

    public void setLngTypeDetail(String lngTypeDetail) {
        this.lngTypeDetail = lngTypeDetail == null ? null : lngTypeDetail.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}