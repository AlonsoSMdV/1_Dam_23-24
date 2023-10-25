package CapituloJava05;

import java.util.Scanner;

/**
 * Escribe un programa que sea capaz de insertar un dígito dentro de un número
 * indicando la posición. El nuevo dígito se colocará en la posición indicada y el
 * resto de dígitos se desplazará hacia la derecha. Las posiciones se cuentan de
 * izquierda a derecha empezando por el 1. Suponemos que el usuario introduce
 * correctamente los datos. Se recomienda usar long en lugar de int ya que el
 * primero admite números más largos.
 */
public class Ejercicio44 {
  /**
   * Volteado
   * Funcion que hace un numero pero al reves por ejemplo 123 pasa a 321 y asi poder leerlo de izquierda a derecha
   * @param n numero a voltear
   * @return numero dado la vuelta
   */
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
      //Calculamos la longitud del numero
      long aux = n;
      int longitud = 0;
      while (aux > 0) {
        longitud++;
        aux /= 10;
      }
      //Volteamos el numero
      long volt = volteado(n);
      //volvemos a voltear el numero volteado pero añadimos el nuevo numero
      long resultado = 0;
      for (int i = 1; i <= longitud+1; i++) {
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
