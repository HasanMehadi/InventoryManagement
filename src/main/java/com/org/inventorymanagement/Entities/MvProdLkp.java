package com.org.inventorymanagement.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class MvProdLkp {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long mvProdLkpId;
    private Long mvId;
    private Long prodId;
    private String mvProdMappCmnt;
    private Timestamp crtDttm;
    private Integer crtBy;
    private Timestamp updDttm;
    private Integer updBy;

    public MvProdLkp() {
    }

    public void setMvProdLkpId(Long mvProdLkpId) {
        this.mvProdLkpId = mvProdLkpId;
    }

    public Long getMvId() {
        return mvId;
    }

    public void setMvId(Long mvId) {
        this.mvId = mvId;
    }

    public Long getProdId() {
        return prodId;
    }

    public void setProdId(Long prodId) {
        this.prodId = prodId;
    }

    public long getMvProdLkpId() {
        return mvProdLkpId;
    }

    public void setMvProdLkpId(long mvProdLkpId) {
        this.mvProdLkpId = mvProdLkpId;
    }

    public String getMvProdMappCmnt() {
        return mvProdMappCmnt;
    }

    public void setMvProdMappCmnt(String mvProdMappCmnt) {
        this.mvProdMappCmnt = mvProdMappCmnt;
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
        MvProdLkp mvProdLkp = (MvProdLkp) o;
        return Objects.equals(mvId, mvProdLkp.mvId) &&
                Objects.equals(prodId, mvProdLkp.prodId) &&
                Objects.equals(mvProdMappCmnt, mvProdLkp.mvProdMappCmnt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mvId, prodId, mvProdMappCmnt);
    }

    @Override
    public String toString() {
        return "MvProdLkp{" +
                "mvProdLkpId=" + mvProdLkpId +
                ", mvId=" + mvId +
                ", prodId=" + prodId +
                ", mvProdMappCmnt='" + mvProdMappCmnt + '\'' +
                ", crtDttm=" + crtDttm +
                ", crtBy=" + crtBy +
                ", updDttm=" + updDttm +
                ", updBy=" + updBy +
                '}';
    }
}
