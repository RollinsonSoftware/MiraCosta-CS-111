public class DateTester
{
	public static void main(String[] args)
	{
		Date today;
		today = new Date();
		today.setMonth("April");
		today.setYear(2010);
		
		if (today.setDay(24) )
		{
			System.out.println("thanks for the valid day");
		}
		else 
		{
			System.out.println("thats not going to work...");
		}
		System.out.println("Today = " + today.toString() );
		
	}

}
