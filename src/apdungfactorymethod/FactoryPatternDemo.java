package apdungfactorymethod;

public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();

        // Tạo hình tròn và gọi draw()
        Shape shape1 = factory.getShape("CIRCLE");
        shape1.draw();

        // Tạo hình vuông và gọi draw()
        Shape shape2 = factory.getShape("SQUARE");
        shape2.draw();

        // Tạo hình chữ nhật và gọi draw()
        Shape shape3 = factory.getShape("RECTANGLE");
        shape3.draw();
    }
}
