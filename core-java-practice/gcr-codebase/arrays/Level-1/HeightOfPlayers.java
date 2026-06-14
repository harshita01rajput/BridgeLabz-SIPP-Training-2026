import java.util.*;
public class HeightOfPlayers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Heights of the Players(11): ");
        int[] heights = new int[11];
        for(int i=0;i<11;i++){
            heights[i]=sc.nextInt();
        }
        int sum =0;
        for(int i=0;i<11;i++){
            sum += heights[i];
        }
        int mean = sum/11;
        System.out.println("The Mean Height of the football team: "+mean);
        sc.close();
    }
}
