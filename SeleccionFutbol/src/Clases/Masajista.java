package Clases;

public class Masajista extends User 
{

    static int OpcionUsuario = -1;
	static User Masajista = new User();

	public static void main(String[] arg) 
	{
		while (OpcionUsuario != 0)
		{
			try 
			{
				System.out.println("  ::   MENU   ::  ");
				System.out.println("1. Registrar datos");
				System.out.println("2. Dar Masaje");
				System.out.println("3. Regresar");


						
				OpcionUsuario = Integer.parseInt(scanner.nextLine());
				switch(OpcionUsuario)
				{
				
				case 1:
					
					 Masajista.Registro();
                     Masajista.RegistroMasajista();					
					break;
				case 2:
																			
					{
						System.out.println("Estoy en el metodo dar Masaje de la clase Masajista");
					}
					
					break;

					case 3:
							
					{
						Menu.main(arg);
					}
					break;	
																																		
				}
				System.out.println("\n");
			}
			catch(Exception e) {
				System.out.println("Error!");
			}
		}
	}


}
