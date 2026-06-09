import java.util.*;
class Reverse {
    public static int reverse(int x) {
        int num = 0;
        while(x!=0){
            int digit = x%10;
            if((num>Integer.MAX_VALUE/10) || (num<Integer.MIN_VALUE/10)){
                return 0;
            }
            num = num*10+digit;
            x = x/10;
        }
        return num;
    }
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ans = reverse(n);
		System.out.println(ans);
	}
}