package Clases;
import java.util.Scanner;


public class User 
{
	static Scanner scanner = new Scanner(System.in);

	String name;
	String surnames;
	int id;
	int age;

	int Dorsal;
	String Demaracacion;

	String Federacion;

	String Titulacion;
	int Experiencia;

	void Registro()
	{
		System.out.print("escribe tu nombre");							
		name = scanner.nextLine();

		System.out.print("Escribe tu apellido");							
		surnames = (scanner.nextLine());

		System.out.print("Escribe tu id");							
		id = Integer.parseInt(scanner.nextLine());
		
		System.out.print("Escribe tu edad");							
		age = Integer.parseInt(scanner.nextLine());
	}

	void RegistroFutbolista()
	{
		System.out.print("escribe tu demarcacion");							
		Demaracacion = scanner.nextLine();

		System.out.print("Escribe tu dorsal");							
		Dorsal = Integer.parseInt(scanner.nextLine());
	}

	void RegistroEntrenador()
	{
		System.out.print("escribe tu federacion");							
		Federacion = scanner.nextLine();
	}

	void RegistroMasajista()
	{
		System.out.print("escribe tu titulacion");							
		Titulacion = scanner.nextLine();

		System.out.print("Escribe tus años de experiencia");							
		Experiencia = Integer.parseInt(scanner.nextLine());
	}
}
