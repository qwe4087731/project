package com.iguan.entity.model;

import java.util.Date;

public class HSCmwType {
    private Long id;

    private String cmwTypeName;

    private String cmwTypeCode;

    private String cmwTypeDetail;

    private Date createTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCmwTypeName() {
        return cmwTypeName;
    }

    public void setCmwTypeName(String cmwTypeName) {
        this.cmwTypeName = cmwTypeName == null ? null : cmwTypeName.trim();
    }

    public String getCmwTypeCode() {
        return cmwTypeCode;
    }

    public void setCmwTypeCode(String cmwTypeCode) {
        this.cmwTypeCode = cmwTypeCode == null ? null : cmwTypeCode.trim();
    }

    public String getCmwTypeDetail() {
        return cmwTypeDetail;
    }

    public void setCmwTypeDetail(String cmwTypeDetail) {
        this.cmwTypeDetail = cmwTypeDetail == null ? null : cmwTypeDetail.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}