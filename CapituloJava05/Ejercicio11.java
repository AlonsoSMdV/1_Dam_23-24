package CapituloJava05;
/**
 * Escribe un programa que muestre en tres columnas, el cuadrado y el cubo de
 * los 5 primeros números enteros a partir de uno que se introduce por teclado.
 */
import java.util.Scanner;
public class Ejercicio11 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce un número: ");
    int n = sc.nextInt();
    int aux = n;

    for (int i = n; i < aux+6; i++) {
      System.out.printf("%d%6.0f%6.0f\n",n,Math.pow(n, 2),Math.pow(n, 3));
      n++;
    }
    sc.close();
  }
}
