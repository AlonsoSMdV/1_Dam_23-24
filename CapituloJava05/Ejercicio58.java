package CapituloJava05;
/**
 * Realiza un programa que calcule la media de los dígitos que contiene un número
 * entero introducido por teclado.
 */
import java.util.Scanner;
public class Ejercicio58 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce un numero: ");
    long n = sc.nextLong();
    double suma = 0;
    double cont = 0;
    while(n > 0){
      cont++;
      suma += n%10;
      n /= 10;
    }
    double media = suma/cont;
    System.out.printf("La media es %.2f",media);
    sc.close();
  }
}
