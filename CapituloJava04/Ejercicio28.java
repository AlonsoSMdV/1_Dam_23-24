package CapituloJava04;
/**
 * Implementa el juego piedra, papel y tijera. Primero, el usuario 1 introduce
 * su jugada y luego el usuario 2. Si alguno de los usuarios introduce una opción
 * incorrecta, el programa deberá mostrar un mensaje de error.
 */
import java.util.Scanner;

public class Ejercicio28 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijera): ");
    String jugada1 = sc.next();
    System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijera): ");
    String jugada2 = sc.next();
    if(jugada1.equals(jugada2)){
      System.out.println("Empate");
    }else{

      int ganador = 2;
      switch (jugada1) {
        case "tijeras":
        if (jugada2.equals("papel")) {
          ganador = 1;
        }
        break;
        
        case "papel":
        if (jugada2.equals("piedra")) {
          ganador = 1;
        }
        break;

        case "piedra":
        if (jugada2.equals("tijera")) {
          ganador = 1;
        }
        break;
        
      default:
      break;
    }
    System.out.println("Gana el jugador "+ganador);
  }
    sc.close();
  }
}
