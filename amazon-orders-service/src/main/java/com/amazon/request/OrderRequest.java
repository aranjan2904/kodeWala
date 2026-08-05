package com.amazon.request;

public class OrderRequest {

    private String item;
    private double price;
    private int qty;
    private String mobile;

    // Default Constructor
    public OrderRequest() {
    }

    // Parameterized Constructor
    public OrderRequest(String item, double price, int qty, String mobile) {
        this.item = item;
        this.price = price;
        this.qty = qty;
        this.mobile = mobile;
    }

    // Getters and Setters
    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        return "OrderRequest [item=" + item +
                ", price=" + price +
                ", qty=" + qty +
                ", mobile=" + mobile + "]";
    }
}