package CapituloJava03;
/**
 * Realiza un conversor de Kb a Mb.
 */
import java.util.Scanner;

public class Ejercicio11 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduzca la cantidad de Mb que desea convertir: ");
    double kb = sc.nextDouble();
    System.out.println("1 Kb son 0.001 Mb");
    System.out.println(kb+" Kb son "+(kb*0.001)+" Kb");
    sc.close();
  }
  
}
