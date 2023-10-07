package CapituloJava03;
/**
 * Realiza un programa que pida dos números y que luego muestre el resultado
 * de su multiplicación.
 */
import java.util.Scanner;
public class Ejercicio01{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduzca un número: ");
    int x = sc.nextInt();
    System.out.print("Introduzca otro número: ");
    int y = sc.nextInt();

    int mult = x * y;
    System.out.println("El resultado de su multiplicación es "+x+" * "+y+" = "+mult);
    sc.close();
  }
}