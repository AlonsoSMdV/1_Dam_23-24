package CapituloJava10.Ejercicios;

import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio03 {
  public static void main(String[] args) {
    ArrayList<Integer> n = new ArrayList<Integer>();

    for (int i = 0; i < 10; i++) {
      n.add(Integer.parseInt(System.console().readLine()));
    }
    System.out.println();
    for (Integer i : n) {
      System.out.print(i+" ");
    }
    System.out.println();
    System.out.println();
    Collections.sort(n);

    for (Integer i : n) {
      System.out.print(i+" ");
    }
  }
}
