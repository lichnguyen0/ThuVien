package taothreaddongian;

public class Main {
    public static void main(String[] args) {
        // Tạo 2 đối tượng NumberGenerator
        NumberGenerator generator1 = new NumberGenerator();
        NumberGenerator generator2 = new NumberGenerator();

        // Tạo 2 luồng
        Thread thread1 = new Thread(generator1);
        Thread thread2 = new Thread(generator2);

        // Đặt tên để dễ phân biệt
        thread1.setName("Generator-1");
        thread2.setName("Generator-2");

        // Thay đổi độ ưu tiên
        thread1.setPriority(Thread.MIN_PRIORITY); // = 1
        thread2.setPriority(Thread.MAX_PRIORITY); // = 10

        // Bắt đầu luồng
        thread1.start();
        thread2.start();
    }
}

