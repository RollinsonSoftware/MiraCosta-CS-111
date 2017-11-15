public class Payment
{
	protected double amount;
	
	Payment()
	{
		setAmount(0);
	}
	Payment(double amount)
	{
		setAmount(amount);
	}
	Payment(Payment original)
	{
		if (original == null)
		{
			System.out.println("ERROR NULL COPY");
			System.exit(0);
		}
		else
		{
			setAmount(original.amount);
		}
	}
	public String toString()
	{
		return "" + this.amount;
	}
	public boolean equals(Payment amountOther)
	{
		return this.amount == amountOther.amount;
	}
	public void setAmount(double amount)
	{
		this.amount = amount;
	}
	public double getAmount()
	{
		return this.amount;
	}
	public void paymentDetails()
	{
		System.out.printf("The current amount is: $" + "%-8.2f %n", this.amount);
	}
}
