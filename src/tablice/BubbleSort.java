package tablice;

public class BubbleSort {

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
