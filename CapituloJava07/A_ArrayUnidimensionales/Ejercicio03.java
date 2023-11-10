package CapituloJava07.A_ArrayUnidimensionales;
/**
 * Escribe un programa que lea 10 números por teclado y que luego los muestre
 * en orden inverso, es decir, el primero que se introduce es el último en mostrarse
 * y viceversa.
 */
import java.util.Scanner;
public class Ejercicio03 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Escriba una serie de 10 numeros");
    int[] num = new int[10];
    for (int i = num.length-1; i >= 0; i--) {
      int n = sc.nextInt();
      num[i] = n;
    }
    System.out.println();
    System.out.print("Indice ");
    for (int i = 1; i <= 10; i++) {
      System.out.printf("%5d",i);
    }
    System.out.println();
    System.out.print("Valor  ");
    for (int i = 0; i < num.length; i++) {
      System.out.printf("%5d",num[i]);
    }
    sc.close();
  }
}
