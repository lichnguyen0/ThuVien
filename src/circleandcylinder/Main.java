package circleandcylinder;

public class Main {
    public static void main(String[] args) {
        // Test Circle
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(2.5);
        Circle circle3 = new Circle(3.0, "blue");

        System.out.println(circle1);
        System.out.println(circle2);
        System.out.println(circle3);

        // Test Cylinder
        Cylinder cylinder1 = new Cylinder();
        Cylinder cylinder2 = new Cylinder(2.0, 5.0);
        Cylinder cylinder3 = new Cylinder(3.0, 10.0, "green");

        System.out.println(cylinder1);
        System.out.println(cylinder2);
        System.out.println(cylinder3);
    }
}
