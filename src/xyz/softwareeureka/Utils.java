package xyz.softwareeureka;

public final class Utils {

    public static void swap(final int[] array,
                             final int index_1,
                             final int index_2) {

        final var int_1 = array[index_1];
        final var int_2 = array[index_2];

        array[index_1] = int_2;
        array[index_2] = int_1;
    }
}
