class SwappingNumber 
{
	public static void main(String[] args) 
	{
		int A = 4;
		int B = 2;
		
		System.out.println("BEFORE SWAPPING");
		System.out.println("A:"+A);
		System.out.println("B:"+B);

		int temp = A;
		A= B;
		B= temp;


		System.out.println("AFTER SWAPPING");
		System.out.println("A:"+A);
		System.out.println("B:"+B);


	}
}
