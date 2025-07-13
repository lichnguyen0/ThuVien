package xaydunglopchighitrongjava;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();

        // Gọi các phương thức setter
        student.setName("Lich");
        student.setClasses("C05");

        System.out.println(student.getInfo()); // In kết quả
    }
}
