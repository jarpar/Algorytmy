package algorytmy;

public class Dodawanie {
    public static void main(String[] args) {
        System.out.println(dodaj(4));
        System.out.println(dodajRek(4));
    }

    private static int dodaj(int liczba) {
        return 0;
    }

    private static int dodajRek(int liczba) {

        if (liczba == 0) {
            return 0;
        }
        return liczba + dodajRek(liczba - 1);
    }
}
