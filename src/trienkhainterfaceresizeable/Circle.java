package trienkhainterfaceresizeable;

// File: Circle.java
public class Circle implements Resizeable {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void resize(double percent) {
        radius += radius * percent / 100;
    }

    @Override
    public String toString() {
        return "Circle with radius = " + radius;
    }
}

