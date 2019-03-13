package com.org.inventorymanagement.Entities;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class InvtStockLdgr {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long stockLdgrId;
    private Long prodId;
    private Long mvId;
    private String transType;
    private BigDecimal stockInQty;
    private BigDecimal stockOutQty;
    private Long uomId;
    private Long storeDelvDetId;
    private Long delvDetBatchId;
    private Long storeRcvdDetId;
    private Long rcvdBatchId;
    private Timestamp crtDttm;
    private Integer crtBy;
    private Timestamp updDttm;
    private Integer updBy;

    public InvtStockLdgr() {
    }

    public Long getStockLdgrId() {
        return stockLdgrId;
    }

    public void setStockLdgrId(Long stockLdgrId) {
        this.stockLdgrId = stockLdgrId;
    }

    public long getProdId() {
        return prodId;
    }

    public void setProdId(long prodId) {
        this.prodId = prodId;
    }

    public long getMvId() {
        return mvId;
    }

    public void setMvId(long mvId) {
        this.mvId = mvId;
    }

    public String getTransType() {
        return transType;
    }

    public void setTransType(String transType) {
        this.transType = transType;
    }

    public BigDecimal getStockInQty() {
        return stockInQty;
    }

    public void setStockInQty(BigDecimal stockInQty) {
        this.stockInQty = stockInQty;
    }

    public BigDecimal getStockOutQty() {
        return stockOutQty;
    }

    public void setStockOutQty(BigDecimal stockOutQty) {
        this.stockOutQty = stockOutQty;
    }

    public long getUomId() {
        return uomId;
    }

    public void setUomId(long uomId) {
        this.uomId = uomId;
    }

    public long getStoreDelvDetId() {
        return storeDelvDetId;
    }

    public void setStoreDelvDetId(long storeDelvDetId) {
        this.storeDelvDetId = storeDelvDetId;
    }

    public long getDelvDetBatchId() {
        return delvDetBatchId;
    }

    public void setDelvDetBatchId(long delvDetBatchId) {
        this.delvDetBatchId = delvDetBatchId;
    }

    public long getStoreRcvdDetId() {
        return storeRcvdDetId;
    }

    public void setStoreRcvdDetId(long storeRcvdDetId) {
        this.storeRcvdDetId = storeRcvdDetId;
    }

    public long getRcvdBatchId() {
        return rcvdBatchId;
    }

    public void setRcvdBatchId(long rcvdBatchId) {
        this.rcvdBatchId = rcvdBatchId;
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
        InvtStockLdgr that = (InvtStockLdgr) o;
        return Objects.equals(prodId, that.prodId) &&
                Objects.equals(mvId, that.mvId) &&
                Objects.equals(transType, that.transType) &&
                Objects.equals(stockInQty, that.stockInQty) &&
                Objects.equals(stockOutQty, that.stockOutQty) &&
                Objects.equals(uomId, that.uomId) &&
                Objects.equals(storeDelvDetId, that.storeDelvDetId) &&
                Objects.equals(delvDetBatchId, that.delvDetBatchId) &&
                Objects.equals(storeRcvdDetId, that.storeRcvdDetId) &&
                Objects.equals(rcvdBatchId, that.rcvdBatchId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(prodId, mvId, transType, stockInQty, stockOutQty, uomId, storeDelvDetId, delvDetBatchId, storeRcvdDetId, rcvdBatchId);
    }


    @Override
    public String toString() {
        return "InvtStockLdgr{" +
                "stockLdgrId=" + stockLdgrId +
                ", prodId=" + prodId +
                ", mvId=" + mvId +
                ", transType='" + transType + '\'' +
                ", stockInQty=" + stockInQty +
                ", stockOutQty=" + stockOutQty +
                ", uomId=" + uomId +
                ", storeDelvDetId=" + storeDelvDetId +
                ", delvDetBatchId=" + delvDetBatchId +
                ", storeRcvdDetId=" + storeRcvdDetId +
                ", rcvdBatchId=" + rcvdBatchId +
                ", crtDttm=" + crtDttm +
                ", crtBy=" + crtBy +
                ", updDttm=" + updDttm +
                ", updBy=" + updBy +
                '}';
    }
}
