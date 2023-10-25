package CapituloJava05;
/**
 * Realiza un programa que pinte por pantalla un rectángulo hueco hecho con
 * asteriscos. Se debe pedir al usuario la anchura y la altura. Hay que comprobar
 * que tanto la anchura como la altura sean mayores o iguales que 2, en caso
 * contrario se debe mostrar un mensaje de error.
 */
import java.util.Scanner;
public class Ejercicio46 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduzca la anchura del rectangulo(Como minimo debe ser 2): ");
    int ancho = sc.nextInt();
    System.out.print("Introduzca la altura del rectangulo(Como minimo debe ser 2): ");
    int alto = sc.nextInt();
    if(alto < 2 || ancho < 2){
      System.out.println("Loa datos introducidos son incorrectos, tanto la altura como el ancho deben ser minimo 2");
    }else{
      for (int i = 1; i <= alto; i++) {
        for (int j = 1; j <= ancho; j++) {
          if (i == 1 || i == alto || j == 1 || j == ancho) {
            System.out.print("* ");
          } else {
            System.out.print("  ");
          }
        }
        System.out.println();
      }
    }
    sc.close();
  }
}
