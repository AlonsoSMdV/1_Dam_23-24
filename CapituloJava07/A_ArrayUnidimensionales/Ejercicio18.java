package CapituloJava07.A_ArrayUnidimensionales;
/**
 * Realiza un programa que genere 10 números enteros aleatorios entre 0 y 200
 * ambos incluidos y que los almacene en un array. A continuación, el programa
 * debe mostrar el contenido de ese array junto al índice (0 – 9). Seguidamente el
 * programa debe colocar de forma alterna y en orden los menores o iguales de
 * 100 y los mayores de 100: primero menor, luego mayor, luego menor, luego
 * mayor… Cuando se acaben los menores o los mayores, se completará con los
 * números que queden.
 */
public class Ejercicio18 {
  public static void main(String[] args) {
    int[] nums = new int[10];
    int[] arrayMayores = new int[10];
    int[] arrayMenores = new int[10];
    int menores = 0;
    int mayores = 0;
    for (int i = 0; i < nums.length; i++) {
      nums[i] = (int)(Math.random()*201);
      if (nums[i] > 100) {
        arrayMayores[mayores] = nums[i];
        mayores++;
      } else {
        arrayMenores[menores] = nums[i];
        menores++;
      }
    }
    System.out.println("Array original:");
    System.out.println("┌────────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐\r");
    System.out.print("│ Índice │");
    for (int i = 0; i < nums.length; i++) {
      System.out.printf("%4d │",i);
    }
    System.out.println();
    System.out.println("├────────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤\r");
    System.out.print("│ Valor  │");
    for (int i = 0; i < nums.length; i++) {
      System.out.printf("%4d │",nums[i]);
    }
    System.out.println();
    System.out.println("└────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘\r");
    int j = 0;
    int mas = 0; 
    int menos = 0;
    int[] resultado = new int[10];
    do {
      if (menos < menores) {
        resultado[j++]  = arrayMenores[menos++];
      } 
      
      if (mas < mayores) {
        resultado[j++]  = arrayMayores[mas++];
      } 

    } while (j < 10);
    System.out.println("Array resultado:");
    System.out.println("┌────────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐\r");
    System.out.print("│ Índice │");
    for (int i = 0; i < nums.length; i++) {
      System.out.printf("%4d │",i);
    }
    System.out.println();
    System.out.println("├────────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤\r");
    System.out.print("│ Valor  │");
    for (int i = 0; i < nums.length; i++) {
      System.out.printf("%4d │",resultado[i]);
    }
    System.out.println();
    System.out.println("└────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘\r");
  }
}
