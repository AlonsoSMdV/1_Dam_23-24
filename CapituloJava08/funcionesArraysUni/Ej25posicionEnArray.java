package CapituloJava08.funcionesArraysUni;
/**
 * Busca un número en un array y devuelve la posición
 * (el índice) en la que se encuentra.
 */
public class Ej25posicionEnArray {
  public static int posicionEnArray(int[] array, int n){
    int pos = -1;
    for (int i = 0; i < array.length; i++) {
      if(n == array[i]){
        pos = i;
      }
    }
    return pos;
  }
}
