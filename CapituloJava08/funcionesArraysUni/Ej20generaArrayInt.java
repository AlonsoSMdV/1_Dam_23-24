package CapituloJava08.funcionesArraysUni;
/**
 * Genera un array de tamaño n con números aleatorios
 * cuyo intervalo (mínimo y máximo) se indica como parámetro.
 */
public class Ej20generaArrayInt {
  public static int[] generaArrayInt(int tamaño, int intMin, int intMax){
    int[] array = new int[tamaño];
    for (int i = 0; i < array.length; i++) {
      array[i] = (int)(Math.random()*(intMax-intMin+1)+intMin);
    }
    return array;
  }
}
