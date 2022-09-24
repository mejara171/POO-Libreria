package Clases;

public class Entrenador extends User
{
    static int OpcionUsuario = -1;
	static User Entrenador = new User();

	public static void main(String[] arg) 
	{
		while (OpcionUsuario != 0)
		{
			try 
			{
				System.out.println("  ::   MENU   ::  ");
				System.out.println("1. Registrar datos");
				System.out.println("2. Dirigir partido");
				System.out.println("3. Dirigir Entrenamiento");
				System.out.println("4. Regresar");

						
				OpcionUsuario = Integer.parseInt(scanner.nextLine());
				switch(OpcionUsuario)
				{
				
				case 1:
					
					 Entrenador.Registro();
                     Entrenador.RegistroEntrenador();					
					break;
				case 2:
																			
					{
						System.out.println("Estoy en el metodo Dirigir Partido de la clase Entrenador ");
					}
					
					break;
					
				case 3:
					
					{
						System.out.println("3. Estoy en el metodo Dirigir Entreno de la clase Entrenador");
					}

					case 4:
							
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
