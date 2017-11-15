public class Date
{
	//INSTANCE VARIABLES
	private String month;
	private int day;
	private int year; //4 digit year!
	//CONSTRUCTORS
	public Date()
	{
		this.setAll("December", 31, 1959);
	}
	//METHODS
	public String toString()
	{
		return this.month + " " + this.day + ", " + this.year;
	}
	public boolean setMonth(String month)
	{
		int monthInt;
		monthInt = this.monthToInt(month);
		if (monthInt > 0 && monthInt < 13)
		{
			this.month = month;
			return true;
		}
		else 
		{
			return false;
		}
	}
	public boolean setDay(int day)
	{
		if (day >= 1 && day <= 31)
		{
			this.day = day;
			return true;
		}
		else 
		{
			return false;
		}
	}
	public boolean setYear(int year)
	{
		if (year >= 1000 && year <= 9999)
		{
			this.year = year;
			return true;
		}
		else 
		{
			return false;
		}
	}
	public boolean setAll(String month, int day, int year)
	{
		//call void setters first
		//return boolean setters
		return this.setMonth(month) && this.setDay(day) && this.setYear(year);
	}
	//POSTCONDITION: returns month as int if valid (Jan-Dec, 1-12)
	// otherwise, returns 0 if it is not a valid month.
	public int monthToInt(String month)
	{
		int result;
		if (month.equalsIgnoreCase("January"))
		{
			result = 1;
		}
		else if (month.equalsIgnoreCase("February"))
		{
			result = 2;
		}
		else if (month.equalsIgnoreCase("March"))
		{
			result = 3;
		}
		else if (month.equalsIgnoreCase("April"))
		{
			result = 4;
		}
		else if (month.equalsIgnoreCase("May"))
		{
			result = 5;
		}
		else if (month.equalsIgnoreCase("June"))
		{
			result = 6;
		}
		else if (month.equalsIgnoreCase("July"))
		{
			result = 7;
		}
		else if (month.equalsIgnoreCase("August"))
		{
			result = 8;
		}
		else if (month.equalsIgnoreCase("September"))
		{
			result = 9;
		}
		else if (month.equalsIgnoreCase("October"))
		{
			result = 10;
		}
		else if (month.equalsIgnoreCase("November"))
		{
			result = 11;
		}
		else if (month.equalsIgnoreCase("Decemebr"))
		{
			result = 12;
		}
		else
		{
			result = 0;
		}
		return result;
	}
}
