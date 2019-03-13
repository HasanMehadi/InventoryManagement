package com.org.inventorymanagement.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class ProdPackType {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long prodPackTypeId;
    private String prodPackTypeNm;
    private String prodPackTypeCode;
    private Long prodPackTypeUomId;
    private Timestamp crtDttm;
    private Integer crtBy;
    private Timestamp updDttm;
    private Integer updBy;


    public ProdPackType() {
    }

    public Long getProdPackTypeUomId() {
        return prodPackTypeUomId;
    }

    public void setProdPackTypeUomId(Long prodPackTypeUomId) {
        this.prodPackTypeUomId = prodPackTypeUomId;
    }

    public Long getProdPackTypeId() {
        return prodPackTypeId;
    }

    public void setProdPackTypeId(Long prodPackTypeId) {
        this.prodPackTypeId = prodPackTypeId;
    }

    public String getProdPackTypeNm() {
        return prodPackTypeNm;
    }

    public void setProdPackTypeNm(String prodPackTypeNm) {
        this.prodPackTypeNm = prodPackTypeNm;
    }

    public String getProdPackTypeCode() {
        return prodPackTypeCode;
    }

    public void setProdPackTypeCode(String prodPackTypeCode) {
        this.prodPackTypeCode = prodPackTypeCode;
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
        ProdPackType that = (ProdPackType) o;
        return Objects.equals(prodPackTypeNm, that.prodPackTypeNm) &&
                Objects.equals(prodPackTypeCode, that.prodPackTypeCode) &&
                Objects.equals(prodPackTypeUomId, that.prodPackTypeUomId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(prodPackTypeNm, prodPackTypeCode, prodPackTypeUomId);
    }

    @Override
    public String toString() {
        return "ProdPackType{" +
                "prodPackTypeId=" + prodPackTypeId +
                ", prodPackTypeNm='" + prodPackTypeNm + '\'' +
                ", prodPackTypeCode='" + prodPackTypeCode + '\'' +
                ", prodPackTypeUomId=" + prodPackTypeUomId +
                ", crtDttm=" + crtDttm +
                ", crtBy=" + crtBy +
                ", updDttm=" + updDttm +
                ", updBy=" + updBy +
                '}';
    }
}
