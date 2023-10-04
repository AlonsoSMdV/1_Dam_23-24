package CapituloJava01;

public class Ejercicio05 {
   // Regular Colors
   public static final String BLACK = "\033[0;30m";   // BLACK
   public static final String RED = "\033[0;31m";     // RED
   public static final String GREEN = "\033[0;32m";   // GREEN
   public static final String YELLOW = "\033[0;33m";  // YELLOW
   public static final String BLUE = "\033[0;34m";    // BLUE
   public static final String PURPLE = "\033[0;35m";  // PURPLE
   public static final String CYAN = "\033[0;36m";    // CYAN
   public static final String WHITE = "\033[0;37m";   // WHITE
  public static void main(String[] args) {
    
    System.out.println("┌────────┬────────┬────────┬────────┬────────┐");
    System.out.println("│Lunes   │Martes  │Miérc.  │Jueves  │Viernes │");
    System.out.println("├────────┼────────┼────────┼────────┼────────┤");

    System.out.printf("│"+BLUE+"PROG%4s"+WHITE+"│%8s│%8s│"+BLUE+"PROG%4s"+WHITE+"│%8s"+WHITE+"│\n","","","","","");

    System.out.println(WHITE+"├────────┼────────┼────────┼────────┼────────┤");

    System.out.printf("│"+BLUE+"PROG%4s"+WHITE+"│%8s│%8s│"+BLUE+"PROG%4s"+WHITE+"│%8s│\n","","","","","");

    System.out.println(WHITE+"├────────┼────────┼────────┼────────┼────────┤");

    System.out.printf("│"+BLUE+"PROG%4s"+WHITE+"│"+YELLOW+"BBDD%4s"+WHITE+"│"+BLUE+"PROG%4s"+WHITE+"│"+BLUE+"PROG%4s"+WHITE+"│%8s│\n","","","","","");

    System.out.println(WHITE+"├────────┼────────┼────────┼────────┼────────┤");

    System.out.printf("│"+GREEN+"EMPR%4s"+WHITE+"│"+YELLOW+"BBDD%4s"+WHITE+"│"+BLUE+"PROG%4s"+WHITE+"│"+YELLOW+"BBDD%4s"+WHITE+"│"+GREEN+"EMPR%4s"+WHITE+"│\n","","","","","");

    System.out.println(WHITE+"├────────┼────────┼────────┼────────┼────────┤");

    System.out.printf("│%8s│%8s│"+YELLOW+"BBDD%4s"+WHITE+"│"+YELLOW+"BBDD%4s"+WHITE+"│"+GREEN+"EMPR%4s"+WHITE+"│\n","","","","","");

    System.out.println(WHITE+"├────────┼────────┼────────┼────────┼────────┤");

    System.out.printf("│%8s│%8s│"+YELLOW+"BBDD%4s"+WHITE+"│%8s│"+BLUE+"EMPR%4s"+WHITE+"│\n","","","","","");
    
    System.out.println(WHITE+"└────────┴────────┴────────┴────────┴────────┘");
  }
}
