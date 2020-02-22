package algorytmy;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        int n;
        while (scanner.hasNextInt()) {
            n = scanner.nextInt();
            if (n == 0) {
                break;
            } else a += n;
        }
        System.out.println(a);
    }
}
