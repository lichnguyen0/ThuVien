package userarrlistlinkerlist;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProductManager manager = new ProductManager();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Thêm sản phẩm");
            System.out.println("2. Sửa thông tin sản phẩm");
            System.out.println("3. Xoá sản phẩm");
            System.out.println("4. Hiển thị danh sách sản phẩm");
            System.out.println("5. Tìm kiếm sản phẩm theo tên");
            System.out.println("6. Sắp xếp tăng dần theo giá");
            System.out.println("7. Sắp xếp giảm dần theo giá");
            System.out.println("0. Thoát");
            System.out.print("Chọn chức năng: ");
            choice = sc.nextInt();
            sc.nextLine(); // Clear buffer

            switch (choice) {
                case 1:
                    System.out.print("Nhập ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nhập tên: ");
                    String name = sc.nextLine();
                    System.out.print("Nhập giá: ");
                    double price = sc.nextDouble();
                    manager.addProduct(new Product(id, name, price));
                    break;
                case 2:
                    System.out.print("Nhập ID sản phẩm cần sửa: ");
                    int updateId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nhập tên mới: ");
                    String newName = sc.nextLine();
                    System.out.print("Nhập giá mới: ");
                    double newPrice = sc.nextDouble();
                    if (manager.updateProduct(updateId, newName, newPrice)) {
                        System.out.println("Cập nhật thành công.");
                    } else {
                        System.out.println("Không tìm thấy sản phẩm.");
                    }
                    break;
                case 3:
                    System.out.print("Nhập ID sản phẩm cần xoá: ");
                    int deleteId = sc.nextInt();
                    if (manager.deleteProduct(deleteId)) {
                        System.out.println("Xoá thành công.");
                    } else {
                        System.out.println("Không tìm thấy sản phẩm.");
                    }
                    break;
                case 4:
                    manager.displayProducts();
                    break;
                case 5:
                    System.out.print("Nhập tên sản phẩm cần tìm: ");
                    String keyword = sc.nextLine();
                    manager.searchByName(keyword);
                    break;
                case 6:
                    manager.sortByPriceAscending();
                    manager.displayProducts();
                    break;
                case 7:
                    manager.sortByPriceDescending();
                    manager.displayProducts();
                    break;
                case 0:
                    System.out.println("Thoát chương trình.");
                    break;
                default:
                    System.out.println("Chức năng không hợp lệ.");
            }
        } while (choice != 0);

        sc.close();
    }
}

