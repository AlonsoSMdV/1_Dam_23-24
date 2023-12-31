package CapituloJava07.B_ArrayBidimensionales;
/**
 * Modifica el programa anterior de tal forma que las sumas parciales y la suma
 * total aparezcan en la pantalla con un pequeño retardo, dando la impresión de
 * que el ordenador se queda “pensando” antes de mostrar los números.
 */
public class Ejercicio04 {
  public static void main(String[] args) throws InterruptedException {
    int sumaFila = 0;
    int sumaColumna = 0;
    int sumaTotal = 0;
    int[][] num = new int[4][5];
    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 5; j++) {
        num[i][j] = (int)(Math.random()*900+100);
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
        sumaFila += num[i][j];
      }
      Thread.sleep(1500);
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
      Thread.sleep(1500);
      System.out.printf("%6d%5s| ",sumaColumna," ");
    }
    Thread.sleep(2000);
    System.out.printf("%6d%6s| ",sumaTotal," ");
  }
}
