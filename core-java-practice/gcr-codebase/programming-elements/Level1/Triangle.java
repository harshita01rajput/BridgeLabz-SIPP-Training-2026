import java.util.*;
class Triangle{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		float base = sc.nextInt();
		float height = sc.nextInt();
		
		double area = (0.5)*base*height;
		System.out.println("Ares is: "+area);
	}
}