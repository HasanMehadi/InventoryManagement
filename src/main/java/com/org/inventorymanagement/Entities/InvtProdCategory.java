package com.org.inventorymanagement.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class InvtProdCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int prodCatId;
    private String prodCatNm;
    private String prodCatDescr;
    private Integer parntProdCatgryId;
    private String appProdCatId;
    private Timestamp crtDttm;
    private Integer crtBy;
    private Timestamp updDttm;
    private Integer updBy;

    public InvtProdCategory() {
    }

    public int getProdCatId() {
        return prodCatId;
    }

    public void setProdCatId(int prodCatId) {
        this.prodCatId = prodCatId;
    }

    public String getProdCatNm() {
        return prodCatNm;
    }

    public void setProdCatNm(String prodCatNm) {
        this.prodCatNm = prodCatNm;
    }

    public String getProdCatDescr() {
        return prodCatDescr;
    }

    public void setProdCatDescr(String prodCatDescr) {
        this.prodCatDescr = prodCatDescr;
    }

    public Integer getParntProdCatgryId() {
        return parntProdCatgryId;
    }

    public void setParntProdCatgryId(Integer parntProdCatgryId) {
        this.parntProdCatgryId = parntProdCatgryId;
    }

    public String getAppProdCatId() {
        return appProdCatId;
    }

    public void setAppProdCatId(String appProdCatId) {
        this.appProdCatId = appProdCatId;
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
        InvtProdCategory that = (InvtProdCategory) o;
        return Objects.equals(prodCatNm, that.prodCatNm) &&
                Objects.equals(prodCatDescr, that.prodCatDescr) &&
                Objects.equals(parntProdCatgryId, that.parntProdCatgryId) &&
                Objects.equals(appProdCatId, that.appProdCatId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(prodCatNm, prodCatDescr, parntProdCatgryId, appProdCatId);
    }

    @Override
    public String toString() {
        return "InvtProdCategory{" +
                "prodCatId=" + prodCatId +
                ", prodCatNm='" + prodCatNm + '\'' +
                ", prodCatDescr='" + prodCatDescr + '\'' +
                ", parntProdCatgryId=" + parntProdCatgryId +
                ", appProdCatId='" + appProdCatId + '\'' +
                ", crtDttm=" + crtDttm +
                ", crtBy=" + crtBy +
                ", updDttm=" + updDttm +
                ", updBy=" + updBy +
                '}';
    }
}
