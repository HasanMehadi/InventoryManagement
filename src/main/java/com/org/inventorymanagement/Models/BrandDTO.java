package com.org.inventorymanagement.Models;

import java.io.Serializable;
import java.sql.Timestamp;

public class BrandDTO extends BaseDTO implements Serializable {
    private static final long serialVersionUID = -871798056105533436L;

    private Long brandId;
    private String brandNm;
    private String brandDescr;
    private String brandCmnt;
    private String appBrandId;
    private Timestamp crtDttm;
    private Integer crtBy;
    private Timestamp updDttm;
    private Integer updBy;

    public Long getBrandId() {
        return brandId;
    }

    public void setBrandId(Long brandId) {
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
}
