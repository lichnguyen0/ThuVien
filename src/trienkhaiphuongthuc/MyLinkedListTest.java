package trienkhaiphuongthuc;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList<String> list = new MyLinkedList<>();

        list.add("Java");
        list.add("Python");
        list.add("C++");
        list.addFirst("HTML");
        list.addLast("CSS");

        System.out.println("First: " + list.getFirst()); // HTML
        System.out.println("Last: " + list.getLast());   // CSS
        System.out.println("Size: " + list.size());      // 5

        list.remove("Python");
        System.out.println("After remove: Size = " + list.size()); // 4

        System.out.println("Index of C++: " + list.indexOf("C++")); // 2
        System.out.println("Contains Java? " + list.contains("Java")); // true

        list.clear();
        System.out.println("After clear: Size = " + list.size()); // 0
    }
}
