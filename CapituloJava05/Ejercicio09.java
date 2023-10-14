package CapituloJava05;
/**
 * Realiza un programa que nos diga cuántos dígitos tiene un número introducido
 * por teclado. Este ejercicio es equivalente a otro realizado anteriormente, con
 * la salvedad de que el anterior estaba limitado a números de 5 dígitos como
 * máximo. En esta ocasión, hay que realizar el ejercicio utilizando bucles; de
 * esta manera, la única limitación en el número de dígitos la establece el tipo de
 * dato que se utilice (int o long).
 */
import java.util.Scanner;
public class Ejercicio09 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduzca un numero: ");
    long n = sc.nextLong();
    int i = 0;
    while(n>0){
      n/=10;
      i++;
    }
    System.out.println("Tiene "+i+" digitos");
    sc.close();
  }
}
