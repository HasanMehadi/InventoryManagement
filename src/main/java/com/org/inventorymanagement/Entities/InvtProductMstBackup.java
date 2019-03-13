package com.org.inventorymanagement.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;


@Entity
public class InvtProductMstBackup {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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

    public long getPrimaryUomId() {
        return primaryUomId;
    }

    public void setPrimaryUomId(long primaryUomId) {
        this.primaryUomId = primaryUomId;
    }

    public long getProdCatId() {
        return prodCatId;
    }

    public void setProdCatId(long prodCatId) {
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

    public long getReOrdLvl() {
        return reOrdLvl;
    }

    public void setReOrdLvl(long reOrdLvl) {
        this.reOrdLvl = reOrdLvl;
    }

    public long getUomIdOfReOrdLvl() {
        return uomIdOfReOrdLvl;
    }

    public void setUomIdOfReOrdLvl(long uomIdOfReOrdLvl) {
        this.uomIdOfReOrdLvl = uomIdOfReOrdLvl;
    }

    public long getLeadTimeInDays() {
        return leadTimeInDays;
    }

    public void setLeadTimeInDays(long leadTimeInDays) {
        this.leadTimeInDays = leadTimeInDays;
    }

    public long getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public void setCountryOfOrigin(long countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    public long getMvId() {
        return mvId;
    }

    public void setMvId(long mvId) {
        this.mvId = mvId;
    }

    public long getBrandId() {
        return brandId;
    }

    public void setBrandId(long brandId) {
        this.brandId = brandId;
    }

    public long getProdTypeId() {
        return prodTypeId;
    }

    public void setProdTypeId(long prodTypeId) {
        this.prodTypeId = prodTypeId;
    }

    public long getQcTypeId() {
        return qcTypeId;
    }

    public void setQcTypeId(long qcTypeId) {
        this.qcTypeId = qcTypeId;
    }

    public long getProdPackTypeId() {
        return prodPackTypeId;
    }

    public void setProdPackTypeId(long prodPackTypeId) {
        this.prodPackTypeId = prodPackTypeId;
    }

    public BigDecimal getProdPackVol() {
        return prodPackVol;
    }

    public void setProdPackVol(BigDecimal prodPackVol) {
        this.prodPackVol = prodPackVol;
    }

    public long getMinQtyToPlacePo() {
        return minQtyToPlacePo;
    }

    public void setMinQtyToPlacePo(long minQtyToPlacePo) {
        this.minQtyToPlacePo = minQtyToPlacePo;
    }

    public long getMaxQtyToPlacePo() {
        return maxQtyToPlacePo;
    }

    public void setMaxQtyToPlacePo(long maxQtyToPlacePo) {
        this.maxQtyToPlacePo = maxQtyToPlacePo;
    }

    public long getMinWeightPerItm() {
        return minWeightPerItm;
    }

    public void setMinWeightPerItm(long minWeightPerItm) {
        this.minWeightPerItm = minWeightPerItm;
    }

    public long getMaxWeightItm() {
        return maxWeightItm;
    }

    public void setMaxWeightItm(long maxWeightItm) {
        this.maxWeightItm = maxWeightItm;
    }

    public long getProdWeightUom() {
        return prodWeightUom;
    }

    public void setProdWeightUom(long prodWeightUom) {
        this.prodWeightUom = prodWeightUom;
    }

    public boolean getActiveSts() {
        return activeSts;
    }

    public void setActiveSts(boolean activeSts) {
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
        InvtProductMstBackup that = (InvtProductMstBackup) o;
        return Objects.equals(prodNm, that.prodNm) &&
                Objects.equals(prodCode, that.prodCode) &&
                Objects.equals(prodDescr, that.prodDescr) &&
                Objects.equals(primaryUomId, that.primaryUomId) &&
                Objects.equals(prodCatId, that.prodCatId) &&
                Objects.equals(prodColor, that.prodColor) &&
                Objects.equals(stockMovementMethod, that.stockMovementMethod) &&
                Objects.equals(reOrdLvl, that.reOrdLvl) &&
                Objects.equals(uomIdOfReOrdLvl, that.uomIdOfReOrdLvl) &&
                Objects.equals(leadTimeInDays, that.leadTimeInDays) &&
                Objects.equals(countryOfOrigin, that.countryOfOrigin) &&
                Objects.equals(mvId, that.mvId) &&
                Objects.equals(brandId, that.brandId) &&
                Objects.equals(prodTypeId, that.prodTypeId) &&
                Objects.equals(qcTypeId, that.qcTypeId) &&
                Objects.equals(prodPackTypeId, that.prodPackTypeId) &&
                Objects.equals(prodPackVol, that.prodPackVol) &&
                Objects.equals(minQtyToPlacePo, that.minQtyToPlacePo) &&
                Objects.equals(maxQtyToPlacePo, that.maxQtyToPlacePo) &&
                Objects.equals(minWeightPerItm, that.minWeightPerItm) &&
                Objects.equals(maxWeightItm, that.maxWeightItm) &&
                Objects.equals(prodWeightUom, that.prodWeightUom) &&
                Objects.equals(activeSts, that.activeSts) &&
                Objects.equals(setItmFlg, that.setItmFlg) &&
                Objects.equals(salesItmFlg, that.salesItmFlg) &&
                Objects.equals(assemblyRequried, that.assemblyRequried) &&
                Objects.equals(dropshipFlg, that.dropshipFlg) &&
                Objects.equals(sampleImgFileNm, that.sampleImgFileNm) &&
                Objects.equals(sampleImgFilePath, that.sampleImgFilePath) &&
                Objects.equals(sampleImgFileFmt, that.sampleImgFileFmt) &&
                Objects.equals(appProdId, that.appProdId) &&
                Objects.equals(stockQty, that.stockQty) &&
                Objects.equals(stockQtyUom, that.stockQtyUom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(prodNm, prodCode, prodDescr, primaryUomId, prodCatId, prodColor, stockMovementMethod, reOrdLvl, uomIdOfReOrdLvl, leadTimeInDays, countryOfOrigin, mvId, brandId, prodTypeId, qcTypeId, prodPackTypeId, prodPackVol, minQtyToPlacePo, maxQtyToPlacePo, minWeightPerItm, maxWeightItm, prodWeightUom, activeSts, setItmFlg, salesItmFlg, assemblyRequried, dropshipFlg, sampleImgFileNm, sampleImgFilePath, sampleImgFileFmt, appProdId, stockQty, stockQtyUom);
    }

    @Override
    public String toString() {
        return "InvtProductMstBackup{" +
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
                ", activeSts='" + activeSts + '\'' +
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
                '}';
    }
}
