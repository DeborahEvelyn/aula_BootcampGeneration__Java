package aula_generationJava;

import java.util.Locale;
import java.util.Scanner;

public class logica_Java_Generation_4 {
	
	public static void main (String args[])
	{
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		/*Faça um programa em que permita a entrada de um número qualquer 
		e exiba se este número é par ou ímpar. Se for par exiba também a raiz 
		quadrada do mesmo; se for ímpar exiba o número elevado ao quadrado.*/
		
		double numero;
		
		System.out.println("Digite um número: ");
		numero = sc.nextInt();
		
		if (numero % 2==0)
			
		{	
									
			System.out.printf("Este número é par: %.2f" , Math.sqrt(numero));
			
						
		}
		
				

		else
		{
			
			
			System.out.printf("Este numero é impar: %.2f" , Math.pow(numero,2));
			 
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	
	}
