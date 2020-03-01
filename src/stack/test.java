package stack;

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
