package com.main;

public class FireSauce extends DishDecorator {
    public FireSauce(Dish dish) {
        super(dish);
    }
    
    @Override
    public String getDescription() {
        return decoratedDish.getDescription() + " + Огненный соус";
    }
    
    @Override
    public int getPrice() {
        return decoratedDish.getPrice() + 10;
    }
}

