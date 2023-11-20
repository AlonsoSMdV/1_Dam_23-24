package CapituloJava06;
/**
 * Realiza un programa que pinte por pantalla una cuba con cierta cantidad de
 * agua. La capacidad será indicada por el usuario. La cuba se llenará con una
 * cantidad aleatoria de agua que puede ir entre 0 y la capacidad máxima que
 * pueda admitir. El ancho de la cuba no varía.
 */
import java.util.Scanner;
public class Ejercicio20 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Por favor, indique la capacidad de la cuba en litros: ");
    int capacidad = sc.nextInt();
    int cantidad = (int)(Math.random()*capacidad+1);
    for (int i = capacidad; i >= 1; i--) {
      if (i <= cantidad) {
        System.out.println("*\033[34m===\033[37m*");
      } else {
        System.out.println("*   *");
      }
      
    }
    System.out.println("*****");
    System.out.println("La cuba tiene una capacidad de "+capacidad+" litros y contiene "+cantidad+" litros de agua");
    sc.close();
  }
}
