public class SumOfN {
    static int sum(int n) {
        if (n == 0) return 0;
        return n + sum(n - 1);
    }

    public static void main(String[] args) {
        int N = 5;
        System.out.println(sum(N));
    }
}
