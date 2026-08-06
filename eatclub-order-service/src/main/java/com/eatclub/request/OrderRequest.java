package com.eatclub.request;

public class OrderRequest {

    private String customerName;
    private String item;
    private int quantity;
    private String address;
    private String payment;

    // Default Constructor
    public OrderRequest() {
    }

    // Parameterized Constructor
    public OrderRequest(String customerName, String item, int quantity, String address, String payment) {
        this.customerName = customerName;
        this.item = item;
        this.quantity = quantity;
        this.address = address;
        this.payment = payment;
    }

    // Getters and Setters

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    @Override
    public String toString() {
        return "OrderRequest [customerName=" + customerName +
               ", item=" + item +
               ", quantity=" + quantity +
               ", address=" + address +
               ", payment=" + payment + "]";
    }
}
