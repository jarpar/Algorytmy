package homework;

import java.util.Arrays;

public class ArraysAdd {
    private static int[] array1 = new int[]{1, 2, 3, 4, 5};
    private static int[] array2 = new int[]{9, 8, 7, 6, 5};

    private static int[] add(int[] array1, int[] array2) {
        int[] sum = new int[array1.length];
        for (int i = 0; i < sum.length; i++) {
            sum[i] = array1[i] + array2[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(add(array1, array2)));
    }
}
