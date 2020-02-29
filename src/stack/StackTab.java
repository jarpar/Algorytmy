package stack;

public class StackTab {
    int[] stack;
    int size;
    int index = 0;

    public StackTab(int size) {
        stack = new int[size];
    }

    public int pop() {//zwraca i usuwa
        int temp;
        for (int i = 0; i < stack.length; i++) {
            if (i != index) {
                temp = stack[i];

            }
        }
        index--;
        return stack[index];
    }

    public int peek() {//tylko zwraca
        return stack[index - 1];
    }

    public int search(int value) {
        for (int i = 0; i < stack.length; i++) {
            if (i == value) {
                return i;
            }
        }
        return -1;
    }

    public void push(int value) throws Exception {//dokłada na stos
        if (index >= stack.length) {
            throw new Exception("can't add next value");
        }
        stack[index] = value;
        index++;
        //return value;
    }

    public int getSize() {
        int tempSize = 0;
        for (int i : stack)
            tempSize++;
        return tempSize;
    }
}

class test {
    public static void main(String[] args) throws Exception {
        StackTab stackTab = new StackTab(10);
        stackTab.push(1);
        stackTab.push(2);
        stackTab.push(3);
        stackTab.push(4);
        stackTab.push(5);
        System.out.println(stackTab.peek());
        System.out.println(stackTab.pop());
        System.out.println(stackTab.peek());
        stackTab.push(6);
        System.out.println(stackTab.peek());
        System.out.println(stackTab.pop());
        System.out.println(stackTab.peek());
    }
}
