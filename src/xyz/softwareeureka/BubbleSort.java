package xyz.softwareeureka;

import static xyz.softwareeureka.Utils.swap;

public final class BubbleSort {

    public static void bubbleSort(final int[] array,
                                  final int start,
                                  final int end) {

        // Best case O(n)
        // Average & worst case O(n^2)
        for ( int i = start; i < end; i ++) {
            for ( int e = start; e < end; e ++)
                sort(array, start + e, end);
        }
    }

    private static void sort(final int[] array,
                             final int start,
                             final int end) {
        if (start < end &&
            array[start] > array[start + 1]) {

            swap(array, start, start + 1);
        }
    }
}
