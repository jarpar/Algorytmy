/*
    7. Napisz program rekurencyjny sprawdzający, czy słowo jest palindromem
 */

package homework;

public class PalindromeCheckByRecursion {

    private static String palindrome(String s) {
        if (s.length() == 0) {
            return "yes";
        }
        if (s.length() <= 1) {
            return "yes";
        }
        if (s.charAt(0) == s.charAt(s.length() - 1)) {
            return palindrome(s.substring(1, s.length() - 1));
        }
        return "no";
    }

    public static void main(String[] args) {
        System.out.println(palindrome("kayak"));
        System.out.println(palindrome("test"));
        System.out.println(palindrome("anna"));
        System.out.println(palindrome("owocowo"));
        System.out.println(palindrome("imażami"));
        System.out.println(palindrome("a"));
        System.out.println(palindrome("dwawd"));
        System.out.println(palindrome("ojojo"));
        System.out.println(palindrome("kok"));
        System.out.println(palindrome("abba"));
        System.out.println(palindrome("notpalindrome"));
    }
}
/*
/usr/lib/jvm/java-1.11.0-openjdk-amd64/bin/java
yes
no
yes
yes
yes
yes
yes
yes
yes
yes
no

Process finished with exit code 0
 */