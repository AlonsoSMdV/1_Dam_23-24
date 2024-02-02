package CapituloJava10.Ejercicios;

import java.util.ArrayList;

public class Ejercicio01 {
  public static void main(String[] args) {
    ArrayList<String> a = new ArrayList<String>();

    a.add("Juan");
    a.add("Miguel");
    a.add("Rodrigo");
    a.add("Rocio");
    a.add("Samuel");
    a.add("Jose");


    System.out.println("Contenido: ");
    for (String nombre : a) {
      System.out.println(nombre);
    }
  }
}
