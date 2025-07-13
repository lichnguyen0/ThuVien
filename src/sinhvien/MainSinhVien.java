package sinhvien;

import java.sql.SQLOutput;

public class MainSinhVien {
    public static void main(String[] args) {
        // Tao doi tượng sinh viên
        SinhVien sv1 = new SinhVien("C001", "Nguyen Van A", 20, "CNTT1");

        // Hiển thị thông tin ban đầu
        sv1.displayInfo();

        //Câp nhật trực tiếp( không cần setter) nhưng khi các thuộc tính của đối tượng sử dụng private không thể sử dụng cách này.
//        sv1.tuoi = 21;
//        sv1.lop = "CNTT2";

        //nếu các thuộc tính của đối tượng có private thì phải gọi qua get và set thế này để cập nhật giá trị
        sv1.setTuoi(21);
        sv1.setLop("CNTT2");

        //Hiển thị lại sau khi sửa
        System.out.println("Thông tin sau khi cập nhật: ");
        sv1.displayInfo();

    }
}
