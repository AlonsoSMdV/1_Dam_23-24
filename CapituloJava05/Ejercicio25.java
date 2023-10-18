package CapituloJava05;
/**
 * Realiza un programa que pida un número por teclado y que luego muestre ese
 * número al revés.
 */
import java.util.Scanner;
public class Ejercicio25 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduzca un numero: ");
    long n = sc.nextLong();
    long nReves = 0;
    while(n>0){
      nReves = (n%10) + (nReves*10);
      n/=10;
    }
    System.out.println(nReves);
    sc.close();
  }
}
