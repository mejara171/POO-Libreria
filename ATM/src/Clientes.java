import java.util.Scanner;

public class Clientes {
	static Scanner sc = new 
			Scanner(System.in);
	
	Retirar ret = new Retirar();
	
	String nombre = "";
	int cedula = 0;
	String direccion = "";
	String email = "";
	int inicial = 0;	
	int saldo = 0;
	
	
	void cliente() {
		
		System.out.println();
		System.out.println("REGISTRO");
		System.out.println();
		System.out.println("ingresa tu nombre: ");
		nombre = sc.next() ;
		System.out.println();
		System.out.println("ingresa tu cedula: ");
		cedula = sc.nextInt() ;
		System.out.println();
		System.out.println("ingresa tu direccion: ");
		direccion = sc.next() ;
		System.out.println();
		System.out.println("ingresa tu e-mail: ");
		email = sc.next() ;
		System.out.println();
		System.out.println("ingresa tu saldo inicial: ");
		inicial = sc.nextInt() ;
		
		System.out.println();
	}
	
	void saldo( ) {
		
		System.out.println();
		System.out.println("Su saldo actual es de: ");
		System.out.println(inicial);
		System.out.println();
	}
		
	void monto() {
		
		System.out.println();
		System.out.println("ingresa la cantidad de dinero que quiere retirar: ");
		saldo = sc.nextInt() ;	
		ret.retirar(saldo, inicial);
		System.out.println();
	}

}