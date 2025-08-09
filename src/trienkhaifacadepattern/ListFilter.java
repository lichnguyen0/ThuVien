package trienkhaifacadepattern;

import java.util.ArrayList;
import java.util.List;

// Lọc bỏ số lẻ, giữ lại số chẵn
public class ListFilter {
    public List<Integer> filterOdd(List<Integer> list) {
        List<Integer> filtered = new ArrayList<>();
        for (Integer num : list) {
            if (num % 2 == 0) {
                filtered.add(num);
            }
        }
        return filtered;
    }
}
