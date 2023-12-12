package CapituloJava08.funcionesArraysUni;
/**
 * Le da la vuelta a un array.
 */
public class Ej26volteaArrayInt {
  public static int[] volteaArrayInt(int[] array, int tamañoArray){
    int[] volt = new int[tamañoArray];
    int k = tamañoArray-1;
    for (int i = 0; i < volt.length; i++) {
          volt[i] = array[k];
          k--;
        
      
    }
    return volt;
  }
}
