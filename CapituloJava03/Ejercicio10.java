package CapituloJava03;
/**
 * Realiza un conversor de Mb a Kb.
 */
import java.util.Scanner;

public class Ejercicio10 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduzca la cantidad de Mb que desea convertir: ");
    double mb = sc.nextDouble();
    System.out.println("1 Mb son 1000 Kb");
    System.out.println(mb+" Mb son "+(mb*1000)+" Kb");
    sc.close();
  }
}
