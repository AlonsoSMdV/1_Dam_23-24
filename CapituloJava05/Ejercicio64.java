package CapituloJava05;
/**
 * Escribe un programa que pinte por pantalla un rectángulo hueco de 6 caracteres de ancho por 3 de alto y, a continuación, un menú que permita agrandarlo,
 * achicarlo o cambiar su orientación. Cada vez que el rectángulo se agranda,
 * se incrementa en 1 tanto su anchura como su altura. Cuando se achica,
 * se decrementa en 1 su anchura y altura. Por último, cuando se cambia la
 * orientación, los valores de anchura y altura se intercambian. El valor mínimo
 * de la altura o la anchura es 2.
 */

import java.util.Scanner;
public class Ejercicio64 {
  public static void menu(){
    System.out.println("1. Agrandarlo");
    System.out.println("2. Achicarlo");
    System.out.println("3. Cambiar la orientación");
    System.out.println("4. Salir");
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int alto = 3, ancho = 6;
    

    int opcion = 0;
    do {
      for (int i = 1; i <= alto; i++) {
      for (int j = 1; j <= ancho; j++) {
        if (j == 1 || j == ancho || i == 1 || i == alto) {
          System.out.print("*");
        }else{
          System.out.print(" ");
        }
      }
      System.out.println();
    }
      menu();
    System.out.print("Que desea hacer con el rectangulo: ");
    opcion = sc.nextInt();

    switch (opcion) {
      case 1:
        alto += 1;
        ancho += 1;
        break;

      case 2:
        alto -= 1;
        ancho -= 1;
        break;

      case 3:
        int aux = alto;
        alto = ancho;
        ancho = aux;
        break;

    
      default:
        System.out.println("Gracias por usar el programa.");
        break;
    }
    } while (opcion != 4);
    sc.close();
  }
}
