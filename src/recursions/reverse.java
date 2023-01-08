package recursions;

public class reverse {
    public static void main(String[] args) {
        reverse recursion = new reverse();
        var rec = recursion.reverse("berkay");
        System.out.println(rec);
    }

    public String reverse(String str)
    {
        if (str.isEmpty())
            return str;
        return reverse(str.substring(1)) + str.charAt(0);
    }
}
