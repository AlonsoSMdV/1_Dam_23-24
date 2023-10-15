package CapituloJava05;
/**
 * Escribe un programa que pida una base y un exponente (entero positivo) y que
 * calcule la potencia
 */
import java.util.Scanner;
public class Ejercicio14 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduzca la base: ");
    int base = sc.nextInt();
    System.out.print("Introduzca el exponente: ");
    int exponente = sc.nextInt();
    int aux = 1;
    if (exponente == 0) {
      base = 1;
    }else if (exponente > 0) {
      for (int i = 0; i < exponente; i++) {
        aux *= base;
      }
    }
    System.out.println(base+"^"+exponente+" = "+aux);
    sc.close();
  }
}
