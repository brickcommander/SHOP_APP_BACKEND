package com.brickcommander.crud.app.model.helper;

public class ItemDetailLite {
    private Long itemId;
    private Double sellingPrice;
    private Double itemQuantity;
    private int itemQuantityQ;

    public ItemDetailLite(Long itemId, Double sellingPrice, Double itemQuantity, int itemQuantityQ) {
        this.itemId = itemId;
        this.sellingPrice = sellingPrice;
        this.itemQuantity = itemQuantity;
        this.itemQuantityQ = itemQuantityQ;
    }

    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public Double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(Double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public Double getItemQuantity() {
        return itemQuantity;
    }

    public void setItemQuantity(Double itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

    public int getItemQuantityQ() {
        return itemQuantityQ;
    }

    public void setItemQuantityQ(int itemQuantityQ) {
        this.itemQuantityQ = itemQuantityQ;
    }

    @Override
    public String toString() {
        return "ItemDetailListLite{" +
                "itemId=" + itemId +
                ", sellingPrice=" + sellingPrice +
                ", itemQuantity=" + itemQuantity +
                ", itemQuantityQ=" + itemQuantityQ +
                '}';
    }
}
