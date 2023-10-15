package CapituloJava05;
/**
 * Escribe un programa que muestre los n primeros términos de la serie de
 * Fibonacci. El primer término de la serie de Fibonacci es 0, el segundo es 1 y
 * el resto se calcula sumando los dos anteriores, por lo que tendríamos que los
 * términos son 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144… El número n se debe
 * introducir por teclado.
 */
import java.util.Scanner;
public class Ejercicio12 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce cuantos numeros desea sacar: ");
    int nums = sc.nextInt();
    int num1 = 0;
    int num2 = 1;
    for (int i = 0; i < nums; i++) {
      System.out.print(num1+" ");
      num1 = num1 + num2;
      num2 = num1 - num2;
    }
    sc.close();
  }
}
