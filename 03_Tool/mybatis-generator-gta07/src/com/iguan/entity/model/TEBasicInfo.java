package com.iguan.entity.model;

import java.util.Date;

public class TEBasicInfo {
    private Long id;

    private String basicSn;

    private String basicModel;

    private String basicWifiMac;

    private String basicBleMac;

    private Date basicActivationTime;

    private Date createTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBasicSn() {
        return basicSn;
    }

    public void setBasicSn(String basicSn) {
        this.basicSn = basicSn == null ? null : basicSn.trim();
    }

    public String getBasicModel() {
        return basicModel;
    }

    public void setBasicModel(String basicModel) {
        this.basicModel = basicModel == null ? null : basicModel.trim();
    }

    public String getBasicWifiMac() {
        return basicWifiMac;
    }

    public void setBasicWifiMac(String basicWifiMac) {
        this.basicWifiMac = basicWifiMac == null ? null : basicWifiMac.trim();
    }

    public String getBasicBleMac() {
        return basicBleMac;
    }

    public void setBasicBleMac(String basicBleMac) {
        this.basicBleMac = basicBleMac == null ? null : basicBleMac.trim();
    }

    public Date getBasicActivationTime() {
        return basicActivationTime;
    }

    public void setBasicActivationTime(Date basicActivationTime) {
        this.basicActivationTime = basicActivationTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}