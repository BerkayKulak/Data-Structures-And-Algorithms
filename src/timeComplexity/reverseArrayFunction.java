package timeComplexity;

import java.util.Arrays;

public class reverseArrayFunction {
    public static void main(String[] args) {
        reverseArrayFunction reverseArrayFunction = new reverseArrayFunction();
        String[] customArray = { "1", "2", "3", "4", "5" };
        reverseArrayFunction.reverse(customArray);

    }

    void reverse(String[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            var other = array.length - i - 1;
            var temp = array[i];
            array[i] = array[other];
            array[other] = temp;
        }

        System.out.println(Arrays.toString(array));
    }

}
