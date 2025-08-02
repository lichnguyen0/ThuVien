package copyfiletext;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TextFileCopy {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập đường dẫn tập tin nguồn: ");
        String sourcePath = sc.nextLine();

        System.out.print("Nhập đường dẫn tập tin đích: ");
        String targetPath = sc.nextLine();

        File sourceFile = new File(sourcePath);
        File targetFile = new File(targetPath);

        // Kiểm tra file nguồn có tồn tại không
        if (!sourceFile.exists()) {
            System.out.println("Tập tin nguồn không tồn tại.");
            return;
        }

        // Kiểm tra nếu file đích đã tồn tại
        if (targetFile.exists()) {
            System.out.println("Tập tin đích đã tồn tại. Ghi đè sẽ xóa nội dung cũ.");
            System.out.print("Bạn có muốn tiếp tục? (yes/no): ");
            String confirm = sc.nextLine();
            if (!confirm.equalsIgnoreCase("yes")) {
                System.out.println(" Hủy sao chép.");
                return;
            }
        }

        // Tiến hành sao chép
        int charCount = 0;

        try (
                FileReader reader = new FileReader(sourceFile);
                FileWriter writer = new FileWriter(targetFile);
        ) {
            int ch;
            while ((ch = reader.read()) != -1) {
                writer.write(ch);
                charCount++;
            }

            System.out.println("Sao chép thành công!");
            System.out.println("Tổng số ký tự đã sao chép: " + charCount);
        } catch (IOException e) {
            System.out.println("Lỗi khi sao chép tập tin: " + e.getMessage());
        }
    }
}
