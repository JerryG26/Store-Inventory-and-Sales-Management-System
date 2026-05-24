package com.Store_Inventory_and_Sales_Management_System.model.product;

public class Liquor extends Product{
    private int volumeMl;
    private static final double AD_VALOREM = 0.22;
    private static final double PROOF_LITTER = 76.16;

    public Liquor(String brandName,int volumeMl, double price,int stockQuantity){
        super(brandName,"Liquor",price,stockQuantity);
        this.volumeMl = volumeMl;
    }

    @Override
    public double calculateTotalPrice(){
        double exciseTax = (price * AD_VALOREM) + PROOF_LITTER;
        return price + exciseTax + (price * VAT_RATE); 
    }

    public int getVolume(){return volumeMl;}
}
