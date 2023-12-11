package CapituloJava08.funcionesArraysUni;
/**
 * Devuelve el máximo del array que se pasa como parámetro.
 */
public class Ej22maximoArrayInt {
  public static int maximoArrayInt(int[] array){
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < array.length; i++) {
      if(array[i] > max){
        max = array[i];
      }
    }
    return max;
  }
}
