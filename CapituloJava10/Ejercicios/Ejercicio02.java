package CapituloJava10.Ejercicios;

import java.util.ArrayList;

public class Ejercicio02 {
  public static void main(String[] args) {
    ArrayList<Integer> n = new ArrayList<Integer>();
    int tamanoArray = (int)(Math.random()*11+10);

    for (int i = 0; i < tamanoArray; i++) {
      n.add((int)(Math.random()*101));
    }

    for (int numeros : n) {
      System.out.print(numeros+" ");
    }
  }
}
