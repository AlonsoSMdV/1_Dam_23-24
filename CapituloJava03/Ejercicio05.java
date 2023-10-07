package CapituloJava03;
/**
 * Escribe un programa que calcule el área de un rectángulo.
 */
import java.util.Scanner;

public class Ejercicio05 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduzca la base del rectángulo: ");
    int base = sc.nextInt();
    System.out.print("Introduzca la altura del rectángulo: ");
    int altura = sc.nextInt();

    int area = base * altura;
    System.out.println("Su área es "+base+" * "+altura+" = "+area);
    sc.close();
  }
}
