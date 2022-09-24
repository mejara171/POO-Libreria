package Clases;


public class SeleccionFutbol extends User 
{
	
	static int OpcionUsuario = -1;
	static User SeleccionFutbol = new User();

	public static void main(String[] arg) 
	{
		while (OpcionUsuario != 0)
		{
			try 
			{
				System.out.println("  ::   MENU   ::  ");
				System.out.println("1. Registrar datos");
				System.out.println("2. Concentrarse");
				System.out.println("3. Viajar");
				System.out.println("4. Regresar");
						
				OpcionUsuario = Integer.parseInt(scanner.nextLine());
				switch(OpcionUsuario)
				{
				
				case 1:
					
					 SeleccionFutbol.Registro();
				
					
					break;
				case 2:
																			
					{
						System.out.println("3. Estoy en el metodo Concentrarse Partido de la clase SeleccionFutbol");
					}
					
					break;
					
				case 3:
					
					{
						System.out.println("Estoy en el metodo Viajar Partido de la clase SeleccionFutbol ");
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
