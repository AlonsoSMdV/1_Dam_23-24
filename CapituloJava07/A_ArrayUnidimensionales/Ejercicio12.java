package CapituloJava07.A_ArrayUnidimensionales;
/**
 * Realiza un programa que pida 10 números por teclado y que los almacene en
 * un array. A continuación se mostrará el contenido de ese array junto al índice
 * (0 – 9). Seguidamente el programa pedirá dos posiciones a las que llamaremos
 * “inicial” y “final”. Se debe comprobar que inicial es menor que final y que ambos
 * números están entre 0 y 9. El programa deberá colocar el número de la posición
 * inicial en la posición final, rotando el resto de números para que no se pierda
 * ninguno. Al final se debe mostrar el array resultante.
 */
import java.util.Scanner;
public class Ejercicio12 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce 10 numeros");
    int[] nums = new int[10];
    for (int i = 0; i < nums.length; i++) {
      nums[i] = sc.nextInt();
    }
    System.out.println("Array original:");
    System.out.print("Indice ");
    for (int i = 0; i < 10; i++) {
      System.out.printf("%5d",i);
    }
    System.out.println();
    System.out.print("Valor  ");
    for (int i = 0; i < 10; i++) {
      System.out.printf("%5d", nums[i]);
    }
    System.out.println();

    System.out.print("Introduce la primera posicion: ");
    int pos1 = sc.nextInt();
    int nInicial = nums[pos1];
    nums[pos1] = 0;
    System.out.print("Ahora la posicion final: ");
    int posFinal = sc.nextInt();
    
    int aux = nums[9];
    int[] resultado = new int[10];
    for (int i = 0; i <= pos1; i++) {
      if(i < nums.length - 1){
        resultado[i+1] = nums[i];
      }
    }
    for (int i = pos1 + 1; i < posFinal; i++) {
      if(i < nums.length-1){
        resultado[i] = nums[i];
      }
    }
    for (int i = posFinal; i < nums.length; i++) {
      if(i < nums.length-1){
        resultado[i+1] = nums[i];
      }
    }
    resultado[0] = aux;
    resultado[posFinal] = nInicial;
    System.out.println("Array resultado:");
    System.out.print("Indice ");
    for (int i = 0; i < 10; i++) {
      System.out.printf("%5d",i);
    }
    System.out.println();
    System.out.print("Valor  ");
    for (int i = 0; i < 10; i++) {
      System.out.printf("%5d", resultado[i]);
    }
    sc.close();
  }
}
