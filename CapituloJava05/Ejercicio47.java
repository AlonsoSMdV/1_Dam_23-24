package CapituloJava05;
/**
 * Con motivo de la celebración del día de la mujer, el 8 de marzo, nos han
 * encargado realizar un programa que pinte un 8 por pantalla usando la letra
 * M. Se pide al usuario la altura, que debe ser un número entero impar mayor
 * o igual que 5. Si el número introducido no es correcto, el programa deberá
 * mostrar un mensaje de error. A continuación se muestran algunos ejemplos.
 * La anchura de la figura siempre será de 6 caracteres.
 */
import java.util.Scanner;
public class Ejercicio47 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce la altura(debe ser impar mayor o igual a 5): ");
    int alt = sc.nextInt();
    if (alt%2 == 0 || alt < 5) {
      System.out.println("La altura es incorrecta");
    } else {
      for (int i = 1; i <= alt; i++) {
        if (i == 1 || i == (alt+1)/2 || i == alt) {
          System.out.println("MMMMMM");
        } else {
          System.out.println("M    M");
        }
      }
    }
    sc.close();
  }
}
