package CapituloJava05;
/**
 * Escribe un programa que calcule el factorial de un número entero leído por
 * teclado. 
 */
import java.util.Scanner;
public class Ejercicio28 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce un numero: ");
    int n = sc.nextInt();
    long factorial = 1;
    if (n < 0 ) {
      System.out.println("No existe el factorial de un negativo");
    }else if (n == 0) {
      System.out.println("0! = 1");
    }else{
      for (int i = 1; i <= n; i++) {
        factorial*=i;
      }
      System.out.printf("%d! = %d",n,factorial);
    }
    
    sc.close();
  }
}
