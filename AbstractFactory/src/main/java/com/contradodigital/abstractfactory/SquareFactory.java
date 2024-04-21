/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.contradodigital.abstractfactory;

/**
 *
 * @author Umair
 */
public class SquareFactory implements AbstractFactory {
    @Override
    public Shape createShape() {
        return new Square();
    }
}
