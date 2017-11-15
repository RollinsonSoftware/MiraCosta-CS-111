public class CreditCardPayment extends Payment
{
	private String name;
	private String expireDate;
	private String cardNum;
	
	CreditCardPayment()
	{
		super();
		setAll("David Cameron", "01/2099", "0000000000000000000000");
	}
	CreditCardPayment(String name, String expire, String cardNumber, double amount)
	{
		super(amount);
		setAll(name, expire, cardNumber);
	}
	CreditCardPayment(CreditCardPayment original)
	{
		super(original.amount);
		if (original == null)
		{
			System.out.println("ERROR NULL COPY");
			System.exit(0);
		}
		else
		{
			setAll(original.name, original.expireDate, original.cardNum);
		}
	}
	public String toString()
	{
		return "Name: " + this.name + ", Experation Date: " + this.expireDate + ", Card Number: " + this.cardNum;
	}
	public boolean equals(CreditCardPayment other)
	{
		return (this.name.equals(other.name) &&
				this.expireDate.equals(other.expireDate) &&
				this.cardNum.equals(other.cardNum) &&
				this.amount == other.amount);
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public void setExpire(String expire)
	{
		this.expireDate = expire;
	}
	public void setCardNum(String cardNum)
	{
		this.cardNum = cardNum;
	}
	public void setAll(String name, String expire, String cardNum)
	{
		setName(name);
		setExpire(expire);
		setCardNum(cardNum);
	}
	public String getName()
	{
		return this.name;
	}
	public String getExpireDate()
	{
		return this.expireDate;
	}
	public String getCardNumber()
	{
		return this.cardNum;
	}
	public void paymentDetails()
	{
		System.out.printf(toString() + ", CREDIT amount: " + "$%-9.2f %n", this.amount);
	}
}
