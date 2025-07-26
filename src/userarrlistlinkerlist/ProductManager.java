package userarrlistlinkerlist;

import java.util.*;

public class ProductManager {
    private List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public boolean updateProduct(int id, String newName, double newPrice) {
        for (Product p : products) {
            if (p.getId() == id) {
                p.setName(newName);
                p.setPrice(newPrice);
                return true;
            }
        }
        return false;
    }

    public boolean deleteProduct(int id) {
        return products.removeIf(p -> p.getId() == id);
    }

    public void displayProducts() {
        if (products.isEmpty()) {
            System.out.println("Danh sách sản phẩm trống.");
        } else {
            for (Product p : products) {
                System.out.println(p);
            }
        }
    }

    public void searchByName(String keyword) {
        boolean found = false;
        for (Product p : products) {
            if (p.getName().toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println(p);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy sản phẩm có tên chứa: " + keyword);
        }
    }

    public void sortByPriceAscending() {
        products.sort(Comparator.comparingDouble(Product::getPrice));
        System.out.println("Đã sắp xếp tăng dần theo giá.");
    }

    public void sortByPriceDescending() {
        products.sort(Comparator.comparingDouble(Product::getPrice).reversed());
        System.out.println("Đã sắp xếp giảm dần theo giá.");
    }
}

