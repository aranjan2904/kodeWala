package com.ecommerce.service;

import java.util.ArrayList;
import java.util.Scanner;

import com.ecommerce.dao.CartDAO;
import com.ecommerce.dao.ProductDAO;
import com.ecommerce.exception.InsufficientStockException;
import com.ecommerce.model.CartItem;
import com.ecommerce.model.Product;

public class CartService {

    private CartDAO cartDAO = new CartDAO();
    private ProductDAO productDAO = new ProductDAO();
    private Scanner sc = new Scanner(System.in);

    // Add Product To Cart
    public boolean addToCart(int customerId) throws InsufficientStockException {
        
        System.out.print("\nEnter Product Id : ");
        String productIdInput = sc.nextLine().trim();
        
        
        if (productIdInput.isEmpty()) {
            System.out.println("Product ID cannot be empty."); 
            return false;
        }
        
        int productId;
        try {
            productId = Integer.parseInt(productIdInput);
        } catch (NumberFormatException e) {
            System.out.println("Invalid Product ID format.");
            return false;
        }
        
        System.out.print("Enter Quantity : ");
        String quantityInput = sc.nextLine().trim();
        
        
        if (quantityInput.isEmpty()) {
            System.out.println("Quantity cannot be empty.");
            return false;
        }
        
        int quantity;
        try {
            quantity = Integer.parseInt(quantityInput);
        } catch (NumberFormatException e) {
            System.out.println("Invalid quantity format.");
            return false;
        }
        
        if (quantity <= 0) {
            System.out.println("Cart quantity cannot be negative or zero.");
            return false;
        }

        Product product = productDAO.getProductById(productId);

        if (product == null) {
            System.out.println("Product Not Found.");
            return false;
        }

        try {
            if (quantity > product.getStockQuantity()) {
                throw new InsufficientStockException(
                        "Only " + product.getStockQuantity() + " item available.");
            }
        } catch (InsufficientStockException e) {
            System.out.println(e.getMessage());
            return false;
        }

        CartItem item = new CartItem(customerId, productId, quantity);

        if (cartDAO.addToCart(item)) {
            System.out.println("Product Added To Cart.");
            return true;
        } else {
            System.out.println("Unable To Add Product.");
            return false;
        }
    }

    // View Cart 
    public boolean viewCart(int customerId) {

        ArrayList<CartItem> cart = cartDAO.getCartItems(customerId);

        if (cart.isEmpty()) {
            System.out.println("\nYour Cart Is Empty.");
            return false;
        }

        double total = 0;

        System.out.println("\n============= YOUR CART =============");

        for (CartItem item : cart) {
            Product product = productDAO.getProductById(item.getProductId());
            double amount = product.getPrice() * item.getQuantity();
            total += amount;

            System.out.println("------------------------------------");
            System.out.println("Cart Id  : " + item.getCartId());
            System.out.println("Product  : " + product.getName());
            System.out.println("Price    : ₹" + product.getPrice());
            System.out.println("Quantity : " + item.getQuantity());
            System.out.println("Amount   : ₹" + amount);
            System.out.println("Added On : " + item.getAddedAt());
        }

        System.out.println("------------------------------------");
        System.out.println("Total Amount : ₹" + total);
        return true;
    }

    // Update Quantity - Returns boolean
    public boolean updateCart() {

        System.out.print("\nEnter Cart Id : ");
        String cartIdInput = sc.nextLine().trim();
        
        if (cartIdInput.isEmpty()) {
            System.out.println("Cart ID cannot be empty.");
            return false;
        }
        
        int cartId;
        try {
            cartId = Integer.parseInt(cartIdInput);
        } catch (NumberFormatException e) {
            System.out.println("Invalid Cart ID format.");
            return false;
        }

        System.out.print("Enter New Quantity : ");
        String quantityInput = sc.nextLine().trim();
        
        if (quantityInput.isEmpty()) {
            System.out.println("Quantity cannot be empty.");
            return false;
        }
        
        int quantity;
        try {
            quantity = Integer.parseInt(quantityInput);
        } catch (NumberFormatException e) {
            System.out.println("Invalid quantity format.");
            return false;
        }

        if (quantity <= 0) {
            System.out.println("Quantity must be greater than zero.");
            return false;
        }

        if (cartDAO.updateQuantity(cartId, quantity)) {
            System.out.println("Quantity Updated.");
            return true;
        } else {
            System.out.println("Update Failed.");
            return false;
        }
    }

    // Remove Product - Returns boolean
    public boolean removeProduct() {

        System.out.print("\nEnter Cart Id : ");
        String cartIdInput = sc.nextLine().trim();
        
        if (cartIdInput.isEmpty()) {
            System.out.println("Cart ID cannot be empty.");
            return false;
        }
        
        int cartId;
        try {
            cartId = Integer.parseInt(cartIdInput);
        } catch (NumberFormatException e) {
            System.out.println("Invalid Cart ID format.");
            return false;
        }

        if (cartDAO.removeItem(cartId)) {
            System.out.println("Item Removed.");
            return true;
        } else {
            System.out.println("Unable To Remove.");
            return false;
        }
    }
}