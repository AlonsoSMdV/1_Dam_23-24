package CapituloJava07.B_ArrayBidimensionales;
/**
 * Escribe un programa que, dada una posición en un tablero de ajedrez, nos diga
 * a qué casillas podría saltar un alfil que se encuentra en esa posición. Como se
 * indica en la figura, el alfil se mueve siempre en diagonal. El tablero cuenta con
 * 64 casillas. Las columnas se indican con las letras de la “a” a la “h” y las filas
 * se indican del 1 al 8.
 */
import java.util.Scanner;
public class Ejercicio08 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduzca la posicion del alfil: ");
    String posAlfil = sc.next();
    int colAlfil = (int)(posAlfil.charAt(0))-96;
    int filaAlfil = (int)(posAlfil.charAt(1))-48;
    
    String[][] tablero = new String[8][8];
    for (int i = 0; i < 8; i++) {
      for (int j = 0; j < 8; j++) {
        if (i == filaAlfil-1 && j == colAlfil-1) {
          tablero[i][j] = " X │";
        }else{
          tablero[i][j] = "   │";
        }
      }
    }
    System.out.println("─┬───┬───┬───┬───┬───┬───┬───┬───┬─");
    System.out.println(" │ a │ b │ c │ d │ e │ f │ g │ h │");
    System.out.println("─┼───┼───┼───┼───┼───┼───┼───┼───┼─");
    for (int i = 7; i >= 0; i--) {
      System.out.print((i+1)+"│");
      for (int j = 0; j < 8; j++) {
        System.out.print(tablero[i][j]);
      }
      System.out.println(i+1);
    System.out.println("─┼───┼───┼───┼───┼───┼───┼───┼───┼─");
    }
    System.out.println(" │ a │ b │ c │ d │ e │ f │ g │ h │");
    System.out.println();
    System.out.println("El alfill se puede mover por las siguientes posiciones:");
    for (int i = 8; i >=1; i--) {
      for (int j = 1; j <= 8; j++) {
        if ((Math.abs(filaAlfil-i) == Math.abs(colAlfil-j)) && ((filaAlfil != i) && (colAlfil != j))) {
          System.out.print((char)(j+96)+""+i+" ");
        }
      }
    }
    sc.close();
  }
}
