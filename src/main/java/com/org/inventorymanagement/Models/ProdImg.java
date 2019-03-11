package com.org.inventorymanagement.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class ProdImg {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long prodImgId;
    private String sampleImgFileNm;
    private String sampleImgFilePath;
    private String sampleImgFileFmt;
    private Long prodId;
    private Timestamp crtDttm;
    private Integer crtBy;
    private Timestamp updDttm;
    private Integer updBy;

    public ProdImg() {
    }

    public void setProdImgId(Long prodImgId) {
        this.prodImgId = prodImgId;
    }

    public Long getProdId() {
        return prodId;
    }

    public void setProdId(Long prodId) {
        this.prodId = prodId;
    }

    public long getProdImgId() {
        return prodImgId;
    }

    public void setProdImgId(long prodImgId) {
        this.prodImgId = prodImgId;
    }

    public String getSampleImgFileNm() {
        return sampleImgFileNm;
    }

    public void setSampleImgFileNm(String sampleImgFileNm) {
        this.sampleImgFileNm = sampleImgFileNm;
    }

    public String getSampleImgFilePath() {
        return sampleImgFilePath;
    }

    public void setSampleImgFilePath(String sampleImgFilePath) {
        this.sampleImgFilePath = sampleImgFilePath;
    }

    public String getSampleImgFileFmt() {
        return sampleImgFileFmt;
    }

    public void setSampleImgFileFmt(String sampleImgFileFmt) {
        this.sampleImgFileFmt = sampleImgFileFmt;
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
        ProdImg prodImg = (ProdImg) o;
        return Objects.equals(sampleImgFileNm, prodImg.sampleImgFileNm) &&
                Objects.equals(sampleImgFilePath, prodImg.sampleImgFilePath) &&
                Objects.equals(sampleImgFileFmt, prodImg.sampleImgFileFmt) &&
                Objects.equals(prodId, prodImg.prodId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sampleImgFileNm, sampleImgFilePath, sampleImgFileFmt, prodId);
    }

    @Override
    public String toString() {
        return "ProdImg{" +
                "prodImgId=" + prodImgId +
                ", sampleImgFileNm='" + sampleImgFileNm + '\'' +
                ", sampleImgFilePath='" + sampleImgFilePath + '\'' +
                ", sampleImgFileFmt='" + sampleImgFileFmt + '\'' +
                ", prodId=" + prodId +
                ", crtDttm=" + crtDttm +
                ", crtBy=" + crtBy +
                ", updDttm=" + updDttm +
                ", updBy=" + updBy +
                '}';
    }
}
