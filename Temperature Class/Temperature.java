/********************************************
* AUTHOR: <Jack Rollinson>
* COURSE: CS 111 Intro to CS I
* SECTION: <Mon. + Wed. 11:00AM>
* HOMEWORK #: <homework #8>
* PROJECT #: <project #3>
* LAST MODIFIED: <3/27/2016>
********************************************/


/*****************************************************************************
* <Temperature Class>
*****************************************************************************
* PROGRAM DESCRIPTION:
* <Temperature Class that records temperature as well as converts it between
* fahrenhiet and celsius.>
*****************************************************************************
* ALGORITHM:
* 	private double temperature = 0.0
*	private char scale
*	
*	toString method()
*	{
*		return temperature + scale
*	}
*	setValue method(double temperature)
*	{
*		this.temperature = temperature
*		return this.temperature
*	}
*	setScale method(char scale)
*	{
*		if ((scale == 'F') || (scale == 'f'))
*		{
*			this.scale = 'F'
*		}
*		else if ((scale == 'C') || (scale == 'c'))
*		{
*			this.scale = 'C'
*		}
*		else
*		{
*			this.scale = 'C'
*		}
*		return this.scale
*	}
*	setAll method(double temperature, char scale)
*	{
*		setValue(temperature)
*		setScale(scale)
*	}
*	getCelsius method()
*	{
*		double celsius
*		celsius = (((this.temperature - 32) * 5) / 9)
*		return celsius
*	}
*	getFahrenheit method()
*	{
*		double fahrenheit
*		fahrenheit = (this.temperature * 1.8) + 32
*		return fahrenheit
*	} 
*****************************************************************************
* ALL IMPORTED PACKAGES NEEDED AND PURPOSE:
* None
*****************************************************************************/

public class Temperature
{
	private double temperature = 0.0;
	private char scale;
	
	public String toString()
	{
		return temperature + "\u00B0 " + scale;
	}
	public double setValue(double temperature)
	{
		this.temperature = temperature;
		return this.temperature;
	}
	public char setScale(char scale)
	{
		if ((scale == 'F') || (scale == 'f'))
		{
			this.scale = 'F';
		}
		else if ((scale == 'C') || (scale == 'c'))
		{
			this.scale = 'C';
		}
		else
		{
			this.scale = 'C';
		}
		return this.scale;
	}
	public void setAll(double temperature, char scale)
	{
		setValue(temperature);
		setScale(scale);
	}
	public double getCelsius()
	{
		double celsius;
		celsius = (((this.temperature - 32) * 5) / 9);
		return celsius;
	}
	public double getFahrenheit()
	{
		double fahrenheit;
		fahrenheit = (this.temperature * 1.8) + 32;
		return fahrenheit;
	}
}
