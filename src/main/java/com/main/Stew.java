package com.main;

public class Stew implements Dish{
    @Override
    public String getDescription() {
        return "Рагу";
    }
    
    @Override
    public int getPrice() {
        return 50;
    }
}

