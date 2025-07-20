package daonguocphantutrongmangsonguyen;

import java.util.Stack;
public class ReverseStringWords {
    public static void main(String[] args) {
        String input = "Hello Java Stack Example";
        Stack<String> wStack = new Stack<>();

        // Tách chuỗi thành các từ
        String[] words = input.split(" ");

        // Đưa từng từ vào Stack
        for (String word : words) {
            wStack.push(word);
        }

        // Nối chuỗi theo thứ tự ngược lại
        StringBuilder output = new StringBuilder();
        while (!wStack.isEmpty()) {
            output.append(wStack.pop()).append(" ");
        }

        // In chuỗi sau khi đảo
        System.out.println(output.toString().trim());
    }
}
