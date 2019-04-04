package com.org.inventorymanagement.Models;

import java.io.Serializable;
import java.sql.Timestamp;


public class CurrencyDTO extends BaseDTO implements Serializable {


    private static final long serialVersionUID = -3555599808751548832L;

    private Long currId;
    private String currNm;
    private String currCode;
    private String isoAlphaCode;
    private String isoNumCode;
    private String imagePath;
    private Timestamp crtDttm;
    private Integer crtBy;
    private Timestamp updDttm;
    private Integer updBy;

    public CurrencyDTO() {
    }

    public Long getCurrId() {
        return currId;
    }

    public void setCurrId(Long currId) {
        this.currId = currId;
    }

    public String getCurrNm() {
        return currNm;
    }

    public void setCurrNm(String currNm) {
        this.currNm = currNm;
    }

    public String getCurrCode() {
        return currCode;
    }

    public void setCurrCode(String currCode) {
        this.currCode = currCode;
    }

    public String getIsoAlphaCode() {
        return isoAlphaCode;
    }

    public void setIsoAlphaCode(String isoAlphaCode) {
        this.isoAlphaCode = isoAlphaCode;
    }

    public String getIsoNumCode() {
        return isoNumCode;
    }

    public void setIsoNumCode(String isoNumCode) {
        this.isoNumCode = isoNumCode;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
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
    public String toString() {
        return "CurrencyDTO{" +
                "currId=" + currId +
                ", currNm='" + currNm + '\'' +
                ", currCode='" + currCode + '\'' +
                ", isoAlphaCode='" + isoAlphaCode + '\'' +
                ", isoNumCode='" + isoNumCode + '\'' +
                ", imagePath='" + imagePath + '\'' +
                ", crtDttm=" + crtDttm +
                ", crtBy=" + crtBy +
                ", updDttm=" + updDttm +
                ", updBy=" + updBy +
                '}';
    }
}
