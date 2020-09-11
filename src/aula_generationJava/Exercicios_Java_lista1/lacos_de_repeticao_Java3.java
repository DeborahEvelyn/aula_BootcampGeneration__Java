package lacosDeRepeticao_Java1;

import java.util.Scanner;

public class lacos_de_repeticao_Java3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		

//Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de 21 anos. 
//Total de pessoas com mais de 50 anos. O programa termina quando idade for =-99. (WHILE)
		
		int numero=0, contadorMenor=0, contadorMaior=0;
		
		while (numero!=-99)
		{    
			System.out.println("Digite a sua idade: ");
			numero = sc.nextInt();
			
			if (numero<21)
			{
				contadorMenor = contadorMenor+1;
			}
			else if (numero>50)
			{
				contadorMaior = contadorMaior+1;
			}
		}
            
		 System.out.printf("\n Existem %d pessoas menores que 21 anos. ", contadorMenor-1);
		 
		 System.out.printf("\n Existem %d pessoas maiores que 50 anos. ", contadorMaior);
	}

}
