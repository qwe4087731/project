package com.iguan.entity.model;

import java.util.Date;

public class HSCmw {
    private Long id;

    private String cmwName;

    private String cmwCode;

    private String cmwDetail;

    private Long cmwTypeId;

    private Date createTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCmwName() {
        return cmwName;
    }

    public void setCmwName(String cmwName) {
        this.cmwName = cmwName == null ? null : cmwName.trim();
    }

    public String getCmwCode() {
        return cmwCode;
    }

    public void setCmwCode(String cmwCode) {
        this.cmwCode = cmwCode == null ? null : cmwCode.trim();
    }

    public String getCmwDetail() {
        return cmwDetail;
    }

    public void setCmwDetail(String cmwDetail) {
        this.cmwDetail = cmwDetail == null ? null : cmwDetail.trim();
    }

    public Long getCmwTypeId() {
        return cmwTypeId;
    }

    public void setCmwTypeId(Long cmwTypeId) {
        this.cmwTypeId = cmwTypeId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}