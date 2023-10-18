package CapituloJava05;
/**
 * Escribe un programa que lea un número n e imprima una pirámide de números
 * con n filas como en la siguiente figura:
 */
import java.util.Scanner;
public class Ejercicio24 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce la altura de la pirámide: ");
    int altura = sc.nextInt();
    for (int i = 1; i <= altura; i++) { 
      for (int j = i; j < altura; j++) {
        System.out.print("  ");
      }

      for (int j2 = 1; j2 < (i*2)/2; j2++) {
        System.out.print(j2+" ");
        
      }
      for (int j2 = (i*2)/2; j2 >= 1; j2--) {
        System.out.print(j2+" ");
        
      }
      
      System.out.println();
    }
    sc.close();
  }
}
