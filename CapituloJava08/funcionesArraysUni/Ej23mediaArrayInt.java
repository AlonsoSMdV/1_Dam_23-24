package CapituloJava08.funcionesArraysUni;
/**
 * Devuelve la media del array que se pasa como parámetro
 */
public class Ej23mediaArrayInt {
  public static double mediaArrayInt(int[] array, int tamañoArray){
    double suma = 0;
    for (int i = 0; i < array.length; i++) {
      suma += array[i];
    }
    double media = suma/tamañoArray;
    return media;
  }
}
