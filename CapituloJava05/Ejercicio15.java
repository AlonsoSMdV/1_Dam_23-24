package CapituloJava05;
/**
 * Escribe un programa que dados dos números, uno real (base) y un entero
 * positivo (exponente), saque por pantalla todas las potencias con base el
 * numero dado y exponentes entre uno y el exponente introducido. No se deben
 * utilizar funciones de exponenciación. Por ejemplo, si introducimos el 2 y el 5,
 * se deberán mostrar 2^1, 2^2, 2^3, 2^4 y 2^5.
 */
import java.util.Scanner;
public class Ejercicio15 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce la base: ");
    int base = sc.nextInt();
    System.out.print("Introduce la base: ");
    int ultExponente = sc.nextInt();
    int potencia;
    if (ultExponente == 0) {
      base = 1;
    }else if (ultExponente > 0) {
      for (int i = 1; i <= ultExponente; i++) {
        potencia=1;
        for (int j = 0; j < i; j++) {
          potencia*=base;
        }
        System.out.println(base+"^"+i+" = "+potencia);
      }
    }
    sc.close();
  }
}
