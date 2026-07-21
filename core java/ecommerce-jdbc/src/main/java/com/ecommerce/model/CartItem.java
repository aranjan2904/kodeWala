package com.ecommerce.model;

import java.sql.Timestamp;

public class CartItem {

    private int cartId;
    private int customerId;
    private int productId;
    private int quantity;
    private Timestamp addedAt;   

    public CartItem() {
    }

    public CartItem(int customerId, int productId, int quantity) {
        this.customerId = customerId;
        this.productId = productId;
        this.quantity = quantity;
    }

    public CartItem(int cartId, int customerId, int productId, int quantity) {
        this.cartId = cartId;
        this.customerId = customerId;
        this.productId = productId;
        this.quantity = quantity;
    }

    public int getCartId() {
        return cartId;
    }

    public void setCartId(int cartId) {
        this.cartId = cartId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

   
    public Timestamp getAddedAt() {
        return addedAt;
    }

  
    public void setAddedAt(Timestamp addedAt) {
        this.addedAt = addedAt;
    }
}