//not finnished yet!
package algorytmy.homework;

import java.util.Arrays;

public class ArraySortAndFindByRecursion {
    private static int[] tab = new int[]{4, 6, 2, 5, 8, 9, 1, 3, 7};

    public static void main(String[] args) {
        Arrays.sort(tab);
    }

    static int sortTab(int[] tab, int find) {
        int tempFind = 0;
        int place = 0;
        if (tempFind == find) {
            return place;
        }
        if (find == tab[tab.length / 2]) {
            return tab.length / 2;
        } else if (find < tab[tab.length / 2]) {
            return place = tab.length / 2;
        } else if (find > tab[tab.length / 2]) {
            return place = tab.length / 2;
        }
        return sortTab(tab, find);
    }
}