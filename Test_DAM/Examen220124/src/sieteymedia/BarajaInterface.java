package sieteymedia;

public interface BarajaInterface {
    
    public static String[] palos = {"Oros", "Copas", "Espadas", "Bastos"};
    public static String[] numeros = {"Uno", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete", "Sota", "Caballo", "Rey"};;
    /**
     * getPalo
     * Devuelve el palo correspondiente al código de la carta suministrado
     * @param codigo Código de la carta (valor de 0 a 39)
     * @return El palo correspondiente (Oros, Copas, Espadas o Bastos)
     */
    public static String getPalo(int codigo){
        return palos[(int)(codigo/10)];
    }

    /**
     * getNumero
     * Devuelve el número correspondiente al código de la carta suministrado
     * @param codigo Código de la carta (valor de 0 a 39)
     * @return El palo correspondiente (Uno, Dos, ..., Siete, Sota, Caballo ó Rey)
     */
    public static String getNumero(int codigo){
        return numeros[(int)(codigo%10)];
    }

    /**
     * nuevaBaraja
     * Inicializa una baraja española de 40 cartas de forma aleatoria
     */
    public void nuevaBaraja();


    /**
     * extraCarta
     * Extrae y devuelve una carta de la baraja
     * @return carta extraida de la baraja
     */
    public Carta extraerCarta();

    /**
     * toString
     * Devuelve un String conteniendo una representación de la baraja actual
     * Ejemplo:
     * Sota de Espadas, Uno de Oros, ...
     * @return String contentiendo una representación de la baraja actual
     */
    @Override
    String toString();
}
