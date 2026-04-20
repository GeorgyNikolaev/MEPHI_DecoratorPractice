package com.main;

public abstract class DishDecorator implements Dish {
    private Dish decoratedDish;
    
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
