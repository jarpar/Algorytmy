package tablice;

public class Tablice {
    private static float[] theVals = {10.0f, 20.0f, 30.0f};
    private static float[] revVals = new float[theVals.length];

    public static void main(String[] args) {
        System.out.println("Dla tablicy:");
        for (float f : theVals
        ) {
            System.out.print(f + " ");
        }

        revVals(theVals);
        System.out.println("\nOdwrócona tablica to:");
        for (float f : theVals
        ) {
            System.out.print(f + " ");
        }
        System.out.println("\nSuma zmiennych tablicy:");
        System.out.print(sumVals(theVals));
        System.out.println("\nŚrednia tablicy:");
        System.out.println(meanVals(theVals));
    }

    private static float[] revVals(float[] theVals) {
        for (int i = 0; i < theVals.length; i++) {
            revVals[i] = theVals[theVals.length - i - 1];
        }
        return revVals;
    }

    private static float sumVals(float[] theVals) {
        float sum = 0;
        for (float f : theVals) {
            sum += f;
        }
        return sum;
    }

    private static float meanVals(float[] theVals) {
        float sum = 0;
        for (float f : theVals) {
            sum += f;
        }
        return sum / theVals.length;
    }
}
