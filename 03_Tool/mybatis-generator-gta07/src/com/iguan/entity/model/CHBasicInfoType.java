package com.iguan.entity.model;

import java.util.Date;

public class CHBasicInfoType {
    private Long id;

    private Long basicId;

    private Long typeId;

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

    public Long getTypeId() {
        return typeId;
    }

    public void setTypeId(Long typeId) {
        this.typeId = typeId;
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