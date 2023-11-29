package CapituloJava07.B_ArrayBidimensionales;
/**
 * Modifica el programa anterior de tal forma que no se repita ningún número en
 * el array
 */
public class Ejercicio06 {
  public static void main(String[] args) {
    int[][] num = new int[6][10];
    boolean estaEnArray;
    int maximo = 0;
    int minimo = 1000;
    int maximoX = 0;
    int maximoY = 0;
    int minimoX = 0;
    int minimoY = 0;
    for (int i = 0; i < 6; i++) {
      for (int j = 0; j < 10; j++) {
        do{
          num[i][j] = (int)(Math.random() * 1001);

          estaEnArray = false;
          for (int k = 0; k < 10*i+j; k++) {
            if (num[i][j] ==num[k/10][k%10]) {
              estaEnArray = true;
            }
          }
        }while(estaEnArray);
        
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
      System.out.print(" Columna "+ i +" | ");
    }
    System.out.println();
    for (int i = 0; i < 6; i++) {
      System.out.print("  Fila "+ i +" | ");
      for (int j = 0; j < 10; j++) {
        System.out.printf("%6d%5s| ",num[i][j]," ");
      }
      System.out.println();
    }
    System.out.println("El maximo es "+maximo+" que se encuentra en la fila "+maximoX+" y en la columna "+maximoY);
    System.out.println("El minimo es "+minimo+" que se encuentra en la fila "+minimoX+" y en la columna "+minimoY);
  }
}
