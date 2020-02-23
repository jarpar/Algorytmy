package tablice;

public class InsertSort {
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
}
