package calculator.com.vn;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator cal = new Calculator();


        System.out.println("-----Menu----");

        System.out.print("Nhập số thứ nhất: ");
        double a = scanner.nextDouble();

        System.out.print("Nhập phép tính +, -, *, / : ");
        char operator = scanner.next().charAt(0);

        System.out.print("NHập số thứ hai: ");
        double b = scanner.nextDouble();

        double ketqua;
        switch (operator) {
            case '+':
                ketqua = cal.add(a, b);
                break;

            case '-':
                ketqua = cal.subtract(a, b);
                break;

            case '*':
                ketqua = cal.multiply(a, b);
                break;

            case '/':
                ketqua = cal.divide(a, b);
                break;

            default:
                System.out.print("Bạn đang chọn sai phép tính");
                return;
        }

        System.out.println("Kết quả là : " + ketqua);


    }
}
