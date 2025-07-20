package queuesudungdanhsach;

public class Main {
    public static void main(String[] args) {
        Queue q = new Queue();
        Solution s = new Solution();

        s.enQueue(q, 10);
        s.enQueue(q, 20);
        s.enQueue(q, 30);

        s.displayQueue(q); // Output: 10 20 30

        s.deQueue(q);
        s.displayQueue(q); // Output: 20 30

        s.deQueue(q);
        s.deQueue(q);
        s.displayQueue(q); // Output: Hàng đợi rỗng
    }
}
