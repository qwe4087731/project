package com.iguan.entity.model;

import java.util.Date;

public class SettingCmwLng {
    private Long id;

    private Long cmwId;

    private Long lngTypeId;

    private Integer lngState;

    private Integer lngStart;

    private String lngKey;

    private String lngValue;

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

    public Long getLngTypeId() {
        return lngTypeId;
    }

    public void setLngTypeId(Long lngTypeId) {
        this.lngTypeId = lngTypeId;
    }

    public Integer getLngState() {
        return lngState;
    }

    public void setLngState(Integer lngState) {
        this.lngState = lngState;
    }

    public Integer getLngStart() {
        return lngStart;
    }

    public void setLngStart(Integer lngStart) {
        this.lngStart = lngStart;
    }

    public String getLngKey() {
        return lngKey;
    }

    public void setLngKey(String lngKey) {
        this.lngKey = lngKey == null ? null : lngKey.trim();
    }

    public String getLngValue() {
        return lngValue;
    }

    public void setLngValue(String lngValue) {
        this.lngValue = lngValue == null ? null : lngValue.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}