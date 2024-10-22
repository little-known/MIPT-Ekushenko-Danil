package sort;

import java.util.List;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import sort.types.MergeSort;
import sort.types.BubbleSort;
import sort.types.SortType;

class SortServiceTest {
    public static final List<Integer> list = List.of(10, 2, -2, 121, 39, 52, 133, 42, 18, 0, 111, 1212);
    public static final List<Integer> sortedList = List.of(-2, 0, 2, 10, 18, 39, 42, 52, 111, 121, 133, 1212);

    @Test
    void testEmptySortersListInInitializerThrowsIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> new SortService(List.of()));
    }

    @Test
    void testSortIsCorrect() {
        SortService sortService = new SortService(List.of(
                new MergeSort(100),
                new BubbleSort(100)
        ));

        assertEquals(sortedList, sortService.sort(list, SortType.BUBBLE_SORT));
        assertEquals(sortedList, sortService.sort(list, SortType.MERGE_SORT));
    }

    @Test
    void testSortThrowsIllegalArgumentException() {
        SortService sortService = new SortService(List.of(
                new BubbleSort(5),
                new MergeSort(20)
        ));

        assertThrows(IllegalArgumentException.class, () -> sortService.sort(list, SortType.BUBBLE_SORT));
    }

    @Test
    void testSortThrowsIllegalStateException() {
        SortService sortServiceWithMerge = new SortService(List.of(
                new MergeSort(5)
        ));
        SortService sortServiceWithBubble = new SortService(List.of(
                new BubbleSort(5)
        ));

        assertThrows(IllegalStateException.class, () -> sortServiceWithMerge.sort(list, SortType.BUBBLE_SORT));
        assertThrows(IllegalStateException.class, () -> sortServiceWithBubble.sort(list, SortType.MERGE_SORT));
    }
}
