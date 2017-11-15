public class HotDogStand
{
	//CONSTANTS
	
	public static final String DEFAULT_EMPLOYEE = "Jon Jones";
	public static final int DEFAULT_STAND_ID = 0;
	
	//INSTANCE VARIABLES
	
	private int standID;
	private int standTotal = 0;
	private String standEmployee;
	private static int grandTotal;
	
	//CONSTRUCTORS
	
	//DISCRIPTION: Default constructor, initializes all instance variables.
	//PRECONDITION: Takes in no arguements.
	//POSTCONDITION: Intantiates all instance variables with default vaules.
	public HotDogStand()
	{
		setStandID(DEFAULT_STAND_ID);
		setStandEmployee(DEFAULT_EMPLOYEE);
		this.standTotal = 0;
	}
	//DISCRIPTION: Full constructor, initalizes all instance variables.
	//PRECONDITION: Takes in an interger for the stand id, and a string for the employee name.
	//POSTCONDITION: Intantiates all instance variables with given vaules.
	public HotDogStand(int id, String name)
	{
		setStandID(id);
		setStandEmployee(name);
		this.standTotal = 0;
	}
	//DISCRIPTION: Copy constructor, creates new object with copied instance variables.
	//PRECONDITION: Assumes that orginal constructor has valid input.
	//POSTCONDITION: Creates a new object with the same instance varibales as the oringal object.
	public HotDogStand(HotDogStand original)
	{
		if (original == null)
		{
			System.out.println("ERROR");
			System.exit(0);
		}
		else 
		{
			setStandID(original.standID);
			setStandEmployee(original.standEmployee);
			this.standTotal = original.standTotal;
		}	
	}
	
	//OTHER METHODS
	
	//DISCRIPTION: Converts all instance variables to a String. 
	//PRECONDITION: Doesn't take any arguements in the parameters.
	//POSTCONDITION: Returns a string containing all the instance variables.
	public String toString()
	{
		return "Stand ID #: " + this.standID + ", Employee: " + standEmployee + ", Total Sales: " + standTotal;
	}
	//DISCRIPTION: Checks for equality between both the employee and the stand ID number.
	//PRECONDITION: Takes in an object of class 'HotDogStand'.
	//POSTCONDITION: Returns a boolean.
	public boolean equals(HotDogStand otherStand)
	{
		if (this.standID == otherStand.standID && this.standEmployee.equals(otherStand.standEmployee))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	//DISCRIPTION: Keeps track of the running total sales for all the hot dog stands.
	//PRECONDITION: Takes in no arguments, assumes that variables were initialized.
	//POSTCONDITION: Increments by 1 the current number of hotdogs sold.
	public void justSold()
	{
		this.grandTotal++;
		this.standTotal++;
	}
	
	//SETTERS
	
	//DISCRIPTION: Sets the ID number for the hot dog stand.
	//PRECONDITION: Takes in one arguement as an int, will take any int.
	//POSTCONDITION: Sets the the value of standID to the given int.
	public void setStandID(int id)
	{
		this.standID = id;
	}
	//DISCRIPTION: Sets the Employee's name.
	//PRECONDITION: Takes in one arguement in the form of a String.
	//POSTCONDITION: Sets the of standEmployee to the given String.
	public void setStandEmployee(String name)
	{
		this.standEmployee = name;
	}
	//DISCRIPTION: Sets all the instance variables.
	//PRECONDITION: Takes in an int and String as arguments.
	//POSTCONDITION: Assigns all instance variables the given data.
	public void setAll(int id, String name)
	{
		setStandID(id);
		setStandEmployee(name);
	}
	
	//GETTERS
	
	//DISCRIPTION: Gets the current value for standID.
	//PRECONDITION: Takes in no arguements.
	//POSTCONDITION: Returns an int for the stands ID number.
	public int getStandID()
	{
		return this.standID;
	}
	//DISCRIPTION: Gets the current value for standID.
	//PRECONDITION: Takes in no arguements.
	//POSTCONDITION: Returns a String for the employee working at the stand.
	public String getStandEmployee()
	{
		return this.standEmployee;
	}
	//DISCRIPTION: Gets the total amount of hot dogs sold at 1 stand.
	//PRECONDITION: Takes in no arguments.
	//POSTCONDITION: Returns an int for the total amount of hot dogs sold at that stand.
	public int getTotalSold()
	{
		return this.standTotal;
	}
	//DISCRIPTION: Gets the total amount of hot dogs sold at ALL stands.
	//PRECONDITION: Takes in no arguments.
	//POSTCONDITION: Returns an int for the total amount of hot dogs sold at all stands.
	public static int getGrandTotalSold()
	{
		return grandTotal;
	}	
}
