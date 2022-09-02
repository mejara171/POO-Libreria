
public class Retirar {

	void retirar (int saldo, int inicial) {
		
		if((inicial - saldo) < 0) {
			System.out.println();
			System.out.println("No es posible retirar el valor de " + saldo + " pesos");	
			System.out.println("Su saldo es insuficiente");
			System.out.println();
		}
		else {
			System.out.println();
			System.out.println("Su transaccion ha sido exitosa, su saldo final es de: ");
			System.out.println(inicial - saldo);
			System.out.println();
		}		
	}

}