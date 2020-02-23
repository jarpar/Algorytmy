/*
2. ArraySortAndFindByRecursion
        Powróćmy do problemu poszukiwania pewnej zadanej liczby x w tablicy, tym razem jednak posortowanej od wartości
        minimalnych do maksymalnych. Metoda poszukiwania, bardzo znana i efektywna (tzw. przeszukiwanie binarne),
        polega na poniższej obserwacji
        Sprawdź środkowy element tablicy o rozmiarze
        Jeśli x = t[n/2] to element x został znaleziony
        Jeśli x < t[n/2] to element x być może znajduje się w lewej połowie tablicy – przeanalizuj ją
        Jeśli x > t[n/2] to element x być może znajduje się w prawej połowie tablicy – przeanalizuj ją
        Zadanie polega na napisaniu rekurencyjnej funkcji realizującej powyższy algorytm
 */

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