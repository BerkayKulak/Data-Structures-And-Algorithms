package recursions;

public class productOfArray {


    public static void main(String[] args)
    {

        System.out.println(multiply(arr,
                arr.length - 1));
    }

    static int arr[] = {1, 2, 3, 4, 5, 6};
    static int multiply(int a[], int n)
    {
        if (n == 0)
            return(a[n]);
        else
            return (a[n] * multiply(a, n - 1));
    }

}
