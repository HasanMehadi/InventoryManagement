package com.org.inventorymanagement.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class GemsclipProdCatProdip {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long catId;
    private String catName;
    private Integer prntId;

    public long getCatId() {
        return catId;
    }

    public void setCatId(long catId) {
        this.catId = catId;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    public Integer getPrntId() {
        return prntId;
    }

    public void setPrntId(Integer prntId) {
        this.prntId = prntId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GemsclipProdCatProdip that = (GemsclipProdCatProdip) o;
        return Objects.equals(catId, that.catId) &&
                Objects.equals(catName, that.catName) &&
                Objects.equals(prntId, that.prntId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(catId, catName, prntId);
    }

    @Override
    public String toString() {
        return "GemsclipProdCatProdip{" +
                "catId=" + catId +
                ", catName='" + catName + '\'' +
                ", prntId=" + prntId +
                '}';
    }
}
