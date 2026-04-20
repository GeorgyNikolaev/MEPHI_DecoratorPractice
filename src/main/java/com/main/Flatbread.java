package com.main;

public class Flatbread extends DishDecorator{
    public Flatbread(Dish dish) {
        super(dish);
    }
    
    @Override
    public String getDescription() {
        return super.getDescription() + " + Нордская лепёшка";
    }
    
    @Override
    public int getPrice() {
        return super.getPrice() + 7;
    }
}