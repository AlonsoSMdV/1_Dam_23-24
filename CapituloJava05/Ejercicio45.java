package CapituloJava05;

import java.util.Scanner;

/**
 * Escribe un programa que cambie un dígito dentro de un número dando la
 * posición y el valor nuevo. Las posiciones se cuentan de izquierda a derecha
 * empezando por el 1. Se recomienda usar long en lugar de int ya que el
 * primero admite números más largos. Suponemos que el usuario introduce
 * correctamente los datos.
 */
public class Ejercicio45 {
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
    System.out.print("Introduce la posicion dentro del numero: ");
    int pos = sc.nextInt();
    System.out.print("Introduce el numero que deseas añadir: ");
    int nNuevo = sc.nextInt();
    if (n < 10) {
      System.out.println("Este numero no es valido");
    } else {
      long aux = n;
      int longitud = 0;
      while (aux > 0) {
        longitud++;
        aux /= 10;
      }
      long volt = volteado(n);
      long resultado = 0;
      for (int i = 1; i <= longitud; i++) {
        if(i == pos){
          resultado = nNuevo + (resultado*10);
        }else{
          resultado = (volt%10) + (resultado*10);
        }
        volt /= 10;
      }
      System.out.println("El numero resultante es "+resultado);
    }
    sc.close();
  }
}
