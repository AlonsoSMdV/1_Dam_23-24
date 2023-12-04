package CapituloJava08.matematicas;
/**
 * Devuelve el menor primo que es mayor al número que se pasa como parámetro.
 */
public class Ej03SiguientePrimo {
  public static long siguientePrimo(long n){
    do {
      n++;
    } while (!Ej02EsPrimo.esPrimo(n));
    return n;
  }  
}
