package CapituloJava08.matematicas;
/**
 * Le quita a un número n dígitos por delante (por la izquierda).
 */
public class Ej10QuitarPorDelante {
  public static long quitarPorDelante(long n, int nQuitados){
    long volt = Ej06Voltea.voltea(n);
    volt /= Ej04Potencia.potencia(10, nQuitados);
    volt = Ej06Voltea.voltea(volt);
    return volt;
  }

}
