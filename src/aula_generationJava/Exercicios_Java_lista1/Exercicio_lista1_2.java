package aula_generationJava;

import java.util.Scanner;

public class Exercicio_lista1_2 {

      public static void main(String args[])
      {
            Scanner sc = new Scanner(System.in);
            
            //2. Faça um sistema que leia a idade de uma pessoa
            //expressa em dias e mostre-a expressa em anos, meses e dias.
            int dias, meses, anos, valor;
            System.out.println("Entre com o número de dias: ");
            dias = sc.nextInt();
            anos = dias/365;
            valor = dias%365;
            meses = valor/30;
            dias = valor%30;
            System.out.println("Você tem "+anos+ " anos, "+ meses + " meses, e " +dias+ " dias.");
            sc.close();
      }
}