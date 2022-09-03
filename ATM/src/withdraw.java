
public class withdraw 
{

	void Withdraw (int balance, int initial) 
	{
		
		if((initial - balance) < 0) 
		{
			System.out.println("You can't withdraw" + balance + "$");	
			System.out.println("Insufficiente balance");
		}
		else 
		{
			System.out.println("Successful transaction, your balance now is: ");
			System.out.println(initial - balance);
		}		
	}

}