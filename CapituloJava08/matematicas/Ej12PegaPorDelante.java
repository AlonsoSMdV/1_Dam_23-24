package CapituloJava08.matematicas;
/**
 * Añade un dígito a un número por delante.
 */
public class Ej12PegaPorDelante {
  public static long pegaPorDelante(long n, int dig){
    int cont = Ej05Digitos.digitos(n);
    n = (dig*Ej04Potencia.potencia(10, cont)) + n;
    return n;
  }
}
