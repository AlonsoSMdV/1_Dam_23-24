package CapituloJava03;
/**
 * Escribe un programa que calcule el volumen de un cono según la fórmula V =1/3*π*r^2*h
 */
import java.util.Scanner;

public class Ejercicio09 {
  public static void main(String[] args) {
    double PI = 3.14159265;
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduzca el radio del cono: ");
    int radio = sc.nextInt();
    int radioCuadrado = radio*radio;
    System.out.print("Introduzca la altura del cono: ");
    int altura = sc.nextInt();

    double volumen = ((1.0/3.0)*PI*radioCuadrado*altura);
    System.out.println("Su área es 1/3 * 3.14 * "+radio+"^2 * "+altura+" = "+volumen);
    sc.close();
  }
}
