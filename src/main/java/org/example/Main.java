package org.example;

import java.util.List;
import sort.SortService;
import sort.types.SortType;
import sort.types.MergeSort;
import sort.types.BubbleSort;

public class Main {
    public static void main(String[] args) {
        SortService sortService = new SortService(List.of(
                new BubbleSort(10),
                new BubbleSort(100),
                new BubbleSort(1000),
                new MergeSort(10),
                new MergeSort(100),
                new MergeSort(1000)
        ));

        List<Integer> firstList = List.of(10, 2, -2, 1212, 39, 52, 1337, 42, 18, 0, 111, 121212);
        System.out.println("First unsorted list - " + firstList);

        List<Integer> firstSortedList = sortService.sort(firstList, SortType.MERGE_SORT);
        System.out.println("First sorted list - " + firstSortedList);

        List<Integer> secondList = List.of(123, 0, -123, 22222, 1991, 1984, 1984, -11111, 12312, 2222, 11);
        System.out.println("second unsorted list - " + secondList);

        List<Integer> secondSortedList = sortService.sort(secondList, SortType.BUBBLE_SORT);
        System.out.println("second sorted list - " + secondSortedList);
    }
}
