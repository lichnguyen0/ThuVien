package sudungbonhohieuquavoimemorypool;

public class Main {

    public static void main(String[] args) {
        Gun gun = new Gun();

        System.out.println("Start");

        // Thay đổi gọi phương thức để test 2 trường hợp
        //gun.fire();       // Bắn tạo mới đạn liên tục
        gun.fireInPool();    // Bắn tái sử dụng đạn từ pool

        System.out.println("Game over");
        System.out.println("Total bullet created: " + Bullet.count);
    }
}
