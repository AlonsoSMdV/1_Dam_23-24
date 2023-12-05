package CapituloJava08.matematicas;
/**
 * Le da la vuelta a un número.
 */
public class Ej06Voltea {
  public static long voltea(long n){
    long nVolt = 0;
    int cont = Ej05Digitos.digitos(n);
    for (int i = 0; i < cont; i++) {
      nVolt = (n%10) + (nVolt*10);
      n/=10;
    }
    return nVolt;
  }

}
