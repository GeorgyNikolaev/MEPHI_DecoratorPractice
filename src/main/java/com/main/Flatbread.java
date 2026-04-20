package com.main;

public class Flatbread extends DishDecorator{
    public Flatbread(Dish dish) {
        super(dish);
    }
    
    @Override
    public String getDescription() {
        return decoratedDish.getDescription() + " + Нордская лепёшка";
    }
    
    @Override
    public int getPrice() {
        return decoratedDish.getPrice() + 7;
    }
}