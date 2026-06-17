package Methods.level3;
public class NumberChecker4 {

    static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++)
            if (n % i == 0) return false;
        return true;
    }

    public static void main(String[] args) {
        int n = 7;

        System.out.println("Prime = " + isPrime(n));
        System.out.println("Buzz = " + (n % 7 == 0 || n % 10 == 7));
    }
}
