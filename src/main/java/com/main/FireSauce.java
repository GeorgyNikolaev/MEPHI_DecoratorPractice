package com.main;

public class FireSauce extends DishDecorator {
    public FireSauce(Dish dish) {
        super(dish);
    }
    
    @Override
    public String getDescription() {
        return super.getDescription() + " + Огненный соус";
    }
    
    @Override
    public int getPrice() {
        return super.getPrice() + 10;
    }
}

