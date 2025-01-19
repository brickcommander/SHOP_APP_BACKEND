package com.brickcommander.crud.app.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Timestamp;

@Entity
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long itemId;
    private String name;
    private Double buyingPrice;
    private int buyingQ; // Id of unit from UnitsManager
    private Double sellingPrice;
    private int sellingQ;
    private Double remainingCount;
    private int remainingQ;

    @CreationTimestamp
    private Timestamp createdDate;
    private Boolean isActive = true;

    public Item() {}

    public Item(String name, Double buyingPrice, int buyingQ, Double sellingPrice, int sellingQ, Double remainingCount, int remainingQ, Boolean isActive) {
        this.name = name;
        this.buyingPrice = buyingPrice;
        this.buyingQ = buyingQ;
        this.sellingPrice = sellingPrice;
        this.sellingQ = sellingQ;
        this.remainingCount = remainingCount;
        this.remainingQ = remainingQ;
        this.isActive = isActive;
    }

    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getBuyingPrice() {
        return buyingPrice;
    }

    public void setBuyingPrice(Double buyingPrice) {
        this.buyingPrice = buyingPrice;
    }

    public int getBuyingQ() {
        return buyingQ;
    }

    public void setBuyingQ(int buyingQ) {
        this.buyingQ = buyingQ;
    }

    public Double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(Double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public int getSellingQ() {
        return sellingQ;
    }

    public void setSellingQ(int sellingQ) {
        this.sellingQ = sellingQ;
    }

    public Double getRemainingCount() {
        return remainingCount;
    }

    public void setRemainingCount(Double remainingCount) {
        this.remainingCount = remainingCount;
    }

    public int getRemainingQ() {
        return remainingQ;
    }

    public void setRemainingQ(int remainingQ) {
        this.remainingQ = remainingQ;
    }

    public Timestamp getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Timestamp createdDate) {
        this.createdDate = createdDate;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    @Override
    public String toString() {
        return "Item{" +
                "itemId=" + itemId +
                ", name='" + name + '\'' +
                ", buyingPrice=" + buyingPrice +
                ", buyingQ=" + buyingQ +
                ", sellingPrice=" + sellingPrice +
                ", sellingQ=" + sellingQ +
                ", remainingCount=" + remainingCount +
                ", remainingQ=" + remainingQ +
                ", createdDate=" + createdDate +
                ", isActive=" + isActive +
                '}';
    }
}
