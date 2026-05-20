package com.Store_Inventory_and_Sales_Management_System.model.product;

public class Food extends Product{
    
    public Food(String brandName, double price, int stockQuantity) {
        super(brandName, "Food", price, stockQuantity);
    }

}
