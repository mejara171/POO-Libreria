import java.util.Scanner;


public class Data {
	
		static Scanner keyboard = new Scanner(System.in);
		static Scanner sc = new Scanner(System.in);
		public static void main(String[] args) {

			String[][] Matrix = new String[5][4];
			String Info = "";	
			int opcion=0;
	do 
	{
		System.out.println("Opciones");
		System.out.println(" 1. Ingresar informacion");
		System.out.println(" 2. Modificar informacion");
		System.out.println(" 2. Mostrar nota");
		opcion = keyboard.nextInt(); 

		switch(opcion) 
		{
			case 1:
			for(int f=0; f <=4; f++) 
			{
				
				for(int c=0; c<=0; c++) 
				{
					System.out.println("Ingrese el ID " + f +"");

				 Info = keyboard.next();
		
					Matrix [f][c] = Info;
				}

				for(int c=1; c<=1; c++) 
				{
					System.out.println("Ingrese el nombre " + f +"");

				 Info = keyboard.next();
		
					Matrix [f][c] = Info;
				}	

				for(int c=2; c<=2; c++) 
				{
					System.out.println("Ingrese la direccion " + f +"");

				 Info = keyboard.next();
		
					Matrix [f][c] = Info;
				}

				for(int c=3; c<=3; c++) 
				{	
					System.out.println("Ingrese la nota " + f +"");

				 Info = keyboard.next();
		
					Matrix [f][c] = Info;
				}

			}
			
			System.out.println("");

			System.out.println("Informacion:");
		
			
			for(int f=0;f<=4;f++) {
				for(int c=0; c<=3;c++) {
					System.out.print(Matrix[f][c] + "\t");
					
				}
				
			System.out.println("");
			}

			System.out.println("");
			break;
			

			case 2:
			System.out.println("Ingrese las nuevas direcciones");
			for(int f=0; f <=4; f++) 
			{
				
	


				for(int c=2; c<=2; c++) 
				{
					System.out.println("Ingrese la direccion " + f +"");

				 Info = keyboard.next();
		
					Matrix [f][c] = Info;
				}


			}
			
			System.out.println("");

			System.out.println("Informacion:");
		
			
			for(int f=0;f<=4;f++) {
				for(int c=0; c<=3;c++) {
					System.out.print(Matrix[f][c] + "\t");
					
				}
				
			System.out.println("");
			}

			System.out.println("");
			break;
			
			case 3:
			System.out.println("Ingrese el ID para mostrar la nota");
			Info2 = keyboard.next(); 

			

			break;
		}
		
	} while (opcion != 0);




			
	}

}
