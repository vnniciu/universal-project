package study.java.vectorExercises;

import java.util.Scanner;

// Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
//e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos.

public class FindNegativeNumbersInVector {

  public static void main(String []args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("Quantos números você gostaria de digitar? ");

    var n = sc.nextInt();

     int[] vetor = new int[n];

    for(int x = 0; x < n; x++) {

      System.out.print("Digite um número: ");
      vetor[x] = sc.nextInt();
    }

    System.out.println("NUMEROS NEGATIVOS:");
    for (int i : vetor) {
      if (i < 0) {
        System.out.println(i);
      }
    }

    sc.close();

  }
}
