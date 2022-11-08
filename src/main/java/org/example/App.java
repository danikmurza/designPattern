package org.example;

import org.example.factoryPattern.Circle;
import org.example.factoryPattern.Rectangle;
import org.example.factoryPattern.Square;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        Circle circle = new Circle();
        circle.draw();
        Rectangle rectangle = new Rectangle();
        rectangle.draw();
        Square square = new Square();
        square.draw();
    }
}

