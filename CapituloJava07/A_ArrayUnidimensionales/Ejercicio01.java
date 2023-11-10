package CapituloJava07.A_ArrayUnidimensionales;
/**
 * Define un array de 12 números enteros con nombre num y asigna los valores
 * según la tabla que se muestra a continuación. Muestra el contenido de todos
 * los elementos del array. ¿Qué sucede con los valores de los elementos que no
 * han sido inicializados?
 */
public class Ejercicio01 {
  public static void main(String[] args) {
    int[] num = new int[12];
    num[0] = 39;
    num[1] = -2;
    num[4] = 0;
    num[7] = 14;
    num[9] = 5;
    num[10] = 120;
    System.out.print("Indice ");
    for (int i = 1; i <= 12; i++) {
      System.out.printf("%5d",i);
    }
    System.out.println();
    System.out.print("Valor  ");
    for (int i = 0; i < 12; i++) {
      System.out.printf("%5d", num[i]);
    }
    System.out.println();
    System.out.println("Los valores de los elementos no inicializados se inicializan solos a 0");
  }
}
