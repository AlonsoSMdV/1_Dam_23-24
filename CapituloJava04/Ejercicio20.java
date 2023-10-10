package CapituloJava04;
/**
 * Realiza un programa que diga si un número entero positivo introducido por
 * teclado es capicúa. Se permiten números de hasta 5 cifras.
 */
import java.util.Scanner;

public class Ejercicio20 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce un número: ");
    int n = Math.abs(sc.nextInt());
    if(n<0){
      System.out.println("Este número no es válido");
    }else if(n < 10  ){
      System.out.println("Es un número de una sola cifra");
    }else if(n < 100 && n/10 == n%10){
      System.out.println("Es capicúo");
    }else if( n < 1000 && n/100 == n%10){
      System.out.println("Es un número de tres cifras");
    }else if(n < 10000 && n/1000 == n%10 && ((n/100)%10)== ((n/10)%10)){
      System.out.println("Es un número de cuatro cifras");
    }else if(n < 100000 && n/10000 == n%10 && ((n/1000)%10)== ((n/10)%10)){
      System.out.println("Es un número de cinco cifras");
    }
    sc.close();
  }
}
