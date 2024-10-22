package sort.types;

import java.util.List;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MergeSortTest {
    public static final List<Integer> list = List.of(10, 2, -2, 121, 39, 52, 133, 42, 18, 0, 111, 1212);
    public static final List<Integer> sortedList = List.of(-2, 0, 2, 10, 18, 39, 42, 52, 111, 121, 133, 1212);

    @Test
    void testWrongSizeInInitializerThrowsIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> new MergeSort(-5));
    }

    @Test
    void testType() {
        assertEquals(SortType.MERGE_SORT, new MergeSort(10).type());
    }

    @Test
    void testSortIsCorrect() {
        MergeSort mergeSort = new MergeSort(20);

        assertEquals(sortedList, mergeSort.sort(list));
    }

    @Test
    void testIfSizeMoreThanMaxThrowsIllegalArgumentException() {
        MergeSort mergeSort = new MergeSort(5);

        assertThrows(IllegalArgumentException.class, () -> mergeSort.sort(list));
    }
}
