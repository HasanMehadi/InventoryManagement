package com.org.inventorymanagement.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class StoreReceivedDet {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long storeRcvdDetId;
    private Long storeRcvdId;
    private String prodBatchId;
    private Long prodId;
    private BigDecimal storeReceiveQty;
    private Long uomId;
    private Date manufDt;
    private Date expiryDate;
    private Integer expiryDuration;
    private String expryDuratonInDayMthYr;
    private String storeRcvdDetCmnt;
    private Timestamp crtDttm;
    private Integer crtBy;
    private Timestamp updDttm;
    private Integer updBy;

    public StoreReceivedDet() {
    }

    public Long getStoreRcvdDetId() {
        return storeRcvdDetId;
    }

    public void setStoreRcvdDetId(Long storeRcvdDetId) {
        this.storeRcvdDetId = storeRcvdDetId;
    }

    public Long getStoreRcvdId() {
        return storeRcvdId;
    }

    public void setStoreRcvdId(Long storeRcvdId) {
        this.storeRcvdId = storeRcvdId;
    }

    public String getProdBatchId() {
        return prodBatchId;
    }

    public void setProdBatchId(String prodBatchId) {
        this.prodBatchId = prodBatchId;
    }

    public Long getProdId() {
        return prodId;
    }

    public void setProdId(Long prodId) {
        this.prodId = prodId;
    }

    public BigDecimal getStoreReceiveQty() {
        return storeReceiveQty;
    }

    public void setStoreReceiveQty(BigDecimal storeReceiveQty) {
        this.storeReceiveQty = storeReceiveQty;
    }

    public Long getUomId() {
        return uomId;
    }

    public void setUomId(Long uomId) {
        this.uomId = uomId;
    }

    public Date getManufDt() {
        return manufDt;
    }

    public void setManufDt(Date manufDt) {
        this.manufDt = manufDt;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    public Integer getExpiryDuration() {
        return expiryDuration;
    }

    public void setExpiryDuration(Integer expiryDuration) {
        this.expiryDuration = expiryDuration;
    }

    public String getExpryDuratonInDayMthYr() {
        return expryDuratonInDayMthYr;
    }

    public void setExpryDuratonInDayMthYr(String expryDuratonInDayMthYr) {
        this.expryDuratonInDayMthYr = expryDuratonInDayMthYr;
    }

    public String getStoreRcvdDetCmnt() {
        return storeRcvdDetCmnt;
    }

    public void setStoreRcvdDetCmnt(String storeRcvdDetCmnt) {
        this.storeRcvdDetCmnt = storeRcvdDetCmnt;
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
        StoreReceivedDet that = (StoreReceivedDet) o;
        return Objects.equals(storeRcvdId, that.storeRcvdId) &&
                Objects.equals(prodBatchId, that.prodBatchId) &&
                Objects.equals(prodId, that.prodId) &&
                Objects.equals(storeReceiveQty, that.storeReceiveQty) &&
                Objects.equals(uomId, that.uomId) &&
                Objects.equals(manufDt, that.manufDt) &&
                Objects.equals(expiryDate, that.expiryDate) &&
                Objects.equals(expiryDuration, that.expiryDuration) &&
                Objects.equals(expryDuratonInDayMthYr, that.expryDuratonInDayMthYr) &&
                Objects.equals(storeRcvdDetCmnt, that.storeRcvdDetCmnt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(storeRcvdId, prodBatchId, prodId, storeReceiveQty, uomId, manufDt, expiryDate, expiryDuration, expryDuratonInDayMthYr, storeRcvdDetCmnt);
    }

    @Override
    public String toString() {
        return "StoreReceivedDet{" +
                "storeRcvdDetId=" + storeRcvdDetId +
                ", storeRcvdId=" + storeRcvdId +
                ", prodBatchId='" + prodBatchId + '\'' +
                ", prodId=" + prodId +
                ", storeReceiveQty=" + storeReceiveQty +
                ", uomId=" + uomId +
                ", manufDt=" + manufDt +
                ", expiryDate=" + expiryDate +
                ", expiryDuration=" + expiryDuration +
                ", expryDuratonInDayMthYr='" + expryDuratonInDayMthYr + '\'' +
                ", storeRcvdDetCmnt='" + storeRcvdDetCmnt + '\'' +
                ", crtDttm=" + crtDttm +
                ", crtBy=" + crtBy +
                ", updDttm=" + updDttm +
                ", updBy=" + updBy +
                '}';
    }
}
