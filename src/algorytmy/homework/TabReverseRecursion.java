package algorytmy.homework;

public class TabReverseRecursion {
    private static int[] tab = new int[]{1, 2, 3, 4, 5};

    public static void main(String[] args) {
        for (int n : tab
        ) {
            System.out.print(n + " ");

        }

        reverse(tab);

        System.out.println("\nReversed:");

        for (int n : tab
        ) {
            System.out.print(n + " ");

        }
    }

    static int[] reverse(int[] tab) {
        int[] revTab = tab.clone();
        return revTab;
    }
}
