package CapituloJava04;

import java.util.Scanner;

/**
 * Escribe un programa que diga cuál es la última cifra de un número entero
 * introducido por teclado.
 */
public class Ejercicio17 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce un número: ");
    int n = sc.nextInt();
    if(n < 10 ){
      System.out.println("Es un número de una sola cifra");
    }else{
      System.out.println("Su ultima cifra es"+(n%10));
    }
    sc.close();
  }
}
