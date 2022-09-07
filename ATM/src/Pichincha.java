import java.util.Scanner;

public class Pichincha 
{

	static Scanner scanner = new 
Scanner(System.in);

	public static void main(String[] args) 
    {
		
		int selection=0;
		client client = new client();
		
        do
        {
        	System.out.println("PICHINCHA BANK");
            System.out.println("Press \"1\" to enter your information");
            System.out.println("Press \"2\" to check your balance");
            System.out.println("Press \"3\" to withdraw your money");
            
            selection = scanner.nextInt();         
            switch (selection)
            {
            
                case 1:
                    client.info();
                    break;
                    
                case 2:
                    client.balance();
                    break;
                    
                case 3:
                    client.withdraw();
            }
        } 
        
        while (selection != 0);
	}
}