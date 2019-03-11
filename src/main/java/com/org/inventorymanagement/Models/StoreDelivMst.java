package com.org.inventorymanagement.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class StoreDelivMst {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long storeDelvId;
    private Date storeDelvDt;
    private Long storeId;
    private Long storeDelvBy;
    private String storeDelvCmnt;
    private Timestamp crtDttm;
    private Integer crtBy;
    private Timestamp updDttm;
    private Integer updBy;

    public StoreDelivMst() {
    }

    public Long getStoreDelvId() {
        return storeDelvId;
    }

    public void setStoreDelvId(Long storeDelvId) {
        this.storeDelvId = storeDelvId;
    }

    public Date getStoreDelvDt() {
        return storeDelvDt;
    }

    public void setStoreDelvDt(Date storeDelvDt) {
        this.storeDelvDt = storeDelvDt;
    }

    public long getStoreDelvBy() {
        return storeDelvBy;
    }

    public void setStoreDelvBy(long storeDelvBy) {
        this.storeDelvBy = storeDelvBy;
    }

    public String getStoreDelvCmnt() {
        return storeDelvCmnt;
    }

    public void setStoreDelvCmnt(String storeDelvCmnt) {
        this.storeDelvCmnt = storeDelvCmnt;
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
        StoreDelivMst that = (StoreDelivMst) o;
        return Objects.equals(storeDelvDt, that.storeDelvDt) &&
                Objects.equals(storeDelvBy, that.storeDelvBy) &&
                Objects.equals(storeDelvCmnt, that.storeDelvCmnt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(storeDelvDt, storeDelvBy, storeDelvCmnt);
    }

    @Override
    public String toString() {
        return "StoreDelivMst{" +
                "storeDelvId=" + storeDelvId +
                ", storeDelvDt=" + storeDelvDt +
                ", storeDelvBy=" + storeDelvBy +
                ", storeDelvCmnt='" + storeDelvCmnt + '\'' +
                ", crtDttm=" + crtDttm +
                ", crtBy=" + crtBy +
                ", updDttm=" + updDttm +
                ", updBy=" + updBy +
                '}';
    }
}
