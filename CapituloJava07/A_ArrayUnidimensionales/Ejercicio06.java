package CapituloJava07.A_ArrayUnidimensionales;
/**
 * Escribe un programa que lea 15 números por teclado y que los almacene en un
 * array. Rota los elementos de ese array, es decir, el elemento de la posición 0
 * debe pasar a la posición 1, el de la 1 a la 2, etc. El número que se encuentra en
 * la última posición debe pasar a la posición 0. Finalmente, muestra el contenido
 * del array.
 */
import java.util.Scanner;
public class Ejercicio06 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce 15 numeros");
    int[] numeros = new int[15];
    for (int i = 0; i < numeros.length; i++) {
      int n = sc.nextInt();
      numeros[i] = n;
    }
    System.out.print("Indice ");
    for (int i = 1; i <= 15; i++) {
      System.out.printf("%5d",i);
    }
    System.out.println();
    System.out.print("Valor  ");
    for (int i = 0; i < 15; i++) {
      System.out.printf("%5d", numeros[i]);
    }
    int[] resultado = new int[15];
    for (int i = 0; i < 15; i++) {
      if (i<14) {
        resultado[i+1] = numeros[i];
      }else{
        resultado[0] = numeros[i];
      }
    }
    System.out.println();
      System.out.print("Indice ");
    for (int i = 1; i <= 15; i++) {
      System.out.printf("%5d",i);
    }
    System.out.println();
    System.out.print("Valor  ");
    for (int i = 0; i < 15; i++) {
      System.out.printf("%5d", resultado[i]);
    }
    sc.close();
  }
}
