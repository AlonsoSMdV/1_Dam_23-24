package CapituloJava05;
/**
 *  Escribe un programa que pinte por pantalla la letra V. El ancho del palo de
 * la V es siempre de 3 asteriscos. El usuario debe introducir la altura. La altura
 * mínima es de 3 pisos. Si el usuario introduce una altura menor, el programa
 * debe mostrar un mensaje de error.
 */
import java.util.Scanner;
public class Ejercicio61 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduzca la altura de la V: ");
    int alt = sc.nextInt();
    if (alt < 3) {
      System.out.println("La altura es incorrecta");
    } else {
      for (int i = 1; i <= alt; i++) {
        for (int j = 1; j <= alt; j++) {
          if (j == i) {
            System.out.print("***");
          } else {
            System.out.print(" ");
          }
        }
        for (int j = 1; j <= alt; j++) {
          if (j == alt-i+1) {
            System.out.print("***");
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
