package com.iguan.entity.model;

import java.util.Date;

public class HSRomType {
    private Long id;

    private String romTypeName;

    private String romTypeCode;

    private String romTypeDetaul;

    private Date createTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRomTypeName() {
        return romTypeName;
    }

    public void setRomTypeName(String romTypeName) {
        this.romTypeName = romTypeName == null ? null : romTypeName.trim();
    }

    public String getRomTypeCode() {
        return romTypeCode;
    }

    public void setRomTypeCode(String romTypeCode) {
        this.romTypeCode = romTypeCode == null ? null : romTypeCode.trim();
    }

    public String getRomTypeDetaul() {
        return romTypeDetaul;
    }

    public void setRomTypeDetaul(String romTypeDetaul) {
        this.romTypeDetaul = romTypeDetaul == null ? null : romTypeDetaul.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}