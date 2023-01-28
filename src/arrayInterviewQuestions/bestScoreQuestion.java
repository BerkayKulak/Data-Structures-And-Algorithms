package arrayInterviewQuestions;

import java.util.Arrays;
import java.util.Collections;

public class bestScoreQuestion {
    public static void main(String[] args) {
        bestScoreQuestion mn = new bestScoreQuestion();
        Integer[] intArray = {10,60,30,40,50};
        String pairs = mn.firstSecond(intArray);
        System.out.println(pairs);
    
      }
    
    static String firstSecond(Integer[] myArray) {
        Integer[] arr = myArray;
        Arrays.sort(arr, Collections.reverseOrder());
        int first = arr[0];
        Integer second = null;
        for (int i=0; i<arr.length; i++) {
          if (arr[i] != first) {
            second = arr[i];
            break;  
          }
        }
        return first+" "+second;
 
  }
}
