package com.org.inventorymanagement.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class MvProdStock {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long mvProdStockId;
    private Long prodId;
    private Long mvId;
    private BigDecimal stockQty;
    private Long stockQtyUom;
    private Timestamp crtDttm;
    private Integer crtBy;
    private Timestamp updDttm;
    private Integer updBy;

    public MvProdStock() {
    }

    public Long getMvProdStockId() {
        return mvProdStockId;
    }

    public void setMvProdStockId(Long mvProdStockId) {
        this.mvProdStockId = mvProdStockId;
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

    public BigDecimal getStockQty() {
        return stockQty;
    }

    public void setStockQty(BigDecimal stockQty) {
        this.stockQty = stockQty;
    }

    public long getStockQtyUom() {
        return stockQtyUom;
    }

    public void setStockQtyUom(long stockQtyUom) {
        this.stockQtyUom = stockQtyUom;
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
        MvProdStock that = (MvProdStock) o;
        return Objects.equals(prodId, that.prodId) &&
                Objects.equals(mvId, that.mvId) &&
                Objects.equals(stockQty, that.stockQty) &&
                Objects.equals(stockQtyUom, that.stockQtyUom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(prodId, mvId, stockQty, stockQtyUom);
    }

    @Override
    public String toString() {
        return "MvProdStock{" +
                "mvProdStockId=" + mvProdStockId +
                ", prodId=" + prodId +
                ", mvId=" + mvId +
                ", stockQty=" + stockQty +
                ", stockQtyUom=" + stockQtyUom +
                ", crtDttm=" + crtDttm +
                ", crtBy=" + crtBy +
                ", updDttm=" + updDttm +
                ", updBy=" + updBy +
                '}';
    }
}
