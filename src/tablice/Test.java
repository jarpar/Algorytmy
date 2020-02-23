package tablice;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        System.out.println("InsertSort:");
        int[] tab = new int[]{3, 2, 5, 2, 1, 7, 8, 9, 11, 1, 3, 2, 5, 4};
        System.out.println(Arrays.toString(InsertSort.swap(tab)));

        System.out.println("BubbleSort:");
        int[] tab2 = new int[]{3, 5, 7, 2, 3, 4, 56, 3};
        System.out.println(Arrays.toString(BubbleSort.sort(tab2)));
    }

}
