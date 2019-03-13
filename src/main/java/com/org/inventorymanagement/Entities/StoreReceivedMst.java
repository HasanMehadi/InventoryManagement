package com.org.inventorymanagement.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class StoreReceivedMst {

    @Id
    @GeneratedValue()
    private Long storeRcvdId;
    private Long storeId;
    private Date storeRcvdDt;
    private Integer storeRcvdBy;
    private String delvChallanId;
    private String storeRcvdCmnt;
    private Long mvId;
    private Timestamp crtDttm;
    private Integer crtBy;
    private Timestamp updDttm;
    private Integer updBy;

    public StoreReceivedMst() {
    }

    public Long getStoreRcvdId() {
        return storeRcvdId;
    }

    public void setStoreRcvdId(Long storeRcvdId) {
        this.storeRcvdId = storeRcvdId;
    }

    public Long getStoreId() {
        return storeId;
    }

    public void setStoreId(Long storeId) {
        this.storeId = storeId;
    }

    public Date getStoreRcvdDt() {
        return storeRcvdDt;
    }

    public void setStoreRcvdDt(Date storeRcvdDt) {
        this.storeRcvdDt = storeRcvdDt;
    }

    public Integer getStoreRcvdBy() {
        return storeRcvdBy;
    }

    public void setStoreRcvdBy(Integer storeRcvdBy) {
        this.storeRcvdBy = storeRcvdBy;
    }

    public String getDelvChallanId() {
        return delvChallanId;
    }

    public void setDelvChallanId(String delvChallanId) {
        this.delvChallanId = delvChallanId;
    }

    public String getStoreRcvdCmnt() {
        return storeRcvdCmnt;
    }

    public void setStoreRcvdCmnt(String storeRcvdCmnt) {
        this.storeRcvdCmnt = storeRcvdCmnt;
    }

    public Long getMvId() {
        return mvId;
    }

    public void setMvId(Long mvId) {
        this.mvId = mvId;
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
        StoreReceivedMst that = (StoreReceivedMst) o;
        return Objects.equals(storeId, that.storeId) &&
                Objects.equals(storeRcvdDt, that.storeRcvdDt) &&
                Objects.equals(storeRcvdBy, that.storeRcvdBy) &&
                Objects.equals(delvChallanId, that.delvChallanId) &&
                Objects.equals(storeRcvdCmnt, that.storeRcvdCmnt) &&
                Objects.equals(mvId, that.mvId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(storeId, storeRcvdDt, storeRcvdBy, delvChallanId, storeRcvdCmnt, mvId);
    }

    @Override
    public String toString() {
        return "StoreReceivedMst{" +
                "storeRcvdId=" + storeRcvdId +
                ", storeId=" + storeId +
                ", storeRcvdDt=" + storeRcvdDt +
                ", storeRcvdBy=" + storeRcvdBy +
                ", delvChallanId='" + delvChallanId + '\'' +
                ", storeRcvdCmnt='" + storeRcvdCmnt + '\'' +
                ", mvId=" + mvId +
                ", crtDttm=" + crtDttm +
                ", crtBy=" + crtBy +
                ", updDttm=" + updDttm +
                ", updBy=" + updBy +
                '}';
    }
}
