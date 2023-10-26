package CapituloJava05;
/**
 * Realiza un programa que sea capaz de desplazar todos los dígitos de un número
 * de derecha a izquierda una posición. El dígito de más a la izquierda, pasaría a
 * dar la vuelta y se colocaría a la derecha. Si el número tiene un solo dígito, se
 * queda igual.
 */
import java.util.Scanner;
public class Ejercicio52 {
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
    long volt = volteado(n);
    long primero = volt%10;
    volt/=10;
    long aux = n;
    long volt2 = 0;
    while (aux > 0) {
      volt2 = (volt%10) + (volt2*10);
      volt/=10;
      aux/=10;
    }
    volt2 = volt2 + primero;
    System.out.println("El numero desplazado un digito a la izquierda es: "+volt2);
    sc.close();
  }
}
