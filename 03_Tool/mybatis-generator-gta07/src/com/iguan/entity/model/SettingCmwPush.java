package com.iguan.entity.model;

import java.util.Date;

public class SettingCmwPush {
    private Long id;

    private Long cmwId;

    private String pushName;

    private String pushDetail;

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

    public String getPushName() {
        return pushName;
    }

    public void setPushName(String pushName) {
        this.pushName = pushName == null ? null : pushName.trim();
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
}