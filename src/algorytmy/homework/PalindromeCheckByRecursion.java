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
        if (s.charAt(0) == s.charAt(s.length() - 1)) {
            count++;
            return palindrome(s.substring(1, s.length() - 1));
        }
        return "no";
    }

    public static void main(String[] args) {
        System.out.println(palindrome("kayak"));
        System.out.println(palindrome("test"));
        System.out.println(palindrome("anna"));
    }
}
