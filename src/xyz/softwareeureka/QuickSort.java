package xyz.softwareeureka;

import static xyz.softwareeureka.Utils.swap;

public final class QuickSort {

    public static void quickSort(final int[] unsorted,
                                 final int start,
                                 final int end) {

        // Worst case O(n^2)
        // Average and best case O(n log n)
        if (start < end) {
            int piv_pos = partition(unsorted, start, end);
            quickSort(unsorted, start, piv_pos - 1);
            quickSort(unsorted, piv_pos + 1, end);
        }
    }

    private static int partition(final int[] array,
                                 final int start,
                                 final int end) {

        var index = start + 1;
        final var piv = array[start];

        for ( int j = start + 1; j <= end; j ++) {

            if (array[j] < piv) {
                swap(array, index, j);
                index += 1;
            }
        }

        swap(array, start, index - 1);
        return index - 1;
    }

}
