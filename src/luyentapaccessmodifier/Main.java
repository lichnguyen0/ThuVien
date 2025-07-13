package luyentapaccessmodifier;

public class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle(); // khởi tạo mặc định
        Circle c2 = new Circle(2.5); // khởi tạo bán kính = 2.5

        System.out.println("Circle 1: ");
        System.out.println("Bán kính: " + c1.getRadius());
        System.out.println("Diện tích: " + c1.getArea());

        System.out.println("\nCircle 2: ");
        System.out.println("Bán kính: " + c2.getRadius());
        System.out.println("Diện tích: " + c2.getArea());
    }
}
