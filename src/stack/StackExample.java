package stack;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Object> stack = new Stack<>();
        System.out.println(stack);
        stack.push(1);
        System.out.println(stack);
        stack.push(2);
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);
    }
}
