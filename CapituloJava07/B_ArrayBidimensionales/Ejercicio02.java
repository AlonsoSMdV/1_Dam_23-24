package CapituloJava07.B_ArrayBidimensionales;
/**
 * Escribe un programa que pida 20 números enteros. Estos números se deben
 * introducir en un array de 4 filas por 5 columnas. El programa mostrará las
 * sumas parciales de filas y columnas igual que si de una hoja de cálculo se
 * tratara. La suma total debe aparecer en la esquina inferior derecha.
 */
import java.util.Scanner;
public class Ejercicio02 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Porfavor vaya introduciendo una lista de 20 numeros:");
    int sumaFila = 0;
    int sumaColumna = 0;
    int sumaTotal = 0;
    int[][] num = new int[4][5];
    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 5; j++) {
        num[i][j] = sc.nextInt();
      }
    }

    System.out.print("Array num| ");
    for (int i = 0; i < 6; i++) {
      if(i< 5){
        System.out.print(" Columna "+ i +" | ");
      }else{
        System.out.print(" SumaFila "+ i +" | ");
      }
    }
    System.out.println();
    for (int i = 0; i < 4; i++) {
      sumaFila = 0;
      System.out.print("  Fila "+ i +" | ");
      for (int j = 0; j < 5; j++) {
        System.out.printf("%6d%5s| ",num[i][j]," ");
        sumaFila+=num[i][j];
      }
      System.out.printf("%6d%6s| ",sumaFila," ");
      System.out.println();
    }
    
    System.out.print("Suma Colu| ");
    for (int j = 0; j < 5; j++) {
      sumaColumna = 0;
      for (int i = 0; i < 4; i++) {
        sumaColumna += num[i][j];
      }
      sumaTotal+= sumaColumna;
      System.out.printf("%6d%5s| ",sumaColumna," ");
    }
    System.out.printf("%6d%6s| ",sumaTotal," ");
    sc.close();
  }
}
