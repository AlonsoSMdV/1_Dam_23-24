package CapituloJava07.A_ArrayUnidimensionales;
/**
 * Escribe un programa que rellene un array de 15 elementos con números enteros
 * comprendidos entre 0 y 500 (ambos incluidos). A continuación, se mostrará el
 * array “cincuerizado”, según el siguiente criterio: si el número que hay en una
 * posición del array es múltiplo de 5, se deja igual, y si no, se cambia por el
 * siguiente múltiplo de 5 que exista a partir de él.
 */
public class Ejercicio21 {
  public static void main(String[] args) {
    int[] nums = new int[15];
    for (int i = 0; i < nums.length; i++) {
      nums[i] = (int)(Math.random()*501);
    }
    System.out.println("Array original:");
    for (int i = 0; i < nums.length; i++) {
      System.out.print(nums[i]+" ");
    }
    System.out.println();
    for (int i = 0; i < nums.length; i++) {
      if(nums[i] % 5 != 0){
        while(nums[i] % 5 != 0){
          nums[i]++;
        }
      }
    }
    System.out.println();
    System.out.println("Array cincuerizado:");
    for (int i = 0; i < nums.length; i++) {
      System.out.print(nums[i]+" ");
    }
  }
}
