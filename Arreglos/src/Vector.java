
public class Vector 
	{

	   public static void main(String[] args) 
	   {
	        
		   int major=43;
           int minor=13;
	       int[] array = {2, 67, 45, 23, 12, 9, 67, 43};
	         
	        for (int i=0 ; i<array.length ; i++) 
			{
	      
	        	 if (major<array[i])
				 	{
	               	 major=array[i];
	            	}
	        	 else if(minor>array[i])
				 {
	             	 minor=array[i];
	              }
	        }       
             System.out.println("El mayor es " +major+" y el menor es "+minor+"");
	    }
	   }

