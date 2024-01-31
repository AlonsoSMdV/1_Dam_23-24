import sieteymedia.Baraja;
import sieteymedia.Carta;
import sieteymedia.Jugador;
import sieteymedia.Mano;
import sieteymedia.SieteYMedia;

public class App {
    private static SieteYMedia juego;

    private static void faseI(){
        Carta carta = new Carta(12);
        System.out.println(carta);
    }

    private static void faseII(){
        Baraja baraja = new Baraja();
        System.out.println(baraja);
    }

    private static void faseIII(){
        Baraja baraja = new Baraja();
        Mano mano = new Mano();
        mano.anadeCarta(baraja.extraerCarta());
        mano.anadeCarta(baraja.extraerCarta());
        mano.anadeCarta(baraja.extraerCarta());
        System.out.println(mano);
    }

    private static void faseIV(){
        Baraja baraja = new Baraja();
        Jugador jugador = new Jugador("Juan", 100);
        jugador.recibirCarta(baraja.extraerCarta());
        jugador.recibirCarta(baraja.extraerCarta());
        jugador.recibirCarta(baraja.extraerCarta());
        jugador.incrementarFondos(100);
        jugador.decrementarFondos(50);
        System.out.println(jugador);
    }

    private static void faseV(){
        juego = new SieteYMedia();
        juego.jugar("Juan", 1000);
    }

    public static void main(String[] args) throws Exception {
        System.out.println("1. Fase I");
        System.out.println("2. Fase II");
        System.out.println("3. Fase III");
        System.out.println("4. Fase IV");
        System.out.println("5. Fase V");
        System.out.print("Opción: ");
        try {
            int opcion = Integer.parseInt(System.console().readLine());
            switch(opcion){
                case 1:
                    faseI();
                    break;
                case 2:
                    faseII();
                    break;
                case 3:
                    faseIII();
                    break;
                case 4:
                    faseIV();
                    break;
                case 5:
                    faseV();
                    break;
                default:
                    System.out.println("Opción incorrecta");
            }
        } catch (Exception e) {
            System.out.println("Se ha producido un error");
        }
    }   
}
