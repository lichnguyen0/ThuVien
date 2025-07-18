package trienkhainterfaceresizeable;

public class Rectangle implements Resizeable {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void resize(double percent) {
        width += width * percent / 100;
        height += height * percent / 100;
    }

    @Override
    public String toString() {
        return "Rectangle with width = " + width + " and height = " + height;
    }
}
