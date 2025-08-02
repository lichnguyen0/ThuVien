package docfilecsv;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CsvReader {
    public static void main(String[] args) {
        String filePath = "src/data/countries.csv"; // Đường dẫn đến file CSV (bạn thay đổi nếu cần)
        ArrayList<Country> countries = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;

            while ((line = br.readLine()) != null) {
                // Tách dòng theo dấu phẩy
                String[] parts = line.split(",");

                // Xử lý và loại bỏ dấu ngoặc kép nếu có
                int id = Integer.parseInt(parts[0].trim());
                String code = parts[1].replace("\"", "").trim();
                String name = parts[2].replace("\"", "").trim();

                countries.add(new Country(id, code, name));
            }

            // In danh sách quốc gia
            System.out.println("Danh sách quốc gia:");
            for (Country c : countries) {
                System.out.println(c);
            }

        } catch (IOException e) {
            System.out.println(" Lỗi khi đọc file: " + e.getMessage());
        }
    }
}

