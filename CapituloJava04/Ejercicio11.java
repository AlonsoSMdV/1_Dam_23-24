package CapituloJava04;

import java.util.Scanner;

/**
 * Escribe un programa que dada una hora determinada (horas y minutos), calcule
 * los segundos que faltan para llegar a la medianoche.
 */
public class Ejercicio11 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("A continuación deberás introducir una hora y unos minutos");
    System.out.print("Introduce una hora: ");
    int hora = sc.nextInt();
    System.out.print("Ahora introduzca los minutos: ");
    int minutos = sc.nextInt();

    if(hora < 0 || hora > 23 || minutos < 0 || minutos > 59){
      System.out.println("Estos datos introducidos no son válidos");
    }else{
      int segundosTotales = (hora*3600)+(minutos*60);
      int segundosDia = 86400;
      System.out.printf("Para medianoche faltan %d segs", (segundosDia-segundosTotales));
    }
    sc.close();
  }
}
