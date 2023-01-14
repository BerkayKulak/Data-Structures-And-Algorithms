package timeComplexity;

public class fibonacci {
    public static void main(String[] args) {
        fibonacci fibonacci = new fibonacci();
        fibonacci.allFib(5);
    }

    void allFib(int n) {
        for (int i = 0; i < n; i++) {
            fib(i);
        }
    }

    static int fib(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }
}
