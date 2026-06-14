import java.util.*;

public class StudentVote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int n = sc.nextInt();
        System.out.print("Enter the Array  Element of length 10: ");
        int[] arr = new int[10];
        for(int i=0; i<10; i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=18){
                System.out.println("Student can vote.");
            }
            else{
                System.out.println("Student can not vote.");
            }
        }
        sc.close();
    }
}
