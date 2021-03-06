package com.org.inventorymanagement.Entities;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class GemsclipVendInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long gemsClipVendInfoId;
    private String slNo;
    private String supplierName;
    private String location;
    private String contactPerson;
    private String designation;
    private String mobileNo;
    private String mailId;


    public GemsclipVendInfo() {
    }

    public Long getGemsClipVendInfoId() {
        return gemsClipVendInfoId;
    }

    public void setGemsClipVendInfoId(Long gemsClipVendInfoId) {
        this.gemsClipVendInfoId = gemsClipVendInfoId;
    }

    public String getSlNo() {
        return slNo;
    }

    public void setSlNo(String slNo) {
        this.slNo = slNo;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getContactPerson() {
        return contactPerson;
    }

    public void setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getMailId() {
        return mailId;
    }

    public void setMailId(String mailId) {
        this.mailId = mailId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GemsclipVendInfo that = (GemsclipVendInfo) o;
        return Objects.equals(slNo, that.slNo) &&
                Objects.equals(supplierName, that.supplierName) &&
                Objects.equals(location, that.location) &&
                Objects.equals(contactPerson, that.contactPerson) &&
                Objects.equals(designation, that.designation) &&
                Objects.equals(mobileNo, that.mobileNo) &&
                Objects.equals(mailId, that.mailId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(slNo, supplierName, location, contactPerson, designation, mobileNo, mailId);
    }

    @Override
    public String toString() {
        return "GemsclipVendInfo{" +
                "gemsClipVendInfoId=" + gemsClipVendInfoId +
                ", slNo='" + slNo + '\'' +
                ", supplierName='" + supplierName + '\'' +
                ", location='" + location + '\'' +
                ", contactPerson='" + contactPerson + '\'' +
                ", designation='" + designation + '\'' +
                ", mobileNo='" + mobileNo + '\'' +
                ", mailId='" + mailId + '\'' +
                '}';
    }
}
