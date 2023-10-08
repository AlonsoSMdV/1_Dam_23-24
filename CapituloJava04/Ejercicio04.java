package CapituloJava04;
/**
 * Vamos a ampliar uno de los ejercicios de la relación anterior para considerar
 * las horas extras. Escribe un programa que calcule el salario semanal de un
 * trabajador teniendo en cuenta que las horas ordinarias (40 primeras horas de
 * trabajo) se pagan a 12 euros la hora. A partir de la hora 41, se pagan a 16 euros
 * la hora.
 */
import java.util.Scanner;

public class Ejercicio04 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Por favor introduzca el número de horas trabajadas durante la semana: ");
    int horas = sc.nextInt();
    
    if(horas <= 40){
      System.out.println("El sueldo semanal que le corresponde es de "+(horas * 12)+" euros");
    }else if(horas > 40){
      int horasSobrantes = horas - 40;
      System.out.println("El sueldo semanal que le corresponde es de "+((40 * 12)+(horasSobrantes*16))+" euros");
    }
    sc.close();
  }
}
