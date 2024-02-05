package CapituloJava10.Ejercicios.Ejercicio12;

import java.util.ArrayList;
import java.util.HashMap;

public class Ejercicio12 {
  public static void main(String[] args) {
    ArrayList<Carta> c = new ArrayList<Carta>();
    HashMap<String, Integer> n = new HashMap<String, Integer>();
    int puntuacion = 0;
    n.put("as", 11);
    n.put("dos", 0);
    n.put("tres", 10);
    n.put("cuatro", 0);
    n.put("cinco", 0);
    n.put("seis", 0);
    n.put("siete", 0);
    n.put("sota", 2);
    n.put("caballo", 3);
    n.put("rey", 4);

    Carta cartaAux;

    for (int i = 0; i < 10; i++) {
      do {
        cartaAux = new Carta();
      } while (c.contains(cartaAux));

      c.add(cartaAux);
    }

    for (Carta ca : c) {
      System.out.println(ca);
      puntuacion += n.get(ca.getFigura());
    }

    
    System.out.println("Tienes " + puntuacion + " puntos.");
  }
}
