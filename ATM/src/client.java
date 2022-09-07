import java.util.Scanner;

public class client 
{
	static Scanner scanner = new Scanner(System.in);
	
	withdraw checkout = new withdraw();
	
	String name = "";
	int ID = 0;
	String address = "";
	String email = "";
	public int initial = 0;	
	public int balance = 0;
	public  int finalbalance = 0;
	
	void info() 
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
		if (initial > 0) 
		{
		finalbalance = initial;
		}


		System.out.println();
	}
	
	void balance() 
	{
		System.out.println("Your balance is: " + finalbalance + " $");	
		System.out.println();
	}
		

	void withdraw () 
	{
		System.out.println("Ammount of money to withdraw:");
		balance = scanner.nextInt() ;	


		if((initial - balance) < 0) 
		{
			System.out.println("You can't withdraw" + balance + "$");	
			System.out.println("Insufficiente balance");
		}
		else 
		{
			System.out.println("Successful transaction, your balance now is: ");
			finalbalance = initial-balance;
			System.out.println(finalbalance);

		}	
	}


}