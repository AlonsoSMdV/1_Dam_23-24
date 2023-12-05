package CapituloJava08.matematicas;
/**
 * Le quita a un número n dígitos por detrás (por la derecha).
 */
public class Ej09QuitarPorDetras {
  public static long quitarPorDetras(long n, int nQuitados){
    n /= Ej04Potencia.potencia(10, nQuitados);
    return n;
  }
}
