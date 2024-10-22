package sort.types;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class MergeSort extends AbstractSort {
    public MergeSort(int maxListSize) {
        super(maxListSize);
    }

    @Override
    public SortType type() {
        return SortType.MERGE_SORT;
    }

    @Override
    public List<Integer> sort(List<Integer> list) {
        if (list.size() > this.maxListSize) {
            throw new IllegalArgumentException("List size must be less than limit");
        }

        ArrayList<Integer> sortedList = new ArrayList<>(list);
        Collections.sort(sortedList);

        return sortedList;
    }
}
