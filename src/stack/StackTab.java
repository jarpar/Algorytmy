package stack;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StackTab {
    int[] stack;
    int size;
    int index = 0;

    public StackTab(int size) {
        stack = new int[size];
    }

    public int pop() {//zwraca i usuwa
        int temp = stack[index];
        stack[index] = stack[index + 1];
        return temp;
    }

    public int peek() {//tylko zwraca
        return stack[index];
    }

    public int search(int value) {
        for (int i = 0; i < stack.length; i++) {
            if (i == value) {
                return i;
            }
        }
        return -1;
    }

    public int push(int value) {//dokłada na stos
        stack[index] = value;
        return stack[index];
    }

    public int getSize() {
        int tempSize = 0;
        for (int i : stack)
            tempSize++;
        return tempSize;
    }
}
