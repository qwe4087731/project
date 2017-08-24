package com.iguan.entity.model;

import java.util.Date;

public class HSCmwParmSetting {
    private Long id;

    private Long cmwId;

    private String cmwParmKey;

    private String cmwParmValue;

    private Date createTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCmwId() {
        return cmwId;
    }

    public void setCmwId(Long cmwId) {
        this.cmwId = cmwId;
    }

    public String getCmwParmKey() {
        return cmwParmKey;
    }

    public void setCmwParmKey(String cmwParmKey) {
        this.cmwParmKey = cmwParmKey == null ? null : cmwParmKey.trim();
    }

    public String getCmwParmValue() {
        return cmwParmValue;
    }

    public void setCmwParmValue(String cmwParmValue) {
        this.cmwParmValue = cmwParmValue == null ? null : cmwParmValue.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}