package CapituloJava05;
/**
 * Realiza un programa que pinte una escalera que va descendiendo de izquierda
 * a derecha. El programa pedirá el número de escalones y la altura de cada
 * escalón. La anchura de los escalones siempre es la misma: 4 asteriscos.
 */
import java.util.Scanner;
public class Ejercicio67 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduzca el número de escalones: ");
    int nEscalones = sc.nextInt();
    System.out.print("Introduzca la altura de cada escalón: ");
    int alturaEscalones = sc.nextInt();
    String escalon = "****";
    for (int i = 1; i <= nEscalones ; i++) {
      for (int k = 1; k <= alturaEscalones; k++) {
        System.out.println(escalon);
      }
      escalon+="****";
    }
    sc.close();
  }
}
