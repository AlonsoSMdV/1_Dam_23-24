package CapituloJava05;
/**
 * Escribe un programa que pida un número entero positivo por teclado y que
 * muestre a continuación los números desde el 1 al número introducido junto
 * con su factorial.
 */
import java.util.Scanner;
public class Ejercicio39 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce un numero: ");
    int n = sc.nextInt();
    long factorial = 1;
    if (n == 0) {
      System.out.println("0! = 1");
    } else if (n < 0) {
      System.out.println("No existe el factorial de un negativo");
    } else {
      for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= i; j++) {
          factorial *= j;
        }
        System.out.println(i+"! = "+factorial);
        factorial = 1;
      }
    }
    sc.close();
  }
}
