package Methods.level3;
import java.util.*;

public class NumberChecker1 {
    public static void main(String[] args) {
        int n = 153;
        String s = String.valueOf(n);

        System.out.println("Digits Count = " + s.length());

        int sum = 0;
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (char c : s.toCharArray()) {
            int d = c - '0';

            sum += Math.pow(d, s.length());

            if (d > largest) {
                secondLargest = largest;
                largest = d;
            } else if (d > secondLargest) {
                secondLargest = d;
            }
        }

        System.out.println("Armstrong = " + (sum == n));
        System.out.println("Largest = " + largest);
        System.out.println("Second Largest = " + secondLargest);
    }
}
