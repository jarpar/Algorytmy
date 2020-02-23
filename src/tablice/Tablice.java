package tablice;

public class Tablice {
    public static void main(String[] args) {
        revVals(theVals);
    }

    private static void revVals(float[] theVals) {
        for (int i = 0; i < theVals.length; i++) {
            System.out.print((revVals[i] = theVals[theVals.length - i - 1]) + " ");
        }
    }

    private static float[] theVals = {10.0f, 20.0f, 30.0f};
    private static float[] revVals = new float[theVals.length];

}
