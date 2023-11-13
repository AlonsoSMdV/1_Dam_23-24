package CapituloJava07.A_ArrayUnidimensionales;
/**
 * Realiza un programa que pida 10 números por teclado y que los almacene en
 * un array. A continuación se mostrará el contenido de ese array junto al índice
 * (0 – 9) utilizando para ello una tabla. Seguidamente el programa pasará los
 * primos a las primeras posiciones, desplazando el resto de números (los que no
 * son primos) de tal forma que no se pierda ninguno. Al final se debe mostrar el
 * array resultante.
 */
import java.util.Scanner;
public class Ejercicio11 {
  public static boolean esPrimo(int n){
    boolean esPrimo = true;
    for (int i = 2; i < n; i++) {
      if(n%i!=0){
        esPrimo = true;
      }else{
        esPrimo = false;
        break;
      }
    }
    return esPrimo;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("introduce 10 numeros: ");
    int[] nums = new int[10];
    int primo = 0;
    int noPrimo = 0;
    for (int i = 0; i < nums.length; i++) {
      nums[i] = sc.nextInt();
      if (esPrimo(nums[i])) {
        primo++;
      }else{
        noPrimo++;
      }
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
    int[] arrayPrimos = new int[primo];
    int j = 0;
    int[] arrayNoPrimos = new int[noPrimo];
    int k = 0;
    for (int i = 0; i < nums.length; i++) {
      if (esPrimo(nums[i])) {
        arrayPrimos[j] = nums[i];
        j++;
      }
      if (!esPrimo(nums[i])) {
        arrayNoPrimos[k] = nums[i];
        k++;
      }
    }

    int[] resultado = new int[primo+noPrimo];
    k = 0;
    for (int i = 0; i < resultado.length; i++) {
      if(i < primo){
        resultado[i] = arrayPrimos[i];
      }else{
        resultado[i] = arrayNoPrimos[k];
        k++;
      }
    }

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
