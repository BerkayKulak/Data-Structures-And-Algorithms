package recursions;

public class upperCase {
    public static void main(String[] args) {
        upperCase recursion = new upperCase();
        var rec = recursion.first("berkayBB");
        System.out.println(rec);
    }

    public static char first(String str) {
        if(str.isEmpty()) {
            return ' ';
        }
        if (Character.isUpperCase(str.charAt(0))) {
            return str.charAt(0);
        }else {
            return first(str.substring(1, str.length()));
        }
    }
}
