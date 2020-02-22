package algorytmy;

public class Dodawanie {
    public static void main(String[] args) {
        System.out.println(dodajRek(4));
        System.out.println(silniaRek(4));
    }

    private static int dodajRek(int liczba) {

        if (liczba == 0) {
            return 0;
        }
        return liczba + dodajRek(liczba - 1);
    }

    private static int silniaRek(int liczba) {

        if (liczba == 0) {
            return 1;
        }
        return liczba * silniaRek(liczba - 1);
    }
}
