package algorytmy.homework;

import java.util.Arrays;

public class ArraySortAndFindByRecursion {

    public static void main(String[] args) {
        //int[] tab = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] tab = new int[]{4, 6, 2, 5, 8, 9, 1, 3, 7};
        Arrays.sort(tab);
        for (int i : tab) {
            System.out.print(i + " ");
        }
        System.out.println("\n" + search(tab, 6));
    }

    private static int search(int[] tab, int searchNum) {
        int left = 0;
        int right = tab.length - 1;

        while (left <= right) {
            int srodek = (left + right) / 2;

            if (tab[srodek] == searchNum) {
                return srodek;
            }
            if (tab[srodek] > searchNum) {
                right = srodek - 1;
            } else {
                left = srodek + 1;
            }
        }
        return -1;
    }
}