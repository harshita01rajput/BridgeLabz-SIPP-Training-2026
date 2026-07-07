import java.util.Arrays;

public class BubbleSortStudentMarks {

    public static void bubbleSort(int[] marks) {

        int n = marks.length;

        for (int i = 0; i < n - 1; i++) {

            boolean swapped = false;

            for (int j = 0; j < n - i - 1; j++) {

                if (marks[j] > marks[j + 1]) {
                    int temp = marks[j];
                    marks[j] = marks[j + 1];
                    marks[j + 1] = temp;
                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }
        }
    }

    public static void main(String[] args) {

        int[] marks = {78, 45, 90, 67, 82, 55};

        System.out.println("Before Sorting:");
        System.out.println(Arrays.toString(marks));

        bubbleSort(marks);

        System.out.println("After Sorting:");
        System.out.println(Arrays.toString(marks));
    }
}