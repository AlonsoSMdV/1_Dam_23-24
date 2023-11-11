package CapituloJava07.A_ArrayUnidimensionales;
/**
 * Escribe un programa que genere 20 números enteros aleatorios entre 0 y 100
 * y que los almacene en un array. El programa debe ser capaz de pasar todos
 * los números pares a las primeras posiciones del array (del 0 en adelante) y
 * todos los números impares a las celdas restantes. Utiliza arrays auxiliares si es
 * necesario.
 */
public class Ejercicio10 {
  public static void main(String[] args) {
    int[] numeros = new int[20];
    int pares = 0;
    int impares = 0;
    for (int i = 0; i < numeros.length; i++) {
      numeros[i] = (int)(Math.random()*101);
      if(numeros[i] % 2 == 0){
        pares++;
      }else{
        impares++;
      }
    }

    System.out.print("Indice ");
    for (int i = 1; i <= 20; i++) {
      System.out.printf("%5d",i);
    }
    System.out.println();
    System.out.print("Valor  ");
    for (int i = 0; i < 20; i++) {
      System.out.printf("%5d", numeros[i]);
    }

    int[] arrayPares = new int[pares];
    int[] arrayImpares = new int[impares];
    for (int i = 0; i < 20; i++) {
      if (numeros[i] % 2 == 0) {
        arrayPares[i] = numeros[i];
        i--;
      }else{
        arrayImpares[i] = numeros[i];
        i--;
      }
    }

    for (int i = 0; i < arrayPares.length; i++) {
      System.out.print(arrayPares[i]+" ");
    }

    for (int i = 0; i < arrayImpares.length; i++) {
      System.out.print(arrayImpares[i]);
    }
  }
}
