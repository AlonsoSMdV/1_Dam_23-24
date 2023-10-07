package CapituloJava03;
/**
 * Escribe un programa que calcule el salario semanal de un empleado en base a
 * las horas trabajadas, a razón de 12 euros la hora.
 */
import java.util.Scanner;

public class Ejercicio08 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduzca el numero de horas trabajadas a la semana: ");
    int horas = sc.nextInt();
    

    int salarioSemana = horas * 12;
    System.out.println("Su salario semanal es "+horas+" * 12 = "+salarioSemana);
    sc.close();
  }
}
