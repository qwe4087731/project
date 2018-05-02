package com.smart.db.mybatis.bean;

import java.io.Serializable;
import java.util.Date;

public class OauthDO implements Serializable {
    private Integer id;

    private Integer userId;

    private Byte oauthType;

    private String oauthId;

    private String oauthToken;

    private Date gmtCreate;

    private Date gmtModified;

    public static final String TABLENAME = "oauth";

    public static final String ID = "id";

    public static final String USER_ID = "user_id";

    public static final String OAUTH_TYPE = "oauth_type";

    public static final String OAUTH_ID = "oauth_id";

    public static final String OAUTH_TOKEN = "oauth_token";

    public static final String GMT_CREATE = "gmt_create";

    public static final String GMT_MODIFIED = "gmt_modified";

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Byte getOauthType() {
        return oauthType;
    }

    public void setOauthType(Byte oauthType) {
        this.oauthType = oauthType;
    }

    public String getOauthId() {
        return oauthId;
    }

    public void setOauthId(String oauthId) {
        this.oauthId = oauthId == null ? null : oauthId.trim();
    }

    public String getOauthToken() {
        return oauthToken;
    }

    public void setOauthToken(String oauthToken) {
        this.oauthToken = oauthToken == null ? null : oauthToken.trim();
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", oauthType=").append(oauthType);
        sb.append(", oauthId=").append(oauthId);
        sb.append(", oauthToken=").append(oauthToken);
        sb.append(", gmtCreate=").append(gmtCreate);
        sb.append(", gmtModified=").append(gmtModified);
        sb.append("]");
        return sb.toString();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        OauthDO other = (OauthDO) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getOauthType() == null ? other.getOauthType() == null : this.getOauthType().equals(other.getOauthType()))
            && (this.getOauthId() == null ? other.getOauthId() == null : this.getOauthId().equals(other.getOauthId()))
            && (this.getOauthToken() == null ? other.getOauthToken() == null : this.getOauthToken().equals(other.getOauthToken()))
            && (this.getGmtCreate() == null ? other.getGmtCreate() == null : this.getGmtCreate().equals(other.getGmtCreate()))
            && (this.getGmtModified() == null ? other.getGmtModified() == null : this.getGmtModified().equals(other.getGmtModified()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getOauthType() == null) ? 0 : getOauthType().hashCode());
        result = prime * result + ((getOauthId() == null) ? 0 : getOauthId().hashCode());
        result = prime * result + ((getOauthToken() == null) ? 0 : getOauthToken().hashCode());
        result = prime * result + ((getGmtCreate() == null) ? 0 : getGmtCreate().hashCode());
        result = prime * result + ((getGmtModified() == null) ? 0 : getGmtModified().hashCode());
        return result;
    }
}