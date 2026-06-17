public class ReverseString {
    static String reverse(String s) {
        if (s.isEmpty()) return "";
        return reverse(s.substring(1)) + s.charAt(0);
    }

    public static void main(String[] args) {
        String s = "hello";
        System.out.println(reverse(s));
    }
}
