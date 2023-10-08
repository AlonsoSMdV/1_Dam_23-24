package CapituloJava04;
/**
 * Escribe un programa que pida por teclado un día de la semana y que diga qué
 * asignatura toca a primera hora ese día.
 */
import java.util.Scanner;

public class Ejercicio01 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("┌────────┬────────┬────────┬────────┬────────┐");
    System.out.println("│Lunes   │Martes  │Miérc.  │Jueves  │Viernes │");
    System.out.println("├────────┼────────┼────────┼────────┼────────┤");
    System.out.printf("│PROG%4s│%8s│%8s│PROG%4s│%8s│\n","","","","","");
    System.out.println("├────────┼────────┼────────┼────────┼────────┤");
    System.out.printf("│PROG%4s│%8s│%8s│PROG%4s│%8s│\n","","","","","");
    System.out.println("├────────┼────────┼────────┼────────┼────────┤");
    System.out.printf("│PROG%4s│BBDD%4s│PROG%4s│PROG%4s│%8s│\n","","","","","");
    System.out.println("├────────┼────────┼────────┼────────┼────────┤");
    System.out.printf("│EMPR%4s│BBDD%4s│PROG%4s│BBDD%4s│%-8s│\n","","","","","EMPR");
    System.out.println("├────────┼────────┼────────┼────────┼────────┤");
    System.out.printf("│%8s│%8s│BBDD%4s│BBDD%4s│%-8s│\n","","","","","EMPR");
    System.out.println("├────────┼────────┼────────┼────────┼────────┤");
    System.out.printf("│%8s│%8s│BBDD%4s│%8s│%-8s│\n","","","","","EMPR");
    System.out.println("└────────┴────────┴────────┴────────┴────────┘");


    System.out.println("Introduce un dia de la semana: ");
    String dia = sc.nextLine();

    switch (dia) {
      case "lunes","jueves":
        System.out.print("Hoy te toca programación a partir de las 8:15");
        break;
      case "martes":
        System.out.println("Hoy te toca Bases de Datos a partir de las 10:15");
        break;
      case "miercoles":
        System.out.print("Hoy te toca programación  a partir de las 10:15");
        break;
      case "viernes":
        System.out.println("Hoy te toca empresariales a partir de las 11:45");
        break;
      case "sabado","domingo":
        System.out.println("Hoy no hay clases, pasa un buen día");
        break;
        
    
      default:
        break;
    }
    sc.close();
  }
}
