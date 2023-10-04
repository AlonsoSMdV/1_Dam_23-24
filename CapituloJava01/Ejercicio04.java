package CapituloJava01;

public class Ejercicio04 {
  public static void main(String[] args) {
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
  }
}
