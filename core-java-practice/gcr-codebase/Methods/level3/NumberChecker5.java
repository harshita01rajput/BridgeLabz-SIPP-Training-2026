package Methods.level3;
public class NumberChecker5 {

    public static void main(String[] args) {

        int n = 28;
        int sum = 0;

        for (int i = 1; i < n; i++)
            if (n % i == 0)
                sum += i;

        System.out.println("Perfect = " + (sum == n));
        System.out.println("Abundant = " + (sum > n));
        System.out.println("Deficient = " + (sum < n));
    }
}
