package arraylist.theo.thuvien;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> list = new MyList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println("Element at index 2: " + list.get(2)); // Output: 3
        System.out.println("List contains 3: " + list.contains(3)); // Output: true
        System.out.println("Index of 4: " + list.indexOf(4)); // Output: 3

        list.remove(1);
        System.out.println("Element at index 1 after removal: " + list.get(1)); // Output: 3

        System.out.println("Size: " + list.size()); // Output: 3

        list.clear();
        System.out.println("Size after clear: " + list.size()); // Output: 0
    }
}
