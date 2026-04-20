/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.main;

/**
 *
 * @author zubbo
 */
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

