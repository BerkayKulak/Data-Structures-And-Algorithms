package arrayInterviewQuestions;

public class findNumberQuestion {
    public static void main(String[] args) {
        findNumberQuestion mn = new findNumberQuestion();
        int[] intArray = {1,2,3,4,5,6};
        mn.linearSearch(intArray, 4);
    
      }
    
      // Search Method
      public void linearSearch(int[] intArray, int value) {
        for(int i=0; i<intArray.length; i++) {
          if (intArray[i] == value) {
            System.out.println("Value is found at the index of " + i);
            return;
          }
        }
        System.out.println(value + " is not found");
      }
}
