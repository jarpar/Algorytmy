package homework;

public class HanoiByRecursive {
    public static void move(int n, char start, char middle, char end) {
        if (n == 1) {
            System.out.println("Element 1 from " + start + " to " + end);
            return;
        }
        move(n - 1, start, end, middle);
        System.out.println("Element " + n + " from " + start + " to " + end);
        move(n - 1, middle, start, end);
    }

    public static void main(String[] args) {
        move(3, 'A', 'B', 'C');
    }
}

/*
/usr/lib/jvm/java-11-openjdk-amd64/bin/java
Element 1 from A to C
Element 2 from A to B
Element 1 from B to C
Element 3 from A to B
Element 1 from B to C
Element 2 from B to A
Element 1 from A to C

Process finished with exit code 0
 */