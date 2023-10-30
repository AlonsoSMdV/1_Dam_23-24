package CapituloJava05;
/**
 * Escribe un programa que pinte por pantalla la letra A. El usuario debe introducir
 * la altura total y la fila en la que debe aparecer el palito horizontal (contando
 * desde el vértice). La altura mínima es de 3 pisos. La fila donde va el palito
 * horizontal debe ser mayor que 1 y menor que la altura total. Si el usuario
 * introduce algún dato incorrecto, el programa debe mostrar un mensaje de error.
 */
import java.util.Scanner;
public class Ejercicio65 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduzca la altura de la A (un número mayor o igual a 3): ");
    int altura = sc.nextInt();
    System.out.print("Introduzca la fila del palito horizontal (entre 2 y "+(altura-1)+"): ");
    int posicion = sc.nextInt();
    if (altura < 3 || posicion >= altura || posicion < 2) {
      System.out.println("Los datos introducidos no son correctos");
    } else {
      for (int i = 1; i <= altura; i++) {
        for (int j = altura; j >= 2; j--) {
          if (j == i || i == posicion && j <= i) {
            System.out.print("*");
          } else {
            System.out.print(" ");
          }
        }
        
        for (int j = 1; j <= altura; j++) {
          if (j == i || i == posicion && j <= i) {
            System.out.print("*");
          } else {
            System.out.print(" ");
          }
          
        }
        System.out.println();
      }
    }
    sc.close();
  }

}
