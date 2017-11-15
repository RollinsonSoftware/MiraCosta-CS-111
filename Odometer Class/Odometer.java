/********************************************
* AUTHOR: <Jack Rollinson>
* COURSE: CS 111 Intro to CS I
* SECTION: <Mon. + Wed. 11:00AM>
* HOMEWORK #: <homework #8>
* PROJECT #: <project #1>
* LAST MODIFIED: <3/27/2016>
********************************************/


/*****************************************************************************
* <Odometer Class>
*****************************************************************************
* PROGRAM DESCRIPTION:
* <Class that will be used to track fuel and mileage for an automobile.>
*****************************************************************************
* ALGORITHM:
* private double milesDriven = 0
* priavte double fuelEfficiency = 0
* private double gallonsConsumed
* toString method()
* {
* 	return milesDriven + " miles, " + fuelEfficiency + "mpg."
* }
* reset method()
* {
* 	milesDriven = 0.0
* 	return milesDriven
* }
* setFuelEfficiency method(double fuelEfficiency)
* {
* 	if (fuelEfficiency >= 0.0)
*	{
*		this.fuelEfficiency = fuelEfficiency
*	}
*	else if (fuelEfficiency < 0.0)
*	{
*		fuelEfficiency = 0.0
*		this.fuelEfficiency = fuelEfficiency
*	}
*	return this.fuelEfficiency
* }
* addMiles method(double milesDriven)
* {
*	if (milesDriven >= 0.0)
*	{
*		this.milesDriven += milesDriven
*	}
*	else if (milesDriven < 0.0)
*	{
*		milesDriven = 0.0
*		this.milesDriven += milesDriven
*	}
*	return this.milesDriven
* }
* getGallonsConsumed method()
* {
* 	gallonsConsumed = (this.milesDriven / this.fuelEfficiency)
*	return gallonsConsumed
* }
*****************************************************************************
* ALL IMPORTED PACKAGES NEEDED AND PURPOSE:
* None
*****************************************************************************/

public class Odometer
{
	private double milesDriven = 0.0;
	private double fuelEfficiency = 0.0;
	private double gallonsConsumed;
	
	public String toString()
	{
		return milesDriven + " miles, " + fuelEfficiency + " mpg.";
	}
	public double reset()
	{
		milesDriven = 0.0;
		return milesDriven;
	}
	public double setFuelEfficiency(double fuelEfficiency)
	{
		if (fuelEfficiency >= 0.0)
		{
			this.fuelEfficiency = fuelEfficiency;
		}
		else if (fuelEfficiency < 0.0)
		{
			fuelEfficiency = 0.0;
			this.fuelEfficiency = fuelEfficiency;
		}
		return this.fuelEfficiency;
	}
	public double addMiles(double milesDriven)
	{
		if (milesDriven >= 0.0)
		{
			this.milesDriven += milesDriven;
		}
		else if (milesDriven < 0.0)
		{
			milesDriven = 0.0;
			this.milesDriven += milesDriven;
		}
		return this.milesDriven;
	}
	public double getGallonsConsumed()
	{
		gallonsConsumed = (this.milesDriven / this.fuelEfficiency);
		return gallonsConsumed;
	}
}
