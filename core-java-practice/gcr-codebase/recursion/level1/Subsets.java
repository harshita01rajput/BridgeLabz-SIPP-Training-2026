import java.util.ArrayList;
import java.util.List;

public class Subsets {
    static void gen(int[] arr, int i, List<Integer> cur, List<List<Integer>> res) {
        if (i == arr.length) {
            res.add(new ArrayList<>(cur));
            return;
        }
        gen(arr, i + 1, cur, res);
        cur.add(arr[i]);
        gen(arr, i + 1, cur, res);
        cur.remove(cur.size() - 1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2};
        List<List<Integer>> res = new ArrayList<>();
        gen(arr, 0, new ArrayList<>(), res);
        for (List<Integer> subset : res)
            System.out.println(subset);
    }
}
