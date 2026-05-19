package com.Store_Inventory_and_Sales_Management_System.model.user;

public abstract class User {
    protected String user_name;
    protected String password;

    public User(String user_name, String password){
        this.user_name = user_name;
        this.password = password;
    }
}
