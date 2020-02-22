package algorytmy.homework;

public class TabReverseRecursion {
    private static int[] tab = new int[]{1, 2, 3, 4, 5};

    public static void main(String[] args) {

        for (int n : tab
        ) {
            System.out.print(n + " ");
        }

        System.out.println("\nReversed:");

        for (int n : reverse(tab)
        ) {
            System.out.print(n + " ");
        }
    }

    private static int n = 0;
    private static int[] revTab = new int[tab.length];

    static int[] reverse(int[] tab) {
        if (n == tab.length) {
            return revTab;
        }
        revTab[n] = tab[tab.length - 1 - n];
        n++;
        return reverse(tab);
    }
}

/*
/usr/lib/jvm/java-1.11.0-openjdk-amd64/bin/java
1 2 3 4 5
Reversed:
5 4 3 2 1
Process finished with exit code 0
 */