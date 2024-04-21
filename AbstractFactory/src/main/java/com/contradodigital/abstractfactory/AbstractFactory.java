/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.contradodigital.abstractfactory;

/**
 *
 * @author Umair
 */


public interface AbstractFactory {
    Shape createShape();

    public static void main(String[] args) {
        // Create a ShapeFactory
        AbstractFactory shapeFactory = (AbstractFactory) new ShapeFactory() {
            @Override
            public Shape createShape(String type) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        };

        // Use the ShapeFactory to create a new shape
        Shape shape = shapeFactory.createShape();

        // Call the draw method on the created shape
        shape.draw();
        // Create a Triangle
        Triangle triangle = new Triangle();
        
        // Call the draw method on the created triangle
        triangle.draw();
    }
}