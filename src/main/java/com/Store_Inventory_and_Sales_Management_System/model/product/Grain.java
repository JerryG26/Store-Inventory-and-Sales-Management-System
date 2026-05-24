package com.Store_Inventory_and_Sales_Management_System.model.product;

public class Grain extends Product{
    public Grain(String brandName, double price, int stockQuantity) {
        super(brandName, "Grain", price, stockQuantity);
    }

    @Override
    public double calculateTotalPrice() {
        return price;
    }
}
