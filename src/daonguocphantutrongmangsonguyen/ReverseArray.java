package daonguocphantutrongmangsonguyen;

import java.util.Stack;

public class ReverseArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        Stack<Integer> stack = new Stack<>();

        // Push các phần tử vào Stack
        for (int i = 0; i < array.length; i++) {
            stack.push(array[i]);
        }

        // Pop ngược lại vào mảng
        for (int i = 0; i < array.length; i++) {
            array[i] = stack.pop();
        }

        // In mảng sau khi đảo ngược
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
