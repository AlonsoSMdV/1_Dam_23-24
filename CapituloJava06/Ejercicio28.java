package CapituloJava06;
/**
 * Realiza un programa que sea capaz de recolocar los números de un array de
 * fuera hacia adentro. En primer lugar, el programa pedirá al usuario el tamaño
 * del array. A continuación generará un array con ese tamaño con números
 * enteros aleatorios entre 0 y 200 ambos incluidos. Seguidamente el programa
 * irá colocando desde fuera hacia adentro los números de tal forma que el
 * primero se coloca en la primera posición, el segundo en la última, el tercero
 * en la segunda, el cuarto en la penúltima, el quinto en la tercera, en sexto en la
 * antepenúltima, etc. Se debe mostrar por pantalla tanto el array original como
 * el array resultado
 */
import java.util.Scanner;
public class Ejercicio28 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduzca el tamaño del array: ");
    int tamaño = sc.nextInt();
    int[] array1 = new int[tamaño];
    for (int i = 0; i < tamaño; i++) {
      array1[i] = (int)(Math.random()*201);
    }
    System.out.println("\nArray original:");
    System.out.print("Índice ");
    for (int i = 0; i < tamaño; i++) {
      System.out.printf("%5d", i);
    }
    System.out.print("\nValor  ");
    for (int i = 0; i < tamaño; i++) {
      System.out.printf("%5d", array1[i]);
    }
    int[] array2 = new int[tamaño];
    int izquierda = 0;
    int derecha = tamaño - 1;
    for (int i = 0; i < tamaño; i++) {
      if (i % 2 == 0) {
        array2[izquierda++] = array1[i];
      } else {
        array2[derecha--] = array1[i];
      }
    }
    System.out.println("\n\nArray resultado:");
    System.out.print("Índice ");
    for (int i = 0; i < array2.length; i++) {
      System.out.printf("%5d", i);
    }
    System.out.print("\nValor  ");
      for (int i = 0; i < array2.length; i++) {
    System.out.printf("%5d", array2[i]);
    }
    sc.close();
  }
}