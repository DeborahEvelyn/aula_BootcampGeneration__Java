package aula_generationJava;

import java.util.Locale;
import java.util.Scanner;

public class logica_Java_Generation_3 {
	
	public static void main (String args[])
	{
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		/*3-	Faça um programa que receba a idade de uma pessoa e mostre na saída em qual 
		 * categoria ela se encontra:
			·                     10-14 infantil
			·                     15-17 juvenil
			·                     18-25 adulto */
		
		int idade=0;
		
		System.out.println("Entre com sua idade: ");
		idade = sc.nextInt();
		
		if (idade>=10 && idade<=14)
		{
			System.out.println("Você está na categoria infantil!");
		}
		
		 else if (idade>=15 && idade<=17)
		{
			System.out.println("Você está na categoria juvenil!");
		}
		
		if (idade>=18 && idade<=25)
		{
			System.out.println("Você está na categoria adulto!");
		}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}