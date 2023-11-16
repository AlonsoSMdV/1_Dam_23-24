package CapituloJava06;
/**
 * Realiza una versión del programa "Hola mundo". Se debe mostrar la palabra HOLA 
 * (todo en mayúsculas) hecha con asteriscos. La altura de la palabra debe ser un 
 * número impar generado al azar entre el 3 y el 13 ambos incluidos. Los palos horizontales 
 * de la H y de la A están justo a la mitad de la altura. La anchura de las letras siempre 
 * es la misma. Aunque, en este caso, sólo hay 6 posibles HOLAS de distinta altura, 
 * el programa debe hacerse de tal forma que sea muy fácil adaptarlo a otros rangos 
 * de altura, por ej, entre 7 y 33. Por tanto, no se da por válido escribir 6 
 * sentencias if, cada una pintando la correspondiente figura completa.
 * 
 * 
 * 
 * Realiza un programa que sea capaz de recolocar los números de un array de
 * fuera hacia adentro. En primer lugar, el programa pedirá al usuario el tamaño
 * del array. A continuación generará un array con ese tamaño con números
 * enteros aleatorios entre 0 y 200 ambos incluidos. Seguidamente el programa
 * irá colocando desde fuera hacia adentro los números de tal forma que el
 * primero se coloca en la primera posición, el segundo en la última, el tercero
 * en la segunda, el cuarto en la penúltima, el quinto en la tercera, en sexto en la
 * antepenúltima, etc. Se debe mostrar por pantalla tanto el array original como
 * el array resultado
 */
import java.util.Scanner;
public class Ejercicio28 {
  public static void EjercicioHOLA28Aleatorios(){
    int altura = (int)(Math.random() * 6) * 2 + 3;
      
      System.out.println("*    *   ****   *        ****");
      
      for (int i = 1; i < altura / 2; i++) {
        System.out.println("*    *  *    *  *       *    *");
      }
      
      System.out.println("******  *    *  *       ******");
      
      for (int i = 1; i < altura / 2; i++) {
        System.out.println("*    *  *    *  *       *    *");
      }
      
      System.out.println("*    *   ****   ******  *    *");
  }

  public static void Ejercicio28ConElEnunciadoErroneo(){
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduzca el tamaño del array: ");
    int tamaño = sc.nextInt();
    int[] array1 = new int[tamaño];
    for (int i = 0; i < tamaño; i++) {
      array1[i] = (int)(Math.random()*201);
    }
    System.out.println("\nArray original:");
    System.out.print("Índice ");
    for (int i = 0; i < tamaño; i++) {
      System.out.printf("%5d", i);
    }
    System.out.print("\nValor  ");
    for (int i = 0; i < tamaño; i++) {
      System.out.printf("%5d", array1[i]);
    }
    int[] array2 = new int[tamaño];
    int izquierda = 0;
    int derecha = tamaño - 1;
    for (int i = 0; i < tamaño; i++) {
      if (i % 2 == 0) {
        array2[izquierda++] = array1[i];
      } else {
        array2[derecha--] = array1[i];
      }
    }
    System.out.println("\n\nArray resultado:");
    System.out.print("Índice ");
    for (int i = 0; i < array2.length; i++) {
      System.out.printf("%5d", i);
    }
    System.out.print("\nValor  ");
      for (int i = 0; i < array2.length; i++) {
    System.out.printf("%5d", array2[i]);
    }
    sc.close();
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Debido a un error en el enunciado hay dos opciones de programa a ejecutar la primera que genera la palabra HOLA con una altura aleatoria y la segunda que recoloca los elementos de un array de manera que el primero elemento se queda en su posicion, el segundo en la ultima, el tercero en la segundo y asi hasat reorganizar el array");
    System.out.print("Que opcion desea:\n1. Programa HOLA\n2. Programa array reorganizado\nPor favor escriba su eleccion con un numero(1 o 2): ");
    int opcion = sc.nextInt();
    switch (opcion) {
      case 1:
        EjercicioHOLA28Aleatorios();
        break;

      case 2:
        Ejercicio28ConElEnunciadoErroneo();
        break;
    
      default:
        break;
    }
    sc.close();
  }
}