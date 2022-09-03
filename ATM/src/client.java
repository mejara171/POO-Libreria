import java.util.Scanner;

public class client 
{
	static Scanner scanner = new 
			Scanner(System.in);
	
	withdraw checkout = new withdraw();
	
	String name = "";
	int ID = 0;
	String address = "";
	String email = "";
	int initial = 0;	
	int balance = 0;
	
	
	void client() 
	{
		

		System.out.println("Type your name: ");
		name = scanner.next() ;
		System.out.println("Type your ID: ");
		ID = scanner.nextInt() ;
		System.out.println("Type your address: ");
		address = scanner.next() ;
		System.out.println("Type your e-mail: ");
		email = scanner.next() ;
		System.out.println("Type your ammount of money: ");
		initial = scanner.nextInt() ;
		
		System.out.println();
	}
	
	void balance() 
	{
		

		System.out.println("Your balance is: " + initial + " $");	
		System.out.println();
	}
		
	void ammount() 
	{
		

		System.out.println("Ammount of money to withdraw:");
		balance = scanner.nextInt() ;	
		checkout.Withdraw(balance, initial);
		System.out.println();
	}

}