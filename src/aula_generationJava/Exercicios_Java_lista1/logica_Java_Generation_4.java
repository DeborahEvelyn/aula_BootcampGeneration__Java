package aula_generationJava;

import java.util.Locale;
import java.util.Scanner;

public class logica_Java_Generation_4 {
	
	public static void main (String args[])
	{
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		/*Fa�a um programa em que permita a entrada de um n�mero qualquer 
		e exiba se este n�mero � par ou �mpar. Se for par exiba tamb�m a raiz 
		quadrada do mesmo; se for �mpar exiba o n�mero elevado ao quadrado.*/
		
		double numero;
		
		System.out.println("Digite um n�mero: ");
		numero = sc.nextInt();
		
		if (numero % 2==0)
			
		{	
									
			System.out.printf("Este n�mero � par: %.2f" , Math.sqrt(numero));
			
						
		}
		
				

		else
		{
			
			
			System.out.printf("Este numero � impar: %.2f" , Math.pow(numero,2));
			 
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	
	}
