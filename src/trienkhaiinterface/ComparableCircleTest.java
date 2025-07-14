package trienkhaiinterface;

import java.util.Arrays; // ✅ để dùng Arrays.sort
import trienkhaiinterface.ComparableCircle; // ✅ để nhận diện ComparableCircle

public class ComparableCircleTest {
    public static void main(String[] args) {
        ComparableCircle[] circles = new ComparableCircle[3];
        circles[0] = new ComparableCircle(3.6);
        circles[1] = new ComparableCircle(); // radius = 1.0
        circles[2] = new ComparableCircle(3.5, "indigo", false);

        System.out.println("Pre-sorted:");
        for (ComparableCircle circle : circles) {
            System.out.println(circle);
        }

        Arrays.sort(circles); // Sắp xếp theo radius

        System.out.println("After-sorted:");
        for (ComparableCircle circle : circles) {
            System.out.println(circle);
        }
    }
}
