package algorytmy;

public class Fibonacci {
    public static void main(String[] args) {
        for (int i = 0; i <= 19; i++) {
            System.out.println(mathFibo(i));
        }
    }

    static int mathFibo(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            n = mathFibo(n - 1) + mathFibo(n - 2);
        }
        return n;
    }
}
