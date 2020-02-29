package list;

public class Program {

    public static void main(String[] args) {

        List list = new List();

        for (int i = 1; i <= 10; i++) {
            list.add(new Element(i));
        }

        Element element = list.getHead();

        do {

            System.out.println(element);
            element = element.getNext();

        } while (element.getNext() != null);


    }
}
