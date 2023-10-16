package CapituloJava05;
/**
 * Realiza un programa que sume los 100 números siguientes a un número entero
 * y positivo introducido por teclado. Se debe comprobar que el dato introducido
 * es correcto (que es un número positivo).
 */
import java.util.Scanner;
public class Ejercicio17 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce un numero: ");
    int n = sc.nextInt();
    int suma = 0;
    if (n>=0) {
      for (int i = n+1; i < n+101; i++) {
        suma += i;
      }
      System.out.println("La suma de los 100 numeros siguentes a "+n+"(sin contar "+n+") es "+suma+" si contamos "+n+" sería "+(suma+n));
    }else{
      System.out.println("El numero es incorrecto");
    }
    sc.close();
  }
}
