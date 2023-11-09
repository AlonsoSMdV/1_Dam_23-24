package CapituloJava06;
/**
 * mplementa el juego piedra, papel y tijera. Primero, el usuario introduce su
 * jugada y luego el ordenador genera al azar una de las opciones. Si el usuario
 * introduce una opción incorrecta, el programa deberá mostrar un mensaje de
 * error.
 */

import java.util.Scanner;

public class Ejercicio27 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijera): ");
    String jugada1 = sc.next();
    if(jugada1.equals("tijera") || jugada1.equals("piedra") || jugada1.equals("papel")){
      int jugada2 = (int)(Math.random()*3+1);
      String jugada2String = "";
      switch (jugada2) {
        case 1:
          jugada2String = "tijera";
          break;

        case 2:
          jugada2String = "piedra";
          break;

        case 3:
          jugada2String = "papel";
          break;
      
        default:
          break;
      }
      System.out.println("Turno del ordenador: "+jugada2String);
      
      if(jugada1.equals(jugada2String)){
        System.out.println("Empate");
      }else{

        int ganador = 2;
        switch (jugada1) {
          case "tijeras":
            if (jugada2String.equals("papel")) {
              ganador = 1;
            }
            break;
          
          case "papel":
            if (jugada2String.equals("piedra")) {
              ganador = 1;
            }
            break;

          case "piedra":
            if (jugada2String.equals("tijera")) {
              ganador = 1;
            }
            break;
          
          default:
            break;
        }
        if (ganador == 1) {
          System.out.println("Gana el jugador 1");
        }else{
          System.out.println("Gana el ordenador ");
        }
      
      }
    }else{
      System.out.println("No se han introducido los datos correctos");
    }
    sc.close();
  }
}
