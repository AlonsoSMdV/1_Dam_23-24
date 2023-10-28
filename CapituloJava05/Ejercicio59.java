package CapituloJava05;
/**
 * Escribe un programa que pinte por pantalla un árbol de navidad. El usuario debe
 * introducir la altura. En esa altura va incluida la estrella y el tronco. Suponemos
 * que el usuario introduce una altura mayor o igual a 4.
 */
import java.util.Scanner;
public class Ejercicio59 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduzca la altura del arbol: ");
    int altura = sc.nextInt();
    if (altura < 4) {
      System.out.println("Los datos introducidos no son correctos");
    } else {
      for (int i = 0; i < altura; i++) {
        if(i != altura-1){
          System.out.print(" ");
        }else{
          System.out.print("*");
        }
      }
      System.out.println();
      for (int i = 1; i <= altura; i++) { 

        for (int j = i; j <= altura-1; j++) {
          System.out.print(" ");
        }
        
        for (int j2 = 1; j2 <= i*2-1; j2++) {
          if( i == altura|| j2 == 1 || j2 == i*2-1){
            System.out.print("^");
          }else{
            System.out.print(" ");
          }
        }
        System.out.println();
      }
      for (int i = 0; i < altura; i++) {
        if(i != altura-1){
          System.out.print(" ");
        }else{
          System.out.print("Y");
        }
      }
    }
    sc.close();
  }
}
