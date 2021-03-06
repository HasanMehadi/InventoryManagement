package com.org.inventorymanagement.Entities;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class Currency {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long currId;
    private String currNm;
    private String currCode;
    private String isoAlphaCode;
    private String isoNumCode;
    private String imagePath;
    @Column(nullable = true)
    private Timestamp crtDttm;
    @Column(nullable = true)
    private Integer crtBy;
    @Column(nullable = true)
    private Timestamp updDttm;
    @Column(nullable = true)
    private Integer updBy;

    public Currency() {
    }

    public long getCurrId() {
        return currId;
    }

    public void setCurrId(long currId) {
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

    public void setCurrId(Long currId) {
        this.currId = currId;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Currency currency = (Currency) o;
        return Objects.equals(currNm, currency.currNm) &&
                Objects.equals(currCode, currency.currCode) &&
                Objects.equals(isoAlphaCode, currency.isoAlphaCode) &&
                Objects.equals(isoNumCode, currency.isoNumCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(currNm, currCode, isoAlphaCode, isoNumCode);
    }

    @Override
    public String toString() {
        return "Currency{" +
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
