package algorytmy;

import java.util.Scanner;

public class EuklidesModulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 378;//scanner.nextInt();
        int b = 214;// scanner.nextInt();
        int c;
        int count = 0;
        while (b > 0) {
            count++;
            c = b;
            b = a % b;
            a = c;
        }
        System.out.println(a);
        System.out.println(count);
    }
}
