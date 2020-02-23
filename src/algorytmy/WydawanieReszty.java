package algorytmy;

public class WydawanieReszty {
    public static void main(String[] args) {

        wydaj(259);
    }

    private static int[] nominaly = new int[]{100, 50, 20, 10, 5, 2, 1};

    private static void wydaj(int kwota) {
        for (int i = 0; i < nominaly.length; i++) {
            while (nominaly[i] <= kwota) {
                System.out.println(nominaly[i]);
                kwota -= nominaly[i];
            }
        }
    }
}
