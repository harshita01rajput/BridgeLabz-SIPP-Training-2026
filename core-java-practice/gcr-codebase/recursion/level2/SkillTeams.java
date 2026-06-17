import java.util.ArrayList;
import java.util.List;

public class SkillTeams {
    static void find(int[] arr, int i, int target, List<Integer> cur, List<List<Integer>> res) {
        if (target == 0) {
            res.add(new ArrayList<>(cur));
            return;
        }
        if (i == arr.length || target < 0) return;
        find(arr, i + 1, target, cur, res);
        cur.add(arr[i]);
        find(arr, i + 1, target - arr[i], cur, res);
        cur.remove(cur.size() - 1);
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 7};
        int target = 10;
        List<List<Integer>> res = new ArrayList<>();
        find(arr, 0, target, new ArrayList<>(), res);
        for (List<Integer> team : res)
            System.out.println(team);
    }
}
