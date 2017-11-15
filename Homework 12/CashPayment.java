public class CashPayment extends Payment
{
	CashPayment()
	{
		super();
	}
	CashPayment(double amount)
	{
		super(amount);
	}
	CashPayment(CashPayment original)
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
	public boolean equals(CashPayment amountOther)
	{
		return this.amount == amountOther.amount;
	}
	public void paymentDetails()
	{
		System.out.printf("The current amount in CASH is: $" + "%-8.2f %n", this.amount);
	}
}
