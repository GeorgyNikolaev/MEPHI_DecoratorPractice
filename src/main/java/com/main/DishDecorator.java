/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.main;

/**
 *
 * @author zubbo
 */
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
