package Methods.level3;

public class FactorOperations {

    public static void main(String[] args) {

        int n = 12;
        int sum = 0;
        long product = 1;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
                sum += i;
                product *= i;
            }
        }

        System.out.println("\nSum = " + sum);
        System.out.println("Product = " + product);
    }
}
