package CapituloJava06;
/**
 * Escribe un programa que piense un número al azar entre 0 y 100. El usuario debe adivinarlo y tiene para ello 5 oportunidades. Después de cada intento fallido,
 * el programa dirá cuántas oportunidades quedan y si el número introducido es
 * menor o mayor que el número secreto
 */
import java.util.Scanner;
public class Ejercicio06 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = (int)(Math.random()*101);
    boolean salir = false;
    int n = 0; 
    int intentos = 5;
    do {
      System.out.println(num);
      System.out.print("Introduzca un numero para intentar adivinar el que he pensado: ");
      n = sc.nextInt();
      if (n == num) {
        salir = true;
      }else if(n < num){
        intentos--;
        System.out.println("El numero es mayor que el introducido te quedan "+intentos);
        salir = false;
      }else if(n > num){
        intentos--;
        System.out.println("El numero es menor que el introducido te quedan "+intentos);
        salir = false;
      }
    } while (!salir && intentos > 0);
    System.out.println("Gracias por jugar");
    sc.close();
  }
}
