package trienkhaifacadepattern;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

// Tạo danh sách số nguyên ngẫu nhiên
public class RandomList {
    public List<Integer> generateList(int size, int maxValue) {
        List<Integer> list = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            list.add(rand.nextInt(maxValue + 1));
        }
        return list;
    }
}

