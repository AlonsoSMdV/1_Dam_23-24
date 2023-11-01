package CapituloJava06;
/**
 * Muestra 20 números enteros aleatorios entre 0 y 10 (ambos incluidos) separados por espacios.
 */
public class Ejercicio04 {
  public static void main(String[] args) {
    for (int i = 1; i <= 20; i++) {
      int n = (int)(Math.random()*10+1);
      System.out.print(n+" ");
    }
  }
}
