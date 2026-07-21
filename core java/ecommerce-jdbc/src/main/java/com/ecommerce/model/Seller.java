package com.ecommerce.model;

public class Seller {

    private int sellerId;
    private String name;
    private String email;
    private String password;
    private String shopName;

    public Seller() {

    }

    public Seller(String name, String email, String password, String shopName) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.shopName = shopName;
    }

    public Seller(int sellerId, String name, String email, String password, String shopName) {
        this.sellerId = sellerId;
        this.name = name;
        this.email = email;
        this.password = password;
        this.shopName = shopName;
    }

    public int getSellerId() {
        return sellerId;
    }

    public void setSellerId(int sellerId) {
        this.sellerId = sellerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    @Override
    public String toString() {
        return sellerId + " | " + name + " | " + shopName;
    }

}