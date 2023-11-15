package CapituloJava07.A_ArrayUnidimensionales;
/**
 * Realiza un programa que sea capaz de insertar un número en una posición
 * concreta de un array. En primer lugar, el programa generará un array de 12
 * números enteros aleatorios entre 0 y 200 ambos incluidos. A continuación se
 * debe mostrar el contenido de ese array junto al índice (0 – 11). Seguidamente
 * el programa preguntará por el número que se quiere insertar y por la posición
 * donde será insertado. Los números del array se desplazan a la derecha para
 * dejar sitio al nuevo. El último número (el que se encuentra en la posición 11)
 * siempre se perderá.
 */
import java.util.Scanner;
public class Ejercicio19 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] nums = new int[12];
    for (int i = 0; i < nums.length; i++) {
      nums[i] = (int)(Math.random()*201);
    }
    System.out.println("Array original:");
    System.out.println("┌────────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐\r");
    System.out.print("│ Índice │");
    for (int i = 0; i < nums.length; i++) {
      System.out.printf("%4d │",i);
    }
    System.out.println();
    System.out.println("├────────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤\r");
    System.out.print("│ Valor  │");
    for (int i = 0; i < nums.length; i++) {
      System.out.printf("%4d │",nums[i]);
    }
    System.out.println();
    System.out.println("└────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘\r");
    System.out.println();
    System.out.print("Introduce el numero que desea insertar: ");
    int n = sc.nextInt();
    System.out.print("Introduce la posion(0 - 11): ");
    int pos = sc.nextInt();
    for (int i = 11; i >= pos; i--) {
      nums[i] = nums[i-1];
    }
    nums[pos] = n;
    System.out.println("Array resultado:");
    System.out.println("┌────────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐\r");
    System.out.print("│ Índice │");
    for (int i = 0; i < nums.length; i++) {
      System.out.printf("%4d │",i);
    }
    System.out.println();
    System.out.println("├────────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤\r");
    System.out.print("│ Valor  │");
    for (int i = 0; i < nums.length; i++) {
      System.out.printf("%4d │",nums[i]);
    }
    System.out.println();
    System.out.println("└────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘\r");
    sc.close();
  }
}
