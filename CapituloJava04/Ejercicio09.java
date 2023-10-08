package CapituloJava04;
/**
 * Realiza un programa que resuelva una ecuación de segundo grado (del tipo
 * ax^2 + bx + c = 0).

 */
import java.util.Scanner;

public class Ejercicio09 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Este programa resuelve ecuaciones de segundo grado del tipo ax^2 + bx + c = 0");
    System.out.print("Por favor, introduzca el valor de a: ");
    double a = sc.nextInt();
    System.out.print("Ahora introduzca el valor de b: ");
    double b = sc.nextInt();
    System.out.print("Por último introduzca el valor de c: ");
    double c = sc.nextInt();

    if(a == 0){
      System.out.println("Esa ecuación no tiene solución real.");
    }else{
      double ecuacion1 = (-b+Math.sqrt(Math.pow(b, 2)-(4*a*c)))/(2*a);
      double ecuacion2 = (-b-Math.sqrt(Math.pow(b, 2)-(4*a*c)))/(2*a);;
      System.out.printf("x = %.2f\n",ecuacion1);
      System.out.printf("x = %.2f",ecuacion2);
    }
    sc.close();
  }
}
