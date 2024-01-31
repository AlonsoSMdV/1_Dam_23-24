package sieteymedia;

public interface JugadorInterface {

    /**
     * getFondos
     * Devuelve los fondos del Jugador
     * @return Fondos del jugador 
     */
    public double getFondos();

    /**
     * getNombre
     * Devuelve el nombre del judador
     * @return Nombre del jugador
     */
    public String getNombre();

    /**
     * Devuelve la mano del jugador
     * La mano es el conjunto de cartas actual del jugador
     * @return La Mano del jugador
     */
    public Mano getMano();
    
    /**
     * recibirCarta
     * Recibe una carta y la añade a la mano
     * @param carta La carta que recibe para incluir en la mano
     */
    public void recibirCarta(Carta carta);

    /**
     * incrementarFondos
     * Incrementa los fondos del jugador en la cantidad suministrada
     * @param cantidad Cantidad a sumar a los fondos actuales
     */
    public void incrementarFondos(double cantidad);

    /**
     * DecrementarFondos
     * Decrementa los fondos del jugador en la cantidad suministrada
     * @param cantidad Cantidad a restar a los fondos actuales
     */
    public void decrementarFondos(double cantidad);

    /**
     * Devuelve un string conteniendo información actual del jugador
     * Ejemplo:
     * Jugador: Juan
     * Fondos: 1200,00€
     * Cartas: Sota de Bastos, Dos de Oros, Siete de Oros,
     * @return Un string representado la información del jugador
     */
    String toString();
    
}
