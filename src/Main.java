
import java.util.Arrays;

import static xyz.softwareeureka.BubbleSort.bubbleSort;
import static xyz.softwareeureka.QuickSort.quickSort;

public class Main {
    public static void main(String[] args) {

        var unsorted_1 = new int[]{ 2, 1, 5, 4, 3, 8, 7, 6, 10, 9 };
        quickSort(unsorted_1, 0, unsorted_1.length - 1);
        Arrays.stream(unsorted_1).sequential().forEach(System.out::println);


        var unsorted_2 = new int[]{ 2, 1, 5, 4, 3, 8, 7, 6, 10, 9 };
        bubbleSort(unsorted_2, 0, unsorted_2.length - 1);
        Arrays.stream(unsorted_2).sequential().forEach(System.out::println);
    }

}