/********************************************
* AUTHOR: <Jack Rollinson>
* COURSE: CS 111 Intro to CS I
* SECTION: <Mon. + Wed. 11:00AM>
* HOMEWORK #: <homework #8>
* PROJECT #: <project #2>
* LAST MODIFIED: <3/27/2016>
********************************************/

/*****************************************************************************
* <Counter Class>
*****************************************************************************
* PROGRAM DESCRIPTION:
* <Class that can count by interger, reset the count, output the 
* current count, aswell as counting up and down.>
*****************************************************************************
* ALGORITHM:
* private count = 0
* toString method()
* {
* 	return + count
* }
* reset method()
* {
* 	count = 0
* 	return count
* }
* current method()
* {
* 	return count
* }
* increment method()
* {
* 	this.count = ++count
* 	return count
* }
* decrement method()
* {
* 	this.count = --count
* 	if (count < 0) 
* 	{
* 		count = 0
* 	}
* 	return count;
* }
*****************************************************************************
* ALL IMPORTED PACKAGES NEEDED AND PURPOSE:
* None
*****************************************************************************/

public class Counter
{
	private int count = 0;
	
	public String toString()
	{
		return "" + count;
	}
	public int reset()
	{
		count = 0;
		return count;
	}
	public int current()
	{
		return count;
	}
	public int increment()
	{
		this.count = ++count;
		return count;
	}
	public int decrement()
	{
		this.count = --count;
		if (count < 0)
		{
			count = 0;
		}
		return count;
	}
}
