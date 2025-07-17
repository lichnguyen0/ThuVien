package trienkhai.linkedlist.dongian;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList(10); // tạo danh sách với phần tử đầu là 10

        list.addFirst(5);     // thêm vào đầu
        list.add(1, 7);       // thêm 7 vào vị trí thứ 1
        list.add(2, 15);      // thêm 15 vào vị trí thứ 2

        list.printList();     // in ra danh sách
    }
}

