package Clases;

public class Futbolistas extends User
{
    static int OpcionUsuario = -1;
	static User Futbolista = new User();

	public static void main(String[] arg) 
	{
		while (OpcionUsuario != 0)
		{
			try 
			{
				System.out.println("  ::   MENU   ::  ");
				System.out.println("1. Registrar datos");
				System.out.println("2. Jugar Partido");
				System.out.println("3. Entrenar");
				System.out.println("4. Regresar");

						
				OpcionUsuario = Integer.parseInt(scanner.nextLine());
				switch(OpcionUsuario)
				{
				
				case 1:
					
					 Futbolista.Registro();
                     Futbolista.RegistroFutbolista();					
					break;
				case 2:
																			
					{
						System.out.println("Estoy en el metodo Jugar Partido de la clase Futbolista ");
					}
					
					break;
					
				case 3:
					
					{
						System.out.println("3. Estoy en el metodo Entrenar de la clase Futbolista");
					}
					break;	
					
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
