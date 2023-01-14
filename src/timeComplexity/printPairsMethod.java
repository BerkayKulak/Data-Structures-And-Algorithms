package timeComplexity;

public class printPairsMethod {
    public static void main(String[] args) {
        printPairsMethod printPairsMethod = new printPairsMethod();
        int[] customArray = { 1, 2, 3, 4, 5 };
        printPairsMethod.printPairs(customArray);
    }

    void printPairs(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.println(array[i] + ", " + array[j]);
            }
        }
    }

}
