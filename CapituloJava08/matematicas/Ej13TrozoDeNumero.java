package CapituloJava08.matematicas;
/**
 * Toma como parámetros las posiciones inicial y final
 * dentro de un número y devuelve el trozo correspondiente.
 */
public class Ej13TrozoDeNumero {
  public static long trozoDeNumero(long n, int posI, int posF){
    long volt = Ej06Voltea.voltea(n);
    int pos = 0;
    while(pos != posI){
      volt/=10;
      pos++;
    }
    long resultado = 0;
    for (int i = posI; i <= posF; i++) {
      resultado = (volt%10) + (resultado*10);
      volt/=10;
    }
    return resultado;
  }
}
