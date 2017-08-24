package com.iguan.entity.model;

import java.util.Date;

public class CHBasicInfoXltInfo {
    private Long id;

    private Long basicId;

    private Long locId;

    private Integer lngElectricity;

    private String lngSourceCode;

    private String lngTargetCode;

    private String xltSourceContext;

    private String xltTargetContext;

    private String xltCmwAsrCode;

    private String xltCmwCode;

    private String xltCmwTtsCode;

    private Long xltIdentificationTime;

    private Long xltTranslateTime;

    private Long xltSynthesisTime;

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

    public Long getLocId() {
        return locId;
    }

    public void setLocId(Long locId) {
        this.locId = locId;
    }

    public Integer getLngElectricity() {
        return lngElectricity;
    }

    public void setLngElectricity(Integer lngElectricity) {
        this.lngElectricity = lngElectricity;
    }

    public String getLngSourceCode() {
        return lngSourceCode;
    }

    public void setLngSourceCode(String lngSourceCode) {
        this.lngSourceCode = lngSourceCode == null ? null : lngSourceCode.trim();
    }

    public String getLngTargetCode() {
        return lngTargetCode;
    }

    public void setLngTargetCode(String lngTargetCode) {
        this.lngTargetCode = lngTargetCode == null ? null : lngTargetCode.trim();
    }

    public String getXltSourceContext() {
        return xltSourceContext;
    }

    public void setXltSourceContext(String xltSourceContext) {
        this.xltSourceContext = xltSourceContext == null ? null : xltSourceContext.trim();
    }

    public String getXltTargetContext() {
        return xltTargetContext;
    }

    public void setXltTargetContext(String xltTargetContext) {
        this.xltTargetContext = xltTargetContext == null ? null : xltTargetContext.trim();
    }

    public String getXltCmwAsrCode() {
        return xltCmwAsrCode;
    }

    public void setXltCmwAsrCode(String xltCmwAsrCode) {
        this.xltCmwAsrCode = xltCmwAsrCode == null ? null : xltCmwAsrCode.trim();
    }

    public String getXltCmwCode() {
        return xltCmwCode;
    }

    public void setXltCmwCode(String xltCmwCode) {
        this.xltCmwCode = xltCmwCode == null ? null : xltCmwCode.trim();
    }

    public String getXltCmwTtsCode() {
        return xltCmwTtsCode;
    }

    public void setXltCmwTtsCode(String xltCmwTtsCode) {
        this.xltCmwTtsCode = xltCmwTtsCode == null ? null : xltCmwTtsCode.trim();
    }

    public Long getXltIdentificationTime() {
        return xltIdentificationTime;
    }

    public void setXltIdentificationTime(Long xltIdentificationTime) {
        this.xltIdentificationTime = xltIdentificationTime;
    }

    public Long getXltTranslateTime() {
        return xltTranslateTime;
    }

    public void setXltTranslateTime(Long xltTranslateTime) {
        this.xltTranslateTime = xltTranslateTime;
    }

    public Long getXltSynthesisTime() {
        return xltSynthesisTime;
    }

    public void setXltSynthesisTime(Long xltSynthesisTime) {
        this.xltSynthesisTime = xltSynthesisTime;
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