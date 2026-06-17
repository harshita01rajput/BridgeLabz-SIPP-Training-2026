package Methods.level3;
public class NumberChecker3 {
    public static void main(String[] args) {

        int n = 121;
        int temp = n, rev = 0;

        while (temp > 0) {
            rev = rev * 10 + temp % 10;
            temp /= 10;
        }

        System.out.println("Palindrome = " + (n == rev));
    }
}
