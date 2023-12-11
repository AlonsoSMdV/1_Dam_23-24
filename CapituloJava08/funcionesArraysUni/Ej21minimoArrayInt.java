package CapituloJava08.funcionesArraysUni;
/**
 * Devuelve el mínimo del array que se pasa como parámetro.
 */
public class Ej21minimoArrayInt {
  public static int minimoArrayInt(int[] array){
    int min = Integer.MAX_VALUE;
    for (int i = 0; i < array.length; i++) {
      if(array[i] < min){
        min = array[i];
      }
    }
    return min;
  }
}
