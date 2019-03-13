package com.org.inventorymanagement.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class GemsclipCountryList {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long gemsClipCountryListId;
    private String countryName;
    private String countryCode;

    public GemsclipCountryList() {
    }

    public Long getGemsClipCountryListId() {
        return gemsClipCountryListId;
    }

    public void setGemsClipCountryListId(Long gemsClipCountryListId) {
        this.gemsClipCountryListId = gemsClipCountryListId;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GemsclipCountryList that = (GemsclipCountryList) o;
        return Objects.equals(gemsClipCountryListId, that.gemsClipCountryListId) &&
                Objects.equals(countryName, that.countryName) &&
                Objects.equals(countryCode, that.countryCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gemsClipCountryListId, countryName, countryCode);
    }

    @Override
    public String toString() {
        return "GemsclipCountryList{" +
                "gemsClipCountryListId=" + gemsClipCountryListId +
                ", countryName='" + countryName + '\'' +
                ", countryCode='" + countryCode + '\'' +
                '}';
    }
}
