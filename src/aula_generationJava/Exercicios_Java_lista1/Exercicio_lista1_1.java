package aula_generationJava;
import java.util.Scanner;

public class Exercicio_lista1_1 {
	
      public static void main(String args[])
      {
            Scanner sc = new Scanner(System.in);
            //Fa�a um sistema que leia a idade de uma pessoa expressa em anos,
            //meses e dias e mostre-a expressa apenas em dias.
            int anos, meses, dias, totalDias;
            
            System.out.println("Digite quantos anos voc� tem: ");
            anos = sc.nextInt();
            System.out.println("Entre com o n�mero de meses: ");
            meses = sc.nextInt();
            System.out.println("Entre com o n�mero de dias: ");
            dias = sc.nextInt();
            
            totalDias = anos*365;
            totalDias = totalDias +(meses*30);
         totalDias =    totalDias+dias;
         
         System.out.println("O total de dias �: "+ totalDias);
         
            sc.close();
      }
}

