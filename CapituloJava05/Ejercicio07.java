package CapituloJava05;
/**
 * Realiza el control de acceso a una caja fuerte. La combinación será un
 * número de 4 cifras. El programa nos pedirá la combinación para abrirla. Si no
 * acertamos, se nos mostrará el mensaje “Lo siento, esa no es la combinación”
 * y si acertamos se nos dirá “La caja fuerte se ha abierto satisfactoriamente”.
 * Tendremos cuatro oportunidades para abrir la caja fuerte.
 */

import java.util.Scanner;
public class Ejercicio07 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int combinacion = 4972;
    int oportunidades = 4;
    do {
      System.out.print("Introduzca la contraseña de 4 digitos (tiene "+oportunidades+" oportunidades): ");
      int contraseña = sc.nextInt();
      if (contraseña == combinacion) {
        System.out.println("La caja fuerte se ha abierto satisfactoriamente");
        oportunidades = 0;
      } else {
        System.out.println("Lo siento, esa no es la combinación");
        oportunidades--;
      }
    } while (oportunidades >= 1);
    sc.close();
  }
}
