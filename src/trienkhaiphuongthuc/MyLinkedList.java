package trienkhaiphuongthuc;

public class MyLinkedList <E>{
    private Node head;
    private int numNodes = 0;

    public MyLinkedList() {
    }

    public void add(int index, E element) {
        if (index < 0 || index > numNodes) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + numNodes);
        }
        if (index == 0) {
            addFirst(element);
        } else {
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.getNext();
            }
            Node holder = temp.getNext();
            temp.setNext(new Node(element));
            temp.getNext().setNext(holder);
            numNodes++;
        }
    }

    public void addFirst(E e) {
        Node temp = head;
        head = new Node(e);
        head.setNext(temp);
        numNodes++;
    }

    public void addLast(E e) {
        if (head == null) {
            addFirst(e);
            return;
        }
        Node temp = head;
        while (temp.getNext() != null) {
            temp = temp.getNext();
        }
        temp.setNext(new Node(e));
        numNodes++;
    }

    public E get(int index) {
        if (index < 0 || index >= numNodes) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + numNodes);
        }
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.getNext();
        }
        return (E) temp.getData();
    }

    public E getFirst() {
        if (head == null) return null;
        return (E) head.getData();
    }

    public E getLast() {
        if (head == null) return null;
        Node temp = head;
        while (temp.getNext() != null) {
            temp = temp.getNext();
        }
        return (E) temp.getData();
    }

    public int size() {
        return numNodes;
    }

    public boolean remove(Object o) {
        if (head == null) return false;

        if (head.getData().equals(o)) {
            head = head.getNext();
            numNodes--;
            return true;
        }

        Node temp = head;
        while (temp.getNext() != null) {
            if (temp.getNext().getData().equals(o)) {
                temp.setNext(temp.getNext().getNext());
                numNodes--;
                return true;
            }
            temp = temp.getNext();
        }
        return false;
    }

    public E remove(int index) {
        if (index < 0 || index >= numNodes) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + numNodes);
        }

        if (index == 0) {
            Node temp = head;
            head = head.getNext();
            numNodes--;
            return (E) temp.getData();
        }

        Node prev = head;
        for (int i = 0; i < index - 1; i++) {
            prev = prev.getNext();
        }
        Node toRemove = prev.getNext();
        prev.setNext(toRemove.getNext());
        numNodes--;
        return (E) toRemove.getData();
    }

    public boolean contains(E o) {
        return indexOf(o) != -1;
    }

    public int indexOf(E o) {
        Node temp = head;
        for (int i = 0; i < numNodes; i++) {
            if (temp.getData().equals(o)) {
                return i;
            }
            temp = temp.getNext();
        }
        return -1;
    }

    public boolean add(E e) {
        addLast(e);
        return true;
    }

    public void ensureCapacity(int minCapacity) {
        // Không áp dụng với LinkedList vì không dùng mảng
    }

    public E clone() {
        MyLinkedList<E> clone = new MyLinkedList<>();
        Node temp = head;
        while (temp != null) {
            clone.add((E) temp.getData());
            temp = temp.getNext();
        }
        return (E) clone;
    }

    public void clear() {
        head = null;
        numNodes = 0;
    }
}
