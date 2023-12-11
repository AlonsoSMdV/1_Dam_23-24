package CapituloJava08.funcionesArraysUni;
/**
 *  Dice si un número está o no dentro de un array.
 */
public class Ej24estaEnArrayInt {
  public static boolean estaEnArrayInt(int[] array, int n){
    boolean estaEnArray = false;
    for (int i = 0; i < array.length; i++) {
      if(n == array[i]){
        estaEnArray = true;
        break;
      }else{
        estaEnArray = false;
      }
    }
    return estaEnArray;
  }
}
