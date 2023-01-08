package recursions;

public class decimalToBinary {
    public static void main(String[] args) {
        decimalToBinary recursion = new decimalToBinary();
        var rec = recursion.decimalToBinary(10);
        System.out.println(rec);
    }

    public int decimalToBinary(int n){
        if(n==0){
            return 0;
        }
        return n%2 + 10*decimalToBinary(n/2);
    }
}
