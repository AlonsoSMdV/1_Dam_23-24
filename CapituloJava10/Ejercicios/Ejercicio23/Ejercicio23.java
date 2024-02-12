package CapituloJava10.Ejercicios.Ejercicio23;

import java.util.ArrayList;

public class Ejercicio23 {
  public static void main(String[] args) {
    ArrayList<Figura> figura = new ArrayList<>();

    figura.add(new Figura("Dama", 9, 1));
    figura.add(new Figura("Torre", 5, 2));
    figura.add(new Figura("Alfil", 3, 2));
    figura.add(new Figura("Caballo", 2, 2));
    figura.add(new Figura("Peón", 1, 8));

    System.out.println("Fichas capturadas por el jugador:");
    int capturasMaximas = (int)(Math.random()*16);
    int contadorCapturas = 0;
    int peonesTotales = 0;

    do {
      Figura figuraAux = figura.get((int)(Math.random() * figura.size()));
      if (figuraAux.esCapturable()) {
        figuraAux.captura();
        System.out.println(figuraAux);
        contadorCapturas++;
        peonesTotales += figuraAux.getValor();
      }
    } while (contadorCapturas < capturasMaximas);

    System.out.println("Puntos totales: " + peonesTotales);
  }
}
