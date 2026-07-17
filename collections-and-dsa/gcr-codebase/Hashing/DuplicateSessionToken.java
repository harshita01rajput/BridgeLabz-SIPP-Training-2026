import java.util.HashSet;

public class DuplicateSessionToken {

    public static boolean hasDuplicate(String[] tokens) {
        HashSet<String> set = new HashSet<>();

        for (String token : tokens) {
            if (!set.add(token)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String[] tokens = {
                "TOKEN1",
                "TOKEN2",
                "TOKEN3",
                "TOKEN1"
        };

        System.out.println(hasDuplicate(tokens));
    }
}