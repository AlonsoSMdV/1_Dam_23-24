package CapituloJava08;
import CapituloJava08.matematicas.Ej01EsCapicua;
/**
 * Muestra los números capicúa que hay entre 1 y 99999
 */
public class Ejercicio16 {
  public static void main(String[] args) {
    for (int i = 0; i <= 99999; i++) {
      if (Ej01EsCapicua.esCapicua(i)) {
        System.out.print(i+" ");
      }
    }
  }
}
