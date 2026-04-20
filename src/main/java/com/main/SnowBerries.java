package com.main;

public class SnowBerries extends DishDecorator{
    public SnowBerries(Dish dish) {
        super(dish);
    }
    
    @Override
    public String getDescription() {
        return super.getDescription() + " + Снежные ягоды";
    }
    
    @Override
    public int getPrice() {
        return super.getPrice() + 5;
    }
}
