/* 5. Napisz program obliczający silnię bez użycia rekurencji
 */

package homework;

public class Factorial {
    private static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int f = 1;
        for (int i = 2; i <= n; i++) {
            f *= i;
        }
        return f;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("Factorial " + i + "! = " + factorial(i));
        }
    }
}
/*
/usr/lib/jvm/default-java/bin/java
Factorial 0! = 1
Factorial 1! = 1
Factorial 2! = 2
Factorial 3! = 6
Factorial 4! = 24
Factorial 5! = 120
Factorial 6! = 720
Factorial 7! = 5040
Factorial 8! = 40320
Factorial 9! = 362880

Process finished with exit code 0
 */