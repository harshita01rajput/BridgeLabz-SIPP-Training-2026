import java.util.*;

public class CheckNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array of length 5: ");
        int[] arr = new int[5];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        PosZerNeg(arr);
        EvenOdd(arr);
        Compare(arr);
        sc.close();
    }

    public static void EvenOdd(int[]arr){
        for(int i=0;i<5;i++){
            if(arr[i]%2==0){
                System.out.println("Even");
            }
            else{
                System.out.println("Odd");
            }
        }
        return ;
    }

    public static void Compare(int[]arr){
        int a =arr[0];
        int b =arr[arr.length-1];
        if(a==b){
            System.out.println("Equal");
        }
        else if(a>b){
            System.out.println("a is greater");
        }
        else{
            System.out.println("b is greater");
        }
    }

    public static void PosZerNeg(int[]arr){
        for(int i=0;i<5;i++){
            if(arr[i]>0){
                System.out.println("Positive");
            }
            else if(arr[i]==0){
                System.out.println("Zero");
            }
            else{
                 System.out.println("Negative");
            }
        }
    }
}
