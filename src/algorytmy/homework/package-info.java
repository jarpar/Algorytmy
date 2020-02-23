package algorytmy.homework;
/*Zadania rekurencja:

    1. ArrayReverseByRecursion
    Załóżmy, że chcemy odwrócić w sposób rekurencyjny tablicę liczb całkowitych. Zaproponuj algorytm z użyciem
    rekurencji, który wykona to zadanie

    2. ArraySortAndFindByRecursion
    Powróćmy do problemu poszukiwania pewnej zadanej liczby x w tablicy, tym razem jednak posortowanej od wartości
    minimalnych do maksymalnych. Metoda poszukiwania, bardzo znana i efektywna (tzw. przeszukiwanie binarne),
    polega na poniższej obserwacji
            Sprawdź środkowy element tablicy o rozmiarze
            Jeśli x = t[n/2] to element x został znaleziony
            Jeśli x < t[n/2] to element x być może znajduje się w lewej połowie tablicy – przeanalizuj ją
            Jeśli x > t[n/2] to element x być może znajduje się w prawej połowie tablicy – przeanalizuj ją
            Zadanie polega na napisaniu rekurencyjnej funkcji realizującej powyższy algorytm

    3. PowerByRecursion
    Napisz funkcję potęgowania z użyciem rekurencji

    4. ConvertToBinaryByRecursion
    Napisz funkcję, która otrzymując liczbę całkowitą dodatnią, wypisze jej reprezentację dwójkową. Należy
    wykorzystać algorytm dzielenia przez podstawę systemu

            Przykładowo zamieńmy liczbę 13 na jej postać binarną

            13 : 2 = 6 + 1
            6 : 2 = 3 + 0
            3 : 2 = 1 + 1
            1 : 2 = 0 + 1

    5. Napisz program obliczający silnię bez użycia rekurencji

    6. Napisz program rekurencyjny obliczający sumę kolejnych liczb naturalnych


    7. Napisz program rekurencyjny sprawdzający, czy słowo jest palindromem

    8. Napisz program sumujące ze sobą dwie tablice o tej samej długości

    9. Napisz program realizujący wieże Hanoi

*/