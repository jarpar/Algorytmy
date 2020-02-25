package homework;

public class HanoiByRecursive {
    public static void move(int n, char start, char middle, char end) {
        if (n == 1) {
            System.out.println("Element 1 from " + start + " to " + end);
            return;
        }
        move(n - 1, start, middle, end);
        System.out.println("Element " + n + " from " + start + " to " + middle);
        move(n - 1, middle, start, end);
    }

    public static void main(String[] args) {
        move(3, 'A', 'B', 'C');
    }
}
