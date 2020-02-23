/*
4. Napisz funkcję, która otrzymując liczbę całkowitą dodatnią, wypisze jej reprezentację dwójkową.
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

        System.out.println(convert(0));
        binary.clear();

        System.out.println(convert(1));
        binary.clear();

        System.out.println(convert(2));
        binary.clear();

        System.out.println(convert(4));
        binary.clear();

        System.out.println(convert(8));

    }

    private static ArrayList<Integer> binary = new ArrayList<>();

    public static ArrayList<Integer> convert(int val) {

        if (val > 0 && val % 2 == 0) {
            binary.add(0);
            return convert(val / 2);
        } else if (val % 2 == 1) {
            binary.add(1);
            return convert(val / 2);
        }
        if (binary.isEmpty()) {
            binary.add(0);
        } else {
            Collections.reverse(binary);
        }
        return binary;
    }
}

/*
/usr/lib/jvm/default-java/bin/java
[1, 1, 0, 1]
[0]
[1]
[1, 0]
[1, 0, 0]
[1, 0, 0, 0]

Process finished with exit code 0
 */