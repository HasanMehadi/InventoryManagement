package com.org.inventorymanagement.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class ProdCountry {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long countryId;
    private String countryShortForm;
    private String isoCountryShortFrm;
    private String currNm;
    private String countryNm;
    private Timestamp crtDttm;
    private Integer crtBy;
    private Timestamp updDttm;
    private Integer updBy;

    public ProdCountry() {
    }

    public Long getCountryId() {
        return countryId;
    }

    public void setCountryId(Long countryId) {
        this.countryId = countryId;
    }

    public String getCountryShortForm() {
        return countryShortForm;
    }

    public void setCountryShortForm(String countryShortForm) {
        this.countryShortForm = countryShortForm;
    }

    public String getIsoCountryShortFrm() {
        return isoCountryShortFrm;
    }

    public void setIsoCountryShortFrm(String isoCountryShortFrm) {
        this.isoCountryShortFrm = isoCountryShortFrm;
    }

    public String getCurrNm() {
        return currNm;
    }

    public void setCurrNm(String currNm) {
        this.currNm = currNm;
    }

    public String getCountryNm() {
        return countryNm;
    }

    public void setCountryNm(String countryNm) {
        this.countryNm = countryNm;
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
        ProdCountry that = (ProdCountry) o;
        return Objects.equals(countryShortForm, that.countryShortForm) &&
                Objects.equals(isoCountryShortFrm, that.isoCountryShortFrm) &&
                Objects.equals(currNm, that.currNm) &&
                Objects.equals(countryNm, that.countryNm);
    }

    @Override
    public int hashCode() {
        return Objects.hash(countryShortForm, isoCountryShortFrm, currNm, countryNm);
    }

    @Override
    public String toString() {
        return "ProdCountrySetup{" +
                "countryId=" + countryId +
                ", countryShortForm='" + countryShortForm + '\'' +
                ", isoCountryShortFrm='" + isoCountryShortFrm + '\'' +
                ", currNm='" + currNm + '\'' +
                ", countryNm='" + countryNm + '\'' +
                ", crtDttm=" + crtDttm +
                ", crtBy=" + crtBy +
                ", updDttm=" + updDttm +
                ", updBy=" + updBy +
                '}';
    }
}
