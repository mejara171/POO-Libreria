
import java.util.Scanner;

 
public class Calculate {
    static Scanner teclado = new Scanner(System.in);
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int opcion=0;
        do{
            System.out.println("Opciones");
            System.out.println(" 1. Cuadrado");
            System.out.println(" 2. Rectangulo");
            System.out.println(" 3. Circulo");
            System.out.println(" 4. Romboide");
            System.out.println(" 5. Rombo");
            System.out.println(" 6. Triangulo");
            System.out.println(" 7. Trapecio");
            System.out.println(" 8. Pentagono");
            System.out.println(" 0. Salir");
            System.out.println("Seleccione una opción: ");
            opcion = teclado.nextInt();         
            switch (opcion){
                case 1: //CUADRADO//
                	System.out.println("Calculo de Cuadrado");
    				System.out.println("Ingrese el tamaño del lado:");
    				int lado = sc.nextInt();
    				System.out.println("Area: " + (lado * lado));
    				
                    break;
                case 2:
                	System.out.println("Calculo de Rectangulo");
    				System.out.println("Ingrese el tamaño de la base:");
    				int base = sc.nextInt();
    				System.out.println("Ingrese el tamaño de la altura:");
    				int altura = sc.nextInt();
    				System.out.println("Area: " + (altura * base));
    				
                    break;
                case 3:
                	System.out.println("Calculo de Circulo");
    				System.out.println("Ingrese el tamaño del radio:");
    				int radio = sc.nextInt();
    				System.out.println("Area: " + ((radio * radio) * 3.1416));
    				
                    break;
                case 4:
                	System.out.println("Calculo de Romboide");
    				System.out.println("Ingrese el tamaño de la base");
    				int base1 = sc.nextInt();
    				System.out.println("Ingrese la altura:");
    				int altura1 = sc.nextInt();
    				System.out.println("Area: " + (altura1 * base1));
    				
                    break;
                case 5:
                	System.out.println("Calculo de Romboide");
    				System.out.println("Ingrese el tamaño de la diagonal mayor:");
    				int D = sc.nextInt();
    				System.out.println("Ingrese el tamaño de la diagonal menor:");
    				int d = sc.nextInt();
    				System.out.println("Area: " + ((D * d) / 2) );
    				
                    break;
                case 6:
                	System.out.println("Calculo de Triangulo");
    				System.out.println("Ingrese el tamaño de la base");
    				int base2 = sc.nextInt();
    				System.out.println("Ingrese el tamaño de la altura:");
    				int altura2 = sc.nextInt();
    				System.out.println("Area: " + ((altura2 * base2) / 2) );
    				
                    break;
                case 7:
                	System.out.println("Calculo de Trapecio");
    				System.out.println("Ingrese el tamaño de la base mayor:");
    				int B = sc.nextInt();
    				System.out.println("Ingrese el tamaño de la base menor:");
    				int b = sc.nextInt();
    				System.out.println("Ingrese el tamaño de la altura:");
    				int h = sc.nextInt();
    				System.out.println("Area: " + ((B + b) / 2 * h) );
    				
                    break;
                case 8:
                	System.out.println("Calculo de Pentagono");
    				System.out.println("Ingrese el tamaño del perimetro:");
    				int perimetro = sc.nextInt();
    				System.out.println("Ingrese el tamaño de la apotema:");
    				int apotema = sc.nextInt();
    				System.out.println("Area: " + ((perimetro * apotema) / 2) );
    				
                    break;
                    
            }
        } while (opcion != 0);
    }
}