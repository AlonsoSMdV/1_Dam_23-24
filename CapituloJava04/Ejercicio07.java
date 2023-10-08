package CapituloJava04;
/**
 * Realiza un programa que calcule la media de tres notas.
 */
import java.util.Scanner;
public class Ejercicio07 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Por favor, a continuación indique tres notas de examen");
    System.out.print("Primera nota: ");
    double n1 = sc.nextDouble();
    System.out.print("Segunda nota: ");
    double n2 = sc.nextDouble();
    System.out.print("Tercera nota: ");
    double n3 = sc.nextDouble();

    double media = (n1+n2+n3)/3;
    if(media<5){
      System.out.printf("Tu nota media es de %.2f por lo que estás suspenso",media);
    }else{
      System.out.printf("Tu nota media es de %.2f por lo que estás aprobado",media);
    }
    sc.close();
  }
}
