package aula_generationJava;

import java.util.Locale;
import java.util.Scanner;

public class logica_Java_Generation_1 {
	
	public static void main (String args[])
	{
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		//Faça um programa que receba três inteiros e diga qual deles é o maior.
		
		
		int  numero1, numero2, numero3, maior;
		
		System.out.println("Digite um número: ");
		numero1 = sc.nextInt();
		System.out.println("Digite um número: ");
		numero2 = sc.nextInt();
		System.out.println("Digite um número: ");
		numero3 = sc.nextInt();
		
		if (numero1>numero2 && numero1>numero3)
		{
			maior = numero1;
						
			System.out.printf("O maior número é o %d. ", maior);
		}
			
			if (numero2>numero3 && numero2>numero1)
				
				{ maior = numero2;
			
			System.out.printf("O maior número é o %d. ", maior);
		}
		
			if (numero3>numero1 && numero3>numero2)
			{
		
	        maior = numero3;
			
			System.out.printf("O maior número é o %d. ", maior);
			}
			
		
		
		
		
	}

}
