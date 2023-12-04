package CapituloJava08.matematicas;
/**
 * Devuelve verdadero si el número que se pasa como parámetro es capicúa y falso en caso contrario.
 */
public class Ej01EsCapicua {
  public static boolean esCapicua(long n){
    boolean esCapicua = true;
    if (n == Ej06Voltea.voltea(n)) {
      esCapicua = true;
    }else{
      esCapicua = false;
    }
    return esCapicua;
  }
}
