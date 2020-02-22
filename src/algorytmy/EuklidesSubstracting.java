package algorytmy;

import java.util.Scanner;

public class EuklidesSubstracting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 378;//scanner.nextInt();
        int b = 214;// scanner.nextInt();
        int count = 0;
        while (a != b) {
            count++;
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        System.out.println(a);
        System.out.println(count);
    }
}
