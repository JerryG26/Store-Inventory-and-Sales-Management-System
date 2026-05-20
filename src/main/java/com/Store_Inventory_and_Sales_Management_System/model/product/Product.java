package com.Store_Inventory_and_Sales_Management_System.model.product;

public abstract class Product {
    protected double price;
    protected String brandName;
    protected String productCategory;
    protected int stockQuantity;
    protected static final double VAT_RATE = 0.12;

    public Product(String brandName,String productCategory, double price,int stockQuantity){
        this.brandName = brandName;
        this.productCategory = productCategory;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }
    
    public double calculateTotalPrice() {
        return price + (price * VAT_RATE);
    }

    public void reduceStockQuantity(){this.stockQuantity--;}
    public double getPrice(){return price;}
    public String getBrandName(){return brandName;}
    public int getStockQuantity(){return stockQuantity;}
}
