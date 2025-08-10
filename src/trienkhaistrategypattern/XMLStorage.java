package trienkhaistrategypattern;

public class XMLStorage implements UserStorage {
    @Override
    public void store(User user) {
        System.out.println("Đang lưu người dùng vào file XML...");
        // Giả lập lưu file XML
        System.out.println("<user>");
        System.out.println("    <name>" + user.getName() + "</name>");
        System.out.println("    <email>" + user.getEmail() + "</email>");
        System.out.println("</user>");
    }
}

