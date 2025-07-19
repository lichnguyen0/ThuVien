package caclop.hinhhoc;

import cacdoituonghinh.Square;

public class SquareTest {
    public static void main(String[] args) {
        Square square = new Square(4.0);

        System.out.println("Diện tích hình vuông: " + square.getArea());

        if (square instanceof Colorable) {
            ((Colorable) square).howToColor();
        }
    }
}

