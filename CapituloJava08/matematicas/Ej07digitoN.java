package CapituloJava08.matematicas;
/**
 * Devuelve el dígito que está en la posición n de un número entero.
 * Se empieza contando por el 0 y de izquierda a derecha.
 */
public class Ej07digitoN {
  public static int digitoN(int pos, long n){
    long volt = Ej06Voltea.voltea(n);
    int dig = 0;
    for (int i = 0; i <= pos; i++) {
      if(i == pos){
        dig = (int)(volt%10);
      }else{
        volt/=10;
      }
    }
    return dig;
  }
}
