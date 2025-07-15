package doitenbienvatachhang;


public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        int sum = Calculator.calculate(a, b, Calculator.ADDITION);
        int difference = Calculator.calculate(a, b, Calculator.SUBTRACTION);
        int product = Calculator.calculate(a, b, Calculator.MULTIPLICATION);
        int quotient = Calculator.calculate(a, b, Calculator.DIVISION);

        System.out.println("Tổng: " + sum);
        System.out.println("Hiệu: " + difference);
        System.out.println("Tích: " + product);
        System.out.println("Thương: " + quotient);
    }
}

