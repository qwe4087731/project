package com.iguan.entity.model;

import java.util.Date;

public class HSRom {
    private Long id;

    private Long apiId;

    private String romName;

    private String romCode;

    private Long romTypeId;

    private Long romServiceCode;

    private String romUploadUrl;

    private Date romReleaseDatetime;

    private String romReleaseDetail;

    private String romReleaseDetailUrl;

    private Date createTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getApiId() {
        return apiId;
    }

    public void setApiId(Long apiId) {
        this.apiId = apiId;
    }

    public String getRomName() {
        return romName;
    }

    public void setRomName(String romName) {
        this.romName = romName == null ? null : romName.trim();
    }

    public String getRomCode() {
        return romCode;
    }

    public void setRomCode(String romCode) {
        this.romCode = romCode == null ? null : romCode.trim();
    }

    public Long getRomTypeId() {
        return romTypeId;
    }

    public void setRomTypeId(Long romTypeId) {
        this.romTypeId = romTypeId;
    }

    public Long getRomServiceCode() {
        return romServiceCode;
    }

    public void setRomServiceCode(Long romServiceCode) {
        this.romServiceCode = romServiceCode;
    }

    public String getRomUploadUrl() {
        return romUploadUrl;
    }

    public void setRomUploadUrl(String romUploadUrl) {
        this.romUploadUrl = romUploadUrl == null ? null : romUploadUrl.trim();
    }

    public Date getRomReleaseDatetime() {
        return romReleaseDatetime;
    }

    public void setRomReleaseDatetime(Date romReleaseDatetime) {
        this.romReleaseDatetime = romReleaseDatetime;
    }

    public String getRomReleaseDetail() {
        return romReleaseDetail;
    }

    public void setRomReleaseDetail(String romReleaseDetail) {
        this.romReleaseDetail = romReleaseDetail == null ? null : romReleaseDetail.trim();
    }

    public String getRomReleaseDetailUrl() {
        return romReleaseDetailUrl;
    }

    public void setRomReleaseDetailUrl(String romReleaseDetailUrl) {
        this.romReleaseDetailUrl = romReleaseDetailUrl == null ? null : romReleaseDetailUrl.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}