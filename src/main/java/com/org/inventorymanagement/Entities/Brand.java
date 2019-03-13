package com.org.inventorymanagement.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class Brand {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long brandId;
    private String brandNm;
    private String brandDescr;
    private String brandCmnt;
    private String appBrandId;
    private Timestamp crtDttm;
    private Integer crtBy;
    private Timestamp updDttm;
    private Integer updBy;

    public Brand() {
    }

    public long getBrandId() {
        return brandId;
    }

    public void setBrandId(long brandId) {
        this.brandId = brandId;
    }

    public String getBrandNm() {
        return brandNm;
    }

    public void setBrandNm(String brandNm) {
        this.brandNm = brandNm;
    }

    public String getBrandDescr() {
        return brandDescr;
    }

    public void setBrandDescr(String brandDescr) {
        this.brandDescr = brandDescr;
    }

    public String getBrandCmnt() {
        return brandCmnt;
    }

    public void setBrandCmnt(String brandCmnt) {
        this.brandCmnt = brandCmnt;
    }

    public String getAppBrandId() {
        return appBrandId;
    }

    public void setAppBrandId(String appBrandId) {
        this.appBrandId = appBrandId;
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
        Brand brand = (Brand) o;
        return Objects.equals(brandNm, brand.brandNm) &&
                Objects.equals(brandDescr, brand.brandDescr) &&
                Objects.equals(brandCmnt, brand.brandCmnt) &&
                Objects.equals(appBrandId, brand.appBrandId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brandNm, brandDescr, brandCmnt, appBrandId);
    }

    @Override
    public String toString() {
        return "Brand{" +
                "brandId=" + brandId +
                ", brandNm='" + brandNm + '\'' +
                ", brandDescr='" + brandDescr + '\'' +
                ", brandCmnt='" + brandCmnt + '\'' +
                ", appBrandId='" + appBrandId + '\'' +
                ", crtDttm=" + crtDttm +
                ", crtBy=" + crtBy +
                ", updDttm=" + updDttm +
                ", updBy=" + updBy +
                '}';
    }
}
