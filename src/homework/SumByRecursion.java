/*
6. Napisz program rekurencyjny obliczający sumę kolejnych liczb naturalnych
 */

package homework;

public class SumByRecursion {
    private static int sum;

    private static int add(int start, int end) {
        if (start <= end) {
            sum += start;
            start++;
            return add(start, end);
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(add(0, 5));

    }
}
