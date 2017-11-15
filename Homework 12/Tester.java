import java.util.Scanner;
public class Tester
{
	public static void main(String[] args)
	{
		Scanner keyboard;
		CashPayment payment1;
		CashPayment payment2;
		CreditCardPayment payment3;
		CreditCardPayment payment4;  
		
		Cs111.myPrintHeader(12, 2, "5/7/2016");
		keyboard = new Scanner(System.in);
		//Cash Payment:
		payment1 = new CashPayment(Cs111.readDouble("Please enter the amount for the first payment: ", keyboard, 0.00, 99999.99));
		payment2 = new CashPayment(9000.8567);
		System.out.println("... The second amount has already be entered for you!");
		System.out.println(" ");
		System.out.print("Lets check for equality between the two amounts (This should be false): ");
		System.out.println(payment1.equals(payment2));
		//Credit Payment:
		System.out.println(" ");
		System.out.println("Don't worry about setting your credit card details, I already did it!");
		payment3 = new CreditCardPayment("Jack Rollinson", "08/2019", "4567098723456543", 6969.492);
		payment4 = new CreditCardPayment(payment3);
		System.out.print("I also copied the information, lets check if its equal! (Should be true): ");
		System.out.println(payment3.equals(payment4));
		System.out.println(" ");
		System.out.println("=================================================");
		System.out.println(" ");
		payment1.paymentDetails();
		payment2.paymentDetails();
		payment3.paymentDetails();
		payment4.paymentDetails();
	
	}
}
