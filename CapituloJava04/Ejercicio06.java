package CapituloJava04;
/**
 * Realiza un programa que calcule el tiempo que tardará en caer un objeto desde
 * una altura h. Aplica la fórmula t =√2h/g siendo g = 9.81m/s^2
 */
import java.util.Scanner;

public class Ejercicio06 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Este programa calcula el tiempo que tarda en caer un objeto desde una altura h");
    System.out.print("Por favor, introduzca el valor de la altura: ");
    double h = sc.nextInt();
    double g = 9.81;
    

    if(h < 0){
      System.out.println("No se puede calcular con una altura negativa");
    }else{
      double tiempo = Math.sqrt((2*h)/g);
      System.out.printf("t = %.2f s",tiempo);
    }
    sc.close();
  }
}
