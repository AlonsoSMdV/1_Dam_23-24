package CapituloJava03;
/**
 * Realiza un conversor de euros a pesetas. La cantidad de euros que se quiere
 * convertir debe ser introducida por teclado.
 */
import java.util.Scanner;

public class Ejercicio02{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduzca la cantidad de euros que desea convertir: ");
    double euros = sc.nextDouble();
    System.out.println("1€ son 166.386 pesetas");
    System.out.println(euros+"€ son "+(euros*166.386)+" pesetas");
    sc.close();
  }
}