package CapituloJava05;
/**
 * Escribe un programa que pida un número entero positivo por teclado y que
 * muestre a continuación los 5 números consecutivos a partir del número
 * introducido. Al lado de cada número se debe indicar si se trata de un primo
 * o no.
 */
import java.util.Scanner;
public class Ejercicio42 {
  public static boolean esPrimo(int n){
    boolean esPrimo = true;
    for (int i = 2; i < n; i++) {
      if(n%i!=0){
        esPrimo = true;
      }else{
        esPrimo = false;
        break;
      }
    }
    return esPrimo;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduzca un numero: ");
    int n = sc.nextInt();
    for (int i = n; i < n+5; i++) {
      if (esPrimo(i)) {
        System.out.println(i+" es primo");
      } else {
        System.out.println(i+" no es primo");
      }
    }
    sc.close();
  }
}
