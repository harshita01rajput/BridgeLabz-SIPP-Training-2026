package Methods.level3;
public class NumberChecker2 {
    public static void main(String[] args) {

        int n = 21;
        int temp = n, sum = 0;

        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }

        System.out.println("Harshad = " + (n % sum == 0));
    }
}