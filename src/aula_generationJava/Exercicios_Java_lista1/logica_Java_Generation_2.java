package aula_generationJava;

import java.util.Locale;
import java.util.Scanner;

public class logica_Java_Generation_2 {
	
	public static void main (String args[])
	{
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

//Fa�a um programa que entre com tr�s n�meros e coloque em ordem crescente.
		
		int numero1, numero2, numero3;
		
		System.out.println("Digite tr�s n�meros: ");
		numero1 = sc.nextInt();
		numero2 = sc.nextInt();
		numero3 =sc.nextInt();
 
		
		if (numero1<=numero2 && numero2<=numero3)
		{
									
			System.out.printf("A ordem crescente dos n�meros � %d, %d, %d. ", numero1, numero2, numero3);
		
		}
		else if (numero2<=numero1 && numero1<=numero3)
			
		{
			
			System.out.printf("A ordem crescente dos n�meros � %d, %d, %d. ", numero2, numero1, numero3);
		}
		
		
		else if (numero3<=numero2 && numero2<=numero1)
			
		{
			
			System.out.printf("A ordem crescente dos n�meros � %d, %d, %d. ", numero3, numero2, numero1);
		}
		
		else if (numero3<=numero1 && numero1<=numero2)
			
		{
			
			System.out.printf("A ordem crescente dos n�meros � %d, %d, %d. ", numero3, numero1, numero2);
		}
		
		else if (numero1<=numero3 && numero3<=numero2)
			
		{
			
			System.out.printf("A ordem crescente dos n�meros � %d, %d, %d. ", numero1, numero3, numero2);
		}
		
        else if (numero2<=numero3 && numero3<=numero1)
			
		{
			
			System.out.printf("A ordem crescente dos n�meros � %d, %d, %d. ", numero2, numero3, numero1);
		}	
			
		
		
		
		
		
		
		
		
		
	}
		
		
		
	}