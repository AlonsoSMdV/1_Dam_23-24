package CapituloJava05;
/**
 * Escribe un programa que obtenga los números enteros comprendidos entre dos
 * números introducidos por teclado y validados como distintos, el programa debe
 * empezar por el menor de los enteros introducidos e ir incrementando de 7 en 7.
 */
import java.util.Scanner;
public class Ejercicio18 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce un numero: ");
    int n = sc.nextInt();
    System.out.print("Introduce otro numero: ");
    int n1 = sc.nextInt();
    if(n1 < n){
      int aux = n;
      n = n1;
      n1 = aux;
      for (int i = n; i <= n1; i+=7) {
        System.out.print(i+" ");
      }
    }else if(n == n1){
      System.out.println("Esta accion no es valida");
    }else if(n < n1){
      for (int i = n; i <= n1; i+=7) {
        System.out.print(i+" ");
      }
    }
    sc.close();
  }
}
