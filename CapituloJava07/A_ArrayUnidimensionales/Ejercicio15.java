package CapituloJava07.A_ArrayUnidimensionales;
/**
 * Un restaurante nos ha encargado una aplicación para colocar a los clientes en
 * sus mesas. En una mesa se pueden sentar de 0 (mesa vacía) a 4 comensales
 * (mesa llena). Cuando llega un cliente se le pregunta cuántos son. De momento
 * el programa no está preparado para colocar a grupos mayores a 4, por tanto, si
 * un cliente dice por ejemplo que son un grupo de 6, el programa dará el mensaje
 * “Lo siento, no admitimos grupos de 6, haga grupos de 4 personas
 * como máximo e intente de nuevo”. Para el grupo que llega, se busca
 * siempre la primera mesa libre (con 0 personas). Si no quedan mesas libres, se
 * busca donde haya un hueco para todo el grupo, por ejemplo si el grupo es de
 * dos personas, se podrá colocar donde haya una o dos personas. Inicialmente,
 * las mesas se cargan con valores aleatorios entre 0 y 4. Cada vez que se sientan
 * nuevos clientes se debe mostrar el estado de las mesas. Los grupos no se
 * pueden romper aunque haya huecos sueltos suficientes. El funcionamiento del
 * programa se ilustra a continuación:
 */
import java.util.Scanner;
public class Ejercicio15 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] mesa = new int[10];
     for (int i = 0; i < mesa.length; i++) {
      mesa[i] = (int)(Math.random()*5);
     }
     int clientes = 0;

     do {
      System.out.println("┌─────────┬──────┬──────┬──────┬──────┬──────┬──────┬──────┬──────┬──────┬──────┐");
    System.out.print("│Mesa nº  │");
    for (int i = 1; i <= 10; i++) {
      System.out.printf("%4d%2s│",i," ");
    }
    System.out.println();
    System.out.println("├─────────┼──────┼──────┼──────┼──────┼──────┼──────┼──────┼──────┼──────┼──────┤");
    System.out.print("│Ocupación│");
    for (int i = 0; i < mesa.length; i++) {
      System.out.printf("%4d%2s│",mesa[i]," ");
    }
    System.out.println();
    System.out.println("└─────────┴──────┴──────┴──────┴──────┴──────┴──────┴──────┴──────┴──────┴──────┘");
    System.out.println();
    System.out.print("¿Cuántos son? (Introduzca -1 para salir del programa): ");
    clientes = sc.nextInt();
    if (clientes > 4) {
      System.out.println("Lo siento no admitimos grupos de "+clientes+", haga grupos de 4 como maximo e intentelo de nuevo");
    } else {
      int aux = 0;
      boolean mesaVacia = false;
      for (int i = mesa.length-1; i >= 0 ; i--) {
        if(mesa[i] == 0){
          aux = i;
          mesaVacia = true;
        }
      }
      if (mesaVacia) {
        System.out.println("Porfavor sientense en la mesa "+(aux+1));
        mesa[aux] = clientes;
      }else{
        boolean hayHueco = false;
        for (int i = mesa.length-1; i >= 0; i--) {
          if(clientes <= (4-mesa[i])){
            aux = i;
            hayHueco = true;
          }
        }
        if (hayHueco) {
          mesa[aux] += clientes;
          System.out.println("Van a tener que compartir mesa, por favor sintensen en la mesa "+(aux+1));
        } else {
          System.out.println("Lo siento, no tenemos hueco");
        }
      }
    }
    
    } while (clientes > 0);
    System.out.println("Gracias, hasta pronto");
    sc.close();
  }
}
