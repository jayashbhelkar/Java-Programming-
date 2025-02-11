import java.util.Scanner;
class PhonePassword{
	public static void main(String[] args) throws InterruptedException 
	{
		Scanner sc=new Scanner(System.in);
		int storepin=424;
		int seconds=5000;

		outerLoop:
		for (; ; ) 
		{
			int attemps=3;

			do{
				System.out.print("Enter The Mobile Pin: ");
				int pin=sc.nextInt();

				if (storepin==pin) {
					System.out.println("Phone Unlocked!");
					break outerLoop;
					
				}
				else {
					System.out.println("Wrong Pin!");
					System.out.println("Attemps Left: "+ (attemps-1));

				}
				attemps--;
			}
			while (attemps>=1); 


			System.out.println();
		    System.out.println("Phone Is Desabled For "+ (seconds/1000)+" Seconds");
		    Thread.sleep(seconds);
		    seconds*=2;
		    System.out.println();

			
		}
	}
}