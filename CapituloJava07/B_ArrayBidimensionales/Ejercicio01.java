package CapituloJava07.B_ArrayBidimensionales;
/**
 * Define un array de números enteros de 3 filas por 6 columnas con nombre num
 * y asigna los valores según la siguiente tabla. Muestra el contenido de todos
 * los elementos del array dispuestos en forma de tabla como se muestra en la
 * figura.
 */
public class Ejercicio01 {
  public static void main(String[] args) {
    int[][] array = new int[3][6];
    array[0][0] = 0;
    array[0][1] = 30;
    array[0][2] = 2;
    array[0][5] = 5;
    array[1][0] = 75;
    array[1][4] = 0;
    array[2][2] = -2;
    array[2][3] = 9;
    array[2][5] = 11;
    System.out.print("Array num| ");
    for (int i = 0; i < 6; i++) {
      System.out.print(" Columna "+ i +" | ");
    }
    System.out.println();
    for (int i = 0; i < array.length; i++) {
      System.out.print("  Fila "+ i +" | ");
      for (int j = 0; j < 6; j++) {
        System.out.printf("%6d%5s| ",array[i][j]," ");
      }
      System.out.println();
    }
  }
}
