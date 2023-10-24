package CapituloJava05;
/**
 * Escribe un programa que permita partir un número introducido por teclado en
 * dos partes. Las posiciones se cuentan de izquierda a derecha empezando por
 * el 1. Suponemos que el usuario introduce correctamente los datos, es decir,
 * el número introducido tiene dos dígitos como mínimo y la posición en la que
 * se parte el número está entre 2 y la longitud del número. No se permite en
 * este ejercicio el uso de funciones de manejo de String (por ej. para extraer
 * subcadenas dentro de una cadena).
 */
import java.util.Scanner;
public class Ejercicio43 {
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
    System.out.print("Introduzca un numero: ");
    long n = sc.nextLong();
    if (n < 10) {
      System.out.println("Este numero no es valido");
    } else {
      long aux = n;
      int longitud = 0;
      while (aux > 0) {
        longitud++;
        aux /= 10;
      }
      System.out.print("En que posicion desea cortar el numero(Debe ser entre la segunda posicion y la longitud del numero que es "+longitud+"): ");
      int pos = sc.nextInt();
      long volt = volteado(n);
      long part1 = 0; 
      long part2 = 0;
      for (int i = 0; i < longitud; i++) {
        if(i < pos-1){
          part1 = (volt%10) + (part1*10);
        }else{
          part2 = (volt%10) + (part2*10);
        }
        volt /= 10;
      }
      System.out.println("Los numeros partidos son el "+part1+" y el "+part2);
    }
    sc.close();
  }
}
