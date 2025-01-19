package com.brickcommander.crud.app.model;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Timestamp;
import java.util.List;

@Entity
public class Purchase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long purchaseId;

    @ManyToOne
    private Customer customer;

    @CreationTimestamp
    private Timestamp createdDate;

    private Double purchaseAmount;

    @OneToMany(mappedBy = "itemDetailId", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ItemDetail> itemDetailList;
    
    public Purchase(){}

    public Purchase(Customer customer, Double purchaseAmount, List<ItemDetail> itemDetailList) {
        this.customer = customer;
        this.purchaseAmount = purchaseAmount;
        this.itemDetailList = itemDetailList;
    }

    public Long getPurchaseId() {
        return purchaseId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Timestamp getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Timestamp createdDate) {
        this.createdDate = createdDate;
    }

    public Double getPurchaseAmount() {
        return purchaseAmount;
    }

    public void setPurchaseAmount(Double purchaseAmount) {
        this.purchaseAmount = purchaseAmount;
    }

    public List<ItemDetail> getItemDetailList() {
        return itemDetailList;
    }

    public void setItemDetailList(List<ItemDetail> itemDetailList) {
        this.itemDetailList = itemDetailList;
    }

    @Override
    public String toString() {
        return "Purchase{" +
                "purchaseId=" + purchaseId +
                ", customer=" + customer +
                ", createdDate=" + createdDate +
                ", purchaseAmount=" + purchaseAmount +
                ", itemDetailList=" + itemDetailList +
                '}';
    }
}
