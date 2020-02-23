/*4. Napisz funkcję, która otrzymując liczbę całkowitą dodatnią, wypisze jej reprezentację dwójkową.
Należy wykorzystać algorytm dzielenia przez podstawę systemu

            Przykładowo zamieńmy liczbę 13 na jej postać binarną

            13 : 2 = 6 + 1
            6 : 2 = 3 + 0
            3 : 2 = 1 + 1
            1 : 2 = 0 + 1

*/

package algorytmy.homework;

import java.util.ArrayList;
import java.util.Collections;

public class ConvertToBinaryByRecursion {

    public static void main(String[] args) {

        //convert(13);
        System.out.println(convert(13));
        binary.clear();
        System.out.println(convert(23));
        binary.clear();

        System.out.println(convert(100));
        binary.clear();

        System.out.println(convert(0));
        binary.clear();

        System.out.println(convert(1));
        binary.clear();

    }

    private static ArrayList<Integer> binary = new ArrayList<Integer>();

    public static ArrayList<Integer> convert(int val) {
        if (val == 0) {
            binary.add(0);
            Collections.reverse(binary);
        } else if (val % 2 == 0) {
            binary.add(0);
            return convert(val / 2);
        } else if (val % 2 == 1) {
            binary.add(1);
            return convert(val / 2);
        }
        return binary;
    }
}