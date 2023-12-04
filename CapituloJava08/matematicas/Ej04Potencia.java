package CapituloJava08.matematicas;
/**
 * Dada una base y un exponente devuelve la potencia.
 */
public class Ej04Potencia {
  public static long potencia(int a, int b){
    long resultado = 1;
    for (int i = 0; i < b; i++) {
      resultado *= a;
    }
    return resultado;
  }

  public static void main(String[] args) {
    System.out.println(potencia(5, 3));
  }
}
