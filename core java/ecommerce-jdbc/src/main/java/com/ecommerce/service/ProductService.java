package com.ecommerce.service;

import java.util.ArrayList;
import java.util.Scanner;

import com.ecommerce.dao.ProductDAO;
import com.ecommerce.exception.ProductNotFoundException;
import com.ecommerce.model.Product;

public class ProductService {

    private ProductDAO productDAO = new ProductDAO();
    private Scanner sc = new Scanner(System.in);

 // Add Product
    public void addProduct(int sellerId) {

        System.out.println("\n========== ADD PRODUCT ==========");

        System.out.print("Product Name : ");
        String name = sc.nextLine();

        if (name == null || name.trim().isEmpty()) { 
            System.out.println("Product name cannot be empty."); 
            return;
        }

        System.out.print("Description : ");
        String description = sc.nextLine();

        if (description == null || description.trim().isEmpty()) {
            System.out.println("Description cannot be empty.");
            return;
        }

        System.out.print("Price : ");
        double price = sc.nextDouble();

        if (price <= 0) {
            System.out.println("Product price must be greater than 0.");
            sc.nextLine();
            return;
        }

        System.out.print("Stock : ");
        int stock = sc.nextInt();
        sc.nextLine();

        if (stock < 0) {
            System.out.println("Product stock cannot be negative.");
            return;
        }

        Product product = new Product(
                sellerId,
                name,
                description,
                price,
                stock);

        boolean saved = productDAO.addProduct(product);

        if (saved) {
            System.out.println("\nProduct Added Successfully.");
        } else {
            System.out.println("\nUnable to Add Product.");
        }
    }

    // View All Products
    public void viewAllProducts() {

        ArrayList<Product> products = productDAO.getAllProducts();

        if(products.isEmpty()) {

            System.out.println("\nNo Products Available.");
            return;

        }

        System.out.println("\n============== PRODUCT LIST ==============");

        for(Product p : products) {

            System.out.println("---------------------------------------");
            System.out.println("Product Id : " + p.getProductId());
            System.out.println("Name       : " + p.getName());
            System.out.println("Price      : ₹" + p.getPrice());
            System.out.println("Stock      : " + p.getStockQuantity());
            System.out.println("Description: " + p.getDescription());

        }

    }

    // Search Product
    public void searchProduct() throws ProductNotFoundException {

        System.out.print("\nEnter Product Name : ");

        String keyword = sc.nextLine();

        ArrayList<Product> products =
                productDAO.searchProduct(keyword);

        if(products.isEmpty()) {

            System.out.println("No Product Found.");
            return;

        } 

        for(Product p : products) {

            System.out.println("--------------------------------");
            System.out.println("ID : " + p.getProductId());
            System.out.println("Name : " + p.getName());
            System.out.println("Price : ₹" + p.getPrice());
            System.out.println("Stock : " + p.getStockQuantity());

        }

    }

    // Seller Products
    public void viewSellerProducts(int sellerId) {

        ArrayList<Product> products =
                productDAO.getSellerProducts(sellerId);

        if(products.isEmpty()) {

            System.out.println("\nNo Products Found.");
            return;

        }

        for(Product p : products) {

            System.out.println("--------------------------------");
            System.out.println("ID : " + p.getProductId());
            System.out.println("Name : " + p.getName());
            System.out.println("Price : ₹" + p.getPrice());
            System.out.println("Stock : " + p.getStockQuantity());

        }

    }

    // Update Product
    public void updateProduct() {

        System.out.print("\nEnter Product Id : ");
        int id = sc.nextInt();
        sc.nextLine();

        Product product = productDAO.getProductById(id);

        try {

            if(product == null){
                throw new ProductNotFoundException("Product Not Found.");
            }

        } catch(ProductNotFoundException e){

            System.out.println(e.getMessage());
            return;
        }

        System.out.print("New Name : ");
        product.setName(sc.nextLine());

        System.out.print("New Description : ");
        product.setDescription(sc.nextLine());

        System.out.print("New Price : ");
        product.setPrice(sc.nextDouble());

        System.out.print("New Stock : ");
        product.setStockQuantity(sc.nextInt());

        sc.nextLine();

        boolean updated =
                productDAO.updateProduct(product);

        if(updated)
            System.out.println("Product Updated.");
        else
            System.out.println("Update Failed.");

    }


    //upload product from csv
    public void uploadProductsFromCSV(int sellerId) {

        System.out.println("\n========= CSV PRODUCT UPLOAD =========");

        System.out.print("Enter CSV File Path : ");

        String path = sc.nextLine();

        int count = productDAO.uploadProducts(path, sellerId);

        if (count > 0) {

            System.out.println();
            System.out.println(count + " Products Uploaded Successfully.");

        } else {

            System.out.println("No Product Uploaded.");
        }

    }

}