package com.org.inventorymanagement.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class GemsclipCurrency {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long gemsClipCurrencyId;
    private String entity;
    private String currency;
    private String alphabeticCode;
    private Integer numericCode;
    private String minorUnit;
    private String withdrawalDate;

    public GemsclipCurrency() {
    }

    public Long getGemsClipCurrencyId() {
        return gemsClipCurrencyId;
    }

    public void setGemsClipCurrencyId(Long gemsClipCurrencyId) {
        this.gemsClipCurrencyId = gemsClipCurrencyId;
    }

    public String getEntity() {
        return entity;
    }

    public void setEntity(String entity) {
        this.entity = entity;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getAlphabeticCode() {
        return alphabeticCode;
    }

    public void setAlphabeticCode(String alphabeticCode) {
        this.alphabeticCode = alphabeticCode;
    }

    public Integer getNumericCode() {
        return numericCode;
    }

    public void setNumericCode(Integer numericCode) {
        this.numericCode = numericCode;
    }

    public String getMinorUnit() {
        return minorUnit;
    }

    public void setMinorUnit(String minorUnit) {
        this.minorUnit = minorUnit;
    }

    public String getWithdrawalDate() {
        return withdrawalDate;
    }

    public void setWithdrawalDate(String withdrawalDate) {
        this.withdrawalDate = withdrawalDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GemsclipCurrency that = (GemsclipCurrency) o;
        return Objects.equals(entity, that.entity) &&
                Objects.equals(currency, that.currency) &&
                Objects.equals(alphabeticCode, that.alphabeticCode) &&
                Objects.equals(numericCode, that.numericCode) &&
                Objects.equals(minorUnit, that.minorUnit) &&
                Objects.equals(withdrawalDate, that.withdrawalDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(entity, currency, alphabeticCode, numericCode, minorUnit, withdrawalDate);
    }

    @Override
    public String toString() {
        return "GemsclipCurrency{" +
                "gemsClipCurrencyId=" + gemsClipCurrencyId +
                ", entity='" + entity + '\'' +
                ", currency='" + currency + '\'' +
                ", alphabeticCode='" + alphabeticCode + '\'' +
                ", numericCode=" + numericCode +
                ", minorUnit='" + minorUnit + '\'' +
                ", withdrawalDate='" + withdrawalDate + '\'' +
                '}';
    }
}
