package tablice;

import java.util.Arrays;

public class TabHelper {
    static int[] swap(int[] tab, int a, int b) {
        int[] swappedTab = tab.clone();
        swappedTab[a] = tab[b];
        swappedTab[b] = tab[a];
        return swappedTab;
    }

    public static void main(String[] args) {
        int[] tab = new int[]{1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(swap(tab, 0, 4)));
    }
}
