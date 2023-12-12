package CapituloJava08.funcionesArraysUni;
/**
 * Muestra los numeros contenidos en un array
 */
public class EJMuestraArray {
  public static void muestraArrayInt(int[] a) {
    for (int i = 0; i < a.length; i++) {
      System.out.print(a[i] + " ");
    }
    System.out.println();
    }
}
