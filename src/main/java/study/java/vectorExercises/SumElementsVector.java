package study.java.vectorExercises;

import java.util.Scanner;

public class SumElementsVector {

  public static void main(String[] args) {

    var vector = montaVetor();

    printVector(vector);

    System.out.println("SOMA = " + sumValuesVector(vector));

    System.out.println("MEDIA = " + calculateAverage(vector));

  }

  private static double calculateAverage(int[] vector) {

    return sumValuesVector(vector) / vector.length;

  }

  private static int sumValuesVector(int[] vector) {

    var sum = 0;

    for(int i : vector) {
      sum = sum + i;
    }

    return sum;
  }

  private static void printVector(int[] vector) {

    System.out.print("Valores = ");
    for (int i : vector) {
      System.out.print(i + " ");
    }
  }

  private static int[] montaVetor() {

    Scanner sc = new Scanner(System.in);

    System.out.print("Quantos números você vai digitar? ");
    var numberElements = sc.nextInt();

    int[] vector = new int[numberElements];
    for(int x = 0; x < numberElements; x++) {

      System.out.print("Digite um número: ");
      vector[x] = sc.nextInt();
    }
    sc.close();
    return vector;
  }
}
