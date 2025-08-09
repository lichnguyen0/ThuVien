package trienkhaiproxypattern;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Downloader downloader = new FileDownloaderProxy();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập URL file cần tải: ");
        String url = scanner.nextLine();

        System.out.print("Nhập đường dẫn lưu file: ");
        String destPath = scanner.nextLine();

        try {
            downloader.download(url, destPath);
            System.out.println("Download thành công!");
        } catch (Exception e) {
            System.err.println("Lỗi khi download: " + e.getMessage());
        }

        scanner.close();
    }
}
