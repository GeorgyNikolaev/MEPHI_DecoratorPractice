/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.main;

/**
 *
 * @author zubbo
 */
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