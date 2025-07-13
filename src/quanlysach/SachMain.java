package quanlysach;

import java.util.ArrayList;
import java.util.Scanner;

public class SachMain {
    public static void main(String[] args) {

        // Khởi tạo danh sách sách (ArrayList)
        ArrayList<Sach> danhSachSach = new ArrayList<>();

        // Thêm sách mẫu vào danh sách
        danhSachSach.add(new Sach("S001", "Lập trình Java", "David", 120_000));
        danhSachSach.add(new Sach("S002", "Cấu trúc dữ liệu", "Mark", 50_000));
        danhSachSach.add(new Sach("S003", "Lập trình JavaScript", "Adam", 99_000));
        danhSachSach.add(new Sach("S004", "Hệ điều hành", "Locke", 89_000));

        // Khởi tạo Scanner để nhập liệu
        Scanner scanner = new Scanner(System.in);

        // Nhập tên sách cần tìm
        System.out.println(" Nhập tên sách cần tìm:");
        String tuKhoaTenSach = scanner.nextLine(); // nên dùng nextLine thay vì next

        // Gọi phương thức tìm theo tên
        timSachTheoTen(danhSachSach, tuKhoaTenSach);

        // Nhập giá sách cần tìm
        System.out.println(" Nhập giá sách cần tìm:");
        double giaCanTim = scanner.nextDouble();

        // Gọi phương thức tìm theo giá
        timSachTheoGia(danhSachSach, giaCanTim);
    }

    // Phương thức tìm theo tên
    public static void timSachTheoTen(ArrayList<Sach> danhSach, String tuKhoa) {
        System.out.println("\n Kết quả tìm theo tên:");
        boolean timThay = false;
        for (Sach sach : danhSach) {
            if (sach.getTensach().toLowerCase().contains(tuKhoa.toLowerCase())) {
                sach.displayInfo();
                timThay = true;
            }
        }
        if (!timThay) {
            System.out.println(" Không tìm thấy sách nào có tên chứa: " + tuKhoa);
        }
    }

    // Phương thức tìm theo giá
    public static void timSachTheoGia(ArrayList<Sach> danhSach, double gia) {
        System.out.println("\n Kết quả tìm theo giá:");
        boolean timThay = false;
        for (Sach sach : danhSach) {
            if (sach.getGiaban() == gia) {
                sach.displayInfo();
                timThay = true;
            }
        }
        if (!timThay) {
            System.out.println(" Không tìm thấy sách nào có giá: " + gia + " VND");
        }
    }
}
