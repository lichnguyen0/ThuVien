package xaydunglopphuongtrinhbac2;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    //contructor co tham so
    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    //get
    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant() {
        return Math.pow(b, 2) - 4 * a * c;
    };

    public double getRoot1() {
        double delta = getDiscriminant();
        if (delta >= 0) {
            return (-b + Math.pow(delta, 0.5)) / (2 * a);
        } else {
            return 0;
        }
    };

    public double getRoot2(){
        double delta = getDiscriminant();
        if (delta >= 0) {
            return (-b - Math.pow(delta, 0.5)) / (2 * a);
        } else {
            return 0;
        }
    };
}
