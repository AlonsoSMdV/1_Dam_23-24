package CapituloJava10.Ejercicios.Ejercicio07;

import java.util.ArrayList;

public class Eurocoin {
  public static void main(String[] args) {
    ArrayList <Moneda> m = new ArrayList<Moneda>();
    Moneda monedaAux = new Moneda();
    String ultimaPos = monedaAux.getPosition();
    String ultimoValor = monedaAux.getQuantity();

    m.add(monedaAux);

    for (int i = 0; i < 5; i++) {
      do {
        monedaAux = new Moneda();
      } while (!((monedaAux.getPosition()).equals(ultimaPos)) && !((monedaAux.getQuantity()).equals(ultimoValor)));

      m.add(monedaAux);
      ultimaPos = monedaAux.getPosition();
      ultimoValor = monedaAux.getQuantity();
    }

    for (Moneda mo : m) {
      System.out.println(mo);
    }
  }
  
}
