package CapituloJava08.funcionesArraysUni;
/**
 * Rota n posiciones a la izquierda los números de un array.
 */
public class Ej28rotaIzquierdaArrayInt {
  public static int[] rotaIzquierdaArrayInt(int[] array, int posiciones){
    int[] arrayRotado = array.clone();
    int aux = 0;
    while (posiciones-- > 0) {
      aux = arrayRotado[0];
      for (int i = 0; i < arrayRotado.length-1; i++) {
        arrayRotado[i] = arrayRotado[i+1];
      }
      arrayRotado[arrayRotado.length-1] = aux;
    }
    return arrayRotado;
  }
}
