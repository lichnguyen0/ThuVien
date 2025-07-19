package caclop.hinhhoc;

import cacdoituonghinh.Square;

public class ColorableTest {
    public static void main(String[] args) {
        Square square = new Square(5.0);

        if (square instanceof Colorable) {
            ((Colorable)square).howToColor();
        }


    }

}
