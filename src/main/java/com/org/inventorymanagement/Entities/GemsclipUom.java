package com.org.inventorymanagement.Entities;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;

public class GemsclipUom {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long gemsClipUomId;
    private String uoMName;
    private String shortF;
    private String shotFP;

    public GemsclipUom() {
    }

    public Long getGemsClipUomId() {
        return gemsClipUomId;
    }

    public void setGemsClipUomId(Long gemsClipUomId) {
        this.gemsClipUomId = gemsClipUomId;
    }

    public String getUoMName() {
        return uoMName;
    }

    public void setUoMName(String uoMName) {
        this.uoMName = uoMName;
    }

    public String getShortF() {
        return shortF;
    }

    public void setShortF(String shortF) {
        this.shortF = shortF;
    }

    public String getShotFP() {
        return shotFP;
    }

    public void setShotFP(String shotFP) {
        this.shotFP = shotFP;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GemsclipUom that = (GemsclipUom) o;
        return Objects.equals(uoMName, that.uoMName) &&
                Objects.equals(shortF, that.shortF) &&
                Objects.equals(shotFP, that.shotFP);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uoMName, shortF, shotFP);
    }

    @Override
    public String toString() {
        return "GemsclipUom{" +
                "gemsClipUomId=" + gemsClipUomId +
                ", uoMName='" + uoMName + '\'' +
                ", shortF='" + shortF + '\'' +
                ", shotFP='" + shotFP + '\'' +
                '}';
    }
}
