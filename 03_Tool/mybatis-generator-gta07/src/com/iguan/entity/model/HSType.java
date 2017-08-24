package com.iguan.entity.model;

import java.util.Date;

public class HSType {
    private Long id;

    private String typeName;

    private String typeCode;

    private String typeDetail;

    private Date createTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName == null ? null : typeName.trim();
    }

    public String getTypeCode() {
        return typeCode;
    }

    public void setTypeCode(String typeCode) {
        this.typeCode = typeCode == null ? null : typeCode.trim();
    }

    public String getTypeDetail() {
        return typeDetail;
    }

    public void setTypeDetail(String typeDetail) {
        this.typeDetail = typeDetail == null ? null : typeDetail.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}