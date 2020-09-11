package lacosDeRepeticao_Java1;

import java.util.Locale;
import java.util.Scanner;

public class lacos_de_repeticao_Java2 {
	
	public static void main (String [] args)
	{
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		//Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)

		
		int numeros, pares=0, impares=0; 
		
					
		
		for (numeros=1; numeros<=10; numeros++)
		{ 
			 if (numeros%2==0)
			 {
				 pares = pares+1;	
			 } 
				 else
				 {
					 impares = impares+1;
				 }
			 			  
			 
	    }
			 
		 	 			 	 				
		     System.out.printf("\n Existem %d impares", impares);		
		
			 System.out.printf("\n Existem %d pares", pares);	

		
		
		
	}
}
