package com.org.inventorymanagement.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class ProdType {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long prodTypeId;
    private String prodTypeNm;
    private String prodTypeDescr;
    private String prodTypeCmnt;
    private Long parntProdTypeId;
    private String appProdTypeId;
    private Timestamp crtDttm;
    private Integer crtBy;
    private Timestamp updDttm;
    private Integer updBy;

    public ProdType() {
    }

    public Long getProdTypeId() {
        return prodTypeId;
    }

    public void setProdTypeId(Long prodTypeId) {
        this.prodTypeId = prodTypeId;
    }

    public String getProdTypeNm() {
        return prodTypeNm;
    }

    public void setProdTypeNm(String prodTypeNm) {
        this.prodTypeNm = prodTypeNm;
    }

    public String getProdTypeDescr() {
        return prodTypeDescr;
    }

    public void setProdTypeDescr(String prodTypeDescr) {
        this.prodTypeDescr = prodTypeDescr;
    }

    public String getProdTypeCmnt() {
        return prodTypeCmnt;
    }

    public void setProdTypeCmnt(String prodTypeCmnt) {
        this.prodTypeCmnt = prodTypeCmnt;
    }

    public long getParntProdTypeId() {
        return parntProdTypeId;
    }

    public void setParntProdTypeId(long parntProdTypeId) {
        this.parntProdTypeId = parntProdTypeId;
    }

    public String getAppProdTypeId() {
        return appProdTypeId;
    }

    public void setAppProdTypeId(String appProdTypeId) {
        this.appProdTypeId = appProdTypeId;
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
        ProdType prodType = (ProdType) o;
        return Objects.equals(prodTypeNm, prodType.prodTypeNm) &&
                Objects.equals(prodTypeDescr, prodType.prodTypeDescr) &&
                Objects.equals(prodTypeCmnt, prodType.prodTypeCmnt) &&
                Objects.equals(parntProdTypeId, prodType.parntProdTypeId) &&
                Objects.equals(appProdTypeId, prodType.appProdTypeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(prodTypeNm, prodTypeDescr, prodTypeCmnt, parntProdTypeId, appProdTypeId);
    }

    @Override
    public String toString() {
        return "ProdTypeSetup{" +
                "prodTypeId=" + prodTypeId +
                ", prodTypeNm='" + prodTypeNm + '\'' +
                ", prodTypeDescr='" + prodTypeDescr + '\'' +
                ", prodTypeCmnt='" + prodTypeCmnt + '\'' +
                ", parntProdTypeId=" + parntProdTypeId +
                ", appProdTypeId='" + appProdTypeId + '\'' +
                ", crtDttm=" + crtDttm +
                ", crtBy=" + crtBy +
                ", updDttm=" + updDttm +
                ", updBy=" + updBy +
                '}';
    }
}
