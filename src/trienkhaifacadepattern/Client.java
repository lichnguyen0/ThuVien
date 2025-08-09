package trienkhaifacadepattern;

public class Client {
    public static void main(String[] args) {
        RandomListFacade facade = new RandomListFacade();

        int size = 20;      // số lượng phần tử
        int maxValue = 100; // giá trị lớn nhất của số ngẫu nhiên

        System.out.println("Danh sách số chẵn ngẫu nhiên:");
        facade.printRandomEvenList(size, maxValue);
    }
}
