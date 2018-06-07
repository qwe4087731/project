package com.book.db.mybatis.bean;

import java.io.Serializable;
import java.util.Date;

public class SectionDO implements Serializable {
    private Integer id;

    private Integer bookId;

    private Integer ordered;

    private Integer sectionNum;

    private String sectionName;

    private Integer partNum;

    private String partName;

    private Date gmtCreate;

    private Date gmtModified;

    public static final String TABLENAME = "section";

    public static final String ID = "id";

    public static final String BOOK_ID = "book_id";

    public static final String ORDERED = "ordered";

    public static final String SECTION_NUM = "section_num";

    public static final String SECTION_NAME = "section_name";

    public static final String PART_NUM = "part_num";

    public static final String PART_NAME = "part_name";

    public static final String GMT_CREATE = "gmt_create";

    public static final String GMT_MODIFIED = "gmt_modified";

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public Integer getOrdered() {
        return ordered;
    }

    public void setOrdered(Integer ordered) {
        this.ordered = ordered;
    }

    public Integer getSectionNum() {
        return sectionNum;
    }

    public void setSectionNum(Integer sectionNum) {
        this.sectionNum = sectionNum;
    }

    public String getSectionName() {
        return sectionName;
    }

    public void setSectionName(String sectionName) {
        this.sectionName = sectionName == null ? null : sectionName.trim();
    }

    public Integer getPartNum() {
        return partNum;
    }

    public void setPartNum(Integer partNum) {
        this.partNum = partNum;
    }

    public String getPartName() {
        return partName;
    }

    public void setPartName(String partName) {
        this.partName = partName == null ? null : partName.trim();
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
        sb.append(", bookId=").append(bookId);
        sb.append(", ordered=").append(ordered);
        sb.append(", sectionNum=").append(sectionNum);
        sb.append(", sectionName=").append(sectionName);
        sb.append(", partNum=").append(partNum);
        sb.append(", partName=").append(partName);
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
        SectionDO other = (SectionDO) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getBookId() == null ? other.getBookId() == null : this.getBookId().equals(other.getBookId()))
            && (this.getOrdered() == null ? other.getOrdered() == null : this.getOrdered().equals(other.getOrdered()))
            && (this.getSectionNum() == null ? other.getSectionNum() == null : this.getSectionNum().equals(other.getSectionNum()))
            && (this.getSectionName() == null ? other.getSectionName() == null : this.getSectionName().equals(other.getSectionName()))
            && (this.getPartNum() == null ? other.getPartNum() == null : this.getPartNum().equals(other.getPartNum()))
            && (this.getPartName() == null ? other.getPartName() == null : this.getPartName().equals(other.getPartName()))
            && (this.getGmtCreate() == null ? other.getGmtCreate() == null : this.getGmtCreate().equals(other.getGmtCreate()))
            && (this.getGmtModified() == null ? other.getGmtModified() == null : this.getGmtModified().equals(other.getGmtModified()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getBookId() == null) ? 0 : getBookId().hashCode());
        result = prime * result + ((getOrdered() == null) ? 0 : getOrdered().hashCode());
        result = prime * result + ((getSectionNum() == null) ? 0 : getSectionNum().hashCode());
        result = prime * result + ((getSectionName() == null) ? 0 : getSectionName().hashCode());
        result = prime * result + ((getPartNum() == null) ? 0 : getPartNum().hashCode());
        result = prime * result + ((getPartName() == null) ? 0 : getPartName().hashCode());
        result = prime * result + ((getGmtCreate() == null) ? 0 : getGmtCreate().hashCode());
        result = prime * result + ((getGmtModified() == null) ? 0 : getGmtModified().hashCode());
        return result;
    }
}