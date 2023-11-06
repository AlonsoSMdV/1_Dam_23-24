package CapituloJava06;
/**
 * Realiza un programa que haga justo lo contrario a lo que hace el ejercicio 6. El
 * programa intentará adivinar el número que estás pensando - un número entre 0
 * y 100 - teniendo para ello 5 oportunidades. En cada intento fallido, el programa
 * debe preguntar si el número que estás pensando es mayor o menor que el que
 * te acaba de decir
 */
import java.util.Scanner;
public class Ejercicio14 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Piense un numero");
    int n = sc.nextInt(); 
    boolean salir = false;
    int intentos = 5;
    int num = (int)(Math.random()*101);
    do {
      int aux = num;
      System.out.println("El numero en el que piensas es "+num+"?");
      String respuesta = sc.next();
      if (respuesta.equals("si")|| respuesta.equals("Si") || n == num) {
        salir = true;
      }else if(respuesta.equals("no")|| respuesta.equals("No")){
        intentos--;
        salir = false;
        System.out.println("El numero es mayor que el que he dicho? Me quedan "+intentos);
        String mayorOMenor = sc.next();
        if (mayorOMenor.equals("si")) {
          num = (int)(Math.random()*(100-aux)+aux);
        } else if(mayorOMenor.equals("no")){
          num = (int)(Math.random()*(aux));
        }
      }
    } while (!salir && intentos > 0);
    System.out.println("Gracias por jugar");
    sc.close();
  }
}
