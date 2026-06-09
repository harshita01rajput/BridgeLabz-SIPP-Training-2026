class Palindrome{
	public static void main(String[] args){
		int x = 121;
		int real = x;
		int num = 0;
		if(x<0) System.out.print("False");
		while(x>0){
			int digit = x%10;
			num = num*10+digit;
			x = x/10;
		}
		System.out.println(real == num);
	}
}