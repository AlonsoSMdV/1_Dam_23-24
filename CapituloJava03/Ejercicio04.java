package CapituloJava03;
/**
 * Escribe un programa que sume, reste, multiplique y divida dos números
 * introducidos por teclado.
 */
import java.util.Scanner;

public class Ejercicio04 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduzca un número: ");
    int x = sc.nextInt();
    System.out.print("Introduzca otro número: ");
    int y = sc.nextInt();

    int mult = x * y;
    int suma = x + y;
    int resta = x - y;
    double division = x / y;
    System.out.println("El resultado de su suma es "+x+" + "+y+" = "+suma);
    System.out.println("El resultado de su resta es "+x+" - "+y+" = "+resta);
    System.out.println("El resultado de su multiplicación es "+x+" * "+y+" = "+mult);
    System.out.println("El resultado de su división es "+x+" / "+y+" = "+division);
    sc.close();
  }
}
