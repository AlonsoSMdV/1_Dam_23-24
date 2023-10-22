package CapituloJava05;
/**
 * Escribe un programa que, dado un número entero positivo, diga cuáles son y
 * cuánto suman los dígitos pares. Los dígitos pares se deben mostrar en orden, de
 * izquierda a derecha. Usa long en lugar de int donde sea necesario para admitir
 * números largos.
 */
import java.util.Scanner;
public class Ejercicio32 {
  public static long volteado(long n){
    long nVolt = 0;
    while(n>0){
      nVolt = (n%10)+(nVolt*10);
      n/=10;
    }
    return nVolt;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce un numero: ");
    long n = sc.nextLong();
    long nVolteado = volteado(n);
    int sumaPares = 0;
    int digitosPares = 0;
    int contador = 0;
    while (n> 0) {
       n /= 10;
       contador++;
    }
    System.out.print("Digitos pares: ");
    for (int i = 0; i < contador; i++) {
      if((nVolteado % 10)%2 == 0){
        digitosPares = (int)nVolteado%10;
        System.out.print(digitosPares+" ");
        sumaPares += digitosPares;
      }
      nVolteado /= 10;
    }
    System.out.println();
    System.out.println("La suma de los digitos pares es "+sumaPares);
    sc.close();
  }
}
