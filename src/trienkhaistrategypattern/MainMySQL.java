package trienkhaistrategypattern;

public class MainMySQL {
    public static void main(String[] args) {
        UserStorage storage = new MySQLStorage();
        UserController controller = new UserController(storage);

        User user = new User("Tran Thi B", "b@example.com");
        controller.store(user);
    }
}

