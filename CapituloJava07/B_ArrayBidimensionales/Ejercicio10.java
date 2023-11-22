package CapituloJava07.B_ArrayBidimensionales;
/**
 * Realiza el juego de las tres en raya.
 */
import java.util.Scanner;
public class Ejercicio10 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Hola este programa es el tres en raya aqui teneis el tablero \nIntroduzca numeros del entre el 1 y el 3");
    System.out.print("Que simbolo desea ser X u O: ");
    String simboloJugador = sc.next();
    String simboloCPU = "";
    switch (simboloJugador) {
      case "X":
        simboloCPU = "O";
        break;

      case "O":
        simboloCPU = "X";
        break;
    
      default:
        break;
    }
    String tablero[][] = new String[3][3];
    int filas;
    int columnas;
    for (filas = 0; filas < tablero.length; filas++) {
        
        for (columnas = 0; columnas < tablero.length; columnas++) {
          tablero[filas][columnas] = " ";
          
        }
      }
    int movimientos = 0;
    boolean ganaJugador = false;
    boolean ganaCPU = false;
    do {
      System.out.println("┌─┬─┬─┐");
      for (filas = 0; filas < tablero.length; filas++) {
        System.out.print("│");
        for (columnas = 0; columnas < tablero.length; columnas++) {
          System.out.print(tablero[filas][columnas] + "│");
        }
        System.out.println();
        if (filas == tablero.length - 1) {
          
        }else{
          System.out.println("├─┼─┼─┤");
        }
      }
      System.out.println("└─┴─┴─┘");
      System.out.println();
      System.out.println("Jugador: ");
      System.out.print("Fila: ");
      int filaJ = sc.nextInt();
      filaJ--;
      System.out.print("Columna: ");
      int columnaJ = sc.nextInt();
      columnaJ--;
      tablero[filaJ][columnaJ] = simboloJugador;
      if((tablero[0][0] == simboloJugador) && (tablero[0][1] == simboloJugador) && (tablero[0][2] == simboloJugador)
            ||
            (tablero[1][0] == simboloJugador) && (tablero[1][1] == simboloJugador) && (tablero[1][2] == simboloJugador)
            ||
            (tablero[2][0] == simboloJugador) && (tablero[2][1] == simboloJugador) && (tablero[2][2] == simboloJugador)
            ||
            (tablero[0][0] == simboloJugador) && (tablero[1][0] == simboloJugador) && (tablero[2][0] == simboloJugador)
            ||
            (tablero[0][1] == simboloJugador) && (tablero[1][1] == simboloJugador) && (tablero[2][1] == simboloJugador)
            ||
            (tablero[0][2] == simboloJugador) && (tablero[1][2] == simboloJugador) && (tablero[2][2] == simboloJugador)
            ||
            (tablero[0][0] == simboloJugador) && (tablero[1][1] == simboloJugador) && (tablero[2][2] == simboloJugador)
            ||
            (tablero[0][2] == simboloJugador) && (tablero[1][1] == simboloJugador) && (tablero[2][0] == simboloJugador)
            ){
              ganaJugador = true;
              break;
            }
      movimientos++;
      if (!ganaJugador || movimientos<9) {
        int filaCPU;
        int columnaCPU; 
        System.out.println("CPU: ");
        do {
          filaCPU = (int)(Math.random()*3);
          columnaCPU = (int)(Math.random()*3);
        } while (!tablero[filaCPU][columnaCPU].equals(" "));
        System.out.println("Fila: " + filaCPU);
        System.out.println("Columna: " + columnaCPU);
        tablero[filaCPU][columnaCPU] = simboloCPU;
        if ((tablero[0][0] == simboloCPU) && (tablero[0][1] == simboloCPU) && (tablero[0][2] == simboloCPU)
            ||
            (tablero[1][0] == simboloCPU) && (tablero[1][1] == simboloCPU) && (tablero[1][2] == simboloCPU)
            ||
            (tablero[2][0] == simboloCPU) && (tablero[2][1] == simboloCPU) && (tablero[2][2] == simboloCPU)
            ||
            (tablero[0][0] == simboloCPU) && (tablero[1][0] == simboloCPU) && (tablero[2][0] == simboloCPU)
            ||
            (tablero[0][1] == simboloCPU) && (tablero[1][1] == simboloCPU) && (tablero[2][1] == simboloCPU)
            ||
            (tablero[0][2] == simboloCPU) && (tablero[1][2] == simboloCPU) && (tablero[2][2] == simboloCPU)
            ||
            (tablero[0][0] == simboloCPU) && (tablero[1][1] == simboloCPU) && (tablero[2][2] == simboloCPU)
            ||
            (tablero[0][2] == simboloCPU) && (tablero[1][1] == simboloCPU) && (tablero[2][0] == simboloCPU)
            ){
              ganaCPU = true;
              break;
            }
      }
      
    } while (!ganaJugador|| !ganaCPU || movimientos<9);
  }
}
