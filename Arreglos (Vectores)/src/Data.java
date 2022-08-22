import java.util.Scanner;

public class Data {
	
		static Scanner keyboard = new Scanner(System.in);
		
		public static void main(String[] args) {
			
			int[][] MatrixNum;
			int Num;
			int Sum = 0;
			int[] VectorSum;

			MatrixNum = new int[4][3];
			VectorSum = new int[4];
			
			for(int f=0; f <=3; f++) {
				
				for(int c=0; c<=2; c++) {
					
					System.out.println("Valor de la posición, fila: " + f +" y columna "+ c + ":");

				 Num = keyboard.nextInt();
		
					MatrixNum [f][c] = Num;

					Sum = Num + Sum;
				}
			VectorSum[f] = Sum;	
			
			Sum = 0;
			}
			
			System.out.println("");

			System.out.println("Matriz:");
		
			
			for(int f=0;f<=3;f++) {
				for(int c=0; c<=2;c++) {
					System.out.print(MatrixNum[f][c] + "\t");
					
				}
				
			System.out.println("");
			}
			
			System.out.println("");
			
			System.out.println("Suma de las filas: ");

			for(int i=0;i<=3;i++) {
				System.out.print(VectorSum[i] + "\t");
				System.out.print("");
			}
	}

}
