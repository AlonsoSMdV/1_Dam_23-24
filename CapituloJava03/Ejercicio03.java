package CapituloJava03;
/**
 * Realiza un conversor de pesetas a euros. La cantidad de pesetas que se quiere
 * convertir debe ser introducida por teclado.
 */
import java.util.Scanner;

public class Ejercicio03 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduzca la cantidad de euros que desea convertir: ");
    double pesetas = sc.nextDouble();
    System.out.println("1 peseta son 0.0060€");
    System.out.println(pesetas+" euros son "+(pesetas*0.0060)+"€");
    sc.close();
  }
}
