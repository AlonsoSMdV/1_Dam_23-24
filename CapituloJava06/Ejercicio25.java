package CapituloJava06;
/**
 * Escribe un programa que muestre por pantalla 100 números enteros separados
 * por un espacio. Los números deben estar generados de forma aleatoria en
 * un rango entre 10 y 200 ambos incluidos. Los primos deben aparecer entre
 * almohadillas (p. ej. #19#) y los múltiplos de 5 entre corchetes (p. ej. [25]).
 */
public class Ejercicio25 {
  public static boolean esPrimo(int n){
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
  public static void main(String[] args) {
    for (int i = 1; i <= 100; i++) {
      int n = (int)(Math.random()*190)+10;
      if(esPrimo(n)){
        System.out.print("#"+n+"# ");
      }else if(n%5 == 0){
        System.out.print("["+n+"] ");
      }else{
        System.out.print(n+" ");
      }
    }
  }
}
