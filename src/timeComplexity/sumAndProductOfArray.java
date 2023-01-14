package timeComplexity;

public class sumAndProductOfArray {
    public static void main(String[] args) {
        sumAndProductOfArray sumAndProductOfArray = new sumAndProductOfArray();
        int[] customArray = { 1, 2, 3, 4, 5 };
        sumAndProductOfArray.spofArray(customArray);

    }

    void spofArray(int[] array) {
        int sum = 0;
        int product = 1;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        for (int i = 0; i < array.length; i++) {
            product *= array[i];
        }

        System.out.println(sum + " " + product);

    }

}
