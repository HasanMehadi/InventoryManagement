package com.org.inventorymanagement.Models;


import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "vw_invt_prod_mst")
public class VwInvtProdMst {

    @Id
    private Long prodId;
    private String prodNm;
    private String prodCode;
    private String prodDescr;
    private Long primaryUomId;
    private Long prodCatId;
    private String prodColor;
    private String stockMovementMethod;
    private Long reOrdLvl;
    private Long uomIdOfReOrdLvl;
    private Long leadTimeInDays;
    private Long countryOfOrigin;
    private Long mvId;
    private Long brandId;
    private Long prodTypeId;
    private Long qcTypeId;
    private Long prodPackTypeId;
    private BigDecimal prodPackVol;
    private Long minQtyToPlacePo;
    private Long maxQtyToPlacePo;
    private Long minWeightPerItm;
    private Long maxWeightItm;
    private Long prodWeightUom;
    private Boolean activeSts;
    private String setItmFlg;
    private String salesItmFlg;
    private String assemblyRequried;
    private String dropshipFlg;
    private String sampleImgFileNm;
    private String sampleImgFilePath;
    private String sampleImgFileFmt;
    private String appProdId;
    private BigDecimal stockQty;
    private Long stockQtyUom;
    private Timestamp crtDttm;
    private Integer crtBy;
    private Timestamp updDttm;
    private Integer updBy;
    private String prodCatNm;
    private String parentProdCategoryNm;
    private String uomNm;
    private String uomPluralNm;
    private String uomNmReOrdLvl;
    private String uomPluralNmReOrdLvl;
    private String countryShortForm;
    private String countryNm;
    private String mvNm;
    private String brandNm;
    private String qcTypeNm;
    private String prodTypeNm;

    public VwInvtProdMst() {
    }

    public Long getProdId() {
        return prodId;
    }

    public void setProdId(Long prodId) {
        this.prodId = prodId;
    }

    public String getProdNm() {
        return prodNm;
    }

    public void setProdNm(String prodNm) {
        this.prodNm = prodNm;
    }

    public String getProdCode() {
        return prodCode;
    }

    public void setProdCode(String prodCode) {
        this.prodCode = prodCode;
    }

    public String getProdDescr() {
        return prodDescr;
    }

    public void setProdDescr(String prodDescr) {
        this.prodDescr = prodDescr;
    }

    public Long getPrimaryUomId() {
        return primaryUomId;
    }

    public void setPrimaryUomId(Long primaryUomId) {
        this.primaryUomId = primaryUomId;
    }

    public Long getProdCatId() {
        return prodCatId;
    }

    public void setProdCatId(Long prodCatId) {
        this.prodCatId = prodCatId;
    }

    public String getProdColor() {
        return prodColor;
    }

    public void setProdColor(String prodColor) {
        this.prodColor = prodColor;
    }

    public String getStockMovementMethod() {
        return stockMovementMethod;
    }

    public void setStockMovementMethod(String stockMovementMethod) {
        this.stockMovementMethod = stockMovementMethod;
    }

    public Long getReOrdLvl() {
        return reOrdLvl;
    }

    public void setReOrdLvl(Long reOrdLvl) {
        this.reOrdLvl = reOrdLvl;
    }

    public Long getUomIdOfReOrdLvl() {
        return uomIdOfReOrdLvl;
    }

    public void setUomIdOfReOrdLvl(Long uomIdOfReOrdLvl) {
        this.uomIdOfReOrdLvl = uomIdOfReOrdLvl;
    }

    public Long getLeadTimeInDays() {
        return leadTimeInDays;
    }

    public void setLeadTimeInDays(Long leadTimeInDays) {
        this.leadTimeInDays = leadTimeInDays;
    }

    public Long getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public void setCountryOfOrigin(Long countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    public Long getMvId() {
        return mvId;
    }

    public void setMvId(Long mvId) {
        this.mvId = mvId;
    }

    public Long getBrandId() {
        return brandId;
    }

    public void setBrandId(Long brandId) {
        this.brandId = brandId;
    }

    public Long getProdTypeId() {
        return prodTypeId;
    }

    public void setProdTypeId(Long prodTypeId) {
        this.prodTypeId = prodTypeId;
    }

    public Long getQcTypeId() {
        return qcTypeId;
    }

    public void setQcTypeId(Long qcTypeId) {
        this.qcTypeId = qcTypeId;
    }

    public Long getProdPackTypeId() {
        return prodPackTypeId;
    }

    public void setProdPackTypeId(Long prodPackTypeId) {
        this.prodPackTypeId = prodPackTypeId;
    }

    public BigDecimal getProdPackVol() {
        return prodPackVol;
    }

    public void setProdPackVol(BigDecimal prodPackVol) {
        this.prodPackVol = prodPackVol;
    }

    public Long getMinQtyToPlacePo() {
        return minQtyToPlacePo;
    }

    public void setMinQtyToPlacePo(Long minQtyToPlacePo) {
        this.minQtyToPlacePo = minQtyToPlacePo;
    }

    public Long getMaxQtyToPlacePo() {
        return maxQtyToPlacePo;
    }

    public void setMaxQtyToPlacePo(Long maxQtyToPlacePo) {
        this.maxQtyToPlacePo = maxQtyToPlacePo;
    }

    public Long getMinWeightPerItm() {
        return minWeightPerItm;
    }

    public void setMinWeightPerItm(Long minWeightPerItm) {
        this.minWeightPerItm = minWeightPerItm;
    }

    public Long getMaxWeightItm() {
        return maxWeightItm;
    }

    public void setMaxWeightItm(Long maxWeightItm) {
        this.maxWeightItm = maxWeightItm;
    }

    public Long getProdWeightUom() {
        return prodWeightUom;
    }

    public void setProdWeightUom(Long prodWeightUom) {
        this.prodWeightUom = prodWeightUom;
    }

    public Boolean getActiveSts() {
        return activeSts;
    }

    public void setActiveSts(Boolean activeSts) {
        this.activeSts = activeSts;
    }

    public String getSetItmFlg() {
        return setItmFlg;
    }

    public void setSetItmFlg(String setItmFlg) {
        this.setItmFlg = setItmFlg;
    }

    public String getSalesItmFlg() {
        return salesItmFlg;
    }

    public void setSalesItmFlg(String salesItmFlg) {
        this.salesItmFlg = salesItmFlg;
    }

    public String getAssemblyRequried() {
        return assemblyRequried;
    }

    public void setAssemblyRequried(String assemblyRequried) {
        this.assemblyRequried = assemblyRequried;
    }

    public String getDropshipFlg() {
        return dropshipFlg;
    }

    public void setDropshipFlg(String dropshipFlg) {
        this.dropshipFlg = dropshipFlg;
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

    public String getAppProdId() {
        return appProdId;
    }

    public void setAppProdId(String appProdId) {
        this.appProdId = appProdId;
    }

    public BigDecimal getStockQty() {
        return stockQty;
    }

    public void setStockQty(BigDecimal stockQty) {
        this.stockQty = stockQty;
    }

    public Long getStockQtyUom() {
        return stockQtyUom;
    }

    public void setStockQtyUom(Long stockQtyUom) {
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

    public String getProdCatNm() {
        return prodCatNm;
    }

    public void setProdCatNm(String prodCatNm) {
        this.prodCatNm = prodCatNm;
    }

    public String getParentProdCategoryNm() {
        return parentProdCategoryNm;
    }

    public void setParentProdCategoryNm(String parentProdCategoryNm) {
        this.parentProdCategoryNm = parentProdCategoryNm;
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

    public String getUomNmReOrdLvl() {
        return uomNmReOrdLvl;
    }

    public void setUomNmReOrdLvl(String uomNmReOrdLvl) {
        this.uomNmReOrdLvl = uomNmReOrdLvl;
    }

    public String getUomPluralNmReOrdLvl() {
        return uomPluralNmReOrdLvl;
    }

    public void setUomPluralNmReOrdLvl(String uomPluralNmReOrdLvl) {
        this.uomPluralNmReOrdLvl = uomPluralNmReOrdLvl;
    }

    public String getCountryShortForm() {
        return countryShortForm;
    }

    public void setCountryShortForm(String countryShortForm) {
        this.countryShortForm = countryShortForm;
    }

    public String getCountryNm() {
        return countryNm;
    }

    public void setCountryNm(String countryNm) {
        this.countryNm = countryNm;
    }

    public String getMvNm() {
        return mvNm;
    }

    public void setMvNm(String mvNm) {
        this.mvNm = mvNm;
    }

    public String getBrandNm() {
        return brandNm;
    }

    public void setBrandNm(String brandNm) {
        this.brandNm = brandNm;
    }

    public String getQcTypeNm() {
        return qcTypeNm;
    }

    public void setQcTypeNm(String qcTypeNm) {
        this.qcTypeNm = qcTypeNm;
    }

    public String getProdTypeNm() {
        return prodTypeNm;
    }

    public void setProdTypeNm(String prodTypeNm) {
        this.prodTypeNm = prodTypeNm;
    }

    @Override
    public String toString() {
        return "VwInvtProdMst{" +
                "prodId=" + prodId +
                ", prodNm='" + prodNm + '\'' +
                ", prodCode='" + prodCode + '\'' +
                ", prodDescr='" + prodDescr + '\'' +
                ", primaryUomId=" + primaryUomId +
                ", prodCatId=" + prodCatId +
                ", prodColor='" + prodColor + '\'' +
                ", stockMovementMethod='" + stockMovementMethod + '\'' +
                ", reOrdLvl=" + reOrdLvl +
                ", uomIdOfReOrdLvl=" + uomIdOfReOrdLvl +
                ", leadTimeInDays=" + leadTimeInDays +
                ", countryOfOrigin=" + countryOfOrigin +
                ", mvId=" + mvId +
                ", brandId=" + brandId +
                ", prodTypeId=" + prodTypeId +
                ", qcTypeId=" + qcTypeId +
                ", prodPackTypeId=" + prodPackTypeId +
                ", prodPackVol=" + prodPackVol +
                ", minQtyToPlacePo=" + minQtyToPlacePo +
                ", maxQtyToPlacePo=" + maxQtyToPlacePo +
                ", minWeightPerItm=" + minWeightPerItm +
                ", maxWeightItm=" + maxWeightItm +
                ", prodWeightUom=" + prodWeightUom +
                ", activeSts=" + activeSts +
                ", setItmFlg='" + setItmFlg + '\'' +
                ", salesItmFlg='" + salesItmFlg + '\'' +
                ", assemblyRequried='" + assemblyRequried + '\'' +
                ", dropshipFlg='" + dropshipFlg + '\'' +
                ", sampleImgFileNm='" + sampleImgFileNm + '\'' +
                ", sampleImgFilePath='" + sampleImgFilePath + '\'' +
                ", sampleImgFileFmt='" + sampleImgFileFmt + '\'' +
                ", appProdId='" + appProdId + '\'' +
                ", stockQty=" + stockQty +
                ", stockQtyUom=" + stockQtyUom +
                ", crtDttm=" + crtDttm +
                ", crtBy=" + crtBy +
                ", updDttm=" + updDttm +
                ", updBy=" + updBy +
                ", prodCatNm='" + prodCatNm + '\'' +
                ", parentProdCategoryNm='" + parentProdCategoryNm + '\'' +
                ", uomNm='" + uomNm + '\'' +
                ", uomPluralNm='" + uomPluralNm + '\'' +
                ", uomNmReOrdLvl='" + uomNmReOrdLvl + '\'' +
                ", uomPluralNmReOrdLvl='" + uomPluralNmReOrdLvl + '\'' +
                ", countryShortForm='" + countryShortForm + '\'' +
                ", countryNm='" + countryNm + '\'' +
                ", mvNm='" + mvNm + '\'' +
                ", brandNm='" + brandNm + '\'' +
                ", qcTypeNm='" + qcTypeNm + '\'' +
                ", prodTypeNm='" + prodTypeNm + '\'' +
                '}';
    }
}
