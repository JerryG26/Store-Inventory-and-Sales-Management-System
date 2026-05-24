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

    public void reduceStockQuantity(){
        if(!isOutofStock())
            this.stockQuantity--;
    }

    public void setPrice(double price){
        if(price >= 0) 
            this.price = price;
    }
    public void setStockQuantity(int stockQuantity){
        if(stockQuantity >= 0) 
            this.stockQuantity = stockQuantity;
    }

    public boolean isOutofStock(){return stockQuantity == 0;}
    public double getPrice(){return price;}
    public String getBrandName(){return brandName;}
    public int getStockQuantity(){return stockQuantity;}
    public String getProductCategory(){return productCategory;}

    @Override
    public String toString() {
        return String.format("Brand: %s | Category: %s | Price: %.2f | Stock: %d",
            brandName, productCategory, price, stockQuantity);
    }
}
