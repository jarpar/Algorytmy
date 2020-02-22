package algorytmy;

public class Dodawanie {
    public static void main(String[] args) {
        System.out.println(dodaj(4));
        System.out.println(dodajRek(4));
        System.out.println(silniaRek(4));
    }

    private static int dodaj(int liczba) {
        int sum = 0;
        int i = 0;
        while (i <= liczba) {
            sum += i;
            i++;
        }
        return sum;
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
