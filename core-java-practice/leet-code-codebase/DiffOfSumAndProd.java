class DiffOfSumAndProd{
	public static void main(String[] args){
		int n = 3696;
		int sum = 0;
		int pro = 1;
		
		while(n>0){
			int digit = n%10;
			sum += digit;
			pro *= digit;
			n = n/10;
		}
		System.out.println(pro-sum);
	}
}