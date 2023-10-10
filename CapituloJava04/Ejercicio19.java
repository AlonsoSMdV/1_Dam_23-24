package CapituloJava04;
/**
 * Realiza un programa que nos diga cuántos dígitos tiene un número entero que
 * puede ser positivo o negativo. Se permiten números de hasta 5 dígitos.
 */
import java.util.Scanner;

public class Ejercicio19 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce un número: ");
    int n = Math.abs(sc.nextInt());
    if(n < 10  ){
      System.out.println("Es un número de una sola cifra");
    }else if(n < 100 ){
      System.out.println("Es un número de dos cifras");
    }else if( n < 1000 ){
      System.out.println("Es un número de tres cifras");
    }else if(n < 10000 ){
      System.out.println("Es un número de cuatro cifras");
    }else if(n < 100000 ){
      System.out.println("Es un número de cinco cifras");
    }
    sc.close();
  }
}
