package CapituloJava05;
/**
 * Realiza un programa que pinte un triángulo relleno tal como se muestra en los
 * ejemplos. El usuario debe introducir la altura de la figura.
 */
import java.util.Scanner;

public class Ejercicio56 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduzca la altura: ");
    int alt = sc.nextInt();
    for (int i = alt; i >= 1; i--) {
      for (int j = i; j < alt; j++) {
        System.out.print(" ");
      }
      
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
    sc.close();
  }
}
