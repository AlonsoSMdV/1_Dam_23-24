package CapituloJava05;
/**
 * Según cierta cultura oriental, los números de la suerte son el 3, el 7, el 8 y el 9.
 * Los números de la mala suerte son el resto: el 0, el 1, el 2, el 4, el 5 y el 6. Un
 * número es afortunado si contiene más números de la suerte que de la mala
 * suerte. Realiza un programa que diga si un número introducido por el usuario
 * es afortunado o no
 */
import java.util.Scanner;
public class Ejercicio62 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce un numero: ");
    long num = sc.nextLong();
    long aux = num;
    int nSuerte = 0;
    int nSinSuerte = 0;
    while (aux > 0) {
      if (aux%10 == 3 || aux%10 == 7 || aux%10 == 8 || aux%10 == 9) {
        nSuerte++;
      } else {
        nSinSuerte++;
      }
      aux/=10;
    }
    if (nSuerte > nSinSuerte) {
      System.out.println("El "+num+" es un numero con suerte");
    } else {
      System.out.println("El "+num+" es un numero sin suerte");
    }
    sc.close();
  }
}
