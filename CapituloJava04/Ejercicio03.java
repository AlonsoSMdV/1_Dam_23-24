package CapituloJava04;
/**
 * Escribe un programa en que dado un número del 1 a 7 escriba el correspondiente nombre del día de la semana.
 */
import java.util.Scanner;

public class Ejercicio03 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduzca un número del 1 al 7: ");
    int num = sc.nextInt();

    switch (num) {
      case 1:
        System.out.println("Lunes");
        break;

      case 2:
        System.out.println("Martes");
        break;

      case 3:
        System.out.println("Miércoles");
        break;

      case 4:
        System.out.println("Jueves");
        break;

      case 5:
        System.out.println("Viernes");
        break;

      case 6:
        System.out.println("Sábado");
        break;

      case 7:
        System.out.println("Domingo");
        break;
    
      default:
        break;
    }
    sc.close();
  }
}
