import java.util.*;
class Calculator{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		float num1 = sc.nextInt();
		float num2 = sc.nextInt();
		
		float sum = num1+num2;
		System.out.println("Addition: " + sum);
		
		float sub = num1-num2;
		System.out.println("Subtract: " + sub);
		
		float mul = num1*num2;
		System.out.println("Multiplication: " + mul);
		
		float div = num1/num2;
		System.out.println("Division: " + div);
	}
}