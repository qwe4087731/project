package com.iguan.entity.model;

import java.util.Date;

public class CHBasicInfoLngAsrSetting {
    private Long id;

    private Long basicId;

    private Long asrCmwId;

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

    public Long getAsrCmwId() {
        return asrCmwId;
    }

    public void setAsrCmwId(Long asrCmwId) {
        this.asrCmwId = asrCmwId;
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