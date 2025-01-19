package com.brickcommander.crud.app.model.helper;

import java.util.List;

public class AddPurchaseRequest {
    private Long purchaseId;
    private Long customerId;
    private Double purchaseAmount;
    private List<ItemDetailLite> itemDetailLiteList;

    public AddPurchaseRequest(Long purchaseId, Long customerId, Double purchaseAmount, List<ItemDetailLite> itemDetailLiteList) {
        this.purchaseId = purchaseId;
        this.customerId = customerId;
        this.purchaseAmount = purchaseAmount;
        this.itemDetailLiteList = itemDetailLiteList;
    }

    public Long getPurchaseId() {
        return purchaseId;
    }

    public void setPurchaseId(Long purchaseId) {
        this.purchaseId = purchaseId;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public Double getPurchaseAmount() {
        return purchaseAmount;
    }

    public void setPurchaseAmount(Double purchaseAmount) {
        this.purchaseAmount = purchaseAmount;
    }

    public List<ItemDetailLite> getItemDetailLiteList() {
        return itemDetailLiteList;
    }

    public void setItemDetailLiteList(List<ItemDetailLite> itemDetailLiteList) {
        this.itemDetailLiteList = itemDetailLiteList;
    }

    @Override
    public String toString() {
        return "AddPurchaseRequest{" +
                "purchaseId=" + purchaseId +
                ", customerId=" + customerId +
                ", purchaseAmount=" + purchaseAmount +
                ", itemDetailList=" + itemDetailLiteList +
                '}';
    }
}
