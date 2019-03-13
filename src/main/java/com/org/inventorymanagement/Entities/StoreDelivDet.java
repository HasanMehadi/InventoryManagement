package com.org.inventorymanagement.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class StoreDelivDet {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long storeDelvDetId;
    private Long storeDelvId;
    private String prodBatchId;
    private Long prodId;
    private BigDecimal storeDeliveryQty;
    private Long sdUomId;
    private String storeDelvDetCmnt;
    private Timestamp crtDttm;
    private Integer crtBy;
    private Timestamp updDttm;
    private Integer updBy;

    public Long getStoreDelvDetId() {
        return storeDelvDetId;
    }

    public void setStoreDelvDetId(Long storeDelvDetId) {
        this.storeDelvDetId = storeDelvDetId;
    }

    public Long getStoreDelvId() {
        return storeDelvId;
    }

    public void setStoreDelvId(Long storeDelvId) {
        this.storeDelvId = storeDelvId;
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

    public BigDecimal getStoreDeliveryQty() {
        return storeDeliveryQty;
    }

    public void setStoreDeliveryQty(BigDecimal storeDeliveryQty) {
        this.storeDeliveryQty = storeDeliveryQty;
    }

    public Long getSdUomId() {
        return sdUomId;
    }

    public void setSdUomId(Long sdUomId) {
        this.sdUomId = sdUomId;
    }

    public String getStoreDelvDetCmnt() {
        return storeDelvDetCmnt;
    }

    public void setStoreDelvDetCmnt(String storeDelvDetCmnt) {
        this.storeDelvDetCmnt = storeDelvDetCmnt;
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
        StoreDelivDet that = (StoreDelivDet) o;
        return Objects.equals(storeDelvId, that.storeDelvId) &&
                Objects.equals(prodBatchId, that.prodBatchId) &&
                Objects.equals(prodId, that.prodId) &&
                Objects.equals(storeDeliveryQty, that.storeDeliveryQty) &&
                Objects.equals(sdUomId, that.sdUomId) &&
                Objects.equals(storeDelvDetCmnt, that.storeDelvDetCmnt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(storeDelvId, prodBatchId, prodId, storeDeliveryQty, sdUomId, storeDelvDetCmnt);
    }

    @Override
    public String toString() {
        return "StoreDelivDet{" +
                "storeDelvDetId=" + storeDelvDetId +
                ", storeDelvId=" + storeDelvId +
                ", prodBatchId='" + prodBatchId + '\'' +
                ", prodId=" + prodId +
                ", storeDeliveryQty=" + storeDeliveryQty +
                ", sdUomId=" + sdUomId +
                ", storeDelvDetCmnt='" + storeDelvDetCmnt + '\'' +
                ", crtDttm=" + crtDttm +
                ", crtBy=" + crtBy +
                ", updDttm=" + updDttm +
                ", updBy=" + updBy +
                '}';
    }
}
