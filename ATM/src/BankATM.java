import java.util.Scanner;

public class BankATM {

	static Scanner sc = new 
			Scanner(System.in);

	public static void main(String[] args) {
		
		int opcion=0;
		Clientes client = new Clientes();
		
        do{
        	System.out.println();
        	System.out.println("            Bank a' rrota            ");
            System.out.println();
        	System.out.println("MENU");
        	System.out.println();
            System.out.println("Oprima \"1\" para ingresar su usuario");
            System.out.println("Oprima \"2\" para consultar su saldo");
            System.out.println("Oprima \"3\" para retirar su saldo");
            System.out.println();
            System.out.println("Ingresa el numero de la opcion correspondiente: ");
            System.out.println();
            
            opcion = sc.nextInt();         
            switch (opcion){
            
                case 1:
                    client.cliente();
                    break;
                    
                case 2:
                    client.saldo();
                    break;
                    
                case 3:
                    client.monto();
            }
        } 
        
        while (opcion != 0);
	}
}