package CapituloJava07.B_ArrayBidimensionales;
/**
 * Realiza un programa que rellene un array de 6 filas por 10 columnas con
 * números enteros positivos comprendidos entre 0 y 1000 (ambos incluidos). A
 * continuación, el programa deberá dar la posición tanto del máximo como del
 * mínimo.
 */
public class Ejercicio05 {
  public static void main(String[] args) {
    int[][] num = new int[6][10];
    int maximo = 0;
    int minimo = 1000;
    int maximoX = 0;
    int maximoY = 0;
    int minimoX = 0;
    int minimoY = 0;
    for (int i = 0; i < 6; i++) {
      for (int j = 0; j < 10; j++) {
        num[i][j] = (int)(Math.random()*1001);
        if(num[i][j] > maximo){
          maximo = num[i][j];
          maximoX = i;
          maximoY = j;
        }

        if(num[i][j] < minimo){
          minimo = num[i][j];
          minimoX = i;
          minimoY = j;
        }
      }
    }
    System.out.print("Array num| ");
    for (int i = 0; i < 10; i++) {
      System.out.print(" Columna "+i+" | ");
    }
    System.out.println();
    for (int i = 0; i < 6; i++) {
      System.out.print("  Fila "+i+" | ");
      for (int j = 0; j < 10; j++) {
        System.out.printf("%6d%5s| ",num[i][j]," ");
      }
      System.out.println();
    }
    System.out.println("El maximo es "+maximo+" que se encuentra en la fila "+maximoX+" y en la columna "+maximoY);
    System.out.println("El minimo es "+minimo+" que se encuentra en la fila "+minimoX+" y en la columna "+minimoY);
  }
}
