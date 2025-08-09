package trienkhaifacadepattern;

import java.util.List;

// Hiển thị danh sách số nguyên
public class ListPrinter {
    public void printList(List<Integer> list) {
        for (Integer num : list) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
