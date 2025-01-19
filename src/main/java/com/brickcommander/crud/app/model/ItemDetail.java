package com.brickcommander.crud.app.model;

import jakarta.persistence.*;

@Entity
public class ItemDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long itemDetailId;

    @ManyToOne
    private Purchase purchase;

    @ManyToOne
    private Item item;

    private Double sellingPrice;
    private Double itemQuantity;
    private int itemQuantityQ;

//    public ItemDetail() {}

    public ItemDetail(Item item, Double sellingPrice, Double itemQuantity, int itemQuantityQ) {
        this.item = item;
        this.sellingPrice = sellingPrice;
        this.itemQuantity = itemQuantity;
        this.itemQuantityQ = itemQuantityQ;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
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
        return "ItemDetail{" +
                "itemDetailId=" + itemDetailId +
                ", item=" + item +
                ", sellingPrice=" + sellingPrice +
                ", itemQuantity=" + itemQuantity +
                ", itemQuantityQ=" + itemQuantityQ +
                '}';
    }
}
