package aula_generationJava;
import java.util.Scanner;
public class Exercicio_lista1_3 {
	

      public static void main(String args[])
      {
            Scanner sc = new Scanner(System.in);
            //Fa�a um sistema que leia o tempo de dura��o de um evento em uma f�brica expressa
            //em segundos e mostre-o expresso em horas, minutos e segundos.
            int hora, minutos, segundos, duracaoSegundos;
            System.out.println("Entre com os segundos: ");
            duracaoSegundos = sc.nextInt();
            hora = duracaoSegundos/3600;
            minutos = (duracaoSegundos%3600)/60;
            segundos = (duracaoSegundos%3600)%60;
            System.out.println("O evento durou " +hora+ " horas, " +minutos+ " minutos e " +segundos+ " segundos.");
            sc.close();
      }
}