package recursions;

public class recursiveRange {
    public static void main(String[] args) {
        recursiveRange recursion = new recursiveRange();
        var rec = recursion.recursiveRange(3);
        System.out.println(rec);
    }
    public int recursiveRange(int num) {
        if (num<=0) {
            return 0;
        }
        return num + recursiveRange(num - 1);
    }

}
