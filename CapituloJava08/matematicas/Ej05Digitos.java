package CapituloJava08.matematicas;
/**
 * Cuenta el número de dígitos de un número entero.
 */
public class Ej05Digitos {

  public static int digitos(long n) {
    int cont = 0;
    while(n > 0){
      n/=10;
      cont++;
    }
    return cont;
  }
}
