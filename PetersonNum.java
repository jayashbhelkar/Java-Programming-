class PetersonNum{
	public static void main(String[] args) {
		int num=145 , sum=0;
		for (int i=num;i>0 ;i/=10 ) {
			int rem=i%10;
			int fact=1;
			for (int j=rem;j>0 ;j-- ) {
				fact*=j;
			}
			sum+=fact;
		}
		if (sum==num) {
			System.out.println(num+" Is Peterson Number");
		}
		else {
			System.out.println(num+" Is Not Peterson Number");
		}
	}
}