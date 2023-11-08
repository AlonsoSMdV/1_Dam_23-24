package CapituloJava06;
/**
 * Escribe un programa que, dado un número introducido por teclado, elija al azar
 * uno de sus dígitos
 */
import java.util.Scanner;
public class Ejercicio24 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Por favor, introduzca un número entero positivo: ");
    long n = sc.nextLong();
    long aux = n;
    int cont = 0;
    while (aux > 0) {
      cont++;
      aux/=10;
    }
    int posicion = (int)(Math.random()*cont)+1;
    for (int i = 0; i < posicion-1; i++) {
      n/= 10;
    }
    System.out.println(n%10);
    sc.close();
  }
}
