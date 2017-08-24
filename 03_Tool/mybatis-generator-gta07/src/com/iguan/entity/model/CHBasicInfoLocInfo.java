package com.iguan.entity.model;

import java.util.Date;

public class CHBasicInfoLocInfo {
    private Long id;

    private Long basicId;

    private Double locAccurancy;

    private Double locLongitude;

    private Double locLatitude;

    private String logCmwCode;

    private Long locTime;

    private Date uploadTime;

    private Date createTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getBasicId() {
        return basicId;
    }

    public void setBasicId(Long basicId) {
        this.basicId = basicId;
    }

    public Double getLocAccurancy() {
        return locAccurancy;
    }

    public void setLocAccurancy(Double locAccurancy) {
        this.locAccurancy = locAccurancy;
    }

    public Double getLocLongitude() {
        return locLongitude;
    }

    public void setLocLongitude(Double locLongitude) {
        this.locLongitude = locLongitude;
    }

    public Double getLocLatitude() {
        return locLatitude;
    }

    public void setLocLatitude(Double locLatitude) {
        this.locLatitude = locLatitude;
    }

    public String getLogCmwCode() {
        return logCmwCode;
    }

    public void setLogCmwCode(String logCmwCode) {
        this.logCmwCode = logCmwCode == null ? null : logCmwCode.trim();
    }

    public Long getLocTime() {
        return locTime;
    }

    public void setLocTime(Long locTime) {
        this.locTime = locTime;
    }

    public Date getUploadTime() {
        return uploadTime;
    }

    public void setUploadTime(Date uploadTime) {
        this.uploadTime = uploadTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}