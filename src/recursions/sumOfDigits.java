package recursions;

public class sumOfDigits {
    public static void main(String[] args) {
        sumOfDigits recursion = new sumOfDigits();
        var rec = recursion.sumOfDigits(112);
        System.out.println(rec);
    }

    public int sumOfDigits(int n){

        if(n==0 || n < 0){
            return 0;
        }
        return n%10 + sumOfDigits(n/10);
    }

}
