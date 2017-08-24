package com.iguan.entity.model;

import java.util.Date;

public class LOGPushInfo {
    private Long id;

    private Long pushId;

    private Integer pushType;

    private Integer pushContextType;

    private String pushDetail;

    private Date createTime;

    private String pushContext;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPushId() {
        return pushId;
    }

    public void setPushId(Long pushId) {
        this.pushId = pushId;
    }

    public Integer getPushType() {
        return pushType;
    }

    public void setPushType(Integer pushType) {
        this.pushType = pushType;
    }

    public Integer getPushContextType() {
        return pushContextType;
    }

    public void setPushContextType(Integer pushContextType) {
        this.pushContextType = pushContextType;
    }

    public String getPushDetail() {
        return pushDetail;
    }

    public void setPushDetail(String pushDetail) {
        this.pushDetail = pushDetail == null ? null : pushDetail.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getPushContext() {
        return pushContext;
    }

    public void setPushContext(String pushContext) {
        this.pushContext = pushContext == null ? null : pushContext.trim();
    }
}