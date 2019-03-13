package com.org.inventorymanagement.Entities;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class GemsclipProdListProdip {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long gemsclipProdListProdipId;
    private String sku;
    private String productName;
    private String category;
    private String subCategory;
    private String subSubCategory;
    private String brand;
    private String vendor;
    private String modelSize;

    public Long getGemsclipProdListProdipId() {
        return gemsclipProdListProdipId;
    }

    public void setGemsclipProdListProdipId(Long gemsclipProdListProdipId) {
        this.gemsclipProdListProdipId = gemsclipProdListProdipId;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getSubCategory() {
        return subCategory;
    }

    public void setSubCategory(String subCategory) {
        this.subCategory = subCategory;
    }

    public String getSubSubCategory() {
        return subSubCategory;
    }

    public void setSubSubCategory(String subSubCategory) {
        this.subSubCategory = subSubCategory;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public String getModelSize() {
        return modelSize;
    }

    public void setModelSize(String modelSize) {
        this.modelSize = modelSize;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GemsclipProdListProdip that = (GemsclipProdListProdip) o;
        return Objects.equals(sku, that.sku) &&
                Objects.equals(productName, that.productName) &&
                Objects.equals(category, that.category) &&
                Objects.equals(subCategory, that.subCategory) &&
                Objects.equals(subSubCategory, that.subSubCategory) &&
                Objects.equals(brand, that.brand) &&
                Objects.equals(vendor, that.vendor) &&
                Objects.equals(modelSize, that.modelSize);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sku, productName, category, subCategory, subSubCategory, brand, vendor, modelSize);
    }

    @Override
    public String toString() {
        return "GemsclipProdListProdip{" +
                "gemsclipProdListProdipId=" + gemsclipProdListProdipId +
                ", sku='" + sku + '\'' +
                ", productName='" + productName + '\'' +
                ", category='" + category + '\'' +
                ", subCategory='" + subCategory + '\'' +
                ", subSubCategory='" + subSubCategory + '\'' +
                ", brand='" + brand + '\'' +
                ", vendor='" + vendor + '\'' +
                ", modelSize='" + modelSize + '\'' +
                '}';
    }
}
