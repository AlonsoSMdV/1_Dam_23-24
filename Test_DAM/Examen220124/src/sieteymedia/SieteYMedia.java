package sieteymedia;


public class SieteYMedia implements Juego{
    Jugador jugador;
    Jugador ordenador;
    Baraja mazo;


    public SieteYMedia(){
       
    }

    /**
     * menuPrincipal
     * Imprime el menú principal
     * @param fondos Fondos del jugador
     */
    private void menuPrincipal(double fondos){
        System.out.println("***************************");
        System.out.printf("Tienes %.2f €%n", fondos);
        System.out.println("¿Qué quieres hacer?");
        System.out.println("1. Quiero jugar");
        System.out.println("2. Quiero salir");
        System.out.println("***************************");
        System.out.print("Opción: ");
        
    }

    /**
     * menuJugador
     * Imprime el menú del jugador
     */
    private void menuJugador(){
        System.out.println("***************************");
        System.out.println("¿Qué quieres hacer?");
        System.out.println("1. Quiero otra carta");
        System.out.println("2. Me planto");
        System.out.println("***************************");
        System.out.print("Opción: ");
    }

    /**
     * leerInteger
     * Lee un entero y evita que se produzcan excepciones al leer
     * @return Valor leído
     */
    private int leerInteger(){
        boolean error = true;
        int opcion = 0;
        while(error){
            try {
                opcion = Integer.parseInt(System.console().readLine());    
                error = false;
            } catch (Exception e) {
                error = true;
            }
        }
        return opcion;
    }

    /**
     * leerDouble
     * Lee un double y evita que se produzcan excepciones al leer
     * @return Valor leído
     */
    private double leerDouble(){
        boolean error = true;
        double opcion = 0;
        while(error){
            try {
                opcion = Double.parseDouble(System.console().readLine());    
                error = false;
            } catch (Exception e) {
                error = true;
            }
        }
        return opcion;
    }

    /**
     * turnoJugador
     * Proceso de juego del jugador
     * @return La cantidad que apuesta el jugador
     */
    private double turnoJugador(){
        int opcion = 1;
        System.out.println("¿Cuánto dinero quieres apostar?");
        double apuesta = leerDouble();
        if(apuesta > jugador.getFondos() || apuesta <= 0){
            do{
                System.out.println("Tiene que introducir un valor mayor que 0 y menor o igual que los fondos actuales");
                System.out.println("¿Cuánto dinero quieres apostar?");
                apuesta = leerDouble();
            }while((apuesta > jugador.getFondos()) || apuesta <= 0);
        }

        boolean finJugada=false;
        do {
            if(opcion==1)
                jugador.recibirCarta(mazo.extraerCarta());
            System.out.println("Estas son tus cartas");
            System.out.println(jugador);
            finJugada = puntuacion(jugador.getMano())>=7.5;
            if(!finJugada){
                menuJugador();
                opcion = leerInteger();
                switch(opcion){
                    case 1:
                        break;
                    case 2:
                        finJugada = true;
                        break;
                    default:
                        System.out.println("Opción incorrecta");
                }
            }
        } while (!finJugada);
        return apuesta;
    }

    /**
     * turnoOrdenador
     * Turno de juego del ordenador
     * No devuelve nada
     */
    private void turnoOrdenador(){
        while(puntuacion(jugador.getMano())>=puntuacion(ordenador.getMano()))
            ordenador.recibirCarta(mazo.extraerCarta());    
    }

    /**
     * puntuacion
     * Devuelve la puntuación de una mano
     * @param mano Mano conteniendo las cartas
     * @return Valor double con la puntuación de la mano suministrada
     */
    private static double puntuacion(Mano mano){
        double ret = 0.0;
        for(Carta carta:mano.getCartas())
            ret +=(carta.getCodigo()%10+1)<=7?(double)(carta.getCodigo()%10+1):0.5;
        return ret;
    }

    /**
     * esSieteYMedia
     * Devuelve si una mano tiene una puntuación de siete y media
     * @param mano Mano conteniendo las cartas
     * @return true si es siete y media false en caso contrario
     */
    private static boolean esSieteYMedia(Mano mano){
        return puntuacion(mano)==7.5;
    }

    @Override
    public void jugar(String nombreJugador, double fondos){
        mazo = new Baraja();
        jugador = new Jugador(nombreJugador, fondos);
        ordenador = new Jugador("Ordenador", 0);
        System.out.println("*******************************");
        System.out.println("******** Siete y Media ********");
        System.out.println("*******************************");
        System.out.printf("Bienvenido %s%n", nombreJugador);
        System.out.printf("Puedes jugar hasta que te quedes sin fondos o desees salir%n");
        boolean salir = false;
        double puntosPlayer = 0;
        double puntosCpu = 0;
        while(!salir && jugador.getFondos()>0){
            mazo.nuevaBaraja();
            jugador = new Jugador(nombreJugador, jugador.getFondos());
            ordenador = new Jugador("Ordenador", 0);
            menuPrincipal(jugador.getFondos());
            int opcion = leerInteger();
            switch(opcion){
                case 1:
                    do {
                        double apuesta = turnoJugador();
                        puntosPlayer = puntuacion(jugador.getMano());
                        jugador.decrementarFondos(apuesta);
                        turnoOrdenador();
                        
                        puntosCpu = puntuacion(ordenador.getMano());

                        if(puntosPlayer > 7.5 || puntosCpu > 7.5 && (puntosCpu < puntosPlayer) || puntosCpu < 7.5 && (puntosCpu > puntosPlayer)){
                            System.out.println("Lo siento, :( has perdido");
                            System.out.println("Estas son las cartas del ordenador");
                            System.out.println(ordenador);
                            System.out.println("Pulse INTRO para continuar");
                            System.console().readLine();
                            break;
                        }else if (esSieteYMedia(jugador.getMano()) ||  puntosCpu > puntosPlayer) {
                            System.out.println("Enhorabuena!!!! has ganado");
                            jugador.incrementarFondos(apuesta*2);
                            System.out.println("Estas son las cartas del ordenador");
                            System.out.println(ordenador);
                            System.out.println("Pulse INTRO para continuar");
                            System.console().readLine();
                            break;
                        }
                        
                    } while (!salir);

                    break;
                case 2:
                    salir = true;
                    
                    break;
                default:
                    System.out.println("opción incorrecta");    
            }
        }
        
    }

    
}
