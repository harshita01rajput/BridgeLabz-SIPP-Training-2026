public class Palindrome {
    static boolean isPal(String s, int l, int r) {
        if (l >= r) return true;
        if (s.charAt(l) != s.charAt(r)) return false;
        return isPal(s, l + 1, r - 1);
    }

    public static void main(String[] args) {
        String s = "madam";
        if (isPal(s, 0, s.length() - 1))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}
