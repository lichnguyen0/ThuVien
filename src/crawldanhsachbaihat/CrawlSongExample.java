package crawldanhsachbaihat;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CrawlSongExample {

    public static void main(String[] args) {
        try {

            URL url = new URL("https://www.nhaccuatui.com/bai-hat/nhac-tre-moi.html");


            Scanner scanner = new Scanner(new InputStreamReader(url.openStream()));
            scanner.useDelimiter("\\Z"); // Đọc toàn bộ nội dung
            String content = scanner.next();
            scanner.close(); // Đóng stream sau khi đọc xong


            content = content.replaceAll("\\n+", "");


            Pattern pattern = Pattern.compile("name_song\">(.*?)</a>");
            Matcher matcher = pattern.matcher(content);


            System.out.println("DANH SÁCH BÀI HÁT:");
            while (matcher.find()) {
                System.out.println("- " + matcher.group(1));
            }

        } catch (IOException e) {
            System.out.println("Đã xảy ra lỗi khi đọc dữ liệu từ trang web:");
            e.printStackTrace();
        }
    }
}
