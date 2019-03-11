package com.org.inventorymanagement.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class QcType {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long qcTypeId;
    private String qcTypeNm;
    private String qcTypeDescr;
    private String qcTypeCmnt;
    private Timestamp crtDttm;
    private Integer crtBy;
    private Timestamp updDttm;
    private Integer updBy;

    public QcType() {
    }

    public Long getQcTypeId() {
        return qcTypeId;
    }

    public void setQcTypeId(Long qcTypeId) {
        this.qcTypeId = qcTypeId;
    }

    public String getQcTypeNm() {
        return qcTypeNm;
    }

    public void setQcTypeNm(String qcTypeNm) {
        this.qcTypeNm = qcTypeNm;
    }

    public String getQcTypeDescr() {
        return qcTypeDescr;
    }

    public void setQcTypeDescr(String qcTypeDescr) {
        this.qcTypeDescr = qcTypeDescr;
    }

    public String getQcTypeCmnt() {
        return qcTypeCmnt;
    }

    public void setQcTypeCmnt(String qcTypeCmnt) {
        this.qcTypeCmnt = qcTypeCmnt;
    }

    public Timestamp getCrtDttm() {
        return crtDttm;
    }

    public void setCrtDttm(Timestamp crtDttm) {
        this.crtDttm = crtDttm;
    }

    public Integer getCrtBy() {
        return crtBy;
    }

    public void setCrtBy(Integer crtBy) {
        this.crtBy = crtBy;
    }

    public Timestamp getUpdDttm() {
        return updDttm;
    }

    public void setUpdDttm(Timestamp updDttm) {
        this.updDttm = updDttm;
    }

    public Integer getUpdBy() {
        return updBy;
    }

    public void setUpdBy(Integer updBy) {
        this.updBy = updBy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QcType qcType = (QcType) o;
        return Objects.equals(qcTypeNm, qcType.qcTypeNm) &&
                Objects.equals(qcTypeDescr, qcType.qcTypeDescr) &&
                Objects.equals(qcTypeCmnt, qcType.qcTypeCmnt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(qcTypeNm, qcTypeDescr, qcTypeCmnt);
    }

    @Override
    public String toString() {
        return "QcTypeSetup{" +
                "qcTypeId=" + qcTypeId +
                ", qcTypeNm='" + qcTypeNm + '\'' +
                ", qcTypeDescr='" + qcTypeDescr + '\'' +
                ", qcTypeCmnt='" + qcTypeCmnt + '\'' +
                ", crtDttm=" + crtDttm +
                ", crtBy=" + crtBy +
                ", updDttm=" + updDttm +
                ", updBy=" + updBy +
                '}';
    }
}
