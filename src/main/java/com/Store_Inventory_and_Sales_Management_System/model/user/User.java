package com.Store_Inventory_and_Sales_Management_System.model.user;

public class User {
    private String user_name;
    private String password;

    public User(String user_name, String password){
        this.user_name = user_name;
        this.password = password;
    }

    public String getUserNAme(){return user_name;}
    public String getPassword(){return password;}
}
