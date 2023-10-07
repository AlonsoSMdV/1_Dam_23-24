package CapituloJava03;
/**
 * Escribe un programa que calcule el área de un triángulo.
 */
import java.util.Scanner;

public class Ejercicio06 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduzca la base del triángulo: ");
    int base = sc.nextInt();
    System.out.print("Introduzca la altura del triángulo: ");
    int altura = sc.nextInt();

    int area = (base * altura)/2;
    System.out.println("Su área es ("+base+" * "+altura+")/2 = "+area);
    sc.close();
  }
}
