package CapituloJava07.A_ArrayUnidimensionales;
/**
 * Escribe un programa que rellene un array de 20 elementos con números enteros
 * aleatorios comprendidos entre 0 y 400 (ambos incluidos). A continuación el
 * programa mostrará el array y preguntará si el usuario quiere resaltar los
 * múltiplos de 5 o los múltiplos de 7. Seguidamente se volverá a mostrar el array
 * escribiendo los números que se quieren resaltar entre corchetes.
 */
import java.util.Scanner;
public class Ejercicio16 {
  public static boolean esMultipo(int a, int b){
    return(a % b ) == 0;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] nums = new int[20];
    for (int i = 0; i < nums.length; i++) {
      nums[i] = (int)(Math.random()*401);
    }
    for (int i = 0; i < nums.length; i++) {
      System.out.print(nums[i]+" ");
    }
    System.out.println();
    System.out.print("Que numeros quiere resaltar(1 - los múltiplos de 5, 2 - los múltiplos de 7): ");
    int resalte = sc.nextInt();
    switch (resalte) {
      case 1:
        for (int i = 0; i < nums.length; i++) {
          if (esMultipo(nums[i], 5)) {
            System.out.print("["+nums[i]+"] ");
          }else{
            System.out.print(nums[i]+" ");
          }
        }
        break;

      case 2:
        for (int i = 0; i < nums.length; i++) {
          if (esMultipo(nums[i], 7)) {
            System.out.print("["+nums[i]+"] ");
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
