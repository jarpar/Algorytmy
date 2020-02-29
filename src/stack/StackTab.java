package stack;

public class StackTab {
    int[] stack;
    int size;
    int index = 0;

    public StackTab(int size) {
        stack = new int[size];
    }

    public int pop() throws Exception {//zwraca i usuwa
        if (index < 0) {
            throw new Exception("can't pop previous value");
        }
        int temp;
        for (int i = 0; i < stack.length; i++) {
            if (i != index) {
                temp = stack[i];
                stack[i] = temp;
            }
        }
        index--;
        return stack[index];
    }

    public int peek() throws Exception {//tylko zwraca
        if (index < 1) {
            throw new Exception("can't peek previous value");
        }
        return stack[index - 1];
    }

    public int search(int value) {
        for (int i = 0; i < index; i++) {
            if (stack[i] == value) {
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

    public void print() {
        for (int i = 0; i < index; i++) {
            System.out.print(stack[i] + " ");
        }
    }
}

class test {
    public static void main(String[] args) throws Exception {
        StackTab stackTab = new StackTab(10);
        stackTab.push(1);
        stackTab.push(2);
        stackTab.push(4);
        stackTab.push(3);
        stackTab.push(5);
        stackTab.print();
        System.out.println();
        System.out.println("searched 3 is at index:");
        System.out.println(stackTab.search(3));
        System.out.println("searched 4 is at index:");
        System.out.println(stackTab.search(4));
        System.out.println();
        System.out.println(stackTab.peek());
        System.out.println(stackTab.pop());
        System.out.println(stackTab.peek());
        stackTab.push(6);
        System.out.println(stackTab.peek());
        System.out.println(stackTab.pop());
        System.out.println(stackTab.peek());
        System.out.println(stackTab.pop());
        System.out.println(stackTab.peek());
        System.out.println(stackTab.pop());
        System.out.println(stackTab.peek());
        System.out.println(stackTab.pop());
        System.out.println(stackTab.peek());
        System.out.println(stackTab.pop());
        System.out.println(stackTab.peek());
    }
}
