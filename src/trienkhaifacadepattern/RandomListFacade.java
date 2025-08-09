package trienkhaifacadepattern;

import java.util.List;

public class RandomListFacade {
    private RandomList randomList;
    private ListFilter listFilter;
    private ListPrinter listPrinter;

    public RandomListFacade() {
        randomList = new RandomList();
        listFilter = new ListFilter();
        listPrinter = new ListPrinter();
    }

    public void printRandomEvenList(int size, int maxValue) {
        // Tạo danh sách ngẫu nhiên
        List<Integer> randomNumbers = randomList.generateList(size, maxValue);
        // Lọc ra các số chẵn
        List<Integer> evenNumbers = listFilter.filterOdd(randomNumbers);
        // In danh sách số chẵn
        listPrinter.printList(evenNumbers);
    }
}

