package CapituloJava05;
/**
 * Realiza un programa que pinte por pantalla un rombo hueco hecho con
 * asteriscos. El programa debe pedir la altura. Se debe comprobar que la altura
 * sea un número impar mayor o igual a 3, en caso contrario se debe mostrar un
 * mensaje de error.
 */
import java.util.Scanner;
public class Ejercicio40 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce la altura del rombo: ");
    int alt = sc.nextInt();
    if (alt % 2 == 0 || alt < 3) {
      System.out.println("La altura introducida no es correcta");
    } else {
      for (int i = 1; i <= alt/2; i++) {
        for (int j = i; j <= alt-1; j++) {
          System.out.print(" ");
        }
        for (int j = 1; j <= (i*2-1); j++) {
          if (i == alt || j == 1 || j == i*2-1) {
            System.out.print("*");
          } else {
            System.out.print(" ");
          }
        }
        System.out.println();
      }

      for (int i = (alt+1)/2; i >= 1; i--) {
        for (int j = i; j <= alt-1; j++) {
          System.out.print(" ");
        }
        for (int j = 1; j <= (i*2-1); j++) {
          if (i == alt || j == 1 || j == i*2-1) {
            System.out.print("*");
          } else {
            System.out.print(" ");
          }
        }
        System.out.println();
      }
    }
    sc.close();
  }
}
