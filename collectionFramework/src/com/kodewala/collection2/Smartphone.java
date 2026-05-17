package com.kodewala.collection2;

public class Smartphone {
    String modelName;
    String brand;
    String operatingSystem;
    String priceRange;

    // Constructor
    public Smartphone(String modelName, String brand, String operatingSystem, String priceRange) {
        this.modelName = modelName;
        this.brand = brand;
        this.operatingSystem = operatingSystem;
        this.priceRange = priceRange;
    }

    // Getters and Setters
    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public String getPriceRange() {
        return priceRange;
    }

    public void setPriceRange(String priceRange) {
        this.priceRange = priceRange;
    }
}
