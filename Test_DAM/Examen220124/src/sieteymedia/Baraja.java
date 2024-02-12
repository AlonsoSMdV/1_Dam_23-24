package sieteymedia;

import java.util.ArrayList;
import java.util.Collections;

public class Baraja implements BarajaInterface{
    private ArrayList<Carta> cartas;
    private int numCartas;

    public Baraja() {
        this.cartas = new ArrayList<Carta>();
        nuevaBaraja();
    }

    public void nuevaBaraja() {

        for (int i = 0; i < 40; i++) {
            cartas.add(new Carta(i)) ;
        }
        Collections.shuffle(cartas);

    }


public Carta extraerCarta() {
    if (cartas.size() > 0) {
        cartas.removeFirst();
    }

    return null;
}

    @Override
    public String toString() {
        if (numCartas == 0) {
            return "";
        }

        String txt = cartas.get(0).toString();
        for (int i = 1; i < numCartas; i++) {
            txt += ", " + cartas.get(i).toString();
        }

        return txt;
    }
}
