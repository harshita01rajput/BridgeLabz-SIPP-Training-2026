public class SensorReadings {
    static boolean isIncreasing(int[] arr, int i) {
        if (i == arr.length - 1) return true;
        if (arr[i] >= arr[i + 1]) return false;
        return isIncreasing(arr, i + 1);
    }

    public static void main(String[] args) {
        int[] a = {12, 15, 18, 22, 30};
        int[] b = {12, 15, 14, 22};
        System.out.println(isIncreasing(a, 0));
        System.out.println(isIncreasing(b, 0));
    }
}
