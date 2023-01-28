package arrayInterviewQuestions;

public class sumDiagonalQuestion {

    public static void main(String[] args) {
        sumDiagonalQuestion mn = new sumDiagonalQuestion();
        int[][] intArray = {{10,60,30,40,50},{10,60,30,40,50}};
        System.out.println(mn.sumDiagonal(intArray));
    
      }

    public static int sumDiagonal(int[][] a) {
        int sum = 0;
        for (int i=0; i<a.length;i++) {
            sum+= a[i][i];
        }
        return sum;
    }
}
