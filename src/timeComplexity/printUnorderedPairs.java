package timeComplexity;

public class printUnorderedPairs {

    public static void main(String[] args) {
        printUnorderedPairs printPairsMethod = new printUnorderedPairs();
        int[] customArray = { 1, 2, 3, 4, 5 };
        printPairsMethod.printUnorderedPairs(customArray);
    }

    void printUnorderedPairs(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                System.out.println(array[i] + ", " + array[j]);
            }
        }
    }

}
