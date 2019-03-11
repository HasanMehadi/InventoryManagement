package com.org.inventorymanagement.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class GemsclipProdList {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String visibility;
    private String productGroup;
    private String sku;
    private String prodName;
    private String price;
    private String specialPrice;
    private String costPrice;
    private String brand;
    private String countryOfManufacture;
    private String weight;
    private String metaKeywords;
    private String prodCondition;
    private String modelName;
    private String prodStatus;
    private String category;
    private String imageUrl;


    public GemsclipProdList() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getVisibility() {
        return visibility;
    }

    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    public String getProductGroup() {
        return productGroup;
    }

    public void setProductGroup(String productGroup) {
        this.productGroup = productGroup;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getSpecialPrice() {
        return specialPrice;
    }

    public void setSpecialPrice(String specialPrice) {
        this.specialPrice = specialPrice;
    }

    public String getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(String costPrice) {
        this.costPrice = costPrice;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCountryOfManufacture() {
        return countryOfManufacture;
    }

    public void setCountryOfManufacture(String countryOfManufacture) {
        this.countryOfManufacture = countryOfManufacture;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getMetaKeywords() {
        return metaKeywords;
    }

    public void setMetaKeywords(String metaKeywords) {
        this.metaKeywords = metaKeywords;
    }

    public String getProdCondition() {
        return prodCondition;
    }

    public void setProdCondition(String prodCondition) {
        this.prodCondition = prodCondition;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getProdStatus() {
        return prodStatus;
    }

    public void setProdStatus(String prodStatus) {
        this.prodStatus = prodStatus;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GemsclipProdList that = (GemsclipProdList) o;
        return Objects.equals(visibility, that.visibility) &&
                Objects.equals(productGroup, that.productGroup) &&
                Objects.equals(sku, that.sku) &&
                Objects.equals(prodName, that.prodName) &&
                Objects.equals(price, that.price) &&
                Objects.equals(specialPrice, that.specialPrice) &&
                Objects.equals(costPrice, that.costPrice) &&
                Objects.equals(brand, that.brand) &&
                Objects.equals(countryOfManufacture, that.countryOfManufacture) &&
                Objects.equals(weight, that.weight) &&
                Objects.equals(metaKeywords, that.metaKeywords) &&
                Objects.equals(prodCondition, that.prodCondition) &&
                Objects.equals(modelName, that.modelName) &&
                Objects.equals(prodStatus, that.prodStatus) &&
                Objects.equals(category, that.category) &&
                Objects.equals(imageUrl, that.imageUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(visibility, productGroup, sku, prodName, price, specialPrice, costPrice, brand, countryOfManufacture, weight, metaKeywords, prodCondition, modelName, prodStatus, category, imageUrl);
    }

    @Override
    public String toString() {
        return "GemsclipProdList{" +
                "id='" + id + '\'' +
                ", visibility='" + visibility + '\'' +
                ", productGroup='" + productGroup + '\'' +
                ", sku='" + sku + '\'' +
                ", prodName='" + prodName + '\'' +
                ", price='" + price + '\'' +
                ", specialPrice='" + specialPrice + '\'' +
                ", costPrice='" + costPrice + '\'' +
                ", brand='" + brand + '\'' +
                ", countryOfManufacture='" + countryOfManufacture + '\'' +
                ", weight='" + weight + '\'' +
                ", metaKeywords='" + metaKeywords + '\'' +
                ", prodCondition='" + prodCondition + '\'' +
                ", modelName='" + modelName + '\'' +
                ", prodStatus='" + prodStatus + '\'' +
                ", category='" + category + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                '}';
    }
}
