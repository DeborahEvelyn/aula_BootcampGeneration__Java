package aula_generationJava;

import java.util.Scanner;

public class classeJava {

	public static void main(String args[])
	
	
	{
		Scanner sc = new Scanner(System.in);
		
		
		/*
		 * Obtenha um n�mero digitado pelo usu�rio e repita a opera��o
		 * de multiplicar ele por tr�s  (imprimindo o novo valor) at�
		 * que ele seja maior do que 100. Ex.: se o usu�rio digita 5,
		 * deveremos observar na tela a seguinte sequ�ncia: 5 15 45 135.
		 */
		
		int valorDigitado;
		boolean controle = true;
		int auxiliar;
		
		System.out.println("Valor digitado:");
		valorDigitado =sc.nextInt();
		auxiliar = valorDigitado*3;
		
		while(controle);
		{
			System.out.println(auxiliar);
			if (auxiliar>=100);
			{
				controle=false;
			
			}
			auxiliar=auxiliar*3;
		}
		
		
		
		
		
		
		
		
		
		
		sc.close();
	}

 
	
		
			
}
