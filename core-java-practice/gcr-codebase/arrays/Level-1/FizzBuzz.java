import java.util.*;
public class FizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number:");
        int n = sc.nextInt();
        List<String> ans = new ArrayList<>();
        for(int i=1; i<=n; i++)
        {
            if(i%3==0 && i%5==0)
            {
                ans.add("FizzBuzz");
            }
            else if(i%3==0)
            {
                ans.add("Fizz");
            }
            else if (i%5==0)
            {
                ans.add("Buzz");
            }
            else{
                ans.add(String.valueOf(i));
            }
        }
        System.out.println(ans);
        sc.close();
    }
}
