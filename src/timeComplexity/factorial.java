package timeComplexity;

public class factorial {
    public static void main(String[] args) {
        factorial factorial = new factorial();
        int[] customArray = { 1, 2, 3, 4, 5 };
        var a = factorial.factorial(5);
        System.out.println(a);
    }

    int factorial(int n) {
        if (n < 0) {
            return -1;
        } else if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
