package CapituloJava07.A_ArrayUnidimensionales;
/**
 * Realiza un programa que pida 8 números enteros y que luego muestre esos
 * números junto con la palabra “par” o “impar” según proceda.
 */
import java.util.Scanner;
public class Ejercicio09 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduzca 8 numeros enteros");
    int[] numeros = new int[8];
    for (int i = 0; i < numeros.length; i++) {
      int n = sc.nextInt();
      numeros[i] = n;
    }

    for (int i = 0; i < numeros.length; i++) {
      if (numeros[i] % 2 == 0) {
        System.out.printf("%5d par", numeros[i]);
      }else{
        System.out.printf("%5d impar", numeros[i]);
      }
    }
    sc.close();
  }
}
