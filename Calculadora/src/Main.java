import java.util.Scanner;


public class Main	extends Operations
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[]args)
	{
		Operations Operation = new Operations();
		
		int option;
		System.out.println("Type your first input");
		int input1=sc.nextInt()	;
		System.out.println("Type your second input");
		int input2=sc.nextInt()	;

		do
		{	
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		
		option=sc.nextInt();
		
			switch (option) 
			{
				case 1:
				Operation.Addition(input1, input2);
					break;
				case 2:
				Operation.Subtraction(input1, input2);
					break;
				case 3:
				Operation.Multiplication(input1, input2);
					break;
				case 4:
				Operation.Division(input1, input2);
					break;
			}
	
		}while(option!=0);	
	}
}
