package CapituloJava04;
/**
 * Escribe un programa que nos diga el horóscopo a partir del día y el mes de
 * nacimiento. 
 */
import java.util.Scanner;

public class Ejercicio10 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce tu dia de nacimiento: ");
    int dia = sc.nextInt();
    System.out.print("Ahora introduce tu mes: ");
    String mes = sc.next();

    switch (mes) {
      case "enero":
        if (dia > 20) {
          System.out.println("Eres acuario");
        }else{
          System.out.println("Eres capricornio");
        }
        break;
      case "febrero":
        if (dia >= 20) {
          System.out.println("Eres piscis");
        }else{
          System.out.println("Eres acuario");
        }
        break;
      case "marzo":
        if (dia > 20) {
          System.out.println("Eres aries");
        }else{
          System.out.println("Eres piscis");
        }
        break;
      case "abril":
        if (dia >= 20) {
          System.out.println("Eres tauro");
        }else{
          System.out.println("Eres aries");
        }
        break;
      case "mayo":
        if (dia > 20) {
          System.out.println("Eres geminis");
        }else{
          System.out.println("Eres tauro");
        }
        break;
      case "junio":
        if (dia > 20) {
          System.out.println("Eres cancer");
        }else{
          System.out.println("Eres geminis");
        }
        break;
      case "julio":
        if (dia > 22) {
          System.out.println("Eres leo");
        }else{
          System.out.println("Eres cancer");
        }
        break;
      case "agosto":
        if (dia > 22) {
          System.out.println("Eres virgo");
        }else{
          System.out.println("Eres leo");
        }
        break;
      case "septiembre":
        if (dia > 22) {
          System.out.println("Eres libra");
        }else{
          System.out.println("Eres virgo");
        }
        break;
      case "octubre":
        if (dia > 22) {
          System.out.println("Eres escorpio");
        }else{
          System.out.println("Eres libra");
        }
        break;
      case "noviembre":
        if (dia > 21) {
          System.out.println("Eres sagitario");
        }else{
          System.out.println("Eres escorpio");
        }
        break;
      case "diciembre":
        if (dia > 21) {
          System.out.println("Eres capricornio");
        }else{
          System.out.println("Eres sagitario");
        }
        break;
    
      default:
        break;
    }
    sc.close();
  }
}
