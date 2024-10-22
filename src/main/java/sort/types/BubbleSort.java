package sort.types;

import java.util.List;
import java.util.ArrayList;

public class BubbleSort extends AbstractSort {
    public BubbleSort(int maxListSize) {
        super(maxListSize);
    }

    @Override
    public SortType type() {
        return SortType.BUBBLE_SORT;
    }

    @Override
    public List<Integer> sort(List<Integer> list) {
        if (list.size() > this.maxListSize) {
            throw new IllegalArgumentException("List size must be less than limit");
        }

        ArrayList<Integer> sortedList = new ArrayList<>(list);

        for (int i = 0; i < sortedList.size(); i++) {
            for (int j = i + 1; j < sortedList.size(); j++) {
                if (sortedList.get(i) > sortedList.get(j)) {
                    int temp = sortedList.get(i);
                    sortedList.set(i, sortedList.get(j));
                    sortedList.set(j, temp);
                }
            }
        }

        return sortedList;
    }
}
