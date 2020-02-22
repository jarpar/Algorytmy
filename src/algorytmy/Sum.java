package algorytmy;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        int n;
        while (scanner.hasNextInt()) {
            n = scanner.nextInt();
            if (n != 0) {
                a += n;
            } else {
                break;
            }
        }
        System.out.println(a);
    }
}
