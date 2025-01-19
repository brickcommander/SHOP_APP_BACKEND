package com.brickcommander.crud.app.model;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Timestamp;

@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long customerId;
    private String name;
    private String mobile;
    private String email;
    private String address;
    private int customerNameQ;

    @CreationTimestamp
    private Timestamp createdDate;
    private Double dueAmount = 0.0;
    private Double totalAmount = 0.0;
    private Boolean isActive = true;

    public Customer() {}

    public Customer(String name, String mobile, String email, String address, int customerNameQ, Double dueAmount, Double totalAmount, Boolean isActive) {
        this.name = name;
        this.mobile = mobile;
        this.email = email;
        this.address = address;
        this.customerNameQ = customerNameQ;
        this.dueAmount = dueAmount;
        this.totalAmount = totalAmount;
        this.isActive = isActive;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCustomerNameQ() {
        return customerNameQ;
    }

    public void setCustomerNameQ(int customerNameQ) {
        this.customerNameQ = customerNameQ;
    }

    public Timestamp getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Timestamp createdDate) {
        this.createdDate = createdDate;
    }

    public Double getDueAmount() {
        return dueAmount;
    }

    public void setDueAmount(Double dueAmount) {
        this.dueAmount = dueAmount;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", name='" + name + '\'' +
                ", mobile='" + mobile + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", customerNameQ=" + customerNameQ +
                ", createdDate=" + createdDate +
                ", dueAmount=" + dueAmount +
                ", totalAmount=" + totalAmount +
                ", isActive=" + isActive +
                '}';
    }
}
