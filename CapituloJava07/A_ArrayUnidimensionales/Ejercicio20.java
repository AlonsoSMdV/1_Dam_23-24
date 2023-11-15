package CapituloJava07.A_ArrayUnidimensionales;
/**
 * Implementa un programa que calcule la denominación ordinal de los reyes de
 * una secuencia histórica. El programa solicitará la cantidad de reyes que se
 * van a introducir, y a continuación recibirá los nombres de los reyes. Presentará
 * por pantalla dichos nombres, pero colocándoles el ordinal correspondiente. Así,
 * por ejemplo, si hay dos Felipes en los nombres de los reyes, el primero debería
 * aparecer como Felipe 1º y el segundo como Felipe 2º.
 */
import java.util.Scanner;
public class Ejercicio20 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduzca el número total de nombres de reyes: ");
    int numeroReyes = sc.nextInt();
    System.out.println("Vaya introduciendo los nombres de los reyes y pulsando INTRO.\r");
    String[] reyes = new String[numeroReyes];
    for (int i = 0; i < reyes.length; i++) {
      reyes[i] = sc.next();
    }

    System.out.println("Los reyes introducidos  son: ");
    for (int i = 0; i < numeroReyes; i++) {
      int numeroRey = 1;
            
      for (int j = 0; j < i; j++) {
          if (reyes[i].equals(reyes[j])) {
          numeroRey++;
          }
      }
      System.out.println(reyes[i]+" "+numeroRey+"º");
    }
    sc.close();
  }
}
