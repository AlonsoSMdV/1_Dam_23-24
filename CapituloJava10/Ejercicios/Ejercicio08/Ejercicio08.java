package CapituloJava10.Ejercicios.Ejercicio08;

import java.util.ArrayList;

public class Ejercicio08 {
  public static void main(String[] args) {
    ArrayList<Carta> c = new ArrayList<Carta>();
    Carta cartaAux;

    for (int i = 0; i < 10; i++) {
      do {
        cartaAux = new Carta();
      } while (c.contains(cartaAux));

      c.add(cartaAux);
    }

    for (Carta ca : c) {
      System.out.println(ca);
    }
  }
}
