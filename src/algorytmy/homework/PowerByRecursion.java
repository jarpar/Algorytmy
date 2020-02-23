package algorytmy.homework;

public class PowerByRecursion {
    public static void main(String[] args) {
        System.out.println(pow(2, 3));
    }

    private static int pow(int a, int n) {
        if (n == 0) {
            return 1;
        }
        return (a * pow(a, n - 1));
    }
}