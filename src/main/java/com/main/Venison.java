package com.main;

public class Venison extends DishDecorator{
    public Venison(Dish dish) {
        super(dish);
    }
    
    @Override
    public String getDescription() {
        return decoratedDish.getDescription() + " + Двойная порция оленины";
    }
    
    @Override
    public int getPrice() {
        return decoratedDish.getPrice() + 20;
    }
}

