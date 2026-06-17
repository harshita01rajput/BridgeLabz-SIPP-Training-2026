package Methods.level3;

import java.util.*;

public class FootballTeamStats {
    public static void main(String[] args) {
        int[] h = new int[11];
        Random r = new Random();

        int sum = 0, min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;

        for (int i = 0; i < h.length; i++) {
            h[i] = r.nextInt(101) + 150;
            sum += h[i];
            min = Math.min(min, h[i]);
            max = Math.max(max, h[i]);
        }

        System.out.println(Arrays.toString(h));
        System.out.println("Shortest = " + min);
        System.out.println("Tallest = " + max);
        System.out.println("Mean = " + (double) sum / h.length);
    }
}