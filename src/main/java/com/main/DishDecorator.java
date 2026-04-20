package com.main;

public abstract class DishDecorator implements Dish {
    public Dish decoratedDish;
    
    public DishDecorator(Dish decoratedDish) {
        this.decoratedDish = decoratedDish;
    }
    
    @Override
    public String getDescription() {
        return decoratedDish.getDescription();
    }
    
    @Override
    public int getPrice() {
        return decoratedDish.getPrice();
    }
}
