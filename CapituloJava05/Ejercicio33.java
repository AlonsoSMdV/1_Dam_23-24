package CapituloJava05;
/**
 * Realiza un programa que pinte la letra U por pantalla hecha con asteriscos. El
 * programa pedirá la altura. Fíjate que el programa inserta un espacio y pinta
 * dos asteriscos menos en la base para simular la curvatura de las esquinas
 * inferiores.
 */
import java.util.Scanner;
public class Ejercicio33 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduzca la altura de la U: ");
    int alt = sc.nextInt();
    for (int i = 0; i < alt; i++) {
      for (int j = 0; j < alt; j++) {
        
        if (i == alt-1) {
          if (j == 0 || j == alt-1) {
            System.out.print("  ");
          }else{
            System.out.print("* ");
          }
        }else{
          if (j == 0 || j == alt-1) {
            System.out.print("* ");
          }else{
            System.out.print("  ");
          }
        }
      }
      System.out.println();
    }
    sc.close();
  }
}
