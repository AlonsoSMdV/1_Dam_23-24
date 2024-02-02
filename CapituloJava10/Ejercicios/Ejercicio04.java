package CapituloJava10.Ejercicios;

import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio04 {
    public static void main(String[] args) {
    ArrayList<String> s = new ArrayList<String>();

    for (int i = 0; i < 10; i++) {
      s.add(System.console().readLine());
    }
    System.out.println();
    for (String nombre : s) {
      System.out.print(nombre+" ");
    }
    System.out.println();
    System.out.println();
    Collections.sort(s);

    for (String nombre : s) {
      System.out.print(nombre+" ");
    }
  }
}
