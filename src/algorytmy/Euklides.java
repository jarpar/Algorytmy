package algorytmy;

import java.util.Scanner;

public class Euklides {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 378;//scanner.nextInt();
        int b = 214;//scanner.nextInt();
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        System.out.println(a);
    }
}
