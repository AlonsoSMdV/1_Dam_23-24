package CapituloJava07.B_ArrayBidimensionales;
/**
 * Realiza un programa que muestre por pantalla un array de 10 filas por 10
 * columnas relleno con números aleatorios entre 200 y 300. A continuación, el
 * programa debe mostrar los números de la diagonal que va desde la esquina
 * superior izquierda a la esquina inferior derecha, así como el máximo, el mínimo
 * y la media de los números que hay en esa diagonal.
 */
public class Ejercicio11 {
  public static void main(String[] args) {
    int[][] num = new int[10][10];
    int maxEnDiagonal = 200;
    int minEnDiagonal = 300;
    double sumaDiagonal = 0;
    int contDiagonal = 0;
    for (int i = 0; i < num.length; i++) {
      for (int j = 0; j < num.length; j++) {
        num[i][j] = (int)(Math.random()*101+200);
      }
    }

    for (int i = 0; i < num.length; i++) {
      for (int j = 0; j < num.length; j++) {
        System.out.printf("%4d", num[i][j]);
        if (i == j) {
          contDiagonal++;
          sumaDiagonal+= num[i][j];
          if (num[i][j] > maxEnDiagonal) {
            maxEnDiagonal = num[i][j];
          }

          if (num[i][j] < minEnDiagonal) {
            minEnDiagonal = num[i][j];
          }
        }
      }
      System.out.println();
    }
    System.out.print("La diagonal que va desde la esquina superior izquierda hasta la esquina inferior derecha es:");
    for (int i = 0; i < num.length; i++) {
      for (int j = 0; j < num.length; j++) {
        if (i == j) {
          System.out.printf("%4d", num[i][j]);
        }
      }
    }
    double media = sumaDiagonal/contDiagonal;
    System.out.printf("\nEl maximo en la diagonal es:%4d\nEl minimo en la diagonal es:%4d\nLa media de los numeros de la diagonal es:%4.2f",maxEnDiagonal,minEnDiagonal,media);
  }
}
