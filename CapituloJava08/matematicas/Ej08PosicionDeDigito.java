package CapituloJava08.matematicas;
/**
 * Da la posición de la primera ocurrencia de un dígito
 * dentro de un número entero. Si no se encuentra, devuelve -1.
 */
public class Ej08PosicionDeDigito {
  public static int posicionDeDigito(int dig, long n){
    long volt = Ej06Voltea.voltea(n);
    int pos = 0;
    int posDig = -1;
    while (volt > 0) {
      if ((volt%10) == dig) {
        posDig = pos;
        break;
      }
      pos++;
      volt/=10;
    }
    return posDig;
  }
}
