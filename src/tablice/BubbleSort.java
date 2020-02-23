package tablice;

import java.util.Arrays;

public class BubbleSort {
    static int[] tab = new int[]{3, 5, 7, 2, 1};

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sort(tab)));
    }

    static int[] sort(int[] tab) {
        int temp;
        int j = 1;
        while (tab[j - 1] > tab[j]) {
            for (int i = 1; i < tab.length; i++) {
                if (tab[i - 1] > tab[i]) {
                    temp = tab[i - 1];
                    tab[i - 1] = tab[i];
                    tab[i] = temp;
                }
            }
            j++;
        }
        return tab;
    }
}
