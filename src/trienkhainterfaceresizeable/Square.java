package trienkhainterfaceresizeable;

// File: Square.java
public class Square extends Rectangle {

    public Square(double side) {
        super(side, side);
    }

    @Override
    public String toString() {
        return "Square with side = " + getWidth();
    }

    public double getWidth() {
        return super.toString().contains("width = ") ?
                Double.parseDouble(super.toString().split("width = ")[1].split(" ")[0]) : 0;
    }
}

