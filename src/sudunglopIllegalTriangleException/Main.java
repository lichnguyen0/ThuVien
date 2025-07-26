package sudunglopIllegalTriangleException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Nhập cạnh a: ");
            double a = scanner.nextDouble();

            System.out.print("Nhập cạnh b: ");
            double b = scanner.nextDouble();

            System.out.print("Nhập cạnh c: ");
            double c = scanner.nextDouble();

            Triangle triangle = new Triangle(a, b, c);
            triangle.display();

        } catch (IllegalTriangleException e) {
            System.err.println("Lỗi: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Lỗi không xác định: " + e.getMessage());
        }
    }
}

