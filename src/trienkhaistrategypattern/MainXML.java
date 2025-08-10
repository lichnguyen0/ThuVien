package trienkhaistrategypattern;

public class MainXML {
    public static void main(String[] args) {
        UserStorage storage = new XMLStorage();
        UserController controller = new UserController(storage);

        User user = new User("Nguyen Van A", "a@example.com");
        controller.store(user);
    }
}

