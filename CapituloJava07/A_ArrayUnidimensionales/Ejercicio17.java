package CapituloJava07.A_ArrayUnidimensionales;
/**
 * Escribe un programa que muestre por pantalla un array de 10 números enteros
 * generados al azar entre 0 y 100. A continuación, el programa debe pedir un
 * número al usuario. Se debe comprobar que el número introducido por teclado
 * se encuentra dentro del array, en caso contrario se mostrará un mensaje por
 * pantalla y se volverá a pedir un número; así hasta que el usuario introduzca uno
 * correctamente. A continuación, el programa rotará el array hacia la derecha
 * las veces que haga falta hasta que el número introducido quede situado en la
 * posición 0 del array. Por último, se mostrará el array rotado por pantalla.
 */
import java.util.Scanner;
public class Ejercicio17 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] nums = new int[10];
    for (int i = 0; i < nums.length; i++) {
      nums[i] = (int)(Math.random()*101);
    }
    for (int i = 0; i < nums.length; i++) {
      System.out.print(nums[i]+" ");
    }
    System.out.println();
    int n;
    boolean estaEnArray = true;
    System.out.print("Introduce un numero(Ha de estar en el array): ");
    do {
      n = sc.nextInt();
      for (int i : nums) {
        if(i == n){
          estaEnArray = true;
        }
        if (!estaEnArray) {
          System.out.print("El numero no existe, introduce otro: ");
        }
      }
    } while (!estaEnArray);
    while (nums[0] != n) {
      int aux = nums[9];
      for (int i = 9; i > 0; i--) {
        nums[i] = nums[i-1];
      }
      nums[0] = aux;
    }
    for (int i = 0; i < nums.length; i++) {
      System.out.print(nums[i]+" ");
    }
    sc.close();
  }
}
