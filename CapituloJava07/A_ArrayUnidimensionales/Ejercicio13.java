package CapituloJava07.A_ArrayUnidimensionales;
/**
 * Escribe un programa que rellene un array de 100 elementos con números enteros aleatorios comprendidos entre 0 y 500 
 * (ambos incluidos). A continuación el programa mostrará el array y preguntará si el usuario quiere destacar el
 *  máximo o el mínimo. Seguidamente se volverá a mostrar el array escribiendo
 * el número destacado entre dobles asteriscos.
 */
import java.util.Scanner;
public class Ejercicio13 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] nums = new int[100];
    int max = 0;
    int min = 500;
    for (int i = 0; i < nums.length; i++) {
      nums[i] = (int)(Math.random()*501);
      if (nums[i] > max) {
        max = nums[i];
      }
      if (nums[i] < min) {
        min = nums[i];
      }
    }
    for (int i = 0; i < nums.length; i++) {
      System.out.print(nums[i]+" ");
    }
    System.out.println();
    System.out.print("Que numero desea marcar(1 - minimo; 2 - maximo): ");
    int maracado = sc.nextInt();
    System.out.println();
    switch (maracado) {
      case 1:
        for (int i = 0; i < nums.length; i++) {
          if(min == nums[i]){
            System.out.print("**"+nums[i]+"** ");
          }else{
            System.out.print(nums[i]+" ");
          }
        }
        break;

      case 2:
        for (int i = 0; i < nums.length; i++) {
          if(max == nums[i]){
            System.out.print("**"+nums[i]+"** ");
          }else{
            System.out.print(nums[i]+" ");
          }
        }
        break;
    
      default:
        break;
    }
    sc.close();
  }
}
