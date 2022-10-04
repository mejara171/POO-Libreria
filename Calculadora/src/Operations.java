import java.util.Scanner;

public class Operations 
{
	static Scanner sc=new Scanner(System.in);
	
	public void Addition(int a, int b) 
	{
		int Outcome = a + b;
		
		System.out.println("Result: " + Outcome);	
	}

	public void Subtraction(int parametro1, int parametro2) 
	{
		int Outcome = parametro1 - parametro2;
		
		System.out.println("Result: " + Outcome);
	}

	public void Division(int parametro1, int parametro2) 
	{
		int Outcome = parametro1 / parametro2;
		
		System.out.println("Result: " + Outcome);
	}

	public void Multiplication(int parametro1, int parametro2) 
	{
		int Outcome = parametro1 * parametro2;
		
		System.out.println("Result: " + Outcome);
	}
}
