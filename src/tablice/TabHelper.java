package tablice;

import java.util.Arrays;

public class TabHelper {
    public static int[] swap(int[] tab) {
        int buff;

        for (int i = 1; i < tab.length; i++) {
            buff = tab[i];
            int count = i;
            while (count > 0 && tab[count - 1] > buff) {
                tab[count] = tab[count - 1];
                tab[count - 1] = buff;
                count--;
            }
        }
        return tab;
    }

    public static void main(String[] args) {
        int[] tab = new int[]{3, 2, 5, 2, 1, 7, 8, 9, 11, 1, 3, 2, 5, 4};
        System.out.println(Arrays.toString(swap(tab)));
    }
}
