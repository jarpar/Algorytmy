/*
    7. Napisz program rekurencyjny sprawdzający, czy słowo jest palindromem
 */

package algorytmy.homework;

public class PalindromeCheckByRecursion {
    private static int count = 0;

    private static String palindrome(String s) {
        if (count == s.length() / 2) {
            return "yes";
        }
        if (s.charAt(count) == s.charAt(s.length() - count - 1)) {
            count++;
            return palindrome(s.substring(count, s.length() - count - 1));
        }
        return "no";
    }

    public static void main(String[] args) {
        System.out.println(palindrome("anna"));
    }
}
