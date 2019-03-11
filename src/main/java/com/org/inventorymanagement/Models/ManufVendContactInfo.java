package com.org.inventorymanagement.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class ManufVendContactInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long mvContactId;
    private String mvContactPrsnNm;
    private String mvContactPrsnDesig;
    private String mvContactPrsnEmail;
    private String mvContactPrsnNo;
    private String mvContactPrsnAddr;
    private String mvContactPrsnDescr;
    private Timestamp crtDttm;
    private Integer crtBy;
    private Timestamp updDttm;
    private Integer updBy;

    public ManufVendContactInfo() {
    }

    public Long getMvContactId() {
        return mvContactId;
    }

    public void setMvContactId(Long mvContactId) {
        this.mvContactId = mvContactId;
    }

    public String getMvContactPrsnNm() {
        return mvContactPrsnNm;
    }

    public void setMvContactPrsnNm(String mvContactPrsnNm) {
        this.mvContactPrsnNm = mvContactPrsnNm;
    }

    public String getMvContactPrsnDesig() {
        return mvContactPrsnDesig;
    }

    public void setMvContactPrsnDesig(String mvContactPrsnDesig) {
        this.mvContactPrsnDesig = mvContactPrsnDesig;
    }

    public String getMvContactPrsnEmail() {
        return mvContactPrsnEmail;
    }

    public void setMvContactPrsnEmail(String mvContactPrsnEmail) {
        this.mvContactPrsnEmail = mvContactPrsnEmail;
    }

    public String getMvContactPrsnNo() {
        return mvContactPrsnNo;
    }

    public void setMvContactPrsnNo(String mvContactPrsnNo) {
        this.mvContactPrsnNo = mvContactPrsnNo;
    }

    public String getMvContactPrsnAddr() {
        return mvContactPrsnAddr;
    }

    public void setMvContactPrsnAddr(String mvContactPrsnAddr) {
        this.mvContactPrsnAddr = mvContactPrsnAddr;
    }

    public String getMvContactPrsnDescr() {
        return mvContactPrsnDescr;
    }

    public void setMvContactPrsnDescr(String mvContactPrsnDescr) {
        this.mvContactPrsnDescr = mvContactPrsnDescr;
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
        ManufVendContactInfo that = (ManufVendContactInfo) o;
        return Objects.equals(mvContactPrsnNm, that.mvContactPrsnNm) &&
                Objects.equals(mvContactPrsnDesig, that.mvContactPrsnDesig) &&
                Objects.equals(mvContactPrsnEmail, that.mvContactPrsnEmail) &&
                Objects.equals(mvContactPrsnNo, that.mvContactPrsnNo) &&
                Objects.equals(mvContactPrsnAddr, that.mvContactPrsnAddr) &&
                Objects.equals(mvContactPrsnDescr, that.mvContactPrsnDescr);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mvContactPrsnNm, mvContactPrsnDesig, mvContactPrsnEmail, mvContactPrsnNo, mvContactPrsnAddr, mvContactPrsnDescr);
    }

    @Override
    public String toString() {
        return "ManufVendContactInfo{" +
                "mvContactId=" + mvContactId +
                ", mvContactPrsnNm='" + mvContactPrsnNm + '\'' +
                ", mvContactPrsnDesig='" + mvContactPrsnDesig + '\'' +
                ", mvContactPrsnEmail='" + mvContactPrsnEmail + '\'' +
                ", mvContactPrsnNo='" + mvContactPrsnNo + '\'' +
                ", mvContactPrsnAddr='" + mvContactPrsnAddr + '\'' +
                ", mvContactPrsnDescr='" + mvContactPrsnDescr + '\'' +
                ", crtDttm=" + crtDttm +
                ", crtBy=" + crtBy +
                ", updDttm=" + updDttm +
                ", updBy=" + updBy +
                '}';
    }
}
