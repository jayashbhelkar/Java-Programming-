class Hockey2{
	public static void main(String[] args) 
	{
		String str="010011111110";
		System.out.println(str);
		boolean check1=str.contains("1111111");
		boolean check0=str.contains("0000000");
		System.out.println((check1||check0)?("Yes"):("No"));
	}
}