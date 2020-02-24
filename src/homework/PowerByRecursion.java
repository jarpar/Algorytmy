/*
3. PowerByRecursion
        Napisz funkcję potęgowania z użyciem rekurencji
*/

package homework;

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
/*
/usr/lib/jvm/default-java/bin/java
8

Process finished with exit code 0
 */