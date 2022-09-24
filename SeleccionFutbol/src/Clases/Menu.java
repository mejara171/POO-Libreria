package Clases;
import java.util.Scanner;

public class Menu {
	
	static int OpcionUsuario = -1;
	
	static Scanner scanner = new Scanner(System.in);
	
	static SeleccionFutbol PrincipalSeleccion = new SeleccionFutbol();

	static Futbolistas PrincipalFutbolista = new Futbolistas();

	static Entrenador PrincipalEntrenador = new Entrenador();

	static Masajista principalMasajista = new Masajista();



	
	public static void main(String[] arg) 

	{			
								
				while (OpcionUsuario != 0)
				{
					try 
					{
						
						
						System.out.println("  ::   MENU   ::  ");
						System.out.println("1. Registrar Futbolista");
						System.out.println("2. Registrar Entrenador");
						System.out.println("3. Registrar Futbolista");
						System.out.println("4. Registrar Seleccion");

								
						OpcionUsuario = Integer.parseInt(scanner.nextLine());
						switch(OpcionUsuario)
						{
						
						case 1:
							
							 Futbolistas.main(arg);
						
							
							break;
						case 2:
																					
							{
								Entrenador.main(arg);
							}
							
							break;
							
						case 3:
							
							{
								Masajista.main(arg);
							}
							break;	
							
							case 4:
							
							{
								SeleccionFutbol.main(arg);
							}
							break;																														
						
						}
						System.out.println("\n");
						
					}
					catch(Exception e) {
						System.out.println("Ups Error!");
					}
					
					
				}
				

	}
	}
