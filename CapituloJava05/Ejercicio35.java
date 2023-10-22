package CapituloJava05;
/**
 * Realiza un programa que pinte una X hecha de asteriscos. El programa debe
 * pedir la altura. Se debe comprobar que la altura sea un número impar mayor o
 * igual a 3, en caso contrario se debe mostrar un mensaje de error.
 */
import java.util.Scanner;
public class Ejercicio35 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Por favor, introduzca la altura de la x: ");
    int alt = sc.nextInt();
    for (int i = 0; i < alt; i++) {
      for (int j = 0; j < alt; j++) {
        if(j == i || j == alt-i-1){
          System.out.print("*");
        }else{
          System.out.print(" ");
        }
      }
      System.out.println();
    }
    sc.close();
  }
}
