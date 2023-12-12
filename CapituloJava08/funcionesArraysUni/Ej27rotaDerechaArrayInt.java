package CapituloJava08.funcionesArraysUni;
/**
 * Rota n posiciones a la derecha los números de un array.
 */
public class Ej27rotaDerechaArrayInt {
  public static int[] rotaDerechaArrayInt(int[] array, int posiciones){
    int[] arrayRotado = array.clone();
    int aux = 0;
    while (posiciones-- > 0) {
      aux = arrayRotado[arrayRotado.length-1];
      for (int i = arrayRotado.length-1; i > 0; i--) {
        arrayRotado[i] = arrayRotado[i-1];
      }
      arrayRotado[0] = aux;
    }
    return arrayRotado;
  }
}
