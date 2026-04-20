package com.main;

public class SnowBerries extends DishDecorator{
    public SnowBerries(Dish dish) {
        super(dish);
    }
    
    @Override
    public String getDescription() {
        return decoratedDish.getDescription() + " + Снежные ягоды";
    }
    
    @Override
    public int getPrice() {
        return decoratedDish.getPrice() + 5;
    }
}
