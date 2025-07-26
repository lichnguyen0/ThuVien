package sudunglopIllegalTriangleException;

public class Triangle {
    private double a, b, c;

    public Triangle(double a, double b, double c) throws IllegalTriangleException {
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new IllegalTriangleException("Cạnh tam giác phải lớn hơn 0.");
        }
        if (a + b <= c || a + c <= b || b + c <= a) {
            throw new IllegalTriangleException("Tổng hai cạnh phải lớn hơn cạnh còn lại.");
        }

        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void display() {
        System.out.println("Tam giác hợp lệ có các cạnh: " + a + ", " + b + ", " + c);
    }
}
