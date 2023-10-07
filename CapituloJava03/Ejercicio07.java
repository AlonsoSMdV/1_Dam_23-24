package CapituloJava03;
/**
 * Escribe un programa que calcule el total de una factura a partir de la base
 * imponible.
 */
import java.util.Scanner;

public class Ejercicio07 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduzca la base imponible: ");
    double base = sc.nextDouble();
    System.out.printf("Precio base %8.2f€\n",base);
    System.out.printf("IVA         %8.2f€\n",base*0.21);
    System.out.println("----------------------");
    System.out.printf("Total       %8.2f€\n",base*1.21);
    sc.close();
  }
}
