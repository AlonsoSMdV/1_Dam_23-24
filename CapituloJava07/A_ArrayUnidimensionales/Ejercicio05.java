package CapituloJava07.A_ArrayUnidimensionales;
/**
 * Escribe un programa que pida 10 números por teclado y que luego muestre los
 * números introducidos junto con las palabras “máximo” y “mínimo” al lado del
 * máximo y del mínimo respectivamente.
 */
import java.util.Scanner;
public class Ejercicio05 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] n = new int[10];
    int maximo = Integer.MIN_VALUE;
    int minimo = Integer.MAX_VALUE;
    System.out.println("Introduzca 10 numeros");
    for (int i = 0; i < n.length; i++) {
      int num = sc.nextInt();
      n[i] = num;
      if(num > maximo){
        maximo = num;
      }
      if(num < minimo){
        minimo = num;
      }

    }

    for (int i = 0; i < n.length; i++) {
      if(n[i] == maximo){
        System.out.printf("%5d maximo ", n[i]);
      }else if(n[i] == minimo){
        System.out.printf("%5d minimo ", n[i]);
      }else{
        System.out.printf("%5d ", n[i]);
      }
    }
    sc.close();
  }
}
