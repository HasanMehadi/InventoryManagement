package com.org.inventorymanagement.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class ProdUom {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long uomId;
    private String uomCode;
    private String uomNm;
    private String uomPluralNm;
    private Long baseUomId;
    private BigDecimal baseQtyUomConvr;
    private Integer decimalDigitInConvrt;
    private Long appUomId;
    private Timestamp crtDttm;
    private Integer crtBy;
    private Timestamp updDttm;
    private Integer updBy;

    public ProdUom() {
    }

    public Long getUomId() {
        return uomId;
    }

    public void setUomId(Long uomId) {
        this.uomId = uomId;
    }

    public String getUomCode() {
        return uomCode;
    }

    public void setUomCode(String uomCode) {
        this.uomCode = uomCode;
    }

    public String getUomNm() {
        return uomNm;
    }

    public void setUomNm(String uomNm) {
        this.uomNm = uomNm;
    }

    public String getUomPluralNm() {
        return uomPluralNm;
    }

    public void setUomPluralNm(String uomPluralNm) {
        this.uomPluralNm = uomPluralNm;
    }

    public long getBaseUomId() {
        return baseUomId;
    }

    public void setBaseUomId(long baseUomId) {
        this.baseUomId = baseUomId;
    }

    public BigDecimal getBaseQtyUomConvr() {
        return baseQtyUomConvr;
    }

    public void setBaseQtyUomConvr(BigDecimal baseQtyUomConvr) {
        this.baseQtyUomConvr = baseQtyUomConvr;
    }

    public Integer getDecimalDigitInConvrt() {
        return decimalDigitInConvrt;
    }

    public void setDecimalDigitInConvrt(Integer decimalDigitInConvrt) {
        this.decimalDigitInConvrt = decimalDigitInConvrt;
    }

    public long getAppUomId() {
        return appUomId;
    }

    public void setAppUomId(long appUomId) {
        this.appUomId = appUomId;
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
        ProdUom prodUom = (ProdUom) o;
        return Objects.equals(uomCode, prodUom.uomCode) &&
                Objects.equals(uomNm, prodUom.uomNm) &&
                Objects.equals(uomPluralNm, prodUom.uomPluralNm) &&
                Objects.equals(baseUomId, prodUom.baseUomId) &&
                Objects.equals(baseQtyUomConvr, prodUom.baseQtyUomConvr) &&
                Objects.equals(decimalDigitInConvrt, prodUom.decimalDigitInConvrt) &&
                Objects.equals(appUomId, prodUom.appUomId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uomCode, uomNm, uomPluralNm, baseUomId, baseQtyUomConvr, decimalDigitInConvrt, appUomId);
    }

    @Override
    public String toString() {
        return "ProdUomSetup{" +
                "uomId=" + uomId +
                ", uomCode='" + uomCode + '\'' +
                ", uomNm='" + uomNm + '\'' +
                ", uomPluralNm='" + uomPluralNm + '\'' +
                ", baseUomId=" + baseUomId +
                ", baseQtyUomConvr=" + baseQtyUomConvr +
                ", decimalDigitInConvrt=" + decimalDigitInConvrt +
                ", appUomId='" + appUomId + '\'' +
                ", crtDttm=" + crtDttm +
                ", crtBy=" + crtBy +
                ", updDttm=" + updDttm +
                ", updBy=" + updBy +
                '}';
    }
}
