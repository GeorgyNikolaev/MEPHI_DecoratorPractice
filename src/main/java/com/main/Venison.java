package com.main;

public class Venison extends DishDecorator{
    public Venison(Dish dish) {
        super(dish);
    }
    
    @Override
    public String getDescription() {
        return super.getDescription() + " + Двойная порция оленины";
    }
    
    @Override
    public int getPrice() {
        return super.getPrice() + 20;
    }
}

