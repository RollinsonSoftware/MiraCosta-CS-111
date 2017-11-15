public class Temperature2000
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
		
		if (this.scale == 'C')
		{
			return this.temperature;
		}
		else if (this.scale == 'F')
		{
			return this.temperature;
		}
		celsius = (((this.temperature - 32) * 5) / 9);
		return celsius;
	}
	public double getFahrenheit()
	{
		double fahrenheit;
		
		if (this.scale == 'C')
		{
			return this.temperature;
		}
		else if (this.scale == 'F')
		{
			return this.temperature;
		}
		fahrenheit = (this.temperature * 1.8) + 32;
		return fahrenheit;
	}
}
