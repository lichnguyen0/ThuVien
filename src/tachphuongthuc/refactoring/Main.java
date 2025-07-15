package tachphuongthuc.refactoring;

public class Main {
    public static void main(String[] args) {
        double radius = 5.0;
        double height = 10.0;

        double volume = Cylinder.getVolume(radius, height);
        System.out.println("Thể tích hình trụ là: " + volume);
    }
}

