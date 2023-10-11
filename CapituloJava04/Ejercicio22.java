package CapituloJava04;
/**
 * Realiza un programa que, dado un día de la semana (de lunes a viernes) y una
 * hora (horas y minutos), calcule cuántos minutos faltan para el fin de semana.
 * Se considerará que el fin de semana comienza el viernes a las 15:00h. Se da
 * por hecho que el usuario introducirá un día y hora correctos, anterior al viernes
 * a las 15:00h.
 */
import java.util.Scanner;
public class Ejercicio22 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce el día de la semana: ");
    String dia = sc.next();

    System.out.print("Introduce la hora: ");
    int hora = sc.nextInt();
    System.out.print("Introduce los miuntos: ");
    int mins = sc.nextInt();
    int minutos = (hora*60)+mins;
    int minutosViernes = 900;
    int minutosDia = 1440;
    int minRestantes= 0;
    int miuntosTotales=0;
    switch (dia) {
      case "lunes":
        minRestantes = minutosDia-minutos;
        minutosDia *= 3;
        miuntosTotales = minutosDia+minutosViernes;
        System.out.println("Quedan "+(miuntosTotales-minRestantes)+" minutos para el finde");
        break;

      case "martes":
        minRestantes = minutosDia-minutos;
        minutosDia *= 2;
        miuntosTotales = minutosDia+minutosViernes;
        System.out.println("Quedan "+(miuntosTotales-minRestantes)+" minutos para el finde");
        break;

      case "miercoles":
        minRestantes = minutosDia-minutos;
        miuntosTotales = minutosDia+minutosViernes;
        System.out.println("Quedan "+(miuntosTotales-minRestantes)+" minutos para el finde");
        break;

      case "jueves":
        minRestantes = minutosDia-minutos;
        System.out.println("Quedan "+(minutosViernes-minRestantes)+" minutos para el finde");
        break;

      case "viernes":
        System.out.println("Quedan "+(minutosViernes-minutos)+" minutos para el finde");
        break;
    
      default:
        break;
    }
    sc.close();
  }
}
