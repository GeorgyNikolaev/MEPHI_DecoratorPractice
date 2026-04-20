/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.main;

/**
 *
 * @author zubbo
 */
public class Stew implements Dish{
    @Override
    public String getDescription() {
        return "Рагу";
    }
    
    @Override
    public int getPrice() {
        return 50;
    }
}

