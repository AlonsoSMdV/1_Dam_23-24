package CapituloJava05;
/**
 * Realiza una programa que calcule las horas transcurridas entre dos horas de
 * dos días de la semana. No se tendrán en cuenta los minutos ni los segundos.
 * El día de la semana se puede pedir como un número (del 1 al 7) o como una
 * cadena (de “lunes” a “domingo”). Se debe comprobar que el usuario introduce
 * los datos correctamente y que el segundo día es posterior al primero.
 */
import java.util.Scanner;
public class Ejercicio30 {
  public static void Menu(){
    System.out.println("Elija dos opciones(1-7)");
    System.out.println("1. Lunes");
    System.out.println("2. Martes");
    System.out.println("3. Miercoles");
    System.out.println("4. Jueves");
    System.out.println("5. Viernes");
    System.out.println("6. Sábado");
    System.out.println("7. Domingo");
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Menu();
    System.out.println("Introduzca el primer dia y la primera hora.");
    System.out.print("Dia: ");
    int dia1 = sc.nextInt();
    String primerDia = "";
    System.out.print("Hora: ");
    int hora1 = sc.nextInt();
    switch (dia1) {
      case 1:
        primerDia = "lunes";
        break;
        
      case 2:
        primerDia = "martes";
        break;

      case 3:
        primerDia = "miércoles";
        break;

      case 4:
        primerDia = "jueves";
        break;

      case 5:
        primerDia = "viernes";
        break;

      case 6:
        primerDia = "sábado";
        break;

      case 7:
        primerDia = "domigo";
        break;
    
      default:
        break;
    }

    System.out.println("Introduzca el segundo dia y la segunda hora.");
    System.out.print("Dia: ");
    int dia2 = sc.nextInt();
    String segundoDia = "";
    System.out.print("Hora: ");
    int hora2 = sc.nextInt();
    switch (dia2) {
      case 1:
        segundoDia = "lunes";
        break;
        
      case 2:
        segundoDia = "martes";
        break;

      case 3:
        segundoDia = "miércoles";
        break;

      case 4:
        segundoDia = "jueves";
        break;

      case 5:
        segundoDia = "viernes";
        break;

      case 6:
        segundoDia = "sábado";
        break;

      case 7:
        segundoDia = "domigo";
        break;
    
      default:
        break;
    }
    if (dia1>dia2) {
      System.out.println("Los datos introducidos no son correctos");
    }else{
      int cuentahoras = 0;
      int hora1aux = hora1;
      while (dia1<dia2 || hora1aux<hora2) {
        hora1aux++;
        cuentahoras++;
        if(hora1aux > 23){
          hora1aux = 0;
          dia1++;
        }
      }
      System.out.printf("Entre las %d:00h del %s y las %d:00h del %s hay %d hora/s",hora1,primerDia,hora2,segundoDia,cuentahoras);
    }
    sc.close();
  }
}
