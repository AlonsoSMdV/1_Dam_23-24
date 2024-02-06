package CapituloJava10.Ejercicios;

import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio16 {
  public static void main(String[] args) {
    HashMap<String, String> capitales = new HashMap<String, String>();
    capitales.put("España", "Madrid");
    capitales.put("Portugal", "Lisboa");
    capitales.put("Francia", "París");

    Scanner sc = new Scanner(System.in, "Windows-1252");
    String paisIntro = "";
    String capital = "";
    do {
      System.out.print("Escribe el nombre de un país y te diré su capital: ");
      paisIntro = sc.nextLine();
      if (!paisIntro.equals("salir")) {
        if(capitales.containsKey(paisIntro)){
          System.out.println("La capital de " + paisIntro + " es " + capitales.get(paisIntro));
        }else{
          System.out.print("No conozco la respuesta ¿cuál es la capital de " + paisIntro + "?: ");
          capital = sc.nextLine();
          capitales.put(paisIntro, capital);
          System.out.println("Gracias por enseñarme nuevas capitales");
        }
        
      }
    } while (!paisIntro.equals("salir"));
    sc.close();
  }
}
