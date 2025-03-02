class PatternNum1{
	public static void main(String[] args) {
		int n=5;
		int a=1;
		for (int i=1;i<=n ;i++ ) 
		{
			int num=a;
			for (int j=1;j<=i ;j++ ) {
				System.out.print(num--+" ");
			}
			a+=(i+1);
			System.out.println();
		}
	}
}