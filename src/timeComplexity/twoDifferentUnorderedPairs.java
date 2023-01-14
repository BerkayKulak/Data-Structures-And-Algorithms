package timeComplexity;

public class twoDifferentUnorderedPairs {

    public static void main(String[] args) {
        twoDifferentUnorderedPairs printPairsMethod = new twoDifferentUnorderedPairs();
        int[] customArray = { 1, 2, 3, 4, 5 };
        int[] customArray2 = { 1, 2, 3, 4, 5 };
        printPairsMethod.twoDifferentUnorderedPairs(customArray, customArray2);
    }

    void twoDifferentUnorderedPairs(int[] arrayA, int[] arrayB) {
        for (int i = 0; i < arrayA.length; i++) {
            for (int j = 0; j < arrayB.length; j++) {
                if (arrayA[i] < arrayB[j]) {
                    System.out.println(arrayA[i] + ", " + arrayB[j]);
                }
            }
        }
    }
}
