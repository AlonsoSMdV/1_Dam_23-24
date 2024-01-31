package sieteymedia;

public interface CartaInterface {
    
    /**
     * getPalo
     * Devuelve el palo asignado a la carta
     * El palo puede ser:
     * Oros, Copas, Espadas, Bastos
     * Hará uso de la clase Baraja para obtener el palo a través del código
     * @return Palo asignado a la carta
     */
    public String getPalo();

    /**
     * getNumero
     * Devuelve el número asignado a la carta del palo correspondiente
     * El número puede ser:
     * Uno, Dos, Tres, Cuatro, Cinco, Seis, Siete, Sota, Caballo, Rey
     * Hará uso de la clase Baraja para obtener el número a través del código
     * @return Número asignado a la carta
     */
    public String getNumero();

    /**
     * getCodigo
     * Devuelve el código asignado a la carta
     * El código es un número entero comprendido entre 0 y 39
     * El palo Oros tiene asignado números entre 0 y 9
     * El palo Copas tiene asignado números entre 10 y 19
     * El palo Espadas tiene asignado números entre 20 y 29
     * El palo Bastos tiene asignado números entre 30 y 39
     * Por ejemplo:
     * El código 13 representa al Cuatro de Copas
     * El código 9 representa al Rey de Oros
     * @return Código asignado a la carta
     */
    public int getCodigo();

    /**
     * Devuelve una representación en String de la carta
     * Ejemplo:
     * Dos de Oros
     * @return Un String representado la carta
     */
    public String toString();

}
