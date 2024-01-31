package sieteymedia;

public interface ManoInterface {

    /**
     * anadeCarta
     * Añade una carta a la mano
     * @param carta Carta a añadir a la mano
     */
    public void anadeCarta(Carta carta);

    /**
     * getCartas
     * Devuelve un array conteniendo las cartas de la mano
     * Debe devolver una copia del array que representa la mano
     * @return Array de Cartas de la mano
     */
    public Carta[] getCartas();

    /**
     * toString
     * Devuelve un string que representa a la mano
     * Ejemplo:
     * Dos de Copas
     * Rey de Oros
     * Cuatro de Espadas
     * @return String conteniendo la representación de la mano
     */
    public String toString();
}
