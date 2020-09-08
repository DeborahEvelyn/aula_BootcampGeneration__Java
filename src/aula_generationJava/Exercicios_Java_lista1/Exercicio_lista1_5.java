package aula_generationJava;

import java.util.Scanner;

public class Exercicio_lista1_5 {

	public static void main(String args[])
	
	
	{
		Scanner sc = new Scanner(System.in);
		
		//Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste aluno. 
		//Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5, respectivamente. 
		
		int nota1, nota2, nota3, media;
		
		System.out.println("Digite sua primeira nota:");
		nota1 = sc.nextInt();
		System.out.println("Digite sua segunda nota:");
		nota2 = sc.nextInt();
		System.out.println("Digite sua terceira nota:");
		nota3 = sc.nextInt();
		
		media = ((nota1*2)+(nota2*3)+(nota3*5)/10);
		System.out.println("A média dos alunos é: " + media);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
	}

 
	
		
			
}
