package sieteymedia;

import java.util.ArrayList;

public class Mano implements ManoInterface{
  private ArrayList<Carta> cartas;
  private int numCartas;

  public Mano() {
      this.cartas = new ArrayList<Carta>();
      this.numCartas = 0;
  }

  public void anadeCarta(Carta carta) {
      cartas.add(carta);
  }

  public Carta[] getCartas() {
      Carta[] copiaCartas = new Carta[numCartas];
      for (int i = 0; i < numCartas; i++) {
        copiaCartas[i] = cartas.get(i);
      }
      return copiaCartas;
  }

  @Override
  public String toString() {
    int i = 0;
    String txt = "";
    do {
      txt += cartas.get(i) + ", ";
      i++;
    } while (cartas.get(i) != null);
    return txt;
  }
  
}
