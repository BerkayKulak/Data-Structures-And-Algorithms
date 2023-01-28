package arrayInterviewQuestions;

import java.util.Arrays;

public class middleFunctionQuestion {

    public static void main(String[] args) {
        middleFunctionQuestion mn = new middleFunctionQuestion();
        int[] intArray = {10,60,30,40,50};
        System.out.println(Arrays.toString(mn.middle(intArray)));
    
      }

    static int[] middle(int[] arr) {
        return Arrays.copyOfRange(arr, 1, arr.length-1); 
    }
}
