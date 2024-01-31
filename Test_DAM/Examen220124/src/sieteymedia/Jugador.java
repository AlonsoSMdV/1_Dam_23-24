package sieteymedia;

public class Jugador implements JugadorInterface{
    private String nombre;
    private double fondos;
    private Mano mano;

    public Jugador(String nombre, double fondos) {
        this.nombre = nombre;
        this.fondos = fondos;
        this.mano = new Mano();
    }

    public double getFondos() {
        return fondos;
    }

    public String getNombre() {
        return nombre;
    }

    public Mano getMano() {
        return mano;
    }

    public void recibirCarta(Carta carta) {
        mano.anadeCarta(carta);
    }

    public void incrementarFondos(double cantidad) {
        fondos += cantidad;
    }

    public void decrementarFondos(double cantidad) {
        fondos -= cantidad;
    }

    @Override
    public String toString() {
        String txt = "Jugador: " + nombre + "\n";
        txt += "Fondos: " + String.format("%.2f", fondos) + "€\n";
        txt += "Cartas: " + mano.toString();
        return txt;
    }
}
