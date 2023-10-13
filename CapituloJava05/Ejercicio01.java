package CapituloJava05;
/**
 * Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle for.
 */

public class Ejercicio01 {
  public static void main(String[] args) {
    for (int i = 0; i < 101; i++) {
      if (i%5==0) {
        System.out.print(i+" ");
      }
    }
  }
}
