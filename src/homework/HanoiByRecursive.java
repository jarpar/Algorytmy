package homework;

public class HanoiByRecursive {
    public void move(int n, char start, char middle, char end) {
        if (n == 1) {
            System.out.println("char 1 from " + start + "to " + end);
            return;
        }
        move(n - 1, start, middle, end);
    }
}
