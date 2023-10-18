package CapituloJava05;
/**
 * Realiza un programa que pinte una pirámide por pantalla. La altura se debe
 * pedir por teclado. El carácter con el que se pinta la pirámide también se debe
 * pedir por teclado.
 */
import java.util.Scanner;
public class Ejercicio19 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce la altura de la pirámide: ");
    int altura = sc.nextInt();
    System.out.print("Ahora con que caracter quiere pintar la piramide: ");
    String caracter = sc.next();
    for (int i = 1; i <= altura; i++) { 
      for (int j = i; j < altura; j++) {
        System.out.print("  ");
      }

      for (int j2 = 1; j2 <= i*2-1; j2++) {
        System.out.print(caracter+" ");
      }
      System.out.println();
    }
    sc.close();
  }
}
