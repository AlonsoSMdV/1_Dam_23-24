package CapituloJava05;
/**
 * Escribe un programa que muestre por pantalla todos los números enteros
 * positivos menores a uno leído por teclado que no sean divisibles entre otro
 * también leído de igual forma.
 */
import java.util.Scanner;
public class Ejercicio29 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduzca un numero:");
    int n = sc.nextInt();
    System.out.print("A continuacion, introduzca otro: ");
    int nAux = sc.nextInt();
    if(n < nAux){
      int aux = n;
      n = nAux;
      nAux = aux;
    }
    System.out.print("Los numeros positivos menores a "+n+" y que no son divisibles entre "+nAux+" son: ");
    for (int i = n; i > 0; i--) {
      if(i%nAux!=0){
        System.out.print(i+" ");
      }
    }
    sc.close();
  }
}
