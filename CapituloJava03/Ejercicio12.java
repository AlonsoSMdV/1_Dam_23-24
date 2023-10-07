package CapituloJava03;
/**
 * Realiza un programa que calcule la nota que hace falta sacar en el segundo
 * examen de la asignatura Programación para obtener la media deseada. Hay
 * que tener en cuenta que la nota del primer examen cuenta el 40% y la del
 * segundo examen un 60%.
 */
import java.util.Scanner;

public class Ejercicio12 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce la nota del primer examen: ");
    double nota1 = sc.nextDouble();
    double nota1Porcentaje = nota1*0.4;
    System.out.println("¿Qué nota quieres sacar en el trimestre? ");
    double notaTrimestre = sc.nextDouble();
    double nota2 = (notaTrimestre-nota1Porcentaje)/0.6;
    System.out.printf("Para tener un "+notaTrimestre+" en el trimestre necesitas sacar un %.2f en el segundo examen.",nota2);
    sc.close();
  }
}
