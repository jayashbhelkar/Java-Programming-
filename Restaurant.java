import java.util.*;
class Restaurant
{
	static String name;
	static long contact;
	static String address;
	static ArrayList<String> basket = new ArrayList<>();

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		for (; ; ) 
		{
			System.out.println();
			System.out.println("         JAVA KA DHABA");
			System.out.println();
			System.out.println("1. CREATE ACCOUNT");
			System.out.println(" 2. EXISISTING USER");
			System.out.println();
			System.out.print("Enter The Option : ");
			int opt=sc.nextInt();
			System.out.println();

			switch(opt)
			{
			 case 1 : createAccount(sc);break;
			 case 2 : login(sc);break;
			 default : System.out.println("INVALID OPTION");break;

			}
		}
	}
	public static void createAccount(Scanner sc) 
	{
		System.out.println("         REGISTRATION ");
		System.out.println();
		System.out.print(" Enter The Name : ");
		name=sc.next();
		System.out.print(" Enter The Phone Number : ");
		contact=sc.nextInt();
		System.out.print(" Enter The Address : ");
		address=sc.next();
		System.out.println();
		System.out.println("ACCOUNT CREATED SUCCESFFULLY");
	}
	public static void login(Scanner sc) 
	{
		if (name==null) 
		{
			System.out.println("CREATE YOUR ACCOUNT FIRST");
			return;// calling method (main)
		}
		System.out.println("            LOGIN");
		System.out.println();

		for (int attemp=3;attemp>=1 ;attemp-- ) 
		{
			System.out.print("Username : ");
			String username=sc.next();
			System.out.print(" Password : ");
			long phone=sc.nextLong();
			System.out.println();
			if (name.equals(username) && contact == phone) 
			{
				homePage(sc);
			}
			else
			{
				System.out.println("INVALID CRED");
				System.out.println("Attemps Left is "+(attemp-1));
				System.out.println();
			}
		}
		System.out.println("THANK YOU & NEVER VISIT AGAIN");
		System.exit(0);
	}
	public static void homePage(Scanner sc) 
	{
		for (; ; ) 
		{
			System.out.println();
		System.out.println("            HOME PAGE");
		System.out.println();
		System.out.println("1.Menu");
		System.out.println("2.Order");
		System.out.println("3.Table Booking");
		System.out.println("4.Logout");
		System.out.println();
		System.out.println("Enter The Option : ");
		int opt=sc.nextInt();

		switch (opt) 
		{
			case 1 : menu(sc);break;
			case 2 : order(sc);break;
			case 3 : table();break;
			case 4 : System.out.println("THANK YOU & VISIT AGAIN");
				System.exit(0);break;
			default : System.out.println("INVALID INPUT");break;

		}
	}
	}
	public static void menu(Scanner sc) 
	{
		for (; ; ) 
		{
			System.out.println();
			System.out.println("        MENU");
			System.out.println("101 : Butter_Panner = 450/-");
			System.out.println("102 : Palak_Panner = 350/-");
			System.out.println("103 : Mix_Veg = 270/-");
			System.out.println("104 : Kolhapuri_Veg = 240/-");
			System.out.println("105 : Roti = 45/-");
			System.out.println("106 : Exit Menu");
			System.out.println();
			System.out.print("Enter The Option(ID) :");
			int id = sc.nextInt();
			switch (id) 
			{
				case 101:{
					basket.add("101 : Butter_Panner = 450");
					System.out.println(" Butter_Panner Added Inside The Basket");
					break;
				}
				case 102:{
					basket.add("102 : Palak_Panner = 350");
					System.out.println("Palak_Panner Added Inside The Basket");
					break;
				}
				case 103:{
					basket.add("103 : Mix_Veg = 270");
					System.out.println(" Mix_Veg Added Inside The Basket");
					break;
				}
				case 104:{
					basket.add("104 : Kolhapuri_Veg = 240");
					System.out.println(" Kolhapuri_Veg Added Inside The Basket");
					break;
				}
				case 105:{
					basket.add("105 : Roti = 45");
					System.out.println(" Roti Added Inside The Basket");
					break;
				}
				case 106:{
					return;
				}
			}
		}
	}
	public static void order(Scanner sc) 
	{
		System.out.println();
		System.out.println("      ORDERS");
		System.out.println();
		if (basket.size()==0) {
			System.out.println("Basket Is Empty Add Food Items");
		}
		for (String foodItem : basket) {
			System.out.println(foodItem);
		}
		System.out.println();
		System.out.println("1. Cancel Order");
		System.out.println("2. Remove Food Item");
		System.out.println("3. Proceed To Payment");
		System.out.println();
		System.out.print("Enter The Option : ");
		int opt=sc.nextInt();
		System.out.println();
		switch (opt) 
		{
			case 1 : {
				System.out.println("Order Cancelled");
				basket.clear();
				break;
			}
		    case 2 : {
		    	System.out.println("Enter FoodID");
		    	int foodId=sc.nextInt();
		    	removeFoodId(foodId);
		    	break;
		    }
		    case 3 : {
		    	billGenerate();
		    }
		}
	}
	public static void removeFoodId(int foodId) 
	{
		ArrayList<String> dupBasket = new ArrayList<>(basket);
		int indx=0;
		boolean flag = false;
		for (int i = 0; i < dupBasket.size(); i++) 
		{
			String[] arr = dupBasket.get(i).split(" ");
			if (arr[0].equals(foodId+"")) 
			{
				dupBasket.remove(indx);
				flag=true;
				System.out.println("Food Item Removed");
			}
			indx++;
		}
		if (!flag) {
			System.out.println("Food Item Doesn't Exits In Basket");
		}
		basket=dupBasket;
	}
	public static void table() 
	{
		System.out.println();
		System.out.println("        TABLE BOOKING");
		System.out.println();
	}
	public static void billGenerate() 
	{
		double totalBill=0;
		for (String foodItem : basket) 
		{
			String [] arr=foodItem.split(" ");
			totalBill+=Double.parseDouble(arr[4]);
		}
		System.out.println("Total Bill : "+totalBill+"rs.");
	}
}