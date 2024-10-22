package sort.types;

import java.util.List;

public abstract class AbstractSort {
    protected final int maxListSize;

    public AbstractSort(int maxListSize) {
        if (maxListSize <= 0) {
            throw new IllegalArgumentException("Size of list must be 1 or more");
        }

        this.maxListSize = maxListSize;
    }

    public abstract SortType type();

    public abstract List<Integer> sort(List<Integer> list);
}
