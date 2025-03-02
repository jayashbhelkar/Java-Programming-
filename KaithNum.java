class KaithNum{
	public static void main(String[] args) {
		int num=19;
		int dup=num;
		int len=0;
		int sum=0;
		boolean flag=true;

		//loop to get the lenght of number
		for (int i=num;i>0 ;i/=10 ) {
			len++;
		}
		//we use len as a size of array
		int [] arr= new int[len];

		//loop to store the init digit from a number
		for (int i=len-1;i>=0 ;i-- ) {
			arr[i]=(num%10);// stored inside array using index
			num/=10;// update the number
		}
		//infinite loop which will iterate
		for (; ; ) {
			//loop find the sum of digit
			for (int i=0;i<len ;i++ ) {
				sum+=arr[i];
			}
			//swapping of elements
			for (int i=1;i<len ;i++ ) {
				arr[i-1]=arr[i];
			}
			arr[len-1]=sum;

			if (dup==sum) {
				break;
			}
			if (sum>dup) {
				flag=false;
				break;
			}
			sum=0;
		}
		if (flag) {
			System.out.println(dup+" Is Kaith Number");
		}
		else {
			System.out.println(dup+" Is Not Kaith Number");
			
		}
	}
}