package CapituloJava07.A_ArrayUnidimensionales;
/**
 * Define tres arrays de 20 números enteros cada una, con nombres numero, cuadrado
 * y cubo. Carga el array numero con valores aleatorios entre 0 y 100. En el array
 * cuadrado se deben almacenar los cuadrados de los valores que hay en el array
 * numero. En el array cubo se deben almacenar los cubos de los valores que hay en
 * numero. A continuación, muestra el contenido de los tres arrays dispuesto en tres
 * columnas.
 */

public class Ejercicio04 {
  public static void main(String[] args) {
    int[] numero = new int[20];
    int[] cuadrado = new int[20];
    int[] cubo = new int[20];

    for (int i = 0; i < 20; i++) {
      int n = (int)(Math.random()*101);
      numero[i] = n;
      cuadrado[i] = (int)Math.pow(n, 2);
      cubo[i] = (int)Math.pow(n, 3);
    }
    System.out.println();
    System.out.println("numero    cuadrado        cubo");
    for (int i = 0; i < 20; i++) {
      System.out.printf("%6d %11d %11d\n",numero[i],cuadrado[i],cubo[i]);
    }

  }
}
