package tablice;

import java.util.Arrays;

public class BubbleSort {
    //static int[] tab = new int[]{3, 5, 7, 2, 1};

    public static void main(String[] args) {
        int[] tab = new int[]{3, 5, 7, 2, 3, 4, 56, 3};
        System.out.println(Arrays.toString(sort(tab)));
    }

    static int[] sort(int[] tab) {
        int temp;
        for (int i = 0; i < tab.length; i++) {
            for (int j = 1; j < tab.length - i; j++) {
                if (tab[j - 1] > tab[j]) {
                    temp = tab[j];
                    tab[j] = tab[j - 1];
                    tab[j - 1] = temp;
                }
            }
        }
        return tab;
    }
}
