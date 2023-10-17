package CapituloJava05;
/**
 * Escribe un programa que permita ir introduciendo una serie indeterminada
 * de números mientras su suma no supere el valor 10000. Cuando esto último
 * ocurra, se debe mostrar el total acumulado, el contador de los números
 * introducidos y la media.
 */

import java.util.Scanner;
public class Ejercicio23 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = 0;
    int contador = 0;
    int sumaNumeros = 0;
    while (sumaNumeros < 10000) {
      System.out.print("Intoduce un numero: ");
      n = sc.nextInt();
      contador++;
      sumaNumeros+= n;
    }
    System.out.println("Hay "+contador+" numeros, el total es "+sumaNumeros+" y la media es "+(sumaNumeros/contador));
    sc.close();
  }
}
