package trienkhainterfaceresizeable;

public class TestResizeable {
    public static void main(String[] args) {
        Resizeable circle = new Circle(5);
        Resizeable rectangle = new Rectangle(4, 6);
        Resizeable square = new Square(4);

        System.out.println("Trước khi resize:");
        System.out.println(circle);
        System.out.println(rectangle);
        System.out.println(square);

        System.out.println("\nSau khi resize 50%:");
        circle.resize(50);
        rectangle.resize(50);
        square.resize(50);

        System.out.println(circle);
        System.out.println(rectangle);
        System.out.println(square);


    }
}
