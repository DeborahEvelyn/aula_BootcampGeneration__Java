package lacosDeRepeticao_Java1;

import java.util.Scanner;

public class lacos_de_repeticao_exercicio1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//Informar todos os números de 1000 a 1999 que quando divididos por 11 obtemos resto = 5. (FOR)
		
		int numero;
		
		
		System.out.println("Digite um número entre 1000 e 2000: ");
		numero = sc.nextInt();
		
		for (numero=1000;numero<=1999;numero++)
		{   
		
			if (numero % 11==5)
			{
			     System.out.printf("\n Número divisível por 5: %d", numero);

			}
			
		}  
		

		     
	}

}
