package tachphuongthuc.refactoring;

public class Cylinder {
    public static double getVolume(double radius, double height){
        double baseArea = getBaseArea(radius);
        double perimeter = getPerimeter(radius);
        double volume = perimeter * height + 2 * baseArea;
        return volume;
    }

    private static double getPerimeter(double radius) {
        return 2 * Math.PI  * radius;
    }

    private static double getBaseArea(double radius) {
        return Math.PI * radius * radius;
    }
}
