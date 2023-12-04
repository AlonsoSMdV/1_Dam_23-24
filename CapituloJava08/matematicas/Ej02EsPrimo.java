package CapituloJava08.matematicas;
/**
 * Devuelve verdadero si el número que se pasa como parámetro es primo y falso en caso contrario.
 */
public class Ej02EsPrimo {
  public static boolean esPrimo(long n){
    boolean esPrimo = true;
    for (int i = 2; i < n; i++) {
      if(n%i!=0){
        esPrimo = true;
      }else{
        esPrimo = false;
        break;
      }
    }
    return esPrimo;
  }
}
