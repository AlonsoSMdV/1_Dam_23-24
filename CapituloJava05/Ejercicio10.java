package CapituloJava05;
/**
 * Escribe un programa que calcule la media de un conjunto de números positivos
 * introducidos por teclado. A priori, el programa no sabe cuántos números se
 * introducirán. El usuario indicará que ha terminado de introducir los datos
 * cuando meta un número negativo.
 */

 import java.util.Scanner;
public class Ejercicio10 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int contador = 0;
    int suma = 0;
    int n = 0;
    while (n>=0) {
      System.out.print("Introduzca un numero: ");
      n = sc.nextInt();
      if (n < 0) {
        System.out.println("");
      } else {
        suma += n;
        contador++;   
      }
    }
    double media = suma/contador;
    System.out.printf("La media de estos %d números introducidos es %.2f",contador,media);
    sc.close();
  }
}
