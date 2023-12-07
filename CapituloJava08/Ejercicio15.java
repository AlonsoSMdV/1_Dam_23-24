package CapituloJava08;
import CapituloJava08.matematicas.*;
/**
 * Muestra los números primos que hay entre 1 y 1000.
 */
public class Ejercicio15 {
  public static void main(String[] args) {
    for (int i = 0; i <= 1000; i++) {
      if (Ej02EsPrimo.esPrimo(i)) {
        System.out.print(i+" ");
      }
    }
  }
}
