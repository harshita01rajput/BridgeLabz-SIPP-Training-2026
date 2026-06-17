package Methods.level3;

import java.util.*;

public class OTPGenerator {
    public static void main(String[] args) {

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < 10; i++) {
            int otp = (int)(Math.random() * 900000) + 100000;
            set.add(otp);
            System.out.println(otp);
        }

        System.out.println("All Unique = " + (set.size() == 10));
    }
}
