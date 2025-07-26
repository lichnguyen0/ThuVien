package minhoathuattoansapxepchen;

import java.util.Scanner;

public class InsertionSortStepByStep {

    public static void insertionSort(int[] array) {
        int n = array.length;

        for (int i = 1; i < n; i++) {
            int key = array[i];
            int j = i - 1;

            // Di chuyển các phần tử lớn hơn key về bên phải
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }

            array[j + 1] = key;

            // In mảng sau mỗi bước sắp xếp
            System.out.print("Bước " + i + ": ");
            printArray(array);
        }
    }

    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số lượng phần tử của mảng: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Nhập các phần tử:");
        for (int i = 0; i < n; i++) {
            System.out.print("arr[" + i + "] = ");
            arr[i] = sc.nextInt();
        }

        System.out.println("\n--- Quá trình sắp xếp chèn ---");
        insertionSort(arr);

        System.out.println("\nMảng sau khi sắp xếp:");
        printArray(arr);
    }
}

