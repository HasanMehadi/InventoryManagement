package com.org.inventorymanagement.Entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "vw_prod_cat")
public class VwProdCat {

    @Id
    private Long prodCatId;
    private String prodCatNm;
    private String prodCatDescr;
    private Long parntProdCatgryId;
    private String appProdCatId;
    private Timestamp crtDttm;
    private Integer crtBy;
    private Timestamp updDttm;
    private Integer updBy;
    private String parntProdNm;

    public VwProdCat() {
    }

    public Long getProdCatId() {
        return prodCatId;
    }

    public void setProdCatId(Long prodCatId) {
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

    public long getParntProdCatgryId() {
        return parntProdCatgryId;
    }

    public void setParntProdCatgryId(long parntProdCatgryId) {
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

    public String getParntProdNm() {
        return parntProdNm;
    }

    public void setParntProdNm(String parntProdNm) {
        this.parntProdNm = parntProdNm;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VwProdCat vwProdCat = (VwProdCat) o;
        return Objects.equals(prodCatNm, vwProdCat.prodCatNm) &&
                Objects.equals(prodCatDescr, vwProdCat.prodCatDescr) &&
                Objects.equals(parntProdCatgryId, vwProdCat.parntProdCatgryId) &&
                Objects.equals(appProdCatId, vwProdCat.appProdCatId) &&
                Objects.equals(parntProdNm, vwProdCat.parntProdNm);
    }

    @Override
    public int hashCode() {
        return Objects.hash(prodCatNm, prodCatDescr, parntProdCatgryId, appProdCatId, parntProdNm);
    }

    @Override
    public String toString() {
        return "VwProdCat{" +
                "prodCatId=" + prodCatId +
                ", prodCatNm='" + prodCatNm + '\'' +
                ", prodCatDescr='" + prodCatDescr + '\'' +
                ", parntProdCatgryId=" + parntProdCatgryId +
                ", appProdCatId='" + appProdCatId + '\'' +
                ", crtDttm=" + crtDttm +
                ", crtBy=" + crtBy +
                ", updDttm=" + updDttm +
                ", updBy=" + updBy +
                ", parntProdNm='" + parntProdNm + '\'' +
                '}';
    }
}
