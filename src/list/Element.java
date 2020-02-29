package list;

public class Element {
    private Element next;
    private Element prev;
    private int value;

    public void add(Element element){
        if (head == null){
            head = element;
            tail = element
        }
    }
}
