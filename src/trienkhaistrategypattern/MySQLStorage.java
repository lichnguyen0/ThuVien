package trienkhaistrategypattern;

public class MySQLStorage implements UserStorage {
    @Override
    public void store(User user) {
        System.out.println("Đang lưu người dùng vào MySQL Database...");
        // Giả lập lưu vào CSDL MySQL
        System.out.println("INSERT INTO users (name, email) VALUES ('"
                + user.getName() + "', '" + user.getEmail() + "');");
    }
}
