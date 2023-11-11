package CapituloJava07.A_ArrayUnidimensionales;
/**
 * Escribe un programa que genere 100 números aleatorios del 0 al 20 y que los
 * muestre por pantalla separados por espacios. El programa pedirá entonces por
 * teclado dos valores y a continuación cambiará todas las ocurrencias del primer
 * valor por el segundo en la lista generada anteriormente. Los números que se
 * han cambiado deben aparecer entrecomillados.
 */
import java.util.Scanner;
public class Ejercicio07 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] numeros = new int[100];
    for (int i = 0; i < numeros.length; i++) {
      numeros[i] = (int)(Math.random()*21);
    }

    for (int i = 0; i < numeros.length; i++) {
      System.out.print(numeros[i]+" ");
    }

    System.out.println();
    System.out.print("Introduce un numero: ");
    int n1 = sc.nextInt();
    System.out.print("Introduce otro numero: ");
    int n2 = sc.nextInt();
    for (int i = 0; i < numeros.length; i++) {
      if(n1 == numeros[i]){
        numeros[i] = n2;
        System.out.print("'"+numeros[i]+"' ");
      }else{
        System.out.print(numeros[i]+" ");
      }
    }
    sc.close();
  }
}
