package queuesudungdanhsach;

public class Solution {
    public void enQueue(Queue q, int value) {
        Node temp = new Node(value);

        // Nếu hàng đợi rỗng
        if (q.front == null) {
            q.front = q.rear = temp;
            q.rear.link = q.front; // Liên kết rear về front để tạo vòng
        } else {
            q.rear.link = temp;    // Rear trỏ tới node mới
            q.rear = temp;         // Cập nhật rear
            q.rear.link = q.front; // rear mới trỏ về front
        }
    }

    // Xóa phần tử khỏi hàng đợi
    public void deQueue(Queue q) {
        if (q.front == null) {
            System.out.println("Hàng đợi rỗng");
            return;
        }

        // Nếu chỉ còn một phần tử
        if (q.front == q.rear) {
            q.front = q.rear = null;
        } else {
            q.front = q.front.link;     // Di chuyển front đến node tiếp theo
            q.rear.link = q.front;      // rear trỏ tới front mới để giữ vòng
        }
    }

    // Hiển thị hàng đợi
    public void displayQueue(Queue q) {
        if (q.front == null) {
            System.out.println("Hàng đợi rỗng");
            return;
        }

        Node temp = q.front;
        System.out.print("Các phần tử trong hàng đợi: ");
        do {
            System.out.print(temp.data + " ");
            temp = temp.link;
        } while (temp != q.front);

        System.out.println();
    }
}
