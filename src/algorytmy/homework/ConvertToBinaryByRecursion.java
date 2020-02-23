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
import java.util.Arrays;

public class ConvertToBinaryByRecursion {

    public static void main(String[] args) {
        Arrays.toString(convert(13).toArray());
    }

    public static ArrayList<Integer> binary = new ArrayList<Integer>();

    public static ArrayList convert(int val) {
        while (val > 0) {
            if (val % 2 == 0) {
                binary.add(1);
                return convert((val / 2));
            }
            if (val % 2 == 1) {
                binary.add(0);
                return convert((val / 2));
            }
        }
        return binary;
    }
}