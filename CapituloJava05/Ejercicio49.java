package CapituloJava05;
/**
 * Realiza un programa que calcule el máximo, el mínimo y la media de una serie
 * de números enteros positivos introducidos por teclado. El programa terminará
 * cuando el usuario introduzca un número primo. Este último número no se
 * tendrá en cuenta en los cálculos. El programa debe indicar también cuántos
 * números ha introducido el usuario (sin contar el primo que sirve para salir).
 */
import java.util.Scanner;
public class Ejercicio49 {
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
    System.out.println("Vaya ntroduciendo números enteros positivos. Para terminar, introduzca un número primo: ");
    int n;
    int maximo = Integer.MIN_VALUE;
    int minimo = Integer.MAX_VALUE;
    int suma = 0;
    int contador = 0;
    do {
      n = sc.nextInt();
      if(esPrimo(n)){

      }else{
        contador++;
      suma+= n;
      if (n > maximo) {
        maximo = n;
      }
      if(n < minimo){
        minimo = n;
      }
      }
    } while (!esPrimo(n));
    double media = (double)suma/contador;
    System.out.printf("Ha introducido %d numeros no primos\nMaximo: %d\nMinimo: %d\nMedia: %.2f",contador,maximo,minimo,media);
    sc.close();
  }
}
