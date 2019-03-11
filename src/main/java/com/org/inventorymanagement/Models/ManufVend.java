package com.org.inventorymanagement.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class ManufVend {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long mvId;
    private String mvNm;
    private String mvAddr;
    private String mvContactNo;
    private String mvEmail;
    private String mvUrl;
    private String manuVendFlag;
    private String localForeignFlag;
    private Long mvCountryId;
    private String mvCmnt;
    private String mvStatus;
    private String appMvId;
    private Timestamp crtDttm;
    private Integer crtBy;
    private Timestamp updDttm;
    private Integer updBy;

    public ManufVend() {
    }

    public Long getMvCountryId() {
        return mvCountryId;
    }

    public void setMvCountryId(Long mvCountryId) {
        this.mvCountryId = mvCountryId;
    }

    public Long getMvId() {
        return mvId;
    }

    public void setMvId(Long mvId) {
        this.mvId = mvId;
    }

    public String getMvNm() {
        return mvNm;
    }

    public void setMvNm(String mvNm) {
        this.mvNm = mvNm;
    }

    public String getMvAddr() {
        return mvAddr;
    }

    public void setMvAddr(String mvAddr) {
        this.mvAddr = mvAddr;
    }

    public String getMvContactNo() {
        return mvContactNo;
    }

    public void setMvContactNo(String mvContactNo) {
        this.mvContactNo = mvContactNo;
    }

    public String getMvEmail() {
        return mvEmail;
    }

    public void setMvEmail(String mvEmail) {
        this.mvEmail = mvEmail;
    }

    public String getMvUrl() {
        return mvUrl;
    }

    public void setMvUrl(String mvUrl) {
        this.mvUrl = mvUrl;
    }

    public String getManuVendFlag() {
        return manuVendFlag;
    }

    public void setManuVendFlag(String manuVendFlag) {
        this.manuVendFlag = manuVendFlag;
    }

    public String getLocalForeignFlag() {
        return localForeignFlag;
    }

    public void setLocalForeignFlag(String localForeignFlag) {
        this.localForeignFlag = localForeignFlag;
    }

    public String getMvCmnt() {
        return mvCmnt;
    }

    public void setMvCmnt(String mvCmnt) {
        this.mvCmnt = mvCmnt;
    }

    public String getMvStatus() {
        return mvStatus;
    }

    public void setMvStatus(String mvStatus) {
        this.mvStatus = mvStatus;
    }

    public String getAppMvId() {
        return appMvId;
    }

    public void setAppMvId(String appMvId) {
        this.appMvId = appMvId;
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
        ManufVend manufVend = (ManufVend) o;
        return Objects.equals(mvNm, manufVend.mvNm) &&
                Objects.equals(mvAddr, manufVend.mvAddr) &&
                Objects.equals(mvContactNo, manufVend.mvContactNo) &&
                Objects.equals(mvEmail, manufVend.mvEmail) &&
                Objects.equals(mvUrl, manufVend.mvUrl) &&
                Objects.equals(manuVendFlag, manufVend.manuVendFlag) &&
                Objects.equals(localForeignFlag, manufVend.localForeignFlag) &&
                Objects.equals(mvCountryId, manufVend.mvCountryId) &&
                Objects.equals(mvCmnt, manufVend.mvCmnt) &&
                Objects.equals(mvStatus, manufVend.mvStatus) &&
                Objects.equals(appMvId, manufVend.appMvId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mvNm, mvAddr, mvContactNo, mvEmail, mvUrl, manuVendFlag, localForeignFlag, mvCountryId, mvCmnt, mvStatus, appMvId);
    }

    @Override
    public String toString() {
        return "ManufVend{" +
                "mvId=" + mvId +
                ", mvNm='" + mvNm + '\'' +
                ", mvAddr='" + mvAddr + '\'' +
                ", mvContactNo='" + mvContactNo + '\'' +
                ", mvEmail='" + mvEmail + '\'' +
                ", mvUrl='" + mvUrl + '\'' +
                ", manuVendFlag='" + manuVendFlag + '\'' +
                ", localForeignFlag='" + localForeignFlag + '\'' +
                ", mvCountryId=" + mvCountryId +
                ", mvCmnt='" + mvCmnt + '\'' +
                ", mvStatus='" + mvStatus + '\'' +
                ", appMvId='" + appMvId + '\'' +
                ", crtDttm=" + crtDttm +
                ", crtBy=" + crtBy +
                ", updDttm=" + updDttm +
                ", updBy=" + updBy +
                '}';
    }
}
