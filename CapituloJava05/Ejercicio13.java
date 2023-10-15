package CapituloJava05;
/**
 * Escribe un programa que lea una lista de diez números y determine cuántos
 * son positivos, y cuántos son negativos.
 */
import java.util.Scanner;
public class Ejercicio13 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int positivos = 0;
    int negativos = 0;
    int ceros = 0;
    for (int i = 0; i < 10; i++) {
      System.out.print("Introduce un numero: ");
      int n = sc.nextInt();
      if (n > 0) {
        positivos++;
      } else if (n < 0) {
        negativos++;
      } else if(n==0){
        ceros++;
      }
      
    }
    System.out.println("Hay "+positivos+" numeros positivos, "+negativos+" numeros negativos y "+ceros+" ceros.");
    sc.close();
  }
}

