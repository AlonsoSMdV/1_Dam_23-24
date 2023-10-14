package CapituloJava05;
/**
 * Muestra la tabla de multiplicar de un número introducido por teclado.
 */
import java.util.Scanner;
public class Ejercicio08 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Intoduzca un número: ");
    int n = sc.nextInt();
    for (int i = 0; i <11; i++) {
      System.out.println(n+" X "+i+" = "+(n*i));
    }
    sc.close();
  }
}
