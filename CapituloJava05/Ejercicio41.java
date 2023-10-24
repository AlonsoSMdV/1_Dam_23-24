package CapituloJava05;
/**
 * Escribe un programa que diga cuántos dígitos pares y cuántos dígitos impares
 * hay dentro de un número. Se recomienda usar long en lugar de int ya que el
 * primero admite números más largos.
 */
import java.util.Scanner;
public class Ejercicio41 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce un numero: ");
    long n = sc.nextLong();
    long aux = n; 
    int par = 0;
    int impar = 0;
    while (aux > 0) {
      if ((aux%10)%2 == 0) {
        par++;
      } else {
        impar++;
      }
      aux /= 10;
    }
    System.out.printf("El %d contiene %d digitos par/es y %d digitos impar/es",n, par, impar);
    sc.close();
  }
}
