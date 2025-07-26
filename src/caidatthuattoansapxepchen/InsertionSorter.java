package caidatthuattoansapxepchen;

public class InsertionSorter {

    public static void insertionSort(int[] list) {
        for (int i = 1; i < list.length; i++) {
            int key = list[i];
            int j = i - 1;

            // Dịch các phần tử lớn hơn key sang phải
            while (j >= 0 && list[j] > key) {
                list[j + 1] = list[j];
                j--;
            }

            // Chèn key vào đúng vị trí
            list[j + 1] = key;
        }
    }

    // Hàm main để kiểm tra
    public static void main(String[] args) {
        int[] list = {6, 3, 8, 2, 5};

        System.out.println("Trước khi sắp xếp:");
        for (int num : list) {
            System.out.print(num + " ");
        }

        insertionSort(list);

        System.out.println("\nSau khi sắp xếp:");
        for (int num : list) {
            System.out.print(num + " ");
        }
    }
}

