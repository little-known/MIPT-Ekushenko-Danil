package sort;

import java.util.List;
import sort.types.AbstractSort;
import sort.types.SortType;

public class SortService {
    private final List<AbstractSort> sorters;

    public SortService(List<AbstractSort> sorters) {
        if (sorters.isEmpty()) {
            throw new IllegalArgumentException("List of sorters must not be empty");
        }
        this.sorters = sorters;
    }

    public List<Integer> sort(List<Integer> list, SortType sortType) {
        boolean sorterFound = false;
        for (AbstractSort sorter : this.sorters) {
            if (sorter.type() == sortType) {
                sorterFound = true;
                try {
                    return sorter.sort(list);
                } catch (IllegalArgumentException ignore) {}
            }
        }

        if (sorterFound) {
            throw new IllegalArgumentException("No sorters with suitable max size found");
        }

        throw new IllegalStateException("No sorter of type " + sortType + " found");
    }
}
