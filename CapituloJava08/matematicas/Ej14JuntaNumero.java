package CapituloJava08.matematicas;
/**
 * Pega dos números para formar uno.
 */
public class Ej14JuntaNumero {
  public static long juntaNumero(int n1, int n2){
    long numeroJuntado = 0;
    int digN2 = Ej05Digitos.digitos(n2);
    numeroJuntado = (n1*Ej04Potencia.potencia(10, digN2)) + n2;
    return numeroJuntado;
  }
}
