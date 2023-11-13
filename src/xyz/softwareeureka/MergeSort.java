package xyz.softwareeureka;

import java.util.Arrays;

public final class MergeSort {

    public static void mergeSort(final int[] array, final int start, final int end) {
        if (start < end) {
            // best, worst and average O(n log n)
            int mid = (start + end) / 2;
            mergeSort(array, start, mid); // left
            mergeSort(array, mid + 1, end); // right
            sort(array, start, mid, end); // final merge
        }
    }

    private static void sort(final int[] array,
                             int start,
                             final int mid,
                             final int end) {

        int temp_start = start;
        int temp_mid = mid + 1;

        final int[] temp_array = new int[end - start + 1];

        int x = 0;
        for (int i = start; i <= end; i ++) {
            if (temp_start > mid) // first half
                temp_array[x ++] = array[temp_mid ++];
            else if (temp_mid > end) // second half
                temp_array[x ++] = array[temp_start ++];
            else if (array[temp_start] < array[temp_mid]) // check lessor
                temp_array[x ++] = array[temp_start ++];
            else
                temp_array[x ++] = array[temp_mid ++];
        }

        for ( int i = 0; i < x; i ++)
            array[start ++] = temp_array[i];
    }
}
