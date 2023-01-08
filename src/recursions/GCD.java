package recursions;

public class GCD {
    public static void main(String[] args) {
        GCD recursion = new GCD();
        var rec = recursion.gcd(8,12);
        System.out.println(rec);
    }

    public int gcd(int a,int b){
        if(a<0 || b<0){
            return -1;
        }
        if(b ==0){
            return a;
        }
        return gcd(b,a%b);
    }
}
