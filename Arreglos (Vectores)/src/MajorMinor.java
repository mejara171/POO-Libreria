

public class MajorMinor {

	public static void main(String[] args) {
		
		int[] VecNum = {43, 234, 54, 98, 64, 1};
		
		for (int i=0;i<=9;i++) {
			System.out.println("Valor de la posicion " + i+ ": " +VecNum[i]);
		}
		
		int major = VecNum[0];
		int minor = VecNum[0];
		
		for (int i=0; i<=9; i++) {
			
			if(major<VecNum[i])
				major = VecNum[i];
				
			if(minor>VecNum[i])
				minor = VecNum[i];
				
		}
		
		System.out.println ("");
		System.out.println("Mayor: " +major);
		System.out.println("Menor: " +minor);
	}

}
