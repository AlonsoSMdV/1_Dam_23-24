package CapituloJava05;
/**
 * Igual que el ejercicio anterior pero esta vez se debe pintar una pirámide hueca.
 */
import java.util.Scanner;
public class Ejercicio20 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce la altura de la pirámide: ");
    int altura = sc.nextInt();
    System.out.print("Ahora con que caracter quiere pintar la piramide: ");
    String caracter = sc.next();
    for (int i = 1; i <= altura; i++) { 
      for (int j = i; j <= altura-1; j++) {
        System.out.print("  ");
      }
      
      for (int j2 = 1; j2 <= i*2-1; j2++) {
        if( i == altura|| j2 == 1 || j2 == i*2-1){
          System.out.print(caracter+" ");
        }else{
          System.out.print("  ");
        }
      }
      System.out.println();
    }
    sc.close();
  }
}
