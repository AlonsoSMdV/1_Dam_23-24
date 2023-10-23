package CapituloJava05;
/**
 * Realiza un programa que pinte un reloj de arena relleno hecho de asteriscos. El
 * programa debe pedir la altura. Se debe comprobar que la altura sea un número
 * impar mayor o igual a 3, en caso contrario se debe mostrar un mensaje de error.
 */
import java.util.Scanner;
public class Ejercicio38 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce la altura del reloj de arena: ");
    int alt = sc.nextInt();
    if (alt % 2 == 0 || alt < 3) {
      System.out.println("La altura introducida no es correcta");
    } else {
      for (int i = 0; i < alt; i++) {
        for (int j = 0; j < alt; j++) {
          if (j >= i && j <= alt-i-1 || j <= i && j >= alt-i-1) {
            System.out.print("*");
          }else{
            System.out.print(" ");
          }
        }
        System.out.println();
      }
    }
    sc.close();
  }
}
