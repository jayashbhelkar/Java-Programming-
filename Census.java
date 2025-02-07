class Census 
{
	public static void main(String[] args) 
	{
		long currpop= 312032486;
		final long seconds=(365*24*60*60)*5;
		long birth=seconds/7;
		long death=seconds/13;
		long imm=seconds/45;

		long newpop=currpop+birth-death+imm;
		System.out.println("Current Population is: "+currpop);
		System.out.println("New Population is: "+newpop);

	}
}
