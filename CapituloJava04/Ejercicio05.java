package CapituloJava04;
/**
 * Realiza un programa que resuelva una ecuación de primer grado (del tipo ax+b = 0).
 */
import java.util.Scanner;

public class Ejercicio05 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Este programa resuelve ecuaciones de primer grado del tipo ax + b = 0");
    System.out.print("Por favor, introduzca el valor de a: ");
    double a = sc.nextInt();
    System.out.print("Ahora introduzca el valor de b: ");
    double b = sc.nextInt();

    if(a == 0){
      System.out.println("Esa ecuación no tiene solución real.");
    }else{
      double ecuacion = -b/a;
      System.out.printf("x = %.2f",ecuacion);
    }
    sc.close();
  }
}
