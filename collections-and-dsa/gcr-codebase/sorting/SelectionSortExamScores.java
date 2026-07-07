import java.util.Arrays;

public class SelectionSortExamScores {

    public static void selectionSort(int[] scores) {

        int n = scores.length;

        for (int i = 0; i < n - 1; i++) {

            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (scores[j] < scores[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = scores[i];
            scores[i] = scores[minIndex];
            scores[minIndex] = temp;
        }
    }

    public static void main(String[] args) {

        int[] scores = {78, 45, 90, 67, 82, 55};

        System.out.println("Before Sorting:");
        System.out.println(Arrays.toString(scores));

        selectionSort(scores);

        System.out.println("After Sorting:");
        System.out.println(Arrays.toString(scores));
    }
}