package com.iguan.entity.model;

import java.util.Date;

public class CHBasicInfoApp {
    private Long id;

    private Long basicId;

    private Date uploadTime;

    private Date createTime;

    private String appGroupData;

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

    public String getAppGroupData() {
        return appGroupData;
    }

    public void setAppGroupData(String appGroupData) {
        this.appGroupData = appGroupData == null ? null : appGroupData.trim();
    }
}