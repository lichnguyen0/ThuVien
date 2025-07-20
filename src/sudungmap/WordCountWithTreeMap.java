package sudungmap;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class WordCountWithTreeMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập chuỗi: ");
        String input = scanner.nextLine();

        // Đưa toàn bộ chuỗi về chữ thường và tách từ bằng khoảng trắng
        String[] words = input.toLowerCase().split("\\s+");

        // Sử dụng TreeMap để lưu từ và số lần xuất hiện
        Map<String, Integer> wordMap = new TreeMap<String, Integer>();

        for (String word : words) {
            // Bỏ các ký tự không phải chữ nếu cần: word = word.replaceAll("[^a-zA-Z]", "");

            if (wordMap.containsKey(word)) {
                wordMap.put(word, wordMap.get(word) + 1);
            } else {
                wordMap.put(word, 1);
            }
        }

        // In kết quả
        System.out.println("\nTần suất từ:");
        for (Map.Entry<String, Integer> entry : wordMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        scanner.close();
    }
}
