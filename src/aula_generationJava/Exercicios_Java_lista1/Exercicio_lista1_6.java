package aula_generationJava;

import java.util.Scanner;

public class Exercicio_lista1_6 {

	public static void main(String args[])
	
	
	{
		Scanner sc = new Scanner(System.in);
		
		
		//Construa um programa em portugol que, tendo como dados de entrada 
		//dois pontos quaisquer no plano, P(x1, y1) e P(x2, y2), escreva a 
		//distância entre eles. A fórmula que efetua tal cálculo é:  
		
		double x1,y1,x2,y2, distancia;
		
		System.out.println("Digite o valor de x1:");
		x1 = sc.nextDouble();
		System.out.println("Digite o valor de y1:");
		y1 = sc.nextDouble();
		System.out.println("Digite o valor de x2:");
		x2 = sc.nextDouble();
		System.out.println("Digite o valor de y2:");
		y2 = sc.nextDouble();
		
		distancia = Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
		
		System.out.println("Os pontos são: P1 " + x1+ " , " + y1+ "  e P2  " + x2+ " , " + y2);
		
		System.out.println(distancia);
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
	}

 
	
		
			
}
