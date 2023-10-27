package CapituloJava05;
/**
 * Realiza un programa que sea capaz de desplazar todos los dígitos de un número
 * de izquierda a derecha una posición. El dígito de más a la derecha, pasaría a
 * dar la vuelta y se colocaría a la izquierda. Si el número tiene un solo dígito, se
 * queda igual.
 */
import java.util.Scanner;
public class Ejercicio55 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduzca un numero: ");
    long num = sc.nextLong();
    long digito = num%10;
    num /= 10;
    long aux = num;
    int cont = 0;
    while (aux > 0) {
      cont++;
      aux /= 10;
    } 
    digito *= (long)(Math.pow(10, cont));
    num = num + digito;
    System.out.println(num);
    sc.close();
  }
}
