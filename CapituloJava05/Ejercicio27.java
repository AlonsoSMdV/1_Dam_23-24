package CapituloJava05;
/**
 * Escribe un programa que muestre, cuente y sume los múltiplos de 3 que hay
 * entre 1 y un número leído por teclado.
 */
import java.util.Scanner;
public class Ejercicio27 {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.println("Introduce un numero: ");
      int n = sc.nextInt();
      int multiplo;
      int contador = 0;
      int suma = 0;
      System.out.print("Los multiplos entre 3 y "+n+" son: ");
      for (multiplo = 1; multiplo <= n; multiplo++) {
        if (multiplo%3 == 0) {
          System.out.print(multiplo+" ");
          contador++;
          suma+=multiplo;
        }
      }
      System.out.println();
      System.out.printf("Hay %d multiplos de tres y su suma total es %d\n",contador,suma);
      sc.close();
    }
  }
}
