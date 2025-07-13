package thietkevatrienkhaitriangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập các cạnh
        System.out.print("Nhập cạnh 1: ");
        double side1 = scanner.nextDouble();
        System.out.print("Nhập cạnh 2: ");
        double side2 = scanner.nextDouble();
        System.out.print("Nhập cạnh 3: ");
        double side3 = scanner.nextDouble();
        scanner.nextLine(); // Bỏ dòng

        // Nhập màu sắc
        System.out.print("Nhập màu sắc: ");
        String color = scanner.nextLine();

        // Nhập trạng thái filled
        System.out.print("Tam giác có được tô màu không? (true/false): ");
        boolean filled = scanner.nextBoolean();

        // Tạo đối tượng Triangle
        Triangle triangle = new Triangle(side1, side2, side3);
        triangle.setColor(color);
        triangle.setFilled(filled);

        // In thông tin
        System.out.println("\n--- Thông tin tam giác ---");
        System.out.println("Màu sắc: " + triangle.getColor());
        System.out.println("Tô màu: " + triangle.isFilled());
        System.out.println("Chu vi: " + triangle.getPerimeter());
        System.out.println("Diện tích: " + triangle.getArea());
        System.out.println("Thông tin chi tiết: " + triangle);
    }
}
